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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class y60 implements Cloneable {
    public static final Animator[] C = new Animator[0];
    public static final int[] D = {2, 1, 3, 4};
    public static final ix E = new ix(14);
    public static final ThreadLocal F = new ThreadLocal();
    public l70 A;
    public ArrayList p;
    public ArrayList q;
    public v60[] r;
    public final String f = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public h8 l = new h8(7);
    public h8 m = new h8(7);
    public e70 n = null;
    public final int[] o = D;
    public final ArrayList s = new ArrayList();
    public Animator[] t = C;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public y60 x = null;
    public ArrayList y = null;
    public ArrayList z = new ArrayList();
    public ix B = E;

    public static void c(h8 h8Var, View view, h70 h70Var) {
        e7 e7Var = (e7) h8Var.f;
        e7 e7Var2 = (e7) h8Var.i;
        SparseArray sparseArray = (SparseArray) h8Var.g;
        vr vrVar = (vr) h8Var.h;
        e7Var.put(view, h70Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = e90.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (e7Var2.containsKey(transitionName)) {
                e7Var2.put(transitionName, null);
            } else {
                e7Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (vrVar.f) {
                    int i = vrVar.i;
                    long[] jArr = vrVar.g;
                    Object[] objArr = vrVar.h;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != j8.c) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    vrVar.f = false;
                    vrVar.i = i2;
                }
                if (op.f(vrVar.g, vrVar.i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    vrVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) vrVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    vrVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static e7 q() {
        ThreadLocal threadLocal = F;
        e7 e7Var = (e7) threadLocal.get();
        if (e7Var != null) {
            return e7Var;
        }
        e7 e7Var2 = new e7(0);
        threadLocal.set(e7Var2);
        return e7Var2;
    }

    public static boolean v(h70 h70Var, h70 h70Var2, String str) {
        Object obj = h70Var.a.get(str);
        Object obj2 = h70Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.v) {
            if (!this.w) {
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
                this.t = C;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.t = animatorArr;
                w(this, x60.e);
            }
            this.v = false;
        }
    }

    public void B() {
        I();
        e7 q = q();
        ArrayList arrayList = this.z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (q.containsKey(animator)) {
                I();
                if (animator != null) {
                    animator.addListener(new rn(this, q, 2));
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
                    animator.addListener(new x0(8, this));
                    animator.start();
                }
            }
        }
        this.z.clear();
        n();
    }

    public void C(long j) {
        this.h = j;
    }

    public void D(l70 l70Var) {
        this.A = l70Var;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void F(ix ixVar) {
        if (ixVar == null) {
            this.B = E;
        } else {
            this.B = ixVar;
        }
    }

    public void H(long j) {
        this.g = j;
    }

    public final void I() {
        if (this.u == 0) {
            w(this, x60.a);
            this.w = false;
        }
        this.u++;
    }

    public String J(String str) {
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

    public void a(v60 v60Var) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(v60Var);
    }

    public void b(View view) {
        this.k.add(view);
    }

    public void d() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = C;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.t = animatorArr;
        w(this, x60.c);
    }

    public abstract void e(h70 h70Var);

    public final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            h70 h70Var = new h70(view);
            if (z) {
                h(h70Var);
            } else {
                e(h70Var);
            }
            h70Var.c.add(this);
            g(h70Var);
            if (z) {
                c(this.l, view, h70Var);
            } else {
                c(this.m, view, h70Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void h(h70 h70Var);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                h70 h70Var = new h70(findViewById);
                if (z) {
                    h(h70Var);
                } else {
                    e(h70Var);
                }
                h70Var.c.add(this);
                g(h70Var);
                if (z) {
                    c(this.l, findViewById, h70Var);
                } else {
                    c(this.m, findViewById, h70Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            h70 h70Var2 = new h70(view);
            if (z) {
                h(h70Var2);
            } else {
                e(h70Var2);
            }
            h70Var2.c.add(this);
            g(h70Var2);
            if (z) {
                c(this.l, view, h70Var2);
            } else {
                c(this.m, view, h70Var2);
            }
        }
    }

    public final void j(boolean z) {
        if (z) {
            ((e7) this.l.f).clear();
            ((SparseArray) this.l.g).clear();
            ((vr) this.l.h).a();
        } else {
            ((e7) this.m.f).clear();
            ((SparseArray) this.m.g).clear();
            ((vr) this.m.h).a();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public y60 clone() {
        try {
            y60 y60Var = (y60) super.clone();
            y60Var.z = new ArrayList();
            y60Var.l = new h8(7);
            y60Var.m = new h8(7);
            y60Var.p = null;
            y60Var.q = null;
            y60Var.x = this;
            y60Var.y = null;
            return y60Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator l(ViewGroup viewGroup, h70 h70Var, h70 h70Var2) {
        return null;
    }

    public void m(ViewGroup viewGroup, h8 h8Var, h8 h8Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        h70 h70Var;
        Animator animator;
        h70 h70Var2;
        e7 q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i3 = 0;
        while (i3 < size) {
            h70 h70Var3 = (h70) arrayList.get(i3);
            h70 h70Var4 = (h70) arrayList2.get(i3);
            if (h70Var3 != null && !h70Var3.c.contains(this)) {
                h70Var3 = null;
            }
            if (h70Var4 != null && !h70Var4.c.contains(this)) {
                h70Var4 = null;
            }
            if ((h70Var3 != null || h70Var4 != null) && (h70Var3 == null || h70Var4 == null || t(h70Var3, h70Var4))) {
                Animator l = l(viewGroup, h70Var3, h70Var4);
                if (l != null) {
                    String str = this.f;
                    if (h70Var4 != null) {
                        view = h70Var4.b;
                        String[] r = r();
                        if (r != null && r.length > 0) {
                            h70Var2 = new h70(view);
                            h70 h70Var5 = (h70) ((e7) h8Var2.f).get(view);
                            i = size;
                            if (h70Var5 != null) {
                                int i4 = 0;
                                while (i4 < r.length) {
                                    String str2 = r[i4];
                                    h70Var2.a.put(str2, h70Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    h70Var5 = h70Var5;
                                }
                            }
                            i2 = i3;
                            int i5 = q.h;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = l;
                                    break;
                                }
                                u60 u60Var = (u60) q.get((Animator) q.f(i6));
                                if (u60Var.c != null && u60Var.a == view && u60Var.b.equals(str) && u60Var.c.equals(h70Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = l;
                            h70Var2 = null;
                        }
                        l = animator;
                        h70Var = h70Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = h70Var3.b;
                        h70Var = null;
                    }
                    if (l != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        u60 u60Var2 = new u60();
                        u60Var2.a = view;
                        u60Var2.b = str;
                        u60Var2.c = h70Var;
                        u60Var2.d = windowId;
                        u60Var2.e = this;
                        u60Var2.f = l;
                        q.put(l, u60Var2);
                        this.z.add(l);
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
                u60 u60Var3 = (u60) q.get((Animator) this.z.get(sparseIntArray.keyAt(i7)));
                u60Var3.f.setStartDelay(u60Var3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            w(this, x60.b);
            for (int i2 = 0; i2 < ((vr) this.l.h).e(); i2++) {
                View view = (View) ((vr) this.l.h).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((vr) this.m.h).e(); i3++) {
                View view2 = (View) ((vr) this.m.h).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    public final h70 o(View view, boolean z) {
        e70 e70Var = this.n;
        if (e70Var != null) {
            return e70Var.o(view, z);
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
            h70 h70Var = (h70) arrayList.get(i);
            if (h70Var == null) {
                return null;
            }
            if (h70Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (h70) (z ? this.q : this.p).get(i);
        }
        return null;
    }

    public final y60 p() {
        e70 e70Var = this.n;
        return e70Var != null ? e70Var.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final h70 s(View view, boolean z) {
        e70 e70Var = this.n;
        if (e70Var != null) {
            return e70Var.s(view, z);
        }
        return (h70) ((e7) (z ? this.l : this.m).f).get(view);
    }

    public boolean t(h70 h70Var, h70 h70Var2) {
        if (h70Var != null && h70Var2 != null) {
            String[] r = r();
            if (r != null) {
                for (String str : r) {
                    if (v(h70Var, h70Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = h70Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(h70Var, h70Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return J("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void w(y60 y60Var, x60 x60Var) {
        y60 y60Var2 = this.x;
        if (y60Var2 != null) {
            y60Var2.w(y60Var, x60Var);
        }
        ArrayList arrayList = this.y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.y.size();
        v60[] v60VarArr = this.r;
        if (v60VarArr == null) {
            v60VarArr = new v60[size];
        }
        this.r = null;
        v60[] v60VarArr2 = (v60[]) this.y.toArray(v60VarArr);
        for (int i = 0; i < size; i++) {
            x60Var.b(v60VarArr2[i], y60Var);
            v60VarArr2[i] = null;
        }
        this.r = v60VarArr2;
    }

    public void x(View view) {
        if (this.w) {
            return;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = C;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.t = animatorArr;
        w(this, x60.d);
        this.v = true;
    }

    public y60 y(v60 v60Var) {
        y60 y60Var;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            if (!arrayList.remove(v60Var) && (y60Var = this.x) != null) {
                y60Var.y(v60Var);
            }
            if (this.y.size() == 0) {
                this.y = null;
            }
        }
        return this;
    }

    public void z(View view) {
        this.k.remove(view);
    }

    public void g(h70 h70Var) {
    }

    public void G() {
    }
}
