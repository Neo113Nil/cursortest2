package j1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class o implements Cloneable {
    public static final Animator[] C = new Animator[0];
    public static final int[] D = {2, 1, 3, 4};
    public static final l2.f E = new l2.f(16);
    public static final ThreadLocal F = new ThreadLocal();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f1947q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f1948r;

    /* renamed from: s, reason: collision with root package name */
    public m[] f1949s;

    /* renamed from: f, reason: collision with root package name */
    public final String f1937f = getClass().getName();

    /* renamed from: g, reason: collision with root package name */
    public long f1938g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f1939h = -1;
    public TimeInterpolator i = null;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1940j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1941k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1942l = null;

    /* renamed from: m, reason: collision with root package name */
    public a0.j f1943m = new a0.j(6);

    /* renamed from: n, reason: collision with root package name */
    public a0.j f1944n = new a0.j(6);

    /* renamed from: o, reason: collision with root package name */
    public a f1945o = null;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f1946p = D;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f1950t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public Animator[] f1951u = C;

    /* renamed from: v, reason: collision with root package name */
    public int f1952v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1953w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1954x = false;

    /* renamed from: y, reason: collision with root package name */
    public o f1955y = null;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f1956z = null;
    public ArrayList A = new ArrayList();
    public l2.f B = E;

    public static void b(a0.j jVar, View view, w wVar) {
        q.f fVar = (q.f) jVar.f100f;
        q.f fVar2 = (q.f) jVar.i;
        SparseArray sparseArray = (SparseArray) jVar.f101g;
        q.h hVar = (q.h) jVar.f102h;
        fVar.put(view, wVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = l0.f2757a;
        String e4 = n0.d0.e(view);
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
                if (hVar.f3029f) {
                    int i = hVar.i;
                    long[] jArr = hVar.f3030g;
                    Object[] objArr = hVar.f3031h;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object obj = objArr[i5];
                        if (obj != q.i.f3032a) {
                            if (i5 != i4) {
                                jArr[i4] = jArr[i5];
                                objArr[i4] = obj;
                                objArr[i5] = null;
                            }
                            i4++;
                        }
                    }
                    hVar.f3029f = false;
                    hVar.i = i4;
                }
                if (r.a.b(hVar.f3030g, hVar.i, itemIdAtPosition) < 0) {
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

    public static q.f q() {
        ThreadLocal threadLocal = F;
        q.f fVar = (q.f) threadLocal.get();
        if (fVar != null) {
            return fVar;
        }
        q.f fVar2 = new q.f(0);
        threadLocal.set(fVar2);
        return fVar2;
    }

    public static boolean v(w wVar, w wVar2, String str) {
        Object obj = wVar.f1967a.get(str);
        Object obj2 = wVar2.f1967a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A() {
        H();
        q.f q3 = q();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (q3.containsKey(animator)) {
                H();
                if (animator != null) {
                    animator.addListener(new j(this, q3));
                    long j4 = this.f1939h;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j5 = this.f1938g;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.i;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new k(0, this));
                    animator.start();
                }
            }
        }
        this.A.clear();
        m();
    }

    public void B(long j4) {
        this.f1939h = j4;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.i = timeInterpolator;
    }

    public void E(l2.f fVar) {
        if (fVar == null) {
            this.B = E;
        } else {
            this.B = fVar;
        }
    }

    public void G(long j4) {
        this.f1938g = j4;
    }

    public final void H() {
        if (this.f1952v == 0) {
            w(this, n.f1933a);
            this.f1954x = false;
        }
        this.f1952v++;
    }

    public String I(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f1939h != -1) {
            sb.append("dur(");
            sb.append(this.f1939h);
            sb.append(") ");
        }
        if (this.f1938g != -1) {
            sb.append("dly(");
            sb.append(this.f1938g);
            sb.append(") ");
        }
        if (this.i != null) {
            sb.append("interp(");
            sb.append(this.i);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1940j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1941k;
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

    public void a(m mVar) {
        if (this.f1956z == null) {
            this.f1956z = new ArrayList();
        }
        this.f1956z.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.f1950t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1951u);
        this.f1951u = C;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f1951u = animatorArr;
        w(this, n.f1935c);
    }

    public abstract void d(w wVar);

    public final void e(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList arrayList = this.f1942l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f1942l.get(i)).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            w wVar = new w(view);
            if (z3) {
                g(wVar);
            } else {
                d(wVar);
            }
            wVar.f1969c.add(this);
            f(wVar);
            if (z3) {
                b(this.f1943m, view, wVar);
            } else {
                b(this.f1944n, view, wVar);
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
        ArrayList arrayList = this.f1940j;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1941k;
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
                wVar.f1969c.add(this);
                f(wVar);
                if (z3) {
                    b(this.f1943m, findViewById, wVar);
                } else {
                    b(this.f1944n, findViewById, wVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            w wVar2 = new w(view);
            if (z3) {
                g(wVar2);
            } else {
                d(wVar2);
            }
            wVar2.f1969c.add(this);
            f(wVar2);
            if (z3) {
                b(this.f1943m, view, wVar2);
            } else {
                b(this.f1944n, view, wVar2);
            }
        }
    }

    public final void i(boolean z3) {
        if (z3) {
            ((q.f) this.f1943m.f100f).clear();
            ((SparseArray) this.f1943m.f101g).clear();
            ((q.h) this.f1943m.f102h).a();
        } else {
            ((q.f) this.f1944n.f100f).clear();
            ((SparseArray) this.f1944n.f101g).clear();
            ((q.h) this.f1944n.f102h).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.A = new ArrayList();
            oVar.f1943m = new a0.j(6);
            oVar.f1944n = new a0.j(6);
            oVar.f1947q = null;
            oVar.f1948r = null;
            oVar.f1955y = this;
            oVar.f1956z = null;
            return oVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, a0.j jVar, a0.j jVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i4;
        View view;
        w wVar;
        Animator animator;
        w wVar2;
        q.f q3 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i5 = 0;
        while (i5 < size) {
            w wVar3 = (w) arrayList.get(i5);
            w wVar4 = (w) arrayList2.get(i5);
            if (wVar3 != null && !wVar3.f1969c.contains(this)) {
                wVar3 = null;
            }
            if (wVar4 != null && !wVar4.f1969c.contains(this)) {
                wVar4 = null;
            }
            if ((wVar3 != null || wVar4 != null) && (wVar3 == null || wVar4 == null || t(wVar3, wVar4))) {
                Animator k4 = k(viewGroup, wVar3, wVar4);
                if (k4 != null) {
                    String str = this.f1937f;
                    if (wVar4 != null) {
                        view = wVar4.f1968b;
                        String[] r3 = r();
                        if (r3 != null && r3.length > 0) {
                            wVar2 = new w(view);
                            w wVar5 = (w) ((q.f) jVar2.f100f).get(view);
                            i = size;
                            if (wVar5 != null) {
                                int i6 = 0;
                                while (i6 < r3.length) {
                                    String str2 = r3[i6];
                                    wVar2.f1967a.put(str2, wVar5.f1967a.get(str2));
                                    i6++;
                                    i5 = i5;
                                    wVar5 = wVar5;
                                }
                            }
                            i4 = i5;
                            int i7 = q3.f3036h;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = k4;
                                    break;
                                }
                                l lVar = (l) q3.get((Animator) q3.f(i8));
                                if (lVar.f1930c != null && lVar.f1928a == view && lVar.f1929b.equals(str) && lVar.f1930c.equals(wVar2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i = size;
                            i4 = i5;
                            animator = k4;
                            wVar2 = null;
                        }
                        k4 = animator;
                        wVar = wVar2;
                    } else {
                        i = size;
                        i4 = i5;
                        view = wVar3.f1968b;
                        wVar = null;
                    }
                    if (k4 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        l lVar2 = new l();
                        lVar2.f1928a = view;
                        lVar2.f1929b = str;
                        lVar2.f1930c = wVar;
                        lVar2.d = windowId;
                        lVar2.f1931e = this;
                        lVar2.f1932f = k4;
                        q3.put(k4, lVar2);
                        this.A.add(k4);
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
                l lVar3 = (l) q3.get((Animator) this.A.get(sparseIntArray.keyAt(i9)));
                lVar3.f1932f.setStartDelay(lVar3.f1932f.getStartDelay() + (sparseIntArray.valueAt(i9) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f1952v - 1;
        this.f1952v = i;
        if (i == 0) {
            w(this, n.f1934b);
            for (int i4 = 0; i4 < ((q.h) this.f1943m.f102h).e(); i4++) {
                View view = (View) ((q.h) this.f1943m.f102h).f(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < ((q.h) this.f1944n.f102h).e(); i5++) {
                View view2 = (View) ((q.h) this.f1944n.f102h).f(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1954x = true;
        }
    }

    public void n() {
        ArrayList arrayList = this.f1942l;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(TextView.class)) {
            arrayList.add(TextView.class);
        }
        this.f1942l = arrayList;
    }

    public final w o(View view, boolean z3) {
        a aVar = this.f1945o;
        if (aVar != null) {
            return aVar.o(view, z3);
        }
        ArrayList arrayList = z3 ? this.f1947q : this.f1948r;
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
            if (wVar.f1968b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (w) (z3 ? this.f1948r : this.f1947q).get(i);
        }
        return null;
    }

    public final o p() {
        a aVar = this.f1945o;
        return aVar != null ? aVar.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final w s(View view, boolean z3) {
        a aVar = this.f1945o;
        if (aVar != null) {
            return aVar.s(view, z3);
        }
        return (w) ((q.f) (z3 ? this.f1943m : this.f1944n).f100f).get(view);
    }

    public boolean t(w wVar, w wVar2) {
        if (wVar != null && wVar2 != null) {
            String[] r3 = r();
            if (r3 != null) {
                for (String str : r3) {
                    if (v(wVar, wVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wVar.f1967a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(wVar, wVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return I("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1942l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f1942l.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        ArrayList arrayList2 = this.f1940j;
        int size2 = arrayList2.size();
        ArrayList arrayList3 = this.f1941k;
        return (size2 == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }

    public final void w(o oVar, n nVar) {
        o oVar2 = this.f1955y;
        if (oVar2 != null) {
            oVar2.w(oVar, nVar);
        }
        ArrayList arrayList = this.f1956z;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f1956z.size();
        m[] mVarArr = this.f1949s;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f1949s = null;
        m[] mVarArr2 = (m[]) this.f1956z.toArray(mVarArr);
        for (int i = 0; i < size; i++) {
            nVar.a(mVarArr2[i], oVar);
            mVarArr2[i] = null;
        }
        this.f1949s = mVarArr2;
    }

    public void x(View view) {
        if (this.f1954x) {
            return;
        }
        ArrayList arrayList = this.f1950t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1951u);
        this.f1951u = C;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f1951u = animatorArr;
        w(this, n.d);
        this.f1953w = true;
    }

    public o y(m mVar) {
        o oVar;
        ArrayList arrayList = this.f1956z;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (oVar = this.f1955y) != null) {
                oVar.y(mVar);
            }
            if (this.f1956z.size() == 0) {
                this.f1956z = null;
            }
        }
        return this;
    }

    public void z(View view) {
        if (this.f1953w) {
            if (!this.f1954x) {
                ArrayList arrayList = this.f1950t;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1951u);
                this.f1951u = C;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f1951u = animatorArr;
                w(this, n.f1936e);
            }
            this.f1953w = false;
        }
    }

    public void C(h.a aVar) {
    }

    public void f(w wVar) {
    }

    public void F() {
    }
}
