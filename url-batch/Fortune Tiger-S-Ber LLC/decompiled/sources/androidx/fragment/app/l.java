package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f458a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f459b = new ArrayList();
    public final ArrayList c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f460d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f461e = false;

    public l(ViewGroup viewGroup) {
        this.f458a = viewGroup;
    }

    public static l f(ViewGroup viewGroup, g2.f fVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof l) {
            return (l) tag;
        }
        fVar.getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public final void a(int i4, int i5, q0 q0Var) {
        synchronized (this.f459b) {
            try {
                g0.b bVar = new g0.b();
                v0 d4 = d(q0Var.c);
                if (d4 != null) {
                    d4.c(i4, i5);
                    return;
                }
                v0 v0Var = new v0(i4, i5, q0Var, bVar);
                this.f459b.add(v0Var);
                v0Var.f544d.add(new u0(this, v0Var, 0));
                v0Var.f544d.add(new u0(this, v0Var, 1));
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
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            v0 v0Var3 = (v0) obj;
            int c = w0.c(v0Var3.c.J);
            int a4 = q.e.a(v0Var3.f542a);
            if (a4 != 0) {
                if (a4 != 1) {
                    if (a4 != 2 && a4 != 3) {
                    }
                } else if (c != 2) {
                    v0Var2 = v0Var3;
                }
            }
            if (c == 2 && v0Var == null) {
                v0Var = v0Var3;
            }
        }
        if (k0.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + v0Var + " to " + v0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        u uVar = ((v0) arrayList2.get(arrayList2.size() - 1)).c;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            s sVar = ((v0) obj2).c.M;
            s sVar2 = uVar.M;
            sVar.f510b = sVar2.f510b;
            sVar.c = sVar2.c;
            sVar.f511d = sVar2.f511d;
            sVar.f512e = sVar2.f512e;
        }
        int size3 = arrayList2.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            v0 v0Var4 = (v0) obj3;
            g0.b bVar = new g0.b();
            v0Var4.d();
            HashSet hashSet = v0Var4.f545e;
            hashSet.add(bVar);
            i iVar = new i(v0Var4, bVar);
            iVar.f429d = false;
            iVar.c = z3;
            arrayList3.add(iVar);
            g0.b bVar2 = new g0.b();
            v0Var4.d();
            hashSet.add(bVar2);
            boolean z5 = !z3 ? v0Var4 != v0Var2 : v0Var4 != v0Var;
            k kVar = new k(v0Var4, bVar2);
            int i7 = v0Var4.f542a;
            u uVar2 = v0Var4.c;
            if (i7 == 2) {
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
            v0Var4.f544d.add(new e(this, arrayList5, v0Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = arrayList4.get(i8);
            i8++;
            v0 v0Var5 = (v0) ((k) obj4).f431a;
            if (w0.c(v0Var5.c.J) != v0Var5.f542a) {
            }
        }
        int size5 = arrayList4.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj5 = arrayList4.get(i9);
            i9++;
            k kVar2 = (k) obj5;
            hashMap.put((v0) kVar2.f431a, Boolean.FALSE);
            kVar2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f458a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z6 = false;
        int i10 = 0;
        while (i10 < size6) {
            Object obj6 = arrayList3.get(i10);
            i10++;
            i iVar2 = (i) obj6;
            boolean z7 = containsValue;
            v0 v0Var6 = (v0) iVar2.f431a;
            ArrayList arrayList7 = arrayList3;
            int c4 = w0.c(v0Var6.c.J);
            int i11 = v0Var6.f542a;
            int i12 = size6;
            if (c4 == i11 || !(c4 == 2 || i11 == 2)) {
                z4 = z6;
                viewGroup = viewGroup2;
                iVar2.d();
            } else {
                a2.s j4 = iVar2.j(context);
                if (j4 == null) {
                    iVar2.d();
                } else {
                    Animator animator = (Animator) j4.h;
                    if (animator == null) {
                        arrayList6.add(iVar2);
                    } else {
                        v0 v0Var7 = (v0) iVar2.f431a;
                        u uVar3 = v0Var7.c;
                        z4 = z6;
                        if (Boolean.TRUE.equals(hashMap.get(v0Var7))) {
                            if (k0.G(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + uVar3 + " as this Fragment was involved in a Transition.");
                            }
                            iVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z8 = v0Var7.f542a == 3;
                            if (z8) {
                                arrayList5.remove(v0Var7);
                            }
                            View view = uVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new f(viewGroup3, view, z8, v0Var7, iVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (k0.G(2)) {
                                Log.v("FragmentManager", "Animator from operation " + v0Var7 + " has started.");
                            }
                            ((g0.b) iVar2.f432b).a(new a2.s(animator, v0Var7, 2));
                            containsValue = z7;
                            size6 = i12;
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
            size6 = i12;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            z6 = z4;
        }
        boolean z9 = containsValue;
        boolean z10 = z6;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i13 = 0;
        while (i13 < size7) {
            Object obj7 = arrayList6.get(i13);
            i13++;
            i iVar3 = (i) obj7;
            v0 v0Var8 = (v0) iVar3.f431a;
            u uVar4 = v0Var8.c;
            if (z9) {
                if (k0.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Transitions.");
                }
                iVar3.d();
            } else if (z10) {
                if (k0.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + uVar4 + " as Animations cannot run alongside Animators.");
                }
                iVar3.d();
            } else {
                View view2 = uVar4.J;
                a2.s j5 = iVar3.j(context);
                j5.getClass();
                Animation animation = (Animation) j5.g;
                animation.getClass();
                int i14 = size7;
                if (v0Var8.f542a != 1) {
                    view2.startAnimation(animation);
                    iVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    x xVar = new x(animation, viewGroup4, view2);
                    xVar.setAnimationListener(new h(v0Var8, viewGroup4, view2, iVar3));
                    view2.startAnimation(xVar);
                    if (k0.G(2)) {
                        Log.v("FragmentManager", "Animation from operation " + v0Var8 + " has started.");
                    }
                }
                g0.b bVar3 = (g0.b) iVar3.f432b;
                androidx.emoji2.text.w wVar = new androidx.emoji2.text.w();
                wVar.f368f = view2;
                wVar.g = viewGroup4;
                wVar.h = iVar3;
                wVar.f369i = v0Var8;
                bVar3.a(wVar);
                size7 = i14;
            }
        }
        int size8 = arrayList5.size();
        int i15 = 0;
        while (i15 < size8) {
            Object obj8 = arrayList5.get(i15);
            i15++;
            v0 v0Var9 = (v0) obj8;
            w0.a(v0Var9.c.J, v0Var9.f542a);
        }
        arrayList5.clear();
        if (k0.G(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + v0Var + " to " + v0Var2);
        }
    }

    public final void c() {
        if (this.f461e) {
            return;
        }
        ViewGroup viewGroup = this.f458a;
        WeakHashMap weakHashMap = k0.j0.f2752a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f460d = false;
            return;
        }
        synchronized (this.f459b) {
            try {
                if (!this.f459b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        v0 v0Var = (v0) obj;
                        if (k0.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + v0Var);
                        }
                        v0Var.a();
                        if (!v0Var.g) {
                            this.c.add(v0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f459b);
                    this.f459b.clear();
                    this.c.addAll(arrayList2);
                    if (k0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        ((v0) obj2).d();
                    }
                    b(arrayList2, this.f460d);
                    this.f460d = false;
                    if (k0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final v0 d(u uVar) {
        ArrayList arrayList = this.f459b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            v0 v0Var = (v0) obj;
            if (v0Var.c.equals(uVar) && !v0Var.f546f) {
                return v0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (k0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f458a;
        WeakHashMap weakHashMap = k0.j0.f2752a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f459b) {
            try {
                g();
                ArrayList arrayList = this.f459b;
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((v0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    v0 v0Var = (v0) obj2;
                    if (k0.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f458a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(v0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    v0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f459b);
                int size3 = arrayList3.size();
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    v0 v0Var2 = (v0) obj3;
                    if (k0.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f458a + " is not attached to window. ";
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
        ArrayList arrayList = this.f459b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            v0 v0Var = (v0) obj;
            if (v0Var.f543b == 2) {
                v0Var.c(w0.b(v0Var.c.D().getVisibility()), 1);
            }
        }
    }
}
