package j0;

import K.C0007d0;
import K.L;
import K.X;
import K.i0;
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
    public static final Animator[] f2930w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2931x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final H0.e f2932y = new H0.e(25);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2933z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2942k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2943l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f2944m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2934a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2935b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2936c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2937d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2938e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2939f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.v f2940g = new T.v(6);
    public T.v h = new T.v(6);
    public C0178a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2941j = f2931x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2945n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2946o = f2930w;

    /* renamed from: p, reason: collision with root package name */
    public int f2947p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2948q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2949r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f2950s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2951t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2952u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public H0.e f2953v = f2932y;

    public static void b(T.v vVar, View view, u uVar) {
        ((o.b) vVar.f824a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) vVar.f825b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = X.f419a;
        String k2 = L.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) vVar.f827d;
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
                o.e eVar = (o.e) vVar.f826c;
                if (eVar.f3684a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3685b, eVar.f3687d, itemIdAtPosition) < 0) {
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

    public static o.b p() {
        ThreadLocal threadLocal = f2933z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f2964a.get(str);
        Object obj2 = uVar2.f2964a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2936c = j2;
    }

    public void B(i1.r rVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f2937d = timeInterpolator;
    }

    public void D(H0.e eVar) {
        if (eVar == null) {
            this.f2953v = f2932y;
        } else {
            this.f2953v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2935b = j2;
    }

    public final void G() {
        if (this.f2947p == 0) {
            v(this, l.f2925a);
            this.f2949r = false;
        }
        this.f2947p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2936c != -1) {
            sb.append("dur(");
            sb.append(this.f2936c);
            sb.append(") ");
        }
        if (this.f2935b != -1) {
            sb.append("dly(");
            sb.append(this.f2935b);
            sb.append(") ");
        }
        if (this.f2937d != null) {
            sb.append("interp(");
            sb.append(this.f2937d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2938e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2939f;
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
        if (this.f2951t == null) {
            this.f2951t = new ArrayList();
        }
        this.f2951t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f2945n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2946o);
        this.f2946o = f2930w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2946o = animatorArr;
        v(this, l.f2927c);
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
            uVar.f2966c.add(this);
            f(uVar);
            if (z2) {
                b(this.f2940g, view, uVar);
            } else {
                b(this.h, view, uVar);
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
        ArrayList arrayList = this.f2938e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2939f;
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
                uVar.f2966c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f2940g, findViewById, uVar);
                } else {
                    b(this.h, findViewById, uVar);
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
            uVar2.f2966c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f2940g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2940g.f824a).clear();
            ((SparseArray) this.f2940g.f825b).clear();
            ((o.e) this.f2940g.f826c).a();
        } else {
            ((o.b) this.h.f824a).clear();
            ((SparseArray) this.h.f825b).clear();
            ((o.e) this.h.f826c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f2952u = new ArrayList();
            mVar.f2940g = new T.v(6);
            mVar.h = new T.v(6);
            mVar.f2942k = null;
            mVar.f2943l = null;
            mVar.f2950s = this;
            mVar.f2951t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T.v vVar, T.v vVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        u uVar;
        Animator animator;
        u uVar2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            u uVar3 = (u) arrayList.get(i2);
            u uVar4 = (u) arrayList2.get(i2);
            if (uVar3 != null && !uVar3.f2966c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f2966c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f2934a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f2965b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((o.b) vVar2.f824a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f2964a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f2964a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3711c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f2921c != null && jVar.f2919a == view && jVar.f2920b.equals(str) && jVar.f2921c.equals(uVar2)) {
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
                        view = uVar3.f2965b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f2919a = view;
                        jVar2.f2920b = str;
                        jVar2.f2921c = uVar;
                        jVar2.f2922d = windowId;
                        jVar2.f2923e = this;
                        jVar2.f2924f = k2;
                        p2.put(k2, jVar2);
                        this.f2952u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f2952u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f2924f.setStartDelay(jVar3.f2924f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2947p - 1;
        this.f2947p = i;
        if (i == 0) {
            v(this, l.f2926b);
            for (int i2 = 0; i2 < ((o.e) this.f2940g.f826c).e(); i2++) {
                View view = (View) ((o.e) this.f2940g.f826c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f826c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f826c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2949r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0178a c0178a = this.i;
        if (c0178a != null) {
            return c0178a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2942k : this.f2943l;
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
            if (uVar.f2965b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f2943l : this.f2942k).get(i);
        }
        return null;
    }

    public final m o() {
        C0178a c0178a = this.i;
        return c0178a != null ? c0178a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0178a c0178a = this.i;
        if (c0178a != null) {
            return c0178a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f2940g : this.h).f824a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f2964a.keySet().iterator();
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
        ArrayList arrayList = this.f2938e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2939f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f2950s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f2951t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2951t.size();
        k[] kVarArr = this.f2944m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f2944m = null;
        k[] kVarArr2 = (k[]) this.f2951t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f2944m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2949r) {
            return;
        }
        ArrayList arrayList = this.f2945n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2946o);
        this.f2946o = f2930w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2946o = animatorArr;
        v(this, l.f2928d);
        this.f2948q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f2951t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f2950s) != null) {
            mVar.x(kVar);
        }
        if (this.f2951t.size() == 0) {
            this.f2951t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2948q) {
            if (!this.f2949r) {
                ArrayList arrayList = this.f2945n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2946o);
                this.f2946o = f2930w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2946o = animatorArr;
                v(this, l.f2929e);
            }
            this.f2948q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2952u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new i0(this, p2));
                    long j2 = this.f2936c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2935b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2937d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0007d0(2, this));
                    animator.start();
                }
            }
        }
        this.f2952u.clear();
        m();
    }
}
