package k0;

import K.H;
import K.T;
import K.Z;
import K.e0;
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

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0190m implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final Animator[] f2803w = new Animator[0];

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f2804x = {2, 1, 3, 4};

    /* renamed from: y, reason: collision with root package name */
    public static final H0.e f2805y = new H0.e(24);

    /* renamed from: z, reason: collision with root package name */
    public static final ThreadLocal f2806z = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2814k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2815l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0188k[] f2816m;

    /* renamed from: a, reason: collision with root package name */
    public final String f2807a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f2808b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f2809c = -1;
    public TimeInterpolator d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2810e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2811f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public T.t f2812g = new T.t(6);
    public T.t h = new T.t(6);
    public C0178a i = null;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2813j = f2804x;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2817n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public Animator[] f2818o = f2803w;

    /* renamed from: p, reason: collision with root package name */
    public int f2819p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2820q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2821r = false;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0190m f2822s = null;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f2823t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2824u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public H0.e f2825v = f2805y;

    public static void b(T.t tVar, View view, C0198u c0198u) {
        ((o.b) tVar.f748a).put(view, c0198u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) tVar.f749b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = T.f381a;
        String k2 = H.k(view);
        if (k2 != null) {
            o.b bVar = (o.b) tVar.d;
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
                o.e eVar = (o.e) tVar.f750c;
                if (eVar.f3329a) {
                    eVar.b();
                }
                if (o.d.b(eVar.f3330b, eVar.d, itemIdAtPosition) < 0) {
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
        ThreadLocal threadLocal = f2806z;
        o.b bVar = (o.b) threadLocal.get();
        if (bVar != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(bVar2);
        return bVar2;
    }

    public static boolean u(C0198u c0198u, C0198u c0198u2, String str) {
        Object obj = c0198u.f2836a.get(str);
        Object obj2 = c0198u2.f2836a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j2) {
        this.f2809c = j2;
    }

    public void B(i1.s sVar) {
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void D(H0.e eVar) {
        if (eVar == null) {
            this.f2825v = f2805y;
        } else {
            this.f2825v = eVar;
        }
    }

    public void E() {
    }

    public void F(long j2) {
        this.f2808b = j2;
    }

    public final void G() {
        if (this.f2819p == 0) {
            v(this, InterfaceC0189l.f2799a);
            this.f2821r = false;
        }
        this.f2819p++;
    }

    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2809c != -1) {
            sb.append("dur(");
            sb.append(this.f2809c);
            sb.append(") ");
        }
        if (this.f2808b != -1) {
            sb.append("dly(");
            sb.append(this.f2808b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2810e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2811f;
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

    public void a(InterfaceC0188k interfaceC0188k) {
        if (this.f2823t == null) {
            this.f2823t = new ArrayList();
        }
        this.f2823t.add(interfaceC0188k);
    }

    public void c() {
        ArrayList arrayList = this.f2817n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2818o);
        this.f2818o = f2803w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f2818o = animatorArr;
        v(this, InterfaceC0189l.f2801c);
    }

    public abstract void d(C0198u c0198u);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0198u c0198u = new C0198u(view);
            if (z2) {
                g(c0198u);
            } else {
                d(c0198u);
            }
            c0198u.f2838c.add(this);
            f(c0198u);
            if (z2) {
                b(this.f2812g, view, c0198u);
            } else {
                b(this.h, view, c0198u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    public void f(C0198u c0198u) {
    }

    public abstract void g(C0198u c0198u);

    public final void h(FrameLayout frameLayout, boolean z2) {
        i(z2);
        ArrayList arrayList = this.f2810e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2811f;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C0198u c0198u = new C0198u(findViewById);
                if (z2) {
                    g(c0198u);
                } else {
                    d(c0198u);
                }
                c0198u.f2838c.add(this);
                f(c0198u);
                if (z2) {
                    b(this.f2812g, findViewById, c0198u);
                } else {
                    b(this.h, findViewById, c0198u);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C0198u c0198u2 = new C0198u(view);
            if (z2) {
                g(c0198u2);
            } else {
                d(c0198u2);
            }
            c0198u2.f2838c.add(this);
            f(c0198u2);
            if (z2) {
                b(this.f2812g, view, c0198u2);
            } else {
                b(this.h, view, c0198u2);
            }
        }
    }

    public final void i(boolean z2) {
        if (z2) {
            ((o.b) this.f2812g.f748a).clear();
            ((SparseArray) this.f2812g.f749b).clear();
            ((o.e) this.f2812g.f750c).a();
        } else {
            ((o.b) this.h.f748a).clear();
            ((SparseArray) this.h.f749b).clear();
            ((o.e) this.h.f750c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0190m clone() {
        try {
            AbstractC0190m abstractC0190m = (AbstractC0190m) super.clone();
            abstractC0190m.f2824u = new ArrayList();
            abstractC0190m.f2812g = new T.t(6);
            abstractC0190m.h = new T.t(6);
            abstractC0190m.f2814k = null;
            abstractC0190m.f2815l = null;
            abstractC0190m.f2822s = this;
            abstractC0190m.f2823t = null;
            return abstractC0190m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(FrameLayout frameLayout, C0198u c0198u, C0198u c0198u2) {
        return null;
    }

    public void l(FrameLayout frameLayout, T.t tVar, T.t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C0198u c0198u;
        Animator animator;
        C0198u c0198u2;
        o.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i2 = 0;
        while (i2 < size) {
            C0198u c0198u3 = (C0198u) arrayList.get(i2);
            C0198u c0198u4 = (C0198u) arrayList2.get(i2);
            if (c0198u3 != null && !c0198u3.f2838c.contains(this)) {
                c0198u3 = null;
            }
            if (c0198u4 != null && !c0198u4.f2838c.contains(this)) {
                c0198u4 = null;
            }
            if ((c0198u3 != null || c0198u4 != null) && (c0198u3 == null || c0198u4 == null || s(c0198u3, c0198u4))) {
                Animator k2 = k(frameLayout, c0198u3, c0198u4);
                if (k2 != null) {
                    String str = this.f2807a;
                    if (c0198u4 != null) {
                        String[] q2 = q();
                        view = c0198u4.f2837b;
                        if (q2 != null && q2.length > 0) {
                            c0198u2 = new C0198u(view);
                            C0198u c0198u5 = (C0198u) ((o.b) tVar2.f748a).getOrDefault(view, null);
                            i = size;
                            if (c0198u5 != null) {
                                int i3 = 0;
                                while (i3 < q2.length) {
                                    HashMap hashMap = c0198u2.f2836a;
                                    String str2 = q2[i3];
                                    hashMap.put(str2, c0198u5.f2836a.get(str2));
                                    i3++;
                                    q2 = q2;
                                }
                            }
                            int i4 = p2.f3351c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = k2;
                                    break;
                                }
                                C0187j c0187j = (C0187j) p2.getOrDefault((Animator) p2.h(i5), null);
                                if (c0187j.f2796c != null && c0187j.f2794a == view && c0187j.f2795b.equals(str) && c0187j.f2796c.equals(c0198u2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = k2;
                            c0198u2 = null;
                        }
                        k2 = animator;
                        c0198u = c0198u2;
                    } else {
                        i = size;
                        view = c0198u3.f2837b;
                        c0198u = null;
                    }
                    if (k2 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C0187j c0187j2 = new C0187j();
                        c0187j2.f2794a = view;
                        c0187j2.f2795b = str;
                        c0187j2.f2796c = c0198u;
                        c0187j2.d = windowId;
                        c0187j2.f2797e = this;
                        c0187j2.f2798f = k2;
                        p2.put(k2, c0187j2);
                        this.f2824u.add(k2);
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
                C0187j c0187j3 = (C0187j) p2.getOrDefault((Animator) this.f2824u.get(sparseIntArray.keyAt(i6)), null);
                c0187j3.f2798f.setStartDelay(c0187j3.f2798f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f2819p - 1;
        this.f2819p = i;
        if (i == 0) {
            v(this, InterfaceC0189l.f2800b);
            for (int i2 = 0; i2 < ((o.e) this.f2812g.f750c).e(); i2++) {
                View view = (View) ((o.e) this.f2812g.f750c).f(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((o.e) this.h.f750c).e(); i3++) {
                View view2 = (View) ((o.e) this.h.f750c).f(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2821r = true;
        }
    }

    public final C0198u n(View view, boolean z2) {
        C0178a c0178a = this.i;
        if (c0178a != null) {
            return c0178a.n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f2814k : this.f2815l;
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
            C0198u c0198u = (C0198u) arrayList.get(i);
            if (c0198u == null) {
                return null;
            }
            if (c0198u.f2837b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C0198u) (z2 ? this.f2815l : this.f2814k).get(i);
        }
        return null;
    }

    public final AbstractC0190m o() {
        C0178a c0178a = this.i;
        return c0178a != null ? c0178a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final C0198u r(View view, boolean z2) {
        C0178a c0178a = this.i;
        if (c0178a != null) {
            return c0178a.r(view, z2);
        }
        return (C0198u) ((o.b) (z2 ? this.f2812g : this.h).f748a).getOrDefault(view, null);
    }

    public boolean s(C0198u c0198u, C0198u c0198u2) {
        if (c0198u == null || c0198u2 == null) {
            return false;
        }
        String[] q2 = q();
        if (q2 == null) {
            Iterator it = c0198u.f2836a.keySet().iterator();
            while (it.hasNext()) {
                if (u(c0198u, c0198u2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : q2) {
            if (!u(c0198u, c0198u2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2810e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2811f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return H("");
    }

    public final void v(AbstractC0190m abstractC0190m, InterfaceC0189l interfaceC0189l) {
        AbstractC0190m abstractC0190m2 = this.f2822s;
        if (abstractC0190m2 != null) {
            abstractC0190m2.v(abstractC0190m, interfaceC0189l);
        }
        ArrayList arrayList = this.f2823t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f2823t.size();
        InterfaceC0188k[] interfaceC0188kArr = this.f2816m;
        if (interfaceC0188kArr == null) {
            interfaceC0188kArr = new InterfaceC0188k[size];
        }
        this.f2816m = null;
        InterfaceC0188k[] interfaceC0188kArr2 = (InterfaceC0188k[]) this.f2823t.toArray(interfaceC0188kArr);
        for (int i = 0; i < size; i++) {
            interfaceC0189l.a(interfaceC0188kArr2[i], abstractC0190m);
            interfaceC0188kArr2[i] = null;
        }
        this.f2816m = interfaceC0188kArr2;
    }

    public void w(ViewGroup viewGroup) {
        if (this.f2821r) {
            return;
        }
        ArrayList arrayList = this.f2817n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2818o);
        this.f2818o = f2803w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f2818o = animatorArr;
        v(this, InterfaceC0189l.d);
        this.f2820q = true;
    }

    public AbstractC0190m x(InterfaceC0188k interfaceC0188k) {
        AbstractC0190m abstractC0190m;
        ArrayList arrayList = this.f2823t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0188k) && (abstractC0190m = this.f2822s) != null) {
            abstractC0190m.x(interfaceC0188k);
        }
        if (this.f2823t.size() == 0) {
            this.f2823t = null;
        }
        return this;
    }

    public void y(FrameLayout frameLayout) {
        if (this.f2820q) {
            if (!this.f2821r) {
                ArrayList arrayList = this.f2817n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2818o);
                this.f2818o = f2803w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f2818o = animatorArr;
                v(this, InterfaceC0189l.f2802e);
            }
            this.f2820q = false;
        }
    }

    public void z() {
        G();
        o.b p2 = p();
        Iterator it = this.f2824u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new e0(this, p2));
                    long j2 = this.f2809c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f2808b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Z(2, this));
                    animator.start();
                }
            }
        }
        this.f2824u.clear();
        m();
    }
}
