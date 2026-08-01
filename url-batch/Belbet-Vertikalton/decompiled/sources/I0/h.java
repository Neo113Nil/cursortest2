package I0;

import D.q;
import V.p;
import V.r;
import V.u;
import V.v;
import V.y;
import V.z;
import a.AbstractC0058a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.RecyclerView;
import c0.AbstractC0102b;
import c0.C0103c;
import h.H;
import h0.C0173x;
import h0.V;
import j1.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n.C0302u;
import n.T;
import u.C0387d;
import u.C0388e;
import v.C0393b;
import x.C0415f;

/* loaded from: classes.dex */
public final class h {
    public static h e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* renamed from: b, reason: collision with root package name */
    public Object f591b;

    /* renamed from: c, reason: collision with root package name */
    public Object f592c;

    /* renamed from: d, reason: collision with root package name */
    public Object f593d;

    public /* synthetic */ h() {
        this.f590a = 7;
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

    public static h r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new h(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0173x) this.f591b).f3135a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((F1.a) this.f592c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0173x) this.f591b).f3135a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((F1.a) this.f592c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        V I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        V I2;
        int k2 = k(i);
        ((F1.a) this.f592c).g(k2);
        RecyclerView recyclerView = ((C0173x) this.f591b).f3135a;
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
        return ((C0173x) this.f591b).f3135a.getChildAt(k(i));
    }

    public int f() {
        return ((C0173x) this.f591b).f3135a.getChildCount() - ((ArrayList) this.f593d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList v2;
        TypedArray typedArray = (TypedArray) this.f592c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (v2 = H1.l.v((Context) this.f591b, resourceId)) == null) ? typedArray.getColorStateList(i) : v2;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f592c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : H1.d.F((Context) this.f591b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.f592c).hasValue(i) || (resourceId = ((TypedArray) this.f592c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0302u a2 = C0302u.a();
        Context context = (Context) this.f591b;
        synchronized (a2) {
            d2 = a2.f3717a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface j(int i, int i2, T t2) {
        int resourceId = ((TypedArray) this.f592c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f593d) == null) {
            this.f593d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f593d;
        ThreadLocal threadLocal = q.f192a;
        Context context = (Context) this.f591b;
        if (context.isRestricted()) {
            return null;
        }
        return q.b(context, resourceId, typedValue, i2, t2, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0173x) this.f591b).f3135a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            F1.a aVar = (F1.a) this.f592c;
            int b2 = i - (i2 - aVar.b(i2));
            if (b2 == 0) {
                while (aVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0173x) this.f591b).f3135a.getChildAt(i);
    }

    public int m() {
        return ((C0173x) this.f591b).f3135a.getChildCount();
    }

    public O n(j1.d dVar, String str) {
        boolean isInstance;
        O a2;
        j1.h.e(str, "key");
        Q q2 = (Q) this.f591b;
        q2.getClass();
        LinkedHashMap linkedHashMap = q2.f1921a;
        O o2 = (O) linkedHashMap.get(str);
        Class cls = dVar.f3178a;
        j1.h.e(cls, "jClass");
        Map map = j1.d.f3175b;
        j1.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = n.b(num.intValue(), o2);
        } else {
            if (cls.isPrimitive()) {
                cls = AbstractC0058a.y(j1.l.a(cls));
            }
            isInstance = cls.isInstance(o2);
        }
        P p2 = (P) this.f592c;
        if (isInstance) {
            if (p2 instanceof N) {
                j1.h.b(o2);
            }
            j1.h.c(o2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return o2;
        }
        C0103c c0103c = new C0103c((AbstractC0102b) this.f593d);
        c0103c.f2228a.put(d0.b.f2650a, str);
        try {
            try {
                p2.getClass();
                a2 = p2.b(AbstractC0058a.x(dVar), c0103c);
            } catch (AbstractMethodError unused) {
                a2 = p2.a(AbstractC0058a.x(dVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = p2.b(AbstractC0058a.x(dVar), c0103c);
        }
        j1.h.e(a2, "viewModel");
        O o3 = (O) linkedHashMap.put(str, a2);
        if (o3 != null) {
            o3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, y yVar) {
        if ((yVar.f1316c & 3) == 0) {
            V.d dVar = (V.d) this.f593d;
            W.a c2 = yVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.f702d).getShort(a2 + c2.f699a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = V.d.f1266b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = dVar.f1267a;
            String sb2 = sb.toString();
            int i3 = E.e.f283a;
            boolean a3 = E.d.a(textPaint, sb2);
            int i4 = yVar.f1316c & 4;
            yVar.f1316c = a3 ? i4 | 2 : i4 | 1;
        }
        return (yVar.f1316c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.f593d).add(view);
        C0173x c0173x = (C0173x) this.f591b;
        V I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2971q;
            View view2 = I2.f2958a;
            if (i != -1) {
                I2.f2970p = i;
            } else {
                WeakHashMap weakHashMap = M.P.f711a;
                I2.f2970p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0173x.f3135a;
            if (recyclerView.L()) {
                I2.f2971q = 4;
                recyclerView.f2039p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = M.P.f711a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0387d c0387d, C0415f c0415f) {
        int[] iArr = c0387d.f4281p0;
        int i2 = iArr[0];
        C0393b c0393b = (C0393b) this.f592c;
        c0393b.f4399a = i2;
        c0393b.f4400b = iArr[1];
        c0393b.f4401c = c0387d.q();
        c0393b.f4402d = c0387d.k();
        c0393b.i = false;
        c0393b.j = i;
        boolean z2 = c0393b.f4399a == 3;
        boolean z3 = c0393b.f4400b == 3;
        boolean z4 = z2 && c0387d.f4250W > 0.0f;
        boolean z5 = z3 && c0387d.f4250W > 0.0f;
        int[] iArr2 = c0387d.f4285t;
        if (z4 && iArr2[0] == 4) {
            c0393b.f4399a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0393b.f4400b = 1;
        }
        c0415f.b(c0387d, c0393b);
        c0387d.O(c0393b.e);
        c0387d.L(c0393b.f4403f);
        c0387d.f4233E = c0393b.f4405h;
        c0387d.I(c0393b.f4404g);
        c0393b.j = 0;
        return c0393b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, p pVar) {
        int i4;
        char c2;
        r rVar = new r((u) ((v) this.f592c).f1307c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = rVar.f1292c.f1303a;
                u uVar = sparseArray == null ? null : (u) sparseArray.get(codePointAt);
                if (rVar.f1290a == 2) {
                    if (uVar != null) {
                        rVar.f1292c = uVar;
                        rVar.f1294f++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            u uVar2 = rVar.f1292c;
                            if (uVar2.f1304b != null) {
                                if (rVar.f1294f != 1) {
                                    rVar.f1293d = uVar2;
                                    rVar.a();
                                } else if (rVar.b()) {
                                    rVar.f1293d = rVar.f1292c;
                                    rVar.a();
                                } else {
                                    rVar.a();
                                }
                                c2 = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (uVar == null) {
                    rVar.a();
                    c2 = 1;
                } else {
                    rVar.f1290a = 2;
                    rVar.f1292c = uVar;
                    rVar.f1294f = 1;
                    c2 = 2;
                }
                rVar.e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, rVar.f1293d.f1304b)) {
                        z3 = pVar.a(charSequence, i4, i6, rVar.f1293d.f1304b);
                        i5++;
                    }
                }
            }
        }
        if (rVar.f1290a == 2 && rVar.f1292c.f1304b != null && ((rVar.f1294f > 1 || rVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, rVar.f1292c.f1304b)))) {
            pVar.a(charSequence, i4, i6, rVar.f1292c.f1304b);
        }
        return pVar.b();
    }

    public void t() {
        ((TypedArray) this.f592c).recycle();
    }

    public String toString() {
        switch (this.f590a) {
            case 5:
                return ((F1.a) this.f592c).toString() + ", hidden list:" + ((ArrayList) this.f593d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0388e c0388e, int i, int i2, int i3) {
        int i4 = c0388e.f4257b0;
        int i5 = c0388e.f4259c0;
        c0388e.f4257b0 = 0;
        c0388e.f4259c0 = 0;
        c0388e.O(i2);
        c0388e.L(i3);
        if (i4 < 0) {
            c0388e.f4257b0 = 0;
        } else {
            c0388e.f4257b0 = i4;
        }
        if (i5 < 0) {
            c0388e.f4259c0 = 0;
        } else {
            c0388e.f4259c0 = i5;
        }
        C0388e c0388e2 = (C0388e) this.f593d;
        c0388e2.f4305t0 = i;
        c0388e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.f593d).remove(view)) {
            C0173x c0173x = (C0173x) this.f591b;
            V I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2970p;
                RecyclerView recyclerView = c0173x.f3135a;
                if (recyclerView.L()) {
                    I2.f2971q = i;
                    recyclerView.f2039p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = M.P.f711a;
                    I2.f2958a.setImportantForAccessibility(i);
                }
                I2.f2970p = 0;
            }
        }
    }

    public void w(C0388e c0388e) {
        ArrayList arrayList = (ArrayList) this.f591b;
        arrayList.clear();
        int size = c0388e.f4303q0.size();
        for (int i = 0; i < size; i++) {
            C0387d c0387d = (C0387d) c0388e.f4303q0.get(i);
            int[] iArr = c0387d.f4281p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0387d);
            }
        }
        c0388e.s0.f4409b = true;
    }

    public h(Q q2, P p2, AbstractC0102b abstractC0102b) {
        this.f590a = 3;
        j1.h.e(q2, "store");
        j1.h.e(abstractC0102b, "extras");
        this.f591b = q2;
        this.f592c = p2;
        this.f593d = abstractC0102b;
    }

    public h(C0173x c0173x) {
        this.f590a = 5;
        this.f591b = c0173x;
        this.f592c = new F1.a();
        this.f593d = new ArrayList();
    }

    public h(b bVar, View view) {
        Object eVar;
        this.f590a = 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            eVar = new g();
        } else {
            eVar = i >= 33 ? new e() : null;
        }
        this.f591b = eVar;
        this.f592c = bVar;
        this.f593d = view;
    }

    public h(Runnable runnable) {
        this.f590a = 1;
        this.f592c = new CopyOnWriteArrayList();
        this.f593d = new HashMap();
        this.f591b = runnable;
    }

    public h(Context context, TypedArray typedArray) {
        this.f590a = 6;
        this.f591b = context;
        this.f592c = typedArray;
    }

    public h(Context context, LocationManager locationManager) {
        this.f590a = 4;
        this.f593d = new H();
        this.f591b = context;
        this.f592c = locationManager;
    }

    public h(C0388e c0388e) {
        this.f590a = 8;
        this.f591b = new ArrayList();
        this.f592c = new C0393b();
        this.f593d = c0388e;
    }

    public h(v vVar, N0.e eVar, V.d dVar, Set set) {
        this.f590a = 2;
        this.f591b = eVar;
        this.f592c = vVar;
        this.f593d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new V.q(str, 0));
        }
    }
}
