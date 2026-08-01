package Y;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.winworm.neongrid.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0290e;

/* renamed from: Y.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1079b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1080c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1081e = false;

    public C0043i(ViewGroup viewGroup) {
        this.f1078a = viewGroup;
    }

    public static C0043i f(ViewGroup viewGroup, J0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0043i) {
            return (C0043i) tag;
        }
        eVar.getClass();
        C0043i c0043i = new C0043i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0043i);
        return c0043i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f1079b) {
            try {
                G.c cVar = new G.c();
                U d = d(o2.f1017c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f1079b.add(u2);
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
            int c2 = V.c(u5.f1035c.f1114E);
            int a2 = AbstractC0290e.a(u5.f1033a);
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = ((U) arrayList.get(arrayList.size() - 1)).f1035c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0050p c0050p = ((U) it3.next()).f1035c.f1116H;
            C0050p c0050p2 = abstractComponentCallbacksC0051q.f1116H;
            c0050p.f1102b = c0050p2.f1102b;
            c0050p.f1103c = c0050p2.f1103c;
            c0050p.d = c0050p2.d;
            c0050p.f1104e = c0050p2.f1104e;
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
            HashSet hashSet = u6.f1036e;
            hashSet.add(cVar);
            C0040f c0040f = new C0040f(u6, cVar);
            c0040f.d = false;
            c0040f.f1074c = z2;
            arrayList2.add(c0040f);
            G.c cVar2 = new G.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0042h c0042h = new C0042h(u6, cVar2);
            int i = u6.f1033a;
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = u6.f1035c;
            if (i == 2) {
                if (z2) {
                    C0050p c0050p3 = abstractComponentCallbacksC0051q2.f1116H;
                } else {
                    abstractComponentCallbacksC0051q2.getClass();
                }
                if (z2) {
                    C0050p c0050p4 = abstractComponentCallbacksC0051q2.f1116H;
                } else {
                    C0050p c0050p5 = abstractComponentCallbacksC0051q2.f1116H;
                }
            } else if (z2) {
                C0050p c0050p6 = abstractComponentCallbacksC0051q2.f1116H;
            } else {
                abstractComponentCallbacksC0051q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0050p c0050p7 = abstractComponentCallbacksC0051q2.f1116H;
                } else {
                    abstractComponentCallbacksC0051q2.getClass();
                }
            }
            arrayList3.add(c0042h);
            u6.d.add(new H.n(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0042h) it5.next()).f1076a;
            V.c(u7.f1035c.f1114E);
            int i2 = u7.f1033a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0042h c0042h2 = (C0042h) it6.next();
            hashMap.put((U) c0042h2.f1076a, Boolean.FALSE);
            c0042h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1078a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0040f c0040f2 = (C0040f) it7.next();
            U u8 = (U) c0040f2.f1076a;
            int c3 = V.c(u8.f1035c.f1114E);
            int i3 = u8.f1033a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B.j j2 = c0040f2.j(context);
                    if (j2 == null) {
                        c0040f2.d();
                    } else {
                        Animator animator = (Animator) j2.f46c;
                        if (animator == null) {
                            arrayList5.add(c0040f2);
                        } else {
                            U u9 = (U) c0040f2.f1076a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = u9.f1035c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0051q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0040f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f1033a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0051q3.f1114E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0038d(viewGroup, view, z5, u9, c0040f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((G.c) c0040f2.f1077b).a(new B.j(animator, 7, u9));
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
            c0040f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0040f c0040f3 = (C0040f) it8.next();
            U u11 = (U) c0040f3.f1076a;
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q4 = u11.f1035c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0051q4 + " as Animations cannot run alongside Transitions.");
                }
                c0040f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0051q4 + " as Animations cannot run alongside Animators.");
                }
                c0040f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0051q4.f1114E;
                B.j j3 = c0040f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f45b;
                animation.getClass();
                if (u11.f1033a != 1) {
                    view2.startAnimation(animation);
                    c0040f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0055v runnableC0055v = new RunnableC0055v(animation, viewGroup, view2);
                    runnableC0055v.setAnimationListener(new AnimationAnimationListenerC0039e(u11, viewGroup, view2, c0040f3));
                    view2.startAnimation(runnableC0055v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                U.u uVar = new U.u();
                uVar.f883a = view2;
                uVar.f884b = viewGroup;
                uVar.f885c = c0040f3;
                uVar.d = u11;
                ((G.c) c0040f3.f1077b).a(uVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            V.a(u12.f1035c.f1114E, u12.f1033a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.f1081e) {
            return;
        }
        ViewGroup viewGroup = this.f1078a;
        WeakHashMap weakHashMap = K.T.f440a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f1079b) {
            try {
                if (!this.f1079b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1080c);
                    this.f1080c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f1038g) {
                            this.f1080c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1079b);
                    this.f1079b.clear();
                    this.f1080c.addAll(arrayList2);
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

    public final U d(AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        Iterator it = this.f1079b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1035c.equals(abstractComponentCallbacksC0051q) && !u2.f1037f) {
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
        ViewGroup viewGroup = this.f1078a;
        WeakHashMap weakHashMap = K.T.f440a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1079b) {
            try {
                g();
                Iterator it = this.f1079b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1080c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1078a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f1079b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1078a + " is not attached to window. ";
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
        Iterator it = this.f1079b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1034b == 2) {
                u2.c(V.b(u2.f1035c.D().getVisibility()), 1);
            }
        }
    }
}
