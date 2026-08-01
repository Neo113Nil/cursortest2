package defpackage;

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class kj0 implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final xy D = new xy(21);
    public static final ThreadLocal E = new ThreadLocal();
    public ArrayList p;
    public ArrayList q;
    public hj0[] r;
    public final String f = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public wi l = new wi(8);
    public wi m = new wi(8);
    public w7 n = null;
    public final int[] o = C;
    public final ArrayList s = new ArrayList();
    public Animator[] t = B;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public kj0 x = null;
    public ArrayList y = null;
    public ArrayList z = new ArrayList();
    public xy A = D;

    public static void b(wi wiVar, View view, sj0 sj0Var) {
        g7 g7Var = (g7) wiVar.f;
        g7 g7Var2 = (g7) wiVar.i;
        SparseArray sparseArray = (SparseArray) wiVar.g;
        ez ezVar = (ez) wiVar.h;
        g7Var.put(view, sj0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = hm0.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (g7Var2.containsKey(transitionName)) {
                g7Var2.put(transitionName, null);
            } else {
                g7Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (ezVar.f) {
                    int i = ezVar.i;
                    long[] jArr = ezVar.g;
                    Object[] objArr = ezVar.h;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != bi.i) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    ezVar.f = false;
                    ezVar.i = i2;
                }
                if (gk0.d(ezVar.g, ezVar.i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ezVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ezVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ezVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static g7 p() {
        ThreadLocal threadLocal = E;
        g7 g7Var = (g7) threadLocal.get();
        if (g7Var != null) {
            return g7Var;
        }
        g7 g7Var2 = new g7(0);
        threadLocal.set(g7Var2);
        return g7Var2;
    }

    public static boolean u(sj0 sj0Var, sj0 sj0Var2, String str) {
        Object obj = sj0Var.a.get(str);
        Object obj2 = sj0Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.h = j;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void D(xy xyVar) {
        if (xyVar == null) {
            this.A = D;
        } else {
            this.A = xyVar;
        }
    }

    public void F(long j) {
        this.g = j;
    }

    public final void G() {
        if (this.u == 0) {
            v(this, jj0.a);
            this.w = false;
        }
        this.u++;
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
        if (this.g != -1) {
            sb.append("dly(");
            sb.append(this.g);
            sb.append(") ");
        }
        if (this.i != null) {
            sb.append("interp(");
            sb.append(this.i);
            sb.append(") ");
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
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

    public void a(hj0 hj0Var) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(hj0Var);
    }

    public void c() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.t = animatorArr;
        v(this, jj0.c);
    }

    public abstract void d(sj0 sj0Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            sj0 sj0Var = new sj0(view);
            if (z) {
                g(sj0Var);
            } else {
                d(sj0Var);
            }
            sj0Var.c.add(this);
            f(sj0Var);
            if (z) {
                b(this.l, view, sj0Var);
            } else {
                b(this.m, view, sj0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void g(sj0 sj0Var);

    public final void h(ViewGroup viewGroup, boolean z) {
        i(z);
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                sj0 sj0Var = new sj0(findViewById);
                if (z) {
                    g(sj0Var);
                } else {
                    d(sj0Var);
                }
                sj0Var.c.add(this);
                f(sj0Var);
                if (z) {
                    b(this.l, findViewById, sj0Var);
                } else {
                    b(this.m, findViewById, sj0Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            sj0 sj0Var2 = new sj0(view);
            if (z) {
                g(sj0Var2);
            } else {
                d(sj0Var2);
            }
            sj0Var2.c.add(this);
            f(sj0Var2);
            if (z) {
                b(this.l, view, sj0Var2);
            } else {
                b(this.m, view, sj0Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((g7) this.l.f).clear();
            ((SparseArray) this.l.g).clear();
            ((ez) this.l.h).a();
        } else {
            ((g7) this.m.f).clear();
            ((SparseArray) this.m.g).clear();
            ((ez) this.m.h).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public kj0 clone() {
        try {
            kj0 kj0Var = (kj0) super.clone();
            kj0Var.z = new ArrayList();
            kj0Var.l = new wi(8);
            kj0Var.m = new wi(8);
            kj0Var.p = null;
            kj0Var.q = null;
            kj0Var.x = this;
            kj0Var.y = null;
            return kj0Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, sj0 sj0Var, sj0 sj0Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, wi wiVar, wi wiVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        sj0 sj0Var;
        Animator animator;
        sj0 sj0Var2;
        g7 p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            sj0 sj0Var3 = (sj0) arrayList.get(i3);
            sj0 sj0Var4 = (sj0) arrayList2.get(i3);
            if (sj0Var3 != null && !sj0Var3.c.contains(this)) {
                sj0Var3 = null;
            }
            if (sj0Var4 != null && !sj0Var4.c.contains(this)) {
                sj0Var4 = null;
            }
            if ((sj0Var3 != null || sj0Var4 != null) && (sj0Var3 == null || sj0Var4 == null || s(sj0Var3, sj0Var4))) {
                Animator k = k(viewGroup, sj0Var3, sj0Var4);
                if (k != null) {
                    String str = this.f;
                    if (sj0Var4 != null) {
                        view = sj0Var4.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            sj0Var2 = new sj0(view);
                            sj0 sj0Var5 = (sj0) ((g7) wiVar2.f).get(view);
                            i = size;
                            if (sj0Var5 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    String str2 = q[i4];
                                    sj0Var2.a.put(str2, sj0Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    sj0Var5 = sj0Var5;
                                }
                            }
                            i2 = i3;
                            int i5 = p.h;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = k;
                                    break;
                                }
                                gj0 gj0Var = (gj0) p.get((Animator) p.f(i6));
                                if (gj0Var.c != null && gj0Var.a == view && gj0Var.b.equals(str) && gj0Var.c.equals(sj0Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = k;
                            sj0Var2 = null;
                        }
                        k = animator;
                        sj0Var = sj0Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = sj0Var3.b;
                        sj0Var = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        gj0 gj0Var2 = new gj0();
                        gj0Var2.a = view;
                        gj0Var2.b = str;
                        gj0Var2.c = sj0Var;
                        gj0Var2.d = windowId;
                        gj0Var2.e = this;
                        gj0Var2.f = k;
                        p.put(k, gj0Var2);
                        this.z.add(k);
                    }
                    i3 = i2 + 1;
                    size = i;
                }
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                gj0 gj0Var3 = (gj0) p.get((Animator) this.z.get(sparseIntArray.keyAt(i7)));
                gj0Var3.f.setStartDelay(gj0Var3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            v(this, jj0.b);
            for (int i2 = 0; i2 < ((ez) this.l.h).e(); i2++) {
                View view = (View) ((ez) this.l.h).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((ez) this.m.h).e(); i3++) {
                View view2 = (View) ((ez) this.m.h).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    public final sj0 n(View view, boolean z) {
        w7 w7Var = this.n;
        if (w7Var != null) {
            return w7Var.n(view, z);
        }
        ArrayList arrayList = z ? this.p : this.q;
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
            sj0 sj0Var = (sj0) arrayList.get(i);
            if (sj0Var == null) {
                return null;
            }
            if (sj0Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (sj0) (z ? this.q : this.p).get(i);
        }
        return null;
    }

    public final kj0 o() {
        w7 w7Var = this.n;
        return w7Var != null ? w7Var.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final sj0 r(View view, boolean z) {
        w7 w7Var = this.n;
        if (w7Var != null) {
            return w7Var.r(view, z);
        }
        return (sj0) ((g7) (z ? this.l : this.m).f).get(view);
    }

    public boolean s(sj0 sj0Var, sj0 sj0Var2) {
        if (sj0Var != null && sj0Var2 != null) {
            String[] q = q();
            if (q != null) {
                for (String str : q) {
                    if (u(sj0Var, sj0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = sj0Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(sj0Var, sj0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(kj0 kj0Var, jj0 jj0Var) {
        kj0 kj0Var2 = this.x;
        if (kj0Var2 != null) {
            kj0Var2.v(kj0Var, jj0Var);
        }
        ArrayList arrayList = this.y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.y.size();
        hj0[] hj0VarArr = this.r;
        if (hj0VarArr == null) {
            hj0VarArr = new hj0[size];
        }
        this.r = null;
        hj0[] hj0VarArr2 = (hj0[]) this.y.toArray(hj0VarArr);
        for (int i = 0; i < size; i++) {
            jj0Var.b(hj0VarArr2[i], kj0Var);
            hj0VarArr2[i] = null;
        }
        this.r = hj0VarArr2;
    }

    public void w(View view) {
        if (this.w) {
            return;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = B;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.t = animatorArr;
        v(this, jj0.d);
        this.v = true;
    }

    public kj0 x(hj0 hj0Var) {
        kj0 kj0Var;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            if (!arrayList.remove(hj0Var) && (kj0Var = this.x) != null) {
                kj0Var.x(hj0Var);
            }
            if (this.y.size() == 0) {
                this.y = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.v) {
            if (!this.w) {
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
                this.t = B;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.t = animatorArr;
                v(this, jj0.e);
            }
            this.v = false;
        }
    }

    public void z() {
        G();
        g7 p = p();
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (p.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new ft(this, p, 2));
                    long j = this.h;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.g;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new z0(9, this));
                    animator.start();
                }
            }
        }
        this.z.clear();
        m();
    }

    public void B(xc0 xc0Var) {
    }

    public void f(sj0 sj0Var) {
    }

    public void E() {
    }
}
