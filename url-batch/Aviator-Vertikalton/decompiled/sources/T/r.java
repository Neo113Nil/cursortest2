package T;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import e0.C0114b;
import e0.C0137z;
import e0.X;
import g.L;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import l.C0292w;
import l.V;
import s.C0325d;
import s.C0326e;
import t.C0329b;
import v.C0350f;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f808e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f809a;

    /* renamed from: b, reason: collision with root package name */
    public Object f810b;

    /* renamed from: c, reason: collision with root package name */
    public Object f811c;

    /* renamed from: d, reason: collision with root package name */
    public Object f812d;

    public /* synthetic */ r() {
        this.f809a = 5;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        z[] zVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (zVarArr = (z[]) editable.getSpans(selectionStart, selectionEnd, z.class)) != null && zVarArr.length > 0) {
            for (z zVar : zVarArr) {
                int spanStart = editable.getSpanStart(zVar);
                int spanEnd = editable.getSpanEnd(zVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static r r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new r(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0137z) this.f810b).f2370a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0114b) this.f811c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0137z) this.f810b).f2370a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0114b) this.f811c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2175j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        X I2;
        int k2 = k(i);
        ((C0114b) this.f811c).g(k2);
        RecyclerView recyclerView = ((C0137z) this.f810b).f2370a;
        View childAt = recyclerView.getChildAt(k2);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.k() && !I2.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.a(256);
        }
        recyclerView.detachViewFromParent(k2);
    }

    public View e(int i) {
        return ((C0137z) this.f810b).f2370a.getChildAt(k(i));
    }

    public int f() {
        return ((C0137z) this.f810b).f2370a.getChildCount() - ((ArrayList) this.f812d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList w2;
        TypedArray typedArray = (TypedArray) this.f811c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (w2 = q1.d.w((Context) this.f810b, resourceId)) == null) ? typedArray.getColorStateList(i) : w2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f811c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : q1.d.z((Context) this.f810b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f811c).hasValue(i) || (resourceId = ((TypedArray) this.f811c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0292w a2 = C0292w.a();
        Context context = (Context) this.f810b;
        synchronized (a2) {
            d2 = a2.f3471a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface j(int i, int i2, V v2) {
        int resourceId = ((TypedArray) this.f811c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f812d) == null) {
            this.f812d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f812d;
        ThreadLocal threadLocal = B.r.f49a;
        Context context = (Context) this.f810b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, v2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0137z) this.f810b).f2370a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0114b c0114b = (C0114b) this.f811c;
            int b2 = i - (i2 - c0114b.b(i2));
            if (b2 == 0) {
                while (c0114b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0137z) this.f810b).f2370a.getChildAt(i);
    }

    public int m() {
        return ((C0137z) this.f810b).f2370a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P n(X0.b bVar, String str) {
        boolean isInstance;
        P a2;
        X0.f.e(str, "key");
        U u2 = (U) this.f810b;
        u2.getClass();
        LinkedHashMap linkedHashMap = u2.f1475a;
        P p2 = (P) linkedHashMap.get(str);
        Class cls = bVar.f870a;
        Map map = X0.b.f868b;
        X0.f.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (p2 instanceof N0.a) {
                if ((p2 instanceof X0.d ? ((X0.d) p2).b() : p2 instanceof W0.a ? 0 : p2 instanceof W0.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = q1.d.D(X0.j.a(cls));
            }
            isInstance = cls2.isInstance(p2);
        }
        S s2 = (S) this.f811c;
        if (isInstance) {
            if (s2 instanceof N) {
                N n2 = (N) s2;
                X0.f.b(p2);
                AbstractC0082o abstractC0082o = n2.f1466d;
                if (abstractC0082o != null) {
                    g0.d dVar = n2.f1467e;
                    X0.f.b(dVar);
                    J.a(p2, dVar, abstractC0082o);
                }
            }
            X0.f.c(p2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return p2;
        }
        Z.c cVar = new Z.c((Z.b) this.f812d);
        cVar.f882a.put(a0.b.f952a, str);
        try {
            try {
                a2 = s2.b(bVar, cVar);
            } catch (AbstractMethodError unused) {
                a2 = s2.a(q1.d.C(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = s2.c(q1.d.C(bVar), cVar);
        }
        X0.f.e(a2, "viewModel");
        P p3 = (P) linkedHashMap.put(str, a2);
        if (p3 != null) {
            p3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.f834c & 3) == 0) {
            d dVar = (d) this.f812d;
            U.a c2 = yVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.f409d).getShort(a2 + c2.f406a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = d.f778b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f779a;
            String sb2 = sb.toString();
            int i3 = C.f.f162a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = yVar.f834c & 4;
            yVar.f834c = a3 ? i4 | 2 : i4 | 1;
        }
        return (yVar.f834c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.f812d).add(view);
        C0137z c0137z = (C0137z) this.f810b;
        X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2182q;
            View view2 = I2.f2168a;
            if (i != -1) {
                I2.f2181p = i;
            } else {
                WeakHashMap weakHashMap = K.X.f418a;
                I2.f2181p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0137z.f2370a;
            if (recyclerView.L()) {
                I2.f2182q = 4;
                recyclerView.f1592p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = K.X.f418a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0325d c0325d, C0350f c0350f) {
        int[] iArr = c0325d.f4057p0;
        int i2 = iArr[0];
        C0329b c0329b = (C0329b) this.f811c;
        c0329b.f4151a = i2;
        c0329b.f4152b = iArr[1];
        c0329b.f4153c = c0325d.q();
        c0329b.f4154d = c0325d.k();
        c0329b.i = false;
        c0329b.f4158j = i;
        boolean z2 = c0329b.f4151a == 3;
        boolean z3 = c0329b.f4152b == 3;
        boolean z4 = z2 && c0325d.f4026W > 0.0f;
        boolean z5 = z3 && c0325d.f4026W > 0.0f;
        int[] iArr2 = c0325d.f4061t;
        if (z4 && iArr2[0] == 4) {
            c0329b.f4151a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0329b.f4152b = 1;
        }
        c0350f.b(c0325d, c0329b);
        c0325d.O(c0329b.f4155e);
        c0325d.L(c0329b.f4156f);
        c0325d.f4009E = c0329b.h;
        c0325d.I(c0329b.f4157g);
        c0329b.f4158j = 0;
        return c0329b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, p pVar) {
        int i4;
        char c2;
        q qVar = new q((u) ((v) this.f811c).f825c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f804c.f821a;
                u uVar = sparseArray == null ? null : (u) sparseArray.get(codePointAt);
                if (qVar.f802a == 2) {
                    if (uVar != null) {
                        qVar.f804c = uVar;
                        qVar.f807f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            u uVar2 = qVar.f804c;
                            if (uVar2.f822b != null) {
                                if (qVar.f807f != 1) {
                                    qVar.f805d = uVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.f805d = qVar.f804c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c2 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (uVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f802a = 2;
                    qVar.f804c = uVar;
                    qVar.f807f = 1;
                    c2 = 2;
                }
                qVar.f806e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !o(charSequence, i4, i6, qVar.f805d.f822b)) {
                        z3 = pVar.n(charSequence, i4, i6, qVar.f805d.f822b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f802a == 2 && qVar.f804c.f822b != null && ((qVar.f807f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f804c.f822b)))) {
            pVar.n(charSequence, i4, i6, qVar.f804c.f822b);
        }
        return pVar.g();
    }

    public void t() {
        ((TypedArray) this.f811c).recycle();
    }

    public String toString() {
        switch (this.f809a) {
            case 2:
                return ((C0114b) this.f811c).toString() + ", hidden list:" + ((ArrayList) this.f812d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0326e c0326e, int i, int i2, int i3) {
        int i4 = c0326e.f4033b0;
        int i5 = c0326e.f4035c0;
        c0326e.f4033b0 = 0;
        c0326e.f4035c0 = 0;
        c0326e.O(i2);
        c0326e.L(i3);
        if (i4 < 0) {
            c0326e.f4033b0 = 0;
        } else {
            c0326e.f4033b0 = i4;
        }
        if (i5 < 0) {
            c0326e.f4035c0 = 0;
        } else {
            c0326e.f4035c0 = i5;
        }
        C0326e c0326e2 = (C0326e) this.f812d;
        c0326e2.f4082t0 = i;
        c0326e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.f812d).remove(view)) {
            C0137z c0137z = (C0137z) this.f810b;
            X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2181p;
                RecyclerView recyclerView = c0137z.f2370a;
                if (recyclerView.L()) {
                    I2.f2182q = i;
                    recyclerView.f1592p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = K.X.f418a;
                    I2.f2168a.setImportantForAccessibility(i);
                }
                I2.f2181p = 0;
            }
        }
    }

    public void w(C0326e c0326e) {
        ArrayList arrayList = (ArrayList) this.f810b;
        arrayList.clear();
        int size = c0326e.f4079q0.size();
        for (int i = 0; i < size; i++) {
            C0325d c0325d = (C0325d) c0326e.f4079q0.get(i);
            int[] iArr = c0325d.f4057p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0325d);
            }
        }
        c0326e.f4081s0.f4162b = true;
    }

    public r(Method method, Method method2, Method method3) {
        this.f809a = 6;
        this.f810b = method;
        this.f811c = method2;
        this.f812d = method3;
    }

    public r(U u2, S s2, Z.b bVar) {
        this.f809a = 1;
        X0.f.e(u2, "store");
        X0.f.e(bVar, "extras");
        this.f810b = u2;
        this.f811c = s2;
        this.f812d = bVar;
    }

    public r(C0137z c0137z) {
        this.f809a = 2;
        this.f810b = c0137z;
        this.f811c = new C0114b();
        this.f812d = new ArrayList();
    }

    public r(Context context, TypedArray typedArray) {
        this.f809a = 4;
        this.f810b = context;
        this.f811c = typedArray;
    }

    public r(Context context, LocationManager locationManager) {
        this.f809a = 3;
        this.f812d = new L();
        this.f810b = context;
        this.f811c = locationManager;
    }

    public r(C0326e c0326e) {
        this.f809a = 7;
        this.f810b = new ArrayList();
        this.f811c = new C0329b();
        this.f812d = c0326e;
    }

    public r(v vVar, H0.e eVar, d dVar, Set set) {
        this.f809a = 0;
        this.f810b = eVar;
        this.f811c = vVar;
        this.f812d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new B0.d(13, str));
        }
    }
}
