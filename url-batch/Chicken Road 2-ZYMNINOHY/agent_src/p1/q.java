package p1;

import E.AbstractC0005f;
import E.H;
import a0.C0144j;
import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.C1204b;
import q.AbstractC1350a;

/* loaded from: classes.dex */
public abstract class q implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f14772s = {2, 1, 3, 4};

    /* renamed from: t, reason: collision with root package name */
    public static final C0144j f14773t = new C0144j(26, false);

    /* renamed from: u, reason: collision with root package name */
    public static final ThreadLocal f14774u = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f14783i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f14784j;

    /* renamed from: q, reason: collision with root package name */
    public O3.d f14789q;

    /* renamed from: a, reason: collision with root package name */
    public final String f14775a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f14776b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14777c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14778d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public G1.c f14779e = new G1.c(12);

    /* renamed from: f, reason: collision with root package name */
    public G1.c f14780f = new G1.c(12);

    /* renamed from: g, reason: collision with root package name */
    public v f14781g = null;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f14782h = f14772s;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f14785k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public int f14786l = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14787m = false;
    public boolean n = false;
    public ArrayList o = null;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f14788p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public C0144j f14790r = f14773t;

    public static void c(G1.c cVar, View view, x xVar) {
        p.e eVar = (p.e) cVar.f835b;
        p.e eVar2 = (p.e) cVar.f838e;
        SparseArray sparseArray = (SparseArray) cVar.f836c;
        p.g gVar = (p.g) cVar.f837d;
        eVar.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = H.f375a;
        String c4 = E.A.c(view);
        if (c4 != null) {
            if (eVar2.containsKey(c4)) {
                eVar2.put(c4, null);
            } else {
                eVar2.put(c4, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar.f14653a) {
                    int i4 = gVar.f14656d;
                    long[] jArr = gVar.f14654b;
                    Object[] objArr = gVar.f14655c;
                    int i5 = 0;
                    for (int i6 = 0; i6 < i4; i6++) {
                        Object obj = objArr[i6];
                        if (obj != p.h.f14657a) {
                            if (i6 != i5) {
                                jArr[i5] = jArr[i6];
                                objArr[i5] = obj;
                                objArr[i6] = null;
                            }
                            i5++;
                        }
                    }
                    gVar.f14653a = false;
                    gVar.f14656d = i5;
                }
                if (AbstractC1350a.b(gVar.f14654b, gVar.f14656d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    gVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) gVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    gVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static p.e p() {
        ThreadLocal threadLocal = f14774u;
        p.e eVar = (p.e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        p.e eVar2 = new p.e(0);
        threadLocal.set(eVar2);
        return eVar2;
    }

    public static boolean u(x xVar, x xVar2, String str) {
        Object obj = xVar.f14804a.get(str);
        Object obj2 = xVar2.f14804a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(O3.d dVar) {
        this.f14789q = dVar;
    }

    public void C(C0144j c0144j) {
        if (c0144j == null) {
            this.f14790r = f14773t;
        } else {
            this.f14790r = c0144j;
        }
    }

    public void E(long j4) {
        this.f14776b = j4;
    }

    public final void F() {
        if (this.f14786l == 0) {
            ArrayList arrayList = this.o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.o.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((p) arrayList2.get(i4)).e(this);
                }
            }
            this.n = false;
        }
        this.f14786l++;
    }

    public String G(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f14776b != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("dly(");
            str2 = AbstractC0005f.p(sb, this.f14776b, ") ");
        }
        ArrayList arrayList = this.f14777c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f14778d;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String z = AbstractC0005f.z(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (i4 > 0) {
                    z = AbstractC0005f.z(z, ", ");
                }
                z = z + arrayList.get(i4);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                if (i5 > 0) {
                    z = AbstractC0005f.z(z, ", ");
                }
                z = z + arrayList2.get(i5);
            }
        }
        return AbstractC0005f.z(z, ")");
    }

    public void a(p pVar) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(pVar);
    }

    public void b(View view) {
        this.f14778d.add(view);
    }

    public void d() {
        ArrayList arrayList = this.f14785k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.o;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) this.o.clone();
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((p) arrayList3.get(i4)).c();
        }
    }

    public abstract void e(x xVar);

    public final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z) {
                h(xVar);
            } else {
                e(xVar);
            }
            xVar.f14806c.add(this);
            g(xVar);
            if (z) {
                c(this.f14779e, view, xVar);
            } else {
                c(this.f14780f, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), z);
            }
        }
    }

    public abstract void h(x xVar);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.f14777c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f14778d;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (findViewById != null) {
                x xVar = new x(findViewById);
                if (z) {
                    h(xVar);
                } else {
                    e(xVar);
                }
                xVar.f14806c.add(this);
                g(xVar);
                if (z) {
                    c(this.f14779e, findViewById, xVar);
                } else {
                    c(this.f14780f, findViewById, xVar);
                }
            }
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            View view = (View) arrayList2.get(i5);
            x xVar2 = new x(view);
            if (z) {
                h(xVar2);
            } else {
                e(xVar2);
            }
            xVar2.f14806c.add(this);
            g(xVar2);
            if (z) {
                c(this.f14779e, view, xVar2);
            } else {
                c(this.f14780f, view, xVar2);
            }
        }
    }

    public final void j(boolean z) {
        if (z) {
            ((p.e) this.f14779e.f835b).clear();
            ((SparseArray) this.f14779e.f836c).clear();
            ((p.g) this.f14779e.f837d).a();
        } else {
            ((p.e) this.f14780f.f835b).clear();
            ((SparseArray) this.f14780f.f836c).clear();
            ((p.g) this.f14780f.f837d).a();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public q clone() {
        try {
            q qVar = (q) super.clone();
            qVar.f14788p = new ArrayList();
            qVar.f14779e = new G1.c(12);
            qVar.f14780f = new G1.c(12);
            qVar.f14783i = null;
            qVar.f14784j = null;
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, G1.c cVar, G1.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator l4;
        int i4;
        int i5;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        p.e p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            x xVar3 = (x) arrayList.get(i6);
            x xVar4 = (x) arrayList2.get(i6);
            if (xVar3 != null && !xVar3.f14806c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f14806c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null) && ((xVar3 == null || xVar4 == null || s(xVar3, xVar4)) && (l4 = l(viewGroup, xVar3, xVar4)) != null)) {
                String str = this.f14775a;
                if (xVar4 != null) {
                    view = xVar4.f14805b;
                    String[] q4 = q();
                    if (q4 != null && q4.length > 0) {
                        xVar2 = new x(view);
                        x xVar5 = (x) ((p.e) cVar2.f835b).get(view);
                        i4 = size;
                        if (xVar5 != null) {
                            int i7 = 0;
                            while (i7 < q4.length) {
                                String str2 = q4[i7];
                                xVar2.f14804a.put(str2, xVar5.f14804a.get(str2));
                                i7++;
                                i6 = i6;
                                xVar5 = xVar5;
                            }
                        }
                        i5 = i6;
                        int i8 = p2.f14667c;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= i8) {
                                animator = l4;
                                break;
                            }
                            o oVar = (o) p2.get((Animator) p2.f(i9));
                            if (oVar.f14769c != null && oVar.f14767a == view && oVar.f14768b.equals(str) && oVar.f14769c.equals(xVar2)) {
                                animator = null;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        i4 = size;
                        i5 = i6;
                        animator = l4;
                        xVar2 = null;
                    }
                    l4 = animator;
                    xVar = xVar2;
                } else {
                    i4 = size;
                    i5 = i6;
                    view = xVar3.f14805b;
                    xVar = null;
                }
                if (l4 != null) {
                    A a3 = y.f14807a;
                    E e4 = new E(viewGroup);
                    o oVar2 = new o();
                    oVar2.f14767a = view;
                    oVar2.f14768b = str;
                    oVar2.f14769c = xVar;
                    oVar2.f14770d = e4;
                    oVar2.f14771e = this;
                    p2.put(l4, oVar2);
                    this.f14788p.add(l4);
                }
            } else {
                i4 = size;
                i5 = i6;
            }
            i6 = i5 + 1;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                Animator animator2 = (Animator) this.f14788p.get(sparseIntArray.keyAt(i10));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i10) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i4 = this.f14786l - 1;
        this.f14786l = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.o;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.o.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((p) arrayList2.get(i5)).a(this);
                }
            }
            for (int i6 = 0; i6 < ((p.g) this.f14779e.f837d).e(); i6++) {
                View view = (View) ((p.g) this.f14779e.f837d).f(i6);
                if (view != null) {
                    Field field = H.f375a;
                    view.setHasTransientState(false);
                }
            }
            for (int i7 = 0; i7 < ((p.g) this.f14780f.f837d).e(); i7++) {
                View view2 = (View) ((p.g) this.f14780f.f837d).f(i7);
                if (view2 != null) {
                    Field field2 = H.f375a;
                    view2.setHasTransientState(false);
                }
            }
            this.n = true;
        }
    }

    public final x o(View view, boolean z) {
        v vVar = this.f14781g;
        if (vVar != null) {
            return vVar.o(view, z);
        }
        ArrayList arrayList = z ? this.f14783i : this.f14784j;
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
            x xVar = (x) arrayList.get(i4);
            if (xVar == null) {
                return null;
            }
            if (xVar.f14805b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (x) (z ? this.f14784j : this.f14783i).get(i4);
        }
        return null;
    }

    public String[] q() {
        return null;
    }

    public final x r(View view, boolean z) {
        v vVar = this.f14781g;
        if (vVar != null) {
            return vVar.r(view, z);
        }
        return (x) ((p.e) (z ? this.f14779e : this.f14780f).f835b).get(view);
    }

    public boolean s(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] q4 = q();
            if (q4 != null) {
                for (String str : q4) {
                    if (u(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f14804a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f14777c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f14778d;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G("");
    }

    public void v(View view) {
        if (this.n) {
            return;
        }
        ArrayList arrayList = this.f14785k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).pause();
        }
        ArrayList arrayList2 = this.o;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.o.clone();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((p) arrayList3.get(i4)).b();
            }
        }
        this.f14787m = true;
    }

    public void w(p pVar) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
        if (this.o.size() == 0) {
            this.o = null;
        }
    }

    public void x(View view) {
        this.f14778d.remove(view);
    }

    public void y(View view) {
        if (this.f14787m) {
            if (!this.n) {
                ArrayList arrayList = this.f14785k;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.o;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.o.clone();
                    int size2 = arrayList3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((p) arrayList3.get(i4)).d();
                    }
                }
            }
            this.f14787m = false;
        }
    }

    public void z() {
        F();
        p.e p2 = p();
        ArrayList arrayList = this.f14788p;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Animator animator = (Animator) obj;
            if (p2.containsKey(animator)) {
                F();
                if (animator != null) {
                    animator.addListener(new n(this, p2));
                    long j4 = this.f14776b;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    animator.addListener(new C1204b(1, this));
                    animator.start();
                }
            }
        }
        this.f14788p.clear();
        n();
    }

    public void B() {
    }

    public void D() {
    }

    public void g(x xVar) {
    }
}
