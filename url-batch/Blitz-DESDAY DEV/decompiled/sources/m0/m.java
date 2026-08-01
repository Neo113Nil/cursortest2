package m0;

import M.Q;
import M.X;
import M.c0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import h0.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3168w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3169x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final L0.e f3170y = new L0.e(26);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3171z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3179k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3180l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f3181m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3172a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3173b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3174c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3175e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3176f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T0.g f3177g = new T0.g(5);
    public T0.g h = new T0.g(5);
    public C0234a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3178j = f3169x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3182n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3183o = f3168w;

    /* renamed from: p, reason: collision with root package name */
    public int f3184p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3185q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3186r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f3187s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3188t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3189u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public L0.e f3190v = f3170y;

    public static void b(T0.g gVar, View view, u uVar) {
        ((q.b) gVar.f824a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) gVar.f825b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = Q.f513a;
        String k2 = M.F.k(view);
        if (k2 != null) {
            q.b bVar = (q.b) gVar.d;
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
                q.e eVar = (q.e) gVar.f826c;
                if (eVar.f3350a) {
                    eVar.b();
                }
                if (q.d.b(eVar.f3351b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f3171z;
        q.b bVar = (q.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        q.b bVar2 = new q.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f3201a.get(str);
        Object obj2 = uVar2.f3201a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3174c = j2;
    }

    public void B(a0 a0Var) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(L0.e eVar) {
        if (eVar == null) {
            this.f3190v = f3170y;
        } else {
            this.f3190v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3173b = j2;
    }

    public final void G() {
        if (this.f3184p == 0) {
            v(this, l.f3164a);
            this.f3186r = false;
        }
        this.f3184p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3174c != -1) {
            sb.append("dur(");
            sb.append(this.f3174c);
            sb.append(") ");
        }
        if (this.f3173b != -1) {
            sb.append("dly(");
            sb.append(this.f3173b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3175e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3176f;
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
        if (this.f3188t == null) {
            this.f3188t = new ArrayList();
        }
        this.f3188t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f3182n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3183o);
        this.f3183o = f3168w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3183o = animatorArr;
        v(this, l.f3166c);
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
            uVar.f3203c.add(this);
            f(uVar);
            if (z2) {
                b(this.f3177g, view, uVar);
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
        ArrayList arrayList = this.f3175e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3176f;
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
                uVar.f3203c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f3177g, findViewById, uVar);
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
            uVar2.f3203c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f3177g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((q.b) this.f3177g.f824a).clear();
            ((SparseArray) this.f3177g.f825b).clear();
            ((q.e) this.f3177g.f826c).a();
        } else {
            ((q.b) this.h.f824a).clear();
            ((SparseArray) this.h.f825b).clear();
            ((q.e) this.h.f826c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f3189u = new ArrayList();
            mVar.f3177g = new T0.g(5);
            mVar.h = new T0.g(5);
            mVar.f3179k = null;
            mVar.f3180l = null;
            mVar.f3187s = this;
            mVar.f3188t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T0.g gVar, T0.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
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
            if (uVar3 != null && !uVar3.f3203c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f3203c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f3172a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f3202b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((q.b) gVar2.f824a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f3201a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f3201a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3372c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f3161c != null && jVar.f3159a == view && jVar.f3160b.equals(str) && jVar.f3161c.equals(uVar2)) {
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
                        view = uVar3.f3202b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f3159a = view;
                        jVar2.f3160b = str;
                        jVar2.f3161c = uVar;
                        jVar2.d = windowId;
                        jVar2.f3162e = this;
                        jVar2.f3163f = k2;
                        p2.put(k2, jVar2);
                        this.f3189u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f3189u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f3163f.setStartDelay(jVar3.f3163f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3184p - 1;
        this.f3184p = i;
        if (i == 0) {
            v(this, l.f3165b);
            for (int i2 = 0; i2 < ((q.e) this.f3177g.f826c).e(); i2++) {
                View view = (View) ((q.e) this.f3177g.f826c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((q.e) this.h.f826c).e(); i3++) {
                View view2 = (View) ((q.e) this.h.f826c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3186r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0234a c0234a = this.i;
        if (c0234a != null) {
            return c0234a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3179k : this.f3180l;
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
            if (uVar.f3202b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f3180l : this.f3179k).get(i);
        }
        return null;
    }

    public final m o() {
        C0234a c0234a = this.i;
        return c0234a != null ? c0234a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0234a c0234a = this.i;
        if (c0234a != null) {
            return c0234a.r(view, z2);
        }
        return (u) ((q.b) (z2 ? this.f3177g : this.h).f824a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f3201a.keySet().iterator();
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
        ArrayList arrayList = this.f3175e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3176f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f3187s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f3188t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3188t.size();
        k[] kVarArr = this.f3181m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f3181m = null;
        k[] kVarArr2 = (k[]) this.f3188t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f3181m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3186r) {
            return;
        }
        ArrayList arrayList = this.f3182n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3183o);
        this.f3183o = f3168w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3183o = animatorArr;
        v(this, l.d);
        this.f3185q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f3188t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f3187s) != null) {
            mVar.x(kVar);
        }
        if (this.f3188t.size() == 0) {
            this.f3188t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3185q) {
            if (!this.f3186r) {
                ArrayList arrayList = this.f3182n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3183o);
                this.f3183o = f3168w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3183o = animatorArr;
                v(this, l.f3167e);
            }
            this.f3185q = false;
        }
    }

    public void z() {
        G();
        q.b p2 = p();
        Iterator it = this.f3189u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new c0(this, p2));
                    long j2 = this.f3174c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3173b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new X(3, this));
                    animator.start();
                }
            }
        }
        this.f3189u.clear();
        m();
    }
}
