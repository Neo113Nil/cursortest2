package k0;

import K.S;
import K.Y;
import K.d0;
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
    public static final Animator[] f2720w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2721x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final I0.e f2722y = new I0.e(24);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2723z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2731k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2732l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f2733m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2724a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2725b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2726c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2727e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2728f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.u f2729g = new T.u(4);
    public T.u h = new T.u(4);
    public C0177a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2730j = f2721x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2734n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2735o = f2720w;

    /* renamed from: p, reason: collision with root package name */
    public int f2736p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2737q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2738r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f2739s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2740t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2741u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public I0.e f2742v = f2722y;

    public static void b(T.u uVar, View view, u uVar2) {
        ((o.b) uVar.f791a).put(view, uVar2);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) uVar.f792b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = S.f362a;
        String k2 = K.G.k(view);
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
                o.e eVar = (o.e) uVar.f793c;
                if (eVar.f3311a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3312b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f2723z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f2753a.get(str);
        Object obj2 = uVar2.f2753a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2726c = j2;
    }

    public void B(s1.d dVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(I0.e eVar) {
        if (eVar == null) {
            this.f2742v = f2722y;
        } else {
            this.f2742v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2725b = j2;
    }

    public final void G() {
        if (this.f2736p == 0) {
            v(this, l.f2716a);
            this.f2738r = false;
        }
        this.f2736p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2726c != -1) {
            sb.append("dur(");
            sb.append(this.f2726c);
            sb.append(") ");
        }
        if (this.f2725b != -1) {
            sb.append("dly(");
            sb.append(this.f2725b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2727e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2728f;
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
        if (this.f2740t == null) {
            this.f2740t = new ArrayList();
        }
        this.f2740t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f2734n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2735o);
        this.f2735o = f2720w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2735o = animatorArr;
        v(this, l.f2718c);
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
            uVar.f2755c.add(this);
            f(uVar);
            if (z2) {
                b(this.f2729g, view, uVar);
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
        ArrayList arrayList = this.f2727e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2728f;
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
                uVar.f2755c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f2729g, findViewById, uVar);
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
            uVar2.f2755c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f2729g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2729g.f791a).clear();
            ((SparseArray) this.f2729g.f792b).clear();
            ((o.e) this.f2729g.f793c).a();
        } else {
            ((o.b) this.h.f791a).clear();
            ((SparseArray) this.h.f792b).clear();
            ((o.e) this.h.f793c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f2741u = new ArrayList();
            mVar.f2729g = new T.u(4);
            mVar.h = new T.u(4);
            mVar.f2731k = null;
            mVar.f2732l = null;
            mVar.f2739s = this;
            mVar.f2740t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
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
            if (uVar5 != null && !uVar5.f2755c.contains(this)) {
                uVar5 = null;
            }
            if (uVar6 != null && !uVar6.f2755c.contains(this)) {
                uVar6 = null;
            }
            if ((uVar5 != null || uVar6 != null) && (uVar5 == null || uVar6 == null || s(uVar5, uVar6))) {
                Animator k2 = k(frameLayout, uVar5, uVar6);
                if (k2 != null) {
                    String str = this.f2724a;
                    if (uVar6 != null) {
                        String[] q2 = q();
                        view = uVar6.f2754b;
                        if (q2 != null && q2.length > 0) {
                            uVar4 = new u(view);
                            u uVar7 = (u) ((o.b) uVar2.f791a).getOrDefault(view, null);
                            i = size;
                            if (uVar7 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar4.f2753a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar7.f2753a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3333c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f2713c != null && jVar.f2711a == view && jVar.f2712b.equals(str) && jVar.f2713c.equals(uVar4)) {
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
                        view = uVar5.f2754b;
                        uVar3 = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f2711a = view;
                        jVar2.f2712b = str;
                        jVar2.f2713c = uVar3;
                        jVar2.d = windowId;
                        jVar2.f2714e = this;
                        jVar2.f2715f = k2;
                        p2.put(k2, jVar2);
                        this.f2741u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f2741u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f2715f.setStartDelay(jVar3.f2715f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2736p - 1;
        this.f2736p = i;
        if (i == 0) {
            v(this, l.f2717b);
            for (int i2 = 0; i2 < ((o.e) this.f2729g.f793c).e(); i2++) {
                View view = (View) ((o.e) this.f2729g.f793c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f793c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f793c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2738r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0177a c0177a = this.i;
        if (c0177a != null) {
            return c0177a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2731k : this.f2732l;
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
            if (uVar.f2754b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f2732l : this.f2731k).get(i);
        }
        return null;
    }

    public final m o() {
        C0177a c0177a = this.i;
        return c0177a != null ? c0177a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0177a c0177a = this.i;
        if (c0177a != null) {
            return c0177a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f2729g : this.h).f791a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f2753a.keySet().iterator();
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
        ArrayList arrayList = this.f2727e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2728f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f2739s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f2740t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2740t.size();
        k[] kVarArr = this.f2733m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f2733m = null;
        k[] kVarArr2 = (k[]) this.f2740t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f2733m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2738r) {
            return;
        }
        ArrayList arrayList = this.f2734n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2735o);
        this.f2735o = f2720w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2735o = animatorArr;
        v(this, l.d);
        this.f2737q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f2740t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f2739s) != null) {
            mVar.x(kVar);
        }
        if (this.f2740t.size() == 0) {
            this.f2740t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2737q) {
            if (!this.f2738r) {
                ArrayList arrayList = this.f2734n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2735o);
                this.f2735o = f2720w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2735o = animatorArr;
                v(this, l.f2719e);
            }
            this.f2737q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2741u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new d0(this, p2));
                    long j2 = this.f2726c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2725b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Y(2, this));
                    animator.start();
                }
            }
        }
        this.f2741u.clear();
        m();
    }
}
