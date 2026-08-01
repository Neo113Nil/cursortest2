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
import androidx.recyclerview.widget.RecyclerView;
import e0.C0115b;
import e0.C0138z;
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
import l.C0292v;
import l.U;
import s.C0327d;
import s.C0328e;
import t.C0331b;
import v.C0352f;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f809e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f810a;

    /* renamed from: b, reason: collision with root package name */
    public Object f811b;

    /* renamed from: c, reason: collision with root package name */
    public Object f812c;

    /* renamed from: d, reason: collision with root package name */
    public Object f813d;

    public /* synthetic */ r() {
        this.f810a = 5;
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
        RecyclerView recyclerView = ((C0138z) this.f811b).f2374a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0115b) this.f812c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0138z) this.f811b).f2374a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0115b) this.f812c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2179j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        X I2;
        int k2 = k(i);
        ((C0115b) this.f812c).g(k2);
        RecyclerView recyclerView = ((C0138z) this.f811b).f2374a;
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
        return ((C0138z) this.f811b).f2374a.getChildAt(k(i));
    }

    public int f() {
        return ((C0138z) this.f811b).f2374a.getChildCount() - ((ArrayList) this.f813d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList w2;
        TypedArray typedArray = (TypedArray) this.f812c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (w2 = q1.d.w((Context) this.f811b, resourceId)) == null) ? typedArray.getColorStateList(i) : w2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f812c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : q1.d.z((Context) this.f811b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f812c).hasValue(i) || (resourceId = ((TypedArray) this.f812c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0292v a2 = C0292v.a();
        Context context = (Context) this.f811b;
        synchronized (a2) {
            d2 = a2.f3470a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface j(int i, int i2, U u2) {
        int resourceId = ((TypedArray) this.f812c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f813d) == null) {
            this.f813d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f813d;
        ThreadLocal threadLocal = B.r.f49a;
        Context context = (Context) this.f811b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, u2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0138z) this.f811b).f2374a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0115b c0115b = (C0115b) this.f812c;
            int b2 = i - (i2 - c0115b.b(i2));
            if (b2 == 0) {
                while (c0115b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0138z) this.f811b).f2374a.getChildAt(i);
    }

    public int m() {
        return ((C0138z) this.f811b).f2374a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P n(X0.b bVar, String str) {
        boolean isInstance;
        P a2;
        X0.f.e(str, "key");
        androidx.lifecycle.U u2 = (androidx.lifecycle.U) this.f811b;
        u2.getClass();
        LinkedHashMap linkedHashMap = u2.f1476a;
        P p2 = (P) linkedHashMap.get(str);
        Class cls = bVar.f871a;
        Map map = X0.b.f869b;
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
        S s2 = (S) this.f812c;
        if (isInstance) {
            if (s2 instanceof N) {
                N n2 = (N) s2;
                X0.f.b(p2);
                AbstractC0082o abstractC0082o = n2.f1467d;
                if (abstractC0082o != null) {
                    g0.d dVar = n2.f1468e;
                    X0.f.b(dVar);
                    J.a(p2, dVar, abstractC0082o);
                }
            }
            X0.f.c(p2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return p2;
        }
        Z.c cVar = new Z.c((Z.b) this.f813d);
        cVar.f883a.put(a0.b.f953a, str);
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
        if ((yVar.f835c & 3) == 0) {
            d dVar = (d) this.f813d;
            U.a c2 = yVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.f410d).getShort(a2 + c2.f407a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = d.f779b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f780a;
            String sb2 = sb.toString();
            int i3 = C.f.f161a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = yVar.f835c & 4;
            yVar.f835c = a3 ? i4 | 2 : i4 | 1;
        }
        return (yVar.f835c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.f813d).add(view);
        C0138z c0138z = (C0138z) this.f811b;
        X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2186q;
            View view2 = I2.f2172a;
            if (i != -1) {
                I2.f2185p = i;
            } else {
                WeakHashMap weakHashMap = K.X.f419a;
                I2.f2185p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0138z.f2374a;
            if (recyclerView.L()) {
                I2.f2186q = 4;
                recyclerView.f1593p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = K.X.f419a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0327d c0327d, C0352f c0352f) {
        int[] iArr = c0327d.f4061p0;
        int i2 = iArr[0];
        C0331b c0331b = (C0331b) this.f812c;
        c0331b.f4155a = i2;
        c0331b.f4156b = iArr[1];
        c0331b.f4157c = c0327d.q();
        c0331b.f4158d = c0327d.k();
        c0331b.i = false;
        c0331b.f4162j = i;
        boolean z2 = c0331b.f4155a == 3;
        boolean z3 = c0331b.f4156b == 3;
        boolean z4 = z2 && c0327d.f4030W > 0.0f;
        boolean z5 = z3 && c0327d.f4030W > 0.0f;
        int[] iArr2 = c0327d.f4065t;
        if (z4 && iArr2[0] == 4) {
            c0331b.f4155a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0331b.f4156b = 1;
        }
        c0352f.b(c0327d, c0331b);
        c0327d.O(c0331b.f4159e);
        c0327d.L(c0331b.f4160f);
        c0327d.f4013E = c0331b.h;
        c0327d.I(c0331b.f4161g);
        c0331b.f4162j = 0;
        return c0331b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, p pVar) {
        int i4;
        char c2;
        q qVar = new q((u) ((v) this.f812c).f826c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f805c.f822a;
                u uVar = sparseArray == null ? null : (u) sparseArray.get(codePointAt);
                if (qVar.f803a == 2) {
                    if (uVar != null) {
                        qVar.f805c = uVar;
                        qVar.f808f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            u uVar2 = qVar.f805c;
                            if (uVar2.f823b != null) {
                                if (qVar.f808f != 1) {
                                    qVar.f806d = uVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.f806d = qVar.f805c;
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
                    qVar.f803a = 2;
                    qVar.f805c = uVar;
                    qVar.f808f = 1;
                    c2 = 2;
                }
                qVar.f807e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, qVar.f806d.f823b)) {
                        z3 = pVar.q(charSequence, i4, i6, qVar.f806d.f823b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f803a == 2 && qVar.f805c.f823b != null && ((qVar.f808f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f805c.f823b)))) {
            pVar.q(charSequence, i4, i6, qVar.f805c.f823b);
        }
        return pVar.h();
    }

    public void t() {
        ((TypedArray) this.f812c).recycle();
    }

    public String toString() {
        switch (this.f810a) {
            case 2:
                return ((C0115b) this.f812c).toString() + ", hidden list:" + ((ArrayList) this.f813d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0328e c0328e, int i, int i2, int i3) {
        int i4 = c0328e.f4037b0;
        int i5 = c0328e.f4039c0;
        c0328e.f4037b0 = 0;
        c0328e.f4039c0 = 0;
        c0328e.O(i2);
        c0328e.L(i3);
        if (i4 < 0) {
            c0328e.f4037b0 = 0;
        } else {
            c0328e.f4037b0 = i4;
        }
        if (i5 < 0) {
            c0328e.f4039c0 = 0;
        } else {
            c0328e.f4039c0 = i5;
        }
        C0328e c0328e2 = (C0328e) this.f813d;
        c0328e2.f4086t0 = i;
        c0328e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.f813d).remove(view)) {
            C0138z c0138z = (C0138z) this.f811b;
            X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2185p;
                RecyclerView recyclerView = c0138z.f2374a;
                if (recyclerView.L()) {
                    I2.f2186q = i;
                    recyclerView.f1593p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = K.X.f419a;
                    I2.f2172a.setImportantForAccessibility(i);
                }
                I2.f2185p = 0;
            }
        }
    }

    public void w(C0328e c0328e) {
        ArrayList arrayList = (ArrayList) this.f811b;
        arrayList.clear();
        int size = c0328e.f4083q0.size();
        for (int i = 0; i < size; i++) {
            C0327d c0327d = (C0327d) c0328e.f4083q0.get(i);
            int[] iArr = c0327d.f4061p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0327d);
            }
        }
        c0328e.f4085s0.f4166b = true;
    }

    public r(Method method, Method method2, Method method3) {
        this.f810a = 6;
        this.f811b = method;
        this.f812c = method2;
        this.f813d = method3;
    }

    public r(androidx.lifecycle.U u2, S s2, Z.b bVar) {
        this.f810a = 1;
        X0.f.e(u2, "store");
        X0.f.e(bVar, "extras");
        this.f811b = u2;
        this.f812c = s2;
        this.f813d = bVar;
    }

    public r(C0138z c0138z) {
        this.f810a = 2;
        this.f811b = c0138z;
        this.f812c = new C0115b();
        this.f813d = new ArrayList();
    }

    public r(Context context, TypedArray typedArray) {
        this.f810a = 4;
        this.f811b = context;
        this.f812c = typedArray;
    }

    public r(Context context, LocationManager locationManager) {
        this.f810a = 3;
        this.f813d = new L();
        this.f811b = context;
        this.f812c = locationManager;
    }

    public r(C0328e c0328e) {
        this.f810a = 7;
        this.f811b = new ArrayList();
        this.f812c = new C0331b();
        this.f813d = c0328e;
    }

    public r(v vVar, H0.e eVar, d dVar, Set set) {
        this.f810a = 0;
        this.f811b = eVar;
        this.f812c = vVar;
        this.f813d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new B0.d(12, str));
        }
    }
}
