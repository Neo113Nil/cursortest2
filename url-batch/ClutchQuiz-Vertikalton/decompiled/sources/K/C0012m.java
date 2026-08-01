package K;

import a0.AbstractC0058b;
import a0.C0059c;
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
import b0.C0082b;
import f0.C0096b;
import f0.C0118y;
import g.C0126G;
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
import l.C0199S;
import l.C0239t;
import s.C0340d;
import s.C0341e;
import t.C0344b;
import v.C0367f;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m {

    /* renamed from: e, reason: collision with root package name */
    public static C0012m f420e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    /* renamed from: b, reason: collision with root package name */
    public Object f422b;

    /* renamed from: c, reason: collision with root package name */
    public Object f423c;
    public Object d;

    public /* synthetic */ C0012m() {
        this.f421a = 7;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        T.A[] aArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (aArr = (T.A[]) editable.getSpans(selectionStart, selectionEnd, T.A.class)) != null && aArr.length > 0) {
            for (T.A a2 : aArr) {
                int spanStart = editable.getSpanStart(a2);
                int spanEnd = editable.getSpanEnd(a2);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0012m r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0012m(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(View view, int i, boolean z2) {
        RecyclerView recyclerView = ((C0118y) this.f422b).f2367a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0096b) this.f423c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0118y) this.f422b).f2367a;
        int childCount = i < 0 ? recyclerView.getChildCount() : k(i);
        ((C0096b) this.f423c).e(childCount, z2);
        if (z2) {
            p(view);
        }
        f0.W I2 = RecyclerView.I(view);
        if (I2 != null) {
            if (!I2.k() && !I2.p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I2 + recyclerView.y());
            }
            I2.f2199j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void d(int i) {
        f0.W I2;
        int k2 = k(i);
        ((C0096b) this.f423c).f(k2);
        RecyclerView recyclerView = ((C0118y) this.f422b).f2367a;
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
        return ((C0118y) this.f422b).f2367a.getChildAt(k(i));
    }

    public int f() {
        return ((C0118y) this.f422b).f2367a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList F;
        TypedArray typedArray = (TypedArray) this.f423c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (F = A.c.F((Context) this.f422b, resourceId)) == null) ? typedArray.getColorStateList(i) : F;
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f423c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : T.d.t((Context) this.f422b, resourceId);
    }

    public Drawable i(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.f423c).hasValue(i) || (resourceId = ((TypedArray) this.f423c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0239t a2 = C0239t.a();
        Context context = (Context) this.f422b;
        synchronized (a2) {
            d = a2.f3050a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface j(int i, int i2, C0199S c0199s) {
        int resourceId = ((TypedArray) this.f423c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.r.f69a;
        Context context = (Context) this.f422b;
        if (context.isRestricted()) {
            return null;
        }
        return B.r.b(context, resourceId, typedValue, i2, c0199s, true, false);
    }

    public int k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0118y) this.f422b).f2367a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0096b c0096b = (C0096b) this.f423c;
            int b2 = i - (i2 - c0096b.b(i2));
            if (b2 == 0) {
                while (c0096b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public View l(int i) {
        return ((C0118y) this.f422b).f2367a.getChildAt(i);
    }

    public int m() {
        return ((C0118y) this.f422b).f2367a.getChildCount();
    }

    public androidx.lifecycle.O n(g1.c cVar, String str) {
        boolean isInstance;
        androidx.lifecycle.O a2;
        g1.f.e(str, "key");
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) this.f422b;
        q2.getClass();
        LinkedHashMap linkedHashMap = q2.f1490a;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) linkedHashMap.get(str);
        Class cls = cVar.f2566a;
        g1.f.e(cls, "jClass");
        Map map = g1.c.f2564b;
        g1.f.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = g1.l.b(num.intValue(), o2);
        } else {
            if (cls.isPrimitive()) {
                cls = T.d.x(g1.j.a(cls));
            }
            isInstance = cls.isInstance(o2);
        }
        androidx.lifecycle.P p2 = (androidx.lifecycle.P) this.f423c;
        if (isInstance) {
            if (p2 instanceof androidx.lifecycle.N) {
                g1.f.b(o2);
            }
            g1.f.c(o2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return o2;
        }
        C0059c c0059c = new C0059c((AbstractC0058b) this.d);
        c0059c.f1243a.put(C0082b.f1701a, str);
        try {
            try {
                p2.getClass();
                a2 = p2.b(T.d.w(cVar), c0059c);
            } catch (AbstractMethodError unused) {
                a2 = p2.a(T.d.w(cVar));
            }
        } catch (AbstractMethodError unused2) {
            a2 = p2.b(T.d.w(cVar), c0059c);
        }
        g1.f.e(a2, "viewModel");
        androidx.lifecycle.O o3 = (androidx.lifecycle.O) linkedHashMap.put(str, a2);
        if (o3 != null) {
            o3.a();
        }
        return a2;
    }

    public boolean o(CharSequence charSequence, int i, int i2, T.z zVar) {
        if ((zVar.f854c & 3) == 0) {
            T.e eVar = (T.e) this.d;
            U.a c2 = zVar.c();
            int a2 = c2.a(8);
            if (a2 != 0) {
                ((ByteBuffer) c2.d).getShort(a2 + c2.f355a);
            }
            eVar.getClass();
            ThreadLocal threadLocal = T.e.f806b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = eVar.f807a;
            String sb2 = sb.toString();
            int i3 = C.f.f97a;
            boolean a3 = C.e.a(textPaint, sb2);
            int i4 = zVar.f854c & 4;
            zVar.f854c = a3 ? i4 | 2 : i4 | 1;
        }
        return (zVar.f854c & 3) == 2;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        C0118y c0118y = (C0118y) this.f422b;
        f0.W I2 = RecyclerView.I(view);
        if (I2 != null) {
            int i = I2.f2206q;
            View view2 = I2.f2193a;
            if (i != -1) {
                I2.f2205p = i;
            } else {
                WeakHashMap weakHashMap = S.f365a;
                I2.f2205p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0118y.f2367a;
            if (recyclerView.L()) {
                I2.f2206q = 4;
                recyclerView.f1608p0.add(I2);
            } else {
                WeakHashMap weakHashMap2 = S.f365a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i, C0340d c0340d, C0367f c0367f) {
        int[] iArr = c0340d.f3549p0;
        int i2 = iArr[0];
        C0344b c0344b = (C0344b) this.f423c;
        c0344b.f3675a = i2;
        c0344b.f3676b = iArr[1];
        c0344b.f3677c = c0340d.q();
        c0344b.d = c0340d.k();
        c0344b.i = false;
        c0344b.f3681j = i;
        boolean z2 = c0344b.f3675a == 3;
        boolean z3 = c0344b.f3676b == 3;
        boolean z4 = z2 && c0340d.f3518W > 0.0f;
        boolean z5 = z3 && c0340d.f3518W > 0.0f;
        int[] iArr2 = c0340d.f3553t;
        if (z4 && iArr2[0] == 4) {
            c0344b.f3675a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c0344b.f3676b = 1;
        }
        c0367f.b(c0340d, c0344b);
        c0340d.O(c0344b.f3678e);
        c0340d.L(c0344b.f3679f);
        c0340d.f3501E = c0344b.h;
        c0340d.I(c0344b.f3680g);
        c0344b.f3681j = 0;
        return c0344b.i;
    }

    public Object s(CharSequence charSequence, int i, int i2, int i3, boolean z2, T.q qVar) {
        int i4;
        char c2;
        T.s sVar = new T.s((T.v) ((T.w) this.f423c).f847c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = sVar.f834c.f843a;
                T.v vVar = sparseArray == null ? null : (T.v) sparseArray.get(codePointAt);
                if (sVar.f832a == 2) {
                    if (vVar != null) {
                        sVar.f834c = vVar;
                        sVar.f836f++;
                    } else {
                        if (codePointAt == 65038) {
                            sVar.a();
                        } else if (codePointAt != 65039) {
                            T.v vVar2 = sVar.f834c;
                            if (vVar2.f844b != null) {
                                if (sVar.f836f != 1) {
                                    sVar.d = vVar2;
                                    sVar.a();
                                } else if (sVar.b()) {
                                    sVar.d = sVar.f834c;
                                    sVar.a();
                                } else {
                                    sVar.a();
                                }
                                c2 = 3;
                            } else {
                                sVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (vVar == null) {
                    sVar.a();
                    c2 = 1;
                } else {
                    sVar.f832a = 2;
                    sVar.f834c = vVar;
                    sVar.f836f = 1;
                    c2 = 2;
                }
                sVar.f835e = codePointAt;
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
                    if (z2 || !o(charSequence, i4, i6, sVar.d.f844b)) {
                        z3 = qVar.b(charSequence, i4, i6, sVar.d.f844b);
                        i5++;
                    }
                }
            }
        }
        if (sVar.f832a == 2 && sVar.f834c.f844b != null && ((sVar.f836f > 1 || sVar.b()) && i5 < i3 && z3 && (z2 || !o(charSequence, i4, i6, sVar.f834c.f844b)))) {
            qVar.b(charSequence, i4, i6, sVar.f834c.f844b);
        }
        return qVar.a();
    }

    public void t() {
        ((TypedArray) this.f423c).recycle();
    }

    public String toString() {
        switch (this.f421a) {
            case 4:
                return ((C0096b) this.f423c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(C0341e c0341e, int i, int i2, int i3) {
        int i4 = c0341e.f3525b0;
        int i5 = c0341e.f3527c0;
        c0341e.f3525b0 = 0;
        c0341e.f3527c0 = 0;
        c0341e.O(i2);
        c0341e.L(i3);
        if (i4 < 0) {
            c0341e.f3525b0 = 0;
        } else {
            c0341e.f3525b0 = i4;
        }
        if (i5 < 0) {
            c0341e.f3527c0 = 0;
        } else {
            c0341e.f3527c0 = i5;
        }
        C0341e c0341e2 = (C0341e) this.d;
        c0341e2.f3572t0 = i;
        c0341e2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0118y c0118y = (C0118y) this.f422b;
            f0.W I2 = RecyclerView.I(view);
            if (I2 != null) {
                int i = I2.f2205p;
                RecyclerView recyclerView = c0118y.f2367a;
                if (recyclerView.L()) {
                    I2.f2206q = i;
                    recyclerView.f1608p0.add(I2);
                } else {
                    WeakHashMap weakHashMap = S.f365a;
                    I2.f2193a.setImportantForAccessibility(i);
                }
                I2.f2205p = 0;
            }
        }
    }

    public void w(C0341e c0341e) {
        ArrayList arrayList = (ArrayList) this.f422b;
        arrayList.clear();
        int size = c0341e.q0.size();
        for (int i = 0; i < size; i++) {
            C0340d c0340d = (C0340d) c0341e.q0.get(i);
            int[] iArr = c0340d.f3549p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0340d);
            }
        }
        c0341e.f3571s0.f3685b = true;
    }

    public C0012m(androidx.lifecycle.Q q2, androidx.lifecycle.P p2, AbstractC0058b abstractC0058b) {
        this.f421a = 3;
        g1.f.e(q2, "store");
        g1.f.e(abstractC0058b, "extras");
        this.f422b = q2;
        this.f423c = p2;
        this.d = abstractC0058b;
    }

    public C0012m(C0118y c0118y) {
        this.f421a = 4;
        this.f422b = c0118y;
        this.f423c = new C0096b();
        this.d = new ArrayList();
    }

    public C0012m(Method method, Method method2, Method method3) {
        this.f421a = 2;
        this.f422b = method;
        this.f423c = method2;
        this.d = method3;
    }

    public C0012m(Runnable runnable) {
        this.f421a = 0;
        this.f423c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f422b = runnable;
    }

    public C0012m(Context context, TypedArray typedArray) {
        this.f421a = 6;
        this.f422b = context;
        this.f423c = typedArray;
    }

    public C0012m(Context context, LocationManager locationManager) {
        this.f421a = 5;
        this.d = new C0126G();
        this.f422b = context;
        this.f423c = locationManager;
    }

    public C0012m(C0341e c0341e) {
        this.f421a = 8;
        this.f422b = new ArrayList();
        this.f423c = new C0344b();
        this.d = c0341e;
    }

    public C0012m(T.w wVar, O0.e eVar, T.e eVar2, Set set) {
        this.f421a = 1;
        this.f422b = eVar;
        this.f423c = wVar;
        this.d = eVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            s(str, 0, str.length(), 1, true, new T.r(str, 0));
        }
    }
}
