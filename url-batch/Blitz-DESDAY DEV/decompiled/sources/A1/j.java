package A1;

import D.r;
import M.Q;
import V.s;
import V.v;
import V.w;
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
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.neondrop.game.ConnectFourView;
import d0.C0081b;
import f1.InterfaceC0099a;
import g.H;
import h0.C0115b;
import h0.C0138z;
import h0.X;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C0214u;
import l.T;
import u.C0275d;
import u.C0276e;
import v.C0279b;
import x.C0305f;

/* loaded from: classes.dex */
public final class j implements U0.b {

    /* renamed from: e, reason: collision with root package name */
    public static j f78e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79a;

    /* renamed from: b, reason: collision with root package name */
    public Object f80b;

    /* renamed from: c, reason: collision with root package name */
    public Object f81c;
    public Object d;

    public /* synthetic */ j() {
        this.f79a = 8;
    }

    public static boolean d(Editable editable, KeyEvent keyEvent, boolean z2) {
        w[] wVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
            for (w wVar : wVarArr) {
                int spanStart = editable.getSpanStart(wVar);
                int spanEnd = editable.getSpanEnd(wVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static j t(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0138z) this.f80b).f2611a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m(i);
        ((C0115b) this.f81c).e(childCount, z2);
        if (z2) {
            r(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    @Override // U0.b
    public void b() {
        U0.b bVar = (U0.b) this.f81c;
        ConnectFourView connectFourView = (ConnectFourView) this.f80b;
        connectFourView.f2088j = bVar;
        connectFourView.f2091m = -1;
        connectFourView.f2092n = -1;
        connectFourView.f2093o = U0.g.f873a;
        connectFourView.f2096r = 1.0f;
        ((InterfaceC0099a) this.d).a();
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0138z) this.f80b).f2611a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m(i);
        ((C0115b) this.f81c).e(childCount, z2);
        if (z2) {
            r(view);
        }
        X I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2436j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // U0.b
    public void e(int i) {
    }

    public void f(int i) {
        X I2;
        int m2 = m(i);
        ((C0115b) this.f81c).g(m2);
        RecyclerView recyclerView = ((C0138z) this.f80b).f2611a;
        View childAt = recyclerView.getChildAt(m2);
        if (childAt != null && (I2 = RecyclerView.I(childAt)) != null) {
            if (I2.k() && !I2.p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I2 + recyclerView.y());
            }
            I2.a(256);
        }
        recyclerView.detachViewFromParent(m2);
    }

    public View g(int i) {
        return ((C0138z) this.f80b).f2611a.getChildAt(m(i));
    }

    public int h() {
        return ((C0138z) this.f80b).f2611a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList i(int i) {
        int resourceId;
        ColorStateList D2;
        TypedArray typedArray = (TypedArray) this.f81c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = z1.l.D((Context) this.f80b, resourceId)) == null) ? typedArray.getColorStateList(i) : D2;
    }

    public Drawable j(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f81c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : z1.l.F((Context) this.f80b, resourceId);
    }

    public Drawable k(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f81c).hasValue(i) || (resourceId = ((TypedArray) this.f81c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0214u a2 = C0214u.a();
        Context context = (Context) this.f80b;
        synchronized (a2) {
            d = a2.f3079a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface l(int i, int i2, T t2) {
        int resourceId = ((TypedArray) this.f81c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = r.f146a;
        Context context = (Context) this.f80b;
        if (context.isRestricted()) {
            return null;
        }
        return r.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    public int m(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0138z) this.f80b).f2611a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0115b c0115b = (C0115b) this.f81c;
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

    public View n(int i) {
        return ((C0138z) this.f80b).f2611a.getChildAt(i);
    }

    public int o() {
        return ((C0138z) this.f80b).f2611a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M p(g1.b bVar, String str) {
        boolean isInstance;
        M a2;
        g1.d.e(str, "key");
        O o2 = (O) this.f80b;
        o2.getClass();
        LinkedHashMap linkedHashMap = o2.f1555a;
        M m2 = (M) linkedHashMap.get(str);
        Class cls = bVar.f2361a;
        Map map = g1.b.f2359b;
        g1.d.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (m2 instanceof W0.a) {
                if ((m2 instanceof g1.c ? ((g1.c) m2).b() : m2 instanceof InterfaceC0099a ? 0 : m2 instanceof f1.l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = z1.d.B(g1.h.a(cls));
            }
            isInstance = cls2.isInstance(m2);
        }
        N n2 = (N) this.f81c;
        if (isInstance) {
            if (n2 instanceof L) {
                g1.d.b(m2);
            }
            g1.d.c(m2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return m2;
        }
        c0.c cVar = new c0.c((c0.b) this.d);
        cVar.f1719a.put(C0081b.f2124a, str);
        try {
            try {
                n2.getClass();
                a2 = n2.b(z1.d.A(bVar), cVar);
            } catch (AbstractMethodError unused) {
                a2 = n2.a(z1.d.A(bVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = n2.b(z1.d.A(bVar), cVar);
        }
        g1.d.e(a2, "viewModel");
        M m3 = (M) linkedHashMap.put(str, a2);
        if (m3 != null) {
            m3.a();
        }
        return a2;
    }

    public boolean q(CharSequence charSequence, int i, int i2, v vVar) {
        if ((vVar.f917c & 3) == 0) {
            V.d dVar = (V.d) this.d;
            W.a c2 = vVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f503a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = V.d.f877b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f878a;
            String sb2 = sb.toString();
            int i3 = E.e.f165a;
            boolean a3 = E.d.a(textPaint, sb2);
            int i4 = vVar.f917c & 4;
            vVar.f917c = a3 ? i4 | 2 : i4 | 1;
        }
        return (vVar.f917c & 3) == 2;
    }

    public void r(View view) {
        ((ArrayList) this.d).add(view);
        C0138z c0138z = (C0138z) this.f80b;
        X I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2443q;
            View view2 = I2.f2430a;
            if (i != -1) {
                I2.f2442p = i;
            } else {
                WeakHashMap weakHashMap = Q.f513a;
                I2.f2442p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0138z.f2611a;
            if (recyclerView.L()) {
                I2.f2443q = 4;
                recyclerView.p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = Q.f513a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean s(int i, C0275d c0275d, C0305f c0305f) {
        int[] iArr = c0275d.p0;
        int i2 = iArr[0];
        C0279b c0279b = (C0279b) this.f81c;
        c0279b.f3799a = i2;
        c0279b.f3800b = iArr[1];
        c0279b.f3801c = c0275d.q();
        c0279b.d = c0275d.k();
        c0279b.i = false;
        c0279b.f3805j = i;
        boolean z2 = c0279b.f3799a == 3;
        boolean z3 = c0279b.f3800b == 3;
        boolean z4 = z2 && c0275d.f3662W > 0.0f;
        boolean z5 = z3 && c0275d.f3662W > 0.0f;
        int[] iArr2 = c0275d.f3697t;
        if (z4 && iArr2[0] == 4) {
            c0279b.f3799a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0279b.f3800b = 1;
        }
        c0305f.b(c0275d, c0279b);
        c0275d.O(c0279b.f3802e);
        c0275d.L(c0279b.f3803f);
        c0275d.f3645E = c0279b.h;
        c0275d.I(c0279b.f3804g);
        c0279b.f3805j = 0;
        return c0279b.i;
    }

    public String toString() {
        switch (this.f79a) {
            case 6:
                return ((C0115b) this.f81c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public Object u(CharSequence charSequence, int i, int i2, int i3, boolean z2, V.o oVar) {
        int i4;
        char c2;
        V.p pVar = new V.p((s) ((T0.g) this.f81c).f826c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = pVar.f900c.f909a;
                s sVar = sparseArray == null ? null : (s) sparseArray.get(codePointAt);
                if (pVar.f898a == 2) {
                    if (sVar != null) {
                        pVar.f900c = sVar;
                        pVar.f902f++;
                    } else {
                        if (codePointAt == 65038) {
                            pVar.a();
                        } else if (codePointAt != 65039) {
                            s sVar2 = pVar.f900c;
                            if (sVar2.f910b != null) {
                                if (pVar.f902f != 1) {
                                    pVar.d = sVar2;
                                    pVar.a();
                                } else if (pVar.b()) {
                                    pVar.d = pVar.f900c;
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
                    pVar.f898a = 2;
                    pVar.f900c = sVar;
                    pVar.f902f = 1;
                    c2 = 2;
                }
                pVar.f901e = codePointAt;
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
                    if (z2 || !q(charSequence, i4, i6, pVar.d.f910b)) {
                        z3 = oVar.g(charSequence, i4, i6, pVar.d.f910b);
                        i5++;
                    }
                }
            }
        }
        if (pVar.f898a == 2 && pVar.f900c.f910b != null && ((pVar.f902f > 1 || pVar.b()) && i5 < i3 && z3 && (z2 || !q(charSequence, i4, i6, pVar.f900c.f910b)))) {
            oVar.g(charSequence, i4, i6, pVar.f900c.f910b);
        }
        return oVar.h();
    }

    public void v() {
        ((TypedArray) this.f81c).recycle();
    }

    public void w(C0276e c0276e, int i, int i2, int i3) {
        int i4 = c0276e.f3669b0;
        int i5 = c0276e.f3671c0;
        c0276e.f3669b0 = 0;
        c0276e.f3671c0 = 0;
        c0276e.O(i2);
        c0276e.L(i3);
        if (i4 < 0) {
            c0276e.f3669b0 = 0;
        } else {
            c0276e.f3669b0 = i4;
        }
        if (i5 < 0) {
            c0276e.f3671c0 = 0;
        } else {
            c0276e.f3671c0 = i5;
        }
        C0276e c0276e2 = (C0276e) this.d;
        c0276e2.f3717t0 = i;
        c0276e2.U();
    }

    public void x(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0138z c0138z = (C0138z) this.f80b;
            X I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2442p;
                RecyclerView recyclerView = c0138z.f2611a;
                if (recyclerView.L()) {
                    I2.f2443q = i;
                    recyclerView.p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = Q.f513a;
                    I2.f2430a.setImportantForAccessibility(i);
                }
                I2.f2442p = 0;
            }
        }
    }

    public void y(C0276e c0276e) {
        ArrayList arrayList = (ArrayList) this.f80b;
        arrayList.clear();
        int size = c0276e.f3714q0.size();
        for (int i = 0; i < size; i++) {
            C0275d c0275d = (C0275d) c0276e.f3714q0.get(i);
            int[] iArr = c0275d.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0275d);
            }
        }
        c0276e.f3716s0.f3809b = true;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i) {
        this.f79a = i;
        this.f80b = obj;
        this.f81c = obj2;
        this.d = obj3;
    }

    public j(O o2, N n2, c0.b bVar) {
        this.f79a = 4;
        g1.d.e(o2, "store");
        g1.d.e(bVar, "extras");
        this.f80b = o2;
        this.f81c = n2;
        this.d = bVar;
    }

    public j(C0138z c0138z) {
        this.f79a = 6;
        this.f80b = c0138z;
        this.f81c = new C0115b();
        this.d = new ArrayList();
    }

    public j(Runnable runnable) {
        this.f79a = 1;
        this.f81c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f80b = runnable;
    }

    public j(Context context, TypedArray typedArray) {
        this.f79a = 7;
        this.f80b = context;
        this.f81c = typedArray;
    }

    public j(Context context, LocationManager locationManager) {
        this.f79a = 5;
        this.d = new H();
        this.f80b = context;
        this.f81c = locationManager;
    }

    public j(C0276e c0276e) {
        this.f79a = 9;
        this.f80b = new ArrayList();
        this.f81c = new C0279b();
        this.d = c0276e;
    }

    public j(T0.g gVar, L0.e eVar, V.d dVar, Set set) {
        this.f79a = 3;
        this.f80b = eVar;
        this.f81c = gVar;
        this.d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            u(str, 0, str.length(), 1, true, new E.g(14, str));
        }
    }
}
