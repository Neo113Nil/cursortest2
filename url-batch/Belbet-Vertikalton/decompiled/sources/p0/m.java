package p0;

import M.P;
import M.a0;
import a.AbstractC0058a;
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
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3838w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3839x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final i f3840y = new i();

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3841z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3849k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3850l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f3851m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3842a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3843b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3844c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f3845d = null;
    public final ArrayList e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3846f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public V.v f3847g = new V.v(4);

    /* renamed from: h, reason: collision with root package name */
    public V.v f3848h = new V.v(4);
    public C0325a i = null;
    public final int[] j = f3839x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3852n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3853o = f3838w;

    /* renamed from: p, reason: collision with root package name */
    public int f3854p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3855q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3856r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f3857s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3858t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3859u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public i f3860v = f3840y;

    public static void b(V.v vVar, View view, u uVar) {
        ((q.b) vVar.f1305a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) vVar.f1306b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = P.f711a;
        String k2 = M.E.k(view);
        if (k2 != null) {
            q.b bVar = (q.b) vVar.f1308d;
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
                q.e eVar = (q.e) vVar.f1307c;
                if (eVar.f3901a) {
                    eVar.b();
                }
                if (q.d.b(eVar.f3902b, eVar.f3904d, itemIdAtPosition) < 0) {
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

    public static q.b p() {
        ThreadLocal threadLocal = f3841z;
        q.b bVar = (q.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        q.b bVar2 = new q.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f3871a.get(str);
        Object obj2 = uVar2.f3871a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j) {
        this.f3844c = j;
    }

    public void B(AbstractC0058a abstractC0058a) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f3845d = timeInterpolator;
    }

    public void D(i iVar) {
        if (iVar == null) {
            this.f3860v = f3840y;
        } else {
            this.f3860v = iVar;
        }
    }

    public void E() {
    }

    public void F(long j) {
        this.f3843b = j;
    }

    public final void G() {
        if (this.f3854p == 0) {
            v(this, l.f3834a);
            this.f3856r = false;
        }
        this.f3854p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3844c != -1) {
            sb.append("dur(");
            sb.append(this.f3844c);
            sb.append(") ");
        }
        if (this.f3843b != -1) {
            sb.append("dly(");
            sb.append(this.f3843b);
            sb.append(") ");
        }
        if (this.f3845d != null) {
            sb.append("interp(");
            sb.append(this.f3845d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3846f;
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

    public void a(k kVar) {
        if (this.f3858t == null) {
            this.f3858t = new ArrayList();
        }
        this.f3858t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f3852n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3853o);
        this.f3853o = f3838w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3853o = animatorArr;
        v(this, l.f3836c);
    }

    public abstract void d(u uVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            u uVar = new u(view);
            if (z2) {
                g(uVar);
            } else {
                d(uVar);
            }
            uVar.f3873c.add(this);
            f(uVar);
            if (z2) {
                b(this.f3847g, view, uVar);
            } else {
                b(this.f3848h, view, uVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(u uVar) {
    }

    public abstract void g(u uVar);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3846f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                u uVar = new u(findViewById);
                if (z2) {
                    g(uVar);
                } else {
                    d(uVar);
                }
                uVar.f3873c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f3847g, findViewById, uVar);
                } else {
                    b(this.f3848h, findViewById, uVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            u uVar2 = new u(view);
            if (z2) {
                g(uVar2);
            } else {
                d(uVar2);
            }
            uVar2.f3873c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f3847g, view, uVar2);
            } else {
                b(this.f3848h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((q.b) this.f3847g.f1305a).clear();
            ((SparseArray) this.f3847g.f1306b).clear();
            ((q.e) this.f3847g.f1307c).a();
        } else {
            ((q.b) this.f3848h.f1305a).clear();
            ((SparseArray) this.f3848h.f1306b).clear();
            ((q.e) this.f3848h.f1307c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f3859u = new ArrayList();
            mVar.f3847g = new V.v(4);
            mVar.f3848h = new V.v(4);
            mVar.f3849k = null;
            mVar.f3850l = null;
            mVar.f3857s = this;
            mVar.f3858t = null;
            return mVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, V.v vVar, V.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        q.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            u uVar3 = (u) arrayList.get(i2);
            u uVar4 = (u) arrayList2.get(i2);
            if (uVar3 != null && !uVar3.f3873c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f3873c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f3842a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f3872b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((q.b) vVar2.f1305a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f3871a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f3871a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3925c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f3831c != null && jVar.f3829a == view && jVar.f3830b.equals(str) && jVar.f3831c.equals(uVar2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            uVar2 = null;
                        }
                        k2 = animator;
                        uVar = uVar2;
                    } else {
                        i = size;
                        view = uVar3.f3872b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f3829a = view;
                        jVar2.f3830b = str;
                        jVar2.f3831c = uVar;
                        jVar2.f3832d = windowId;
                        jVar2.e = this;
                        jVar2.f3833f = k2;
                        p2.put(k2, jVar2);
                        this.f3859u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f3859u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f3833f.setStartDelay(jVar3.f3833f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3854p - 1;
        this.f3854p = i;
        if (i == 0) {
            v(this, l.f3835b);
            for (int i2 = 0; i2 < ((q.e) this.f3847g.f1307c).e(); i2++) {
                View view = (View) ((q.e) this.f3847g.f1307c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((q.e) this.f3848h.f1307c).e(); i3++) {
                View view2 = (View) ((q.e) this.f3848h.f1307c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3856r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0325a c0325a = this.i;
        if (c0325a != null) {
            return c0325a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3849k : this.f3850l;
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
            u uVar = (u) arrayList.get(i);
            if (uVar == null) {
                return null;
            }
            if (uVar.f3872b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f3850l : this.f3849k).get(i);
        }
        return null;
    }

    public final m o() {
        C0325a c0325a = this.i;
        return c0325a != null ? c0325a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0325a c0325a = this.i;
        if (c0325a != null) {
            return c0325a.r(view, z2);
        }
        return (u) ((q.b) (z2 ? this.f3847g : this.f3848h).f1305a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f3871a.keySet().iterator();
            while (it.hasNext()) {
                if (u(uVar, uVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(uVar, uVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3846f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f3857s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f3858t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3858t.size();
        k[] kVarArr = this.f3851m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f3851m = null;
        k[] kVarArr2 = (k[]) this.f3858t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f3851m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3856r) {
            return;
        }
        ArrayList arrayList = this.f3852n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3853o);
        this.f3853o = f3838w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3853o = animatorArr;
        v(this, l.f3837d);
        this.f3855q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f3858t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f3857s) != null) {
            mVar.x(kVar);
        }
        if (this.f3858t.size() == 0) {
            this.f3858t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3855q) {
            if (!this.f3856r) {
                ArrayList arrayList = this.f3852n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3853o);
                this.f3853o = f3838w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3853o = animatorArr;
                v(this, l.e);
            }
            this.f3855q = false;
        }
    }

    public void z() {
        G();
        q.b p2 = p();
        Iterator it = this.f3859u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new a0(this, p2));
                    long j = this.f3844c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f3843b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f3845d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new I0.i(5, this));
                    animator.start();
                }
            }
        }
        this.f3859u.clear();
        m();
    }
}
