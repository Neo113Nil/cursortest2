package c5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import q3.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1712n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1713o;

    /* renamed from: p, reason: collision with root package name */
    public m[] f1714p;

    /* renamed from: z, reason: collision with root package name */
    public static final Animator[] f1702z = new Animator[0];
    public static final int[] A = {2, 1, 3, 4};
    public static final w5.f B = new w5.f(7);
    public static final ThreadLocal C = new ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public final String f1703d = getClass().getName();

    /* renamed from: e, reason: collision with root package name */
    public long f1704e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f1705f = -1;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f1706g = null;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1707h = new ArrayList();
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public x f1708j = new x(0);

    /* renamed from: k, reason: collision with root package name */
    public x f1709k = new x(0);

    /* renamed from: l, reason: collision with root package name */
    public a f1710l = null;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f1711m = A;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1715q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public Animator[] f1716r = f1702z;

    /* renamed from: s, reason: collision with root package name */
    public int f1717s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1718t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1719u = false;

    /* renamed from: v, reason: collision with root package name */
    public o f1720v = null;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f1721w = null;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f1722x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public w5.f f1723y = B;

    public static void b(x xVar, View view, w wVar) {
        o.e eVar = (o.e) xVar.f1737d;
        o.e eVar2 = (o.e) xVar.f1738e;
        SparseArray sparseArray = (SparseArray) xVar.f1739f;
        o.q qVar = (o.q) xVar.f1740g;
        eVar.put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = k0.f6120a;
        String e8 = q3.c0.e(view);
        if (e8 != null) {
            if (eVar2.containsKey(e8)) {
                eVar2.put(e8, null);
            } else {
                eVar2.put(e8, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (qVar.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    qVar.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) qVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    qVar.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static o.e p() {
        ThreadLocal threadLocal = C;
        o.e eVar = (o.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        o.e eVar2 = new o.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean u(w wVar, w wVar2, String str) {
        Object obj = wVar.f1734a.get(str);
        Object obj2 = wVar2.f1734a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j7) {
        this.f1705f = j7;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f1706g = timeInterpolator;
    }

    public void D(w5.f fVar) {
        if (fVar == null) {
            this.f1723y = B;
        } else {
            this.f1723y = fVar;
        }
    }

    public void F(long j7) {
        this.f1704e = j7;
    }

    public final void G() {
        if (this.f1717s == 0) {
            v(this, n.f1696b);
            this.f1719u = false;
        }
        this.f1717s++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f1705f != -1) {
            sb.append("dur(");
            sb.append(this.f1705f);
            sb.append(") ");
        }
        if (this.f1704e != -1) {
            sb.append("dly(");
            sb.append(this.f1704e);
            sb.append(") ");
        }
        if (this.f1706g != null) {
            sb.append("interp(");
            sb.append(this.f1706g);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1707h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
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
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i8));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(m mVar) {
        if (this.f1721w == null) {
            this.f1721w = new ArrayList();
        }
        this.f1721w.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.f1715q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1716r);
        this.f1716r = f1702z;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f1716r = animatorArr;
        v(this, n.f1698d);
    }

    public abstract void d(w wVar);

    public final void e(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z3) {
                g(wVar);
            } else {
                d(wVar);
            }
            wVar.f1736c.add(this);
            f(wVar);
            if (z3) {
                b(this.f1708j, view, wVar);
            } else {
                b(this.f1709k, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z3);
            }
        }
    }

    public abstract void g(w wVar);

    public final void h(ViewGroup viewGroup, boolean z3) {
        i(z3);
        ArrayList arrayList = this.f1707h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z3);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z3) {
                    g(wVar);
                } else {
                    d(wVar);
                }
                wVar.f1736c.add(this);
                f(wVar);
                if (z3) {
                    b(this.f1708j, findViewById, wVar);
                } else {
                    b(this.f1709k, findViewById, wVar);
                }
            }
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            View view = (View) arrayList2.get(i8);
            w wVar2 = new w(view);
            if (z3) {
                g(wVar2);
            } else {
                d(wVar2);
            }
            wVar2.f1736c.add(this);
            f(wVar2);
            if (z3) {
                b(this.f1708j, view, wVar2);
            } else {
                b(this.f1709k, view, wVar2);
            }
        }
    }

    public final void i(boolean z3) {
        if (z3) {
            ((o.e) this.f1708j.f1737d).clear();
            ((SparseArray) this.f1708j.f1739f).clear();
            ((o.q) this.f1708j.f1740g).a();
        } else {
            ((o.e) this.f1709k.f1737d).clear();
            ((SparseArray) this.f1709k.f1739f).clear();
            ((o.q) this.f1709k.f1740g).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f1722x = new ArrayList();
            oVar.f1708j = new x(0);
            oVar.f1709k = new x(0);
            oVar.f1712n = null;
            oVar.f1713o = null;
            oVar.f1720v = this;
            oVar.f1721w = null;
            return oVar;
        } catch (CloneNotSupportedException e8) {
            throw new RuntimeException(e8);
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, x xVar, x xVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i8;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        o.e p7 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i9 = 0;
        while (i9 < size) {
            w wVar3 = (w) arrayList.get(i9);
            w wVar4 = (w) arrayList2.get(i9);
            if (wVar3 != null && !wVar3.f1736c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f1736c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 != null || wVar4 != null) && (wVar3 == null || wVar4 == null || s(wVar3, wVar4))) {
                Animator k3 = k(viewGroup, wVar3, wVar4);
                if (k3 != null) {
                    String str = this.f1703d;
                    if (wVar4 != null) {
                        view = wVar4.f1735b;
                        String[] q4 = q();
                        if (q4 != null && q4.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((o.e) xVar2.f1737d).get(view);
                            i = size;
                            if (wVar5 != null) {
                                int i10 = 0;
                                while (i10 < q4.length) {
                                    String str2 = q4[i10];
                                    wVar2.f1734a.put(str2, wVar5.f1734a.get(str2));
                                    i10++;
                                    i9 = i9;
                                    wVar5 = wVar5;
                                }
                            }
                            i8 = i9;
                            int i11 = p7.f5542f;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    animator = k3;
                                    break;
                                }
                                l lVar = (l) p7.get((Animator) p7.f(i12));
                                if (lVar.f1692c != null && lVar.f1690a == view && lVar.f1691b.equals(str) && lVar.f1692c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            i = size;
                            i8 = i9;
                            animator = k3;
                            wVar2 = null;
                        }
                        k3 = animator;
                        wVar = wVar2;
                    } else {
                        i = size;
                        i8 = i9;
                        view = wVar3.f1735b;
                        wVar = null;
                    }
                    if (k3 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        l lVar2 = new l();
                        lVar2.f1690a = view;
                        lVar2.f1691b = str;
                        lVar2.f1692c = wVar;
                        lVar2.f1693d = windowId;
                        lVar2.f1694e = this;
                        lVar2.f1695f = k3;
                        p7.put(k3, lVar2);
                        this.f1722x.add(k3);
                    }
                    i9 = i8 + 1;
                    size = i;
                }
            }
            i = size;
            i8 = i9;
            i9 = i8 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                l lVar3 = (l) p7.get((Animator) this.f1722x.get(sparseIntArray.keyAt(i13)));
                lVar3.f1695f.setStartDelay(lVar3.f1695f.getStartDelay() + (sparseIntArray.valueAt(i13) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f1717s - 1;
        this.f1717s = i;
        if (i == 0) {
            v(this, n.f1697c);
            for (int i8 = 0; i8 < ((o.q) this.f1708j.f1740g).g(); i8++) {
                View view = (View) ((o.q) this.f1708j.f1740g).h(i8);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < ((o.q) this.f1709k.f1740g).g(); i9++) {
                View view2 = (View) ((o.q) this.f1709k.f1740g).h(i9);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1719u = true;
        }
    }

    public final w n(View view, boolean z3) {
        a aVar = this.f1710l;
        if (aVar != null) {
            return aVar.n(view, z3);
        }
        ArrayList arrayList = z3 ? this.f1712n : this.f1713o;
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
            w wVar = (w) arrayList.get(i);
            if (wVar == null) {
                return null;
            }
            if (wVar.f1735b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (w) (z3 ? this.f1713o : this.f1712n).get(i);
        }
        return null;
    }

    public final o o() {
        a aVar = this.f1710l;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final w r(View view, boolean z3) {
        a aVar = this.f1710l;
        if (aVar != null) {
            return aVar.r(view, z3);
        }
        return (w) ((o.e) (z3 ? this.f1708j : this.f1709k).f1737d).get(view);
    }

    public boolean s(w wVar, w wVar2) {
        if (wVar != null && wVar2 != null) {
            String[] q4 = q();
            if (q4 != null) {
                for (String str : q4) {
                    if (u(wVar, wVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wVar.f1734a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(wVar, wVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1707h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.i;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(o oVar, n nVar) {
        o oVar2 = this.f1720v;
        if (oVar2 != null) {
            oVar2.v(oVar, nVar);
        }
        ArrayList arrayList = this.f1721w;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f1721w.size();
        m[] mVarArr = this.f1714p;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f1714p = null;
        m[] mVarArr2 = (m[]) this.f1721w.toArray(mVarArr);
        for (int i = 0; i < size; i++) {
            m mVar = mVarArr2[i];
            switch (nVar.f1701a) {
                case 0:
                    mVar.a(oVar);
                    break;
                case 1:
                    mVar.d(oVar);
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    mVar.f(oVar);
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    mVar.b();
                    break;
                default:
                    mVar.c();
                    break;
            }
            mVarArr2[i] = null;
        }
        this.f1714p = mVarArr2;
    }

    public void w(View view) {
        if (this.f1719u) {
            return;
        }
        ArrayList arrayList = this.f1715q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1716r);
        this.f1716r = f1702z;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f1716r = animatorArr;
        v(this, n.f1699e);
        this.f1718t = true;
    }

    public o x(m mVar) {
        o oVar;
        ArrayList arrayList = this.f1721w;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f1720v) != null) {
                oVar.x(mVar);
            }
            if (this.f1721w.size() == 0) {
                this.f1721w = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f1718t) {
            if (!this.f1719u) {
                ArrayList arrayList = this.f1715q;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1716r);
                this.f1716r = f1702z;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f1716r = animatorArr;
                v(this, n.f1700f);
            }
            this.f1718t = false;
        }
    }

    public void z() {
        G();
        o.e p7 = p();
        ArrayList arrayList = this.f1722x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (p7.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new j(this, p7));
                    long j7 = this.f1705f;
                    if (j7 >= 0) {
                        animator.setDuration(j7);
                    }
                    long j8 = this.f1704e;
                    if (j8 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j8);
                    }
                    TimeInterpolator timeInterpolator = this.f1706g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new k(0, this));
                    animator.start();
                }
            }
        }
        this.f1722x.clear();
        m();
    }

    public void E() {
    }

    public void B(a.a aVar) {
    }

    public void f(w wVar) {
    }
}
