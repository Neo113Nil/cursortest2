package K;

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
import b0.C0076b;
import f0.C0085b;
import f0.C0108z;
import g.C0116H;
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
import l.C0264v;
import s.C0298d;
import s.C0299e;
import t.C0302b;
import v.C0324f;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012l {

    /* renamed from: e, reason: collision with root package name */
    public static C0012l f429e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f430a;

    /* renamed from: b, reason: collision with root package name */
    public Object f431b;

    /* renamed from: c, reason: collision with root package name */
    public Object f432c;
    public Object d;

    public /* synthetic */ C0012l() {
        this.f430a = 6;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        T.x[] xVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (T.x[]) editable.getSpans(selectionStart, selectionEnd, T.x.class)) != null && xVarArr.length > 0) {
            for (T.x xVar : xVarArr) {
                int spanStart = editable.getSpanStart(xVar);
                int spanEnd = editable.getSpanEnd(xVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0012l r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0012l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0108z) this.f431b).f2184a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0085b) this.f432c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0108z) this.f431b).f2184a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0085b) this.f432c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2013j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.X I2;
        int k2 = k(i);
        ((C0085b) this.f432c).g(k2);
        RecyclerView recyclerView = ((C0108z) this.f431b).f2184a;
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
        return ((C0108z) this.f431b).f2184a.getChildAt(k(i));
    }

    public int f() {
        return ((C0108z) this.f431b).f2184a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList y2;
        TypedArray typedArray = (TypedArray) this.f432c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (y2 = q1.d.y((Context) this.f431b, resourceId)) == null) ? typedArray.getColorStateList(i) : y2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f432c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : q1.l.v((Context) this.f431b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f432c).hasValue(i) || (resourceId = ((TypedArray) this.f432c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0264v a2 = C0264v.a();
        Context context = (Context) this.f431b;
        synchronized (a2) {
            d = a2.f3070a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, l.U u2) {
        int resourceId = ((TypedArray) this.f432c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f43a;
        Context context = (Context) this.f431b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, u2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0108z) this.f431b).f2184a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0085b c0085b = (C0085b) this.f432c;
            int b2 = i - (i2 - c0085b.b(i2));
            if (b2 == 0) {
                while (c0085b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0108z) this.f431b).f2184a.getChildAt(i);
    }

    public int m() {
        return ((C0108z) this.f431b).f2184a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M n(X0.c cVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        X0.e.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f431b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1344a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = cVar.f1010a;
        Map map = X0.c.f1008b;
        X0.e.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof P0.a) {
                if ((m2 instanceof X0.d ? ((X0.d) m2).b() : m2 instanceof W0.a ? 0 : m2 instanceof W0.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = q1.d.H(X0.i.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f432c;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                X0.e.b(m2);
            }
            X0.e.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        a0.c cVar2 = new a0.c((a0.b) this.d);
        cVar2.f1101a.put(C0076b.f1500a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(q1.d.G(cVar), cVar2);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(q1.d.G(cVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(q1.d.G(cVar), cVar2);
        }
        X0.e.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.w wVar) {
        if ((wVar.f750c & 3) == 0) {
            T.d dVar = (T.d) this.d;
            U.a c2 = wVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f371a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T.d.f707b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f708a;
            String sb2 = sb.toString();
            int i3 = C.f.f151a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = wVar.f750c & 4;
            wVar.f750c = a3 ? i4 | 2 : i4 | 1;
        }
        return (wVar.f750c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0108z c0108z = (C0108z) this.f431b;
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2020q;
            View view2 = I2.f2007a;
            if (i != -1) {
                I2.f2019p = i;
            } else {
                WeakHashMap weakHashMap = T.f381a;
                I2.f2019p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0108z.f2184a;
            if (recyclerView.L()) {
                I2.f2020q = 4;
                recyclerView.f1457p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = T.f381a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0298d c0298d, C0324f c0324f) {
        int[] iArr = c0298d.f3661p0;
        int i2 = iArr[0];
        C0302b c0302b = (C0302b) this.f432c;
        c0302b.f3754a = i2;
        c0302b.f3755b = iArr[1];
        c0302b.f3756c = c0298d.q();
        c0302b.d = c0298d.k();
        c0302b.i = false;
        c0302b.f3760j = i;
        boolean z2 = c0302b.f3754a == 3;
        boolean z3 = c0302b.f3755b == 3;
        boolean z4 = z2 && c0298d.f3630W > 0.0f;
        boolean z5 = z3 && c0298d.f3630W > 0.0f;
        int[] iArr2 = c0298d.f3665t;
        if (z4 && iArr2[0] == 4) {
            c0302b.f3754a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0302b.f3755b = 1;
        }
        c0324f.b(c0298d, c0302b);
        c0298d.O(c0302b.f3757e);
        c0298d.L(c0302b.f3758f);
        c0298d.f3613E = c0302b.h;
        c0298d.I(c0302b.f3759g);
        c0302b.f3760j = 0;
        return c0302b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.o oVar) {
        int i4;
        char c2;
        T.p pVar = new T.p((T.s) ((T.t) this.f432c).f743c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = pVar.f730c.f739a;
                T.s sVar = sparseArray == null ? null : (T.s) sparseArray.get(codePointAt);
                if (pVar.f728a == 2) {
                    if (sVar != null) {
                        pVar.f730c = sVar;
                        pVar.f732f++;
                    } else {
                        if (codePointAt == 65038) {
                            pVar.a();
                        } else if (codePointAt != 65039) {
                            T.s sVar2 = pVar.f730c;
                            if (sVar2.f740b != null) {
                                if (pVar.f732f != 1) {
                                    pVar.d = sVar2;
                                    pVar.a();
                                } else if (pVar.b()) {
                                    pVar.d = pVar.f730c;
                                    pVar.a();
                                } else {
                                    pVar.a();
                                }
                                c2 = 3;
                            } else {
                                pVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (sVar == null) {
                    pVar.a();
                    c2 = 1;
                } else {
                    pVar.f728a = 2;
                    pVar.f730c = sVar;
                    pVar.f732f = 1;
                    c2 = 2;
                }
                pVar.f731e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, pVar.d.f740b)) {
                        z3 = oVar.m(charSequence, i4, i6, pVar.d.f740b);
                        i5++;
                    }
                }
            }
        }
        if (pVar.f728a == 2 && pVar.f730c.f740b != null && ((pVar.f732f > 1 || pVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, pVar.f730c.f740b)))) {
            oVar.m(charSequence, i4, i6, pVar.f730c.f740b);
        }
        return oVar.e();
    }

    public void t() {
        ((TypedArray) this.f432c).recycle();
    }

    public String toString() {
        switch (this.f430a) {
            case 3:
                return ((C0085b) this.f432c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0299e c0299e, int i, int i2, int i3) {
        int i4 = c0299e.f3637b0;
        int i5 = c0299e.f3639c0;
        c0299e.f3637b0 = 0;
        c0299e.f3639c0 = 0;
        c0299e.O(i2);
        c0299e.L(i3);
        if (i4 < 0) {
            c0299e.f3637b0 = 0;
        } else {
            c0299e.f3637b0 = i4;
        }
        if (i5 < 0) {
            c0299e.f3639c0 = 0;
        } else {
            c0299e.f3639c0 = i5;
        }
        C0299e c0299e2 = (C0299e) this.d;
        c0299e2.f3686t0 = i;
        c0299e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0108z c0108z = (C0108z) this.f431b;
            f0.X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2019p;
                RecyclerView recyclerView = c0108z.f2184a;
                if (recyclerView.L()) {
                    I2.f2020q = i;
                    recyclerView.f1457p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = T.f381a;
                    I2.f2007a.setImportantForAccessibility(i);
                }
                I2.f2019p = 0;
            }
        }
    }

    public void w(C0299e c0299e) {
        ArrayList arrayList = (ArrayList) this.f431b;
        arrayList.clear();
        int size = c0299e.f3683q0.size();
        for (int i = 0; i < size; i++) {
            C0298d c0298d = (C0298d) c0299e.f3683q0.get(i);
            int[] iArr = c0298d.f3661p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0298d);
            }
        }
        c0299e.f3685s0.f3764b = true;
    }

    public C0012l(Method method, Method method2, Method method3) {
        this.f430a = 7;
        this.f431b = method;
        this.f432c = method2;
        this.d = method3;
    }

    public C0012l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, a0.b bVar) {
        this.f430a = 2;
        X0.e.e(o2, "store");
        X0.e.e(bVar, "extras");
        this.f431b = o2;
        this.f432c = n2;
        this.d = bVar;
    }

    public C0012l(C0108z c0108z) {
        this.f430a = 3;
        this.f431b = c0108z;
        this.f432c = new C0085b();
        this.d = new ArrayList();
    }

    public C0012l(Runnable runnable) {
        this.f430a = 0;
        this.f432c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f431b = runnable;
    }

    public C0012l(Context context, TypedArray typedArray) {
        this.f430a = 5;
        this.f431b = context;
        this.f432c = typedArray;
    }

    public C0012l(Context context, LocationManager locationManager) {
        this.f430a = 4;
        this.d = new C0116H();
        this.f431b = context;
        this.f432c = locationManager;
    }

    public C0012l(C0299e c0299e) {
        this.f430a = 8;
        this.f431b = new ArrayList();
        this.f432c = new C0302b();
        this.d = c0299e;
    }

    public C0012l(T.t tVar, H0.e eVar, T.d dVar, Set set) {
        this.f430a = 1;
        this.f431b = eVar;
        this.f432c = tVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new B0.d(14, str));
        }
    }
}
