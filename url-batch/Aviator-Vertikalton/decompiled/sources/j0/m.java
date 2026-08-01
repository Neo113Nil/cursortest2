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
    public static final Animator[] f2926w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2927x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final H0.e f2928y = new H0.e(25);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2929z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2938k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2939l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f2940m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2930a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2931b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2932c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2933d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2934e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2935f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.v f2936g = new T.v(6);
    public T.v h = new T.v(6);
    public C0176a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2937j = f2927x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2941n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2942o = f2926w;

    /* renamed from: p, reason: collision with root package name */
    public int f2943p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2944q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2945r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f2946s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2947t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2948u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public H0.e f2949v = f2928y;

    public static void b(T.v vVar, View view, u uVar) {
        ((o.b) vVar.f823a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) vVar.f824b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = X.f418a;
        String k2 = L.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) vVar.f826d;
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
                o.e eVar = (o.e) vVar.f825c;
                if (eVar.f3680a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3681b, eVar.f3683d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f2929z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f2960a.get(str);
        Object obj2 = uVar2.f2960a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2932c = j2;
    }

    public void B(i1.r rVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f2933d = timeInterpolator;
    }

    public void D(H0.e eVar) {
        if (eVar == null) {
            this.f2949v = f2928y;
        } else {
            this.f2949v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2931b = j2;
    }

    public final void G() {
        if (this.f2943p == 0) {
            v(this, l.f2921a);
            this.f2945r = false;
        }
        this.f2943p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2932c != -1) {
            sb.append("dur(");
            sb.append(this.f2932c);
            sb.append(") ");
        }
        if (this.f2931b != -1) {
            sb.append("dly(");
            sb.append(this.f2931b);
            sb.append(") ");
        }
        if (this.f2933d != null) {
            sb.append("interp(");
            sb.append(this.f2933d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2934e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2935f;
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
        if (this.f2947t == null) {
            this.f2947t = new ArrayList();
        }
        this.f2947t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f2941n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2942o);
        this.f2942o = f2926w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2942o = animatorArr;
        v(this, l.f2923c);
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
            uVar.f2962c.add(this);
            f(uVar);
            if (z2) {
                b(this.f2936g, view, uVar);
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
        ArrayList arrayList = this.f2934e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2935f;
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
                uVar.f2962c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f2936g, findViewById, uVar);
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
            uVar2.f2962c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f2936g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2936g.f823a).clear();
            ((SparseArray) this.f2936g.f824b).clear();
            ((o.e) this.f2936g.f825c).a();
        } else {
            ((o.b) this.h.f823a).clear();
            ((SparseArray) this.h.f824b).clear();
            ((o.e) this.h.f825c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f2948u = new ArrayList();
            mVar.f2936g = new T.v(6);
            mVar.h = new T.v(6);
            mVar.f2938k = null;
            mVar.f2939l = null;
            mVar.f2946s = this;
            mVar.f2947t = null;
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
            if (uVar3 != null && !uVar3.f2962c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f2962c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f2930a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f2961b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((o.b) vVar2.f823a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f2960a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f2960a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3707c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f2917c != null && jVar.f2915a == view && jVar.f2916b.equals(str) && jVar.f2917c.equals(uVar2)) {
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
                        view = uVar3.f2961b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f2915a = view;
                        jVar2.f2916b = str;
                        jVar2.f2917c = uVar;
                        jVar2.f2918d = windowId;
                        jVar2.f2919e = this;
                        jVar2.f2920f = k2;
                        p2.put(k2, jVar2);
                        this.f2948u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f2948u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f2920f.setStartDelay(jVar3.f2920f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2943p - 1;
        this.f2943p = i;
        if (i == 0) {
            v(this, l.f2922b);
            for (int i2 = 0; i2 < ((o.e) this.f2936g.f825c).e(); i2++) {
                View view = (View) ((o.e) this.f2936g.f825c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f825c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f825c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2945r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0176a c0176a = this.i;
        if (c0176a != null) {
            return c0176a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2938k : this.f2939l;
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
            if (uVar.f2961b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f2939l : this.f2938k).get(i);
        }
        return null;
    }

    public final m o() {
        C0176a c0176a = this.i;
        return c0176a != null ? c0176a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0176a c0176a = this.i;
        if (c0176a != null) {
            return c0176a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f2936g : this.h).f823a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f2960a.keySet().iterator();
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
        ArrayList arrayList = this.f2934e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2935f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f2946s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f2947t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2947t.size();
        k[] kVarArr = this.f2940m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f2940m = null;
        k[] kVarArr2 = (k[]) this.f2947t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f2940m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2945r) {
            return;
        }
        ArrayList arrayList = this.f2941n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2942o);
        this.f2942o = f2926w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2942o = animatorArr;
        v(this, l.f2924d);
        this.f2944q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f2947t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f2946s) != null) {
            mVar.x(kVar);
        }
        if (this.f2947t.size() == 0) {
            this.f2947t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2944q) {
            if (!this.f2945r) {
                ArrayList arrayList = this.f2941n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2942o);
                this.f2942o = f2926w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2942o = animatorArr;
                v(this, l.f2925e);
            }
            this.f2944q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2948u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new i0(this, p2));
                    long j2 = this.f2932c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2931b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2933d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0007d0(2, this));
                    animator.start();
                }
            }
        }
        this.f2948u.clear();
        m();
    }
}
