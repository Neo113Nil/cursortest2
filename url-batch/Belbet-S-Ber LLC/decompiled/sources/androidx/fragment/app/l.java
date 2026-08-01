package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f577a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f578b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f579c = new ArrayList();
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f580e = false;

    public l(ViewGroup viewGroup) {
        this.f577a = viewGroup;
    }

    public static l f(ViewGroup viewGroup, o2.f fVar) {
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
        synchronized (this.f578b) {
            try {
                j0.e eVar = new j0.e();
                v0 d = d(q0Var.f623c);
                if (d != null) {
                    d.c(i, i4);
                    return;
                }
                v0 v0Var = new v0(i, i4, q0Var, eVar);
                this.f578b.add(v0Var);
                v0Var.d.add(new u0(this, v0Var, 0));
                v0Var.d.add(new u0(this, v0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z4) {
        boolean z5;
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
            int c5 = a4.b.c(v0Var3.f669c.J);
            int a5 = t.e.a(v0Var3.f667a);
            if (a5 != 0) {
                if (a5 != 1) {
                    if (a5 != 2 && a5 != 3) {
                    }
                } else if (c5 != 2) {
                    v0Var2 = v0Var3;
                }
            }
            if (c5 == 2 && v0Var == null) {
                v0Var = v0Var3;
            }
        }
        if (k0.H(2)) {
            Log.v("FragmentManager", "Executing operations from " + v0Var + " to " + v0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        u uVar = ((v0) arrayList2.get(arrayList2.size() - 1)).f669c;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            s sVar = ((v0) obj2).f669c.M;
            s sVar2 = uVar.M;
            sVar.f633b = sVar2.f633b;
            sVar.f634c = sVar2.f634c;
            sVar.d = sVar2.d;
            sVar.f635e = sVar2.f635e;
        }
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            v0 v0Var4 = (v0) obj3;
            j0.e eVar = new j0.e();
            v0Var4.d();
            HashSet hashSet = v0Var4.f670e;
            hashSet.add(eVar);
            i iVar = new i(v0Var4, eVar);
            iVar.d = false;
            iVar.f548c = z4;
            arrayList3.add(iVar);
            j0.e eVar2 = new j0.e();
            v0Var4.d();
            hashSet.add(eVar2);
            boolean z6 = !z4 ? v0Var4 != v0Var2 : v0Var4 != v0Var;
            k kVar = new k(v0Var4, eVar2);
            int i6 = v0Var4.f667a;
            u uVar2 = v0Var4.f669c;
            if (i6 == 2) {
                if (z4) {
                    s sVar3 = uVar2.M;
                } else {
                    uVar2.getClass();
                }
                if (z4) {
                    s sVar4 = uVar2.M;
                } else {
                    s sVar5 = uVar2.M;
                }
            } else if (z4) {
                s sVar6 = uVar2.M;
            } else {
                uVar2.getClass();
            }
            if (z6) {
                if (z4) {
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
            v0 v0Var5 = (v0) ((k) obj4).f550a;
            if (a4.b.c(v0Var5.f669c.J) != v0Var5.f667a) {
            }
        }
        int size5 = arrayList4.size();
        int i8 = 0;
        while (i8 < size5) {
            Object obj5 = arrayList4.get(i8);
            i8++;
            k kVar2 = (k) obj5;
            hashMap.put((v0) kVar2.f550a, Boolean.FALSE);
            kVar2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f577a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z7 = false;
        int i9 = 0;
        while (i9 < size6) {
            Object obj6 = arrayList3.get(i9);
            i9++;
            i iVar2 = (i) obj6;
            boolean z8 = containsValue;
            v0 v0Var6 = (v0) iVar2.f550a;
            ArrayList arrayList7 = arrayList3;
            int c6 = a4.b.c(v0Var6.f669c.J);
            int i10 = v0Var6.f667a;
            int i11 = size6;
            if (c6 == i10 || !(c6 == 2 || i10 == 2)) {
                z5 = z7;
                viewGroup = viewGroup2;
                iVar2.d();
            } else {
                androidx.emoji2.text.q j2 = iVar2.j(context);
                if (j2 == null) {
                    iVar2.d();
                } else {
                    Animator animator = (Animator) j2.h;
                    if (animator == null) {
                        arrayList6.add(iVar2);
                    } else {
                        v0 v0Var7 = (v0) iVar2.f550a;
                        u uVar3 = v0Var7.f669c;
                        z5 = z7;
                        if (Boolean.TRUE.equals(hashMap.get(v0Var7))) {
                            if (k0.H(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + uVar3 + " as this Fragment was involved in a Transition.");
                            }
                            iVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z9 = v0Var7.f667a == 3;
                            if (z9) {
                                arrayList5.remove(v0Var7);
                            }
                            View view = uVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new f(viewGroup3, view, z9, v0Var7, iVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (k0.H(2)) {
                                Log.v("FragmentManager", "Animator from operation " + v0Var7 + " has started.");
                            }
                            ((j0.e) iVar2.f551b).a(new androidx.emoji2.text.q(animator, v0Var7, 1));
                            containsValue = z8;
                            size6 = i11;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            z7 = true;
                        }
                    }
                }
                z5 = z7;
                viewGroup = viewGroup2;
            }
            containsValue = z8;
            size6 = i11;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            z7 = z5;
        }
        boolean z10 = containsValue;
        boolean z11 = z7;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i12 = 0;
        while (i12 < size7) {
            Object obj7 = arrayList6.get(i12);
            i12++;
            i iVar3 = (i) obj7;
            v0 v0Var8 = (v0) iVar3.f550a;
            u uVar4 = v0Var8.f669c;
            if (z10) {
                if (k0.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Transitions.");
                }
                iVar3.d();
            } else if (z11) {
                if (k0.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Animators.");
                }
                iVar3.d();
            } else {
                View view2 = uVar4.J;
                androidx.emoji2.text.q j4 = iVar3.j(context);
                j4.getClass();
                Animation animation = (Animation) j4.f466g;
                animation.getClass();
                int i13 = size7;
                if (v0Var8.f667a != 1) {
                    view2.startAnimation(animation);
                    iVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    x xVar = new x(animation, viewGroup4, view2);
                    xVar.setAnimationListener(new h(v0Var8, viewGroup4, view2, iVar3));
                    view2.startAnimation(xVar);
                    if (k0.H(2)) {
                        Log.v("FragmentManager", "Animation from operation " + v0Var8 + " has started.");
                    }
                }
                j0.e eVar3 = (j0.e) iVar3.f551b;
                a0.k kVar3 = new a0.k();
                kVar3.f97f = view2;
                kVar3.f98g = viewGroup4;
                kVar3.h = iVar3;
                kVar3.i = v0Var8;
                eVar3.a(kVar3);
                size7 = i13;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            v0 v0Var9 = (v0) obj8;
            a4.b.a(v0Var9.f669c.J, v0Var9.f667a);
        }
        arrayList5.clear();
        if (k0.H(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + v0Var + " to " + v0Var2);
        }
    }

    public final void c() {
        if (this.f580e) {
            return;
        }
        ViewGroup viewGroup = this.f577a;
        WeakHashMap weakHashMap = n0.p0.f2816a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f578b) {
            try {
                if (!this.f578b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f579c);
                    this.f579c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        v0 v0Var = (v0) obj;
                        if (k0.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + v0Var);
                        }
                        v0Var.a();
                        if (!v0Var.f672g) {
                            this.f579c.add(v0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f578b);
                    this.f578b.clear();
                    this.f579c.addAll(arrayList2);
                    if (k0.H(2)) {
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
                    if (k0.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v0 d(u uVar) {
        ArrayList arrayList = this.f578b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v0 v0Var = (v0) obj;
            if (v0Var.f669c.equals(uVar) && !v0Var.f671f) {
                return v0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (k0.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f577a;
        WeakHashMap weakHashMap = n0.p0.f2816a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f578b) {
            try {
                g();
                ArrayList arrayList = this.f578b;
                int size = arrayList.size();
                int i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((v0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f579c);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    v0 v0Var = (v0) obj2;
                    if (k0.H(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f577a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(v0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    v0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f578b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    v0 v0Var2 = (v0) obj3;
                    if (k0.H(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f577a + " is not attached to window. ";
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
        ArrayList arrayList = this.f578b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v0 v0Var = (v0) obj;
            if (v0Var.f668b == 2) {
                v0Var.c(a4.b.b(v0Var.f669c.D().getVisibility()), 1);
            }
        }
    }
}
