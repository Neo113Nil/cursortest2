package p0;

import K.Q;
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
    public static final Animator[] f3673w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3674x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final R0.e f3675y = new R0.e(28);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3676z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3684k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3685l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f3686m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3677a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3678b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3679c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3680e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3681f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T0.m f3682g = new T0.m(5);
    public T0.m h = new T0.m(5);
    public C0299a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3683j = f3674x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3687n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3688o = f3673w;

    /* renamed from: p, reason: collision with root package name */
    public int f3689p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3690q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3691r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f3692s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3693t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3694u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public R0.e f3695v = f3675y;

    public static void b(T0.m mVar, View view, u uVar) {
        ((o.b) mVar.f1073a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) mVar.f1074b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = Q.f578a;
        String k2 = K.F.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) mVar.d;
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
                o.e eVar = (o.e) mVar.f1075c;
                if (eVar.f3569a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3570b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f3676z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f3706a.get(str);
        Object obj2 = uVar2.f3706a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3679c = j2;
    }

    public void B(b1.g gVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(R0.e eVar) {
        if (eVar == null) {
            this.f3695v = f3675y;
        } else {
            this.f3695v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3678b = j2;
    }

    public final void G() {
        if (this.f3689p == 0) {
            v(this, l.f3669a);
            this.f3691r = false;
        }
        this.f3689p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3679c != -1) {
            sb.append("dur(");
            sb.append(this.f3679c);
            sb.append(") ");
        }
        if (this.f3678b != -1) {
            sb.append("dly(");
            sb.append(this.f3678b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3680e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3681f;
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
        if (this.f3693t == null) {
            this.f3693t = new ArrayList();
        }
        this.f3693t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f3687n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3688o);
        this.f3688o = f3673w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3688o = animatorArr;
        v(this, l.f3671c);
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
            uVar.f3708c.add(this);
            f(uVar);
            if (z2) {
                b(this.f3682g, view, uVar);
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
        ArrayList arrayList = this.f3680e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3681f;
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
                uVar.f3708c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f3682g, findViewById, uVar);
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
            uVar2.f3708c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f3682g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f3682g.f1073a).clear();
            ((SparseArray) this.f3682g.f1074b).clear();
            ((o.e) this.f3682g.f1075c).a();
        } else {
            ((o.b) this.h.f1073a).clear();
            ((SparseArray) this.h.f1074b).clear();
            ((o.e) this.h.f1075c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f3694u = new ArrayList();
            mVar.f3682g = new T0.m(5);
            mVar.h = new T0.m(5);
            mVar.f3684k = null;
            mVar.f3685l = null;
            mVar.f3692s = this;
            mVar.f3693t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T0.m mVar, T0.m mVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            u uVar3 = (u) arrayList.get(i2);
            u uVar4 = (u) arrayList2.get(i2);
            if (uVar3 != null && !uVar3.f3708c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f3708c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f3677a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f3707b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((o.b) mVar2.f1073a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f3706a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f3706a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3591c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f3666c != null && jVar.f3664a == view && jVar.f3665b.equals(str) && jVar.f3666c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            uVar2 = null;
                        }
                        k2 = animator;
                        uVar = uVar2;
                    } else {
                        i = size;
                        view = uVar3.f3707b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f3664a = view;
                        jVar2.f3665b = str;
                        jVar2.f3666c = uVar;
                        jVar2.d = windowId;
                        jVar2.f3667e = this;
                        jVar2.f3668f = k2;
                        p2.put(k2, jVar2);
                        this.f3694u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f3694u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f3668f.setStartDelay(jVar3.f3668f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3689p - 1;
        this.f3689p = i;
        if (i == 0) {
            v(this, l.f3670b);
            for (int i2 = 0; i2 < ((o.e) this.f3682g.f1075c).e(); i2++) {
                View view = (View) ((o.e) this.f3682g.f1075c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f1075c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f1075c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3691r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0299a c0299a = this.i;
        if (c0299a != null) {
            return c0299a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3684k : this.f3685l;
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
            if (uVar.f3707b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f3685l : this.f3684k).get(i);
        }
        return null;
    }

    public final m o() {
        C0299a c0299a = this.i;
        return c0299a != null ? c0299a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0299a c0299a = this.i;
        if (c0299a != null) {
            return c0299a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f3682g : this.h).f1073a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f3706a.keySet().iterator();
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
        ArrayList arrayList = this.f3680e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3681f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f3692s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f3693t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3693t.size();
        k[] kVarArr = this.f3686m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f3686m = null;
        k[] kVarArr2 = (k[]) this.f3693t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f3686m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3691r) {
            return;
        }
        ArrayList arrayList = this.f3687n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3688o);
        this.f3688o = f3673w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3688o = animatorArr;
        v(this, l.d);
        this.f3690q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f3693t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f3692s) != null) {
            mVar.x(kVar);
        }
        if (this.f3693t.size() == 0) {
            this.f3693t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3690q) {
            if (!this.f3691r) {
                ArrayList arrayList = this.f3687n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3688o);
                this.f3688o = f3673w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3688o = animatorArr;
                v(this, l.f3672e);
            }
            this.f3690q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f3694u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new d0(this, p2));
                    long j2 = this.f3679c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3678b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new A0.a(4, this));
                    animator.start();
                }
            }
        }
        this.f3694u.clear();
        m();
    }
}
