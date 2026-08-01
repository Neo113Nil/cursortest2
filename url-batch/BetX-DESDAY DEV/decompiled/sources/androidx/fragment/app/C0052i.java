package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.luckyarcade.spinthrow.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.AbstractC0319e;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052i {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1345a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1346b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1347c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f1348d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1349e = false;

    public C0052i(ViewGroup viewGroup) {
        this.f1345a = viewGroup;
    }

    public static C0052i f(ViewGroup viewGroup, H0.e eVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0052i) {
            return (C0052i) tag;
        }
        eVar.getClass();
        C0052i c0052i = new C0052i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0052i);
        return c0052i;
    }

    public final void a(int i, int i2, S s2) {
        synchronized (this.f1346b) {
            try {
                G.d dVar = new G.d();
                X d2 = d(s2.f1275c);
                if (d2 != null) {
                    d2.c(i, i2);
                    return;
                }
                X x2 = new X(i, i2, s2, dVar);
                this.f1346b.add(x2);
                x2.f1297d.add(new W(this, x2, 0));
                x2.f1297d.add(new W(this, x2, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z2) {
        X x2;
        Iterator it;
        Iterator it2 = arrayList.iterator();
        X x3 = null;
        X x4 = null;
        while (it2.hasNext()) {
            X x5 = (X) it2.next();
            int c2 = X0.e.c(x5.f1296c.f1382E);
            int a2 = AbstractC0319e.a(x5.f1294a);
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                    }
                } else if (c2 != 2) {
                    x4 = x5;
                }
            }
            if (c2 == 2 && x3 == null) {
                x3 = x5;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + x3 + " to " + x4);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = ((X) arrayList.get(arrayList.size() - 1)).f1296c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0059p c0059p = ((X) it3.next()).f1296c.f1384H;
            C0059p c0059p2 = abstractComponentCallbacksC0060q.f1384H;
            c0059p.f1369b = c0059p2.f1369b;
            c0059p.f1370c = c0059p2.f1370c;
            c0059p.f1371d = c0059p2.f1371d;
            c0059p.f1372e = c0059p2.f1372e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            X x6 = (X) it4.next();
            G.d dVar = new G.d();
            x6.d();
            HashSet hashSet = x6.f1298e;
            hashSet.add(dVar);
            C0049f c0049f = new C0049f(x6, dVar);
            c0049f.f1341d = false;
            c0049f.f1340c = z2;
            arrayList2.add(c0049f);
            G.d dVar2 = new G.d();
            x6.d();
            hashSet.add(dVar2);
            if (!z2 ? x6 == x4 : x6 == x3) {
                z3 = true;
            }
            C0051h c0051h = new C0051h(x6, dVar2);
            int i = x6.f1294a;
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = x6.f1296c;
            if (i == 2) {
                if (z2) {
                    C0059p c0059p3 = abstractComponentCallbacksC0060q2.f1384H;
                } else {
                    abstractComponentCallbacksC0060q2.getClass();
                }
                if (z2) {
                    C0059p c0059p4 = abstractComponentCallbacksC0060q2.f1384H;
                } else {
                    C0059p c0059p5 = abstractComponentCallbacksC0060q2.f1384H;
                }
            } else if (z2) {
                C0059p c0059p6 = abstractComponentCallbacksC0060q2.f1384H;
            } else {
                abstractComponentCallbacksC0060q2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0059p c0059p7 = abstractComponentCallbacksC0060q2.f1384H;
                } else {
                    abstractComponentCallbacksC0060q2.getClass();
                }
            }
            arrayList3.add(c0051h);
            x6.f1297d.add(new H.n(this, arrayList4, x6));
        }
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            X x7 = (X) ((C0051h) it5.next()).f1343a;
            X0.e.c(x7.f1296c.f1382E);
            int i2 = x7.f1294a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0051h c0051h2 = (C0051h) it6.next();
            hashMap.put((X) c0051h2.f1343a, Boolean.FALSE);
            c0051h2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1345a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0049f c0049f2 = (C0049f) it7.next();
            X x8 = (X) c0049f2.f1343a;
            int c3 = X0.e.c(x8.f1296c.f1382E);
            int i3 = x8.f1294a;
            if (c3 != i3) {
                it = it7;
                if (c3 == 2 || i3 == 2) {
                    B.j j2 = c0049f2.j(context);
                    if (j2 == null) {
                        c0049f2.d();
                    } else {
                        Animator animator = (Animator) j2.f37c;
                        if (animator == null) {
                            arrayList5.add(c0049f2);
                        } else {
                            X x9 = (X) c0049f2.f1343a;
                            x2 = x4;
                            boolean equals = Boolean.TRUE.equals(hashMap.get(x9));
                            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = x9.f1296c;
                            if (equals) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0060q3 + " as this Fragment was involved in a Transition.");
                                }
                                c0049f2.d();
                                it7 = it;
                                x4 = x2;
                            } else {
                                boolean z5 = x9.f1294a == 3;
                                if (z5) {
                                    arrayList4.remove(x9);
                                }
                                View view = abstractComponentCallbacksC0060q3.f1382E;
                                viewGroup.startViewTransition(view);
                                animator.addListener(new C0047d(viewGroup, view, z5, x9, c0049f2));
                                animator.setTarget(view);
                                animator.start();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "Animator from operation " + x9 + " has started.");
                                }
                                ((G.d) c0049f2.f1344b).a(new B.j(animator, 6, x9));
                                it7 = it;
                                x4 = x2;
                                z4 = true;
                            }
                        }
                    }
                    x2 = x4;
                    it7 = it;
                    x4 = x2;
                } else {
                    x2 = x4;
                }
            } else {
                x2 = x4;
                it = it7;
            }
            c0049f2.d();
            it7 = it;
            x4 = x2;
        }
        X x10 = x4;
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0049f c0049f3 = (C0049f) it8.next();
            X x11 = (X) c0049f3.f1343a;
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q4 = x11.f1296c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0060q4 + " as Animations cannot run alongside Transitions.");
                }
                c0049f3.d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0060q4 + " as Animations cannot run alongside Animators.");
                }
                c0049f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0060q4.f1382E;
                B.j j3 = c0049f3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.f36b;
                animation.getClass();
                if (x11.f1294a != 1) {
                    view2.startAnimation(animation);
                    c0049f3.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0065w runnableC0065w = new RunnableC0065w(animation, viewGroup, view2);
                    runnableC0065w.setAnimationListener(new AnimationAnimationListenerC0048e(x11, viewGroup, view2, c0049f3));
                    view2.startAnimation(runnableC0065w);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + x11 + " has started.");
                    }
                }
                T.v vVar = new T.v();
                vVar.f824a = view2;
                vVar.f825b = viewGroup;
                vVar.f826c = c0049f3;
                vVar.f827d = x11;
                ((G.d) c0049f3.f1344b).a(vVar);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            X x12 = (X) it9.next();
            X0.e.a(x12.f1296c.f1382E, x12.f1294a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + x3 + " to " + x10);
        }
    }

    public final void c() {
        if (this.f1349e) {
            return;
        }
        ViewGroup viewGroup = this.f1345a;
        WeakHashMap weakHashMap = K.X.f419a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f1348d = false;
            return;
        }
        synchronized (this.f1346b) {
            try {
                if (!this.f1346b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1347c);
                    this.f1347c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        X x2 = (X) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + x2);
                        }
                        x2.a();
                        if (!x2.f1300g) {
                            this.f1347c.add(x2);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f1346b);
                    this.f1346b.clear();
                    this.f1347c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((X) it2.next()).d();
                    }
                    b(arrayList2, this.f1348d);
                    this.f1348d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final X d(AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        Iterator it = this.f1346b.iterator();
        while (it.hasNext()) {
            X x2 = (X) it.next();
            if (x2.f1296c.equals(abstractComponentCallbacksC0060q) && !x2.f1299f) {
                return x2;
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
        ViewGroup viewGroup = this.f1345a;
        WeakHashMap weakHashMap = K.X.f419a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1346b) {
            try {
                g();
                Iterator it = this.f1346b.iterator();
                while (it.hasNext()) {
                    ((X) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f1347c).iterator();
                while (it2.hasNext()) {
                    X x2 = (X) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1345a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(x2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    x2.a();
                }
                Iterator it3 = new ArrayList(this.f1346b).iterator();
                while (it3.hasNext()) {
                    X x3 = (X) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1345a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(x3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    x3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it = this.f1346b.iterator();
        while (it.hasNext()) {
            X x2 = (X) it.next();
            if (x2.f1295b == 2) {
                x2.c(X0.e.b(x2.f1296c.z().getVisibility()), 1);
            }
        }
    }
}
