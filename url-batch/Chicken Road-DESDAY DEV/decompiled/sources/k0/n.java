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
public abstract class n implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f2733w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2734x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final I0.e f2735y = new I0.e(23);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2736z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2744k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2745l;

    /* renamed from: m, reason: collision with root package name */
    public l[] f2746m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2737a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2738b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2739c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2740e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2741f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.u f2742g = new T.u(4);
    public T.u h = new T.u(4);
    public C0180a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2743j = f2734x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2747n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2748o = f2733w;

    /* renamed from: p, reason: collision with root package name */
    public int f2749p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2750q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2751r = false;

    /* renamed from: s, reason: collision with root package name */
    public n f2752s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2753t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2754u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public I0.e f2755v = f2735y;

    public static void b(T.u uVar, View view, v vVar) {
        ((o.b) uVar.f801a).put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) uVar.f802b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = S.f369a;
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
                o.e eVar = (o.e) uVar.f803c;
                if (eVar.f3306a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3307b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f2736z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(v vVar, v vVar2, String str) {
        Object obj = vVar.f2766a.get(str);
        Object obj2 = vVar2.f2766a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2739c = j2;
    }

    public void B(k kVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(I0.e eVar) {
        if (eVar == null) {
            this.f2755v = f2735y;
        } else {
            this.f2755v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2738b = j2;
    }

    public final void G() {
        if (this.f2749p == 0) {
            v(this, m.f2729a);
            this.f2751r = false;
        }
        this.f2749p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2739c != -1) {
            sb.append("dur(");
            sb.append(this.f2739c);
            sb.append(") ");
        }
        if (this.f2738b != -1) {
            sb.append("dly(");
            sb.append(this.f2738b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2740e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2741f;
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

    public void a(l lVar) {
        if (this.f2753t == null) {
            this.f2753t = new ArrayList();
        }
        this.f2753t.add(lVar);
    }

    public void c() {
        ArrayList arrayList = this.f2747n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2748o);
        this.f2748o = f2733w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2748o = animatorArr;
        v(this, m.f2731c);
    }

    public abstract void d(v vVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z2) {
                g(vVar);
            } else {
                d(vVar);
            }
            vVar.f2768c.add(this);
            f(vVar);
            if (z2) {
                b(this.f2742g, view, vVar);
            } else {
                b(this.h, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(v vVar) {
    }

    public abstract void g(v vVar);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f2740e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2741f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                v vVar = new v(findViewById);
                if (z2) {
                    g(vVar);
                } else {
                    d(vVar);
                }
                vVar.f2768c.add(this);
                f(vVar);
                if (z2) {
                    b(this.f2742g, findViewById, vVar);
                } else {
                    b(this.h, findViewById, vVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            v vVar2 = new v(view);
            if (z2) {
                g(vVar2);
            } else {
                d(vVar2);
            }
            vVar2.f2768c.add(this);
            f(vVar2);
            if (z2) {
                b(this.f2742g, view, vVar2);
            } else {
                b(this.h, view, vVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2742g.f801a).clear();
            ((SparseArray) this.f2742g.f802b).clear();
            ((o.e) this.f2742g.f803c).a();
        } else {
            ((o.b) this.h.f801a).clear();
            ((SparseArray) this.h.f802b).clear();
            ((o.e) this.h.f803c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public n clone() {
        try {
            n nVar = (n) super.clone();
            nVar.f2754u = new ArrayList();
            nVar.f2742g = new T.u(4);
            nVar.h = new T.u(4);
            nVar.f2744k = null;
            nVar.f2745l = null;
            nVar.f2752s = this;
            nVar.f2753t = null;
            return nVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, v vVar, v vVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T.u uVar, T.u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        v vVar;
        Animator animator;
        v vVar2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            v vVar3 = (v) arrayList.get(i2);
            v vVar4 = (v) arrayList2.get(i2);
            if (vVar3 != null && !vVar3.f2768c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.f2768c.contains(this)) {
                vVar4 = null;
            }
            if ((vVar3 != null || vVar4 != null) && (vVar3 == null || vVar4 == null || s(vVar3, vVar4))) {
                Animator k2 = k(frameLayout, vVar3, vVar4);
                if (k2 != null) {
                    String str = this.f2737a;
                    if (vVar4 != null) {
                        String[] q2 = q();
                        view = vVar4.f2767b;
                        if (q2 != null && q2.length > 0) {
                            vVar2 = new v(view);
                            v vVar5 = (v) ((o.b) uVar2.f801a).getOrDefault(view, null);
                            i = size;
                            if (vVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = vVar2.f2766a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, vVar5.f2766a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3328c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f2723c != null && jVar.f2721a == view && jVar.f2722b.equals(str) && jVar.f2723c.equals(vVar2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            vVar2 = null;
                        }
                        k2 = animator;
                        vVar = vVar2;
                    } else {
                        i = size;
                        view = vVar3.f2767b;
                        vVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f2721a = view;
                        jVar2.f2722b = str;
                        jVar2.f2723c = vVar;
                        jVar2.d = windowId;
                        jVar2.f2724e = this;
                        jVar2.f2725f = k2;
                        p2.put(k2, jVar2);
                        this.f2754u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f2754u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f2725f.setStartDelay(jVar3.f2725f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2749p - 1;
        this.f2749p = i;
        if (i == 0) {
            v(this, m.f2730b);
            for (int i2 = 0; i2 < ((o.e) this.f2742g.f803c).e(); i2++) {
                View view = (View) ((o.e) this.f2742g.f803c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f803c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f803c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2751r = true;
        }
    }

    public final v n(View view, boolean z2) {
        C0180a c0180a = this.i;
        if (c0180a != null) {
            return c0180a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2744k : this.f2745l;
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
            if (vVar.f2767b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (v) (z2 ? this.f2745l : this.f2744k).get(i);
        }
        return null;
    }

    public final n o() {
        C0180a c0180a = this.i;
        return c0180a != null ? c0180a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final v r(View view, boolean z2) {
        C0180a c0180a = this.i;
        if (c0180a != null) {
            return c0180a.r(view, z2);
        }
        return (v) ((o.b) (z2 ? this.f2742g : this.h).f801a).getOrDefault(view, null);
    }

    public boolean s(v vVar, v vVar2) {
        if (vVar == null || vVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = vVar.f2766a.keySet().iterator();
            while (it.hasNext()) {
                if (u(vVar, vVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(vVar, vVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2740e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2741f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(n nVar, m mVar) {
        n nVar2 = this.f2752s;
        if (nVar2 != null) {
            nVar2.v(nVar, mVar);
        }
        ArrayList arrayList = this.f2753t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2753t.size();
        l[] lVarArr = this.f2746m;
        if (lVarArr == null) {
            lVarArr = new l[size];
        }
        this.f2746m = null;
        l[] lVarArr2 = (l[]) this.f2753t.toArray(lVarArr);
        for (int i = 0; i < size; i++) {
            mVar.a(lVarArr2[i], nVar);
            lVarArr2[i] = null;
        }
        this.f2746m = lVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2751r) {
            return;
        }
        ArrayList arrayList = this.f2747n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2748o);
        this.f2748o = f2733w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2748o = animatorArr;
        v(this, m.d);
        this.f2750q = true;
    }

    public n x(l lVar) {
        n nVar;
        ArrayList arrayList = this.f2753t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(lVar) && (nVar = this.f2752s) != null) {
            nVar.x(lVar);
        }
        if (this.f2753t.size() == 0) {
            this.f2753t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2750q) {
            if (!this.f2751r) {
                ArrayList arrayList = this.f2747n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2748o);
                this.f2748o = f2733w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2748o = animatorArr;
                v(this, m.f2732e);
            }
            this.f2750q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2754u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new d0(this, p2));
                    long j2 = this.f2739c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2738b;
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
        this.f2754u.clear();
        m();
    }
}
