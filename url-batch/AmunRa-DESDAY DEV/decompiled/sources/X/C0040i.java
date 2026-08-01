package X;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.visualfortune.eyerest.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0285e;

/* renamed from: X.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f962a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f963b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f964c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f965e = false;

    public C0040i(ViewGroup viewGroup) {
        this.f962a = viewGroup;
    }

    public static C0040i f(ViewGroup viewGroup, I0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0040i) {
            return (C0040i) tag;
        }
        eVar.getClass();
        C0040i c0040i = new C0040i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0040i);
        return c0040i;
    }

    public final void a(int i, int i2, O o2) {
        synchronized (this.f963b) {
            try {
                G.c cVar = new G.c();
                U d = d(o2.f901c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                U u2 = new U(i, i2, o2, cVar);
                this.f963b.add(u2);
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
            int c2 = V.c(u5.f919c.f995E);
            int a2 = AbstractC0285e.a(u5.f917a);
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((U) arrayList.get(arrayList.size() - 1)).f919c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0047p c0047p = ((U) it3.next()).f919c.f997H;
            C0047p c0047p2 = abstractComponentCallbacksC0048q.f997H;
            c0047p.f983b = c0047p2.f983b;
            c0047p.f984c = c0047p2.f984c;
            c0047p.d = c0047p2.d;
            c0047p.f985e = c0047p2.f985e;
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
            HashSet hashSet = u6.f920e;
            hashSet.add(cVar);
            C0037f c0037f = new C0037f(u6, cVar);
            c0037f.d = false;
            c0037f.f958c = z2;
            arrayList2.add(c0037f);
            G.c cVar2 = new G.c();
            u6.d();
            hashSet.add(cVar2);
            if (!z2 ? u6 == u4 : u6 == u3) {
                z3 = true;
            }
            C0039h c0039h = new C0039h(u6, cVar2);
            int i = u6.f917a;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = u6.f919c;
            if (i == 2) {
                if (z2) {
                    C0047p c0047p3 = abstractComponentCallbacksC0048q2.f997H;
                } else {
                    abstractComponentCallbacksC0048q2.getClass();
                }
                if (z2) {
                    C0047p c0047p4 = abstractComponentCallbacksC0048q2.f997H;
                } else {
                    C0047p c0047p5 = abstractComponentCallbacksC0048q2.f997H;
                }
            } else if (z2) {
                C0047p c0047p6 = abstractComponentCallbacksC0048q2.f997H;
            } else {
                abstractComponentCallbacksC0048q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0047p c0047p7 = abstractComponentCallbacksC0048q2.f997H;
                } else {
                    abstractComponentCallbacksC0048q2.getClass();
                }
            }
            arrayList3.add(c0039h);
            u6.d.add(new H.n(this, arrayList4, u6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            U u7 = (U) ((C0039h) it5.next()).f960a;
            V.c(u7.f919c.f995E);
            int i2 = u7.f917a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0039h c0039h2 = (C0039h) it6.next();
            hashMap.put((U) c0039h2.f960a, Boolean.FALSE);
            c0039h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f962a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0037f c0037f2 = (C0037f) it7.next();
            U u8 = (U) c0037f2.f960a;
            int c3 = V.c(u8.f919c.f995E);
            int i3 = u8.f917a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B.j j2 = c0037f2.j(context);
                    if (j2 == null) {
                        c0037f2.d();
                    } else {
                        Animator animator = (Animator) j2.f26c;
                        if (animator == null) {
                            arrayList5.add(c0037f2);
                        } else {
                            U u9 = (U) c0037f2.f960a;
                            u2 = u4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(u9));
                            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = u9.f919c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0048q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0037f2.d();
                                it7 = it;
                                u4 = u2;
                            } else {
                                boolean z5 = u9.f917a == 3;
                                if (z5) {
                                    arrayList4.remove(u9);
                                }
                                View view = abstractComponentCallbacksC0048q3.f995E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0035d(viewGroup, view, z5, u9, c0037f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + u9 + " has started.");
                                }
                                ((G.c) c0037f2.f961b).a(new B.j(animator, 7, u9));
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
            c0037f2.d();
            it7 = it;
            u4 = u2;
        }
        U u10 = u4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0037f c0037f3 = (C0037f) it8.next();
            U u11 = (U) c0037f3.f960a;
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q4 = u11.f919c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0048q4 + " as Animations cannot run alongside Transitions.");
                }
                c0037f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0048q4 + " as Animations cannot run alongside Animators.");
                }
                c0037f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0048q4.f995E;
                B.j j3 = c0037f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f25b;
                animation.getClass();
                if (u11.f917a != 1) {
                    view2.startAnimation(animation);
                    c0037f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0052v runnableC0052v = new RunnableC0052v(animation, viewGroup, view2);
                    runnableC0052v.setAnimationListener(new AnimationAnimationListenerC0036e(u11, viewGroup, view2, c0037f3));
                    view2.startAnimation(runnableC0052v);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u11 + " has started.");
                    }
                }
                T.u uVar = new T.u();
                uVar.f791a = view2;
                uVar.f792b = viewGroup;
                uVar.f793c = c0037f3;
                uVar.d = u11;
                ((G.c) c0037f3.f961b).a(uVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            U u12 = (U) it9.next();
            V.a(u12.f919c.f995E, u12.f917a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u3 + " to " + u10);
        }
    }

    public final void c() {
        if (this.f965e) {
            return;
        }
        ViewGroup viewGroup = this.f962a;
        WeakHashMap weakHashMap = K.S.f362a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f963b) {
            try {
                if (!this.f963b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f964c);
                    this.f964c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        U u2 = (U) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u2);
                        }
                        u2.a();
                        if (!u2.f922g) {
                            this.f964c.add(u2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f963b);
                    this.f963b.clear();
                    this.f964c.addAll(arrayList2);
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

    public final U d(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        Iterator it = this.f963b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f919c.equals(abstractComponentCallbacksC0048q) && !u2.f921f) {
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
        ViewGroup viewGroup = this.f962a;
        WeakHashMap weakHashMap = K.S.f362a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f963b) {
            try {
                g();
                Iterator it = this.f963b.iterator();
                while (it.hasNext()) {
                    ((U) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f964c).iterator();
                while (it2.hasNext()) {
                    U u2 = (U) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f962a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u2.a();
                }
                Iterator it3 = new ArrayList(this.f963b).iterator();
                while (it3.hasNext()) {
                    U u3 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f962a + " is not attached to window. ";
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
        Iterator it = this.f963b.iterator();
        while (it.hasNext()) {
            U u2 = (U) it.next();
            if (u2.f918b == 2) {
                u2.c(V.b(u2.f919c.D().getVisibility()), 1);
            }
        }
    }
}
