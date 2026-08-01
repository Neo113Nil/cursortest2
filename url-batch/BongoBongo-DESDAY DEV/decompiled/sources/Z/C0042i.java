package Z;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.winfour.winrandom.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import r.AbstractC0290e;

/* renamed from: Z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1129a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1130b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1131c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1132e = false;

    public C0042i(ViewGroup viewGroup) {
        this.f1129a = viewGroup;
    }

    public static C0042i f(ViewGroup viewGroup, K0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0042i) {
            return (C0042i) tag;
        }
        eVar.getClass();
        C0042i c0042i = new C0042i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0042i);
        return c0042i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f1130b) {
            try {
                H.c cVar = new H.c();
                U d = d(o2.f1064c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f1130b.add(u2);
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
            int c2 = V.c(u5.f1083c.f1166E);
            int a2 = AbstractC0290e.a(u5.f1081a);
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = ((U) arrayList.get(arrayList.size() - 1)).f1083c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0049p c0049p = ((U) it3.next()).f1083c.f1168H;
            C0049p c0049p2 = abstractComponentCallbacksC0050q.f1168H;
            c0049p.f1153b = c0049p2.f1153b;
            c0049p.f1154c = c0049p2.f1154c;
            c0049p.d = c0049p2.d;
            c0049p.f1155e = c0049p2.f1155e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            U u6 = (U) it4.next();
            H.c cVar = new H.c();
            u6.d();
            HashSet hashSet = u6.f1084e;
            hashSet.add(cVar);
            C0039f c0039f = new C0039f(u6, cVar);
            c0039f.d = false;
            c0039f.f1125c = z2;
            arrayList2.add(c0039f);
            H.c cVar2 = new H.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0041h c0041h = new C0041h(u6, cVar2);
            int i = u6.f1081a;
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = u6.f1083c;
            if (i == 2) {
                if (z2) {
                    C0049p c0049p3 = abstractComponentCallbacksC0050q2.f1168H;
                } else {
                    abstractComponentCallbacksC0050q2.getClass();
                }
                if (z2) {
                    C0049p c0049p4 = abstractComponentCallbacksC0050q2.f1168H;
                } else {
                    C0049p c0049p5 = abstractComponentCallbacksC0050q2.f1168H;
                }
            } else if (z2) {
                C0049p c0049p6 = abstractComponentCallbacksC0050q2.f1168H;
            } else {
                abstractComponentCallbacksC0050q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0049p c0049p7 = abstractComponentCallbacksC0050q2.f1168H;
                } else {
                    abstractComponentCallbacksC0050q2.getClass();
                }
            }
            arrayList3.add(c0041h);
            u6.d.add(new I.m(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0041h) it5.next()).f1127a;
            V.c(u7.f1083c.f1166E);
            int i2 = u7.f1081a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0041h c0041h2 = (C0041h) it6.next();
            hashMap.put((U) c0041h2.f1127a, Boolean.FALSE);
            c0041h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1129a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0039f c0039f2 = (C0039f) it7.next();
            U u8 = (U) c0039f2.f1127a;
            int c3 = V.c(u8.f1083c.f1166E);
            int i3 = u8.f1081a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    C.j j2 = c0039f2.j(context);
                    if (j2 == null) {
                        c0039f2.d();
                    } else {
                        Animator animator = (Animator) j2.f87c;
                        if (animator == null) {
                            arrayList5.add(c0039f2);
                        } else {
                            U u9 = (U) c0039f2.f1127a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = u9.f1083c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0050q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0039f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f1081a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0050q3.f1166E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0037d(viewGroup, view, z5, u9, c0039f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((H.c) c0039f2.f1128b).a(new C.j(animator, 6, u9));
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
            c0039f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0039f c0039f3 = (C0039f) it8.next();
            U u11 = (U) c0039f3.f1127a;
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q4 = u11.f1083c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0050q4 + " as Animations cannot run alongside Transitions.");
                }
                c0039f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0050q4 + " as Animations cannot run alongside Animators.");
                }
                c0039f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0050q4.f1166E;
                C.j j3 = c0039f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f86b;
                animation.getClass();
                if (u11.f1081a != 1) {
                    view2.startAnimation(animation);
                    c0039f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0054v runnableC0054v = new RunnableC0054v(animation, viewGroup, view2);
                    runnableC0054v.setAnimationListener(new AnimationAnimationListenerC0038e(u11, viewGroup, view2, c0039f3));
                    view2.startAnimation(runnableC0054v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                ((H.c) c0039f3.f1128b).a(new S0.g(view2, viewGroup, c0039f3, u11));
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            V.a(u12.f1083c.f1166E, u12.f1081a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.f1132e) {
            return;
        }
        ViewGroup viewGroup = this.f1129a;
        WeakHashMap weakHashMap = L.T.f490a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f1130b) {
            try {
                if (!this.f1130b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1131c);
                    this.f1131c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f1086g) {
                            this.f1131c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1130b);
                    this.f1130b.clear();
                    this.f1131c.addAll(arrayList2);
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

    public final U d(AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        Iterator it = this.f1130b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1083c.equals(abstractComponentCallbacksC0050q) && !u2.f1085f) {
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
        ViewGroup viewGroup = this.f1129a;
        WeakHashMap weakHashMap = L.T.f490a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1130b) {
            try {
                g();
                Iterator it = this.f1130b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1131c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1129a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f1130b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1129a + " is not attached to window. ";
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
        Iterator it = this.f1130b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f1082b == 2) {
                u2.c(V.b(u2.f1083c.D().getVisibility()), 1);
            }
        }
    }
}
