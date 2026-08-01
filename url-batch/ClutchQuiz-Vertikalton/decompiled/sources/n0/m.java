package n0;

import K.S;
import K.Y;
import K.d0;
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
import t.C0356n;

/* loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f3163w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f3164x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final C0356n f3165y = new C0356n();

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f3166z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3174k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3175l;

    /* renamed from: m, reason: collision with root package name */
    public k[] f3176m;

    /* renamed from: a, reason: collision with root package name */
    public final String f3167a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f3168b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f3169c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3170e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3171f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.w f3172g = new T.w(4);
    public T.w h = new T.w(4);
    public C0258a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3173j = f3164x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3177n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f3178o = f3163w;

    /* renamed from: p, reason: collision with root package name */
    public int f3179p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3180q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3181r = false;

    /* renamed from: s, reason: collision with root package name */
    public m f3182s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3183t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3184u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public C0356n f3185v = f3165y;

    public static void b(T.w wVar, View view, u uVar) {
        ((o.b) wVar.f845a).put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) wVar.f846b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = S.f365a;
        String k2 = K.G.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) wVar.d;
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
                o.e eVar = (o.e) wVar.f847c;
                if (eVar.f3215a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3216b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f3166z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(u uVar, u uVar2, String str) {
        Object obj = uVar.f3196a.get(str);
        Object obj2 = uVar2.f3196a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f3169c = j2;
    }

    public void B(h0.g gVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(C0356n c0356n) {
        if (c0356n == null) {
            this.f3185v = f3165y;
        } else {
            this.f3185v = c0356n;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f3168b = j2;
    }

    public final void G() {
        if (this.f3179p == 0) {
            v(this, l.f3159a);
            this.f3181r = false;
        }
        this.f3179p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f3169c != -1) {
            sb.append("dur(");
            sb.append(this.f3169c);
            sb.append(") ");
        }
        if (this.f3168b != -1) {
            sb.append("dly(");
            sb.append(this.f3168b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f3170e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3171f;
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
        if (this.f3183t == null) {
            this.f3183t = new ArrayList();
        }
        this.f3183t.add(kVar);
    }

    public void c() {
        ArrayList arrayList = this.f3177n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3178o);
        this.f3178o = f3163w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f3178o = animatorArr;
        v(this, l.f3161c);
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
            uVar.f3198c.add(this);
            f(uVar);
            if (z2) {
                b(this.f3172g, view, uVar);
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
        ArrayList arrayList = this.f3170e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3171f;
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
                uVar.f3198c.add(this);
                f(uVar);
                if (z2) {
                    b(this.f3172g, findViewById, uVar);
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
            uVar2.f3198c.add(this);
            f(uVar2);
            if (z2) {
                b(this.f3172g, view, uVar2);
            } else {
                b(this.h, view, uVar2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f3172g.f845a).clear();
            ((SparseArray) this.f3172g.f846b).clear();
            ((o.e) this.f3172g.f847c).a();
        } else {
            ((o.b) this.h.f845a).clear();
            ((SparseArray) this.h.f846b).clear();
            ((o.e) this.h.f847c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f3184u = new ArrayList();
            mVar.f3172g = new T.w(4);
            mVar.h = new T.w(4);
            mVar.f3174k = null;
            mVar.f3175l = null;
            mVar.f3182s = this;
            mVar.f3183t = null;
            return mVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, u uVar, u uVar2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T.w wVar, T.w wVar2, ArrayList arrayList, ArrayList arrayList2) {
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
            if (uVar3 != null && !uVar3.f3198c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f3198c.contains(this)) {
                uVar4 = null;
            }
            if ((uVar3 != null || uVar4 != null) && (uVar3 == null || uVar4 == null || s(uVar3, uVar4))) {
                Animator k2 = k(frameLayout, uVar3, uVar4);
                if (k2 != null) {
                    String str = this.f3167a;
                    if (uVar4 != null) {
                        String[] q2 = q();
                        view = uVar4.f3197b;
                        if (q2 != null && q2.length > 0) {
                            uVar2 = new u(view);
                            u uVar5 = (u) ((o.b) wVar2.f845a).getOrDefault(view, null);
                            i = size;
                            if (uVar5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = uVar2.f3196a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, uVar5.f3196a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3237c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                j jVar = (j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (jVar.f3156c != null && jVar.f3154a == view && jVar.f3155b.equals(str) && jVar.f3156c.equals(uVar2)) {
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
                        view = uVar3.f3197b;
                        uVar = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        j jVar2 = new j();
                        jVar2.f3154a = view;
                        jVar2.f3155b = str;
                        jVar2.f3156c = uVar;
                        jVar2.d = windowId;
                        jVar2.f3157e = this;
                        jVar2.f3158f = k2;
                        p2.put(k2, jVar2);
                        this.f3184u.add(k2);
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
                j jVar3 = (j) p2.getOrDefault((Animator) this.f3184u.get(sparseIntArray.keyAt(i6)), null);
                jVar3.f3158f.setStartDelay(jVar3.f3158f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f3179p - 1;
        this.f3179p = i;
        if (i == 0) {
            v(this, l.f3160b);
            for (int i2 = 0; i2 < ((o.e) this.f3172g.f847c).e(); i2++) {
                View view = (View) ((o.e) this.f3172g.f847c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f847c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f847c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f3181r = true;
        }
    }

    public final u n(View view, boolean z2) {
        C0258a c0258a = this.i;
        if (c0258a != null) {
            return c0258a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f3174k : this.f3175l;
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
            if (uVar.f3197b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (u) (z2 ? this.f3175l : this.f3174k).get(i);
        }
        return null;
    }

    public final m o() {
        C0258a c0258a = this.i;
        return c0258a != null ? c0258a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final u r(View view, boolean z2) {
        C0258a c0258a = this.i;
        if (c0258a != null) {
            return c0258a.r(view, z2);
        }
        return (u) ((o.b) (z2 ? this.f3172g : this.h).f845a).getOrDefault(view, null);
    }

    public boolean s(u uVar, u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = uVar.f3196a.keySet().iterator();
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
        ArrayList arrayList = this.f3170e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f3171f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(m mVar, l lVar) {
        m mVar2 = this.f3182s;
        if (mVar2 != null) {
            mVar2.v(mVar, lVar);
        }
        ArrayList arrayList = this.f3183t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f3183t.size();
        k[] kVarArr = this.f3176m;
        if (kVarArr == null) {
            kVarArr = new k[size];
        }
        this.f3176m = null;
        k[] kVarArr2 = (k[]) this.f3183t.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            lVar.a(kVarArr2[i], mVar);
            kVarArr2[i] = null;
        }
        this.f3176m = kVarArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f3181r) {
            return;
        }
        ArrayList arrayList = this.f3177n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3178o);
        this.f3178o = f3163w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f3178o = animatorArr;
        v(this, l.d);
        this.f3180q = true;
    }

    public m x(k kVar) {
        m mVar;
        ArrayList arrayList = this.f3183t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(kVar) && (mVar = this.f3182s) != null) {
            mVar.x(kVar);
        }
        if (this.f3183t.size() == 0) {
            this.f3183t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f3180q) {
            if (!this.f3181r) {
                ArrayList arrayList = this.f3177n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f3178o);
                this.f3178o = f3163w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f3178o = animatorArr;
                v(this, l.f3162e);
            }
            this.f3180q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f3184u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new d0(this, p2));
                    long j2 = this.f3169c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f3168b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Y(3, this));
                    animator.start();
                }
            }
        }
        this.f3184u.clear();
        m();
    }
}
