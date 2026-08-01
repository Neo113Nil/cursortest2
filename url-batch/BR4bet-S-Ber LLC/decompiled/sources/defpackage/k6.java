package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.moontiko.really.admiralcasino.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k6 implements dl {
    public static volatile k6 j;
    public static final Object k = new Object();
    public static k6 l;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;

    public k6(Context context, int i) {
        this.f = i;
        switch (i) {
            case 3:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b9.M(context, R.attr.materialCalendarStyle, pv.class.getCanonicalName()).data, y00.u);
                this.g = rc0.C(context, obtainStyledAttributes.getResourceId(4, 0));
                rc0.C(context, obtainStyledAttributes.getResourceId(2, 0));
                rc0.C(context, obtainStyledAttributes.getResourceId(3, 0));
                rc0.C(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList w = kr.w(context, obtainStyledAttributes, 7);
                this.h = rc0.C(context, obtainStyledAttributes.getResourceId(9, 0));
                rc0.C(context, obtainStyledAttributes.getResourceId(8, 0));
                this.i = rc0.C(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(w.getDefaultColor());
                obtainStyledAttributes.recycle();
                break;
            default:
                this.i = context.getApplicationContext();
                this.h = new HashSet();
                this.g = new HashMap();
                break;
        }
    }

    public static boolean h(Editable editable, KeyEvent keyEvent, boolean z) {
        ta0[] ta0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ta0VarArr = (ta0[]) editable.getSpans(selectionStart, selectionEnd, ta0.class)) != null && ta0VarArr.length > 0) {
                for (ta0 ta0Var : ta0VarArr) {
                    int spanStart = editable.getSpanStart(ta0Var);
                    int spanEnd = editable.getSpanEnd(ta0Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static k6 r(Context context) {
        if (j == null) {
            synchronized (k) {
                try {
                    if (j == null) {
                        j = new k6(context, 0);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public static k6 z(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new k6(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public Object A(CharSequence charSequence, int i, int i2, int i3, boolean z, wj wjVar) {
        int i4;
        char c;
        yj yjVar = new yj((jx) ((rg) this.h).h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = yjVar.c.a;
                jx jxVar = sparseArray == null ? null : (jx) sparseArray.get(codePointAt);
                if (yjVar.a == 2) {
                    if (jxVar != null) {
                        yjVar.c = jxVar;
                        yjVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            yjVar.a();
                        } else if (codePointAt != 65039) {
                            jx jxVar2 = yjVar.c;
                            if (jxVar2.b != null) {
                                if (yjVar.f != 1) {
                                    yjVar.d = jxVar2;
                                    yjVar.a();
                                } else if (yjVar.b()) {
                                    yjVar.d = yjVar.c;
                                    yjVar.a();
                                } else {
                                    yjVar.a();
                                }
                                c = 3;
                            } else {
                                yjVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (jxVar == null) {
                    yjVar.a();
                    c = 1;
                } else {
                    yjVar.a = 2;
                    yjVar.c = jxVar;
                    yjVar.f = 1;
                    c = 2;
                }
                yjVar.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !w(charSequence, i4, i6, yjVar.d.b)) {
                        z2 = wjVar.f(charSequence, i4, i6, yjVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (yjVar.a == 2 && yjVar.c.b != null && ((yjVar.f > 1 || yjVar.b()) && i5 < i3 && z2 && (z || !w(charSequence, i4, i6, yjVar.c.b)))) {
            wjVar.f(charSequence, i4, i6, yjVar.c.b);
        }
        return wjVar.a();
    }

    public void B() {
        ((TypedArray) this.g).recycle();
    }

    public void C(be beVar, int i, int i2, int i3) {
        beVar.getClass();
        int i4 = beVar.b0;
        int i5 = beVar.c0;
        beVar.b0 = 0;
        beVar.c0 = 0;
        beVar.O(i2);
        beVar.L(i3);
        if (i4 < 0) {
            beVar.b0 = 0;
        } else {
            beVar.b0 = i4;
        }
        if (i5 < 0) {
            beVar.c0 = 0;
        } else {
            beVar.c0 = i5;
        }
        be beVar2 = (be) this.i;
        beVar2.t0 = i;
        beVar2.U();
    }

    public void D(View view) {
        if (((ArrayList) this.i).remove(view)) {
            s10 s10Var = (s10) this.g;
            q20 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = s10Var.a;
                int i = I.p;
                if (recyclerView.L()) {
                    I.q = i;
                    recyclerView.x0.add(I);
                } else {
                    View view2 = I.a;
                    WeakHashMap weakHashMap = ic0.a;
                    view2.setImportantForAccessibility(i);
                }
                I.p = 0;
            }
        }
    }

    public void E(be beVar) {
        ArrayList arrayList = (ArrayList) this.g;
        arrayList.clear();
        int size = beVar.q0.size();
        for (int i = 0; i < size; i++) {
            ae aeVar = (ae) beVar.q0.get(i);
            int[] iArr = aeVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(aeVar);
            }
        }
        beVar.s0.b = true;
    }

    public void a(View view, int i, boolean z) {
        RecyclerView recyclerView = ((s10) this.g).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : s(i);
        ((ra) this.h).e(childCount, z);
        if (z) {
            x(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    @Override // defpackage.dl
    public int b() {
        int i = ((ExtendedFloatingActionButton) this.i).n0;
        return i == -1 ? ((a5) this.g).b() : (i == 0 || i == -2) ? ((zk) this.h).g.getMeasuredHeight() : i;
    }

    @Override // defpackage.dl
    public int c() {
        return ((ExtendedFloatingActionButton) this.i).g0;
    }

    @Override // defpackage.dl
    public int d() {
        return ((ExtendedFloatingActionButton) this.i).f0;
    }

    @Override // defpackage.dl
    public int e() {
        int i = ((ExtendedFloatingActionButton) this.i).m0;
        return i == -1 ? ((a5) this.g).e() : (i == 0 || i == -2) ? ((zk) this.h).e() : i;
    }

    public void f(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((s10) this.g).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : s(i);
        ((ra) this.h).e(childCount, z);
        if (z) {
            x(view);
        }
        q20 I = RecyclerView.I(view);
        if (I != null) {
            if (!I.j() && !I.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
            I.j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    @Override // defpackage.dl
    public ViewGroup.LayoutParams g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.i;
        int i = extendedFloatingActionButton.m0;
        if (i == 0) {
            i = -2;
        }
        int i2 = extendedFloatingActionButton.n0;
        return new ViewGroup.LayoutParams(i, i2 != 0 ? i2 : -2);
    }

    public void i(int i) {
        q20 I;
        int s = s(i);
        ((ra) this.h).g(s);
        RecyclerView recyclerView = ((s10) this.g).a;
        View childAt = recyclerView.getChildAt(s);
        if (childAt != null && (I = RecyclerView.I(childAt)) != null) {
            if (I.j() && !I.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
            I.a(256);
        }
        recyclerView.detachViewFromParent(s);
    }

    public void j(Bundle bundle) {
        HashSet hashSet = (HashSet) this.h;
        String string = ((Context) this.i).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (br.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    k((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new lc(e);
            }
        }
    }

    public Object k(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.g;
        if (mz.y()) {
            try {
                mz.f(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                br brVar = (br) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = brVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            k(cls2, hashSet);
                        }
                    }
                }
                obj = brVar.b((Context) this.i);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new lc(th);
            }
        }
        return obj;
    }

    public View l(int i) {
        return ((s10) this.g).a.getChildAt(s(i));
    }

    public int m() {
        return ((s10) this.g).a.getChildCount() - ((ArrayList) this.i).size();
    }

    public ColorStateList n(int i) {
        int resourceId;
        ColorStateList w;
        TypedArray typedArray = (TypedArray) this.g;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (w = la0.w((Context) this.i, resourceId)) == null) ? typedArray.getColorStateList(i) : w;
    }

    public Drawable o(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.g;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : mz.m((Context) this.i, resourceId);
    }

    public Drawable p(int i) {
        int resourceId;
        Drawable d;
        if (!((TypedArray) this.g).hasValue(i) || (resourceId = ((TypedArray) this.g).getResourceId(i, 0)) == 0) {
            return null;
        }
        r4 a = r4.a();
        Context context = (Context) this.i;
        synchronized (a) {
            d = a.a.d(context, resourceId, true);
        }
        return d;
    }

    public Typeface q(int i, int i2, s5 s5Var) {
        int resourceId = ((TypedArray) this.g).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.h) == null) {
            this.h = new TypedValue();
        }
        Context context = (Context) this.i;
        TypedValue typedValue = (TypedValue) this.h;
        ThreadLocal threadLocal = k30.a;
        if (context.isRestricted()) {
            return null;
        }
        return k30.a(context, resourceId, typedValue, i2, s5Var, true, false);
    }

    public int s(int i) {
        ra raVar = (ra) this.h;
        if (i < 0) {
            return -1;
        }
        int childCount = ((s10) this.g).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - raVar.b(i2));
            if (b == 0) {
                while (raVar.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public View t(int i) {
        return ((s10) this.g).a.getChildAt(i);
    }

    public String toString() {
        switch (this.f) {
            case 4:
                return ((ra) this.h).toString() + ", hidden list:" + ((ArrayList) this.i).size();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((s10) this.g).a.getChildCount();
    }

    public pc0 v(gb gbVar, String str) {
        boolean isInstance;
        pc0 b;
        sc0 sc0Var = (sc0) this.h;
        tc0 tc0Var = (tc0) this.g;
        tc0Var.getClass();
        LinkedHashMap linkedHashMap = tc0Var.a;
        pc0 pc0Var = (pc0) linkedHashMap.get(str);
        Class cls = gbVar.a;
        Map map = gb.b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = la0.K(num.intValue(), pc0Var);
        } else {
            if (cls.isPrimitive()) {
                cls = la0.B(u20.a(cls));
            }
            isInstance = cls.isInstance(pc0Var);
        }
        if (isInstance) {
            if (sc0Var instanceof o40) {
                pc0Var.getClass();
            }
            pc0Var.getClass();
            return pc0Var;
        }
        qx qxVar = new qx((nf) this.i);
        ((LinkedHashMap) qxVar.a).put(ej.r, str);
        try {
            try {
                b = sc0Var.r(gbVar, qxVar);
            } catch (AbstractMethodError unused) {
                b = sc0Var.b(gbVar.a());
            }
        } catch (AbstractMethodError unused2) {
            b = sc0Var.k(gbVar.a(), qxVar);
        }
        b.getClass();
        pc0 pc0Var2 = (pc0) linkedHashMap.put(str, b);
        if (pc0Var2 != null) {
            pc0Var2.a();
        }
        return b;
    }

    public boolean w(CharSequence charSequence, int i, int i2, sa0 sa0Var) {
        if ((sa0Var.c & 3) == 0) {
            dg dgVar = (dg) this.i;
            hx b = sa0Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            dgVar.getClass();
            ThreadLocal threadLocal = dg.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = dgVar.a.hasGlyph(sb.toString());
            int i3 = sa0Var.c & 4;
            sa0Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (sa0Var.c & 3) == 2;
    }

    public void x(View view) {
        ((ArrayList) this.i).add(view);
        s10 s10Var = (s10) this.g;
        q20 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.a;
            RecyclerView recyclerView = s10Var.a;
            int i = I.q;
            if (i != -1) {
                I.p = i;
            } else {
                WeakHashMap weakHashMap = ic0.a;
                I.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.q = 4;
                recyclerView.x0.add(I);
            } else {
                WeakHashMap weakHashMap2 = ic0.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean y(int i, qd qdVar, ae aeVar) {
        i8 i8Var = (i8) this.h;
        int[] iArr = aeVar.p0;
        int[] iArr2 = aeVar.t;
        i8Var.a = iArr[0];
        i8Var.b = iArr[1];
        i8Var.c = aeVar.q();
        i8Var.d = aeVar.k();
        i8Var.i = false;
        i8Var.j = i;
        boolean z = i8Var.a == 3;
        boolean z2 = i8Var.b == 3;
        boolean z3 = z && aeVar.W > 0.0f;
        boolean z4 = z2 && aeVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            i8Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            i8Var.b = 1;
        }
        qdVar.b(aeVar, i8Var);
        aeVar.O(i8Var.e);
        aeVar.L(i8Var.f);
        aeVar.E = i8Var.h;
        aeVar.I(i8Var.g);
        i8Var.j = 0;
        return i8Var.i;
    }

    public k6(tc0 tc0Var, sc0 sc0Var, nf nfVar) {
        this.f = 11;
        tc0Var.getClass();
        nfVar.getClass();
        this.g = tc0Var;
        this.h = sc0Var;
        this.i = nfVar;
    }

    public k6(s10 s10Var) {
        this.f = 4;
        this.g = s10Var;
        this.h = new ra();
        this.i = new ArrayList();
    }

    public k6(uu uuVar, View view) {
        Object vuVar;
        this.f = 7;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            vuVar = new xu();
        } else {
            vuVar = i >= 33 ? new vu() : null;
        }
        this.g = vuVar;
        this.h = uuVar;
        this.i = view;
    }

    public k6(Context context, TypedArray typedArray) {
        this.f = 9;
        this.i = context;
        this.g = typedArray;
    }

    public k6(Runnable runnable) {
        this.f = 8;
        this.i = new CopyOnWriteArrayList();
        this.g = new HashMap();
        this.h = runnable;
    }

    public k6(Context context, LocationManager locationManager) {
        this.f = 10;
        this.h = new ka0();
        this.i = context;
        this.g = locationManager;
    }

    public /* synthetic */ k6() {
        this.f = 2;
    }

    public k6(be beVar) {
        this.f = 1;
        this.g = new ArrayList();
        this.h = new i8();
        this.i = beVar;
    }

    public k6(rg rgVar, ej ejVar, dg dgVar, Set set) {
        this.f = 5;
        this.g = ejVar;
        this.h = rgVar;
        this.i = dgVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            A(str, 0, str.length(), 1, true, new xj(str, 0));
        }
    }

    public k6(ExtendedFloatingActionButton extendedFloatingActionButton, a5 a5Var, zk zkVar) {
        this.f = 6;
        this.i = extendedFloatingActionButton;
        this.g = a5Var;
        this.h = zkVar;
    }
}
