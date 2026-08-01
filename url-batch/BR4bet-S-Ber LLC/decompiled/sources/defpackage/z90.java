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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class z90 implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final ky D = new ky(16);
    public static final ThreadLocal E = new ThreadLocal();
    public ArrayList p;
    public ArrayList q;
    public x90[] r;
    public final String f = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public rg l = new rg(9);
    public rg m = new rg(9);
    public k7 n = null;
    public final int[] o = C;
    public final ArrayList s = new ArrayList();
    public Animator[] t = B;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public z90 x = null;
    public ArrayList y = null;
    public ArrayList z = new ArrayList();
    public ky A = D;

    public static void b(rg rgVar, View view, ha0 ha0Var) {
        x6 x6Var = (x6) rgVar.f;
        x6 x6Var2 = (x6) rgVar.i;
        SparseArray sparseArray = (SparseArray) rgVar.g;
        eu euVar = (eu) rgVar.h;
        x6Var.put(view, ha0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = ic0.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (x6Var2.containsKey(transitionName)) {
                x6Var2.put(transitionName, null);
            } else {
                x6Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (euVar.f) {
                    int i = euVar.i;
                    long[] jArr = euVar.g;
                    Object[] objArr = euVar.h;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != mz.d) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    euVar.f = false;
                    euVar.i = i2;
                }
                if (xf.g(euVar.g, euVar.i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    euVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) euVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    euVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static x6 p() {
        ThreadLocal threadLocal = E;
        x6 x6Var = (x6) threadLocal.get();
        if (x6Var != null) {
            return x6Var;
        }
        x6 x6Var2 = new x6(0);
        threadLocal.set(x6Var2);
        return x6Var2;
    }

    public static boolean u(ha0 ha0Var, ha0 ha0Var2, String str) {
        Object obj = ha0Var.a.get(str);
        Object obj2 = ha0Var2.a.get(str);
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

    public void D(ky kyVar) {
        if (kyVar == null) {
            this.A = D;
        } else {
            this.A = kyVar;
        }
    }

    public void F(long j) {
        this.g = j;
    }

    public final void G() {
        if (this.u == 0) {
            v(this, y90.a);
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

    public void a(x90 x90Var) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(x90Var);
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
        v(this, y90.c);
    }

    public abstract void d(ha0 ha0Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            ha0 ha0Var = new ha0(view);
            if (z) {
                g(ha0Var);
            } else {
                d(ha0Var);
            }
            ha0Var.c.add(this);
            f(ha0Var);
            if (z) {
                b(this.l, view, ha0Var);
            } else {
                b(this.m, view, ha0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void g(ha0 ha0Var);

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
                ha0 ha0Var = new ha0(findViewById);
                if (z) {
                    g(ha0Var);
                } else {
                    d(ha0Var);
                }
                ha0Var.c.add(this);
                f(ha0Var);
                if (z) {
                    b(this.l, findViewById, ha0Var);
                } else {
                    b(this.m, findViewById, ha0Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            ha0 ha0Var2 = new ha0(view);
            if (z) {
                g(ha0Var2);
            } else {
                d(ha0Var2);
            }
            ha0Var2.c.add(this);
            f(ha0Var2);
            if (z) {
                b(this.l, view, ha0Var2);
            } else {
                b(this.m, view, ha0Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((x6) this.l.f).clear();
            ((SparseArray) this.l.g).clear();
            ((eu) this.l.h).a();
        } else {
            ((x6) this.m.f).clear();
            ((SparseArray) this.m.g).clear();
            ((eu) this.m.h).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public z90 clone() {
        try {
            z90 z90Var = (z90) super.clone();
            z90Var.z = new ArrayList();
            z90Var.l = new rg(9);
            z90Var.m = new rg(9);
            z90Var.p = null;
            z90Var.q = null;
            z90Var.x = this;
            z90Var.y = null;
            return z90Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, ha0 ha0Var, ha0 ha0Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, rg rgVar, rg rgVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        ha0 ha0Var;
        Animator animator;
        ha0 ha0Var2;
        x6 p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            ha0 ha0Var3 = (ha0) arrayList.get(i3);
            ha0 ha0Var4 = (ha0) arrayList2.get(i3);
            if (ha0Var3 != null && !ha0Var3.c.contains(this)) {
                ha0Var3 = null;
            }
            if (ha0Var4 != null && !ha0Var4.c.contains(this)) {
                ha0Var4 = null;
            }
            if ((ha0Var3 != null || ha0Var4 != null) && (ha0Var3 == null || ha0Var4 == null || s(ha0Var3, ha0Var4))) {
                Animator k = k(viewGroup, ha0Var3, ha0Var4);
                if (k != null) {
                    String str = this.f;
                    if (ha0Var4 != null) {
                        view = ha0Var4.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            ha0Var2 = new ha0(view);
                            ha0 ha0Var5 = (ha0) ((x6) rgVar2.f).get(view);
                            i = size;
                            if (ha0Var5 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    String str2 = q[i4];
                                    ha0Var2.a.put(str2, ha0Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    ha0Var5 = ha0Var5;
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
                                w90 w90Var = (w90) p.get((Animator) p.f(i6));
                                if (w90Var.c != null && w90Var.a == view && w90Var.b.equals(str) && w90Var.c.equals(ha0Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = k;
                            ha0Var2 = null;
                        }
                        k = animator;
                        ha0Var = ha0Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = ha0Var3.b;
                        ha0Var = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        w90 w90Var2 = new w90();
                        w90Var2.a = view;
                        w90Var2.b = str;
                        w90Var2.c = ha0Var;
                        w90Var2.d = windowId;
                        w90Var2.e = this;
                        w90Var2.f = k;
                        p.put(k, w90Var2);
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
                w90 w90Var3 = (w90) p.get((Animator) this.z.get(sparseIntArray.keyAt(i7)));
                w90Var3.f.setStartDelay(w90Var3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            v(this, y90.b);
            for (int i2 = 0; i2 < ((eu) this.l.h).e(); i2++) {
                View view = (View) ((eu) this.l.h).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((eu) this.m.h).e(); i3++) {
                View view2 = (View) ((eu) this.m.h).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    public final ha0 n(View view, boolean z) {
        k7 k7Var = this.n;
        if (k7Var != null) {
            return k7Var.n(view, z);
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
            ha0 ha0Var = (ha0) arrayList.get(i);
            if (ha0Var == null) {
                return null;
            }
            if (ha0Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (ha0) (z ? this.q : this.p).get(i);
        }
        return null;
    }

    public final z90 o() {
        k7 k7Var = this.n;
        return k7Var != null ? k7Var.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final ha0 r(View view, boolean z) {
        k7 k7Var = this.n;
        if (k7Var != null) {
            return k7Var.r(view, z);
        }
        return (ha0) ((x6) (z ? this.l : this.m).f).get(view);
    }

    public boolean s(ha0 ha0Var, ha0 ha0Var2) {
        if (ha0Var != null && ha0Var2 != null) {
            String[] q = q();
            if (q != null) {
                for (String str : q) {
                    if (u(ha0Var, ha0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = ha0Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(ha0Var, ha0Var2, (String) it.next())) {
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

    public final void v(z90 z90Var, y90 y90Var) {
        z90 z90Var2 = this.x;
        if (z90Var2 != null) {
            z90Var2.v(z90Var, y90Var);
        }
        ArrayList arrayList = this.y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.y.size();
        x90[] x90VarArr = this.r;
        if (x90VarArr == null) {
            x90VarArr = new x90[size];
        }
        this.r = null;
        x90[] x90VarArr2 = (x90[]) this.y.toArray(x90VarArr);
        for (int i = 0; i < size; i++) {
            y90Var.a(x90VarArr2[i], z90Var);
            x90VarArr2[i] = null;
        }
        this.r = x90VarArr2;
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
        v(this, y90.d);
        this.v = true;
    }

    public z90 x(x90 x90Var) {
        z90 z90Var;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            if (!arrayList.remove(x90Var) && (z90Var = this.x) != null) {
                z90Var.x(x90Var);
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
                v(this, y90.e);
            }
            this.v = false;
        }
    }

    public void z() {
        G();
        x6 p = p();
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
                    animator.addListener(new op(this, p, 2));
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
                    animator.addListener(new w0(8, this));
                    animator.start();
                }
            }
        }
        this.z.clear();
        m();
    }

    public void B(la0 la0Var) {
    }

    public void f(ha0 ha0Var) {
    }

    public void E() {
    }
}
