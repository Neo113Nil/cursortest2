package K;

import a0.AbstractC0057b;
import a0.C0058c;
import a1.InterfaceC0059a;
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
import androidx.recyclerview.widget.RecyclerView;
import f0.C0093b;
import f0.C0116z;
import g.C0124H;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0246u;
import s.C0296d;
import s.C0297e;
import t.C0300b;
import v.C0324f;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: e, reason: collision with root package name */
    public static C0011l f420e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    /* renamed from: b, reason: collision with root package name */
    public Object f422b;

    /* renamed from: c, reason: collision with root package name */
    public Object f423c;
    public Object d;

    public /* synthetic */ C0011l() {
        this.f421a = 6;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        T.y[] yVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (yVarArr = (T.y[]) editable.getSpans(selectionStart, selectionEnd, T.y.class)) != null && yVarArr.length > 0) {
            for (T.y yVar : yVarArr) {
                int spanStart = editable.getSpanStart(yVar);
                int spanEnd = editable.getSpanEnd(yVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0011l r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0011l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0116z) this.f422b).f2253a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0093b) this.f423c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0116z) this.f422b).f2253a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0093b) this.f423c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2082j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.X I2;
        int k2 = k(i);
        ((C0093b) this.f423c).g(k2);
        RecyclerView recyclerView = ((C0116z) this.f422b).f2253a;
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
        return ((C0116z) this.f422b).f2253a.getChildAt(k(i));
    }

    public int f() {
        return ((C0116z) this.f422b).f2253a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList B2;
        TypedArray typedArray = (TypedArray) this.f423c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (B2 = u1.d.B((Context) this.f422b, resourceId)) == null) ? typedArray.getColorStateList(i) : B2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f423c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : u1.d.G((Context) this.f422b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f423c).hasValue(i) || (resourceId = ((TypedArray) this.f423c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0246u a2 = C0246u.a();
        Context context = (Context) this.f422b;
        synchronized (a2) {
            d = a2.f3006a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, l.T t2) {
        int resourceId = ((TypedArray) this.f423c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f40a;
        Context context = (Context) this.f422b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0116z) this.f422b).f2253a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0093b c0093b = (C0093b) this.f423c;
            int b2 = i - (i2 - c0093b.b(i2));
            if (b2 == 0) {
                while (c0093b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0116z) this.f422b).f2253a.getChildAt(i);
    }

    public int m() {
        return ((C0116z) this.f422b).f2253a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M n(b1.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        b1.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f422b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1408a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f1567a;
        Map map = b1.b.f1565b;
        b1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof S0.a) {
                if ((m2 instanceof b1.c ? ((b1.c) m2).b() : m2 instanceof InterfaceC0059a ? 0 : m2 instanceof a1.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = u1.l.y(b1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f423c;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                b1.d.b(m2);
            }
            b1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0058c c0058c = new C0058c((AbstractC0057b) this.d);
        c0058c.f1165a.put(b0.b.f1564a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(u1.l.x(bVar), c0058c);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(u1.l.x(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(u1.l.x(bVar), c0058c);
        }
        b1.d.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.x xVar) {
        if ((xVar.f810c & 3) == 0) {
            T.d dVar = (T.d) this.d;
            U.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f359a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T.d.f764b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f765a;
            String sb2 = sb.toString();
            int i3 = C.e.f61a;
            boolean a3 = C.d.a(textPaint, sb2);
            int i4 = xVar.f810c & 4;
            xVar.f810c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f810c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0116z c0116z = (C0116z) this.f422b;
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2089q;
            View view2 = I2.f2076a;
            if (i != -1) {
                I2.f2088p = i;
            } else {
                WeakHashMap weakHashMap = S.f369a;
                I2.f2088p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0116z.f2253a;
            if (recyclerView.L()) {
                I2.f2089q = 4;
                recyclerView.f1521p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f369a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0296d c0296d, C0324f c0324f) {
        int[] iArr = c0296d.f3601p0;
        int i2 = iArr[0];
        C0300b c0300b = (C0300b) this.f423c;
        c0300b.f3702a = i2;
        c0300b.f3703b = iArr[1];
        c0300b.f3704c = c0296d.q();
        c0300b.d = c0296d.k();
        c0300b.i = false;
        c0300b.f3708j = i;
        boolean z2 = c0300b.f3702a == 3;
        boolean z3 = c0300b.f3703b == 3;
        boolean z4 = z2 && c0296d.f3570W > 0.0f;
        boolean z5 = z3 && c0296d.f3570W > 0.0f;
        int[] iArr2 = c0296d.f3605t;
        if (z4 && iArr2[0] == 4) {
            c0300b.f3702a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0300b.f3703b = 1;
        }
        c0324f.b(c0296d, c0300b);
        c0296d.O(c0300b.f3705e);
        c0296d.L(c0300b.f3706f);
        c0296d.f3553E = c0300b.h;
        c0296d.I(c0300b.f3707g);
        c0300b.f3708j = 0;
        return c0300b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.p pVar) {
        int i4;
        char c2;
        T.q qVar = new T.q((T.t) ((T.u) this.f423c).f803c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f790c.f799a;
                T.t tVar = sparseArray == null ? null : (T.t) sparseArray.get(codePointAt);
                if (qVar.f788a == 2) {
                    if (tVar != null) {
                        qVar.f790c = tVar;
                        qVar.f792f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            T.t tVar2 = qVar.f790c;
                            if (tVar2.f800b != null) {
                                if (qVar.f792f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f790c;
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
                } else if (tVar == null) {
                    qVar.a();
                    c2 = 1;
                } else {
                    qVar.f788a = 2;
                    qVar.f790c = tVar;
                    qVar.f792f = 1;
                    c2 = 2;
                }
                qVar.f791e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, qVar.d.f800b)) {
                        z3 = pVar.p(charSequence, i4, i6, qVar.d.f800b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f788a == 2 && qVar.f790c.f800b != null && ((qVar.f792f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f790c.f800b)))) {
            pVar.p(charSequence, i4, i6, qVar.f790c.f800b);
        }
        return pVar.h();
    }

    public void t() {
        ((TypedArray) this.f423c).recycle();
    }

    public String toString() {
        switch (this.f421a) {
            case 3:
                return ((C0093b) this.f423c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0297e c0297e, int i, int i2, int i3) {
        int i4 = c0297e.f3577b0;
        int i5 = c0297e.f3579c0;
        c0297e.f3577b0 = 0;
        c0297e.f3579c0 = 0;
        c0297e.O(i2);
        c0297e.L(i3);
        if (i4 < 0) {
            c0297e.f3577b0 = 0;
        } else {
            c0297e.f3577b0 = i4;
        }
        if (i5 < 0) {
            c0297e.f3579c0 = 0;
        } else {
            c0297e.f3579c0 = i5;
        }
        C0297e c0297e2 = (C0297e) this.d;
        c0297e2.f3626t0 = i;
        c0297e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0116z c0116z = (C0116z) this.f422b;
            f0.X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2088p;
                RecyclerView recyclerView = c0116z.f2253a;
                if (recyclerView.L()) {
                    I2.f2089q = i;
                    recyclerView.f1521p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f369a;
                    I2.f2076a.setImportantForAccessibility(i);
                }
                I2.f2088p = 0;
            }
        }
    }

    public void w(C0297e c0297e) {
        ArrayList arrayList = (ArrayList) this.f422b;
        arrayList.clear();
        int size = c0297e.f3623q0.size();
        for (int i = 0; i < size; i++) {
            C0296d c0296d = (C0296d) c0297e.f3623q0.get(i);
            int[] iArr = c0296d.f3601p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0296d);
            }
        }
        c0297e.f3625s0.f3712b = true;
    }

    public C0011l(Method method, Method method2, Method method3) {
        this.f421a = 8;
        this.f422b = method;
        this.f423c = method2;
        this.d = method3;
    }

    public C0011l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0057b abstractC0057b) {
        this.f421a = 2;
        b1.d.e(o2, "store");
        b1.d.e(abstractC0057b, "extras");
        this.f422b = o2;
        this.f423c = n2;
        this.d = abstractC0057b;
    }

    public C0011l(C0116z c0116z) {
        this.f421a = 3;
        this.f422b = c0116z;
        this.f423c = new C0093b();
        this.d = new ArrayList();
    }

    public C0011l(Runnable runnable) {
        this.f421a = 0;
        this.f423c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f422b = runnable;
    }

    public C0011l(Context context, TypedArray typedArray) {
        this.f421a = 5;
        this.f422b = context;
        this.f423c = typedArray;
    }

    public C0011l(Context context, LocationManager locationManager) {
        this.f421a = 4;
        this.d = new C0124H();
        this.f422b = context;
        this.f423c = locationManager;
    }

    public C0011l(C0297e c0297e) {
        this.f421a = 7;
        this.f422b = new ArrayList();
        this.f423c = new C0300b();
        this.d = c0297e;
    }

    public C0011l(T.u uVar, I0.e eVar, T.d dVar, Set set) {
        this.f421a = 1;
        this.f422b = eVar;
        this.f423c = uVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new C.g(14, str));
        }
    }
}
