package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f465a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f466b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f467c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f468e = false;

    public l(ViewGroup viewGroup) {
        this.f465a = viewGroup;
    }

    public static l f(ViewGroup viewGroup, l2.f fVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof l) {
            return (l) tag;
        }
        fVar.getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public final void a(int i, int i4, q0 q0Var) {
        synchronized (this.f466b) {
            try {
                j0.c cVar = new j0.c();
                v0 d = d(q0Var.f511c);
                if (d != null) {
                    d.c(i, i4);
                    return;
                }
                v0 v0Var = new v0(i, i4, q0Var, cVar);
                this.f466b.add(v0Var);
                v0Var.d.add(new u0(this, v0Var, 0));
                v0Var.d.add(new u0(this, v0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z3) {
        boolean z4;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        v0 v0Var = null;
        v0 v0Var2 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            v0 v0Var3 = (v0) obj;
            int c4 = w0.c(v0Var3.f562c.J);
            int a2 = t.e.a(v0Var3.f560a);
            if (a2 != 0) {
                if (a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                    }
                } else if (c4 != 2) {
                    v0Var2 = v0Var3;
                }
            }
            if (c4 == 2 && v0Var == null) {
                v0Var = v0Var3;
            }
        }
        if (k0.E(2)) {
            Log.v("FragmentManager", "Executing operations from " + v0Var + " to " + v0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        u uVar = ((v0) arrayList2.get(arrayList2.size() - 1)).f562c;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            s sVar = ((v0) obj2).f562c.M;
            s sVar2 = uVar.M;
            sVar.f522b = sVar2.f522b;
            sVar.f523c = sVar2.f523c;
            sVar.d = sVar2.d;
            sVar.f524e = sVar2.f524e;
        }
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            v0 v0Var4 = (v0) obj3;
            j0.c cVar = new j0.c();
            v0Var4.d();
            HashSet hashSet = v0Var4.f563e;
            hashSet.add(cVar);
            i iVar = new i(v0Var4, cVar);
            iVar.d = false;
            iVar.f435c = z3;
            arrayList3.add(iVar);
            j0.c cVar2 = new j0.c();
            v0Var4.d();
            hashSet.add(cVar2);
            boolean z5 = !z3 ? v0Var4 != v0Var2 : v0Var4 != v0Var;
            k kVar = new k(v0Var4, cVar2);
            int i6 = v0Var4.f560a;
            u uVar2 = v0Var4.f562c;
            if (i6 == 2) {
                if (z3) {
                    s sVar3 = uVar2.M;
                } else {
                    uVar2.getClass();
                }
                if (z3) {
                    s sVar4 = uVar2.M;
                } else {
                    s sVar5 = uVar2.M;
                }
            } else if (z3) {
                s sVar6 = uVar2.M;
            } else {
                uVar2.getClass();
            }
            if (z5) {
                if (z3) {
                    s sVar7 = uVar2.M;
                } else {
                    uVar2.getClass();
                }
            }
            arrayList4.add(kVar);
            v0Var4.d.add(new e(this, arrayList5, v0Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj4 = arrayList4.get(i7);
            i7++;
            v0 v0Var5 = (v0) ((k) obj4).f437a;
            if (w0.c(v0Var5.f562c.J) != v0Var5.f560a) {
            }
        }
        int size5 = arrayList4.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj5 = arrayList4.get(i8);
            i8++;
            k kVar2 = (k) obj5;
            hashMap.put((v0) kVar2.f437a, Boolean.FALSE);
            kVar2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f465a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z6 = false;
        int i9 = 0;
        while (i9 < size6) {
            Object obj6 = arrayList3.get(i9);
            i9++;
            i iVar2 = (i) obj6;
            boolean z7 = containsValue;
            v0 v0Var6 = (v0) iVar2.f437a;
            ArrayList arrayList7 = arrayList3;
            int c5 = w0.c(v0Var6.f562c.J);
            int i10 = v0Var6.f560a;
            int i11 = size6;
            if (c5 == i10 || !(c5 == 2 || i10 == 2)) {
                z4 = z6;
                viewGroup = viewGroup2;
                iVar2.d();
            } else {
                androidx.emoji2.text.q j4 = iVar2.j(context);
                if (j4 == null) {
                    iVar2.d();
                } else {
                    Animator animator = (Animator) j4.f347h;
                    if (animator == null) {
                        arrayList6.add(iVar2);
                    } else {
                        v0 v0Var7 = (v0) iVar2.f437a;
                        u uVar3 = v0Var7.f562c;
                        z4 = z6;
                        if (Boolean.TRUE.equals(hashMap.get(v0Var7))) {
                            if (k0.E(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + uVar3 + " as this Fragment was involved in a Transition.");
                            }
                            iVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z8 = v0Var7.f560a == 3;
                            if (z8) {
                                arrayList5.remove(v0Var7);
                            }
                            View view = uVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new f(viewGroup3, view, z8, v0Var7, iVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (k0.E(2)) {
                                Log.v("FragmentManager", "Animator from operation " + v0Var7 + " has started.");
                            }
                            ((j0.c) iVar2.f438b).a(new androidx.emoji2.text.q(animator, v0Var7, 1));
                            containsValue = z7;
                            size6 = i11;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            z6 = true;
                        }
                    }
                }
                z4 = z6;
                viewGroup = viewGroup2;
            }
            containsValue = z7;
            size6 = i11;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            z6 = z4;
        }
        boolean z9 = containsValue;
        boolean z10 = z6;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i12 = 0;
        while (i12 < size7) {
            Object obj7 = arrayList6.get(i12);
            i12++;
            i iVar3 = (i) obj7;
            v0 v0Var8 = (v0) iVar3.f437a;
            u uVar4 = v0Var8.f562c;
            if (z9) {
                if (k0.E(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Transitions.");
                }
                iVar3.d();
            } else if (z10) {
                if (k0.E(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Animators.");
                }
                iVar3.d();
            } else {
                View view2 = uVar4.J;
                androidx.emoji2.text.q j5 = iVar3.j(context);
                j5.getClass();
                Animation animation = (Animation) j5.f346g;
                animation.getClass();
                int i13 = size7;
                if (v0Var8.f560a != 1) {
                    view2.startAnimation(animation);
                    iVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    x xVar = new x(animation, viewGroup4, view2);
                    xVar.setAnimationListener(new h(view2, viewGroup4, iVar3, v0Var8));
                    view2.startAnimation(xVar);
                    if (k0.E(2)) {
                        Log.v("FragmentManager", "Animation from operation " + v0Var8 + " has started.");
                    }
                }
                ((j0.c) iVar3.f438b).a(new a0.j(view2, viewGroup4, iVar3, v0Var8));
                size7 = i13;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            v0 v0Var9 = (v0) obj8;
            w0.a(v0Var9.f562c.J, v0Var9.f560a);
        }
        arrayList5.clear();
        if (k0.E(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + v0Var + " to " + v0Var2);
        }
    }

    public final void c() {
        if (this.f468e) {
            return;
        }
        ViewGroup viewGroup = this.f465a;
        WeakHashMap weakHashMap = n0.l0.f2757a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f466b) {
            try {
                if (!this.f466b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f467c);
                    this.f467c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        v0 v0Var = (v0) obj;
                        if (k0.E(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + v0Var);
                        }
                        v0Var.a();
                        if (!v0Var.f565g) {
                            this.f467c.add(v0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f466b);
                    this.f466b.clear();
                    this.f467c.addAll(arrayList2);
                    if (k0.E(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((v0) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (k0.E(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v0 d(u uVar) {
        ArrayList arrayList = this.f466b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v0 v0Var = (v0) obj;
            if (v0Var.f562c.equals(uVar) && !v0Var.f564f) {
                return v0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (k0.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f465a;
        WeakHashMap weakHashMap = n0.l0.f2757a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f466b) {
            try {
                g();
                ArrayList arrayList = this.f466b;
                int size = arrayList.size();
                int i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((v0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f467c);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    v0 v0Var = (v0) obj2;
                    if (k0.E(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f465a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(v0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    v0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f466b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    v0 v0Var2 = (v0) obj3;
                    if (k0.E(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f465a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(v0Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    v0Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f466b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v0 v0Var = (v0) obj;
            if (v0Var.f561b == 2) {
                v0Var.c(w0.b(v0Var.f562c.D().getVisibility()), 1);
            }
        }
    }
}
