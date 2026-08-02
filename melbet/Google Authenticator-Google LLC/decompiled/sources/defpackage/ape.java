package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ape implements Cloneable {
    public ArrayList i;
    public ArrayList j;
    apa q;
    public yl r;
    private apb[] y;
    public static final Animator[] a = new Animator[0];
    private static final int[] v = {2, 1, 3, 4};
    private static final yl B = new yl();
    private static final ThreadLocal w = new ThreadLocal();
    private final String x = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    public cfz t = new cfz();
    public cfz u = new cfz();
    apl g = null;
    public final int[] h = v;
    final ArrayList k = new ArrayList();
    public Animator[] l = a;
    int m = 0;
    private boolean z = false;
    boolean n = false;
    public ape o = null;
    private ArrayList A = null;
    ArrayList p = new ArrayList();
    public yl s = B;

    private static void G(cfz cfzVar, View view, apm apmVar) {
        ((qy) cfzVar.b).put(view, apmVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) cfzVar.c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        int i = yq.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            qy qyVar = (qy) cfzVar.a;
            if (qyVar.containsKey(transitionName)) {
                qyVar.put(transitionName, null);
            } else {
                qyVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                qq qqVar = (qq) cfzVar.d;
                if (qqVar.a(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    qqVar.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) qqVar.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    qqVar.g(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            apm apmVar = new apm(view);
            if (z) {
                c(apmVar);
            } else {
                b(apmVar);
            }
            apmVar.c.add(this);
            m(apmVar);
            if (z) {
                G(this.t, view, apmVar);
            } else {
                G(this.u, view, apmVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    private static boolean f(apm apmVar, apm apmVar2, String str) {
        Map map = apmVar2.a;
        Object obj = apmVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static qi g() {
        ThreadLocal threadLocal = w;
        qi qiVar = (qi) threadLocal.get();
        if (qiVar != null) {
            return qiVar;
        }
        qi qiVar2 = new qi();
        threadLocal.set(qiVar2);
        return qiVar2;
    }

    public void A(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void C(long j) {
        this.b = j;
    }

    public void D(yl ylVar) {
        this.r = null;
    }

    public void E(yl ylVar) {
        if (ylVar == null) {
            this.s = B;
        } else {
            this.s = ylVar;
        }
    }

    public void F(ViewGroup viewGroup, cfz cfzVar, cfz cfzVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        apm apmVar;
        apm apmVar2;
        qi g = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            apm apmVar3 = (apm) arrayList.get(i);
            apm apmVar4 = (apm) arrayList2.get(i);
            if (apmVar3 != null && !apmVar3.c.contains(this)) {
                apmVar3 = null;
            }
            if (apmVar4 != null && !apmVar4.c.contains(this)) {
                apmVar4 = null;
            }
            if ((apmVar3 != null || apmVar4 != null) && (apmVar3 == null || apmVar4 == null || v(apmVar3, apmVar4))) {
                Animator a2 = a(viewGroup, apmVar3, apmVar4);
                if (a2 != null) {
                    if (apmVar4 != null) {
                        view = apmVar4.b;
                        String[] d = d();
                        if (d != null) {
                            apm apmVar5 = new apm(view);
                            apm apmVar6 = (apm) ((qy) cfzVar2.b).get(view);
                            if (apmVar6 != null) {
                                int i2 = 0;
                                while (i2 < d.length) {
                                    Map map = apmVar5.a;
                                    String[] strArr = d;
                                    String str = strArr[i2];
                                    map.put(str, apmVar6.a.get(str));
                                    i2++;
                                    d = strArr;
                                }
                            }
                            int i3 = g.d;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    apmVar2 = apmVar5;
                                    break;
                                }
                                car carVar = (car) g.get((Animator) g.c(i4));
                                Object obj = carVar.d;
                                int i5 = i3;
                                if (obj != null && carVar.f == view) {
                                    if (((String) carVar.a).equals(this.x) && ((apm) obj).equals(apmVar5)) {
                                        apmVar2 = apmVar5;
                                        a2 = null;
                                        break;
                                    }
                                }
                                i4++;
                                i3 = i5;
                            }
                        } else {
                            apmVar2 = null;
                        }
                        apmVar = apmVar2;
                    } else {
                        view = apmVar3.b;
                        apmVar = null;
                    }
                    View view2 = view;
                    Animator animator = a2;
                    if (animator != null) {
                        g.put(animator, new car(view2, this.x, this, viewGroup.getWindowId(), apmVar, animator));
                        this.p.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                car carVar2 = (car) g.get((Animator) this.p.get(sparseIntArray.keyAt(i6)));
                long valueAt = sparseIntArray.valueAt(i6);
                Animator animator2 = (Animator) carVar2.b;
                animator2.setStartDelay((valueAt - Long.MAX_VALUE) + animator2.getStartDelay());
            }
        }
    }

    public Animator a(ViewGroup viewGroup, apm apmVar, apm apmVar2) {
        return null;
    }

    public abstract void b(apm apmVar);

    public abstract void c(apm apmVar);

    public String[] d() {
        return null;
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ape clone() {
        try {
            ape apeVar = (ape) super.clone();
            apeVar.p = new ArrayList();
            apeVar.t = new cfz();
            apeVar.u = new cfz();
            apeVar.i = null;
            apeVar.j = null;
            apeVar.q = null;
            apeVar.o = this;
            apeVar.A = null;
            return apeVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final ape i() {
        apl aplVar = this.g;
        return aplVar != null ? aplVar.i() : this;
    }

    final apm j(View view, boolean z) {
        apl aplVar = this.g;
        if (aplVar != null) {
            return aplVar.j(view, z);
        }
        ArrayList arrayList = z ? this.i : this.j;
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
            apm apmVar = (apm) arrayList.get(i);
            if (apmVar == null) {
                return null;
            }
            if (apmVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (apm) (z ? this.j : this.i).get(i);
        }
        return null;
    }

    public final apm k(View view, boolean z) {
        apl aplVar = this.g;
        if (aplVar != null) {
            return aplVar.k(view, z);
        }
        return (apm) ((qy) (z ? this.t : this.u).b).get(view);
    }

    public String l(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        if (arrayList.size() > 0 || this.f.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.f;
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

    final void n(ViewGroup viewGroup, boolean z) {
        boolean z2;
        o(z);
        ArrayList arrayList = this.e;
        if (arrayList.size() <= 0 && this.f.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= arrayList.size()) {
                break;
            }
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                apm apmVar = new apm(findViewById);
                if (z) {
                    c(apmVar);
                } else {
                    b(apmVar);
                    z3 = false;
                }
                apmVar.c.add(this);
                m(apmVar);
                if (z3) {
                    G(this.t, findViewById, apmVar);
                } else {
                    G(this.u, findViewById, apmVar);
                }
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            apm apmVar2 = new apm(view);
            if (z) {
                c(apmVar2);
                z2 = true;
            } else {
                b(apmVar2);
                z2 = false;
            }
            apmVar2.c.add(this);
            m(apmVar2);
            if (z2) {
                G(this.t, view, apmVar2);
            } else {
                G(this.u, view, apmVar2);
            }
            i2++;
        }
    }

    final void o(boolean z) {
        if (z) {
            ((qy) this.t.b).clear();
            ((SparseArray) this.t.c).clear();
            ((qq) this.t.d).f();
        } else {
            ((qy) this.u.b).clear();
            ((SparseArray) this.u.c).clear();
            ((qq) this.u.d).f();
        }
    }

    protected final void p() {
        int i = this.m - 1;
        this.m = i;
        if (i == 0) {
            q(this, apd.b, false);
            for (int i2 = 0; i2 < ((qq) this.t.d).b(); i2++) {
                View view = (View) ((qq) this.t.d).e(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((qq) this.u.d).b(); i3++) {
                View view2 = (View) ((qq) this.u.d).e(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.n = true;
        }
    }

    public final void q(ape apeVar, apd apdVar, boolean z) {
        ape apeVar2 = this.o;
        if (apeVar2 != null) {
            apeVar2.q(apeVar, apdVar, false);
        }
        ArrayList arrayList = this.A;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.A.size();
        apb[] apbVarArr = this.y;
        if (apbVarArr == null) {
            apbVarArr = new apb[size];
        }
        this.y = null;
        apb[] apbVarArr2 = (apb[]) this.A.toArray(apbVarArr);
        for (int i = 0; i < size; i++) {
            apdVar.a(apbVarArr2[i], apeVar);
            apbVarArr2[i] = null;
        }
        this.y = apbVarArr2;
    }

    public void r(View view) {
        if (this.n) {
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.l);
        this.l = a;
        while (true) {
            size--;
            if (size < 0) {
                this.l = animatorArr;
                q(this, apd.d, false);
                this.z = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public void s(View view) {
        if (this.z) {
            if (!this.n) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.l);
                this.l = a;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.l = animatorArr;
                q(this, apd.e, false);
            }
            this.z = false;
        }
    }

    protected void t() {
        u();
        qi g = g();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (g.containsKey(animator)) {
                u();
                if (animator != null) {
                    animator.addListener(new aoy(this, g));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new aoz(this));
                    animator.start();
                }
            }
        }
        this.p.clear();
        p();
    }

    public final String toString() {
        return l("");
    }

    protected final void u() {
        if (this.m == 0) {
            q(this, apd.a, false);
            this.n = false;
        }
        this.m++;
    }

    public boolean v(apm apmVar, apm apmVar2) {
        if (apmVar != null && apmVar2 != null) {
            String[] d = d();
            if (d != null) {
                for (String str : d) {
                    if (f(apmVar, apmVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = apmVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (f(apmVar, apmVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        return (arrayList.size() == 0 && this.f.size() == 0) || arrayList.contains(Integer.valueOf(id)) || this.f.contains(view);
    }

    public final void x(apb apbVar) {
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A = arrayList;
        }
        arrayList.add(apbVar);
    }

    public final void y(apb apbVar) {
        ape apeVar;
        ArrayList arrayList = this.A;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(apbVar) && (apeVar = this.o) != null) {
            apeVar.y(apbVar);
        }
        if (this.A.size() == 0) {
            this.A = null;
        }
    }

    public void z(long j) {
        this.c = j;
    }

    public void B() {
    }

    public void m(apm apmVar) {
    }
}
