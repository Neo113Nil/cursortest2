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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class s60 implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final vw D = new vw(14);
    public static final ThreadLocal E = new ThreadLocal();
    public ArrayList p;
    public ArrayList q;
    public p60[] r;
    public final String f = getClass().getName();
    public long g = -1;
    public long h = -1;
    public TimeInterpolator i = null;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public we l = new we(9);
    public we m = new we(9);
    public a7 n = null;
    public final int[] o = C;
    public final ArrayList s = new ArrayList();
    public Animator[] t = B;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public s60 x = null;
    public ArrayList y = null;
    public ArrayList z = new ArrayList();
    public vw A = D;

    public static void b(we weVar, View view, a70 a70Var) {
        n6 n6Var = (n6) weVar.f;
        n6 n6Var2 = (n6) weVar.i;
        SparseArray sparseArray = (SparseArray) weVar.g;
        hr hrVar = (hr) weVar.h;
        n6Var.put(view, a70Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = x80.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (n6Var2.containsKey(transitionName)) {
                n6Var2.put(transitionName, null);
            } else {
                n6Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hrVar.f) {
                    int i = hrVar.i;
                    long[] jArr = hrVar.g;
                    Object[] objArr = hrVar.h;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != jw.i) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    hrVar.f = false;
                    hrVar.i = i2;
                }
                if (jw.j(hrVar.g, hrVar.i, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    hrVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) hrVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    hrVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static n6 p() {
        ThreadLocal threadLocal = E;
        n6 n6Var = (n6) threadLocal.get();
        if (n6Var != null) {
            return n6Var;
        }
        n6 n6Var2 = new n6(0);
        threadLocal.set(n6Var2);
        return n6Var2;
    }

    public static boolean u(a70 a70Var, a70 a70Var2, String str) {
        Object obj = a70Var.a.get(str);
        Object obj2 = a70Var2.a.get(str);
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

    public void D(vw vwVar) {
        if (vwVar == null) {
            this.A = D;
        } else {
            this.A = vwVar;
        }
    }

    public void F(long j) {
        this.g = j;
    }

    public final void G() {
        if (this.u == 0) {
            v(this, r60.a);
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

    public void a(p60 p60Var) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(p60Var);
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
        v(this, r60.c);
    }

    public abstract void d(a70 a70Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            a70 a70Var = new a70(view);
            if (z) {
                g(a70Var);
            } else {
                d(a70Var);
            }
            a70Var.c.add(this);
            f(a70Var);
            if (z) {
                b(this.l, view, a70Var);
            } else {
                b(this.m, view, a70Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void g(a70 a70Var);

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
                a70 a70Var = new a70(findViewById);
                if (z) {
                    g(a70Var);
                } else {
                    d(a70Var);
                }
                a70Var.c.add(this);
                f(a70Var);
                if (z) {
                    b(this.l, findViewById, a70Var);
                } else {
                    b(this.m, findViewById, a70Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            a70 a70Var2 = new a70(view);
            if (z) {
                g(a70Var2);
            } else {
                d(a70Var2);
            }
            a70Var2.c.add(this);
            f(a70Var2);
            if (z) {
                b(this.l, view, a70Var2);
            } else {
                b(this.m, view, a70Var2);
            }
        }
    }

    public final void i(boolean z) {
        if (z) {
            ((n6) this.l.f).clear();
            ((SparseArray) this.l.g).clear();
            ((hr) this.l.h).a();
        } else {
            ((n6) this.m.f).clear();
            ((SparseArray) this.m.g).clear();
            ((hr) this.m.h).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s60 clone() {
        try {
            s60 s60Var = (s60) super.clone();
            s60Var.z = new ArrayList();
            s60Var.l = new we(9);
            s60Var.m = new we(9);
            s60Var.p = null;
            s60Var.q = null;
            s60Var.x = this;
            s60Var.y = null;
            return s60Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(ViewGroup viewGroup, a70 a70Var, a70 a70Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, we weVar, we weVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        a70 a70Var;
        Animator animator;
        a70 a70Var2;
        n6 p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i3 = 0;
        while (i3 < size) {
            a70 a70Var3 = (a70) arrayList.get(i3);
            a70 a70Var4 = (a70) arrayList2.get(i3);
            if (a70Var3 != null && !a70Var3.c.contains(this)) {
                a70Var3 = null;
            }
            if (a70Var4 != null && !a70Var4.c.contains(this)) {
                a70Var4 = null;
            }
            if ((a70Var3 != null || a70Var4 != null) && (a70Var3 == null || a70Var4 == null || s(a70Var3, a70Var4))) {
                Animator k = k(viewGroup, a70Var3, a70Var4);
                if (k != null) {
                    String str = this.f;
                    if (a70Var4 != null) {
                        view = a70Var4.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            a70Var2 = new a70(view);
                            a70 a70Var5 = (a70) ((n6) weVar2.f).get(view);
                            i = size;
                            if (a70Var5 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    String str2 = q[i4];
                                    a70Var2.a.put(str2, a70Var5.a.get(str2));
                                    i4++;
                                    i3 = i3;
                                    a70Var5 = a70Var5;
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
                                o60 o60Var = (o60) p.get((Animator) p.f(i6));
                                if (o60Var.c != null && o60Var.a == view && o60Var.b.equals(str) && o60Var.c.equals(a70Var2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = k;
                            a70Var2 = null;
                        }
                        k = animator;
                        a70Var = a70Var2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = a70Var3.b;
                        a70Var = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        o60 o60Var2 = new o60();
                        o60Var2.a = view;
                        o60Var2.b = str;
                        o60Var2.c = a70Var;
                        o60Var2.d = windowId;
                        o60Var2.e = this;
                        o60Var2.f = k;
                        p.put(k, o60Var2);
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
                o60 o60Var3 = (o60) p.get((Animator) this.z.get(sparseIntArray.keyAt(i7)));
                o60Var3.f.setStartDelay(o60Var3.f.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            v(this, r60.b);
            for (int i2 = 0; i2 < ((hr) this.l.h).e(); i2++) {
                View view = (View) ((hr) this.l.h).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((hr) this.m.h).e(); i3++) {
                View view2 = (View) ((hr) this.m.h).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    public final a70 n(View view, boolean z) {
        a7 a7Var = this.n;
        if (a7Var != null) {
            return a7Var.n(view, z);
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
            a70 a70Var = (a70) arrayList.get(i);
            if (a70Var == null) {
                return null;
            }
            if (a70Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (a70) (z ? this.q : this.p).get(i);
        }
        return null;
    }

    public final s60 o() {
        a7 a7Var = this.n;
        return a7Var != null ? a7Var.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final a70 r(View view, boolean z) {
        a7 a7Var = this.n;
        if (a7Var != null) {
            return a7Var.r(view, z);
        }
        return (a70) ((n6) (z ? this.l : this.m).f).get(view);
    }

    public boolean s(a70 a70Var, a70 a70Var2) {
        if (a70Var != null && a70Var2 != null) {
            String[] q = q();
            if (q != null) {
                for (String str : q) {
                    if (u(a70Var, a70Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = a70Var.a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(a70Var, a70Var2, (String) it.next())) {
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

    public final void v(s60 s60Var, r60 r60Var) {
        s60 s60Var2 = this.x;
        if (s60Var2 != null) {
            s60Var2.v(s60Var, r60Var);
        }
        ArrayList arrayList = this.y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.y.size();
        p60[] p60VarArr = this.r;
        if (p60VarArr == null) {
            p60VarArr = new p60[size];
        }
        this.r = null;
        p60[] p60VarArr2 = (p60[]) this.y.toArray(p60VarArr);
        for (int i = 0; i < size; i++) {
            r60Var.b(p60VarArr2[i], s60Var);
            p60VarArr2[i] = null;
        }
        this.r = p60VarArr2;
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
        v(this, r60.d);
        this.v = true;
    }

    public s60 x(p60 p60Var) {
        s60 s60Var;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            if (!arrayList.remove(p60Var) && (s60Var = this.x) != null) {
                s60Var.x(p60Var);
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
                v(this, r60.e);
            }
            this.v = false;
        }
    }

    public void z() {
        G();
        n6 p = p();
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
                    animator.addListener(new cn(this, p, 2));
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
                    animator.addListener(new v0(9, this));
                    animator.start();
                }
            }
        }
        this.z.clear();
        m();
    }

    public void B(zo zoVar) {
    }

    public void f(a70 a70Var) {
    }

    public void E() {
    }
}
