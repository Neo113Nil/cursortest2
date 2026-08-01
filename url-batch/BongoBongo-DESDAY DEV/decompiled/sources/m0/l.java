package m0;

import L.C0003b0;
import L.H;
import L.T;
import L.g0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3274w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3275x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final K0.e f3276y = new K0.e(26);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3277z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3286k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3287l;

    /* renamed from: m, reason: collision with root package name */
    public j[] f3288m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3278a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3279b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3280c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3281e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3282f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public S0.g f3283g = new S0.g(5);

    /* renamed from: h, reason: collision with root package name */
    public S0.g f3284h = new S0.g(5);
    public C0258a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3285j = f3275x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3289n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3290o = f3274w;

    /* renamed from: p, reason: collision with root package name */
    public int f3291p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3292q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3293r = false;

    /* renamed from: s, reason: collision with root package name */
    public l f3294s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3295t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3296u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public K0.e f3297v = f3276y;

    public static void b(S0.g gVar, View view, t tVar) {
        ((p.b) gVar.f822a).put(view, tVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) gVar.f823b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f490a;
        String k2 = H.k(view);
        if (k2 != null) {
            p.b bVar = (p.b) gVar.d;
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
                p.e eVar = (p.e) gVar.f824c;
                if (eVar.f3451a) {
                    eVar.b();
                }
                if (p.d.b(eVar.f3452b, eVar.d, itemIdAtPosition) < 0) {
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

    public static p.b p() {
        ThreadLocal threadLocal = f3277z;
        p.b bVar = (p.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        p.b bVar2 = new p.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(t tVar, t tVar2, String str) {
        Object obj = tVar.f3308a.get(str);
        Object obj2 = tVar2.f3308a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3280c = j2;
    }

    public void B(AbstractC0112a abstractC0112a) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(K0.e eVar) {
        if (eVar == null) {
            this.f3297v = f3276y;
        } else {
            this.f3297v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3279b = j2;
    }

    public final void G() {
        if (this.f3291p == 0) {
            v(this, k.f3270a);
            this.f3293r = false;
        }
        this.f3291p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3280c != -1) {
            sb.append("dur(");
            sb.append(this.f3280c);
            sb.append(") ");
        }
        if (this.f3279b != -1) {
            sb.append("dly(");
            sb.append(this.f3279b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3281e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3282f;
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

    public void a(j jVar) {
        if (this.f3295t == null) {
            this.f3295t = new ArrayList();
        }
        this.f3295t.add(jVar);
    }

    public void c() {
        ArrayList arrayList = this.f3289n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3290o);
        this.f3290o = f3274w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3290o = animatorArr;
        v(this, k.f3272c);
    }

    public abstract void d(t tVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            t tVar = new t(view);
            if (z2) {
                g(tVar);
            } else {
                d(tVar);
            }
            tVar.f3310c.add(this);
            f(tVar);
            if (z2) {
                b(this.f3283g, view, tVar);
            } else {
                b(this.f3284h, view, tVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(t tVar) {
    }

    public abstract void g(t tVar);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f3281e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3282f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                t tVar = new t(findViewById);
                if (z2) {
                    g(tVar);
                } else {
                    d(tVar);
                }
                tVar.f3310c.add(this);
                f(tVar);
                if (z2) {
                    b(this.f3283g, findViewById, tVar);
                } else {
                    b(this.f3284h, findViewById, tVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            t tVar2 = new t(view);
            if (z2) {
                g(tVar2);
            } else {
                d(tVar2);
            }
            tVar2.f3310c.add(this);
            f(tVar2);
            if (z2) {
                b(this.f3283g, view, tVar2);
            } else {
                b(this.f3284h, view, tVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((p.b) this.f3283g.f822a).clear();
            ((SparseArray) this.f3283g.f823b).clear();
            ((p.e) this.f3283g.f824c).a();
        } else {
            ((p.b) this.f3284h.f822a).clear();
            ((SparseArray) this.f3284h.f823b).clear();
            ((p.e) this.f3284h.f824c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f3296u = new ArrayList();
            lVar.f3283g = new S0.g(5);
            lVar.f3284h = new S0.g(5);
            lVar.f3286k = null;
            lVar.f3287l = null;
            lVar.f3294s = this;
            lVar.f3295t = null;
            return lVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, t tVar, t tVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, S0.g gVar, S0.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        t tVar;
        Animator animator;
        t tVar2;
        p.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            t tVar3 = (t) arrayList.get(i2);
            t tVar4 = (t) arrayList2.get(i2);
            if (tVar3 != null && !tVar3.f3310c.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.f3310c.contains(this)) {
                tVar4 = null;
            }
            if ((tVar3 != null || tVar4 != null) && (tVar3 == null || tVar4 == null || s(tVar3, tVar4))) {
                Animator k2 = k(frameLayout, tVar3, tVar4);
                if (k2 != null) {
                    String str = this.f3278a;
                    if (tVar4 != null) {
                        String[] q2 = q();
                        view = tVar4.f3309b;
                        if (q2 != null && q2.length > 0) {
                            tVar2 = new t(view);
                            t tVar5 = (t) ((p.b) gVar2.f822a).getOrDefault(view, null);
                            i = size;
                            if (tVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = tVar2.f3308a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, tVar5.f3308a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3473c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                i iVar = (i) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (iVar.f3267c != null && iVar.f3265a == view && iVar.f3266b.equals(str) && iVar.f3267c.equals(tVar2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            tVar2 = null;
                        }
                        k2 = animator;
                        tVar = tVar2;
                    } else {
                        i = size;
                        view = tVar3.f3309b;
                        tVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        i iVar2 = new i();
                        iVar2.f3265a = view;
                        iVar2.f3266b = str;
                        iVar2.f3267c = tVar;
                        iVar2.d = windowId;
                        iVar2.f3268e = this;
                        iVar2.f3269f = k2;
                        p2.put(k2, iVar2);
                        this.f3296u.add(k2);
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
                i iVar3 = (i) p2.getOrDefault((Animator) this.f3296u.get(sparseIntArray.keyAt(i6)), null);
                iVar3.f3269f.setStartDelay(iVar3.f3269f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3291p - 1;
        this.f3291p = i;
        if (i == 0) {
            v(this, k.f3271b);
            for (int i2 = 0; i2 < ((p.e) this.f3283g.f824c).e(); i2++) {
                View view = (View) ((p.e) this.f3283g.f824c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((p.e) this.f3284h.f824c).e(); i3++) {
                View view2 = (View) ((p.e) this.f3284h.f824c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3293r = true;
        }
    }

    public final t n(View view, boolean z2) {
        C0258a c0258a = this.i;
        if (c0258a != null) {
            return c0258a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3286k : this.f3287l;
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
            t tVar = (t) arrayList.get(i);
            if (tVar == null) {
                return null;
            }
            if (tVar.f3309b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (t) (z2 ? this.f3287l : this.f3286k).get(i);
        }
        return null;
    }

    public final l o() {
        C0258a c0258a = this.i;
        return c0258a != null ? c0258a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final t r(View view, boolean z2) {
        C0258a c0258a = this.i;
        if (c0258a != null) {
            return c0258a.r(view, z2);
        }
        return (t) ((p.b) (z2 ? this.f3283g : this.f3284h).f822a).getOrDefault(view, null);
    }

    public boolean s(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = tVar.f3308a.keySet().iterator();
            while (it.hasNext()) {
                if (u(tVar, tVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(tVar, tVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f3281e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3282f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(l lVar, k kVar) {
        l lVar2 = this.f3294s;
        if (lVar2 != null) {
            lVar2.v(lVar, kVar);
        }
        ArrayList arrayList = this.f3295t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3295t.size();
        j[] jVarArr = this.f3288m;
        if (jVarArr == null) {
            jVarArr = new j[size];
        }
        this.f3288m = null;
        j[] jVarArr2 = (j[]) this.f3295t.toArray(jVarArr);
        for (int i = 0; i < size; i++) {
            kVar.a(jVarArr2[i], lVar);
            jVarArr2[i] = null;
        }
        this.f3288m = jVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3293r) {
            return;
        }
        ArrayList arrayList = this.f3289n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3290o);
        this.f3290o = f3274w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3290o = animatorArr;
        v(this, k.d);
        this.f3292q = true;
    }

    public l x(j jVar) {
        l lVar;
        ArrayList arrayList = this.f3295t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(jVar) && (lVar = this.f3294s) != null) {
            lVar.x(jVar);
        }
        if (this.f3295t.size() == 0) {
            this.f3295t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3292q) {
            if (!this.f3293r) {
                ArrayList arrayList = this.f3289n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3290o);
                this.f3290o = f3274w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3290o = animatorArr;
                v(this, k.f3273e);
            }
            this.f3292q = false;
        }
    }

    public void z() {
        G();
        p.b p2 = p();
        Iterator it = this.f3296u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new g0(this, p2));
                    long j2 = this.f3280c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3279b;
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
        this.f3296u.clear();
        m();
    }
}
