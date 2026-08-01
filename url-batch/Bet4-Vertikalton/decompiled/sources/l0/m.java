package l0;

import K.C0003b0;
import K.H;
import K.T;
import K.g0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3080w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3081x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final J0.e f3082y = new J0.e(24);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3083z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3091k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3092l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f3093m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3084a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3085b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3086c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3087e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3088f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public U.u f3089g = new U.u(4);
    public U.u h = new U.u(4);
    public C0253a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3090j = f3081x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3094n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3095o = f3080w;

    /* renamed from: p, reason: collision with root package name */
    public int f3096p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3097q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3098r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f3099s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3100t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3101u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public J0.e f3102v = f3082y;

    public static void b(U.u uVar, View view, u uVar2) {
        ((o.b) uVar.f874a).put(view, uVar2);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) uVar.f875b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f423a;
        String k2 = H.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) uVar.d;
            if (bVar.containsKey(k2)) {
                bVar.put(k2, null);
            } else {
                bVar.put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                o.e eVar = (o.e) uVar.f876c;
                if (eVar.f3224a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3225b, eVar.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    eVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) eVar.c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    eVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static o.b p() {
        ThreadLocal threadLocal = f3083z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f3113a.get(str);
        Object obj2 = uVar2.f3113a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3086c = j2;
    }

    public void B(h1.d dVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(J0.e eVar) {
        if (eVar == null) {
            this.f3102v = f3082y;
        } else {
            this.f3102v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3085b = j2;
    }

    public final void G() {
        if (this.f3096p == 0) {
            v(this, l.f3076a);
            this.f3098r = false;
        }
        this.f3096p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3086c != -1) {
            sb.append("dur(");
            sb.append(this.f3086c);
            sb.append(") ");
        }
        if (this.f3085b != -1) {
            sb.append("dly(");
            sb.append(this.f3085b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3087e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3088f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(k kVar) {
        if (this.f3100t == null) {
            this.f3100t = new ArrayList();
        }
        this.f3100t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f3094n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3095o);
        this.f3095o = f3080w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3095o = animatorArr;
        v(this, l.f3078c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            u uVar = new u(view);
            if (z2) {
                g(uVar);
            } else {
                d(uVar);
            }
            uVar.f3115c.add(this);
            f(uVar);
            if (z2) {
                b(this.f3089g, view, uVar);
            } else {
                b(this.h, view, uVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(u uVar) {
    }

    public abstract void g(u uVar);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f3087e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3088f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                u uVar = new u(findViewById);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f3115c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f3089g, findViewById, uVar);
                } else {
                    b(this.h, findViewById, uVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            u uVar2 = new u(view);
            if (z2) {
                g(uVar2);
            } else {
                d(uVar2);
            }
            uVar2.f3115c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f3089g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f3089g.f874a).clear();
            ((SparseArray) this.f3089g.f875b).clear();
            ((o.e) this.f3089g.f876c).a();
        } else {
            ((o.b) this.h.f874a).clear();
            ((SparseArray) this.h.f875b).clear();
            ((o.e) this.h.f876c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f3101u = new ArrayList();
            mVar.f3089g = new U.u(4);
            mVar.h = new U.u(4);
            mVar.f3091k = null;
            mVar.f3092l = null;
            mVar.f3099s = this;
            mVar.f3100t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, U.u uVar, U.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        u uVar3;
        Animator animator;
        u uVar4;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            u uVar5 = (u) arrayList.get(i2);
            u uVar6 = (u) arrayList2.get(i2);
            if (uVar5 != null && !uVar5.f3115c.contains(this)) {
                uVar5 = null;
            }
            if (uVar6 != null && !uVar6.f3115c.contains(this)) {
                uVar6 = null;
            }
            if ((uVar5 != null || uVar6 != null) && (uVar5 == null || uVar6 == null || s(uVar5, uVar6))) {
                Animator k2 = k(frameLayout, uVar5, uVar6);
                if (k2 != null) {
                    String str = this.f3084a;
                    if (uVar6 != null) {
                        String[] q2 = q();
                        view = uVar6.f3114b;
                        if (q2 != null && q2.length > 0) {
                            uVar4 = new u(view);
                            u uVar7 = (u) ((o.b) uVar2.f874a).getOrDefault(view, null);
                            i = size;
                            if (uVar7 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar4.f3113a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar7.f3113a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3246c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f3073c != null && jVar.f3071a == view && jVar.f3072b.equals(str) && jVar.f3073c.equals(uVar4)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            uVar4 = null;
                        }
                        k2 = animator;
                        uVar3 = uVar4;
                    } else {
                        i = size;
                        view = uVar5.f3114b;
                        uVar3 = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f3071a = view;
                        jVar2.f3072b = str;
                        jVar2.f3073c = uVar3;
                        jVar2.d = windowId;
                        jVar2.f3074e = this;
                        jVar2.f3075f = k2;
                        p2.put(k2, jVar2);
                        this.f3101u.add(k2);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                j jVar3 = (j) p2.getOrDefault((Animator) this.f3101u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f3075f.setStartDelay(jVar3.f3075f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3096p - 1;
        this.f3096p = i;
        if (i == 0) {
            v(this, l.f3077b);
            for (int i2 = 0; i2 < ((o.e) this.f3089g.f876c).e(); i2++) {
                View view = (View) ((o.e) this.f3089g.f876c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f876c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f876c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3098r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0253a c0253a = this.i;
        if (c0253a != null) {
            return c0253a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3091k : this.f3092l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            u uVar = (u) arrayList.get(i);
            if (uVar == null) {
                return null;
            }
            if (uVar.f3114b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f3092l : this.f3091k).get(i);
        }
        return null;
    }

    public final m o() {
        C0253a c0253a = this.i;
        return c0253a != null ? c0253a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0253a c0253a = this.i;
        if (c0253a != null) {
            return c0253a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f3089g : this.h).f874a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f3113a.keySet().iterator();
            while (it.hasNext()) {
                if (u(uVar, uVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(uVar, uVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3087e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3088f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f3099s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f3100t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3100t.size();
        k[] kVarArr = this.f3093m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f3093m = null;
        k[] kVarArr2 = (k[]) this.f3100t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f3093m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3098r) {
            return;
        }
        ArrayList arrayList = this.f3094n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3095o);
        this.f3095o = f3080w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3095o = animatorArr;
        v(this, l.d);
        this.f3097q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f3100t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f3099s) != null) {
            mVar.x(kVar);
        }
        if (this.f3100t.size() == 0) {
            this.f3100t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3097q) {
            if (!this.f3098r) {
                ArrayList arrayList = this.f3094n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3095o);
                this.f3095o = f3080w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3095o = animatorArr;
                v(this, l.f3079e);
            }
            this.f3097q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f3101u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new g0(this, p2));
                    long j2 = this.f3086c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3085b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0003b0(3, this));
                    animator.start();
                }
            }
        }
        this.f3101u.clear();
        m();
    }
}
