package f1;

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
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class o implements Cloneable {
    public static final Animator[] B = new Animator[0];
    public static final int[] C = {2, 1, 3, 4};
    public static final g2.f D = new g2.f(10);
    public static final ThreadLocal E = new ThreadLocal();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1705p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1706q;

    /* renamed from: r, reason: collision with root package name */
    public m[] f1707r;

    /* renamed from: f, reason: collision with root package name */
    public final String f1697f = getClass().getName();
    public long g = -1;
    public long h = -1;

    /* renamed from: i, reason: collision with root package name */
    public TimeInterpolator f1698i = null;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1699j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1700k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public androidx.emoji2.text.w f1701l = new androidx.emoji2.text.w(5);

    /* renamed from: m, reason: collision with root package name */
    public androidx.emoji2.text.w f1702m = new androidx.emoji2.text.w(5);

    /* renamed from: n, reason: collision with root package name */
    public a f1703n = null;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f1704o = C;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1708s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public Animator[] f1709t = B;

    /* renamed from: u, reason: collision with root package name */
    public int f1710u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1711v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1712w = false;

    /* renamed from: x, reason: collision with root package name */
    public o f1713x = null;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f1714y = null;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f1715z = new ArrayList();
    public g2.f A = D;

    public static void b(androidx.emoji2.text.w wVar, View view, w wVar2) {
        n.f fVar = (n.f) wVar.f368f;
        n.f fVar2 = (n.f) wVar.f369i;
        SparseArray sparseArray = (SparseArray) wVar.g;
        n.h hVar = (n.h) wVar.h;
        fVar.put(view, wVar2);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = j0.f2752a;
        String e4 = k0.b0.e(view);
        if (e4 != null) {
            if (fVar2.containsKey(e4)) {
                fVar2.put(e4, null);
            } else {
                fVar2.put(e4, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (hVar.f2931f) {
                    int i4 = hVar.f2932i;
                    long[] jArr = hVar.g;
                    Object[] objArr = hVar.h;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object obj = objArr[i6];
                        if (obj != n.i.f2933a) {
                            if (i6 != i5) {
                                jArr[i5] = jArr[i6];
                                objArr[i5] = obj;
                                objArr[i6] = null;
                            }
                            i5++;
                        }
                    }
                    hVar.f2931f = false;
                    hVar.f2932i = i5;
                }
                if (o.a.b(hVar.g, hVar.f2932i, itemIdAtPosition) < 0) {
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

    public static n.f p() {
        ThreadLocal threadLocal = E;
        n.f fVar = (n.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        n.f fVar2 = new n.f(0);
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean u(w wVar, w wVar2, String str) {
        Object obj = wVar.f1724a.get(str);
        Object obj2 = wVar2.f1724a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j4) {
        this.h = j4;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f1698i = timeInterpolator;
    }

    public void D(g2.f fVar) {
        if (fVar == null) {
            this.A = D;
        } else {
            this.A = fVar;
        }
    }

    public void F(long j4) {
        this.g = j4;
    }

    public final void G() {
        if (this.f1710u == 0) {
            v(this, n.f1693a);
            this.f1712w = false;
        }
        this.f1710u++;
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
        if (this.f1698i != null) {
            sb.append("interp(");
            sb.append(this.f1698i);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1699j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1700k;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i4));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i5));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(m mVar) {
        if (this.f1714y == null) {
            this.f1714y = new ArrayList();
        }
        this.f1714y.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.f1708s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1709t);
        this.f1709t = B;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.cancel();
        }
        this.f1709t = animatorArr;
        v(this, n.c);
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
            wVar.c.add(this);
            f(wVar);
            if (z3) {
                b(this.f1701l, view, wVar);
            } else {
                b(this.f1702m, view, wVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4), z3);
            }
        }
    }

    public abstract void g(w wVar);

    public final void h(ViewGroup viewGroup, boolean z3) {
        i(z3);
        ArrayList arrayList = this.f1699j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1700k;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z3);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (findViewById != null) {
                w wVar = new w(findViewById);
                if (z3) {
                    g(wVar);
                } else {
                    d(wVar);
                }
                wVar.c.add(this);
                f(wVar);
                if (z3) {
                    b(this.f1701l, findViewById, wVar);
                } else {
                    b(this.f1702m, findViewById, wVar);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            w wVar2 = new w(view);
            if (z3) {
                g(wVar2);
            } else {
                d(wVar2);
            }
            wVar2.c.add(this);
            f(wVar2);
            if (z3) {
                b(this.f1701l, view, wVar2);
            } else {
                b(this.f1702m, view, wVar2);
            }
        }
    }

    public final void i(boolean z3) {
        if (z3) {
            ((n.f) this.f1701l.f368f).clear();
            ((SparseArray) this.f1701l.g).clear();
            ((n.h) this.f1701l.h).a();
        } else {
            ((n.f) this.f1702m.f368f).clear();
            ((SparseArray) this.f1702m.g).clear();
            ((n.h) this.f1702m.h).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f1715z = new ArrayList();
            oVar.f1701l = new androidx.emoji2.text.w(5);
            oVar.f1702m = new androidx.emoji2.text.w(5);
            oVar.f1705p = null;
            oVar.f1706q = null;
            oVar.f1713x = this;
            oVar.f1714y = null;
            return oVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, androidx.emoji2.text.w wVar, androidx.emoji2.text.w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int i5;
        View view;
        w wVar3;
        Animator animator;
        w wVar4;
        n.f p4 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i6 = 0;
        while (i6 < size) {
            w wVar5 = (w) arrayList.get(i6);
            w wVar6 = (w) arrayList2.get(i6);
            if (wVar5 != null && !wVar5.c.contains(this)) {
                wVar5 = null;
            }
            if (wVar6 != null && !wVar6.c.contains(this)) {
                wVar6 = null;
            }
            if ((wVar5 != null || wVar6 != null) && (wVar5 == null || wVar6 == null || s(wVar5, wVar6))) {
                Animator k4 = k(viewGroup, wVar5, wVar6);
                if (k4 != null) {
                    String str = this.f1697f;
                    if (wVar6 != null) {
                        view = wVar6.f1725b;
                        String[] q4 = q();
                        if (q4 != null && q4.length > 0) {
                            wVar4 = new w(view);
                            w wVar7 = (w) ((n.f) wVar2.f368f).get(view);
                            i4 = size;
                            if (wVar7 != null) {
                                int i7 = 0;
                                while (i7 < q4.length) {
                                    String str2 = q4[i7];
                                    wVar4.f1724a.put(str2, wVar7.f1724a.get(str2));
                                    i7++;
                                    i6 = i6;
                                    wVar7 = wVar7;
                                }
                            }
                            i5 = i6;
                            int i8 = p4.h;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    animator = k4;
                                    break;
                                }
                                l lVar = (l) p4.get((Animator) p4.f(i9));
                                if (lVar.c != null && lVar.f1688a == view && lVar.f1689b.equals(str) && lVar.c.equals(wVar4)) {
                                    animator = null;
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            i4 = size;
                            i5 = i6;
                            animator = k4;
                            wVar4 = null;
                        }
                        k4 = animator;
                        wVar3 = wVar4;
                    } else {
                        i4 = size;
                        i5 = i6;
                        view = wVar5.f1725b;
                        wVar3 = null;
                    }
                    if (k4 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        l lVar2 = new l();
                        lVar2.f1688a = view;
                        lVar2.f1689b = str;
                        lVar2.c = wVar3;
                        lVar2.f1690d = windowId;
                        lVar2.f1691e = this;
                        lVar2.f1692f = k4;
                        p4.put(k4, lVar2);
                        this.f1715z.add(k4);
                    }
                    i6 = i5 + 1;
                    size = i4;
                }
            }
            i4 = size;
            i5 = i6;
            i6 = i5 + 1;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                l lVar3 = (l) p4.get((Animator) this.f1715z.get(sparseIntArray.keyAt(i10)));
                lVar3.f1692f.setStartDelay(lVar3.f1692f.getStartDelay() + (sparseIntArray.valueAt(i10) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i4 = this.f1710u - 1;
        this.f1710u = i4;
        if (i4 == 0) {
            v(this, n.f1694b);
            for (int i5 = 0; i5 < ((n.h) this.f1701l.h).e(); i5++) {
                View view = (View) ((n.h) this.f1701l.h).f(i5);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < ((n.h) this.f1702m.h).e(); i6++) {
                View view2 = (View) ((n.h) this.f1702m.h).f(i6);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1712w = true;
        }
    }

    public final w n(View view, boolean z3) {
        a aVar = this.f1703n;
        if (aVar != null) {
            return aVar.n(view, z3);
        }
        ArrayList arrayList = z3 ? this.f1705p : this.f1706q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            w wVar = (w) arrayList.get(i4);
            if (wVar == null) {
                return null;
            }
            if (wVar.f1725b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (w) (z3 ? this.f1706q : this.f1705p).get(i4);
        }
        return null;
    }

    public final o o() {
        a aVar = this.f1703n;
        return aVar != null ? aVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final w r(View view, boolean z3) {
        a aVar = this.f1703n;
        if (aVar != null) {
            return aVar.r(view, z3);
        }
        return (w) ((n.f) (z3 ? this.f1701l : this.f1702m).f368f).get(view);
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
                Iterator it = wVar.f1724a.keySet().iterator();
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
        ArrayList arrayList = this.f1699j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1700k;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(o oVar, n nVar) {
        o oVar2 = this.f1713x;
        if (oVar2 != null) {
            oVar2.v(oVar, nVar);
        }
        ArrayList arrayList = this.f1714y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f1714y.size();
        m[] mVarArr = this.f1707r;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f1707r = null;
        m[] mVarArr2 = (m[]) this.f1714y.toArray(mVarArr);
        for (int i4 = 0; i4 < size; i4++) {
            nVar.a(mVarArr2[i4], oVar);
            mVarArr2[i4] = null;
        }
        this.f1707r = mVarArr2;
    }

    public void w(View view) {
        if (this.f1712w) {
            return;
        }
        ArrayList arrayList = this.f1708s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1709t);
        this.f1709t = B;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.pause();
        }
        this.f1709t = animatorArr;
        v(this, n.f1695d);
        this.f1711v = true;
    }

    public o x(m mVar) {
        o oVar;
        ArrayList arrayList = this.f1714y;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f1713x) != null) {
                oVar.x(mVar);
            }
            if (this.f1714y.size() == 0) {
                this.f1714y = null;
            }
        }
        return this;
    }

    public void y(View view) {
        if (this.f1711v) {
            if (!this.f1712w) {
                ArrayList arrayList = this.f1708s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1709t);
                this.f1709t = B;
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    Animator animator = animatorArr[i4];
                    animatorArr[i4] = null;
                    animator.resume();
                }
                this.f1709t = animatorArr;
                v(this, n.f1696e);
            }
            this.f1711v = false;
        }
    }

    public void z() {
        G();
        n.f p4 = p();
        ArrayList arrayList = this.f1715z;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Animator animator = (Animator) obj;
            if (p4.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new j(this, p4, 0));
                    long j4 = this.h;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j5 = this.g;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.f1698i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new k(0, this));
                    animator.start();
                }
            }
        }
        this.f1715z.clear();
        m();
    }

    public void B(k3.m mVar) {
    }

    public void f(w wVar) {
    }

    public void E() {
    }
}
