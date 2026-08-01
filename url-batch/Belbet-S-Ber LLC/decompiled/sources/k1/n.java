package k1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class n implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final o2.f D = new o2.f(17);
    public static final ThreadLocal E = new ThreadLocal();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2355p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2356q;

    /* renamed from: r, reason: collision with root package name */
    public l[] f2357r;

    /* renamed from: f, reason: collision with root package name */
    public final String f2347f = getClass().getName();

    /* renamed from: g, reason: collision with root package name */
    public long f2348g = -1;
    public long h = -1;
    public TimeInterpolator i = null;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2349j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2350k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public a0.k f2351l = new a0.k(6);

    /* renamed from: m, reason: collision with root package name */
    public a0.k f2352m = new a0.k(6);

    /* renamed from: n, reason: collision with root package name */
    public a f2353n = null;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f2354o = C;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f2358s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public Animator[] f2359t = B;

    /* renamed from: u, reason: collision with root package name */
    public int f2360u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2361v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2362w = false;

    /* renamed from: x, reason: collision with root package name */
    public n f2363x = null;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2364y = null;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f2365z = new ArrayList();
    public o2.f A = D;

    public static void b(a0.k kVar, View view, v vVar) {
        q.f fVar = (q.f) kVar.f97f;
        q.f fVar2 = (q.f) kVar.i;
        SparseArray sparseArray = (SparseArray) kVar.f98g;
        q.h hVar = (q.h) kVar.h;
        fVar.put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = p0.f2816a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (fVar2.containsKey(transitionName)) {
                fVar2.put(transitionName, null);
            } else {
                fVar2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hVar.f3110f) {
                    int i = hVar.i;
                    long[] jArr = hVar.f3111g;
                    Object[] objArr = hVar.h;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object obj = objArr[i5];
                        if (obj != q.i.f3112a) {
                            if (i5 != i4) {
                                jArr[i4] = jArr[i5];
                                objArr[i4] = obj;
                                objArr[i5] = null;
                            }
                            i4++;
                        }
                    }
                    hVar.f3110f = false;
                    hVar.i = i4;
                }
                if (r.a.b(hVar.f3111g, hVar.i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    hVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) hVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    hVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static q.f p() {
        ThreadLocal threadLocal = E;
        q.f fVar = (q.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        q.f fVar2 = new q.f(0);
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean u(v vVar, v vVar2, String str) {
        Object obj = vVar.f2376a.get(str);
        Object obj2 = vVar2.f2376a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.h = j2;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void D(o2.f fVar) {
        if (fVar == null) {
            this.A = D;
        } else {
            this.A = fVar;
        }
    }

    public void F(long j2) {
        this.f2348g = j2;
    }

    public final void G() {
        if (this.f2360u == 0) {
            v(this, m.f2343a);
            this.f2362w = false;
        }
        this.f2360u++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.h != -1) {
            sb.append("dur(");
            sb.append(this.h);
            sb.append(") ");
        }
        if (this.f2348g != -1) {
            sb.append("dly(");
            sb.append(this.f2348g);
            sb.append(") ");
        }
        if (this.i != null) {
            sb.append("interp(");
            sb.append(this.i);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2349j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2350k;
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
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(l lVar) {
        if (this.f2364y == null) {
            this.f2364y = new ArrayList();
        }
        this.f2364y.add(lVar);
    }

    public void c() {
        ArrayList arrayList = this.f2358s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2359t);
        this.f2359t = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2359t = animatorArr;
        v(this, m.f2345c);
    }

    public abstract void d(v vVar);

    public final void e(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z4) {
                g(vVar);
            } else {
                d(vVar);
            }
            vVar.f2378c.add(this);
            f(vVar);
            if (z4) {
                b(this.f2351l, view, vVar);
            } else {
                b(this.f2352m, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z4);
            }
        }
    }

    public abstract void g(v vVar);

    public final void h(ViewGroup viewGroup, boolean z4) {
        i(z4);
        ArrayList arrayList = this.f2349j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2350k;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z4);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                v vVar = new v(findViewById);
                if (z4) {
                    g(vVar);
                } else {
                    d(vVar);
                }
                vVar.f2378c.add(this);
                f(vVar);
                if (z4) {
                    b(this.f2351l, findViewById, vVar);
                } else {
                    b(this.f2352m, findViewById, vVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            v vVar2 = new v(view);
            if (z4) {
                g(vVar2);
            } else {
                d(vVar2);
            }
            vVar2.f2378c.add(this);
            f(vVar2);
            if (z4) {
                b(this.f2351l, view, vVar2);
            } else {
                b(this.f2352m, view, vVar2);
            }
        }
    }

    public final void i(boolean z4) {
        if (z4) {
            ((q.f) this.f2351l.f97f).clear();
            ((SparseArray) this.f2351l.f98g).clear();
            ((q.h) this.f2351l.h).a();
        } else {
            ((q.f) this.f2352m.f97f).clear();
            ((SparseArray) this.f2352m.f98g).clear();
            ((q.h) this.f2352m.h).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f2365z = new ArrayList();
            nVar.f2351l = new a0.k(6);
            nVar.f2352m = new a0.k(6);
            nVar.f2355p = null;
            nVar.f2356q = null;
            nVar.f2363x = this;
            nVar.f2364y = null;
            return nVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, a0.k kVar, a0.k kVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i4;
        View view;
        v vVar;
        Animator animator;
        v vVar2;
        q.f p4 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i5 = 0;
        while (i5 < size) {
            v vVar3 = (v) arrayList.get(i5);
            v vVar4 = (v) arrayList2.get(i5);
            if (vVar3 != null && !vVar3.f2378c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.f2378c.contains(this)) {
                vVar4 = null;
            }
            if ((vVar3 != null || vVar4 != null) && (vVar3 == null || vVar4 == null || s(vVar3, vVar4))) {
                Animator k4 = k(viewGroup, vVar3, vVar4);
                if (k4 != null) {
                    String str = this.f2347f;
                    if (vVar4 != null) {
                        view = vVar4.f2377b;
                        String[] q4 = q();
                        if (q4 != null && q4.length > 0) {
                            vVar2 = new v(view);
                            v vVar5 = (v) ((q.f) kVar2.f97f).get(view);
                            i = size;
                            if (vVar5 != null) {
                                int i6 = 0;
                                while (i6 < q4.length) {
                                    String str2 = q4[i6];
                                    vVar2.f2376a.put(str2, vVar5.f2376a.get(str2));
                                    i6++;
                                    i5 = i5;
                                    vVar5 = vVar5;
                                }
                            }
                            i4 = i5;
                            int i7 = p4.h;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = k4;
                                    break;
                                }
                                k kVar3 = (k) p4.get((Animator) p4.f(i8));
                                if (kVar3.f2340c != null && kVar3.f2338a == view && kVar3.f2339b.equals(str) && kVar3.f2340c.equals(vVar2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i = size;
                            i4 = i5;
                            animator = k4;
                            vVar2 = null;
                        }
                        k4 = animator;
                        vVar = vVar2;
                    } else {
                        i = size;
                        i4 = i5;
                        view = vVar3.f2377b;
                        vVar = null;
                    }
                    if (k4 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        k kVar4 = new k();
                        kVar4.f2338a = view;
                        kVar4.f2339b = str;
                        kVar4.f2340c = vVar;
                        kVar4.d = windowId;
                        kVar4.f2341e = this;
                        kVar4.f2342f = k4;
                        p4.put(k4, kVar4);
                        this.f2365z.add(k4);
                    }
                    i5 = i4 + 1;
                    size = i;
                }
            }
            i = size;
            i4 = i5;
            i5 = i4 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                k kVar5 = (k) p4.get((Animator) this.f2365z.get(sparseIntArray.keyAt(i9)));
                kVar5.f2342f.setStartDelay(kVar5.f2342f.getStartDelay() + (sparseIntArray.valueAt(i9) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2360u - 1;
        this.f2360u = i;
        if (i == 0) {
            v(this, m.f2344b);
            for (int i4 = 0; i4 < ((q.h) this.f2351l.h).e(); i4++) {
                View view = (View) ((q.h) this.f2351l.h).f(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < ((q.h) this.f2352m.h).e(); i5++) {
                View view2 = (View) ((q.h) this.f2352m.h).f(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2362w = true;
        }
    }

    public final v n(View view, boolean z4) {
        a aVar = this.f2353n;
        if (aVar != null) {
            return aVar.n(view, z4);
        }
        ArrayList arrayList = z4 ? this.f2355p : this.f2356q;
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
            v vVar = (v) arrayList.get(i);
            if (vVar == null) {
                return null;
            }
            if (vVar.f2377b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (v) (z4 ? this.f2356q : this.f2355p).get(i);
        }
        return null;
    }

    public final n o() {
        a aVar = this.f2353n;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final v r(View view, boolean z4) {
        a aVar = this.f2353n;
        if (aVar != null) {
            return aVar.r(view, z4);
        }
        return (v) ((q.f) (z4 ? this.f2351l : this.f2352m).f97f).get(view);
    }

    public boolean s(v vVar, v vVar2) {
        if (vVar != null && vVar2 != null) {
            String[] q4 = q();
            if (q4 != null) {
                for (String str : q4) {
                    if (u(vVar, vVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = vVar.f2376a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(vVar, vVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2349j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2350k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(n nVar, m mVar) {
        n nVar2 = this.f2363x;
        if (nVar2 != null) {
            nVar2.v(nVar, mVar);
        }
        ArrayList arrayList = this.f2364y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2364y.size();
        l[] lVarArr = this.f2357r;
        if (lVarArr == null) {
            lVarArr = new l[size];
        }
        this.f2357r = null;
        l[] lVarArr2 = (l[]) this.f2364y.toArray(lVarArr);
        for (int i = 0; i < size; i++) {
            mVar.a(lVarArr2[i], nVar);
            lVarArr2[i] = null;
        }
        this.f2357r = lVarArr2;
    }

    public void w(View view) {
        if (this.f2362w) {
            return;
        }
        ArrayList arrayList = this.f2358s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2359t);
        this.f2359t = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2359t = animatorArr;
        v(this, m.d);
        this.f2361v = true;
    }

    public n x(l lVar) {
        n nVar;
        ArrayList arrayList = this.f2364y;
        if (arrayList != null) {
            if (!arrayList.remove(lVar) && (nVar = this.f2363x) != null) {
                nVar.x(lVar);
            }
            if (this.f2364y.size() == 0) {
                this.f2364y = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f2361v) {
            if (!this.f2362w) {
                ArrayList arrayList = this.f2358s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2359t);
                this.f2359t = B;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2359t = animatorArr;
                v(this, m.f2346e);
            }
            this.f2361v = false;
        }
    }

    public void z() {
        G();
        q.f p4 = p();
        ArrayList arrayList = this.f2365z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (p4.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new j(this, p4, 0));
                    long j2 = this.h;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j4 = this.f2348g;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    TimeInterpolator timeInterpolator = this.i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new g2.e(2, this));
                    animator.start();
                }
            }
        }
        this.f2365z.clear();
        m();
    }

    public void B(b4.d dVar) {
    }

    public void f(v vVar) {
    }

    public void E() {
    }
}
