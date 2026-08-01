package X;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.glasspulse.glasspulse.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0273e;

/* renamed from: X.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1005a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1006b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1007c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1008e = false;

    public C0039i(ViewGroup viewGroup) {
        this.f1005a = viewGroup;
    }

    public static C0039i f(ViewGroup viewGroup, M0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0039i) {
            return (C0039i) tag;
        }
        eVar.getClass();
        C0039i c0039i = new C0039i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0039i);
        return c0039i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f1006b) {
            try {
                G.c cVar = new G.c();
                U d = d(o2.f944c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f1006b.add(u2);
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
            int c2 = V.c(u5.f962c.f1041E);
            int a2 = AbstractC0273e.a(u5.f960a);
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = ((U) arrayList.get(arrayList.size() - 1)).f962c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0046p c0046p = ((U) it3.next()).f962c.f1043H;
            C0046p c0046p2 = abstractComponentCallbacksC0047q.f1043H;
            c0046p.f1029b = c0046p2.f1029b;
            c0046p.f1030c = c0046p2.f1030c;
            c0046p.d = c0046p2.d;
            c0046p.f1031e = c0046p2.f1031e;
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
            HashSet hashSet = u6.f963e;
            hashSet.add(cVar);
            C0036f c0036f = new C0036f(u6, cVar);
            c0036f.d = false;
            c0036f.f1001c = z2;
            arrayList2.add(c0036f);
            G.c cVar2 = new G.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0038h c0038h = new C0038h(u6, cVar2);
            int i = u6.f960a;
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = u6.f962c;
            if (i == 2) {
                if (z2) {
                    C0046p c0046p3 = abstractComponentCallbacksC0047q2.f1043H;
                } else {
                    abstractComponentCallbacksC0047q2.getClass();
                }
                if (z2) {
                    C0046p c0046p4 = abstractComponentCallbacksC0047q2.f1043H;
                } else {
                    C0046p c0046p5 = abstractComponentCallbacksC0047q2.f1043H;
                }
            } else if (z2) {
                C0046p c0046p6 = abstractComponentCallbacksC0047q2.f1043H;
            } else {
                abstractComponentCallbacksC0047q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0046p c0046p7 = abstractComponentCallbacksC0047q2.f1043H;
                } else {
                    abstractComponentCallbacksC0047q2.getClass();
                }
            }
            arrayList3.add(c0038h);
            u6.d.add(new H.n(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0038h) it5.next()).f1003a;
            V.c(u7.f962c.f1041E);
            int i2 = u7.f960a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0038h c0038h2 = (C0038h) it6.next();
            hashMap.put((U) c0038h2.f1003a, Boolean.FALSE);
            c0038h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1005a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0036f c0036f2 = (C0036f) it7.next();
            U u8 = (U) c0036f2.f1003a;
            int c3 = V.c(u8.f962c.f1041E);
            int i3 = u8.f960a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B.j j2 = c0036f2.j(context);
                    if (j2 == null) {
                        c0036f2.d();
                    } else {
                        Animator animator = (Animator) j2.f54c;
                        if (animator == null) {
                            arrayList5.add(c0036f2);
                        } else {
                            U u9 = (U) c0036f2.f1003a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = u9.f962c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0047q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0036f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f960a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0047q3.f1041E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0034d(viewGroup, view, z5, u9, c0036f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((G.c) c0036f2.f1004b).a(new B.j(animator, 6, u9));
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
            c0036f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0036f c0036f3 = (C0036f) it8.next();
            U u11 = (U) c0036f3.f1003a;
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q4 = u11.f962c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0047q4 + " as Animations cannot run alongside Transitions.");
                }
                c0036f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0047q4 + " as Animations cannot run alongside Animators.");
                }
                c0036f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0047q4.f1041E;
                B.j j3 = c0036f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f53b;
                animation.getClass();
                if (u11.f960a != 1) {
                    view2.startAnimation(animation);
                    c0036f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0051v runnableC0051v = new RunnableC0051v(animation, viewGroup, view2);
                    runnableC0051v.setAnimationListener(new AnimationAnimationListenerC0035e(u11, viewGroup, view2, c0036f3));
                    view2.startAnimation(runnableC0051v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                T.u uVar = new T.u();
                uVar.f816a = view2;
                uVar.f817b = viewGroup;
                uVar.f818c = c0036f3;
                uVar.d = u11;
                ((G.c) c0036f3.f1004b).a(uVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            V.a(u12.f962c.f1041E, u12.f960a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.f1008e) {
            return;
        }
        ViewGroup viewGroup = this.f1005a;
        WeakHashMap weakHashMap = K.S.f351a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f1006b) {
            try {
                if (!this.f1006b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1007c);
                    this.f1007c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f965g) {
                            this.f1007c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1006b);
                    this.f1006b.clear();
                    this.f1007c.addAll(arrayList2);
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

    public final U d(AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        Iterator it = this.f1006b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f962c.equals(abstractComponentCallbacksC0047q) && !u2.f964f) {
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
        ViewGroup viewGroup = this.f1005a;
        WeakHashMap weakHashMap = K.S.f351a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1006b) {
            try {
                g();
                Iterator it = this.f1006b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1007c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1005a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f1006b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1005a + " is not attached to window. ";
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
        Iterator it = this.f1006b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f961b == 2) {
                u2.c(V.b(u2.f962c.D().getVisibility()), 1);
            }
        }
    }
}
