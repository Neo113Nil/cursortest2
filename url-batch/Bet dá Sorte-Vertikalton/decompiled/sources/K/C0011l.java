package K;

import a0.AbstractC0056b;
import a0.C0057c;
import a1.InterfaceC0058a;
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
import b0.C0079b;
import f0.C0088b;
import f0.C0111z;
import g.C0119H;
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
import l.C0198S;
import l.C0237t;
import s.C0281d;
import s.C0282e;
import t.C0285b;
import v.C0311f;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: e, reason: collision with root package name */
    public static C0011l f402e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f403a;

    /* renamed from: b, reason: collision with root package name */
    public Object f404b;

    /* renamed from: c, reason: collision with root package name */
    public Object f405c;
    public Object d;

    public /* synthetic */ C0011l() {
        this.f403a = 6;
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
        RecyclerView recyclerView = ((C0111z) this.f404b).f2295a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0088b) this.f405c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0111z) this.f404b).f2295a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0088b) this.f405c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2124j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.X I2;
        int k2 = k(i);
        ((C0088b) this.f405c).g(k2);
        RecyclerView recyclerView = ((C0111z) this.f404b).f2295a;
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
        return ((C0111z) this.f404b).f2295a.getChildAt(k(i));
    }

    public int f() {
        return ((C0111z) this.f404b).f2295a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList A2;
        TypedArray typedArray = (TypedArray) this.f405c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A2 = u1.d.A((Context) this.f404b, resourceId)) == null) ? typedArray.getColorStateList(i) : A2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f405c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : u1.d.D((Context) this.f404b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f405c).hasValue(i) || (resourceId = ((TypedArray) this.f405c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0237t a2 = C0237t.a();
        Context context = (Context) this.f404b;
        synchronized (a2) {
            d = a2.f3035a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, C0198S c0198s) {
        int resourceId = ((TypedArray) this.f405c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f66a;
        Context context = (Context) this.f404b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, c0198s, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0111z) this.f404b).f2295a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0088b c0088b = (C0088b) this.f405c;
            int b2 = i - (i2 - c0088b.b(i2));
            if (b2 == 0) {
                while (c0088b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0111z) this.f404b).f2295a.getChildAt(i);
    }

    public int m() {
        return ((C0111z) this.f404b).f2295a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M n(b1.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        b1.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f404b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1425a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f1583a;
        Map map = b1.b.f1581b;
        b1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof S0.a) {
                if ((m2 instanceof b1.c ? ((b1.c) m2).b() : m2 instanceof InterfaceC0058a ? 0 : m2 instanceof a1.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = u1.l.B(b1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f405c;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                b1.d.b(m2);
            }
            b1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0057c c0057c = new C0057c((AbstractC0056b) this.d);
        c0057c.f1179a.put(C0079b.f1580a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(u1.l.A(bVar), c0057c);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(u1.l.A(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(u1.l.A(bVar), c0057c);
        }
        b1.d.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.x xVar) {
        if ((xVar.f825c & 3) == 0) {
            T.d dVar = (T.d) this.d;
            U.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f341a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T.d.f779b;
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
            int i3 = C.f.f145a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = xVar.f825c & 4;
            xVar.f825c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f825c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0111z c0111z = (C0111z) this.f404b;
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2131q;
            View view2 = I2.f2118a;
            if (i != -1) {
                I2.f2130p = i;
            } else {
                WeakHashMap weakHashMap = S.f351a;
                I2.f2130p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0111z.f2295a;
            if (recyclerView.L()) {
                I2.f2131q = 4;
                recyclerView.f1537p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f351a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0281d c0281d, C0311f c0311f) {
        int[] iArr = c0281d.f3654p0;
        int i2 = iArr[0];
        C0285b c0285b = (C0285b) this.f405c;
        c0285b.f3779a = i2;
        c0285b.f3780b = iArr[1];
        c0285b.f3781c = c0281d.q();
        c0285b.d = c0281d.k();
        c0285b.i = false;
        c0285b.f3785j = i;
        boolean z2 = c0285b.f3779a == 3;
        boolean z3 = c0285b.f3780b == 3;
        boolean z4 = z2 && c0281d.f3624W > 0.0f;
        boolean z5 = z3 && c0281d.f3624W > 0.0f;
        int[] iArr2 = c0281d.f3658t;
        if (z4 && iArr2[0] == 4) {
            c0285b.f3779a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0285b.f3780b = 1;
        }
        c0311f.b(c0281d, c0285b);
        c0281d.O(c0285b.f3782e);
        c0281d.L(c0285b.f3783f);
        c0281d.f3607E = c0285b.h;
        c0281d.I(c0285b.f3784g);
        c0285b.f3785j = 0;
        return c0285b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.p pVar) {
        int i4;
        char c2;
        T.q qVar = new T.q((T.t) ((T.u) this.f405c).f818c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f805c.f814a;
                T.t tVar = sparseArray == null ? null : (T.t) sparseArray.get(codePointAt);
                if (qVar.f803a == 2) {
                    if (tVar != null) {
                        qVar.f805c = tVar;
                        qVar.f807f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            T.t tVar2 = qVar.f805c;
                            if (tVar2.f815b != null) {
                                if (qVar.f807f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f805c;
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
                    qVar.f803a = 2;
                    qVar.f805c = tVar;
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
                    if (z2 || !o(charSequence, i4, i6, qVar.d.f815b)) {
                        z3 = pVar.r(charSequence, i4, i6, qVar.d.f815b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f803a == 2 && qVar.f805c.f815b != null && ((qVar.f807f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f805c.f815b)))) {
            pVar.r(charSequence, i4, i6, qVar.f805c.f815b);
        }
        return pVar.i();
    }

    public void t() {
        ((TypedArray) this.f405c).recycle();
    }

    public String toString() {
        switch (this.f403a) {
            case 3:
                return ((C0088b) this.f405c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0282e c0282e, int i, int i2, int i3) {
        int i4 = c0282e.f3631b0;
        int i5 = c0282e.f3633c0;
        c0282e.f3631b0 = 0;
        c0282e.f3633c0 = 0;
        c0282e.O(i2);
        c0282e.L(i3);
        if (i4 < 0) {
            c0282e.f3631b0 = 0;
        } else {
            c0282e.f3631b0 = i4;
        }
        if (i5 < 0) {
            c0282e.f3633c0 = 0;
        } else {
            c0282e.f3633c0 = i5;
        }
        C0282e c0282e2 = (C0282e) this.d;
        c0282e2.f3678t0 = i;
        c0282e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0111z c0111z = (C0111z) this.f404b;
            f0.X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2130p;
                RecyclerView recyclerView = c0111z.f2295a;
                if (recyclerView.L()) {
                    I2.f2131q = i;
                    recyclerView.f1537p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f351a;
                    I2.f2118a.setImportantForAccessibility(i);
                }
                I2.f2130p = 0;
            }
        }
    }

    public void w(C0282e c0282e) {
        ArrayList arrayList = (ArrayList) this.f404b;
        arrayList.clear();
        int size = c0282e.f3675q0.size();
        for (int i = 0; i < size; i++) {
            C0281d c0281d = (C0281d) c0282e.f3675q0.get(i);
            int[] iArr = c0281d.f3654p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0281d);
            }
        }
        c0282e.f3677s0.f3789b = true;
    }

    public C0011l(Method method, Method method2, Method method3) {
        this.f403a = 8;
        this.f404b = method;
        this.f405c = method2;
        this.d = method3;
    }

    public C0011l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0056b abstractC0056b) {
        this.f403a = 2;
        b1.d.e(o2, "store");
        b1.d.e(abstractC0056b, "extras");
        this.f404b = o2;
        this.f405c = n2;
        this.d = abstractC0056b;
    }

    public C0011l(C0111z c0111z) {
        this.f403a = 3;
        this.f404b = c0111z;
        this.f405c = new C0088b();
        this.d = new ArrayList();
    }

    public C0011l(Runnable runnable) {
        this.f403a = 0;
        this.f405c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f404b = runnable;
    }

    public C0011l(Context context, TypedArray typedArray) {
        this.f403a = 5;
        this.f404b = context;
        this.f405c = typedArray;
    }

    public C0011l(Context context, LocationManager locationManager) {
        this.f403a = 4;
        this.d = new C0119H();
        this.f404b = context;
        this.f405c = locationManager;
    }

    public C0011l(C0282e c0282e) {
        this.f403a = 7;
        this.f404b = new ArrayList();
        this.f405c = new C0285b();
        this.d = c0282e;
    }

    public C0011l(T.u uVar, M0.e eVar, T.d dVar, Set set) {
        this.f403a = 1;
        this.f404b = eVar;
        this.f405c = uVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new C.h(13, str));
        }
    }
}
