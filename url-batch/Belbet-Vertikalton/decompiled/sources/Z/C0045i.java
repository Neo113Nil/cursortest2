package Z;

import G1.AbstractC0001b;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.winpower.neonfit.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import s.AbstractC0380e;

/* renamed from: Z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1559a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1560b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1561c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1562d = false;
    public boolean e = false;

    public C0045i(ViewGroup viewGroup) {
        this.f1559a = viewGroup;
    }

    public static C0045i f(ViewGroup viewGroup, N0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0045i) {
            return (C0045i) tag;
        }
        eVar.getClass();
        C0045i c0045i = new C0045i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0045i);
        return c0045i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f1560b) {
            try {
                I.c cVar = new I.c();
                U d2 = d(o2.f1494c);
                if (d2 != null) {
                    d2.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f1560b.add(u2);
                u2.f1515d.add(new T(this, u2, 0));
                u2.f1515d.add(new T(this, u2, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z2) {
        U u2;
        Iterator it;
        Iterator it2 = arrayList.iterator();
        U u3 = null;
        U u4 = null;
        while (it2.hasNext()) {
            U u5 = (U) it2.next();
            int c2 = AbstractC0001b.c(u5.f1514c.f1595E);
            int a2 = AbstractC0380e.a(u5.f1512a);
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                    }
                } else if (c2 != 2) {
                    u4 = u5;
                }
            }
            if (c2 == 2 && u3 == null) {
                u3 = u5;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + u3 + " to " + u4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = ((U) arrayList.get(arrayList.size() - 1)).f1514c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0052p c0052p = ((U) it3.next()).f1514c.H;
            C0052p c0052p2 = abstractComponentCallbacksC0053q.H;
            c0052p.f1583b = c0052p2.f1583b;
            c0052p.f1584c = c0052p2.f1584c;
            c0052p.f1585d = c0052p2.f1585d;
            c0052p.e = c0052p2.e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            U u6 = (U) it4.next();
            I.c cVar = new I.c();
            u6.d();
            HashSet hashSet = u6.e;
            hashSet.add(cVar);
            C0042f c0042f = new C0042f(u6, cVar);
            c0042f.f1556d = false;
            c0042f.f1555c = z2;
            arrayList2.add(c0042f);
            I.c cVar2 = new I.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0044h c0044h = new C0044h(u6, cVar2);
            int i = u6.f1512a;
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = u6.f1514c;
            if (i == 2) {
                if (z2) {
                    C0052p c0052p3 = abstractComponentCallbacksC0053q2.H;
                } else {
                    abstractComponentCallbacksC0053q2.getClass();
                }
                if (z2) {
                    C0052p c0052p4 = abstractComponentCallbacksC0053q2.H;
                } else {
                    C0052p c0052p5 = abstractComponentCallbacksC0053q2.H;
                }
            } else if (z2) {
                C0052p c0052p6 = abstractComponentCallbacksC0053q2.H;
            } else {
                abstractComponentCallbacksC0053q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0052p c0052p7 = abstractComponentCallbacksC0053q2.H;
                } else {
                    abstractComponentCallbacksC0053q2.getClass();
                }
            }
            arrayList3.add(c0044h);
            u6.f1515d.add(new J.l(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0044h) it5.next()).f1557a;
            AbstractC0001b.c(u7.f1514c.f1595E);
            int i2 = u7.f1512a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0044h c0044h2 = (C0044h) it6.next();
            hashMap.put((U) c0044h2.f1557a, Boolean.FALSE);
            c0044h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1559a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0042f c0042f2 = (C0042f) it7.next();
            U u8 = (U) c0042f2.f1557a;
            int c3 = AbstractC0001b.c(u8.f1514c.f1595E);
            int i3 = u8.f1512a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B1.c j = c0042f2.j(context);
                    if (j == null) {
                        c0042f2.d();
                    } else {
                        Animator animator = (Animator) j.f69c;
                        if (animator == null) {
                            arrayList5.add(c0042f2);
                        } else {
                            U u9 = (U) c0042f2.f1557a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = u9.f1514c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0053q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0042f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f1512a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0053q3.f1595E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0040d(viewGroup, view, z5, u9, c0042f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((I.c) c0042f2.f1558b).a(new B1.c(animator, 8, u9));
                                it7 = it;
                                u4 = u2;
                                z4 = true;
                            }
                        }
                    }
                    u2 = u4;
                    it7 = it;
                    u4 = u2;
                } else {
                    u2 = u4;
                }
            } else {
                u2 = u4;
                it = it7;
            }
            c0042f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0042f c0042f3 = (C0042f) it8.next();
            U u11 = (U) c0042f3.f1557a;
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q4 = u11.f1514c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0053q4 + " as Animations cannot run alongside Transitions.");
                }
                c0042f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0053q4 + " as Animations cannot run alongside Animators.");
                }
                c0042f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0053q4.f1595E;
                B1.c j2 = c0042f3.j(context);
                j2.getClass();
                Animation animation = (Animation) j2.f68b;
                animation.getClass();
                if (u11.f1512a != 1) {
                    view2.startAnimation(animation);
                    c0042f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0057v runnableC0057v = new RunnableC0057v(animation, viewGroup, view2);
                    runnableC0057v.setAnimationListener(new AnimationAnimationListenerC0041e(u11, viewGroup, view2, c0042f3));
                    view2.startAnimation(runnableC0057v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                V.v vVar = new V.v();
                vVar.f1305a = view2;
                vVar.f1306b = viewGroup;
                vVar.f1307c = c0042f3;
                vVar.f1308d = u11;
                ((I.c) c0042f3.f1558b).a(vVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            AbstractC0001b.a(u12.f1514c.f1595E, u12.f1512a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.f1559a;
        WeakHashMap weakHashMap = M.P.f711a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f1562d = false;
            return;
        }
        synchronized (this.f1560b) {
            try {
                if (!this.f1560b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1561c);
                    this.f1561c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f1517g) {
                            this.f1561c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1560b);
                    this.f1560b.clear();
                    this.f1561c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((U) it2.next()).d();
                    }
                    b(arrayList2, this.f1562d);
                    this.f1562d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U d(AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        Iterator it = this.f1560b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1514c.equals(abstractComponentCallbacksC0053q) && !u2.f1516f) {
                return u2;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1559a;
        WeakHashMap weakHashMap = M.P.f711a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1560b) {
            try {
                g();
                Iterator it = this.f1560b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1561c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1559a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f1560b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1559a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(u3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    u3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it = this.f1560b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1513b == 2) {
                u2.c(AbstractC0001b.b(u2.f1514c.D().getVisibility()), 1);
            }
        }
    }
}
