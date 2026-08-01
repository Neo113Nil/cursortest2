package X;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.skydrop.fallring.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0291e;

/* renamed from: X.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f922a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f923b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f924c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f925e = false;

    public C0041i(ViewGroup viewGroup) {
        this.f922a = viewGroup;
    }

    public static C0041i f(ViewGroup viewGroup, H0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0041i) {
            return (C0041i) tag;
        }
        eVar.getClass();
        C0041i c0041i = new C0041i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0041i);
        return c0041i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f923b) {
            try {
                G.c cVar = new G.c();
                U d = d(o2.f861c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f923b.add(u2);
                u2.d.add(new T(this, u2, 0));
                u2.d.add(new T(this, u2, 1));
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
            int c2 = V.c(u5.f879c.f958E);
            int a2 = AbstractC0291e.a(u5.f877a);
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
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = ((U) arrayList.get(arrayList.size() - 1)).f879c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0048p c0048p = ((U) it3.next()).f879c.f960H;
            C0048p c0048p2 = abstractComponentCallbacksC0049q.f960H;
            c0048p.f946b = c0048p2.f946b;
            c0048p.f947c = c0048p2.f947c;
            c0048p.d = c0048p2.d;
            c0048p.f948e = c0048p2.f948e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            U u6 = (U) it4.next();
            G.c cVar = new G.c();
            u6.d();
            HashSet hashSet = u6.f880e;
            hashSet.add(cVar);
            C0038f c0038f = new C0038f(u6, cVar);
            c0038f.d = false;
            c0038f.f918c = z2;
            arrayList2.add(c0038f);
            G.c cVar2 = new G.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0040h c0040h = new C0040h(u6, cVar2);
            int i = u6.f877a;
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q2 = u6.f879c;
            if (i == 2) {
                if (z2) {
                    C0048p c0048p3 = abstractComponentCallbacksC0049q2.f960H;
                } else {
                    abstractComponentCallbacksC0049q2.getClass();
                }
                if (z2) {
                    C0048p c0048p4 = abstractComponentCallbacksC0049q2.f960H;
                } else {
                    C0048p c0048p5 = abstractComponentCallbacksC0049q2.f960H;
                }
            } else if (z2) {
                C0048p c0048p6 = abstractComponentCallbacksC0049q2.f960H;
            } else {
                abstractComponentCallbacksC0049q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0048p c0048p7 = abstractComponentCallbacksC0049q2.f960H;
                } else {
                    abstractComponentCallbacksC0049q2.getClass();
                }
            }
            arrayList3.add(c0040h);
            u6.d.add(new H.n(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0040h) it5.next()).f920a;
            V.c(u7.f879c.f958E);
            int i2 = u7.f877a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0040h c0040h2 = (C0040h) it6.next();
            hashMap.put((U) c0040h2.f920a, Boolean.FALSE);
            c0040h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f922a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0038f c0038f2 = (C0038f) it7.next();
            U u8 = (U) c0038f2.f920a;
            int c3 = V.c(u8.f879c.f958E);
            int i3 = u8.f877a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B.j j2 = c0038f2.j(context);
                    if (j2 == null) {
                        c0038f2.d();
                    } else {
                        Animator animator = (Animator) j2.f31c;
                        if (animator == null) {
                            arrayList5.add(c0038f2);
                        } else {
                            U u9 = (U) c0038f2.f920a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q3 = u9.f879c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0049q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0038f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f877a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0049q3.f958E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0036d(viewGroup, view, z5, u9, c0038f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((G.c) c0038f2.f921b).a(new B.j(animator, 7, u9));
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
            c0038f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0038f c0038f3 = (C0038f) it8.next();
            U u11 = (U) c0038f3.f920a;
            AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q4 = u11.f879c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0049q4 + " as Animations cannot run alongside Transitions.");
                }
                c0038f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0049q4 + " as Animations cannot run alongside Animators.");
                }
                c0038f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0049q4.f958E;
                B.j j3 = c0038f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f30b;
                animation.getClass();
                if (u11.f877a != 1) {
                    view2.startAnimation(animation);
                    c0038f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0053v runnableC0053v = new RunnableC0053v(animation, viewGroup, view2);
                    runnableC0053v.setAnimationListener(new AnimationAnimationListenerC0037e(u11, viewGroup, view2, c0038f3));
                    view2.startAnimation(runnableC0053v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                T.u uVar = new T.u();
                uVar.f752a = view2;
                uVar.f753b = viewGroup;
                uVar.f754c = c0038f3;
                uVar.d = u11;
                ((G.c) c0038f3.f921b).a(uVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            V.a(u12.f879c.f958E, u12.f877a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.f925e) {
            return;
        }
        ViewGroup viewGroup = this.f922a;
        WeakHashMap weakHashMap = K.T.f381a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f923b) {
            try {
                if (!this.f923b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f924c);
                    this.f924c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f882g) {
                            this.f924c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f923b);
                    this.f923b.clear();
                    this.f924c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((U) it2.next()).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final U d(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        Iterator it = this.f923b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f879c.equals(abstractComponentCallbacksC0049q) && !u2.f881f) {
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
        ViewGroup viewGroup = this.f922a;
        WeakHashMap weakHashMap = K.T.f381a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f923b) {
            try {
                g();
                Iterator it = this.f923b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f924c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f922a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f923b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f922a + " is not attached to window. ";
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
        Iterator it = this.f923b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f878b == 2) {
                u2.c(V.b(u2.f879c.D().getVisibility()), 1);
            }
        }
    }
}
