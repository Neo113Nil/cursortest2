package K;

import a0.AbstractC0057b;
import a0.C0058c;
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
import f0.C0091b;
import f0.C0114z;
import g.C0122H;
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
import l.C0245v;
import s.C0295d;
import s.C0296e;
import t.C0299b;
import v.C0321f;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: e, reason: collision with root package name */
    public static C0011l f413e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f414a;

    /* renamed from: b, reason: collision with root package name */
    public Object f415b;

    /* renamed from: c, reason: collision with root package name */
    public Object f416c;
    public Object d;

    public /* synthetic */ C0011l() {
        this.f414a = 6;
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
        RecyclerView recyclerView = ((C0114z) this.f415b).f2252a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0091b) this.f416c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0114z) this.f415b).f2252a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0091b) this.f416c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2081j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.X I2;
        int k2 = k(i);
        ((C0091b) this.f416c).g(k2);
        RecyclerView recyclerView = ((C0114z) this.f415b).f2252a;
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
        return ((C0114z) this.f415b).f2252a.getChildAt(k(i));
    }

    public int f() {
        return ((C0114z) this.f415b).f2252a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList u2;
        TypedArray typedArray = (TypedArray) this.f416c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (u2 = s1.d.u((Context) this.f415b, resourceId)) == null) ? typedArray.getColorStateList(i) : u2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f416c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : s1.l.z((Context) this.f415b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f416c).hasValue(i) || (resourceId = ((TypedArray) this.f416c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0245v a2 = C0245v.a();
        Context context = (Context) this.f415b;
        synchronized (a2) {
            d = a2.f3153a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, l.U u2) {
        int resourceId = ((TypedArray) this.f416c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f38a;
        Context context = (Context) this.f415b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, u2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0114z) this.f415b).f2252a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0091b c0091b = (C0091b) this.f416c;
            int b2 = i - (i2 - c0091b.b(i2));
            if (b2 == 0) {
                while (c0091b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0114z) this.f415b).f2252a.getChildAt(i);
    }

    public int m() {
        return ((C0114z) this.f415b).f2252a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.M n(Z0.b bVar, String str) {
        boolean isInstance;
        androidx.lifecycle.M a2;
        Z0.d.e(str, "key");
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) this.f415b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1383a;
        androidx.lifecycle.M m2 = (androidx.lifecycle.M) linkedHashMap.get(str);
        Class cls = bVar.f1063a;
        Map map = Z0.b.f1061b;
        Z0.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof Q0.a) {
                if ((m2 instanceof Z0.c ? ((Z0.c) m2).b() : m2 instanceof Y0.a ? 0 : m2 instanceof Y0.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = s1.d.E(Z0.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        androidx.lifecycle.N n2 = (androidx.lifecycle.N) this.f416c;
        if (isInstance) {
            if (n2 instanceof androidx.lifecycle.L) {
                Z0.d.b(m2);
            }
            Z0.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        C0058c c0058c = new C0058c((AbstractC0057b) this.d);
        c0058c.f1140a.put(b0.b.f1538a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(s1.d.D(bVar), c0058c);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(s1.d.D(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(s1.d.D(bVar), c0058c);
        }
        Z0.d.e(a2, "viewModel");
        androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.x xVar) {
        if ((xVar.f800c & 3) == 0) {
            T.d dVar = (T.d) this.d;
            U.a c2 = xVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f352a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = T.d.f754b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f755a;
            String sb2 = sb.toString();
            int i3 = C.e.f59a;
            boolean a3 = C.d.a(textPaint, sb2);
            int i4 = xVar.f800c & 4;
            xVar.f800c = a3 ? i4 | 2 : i4 | 1;
        }
        return (xVar.f800c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0114z c0114z = (C0114z) this.f415b;
        f0.X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2088q;
            View view2 = I2.f2075a;
            if (i != -1) {
                I2.f2087p = i;
            } else {
                WeakHashMap weakHashMap = S.f362a;
                I2.f2087p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0114z.f2252a;
            if (recyclerView.L()) {
                I2.f2088q = 4;
                recyclerView.f1495p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f362a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0295d c0295d, C0321f c0321f) {
        int[] iArr = c0295d.f3714p0;
        int i2 = iArr[0];
        C0299b c0299b = (C0299b) this.f416c;
        c0299b.f3827a = i2;
        c0299b.f3828b = iArr[1];
        c0299b.f3829c = c0295d.q();
        c0299b.d = c0295d.k();
        c0299b.i = false;
        c0299b.f3833j = i;
        boolean z2 = c0299b.f3827a == 3;
        boolean z3 = c0299b.f3828b == 3;
        boolean z4 = z2 && c0295d.f3684W > 0.0f;
        boolean z5 = z3 && c0295d.f3684W > 0.0f;
        int[] iArr2 = c0295d.f3718t;
        if (z4 && iArr2[0] == 4) {
            c0299b.f3827a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0299b.f3828b = 1;
        }
        c0321f.b(c0295d, c0299b);
        c0295d.O(c0299b.f3830e);
        c0295d.L(c0299b.f3831f);
        c0295d.f3667E = c0299b.h;
        c0295d.I(c0299b.f3832g);
        c0299b.f3833j = 0;
        return c0299b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.p pVar) {
        int i4;
        char c2;
        T.q qVar = new T.q((T.t) ((T.u) this.f416c).f793c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = qVar.f780c.f789a;
                T.t tVar = sparseArray == null ? null : (T.t) sparseArray.get(codePointAt);
                if (qVar.f778a == 2) {
                    if (tVar != null) {
                        qVar.f780c = tVar;
                        qVar.f782f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            T.t tVar2 = qVar.f780c;
                            if (tVar2.f790b != null) {
                                if (qVar.f782f != 1) {
                                    qVar.d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.d = qVar.f780c;
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
                    qVar.f778a = 2;
                    qVar.f780c = tVar;
                    qVar.f782f = 1;
                    c2 = 2;
                }
                qVar.f781e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, qVar.d.f790b)) {
                        z3 = pVar.n(charSequence, i4, i6, qVar.d.f790b);
                        i5++;
                    }
                }
            }
        }
        if (qVar.f778a == 2 && qVar.f780c.f790b != null && ((qVar.f782f > 1 || qVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, qVar.f780c.f790b)))) {
            pVar.n(charSequence, i4, i6, qVar.f780c.f790b);
        }
        return pVar.g();
    }

    public void t() {
        ((TypedArray) this.f416c).recycle();
    }

    public String toString() {
        switch (this.f414a) {
            case 3:
                return ((C0091b) this.f416c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0296e c0296e, int i, int i2, int i3) {
        int i4 = c0296e.f3691b0;
        int i5 = c0296e.f3693c0;
        c0296e.f3691b0 = 0;
        c0296e.f3693c0 = 0;
        c0296e.O(i2);
        c0296e.L(i3);
        if (i4 < 0) {
            c0296e.f3691b0 = 0;
        } else {
            c0296e.f3691b0 = i4;
        }
        if (i5 < 0) {
            c0296e.f3693c0 = 0;
        } else {
            c0296e.f3693c0 = i5;
        }
        C0296e c0296e2 = (C0296e) this.d;
        c0296e2.f3739t0 = i;
        c0296e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0114z c0114z = (C0114z) this.f415b;
            f0.X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2087p;
                RecyclerView recyclerView = c0114z.f2252a;
                if (recyclerView.L()) {
                    I2.f2088q = i;
                    recyclerView.f1495p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f362a;
                    I2.f2075a.setImportantForAccessibility(i);
                }
                I2.f2087p = 0;
            }
        }
    }

    public void w(C0296e c0296e) {
        ArrayList arrayList = (ArrayList) this.f415b;
        arrayList.clear();
        int size = c0296e.f3736q0.size();
        for (int i = 0; i < size; i++) {
            C0295d c0295d = (C0295d) c0296e.f3736q0.get(i);
            int[] iArr = c0295d.f3714p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0295d);
            }
        }
        c0296e.f3738s0.f3837b = true;
    }

    public C0011l(Method method, Method method2, Method method3) {
        this.f414a = 8;
        this.f415b = method;
        this.f416c = method2;
        this.d = method3;
    }

    public C0011l(androidx.lifecycle.O o2, androidx.lifecycle.N n2, AbstractC0057b abstractC0057b) {
        this.f414a = 2;
        Z0.d.e(o2, "store");
        Z0.d.e(abstractC0057b, "extras");
        this.f415b = o2;
        this.f416c = n2;
        this.d = abstractC0057b;
    }

    public C0011l(C0114z c0114z) {
        this.f414a = 3;
        this.f415b = c0114z;
        this.f416c = new C0091b();
        this.d = new ArrayList();
    }

    public C0011l(Runnable runnable) {
        this.f414a = 0;
        this.f416c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f415b = runnable;
    }

    public C0011l(Context context, TypedArray typedArray) {
        this.f414a = 5;
        this.f415b = context;
        this.f416c = typedArray;
    }

    public C0011l(Context context, LocationManager locationManager) {
        this.f414a = 4;
        this.d = new C0122H();
        this.f415b = context;
        this.f416c = locationManager;
    }

    public C0011l(C0296e c0296e) {
        this.f414a = 7;
        this.f415b = new ArrayList();
        this.f416c = new C0299b();
        this.d = c0296e;
    }

    public C0011l(T.u uVar, I0.e eVar, T.d dVar, Set set) {
        this.f414a = 1;
        this.f415b = eVar;
        this.f416c = uVar;
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
