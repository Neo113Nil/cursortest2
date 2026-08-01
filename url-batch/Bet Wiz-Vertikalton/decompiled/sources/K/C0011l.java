package K;

import a0.AbstractC0056b;
import a0.C0057c;
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
import d1.InterfaceC0081a;
import f0.C0092b;
import f0.C0115z;
import g.C0123H;
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
import l.C0245u;
import s.C0293d;
import s.C0294e;
import t.C0297b;
import v.C0319f;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: e, reason: collision with root package name */
    public static C0011l f473e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f474a;

    /* renamed from: b, reason: collision with root package name */
    public Object f475b;

    /* renamed from: c, reason: collision with root package name */
    public Object f476c;
    public Object d;

    public /* synthetic */ C0011l() {
        this.f474a = 6;
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
        RecyclerView recyclerView = ((C0115z) this.f475b).f2320a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0092b) this.f476c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0115z) this.f475b).f2320a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0092b) this.f476c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2149j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.X I2;
        int k2 = k(i);
        ((C0092b) this.f476c).g(k2);
        RecyclerView recyclerView = ((C0115z) this.f475b).f2320a;
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
        return ((C0115z) this.f475b).f2320a.getChildAt(k(i));
    }

    public int f() {
        return ((C0115z) this.f475b).f2320a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList x2;
        TypedArray typedArray = (TypedArray) this.f476c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (x2 = x1.d.x((Context) this.f475b, resourceId)) == null) ? typedArray.getColorStateList(i) : x2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f476c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : x1.l.z((Context) this.f475b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f476c).hasValue(i) || (resourceId = ((TypedArray) this.f476c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0245u a2 = C0245u.a();
        Context context = (Context) this.f475b;
        synchronized (a2) {
            d = a2.f3059a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, l.T t2) {
        int resourceId = ((TypedArray) this.f476c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f38a;
        Context context = (Context) this.f475b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0115z) this.f475b).f2320a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0092b c0092b = (C0092b) this.f476c;
            int b2 = i - (i2 - c0092b.b(i2));
            if (b2 == 0) {
                while (c0092b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0115z) this.f475b).f2320a.getChildAt(i);
    }

    public int m() {
        return ((C0115z) this.f475b).f2320a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M n(e1.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        e1.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f475b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1453a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f2051a;
        Map map = e1.b.f2049b;
        e1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof V0.a) {
                if ((m2 instanceof e1.c ? ((e1.c) m2).b() : m2 instanceof InterfaceC0081a ? 0 : m2 instanceof d1.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = x1.d.B(e1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f476c;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                e1.d.b(m2);
            }
            e1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0057c c0057c = new C0057c((AbstractC0056b) this.d);
        c0057c.f1209a.put(b0.b.f1609a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(x1.d.A(bVar), c0057c);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(x1.d.A(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(x1.d.A(bVar), c0057c);
        }
        e1.d.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.x xVar) {
        if ((xVar.f837c & 3) == 0) {
            T.d dVar = (T.d) this.d;
            U.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f412a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T.d.f791b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f792a;
            String sb2 = sb.toString();
            int i3 = C.e.f62a;
            boolean a3 = C.d.a(textPaint, sb2);
            int i4 = xVar.f837c & 4;
            xVar.f837c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f837c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0115z c0115z = (C0115z) this.f475b;
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2156q;
            View view2 = I2.f2143a;
            if (i != -1) {
                I2.f2155p = i;
            } else {
                WeakHashMap weakHashMap = S.f422a;
                I2.f2155p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0115z.f2320a;
            if (recyclerView.L()) {
                I2.f2156q = 4;
                recyclerView.f1566p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f422a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0293d c0293d, C0319f c0319f) {
        int[] iArr = c0293d.f3577p0;
        int i2 = iArr[0];
        C0297b c0297b = (C0297b) this.f476c;
        c0297b.f3682a = i2;
        c0297b.f3683b = iArr[1];
        c0297b.f3684c = c0293d.q();
        c0297b.d = c0293d.k();
        c0297b.i = false;
        c0297b.f3688j = i;
        boolean z2 = c0297b.f3682a == 3;
        boolean z3 = c0297b.f3683b == 3;
        boolean z4 = z2 && c0293d.f3546W > 0.0f;
        boolean z5 = z3 && c0293d.f3546W > 0.0f;
        int[] iArr2 = c0293d.f3581t;
        if (z4 && iArr2[0] == 4) {
            c0297b.f3682a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0297b.f3683b = 1;
        }
        c0319f.b(c0293d, c0297b);
        c0293d.O(c0297b.f3685e);
        c0293d.L(c0297b.f3686f);
        c0293d.f3529E = c0297b.h;
        c0293d.I(c0297b.f3687g);
        c0297b.f3688j = 0;
        return c0297b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.p pVar) {
        int i4;
        char c2;
        T.q qVar = new T.q((T.t) ((T.u) this.f476c).f830c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f817c.f826a;
                T.t tVar = sparseArray == null ? null : (T.t) sparseArray.get(codePointAt);
                if (qVar.f815a == 2) {
                    if (tVar != null) {
                        qVar.f817c = tVar;
                        qVar.f819f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            T.t tVar2 = qVar.f817c;
                            if (tVar2.f827b != null) {
                                if (qVar.f819f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f817c;
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
                    qVar.f815a = 2;
                    qVar.f817c = tVar;
                    qVar.f819f = 1;
                    c2 = 2;
                }
                qVar.f818e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, qVar.d.f827b)) {
                        z3 = pVar.r(charSequence, i4, i6, qVar.d.f827b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f815a == 2 && qVar.f817c.f827b != null && ((qVar.f819f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f817c.f827b)))) {
            pVar.r(charSequence, i4, i6, qVar.f817c.f827b);
        }
        return pVar.i();
    }

    public void t() {
        ((TypedArray) this.f476c).recycle();
    }

    public String toString() {
        switch (this.f474a) {
            case 3:
                return ((C0092b) this.f476c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0294e c0294e, int i, int i2, int i3) {
        int i4 = c0294e.f3553b0;
        int i5 = c0294e.f3555c0;
        c0294e.f3553b0 = 0;
        c0294e.f3555c0 = 0;
        c0294e.O(i2);
        c0294e.L(i3);
        if (i4 < 0) {
            c0294e.f3553b0 = 0;
        } else {
            c0294e.f3553b0 = i4;
        }
        if (i5 < 0) {
            c0294e.f3555c0 = 0;
        } else {
            c0294e.f3555c0 = i5;
        }
        C0294e c0294e2 = (C0294e) this.d;
        c0294e2.f3602t0 = i;
        c0294e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0115z c0115z = (C0115z) this.f475b;
            f0.X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2155p;
                RecyclerView recyclerView = c0115z.f2320a;
                if (recyclerView.L()) {
                    I2.f2156q = i;
                    recyclerView.f1566p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f422a;
                    I2.f2143a.setImportantForAccessibility(i);
                }
                I2.f2155p = 0;
            }
        }
    }

    public void w(C0294e c0294e) {
        ArrayList arrayList = (ArrayList) this.f475b;
        arrayList.clear();
        int size = c0294e.f3599q0.size();
        for (int i = 0; i < size; i++) {
            C0293d c0293d = (C0293d) c0294e.f3599q0.get(i);
            int[] iArr = c0293d.f3577p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0293d);
            }
        }
        c0294e.f3601s0.f3692b = true;
    }

    public C0011l(Method method, Method method2, Method method3) {
        this.f474a = 8;
        this.f475b = method;
        this.f476c = method2;
        this.d = method3;
    }

    public C0011l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0056b abstractC0056b) {
        this.f474a = 2;
        e1.d.e(o2, "store");
        e1.d.e(abstractC0056b, "extras");
        this.f475b = o2;
        this.f476c = n2;
        this.d = abstractC0056b;
    }

    public C0011l(C0115z c0115z) {
        this.f474a = 3;
        this.f475b = c0115z;
        this.f476c = new C0092b();
        this.d = new ArrayList();
    }

    public C0011l(Runnable runnable) {
        this.f474a = 0;
        this.f476c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f475b = runnable;
    }

    public C0011l(Context context, TypedArray typedArray) {
        this.f474a = 5;
        this.f475b = context;
        this.f476c = typedArray;
    }

    public C0011l(Context context, LocationManager locationManager) {
        this.f474a = 4;
        this.d = new C0123H();
        this.f475b = context;
        this.f476c = locationManager;
    }

    public C0011l(C0294e c0294e) {
        this.f474a = 7;
        this.f475b = new ArrayList();
        this.f476c = new C0297b();
        this.d = c0294e;
    }

    public C0011l(T.u uVar, I0.e eVar, T.d dVar, Set set) {
        this.f474a = 1;
        this.f475b = eVar;
        this.f476c = uVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new C.g(13, str));
        }
    }
}
