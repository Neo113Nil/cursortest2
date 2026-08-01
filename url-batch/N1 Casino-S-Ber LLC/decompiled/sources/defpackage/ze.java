package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.a;
import com.derinko.gbini.n1casino.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ze {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public ze(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static ze f(ViewGroup viewGroup, dh dhVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof ze) {
            return (ze) tag;
        }
        dhVar.getClass();
        ze zeVar = new ze(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, zeVar);
        return zeVar;
    }

    public final void a(int i, int i2, a aVar) {
        synchronized (this.b) {
            try {
                h9 h9Var = new h9();
                k30 d = d(aVar.c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                k30 k30Var = new k30(i, i2, aVar, h9Var);
                this.b.add(k30Var);
                k30Var.d.add(new j30(this, k30Var, 0));
                k30Var.d.add(new j30(this, k30Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        boolean z2;
        int i;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        k30 k30Var = null;
        k30 k30Var2 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            k30 k30Var3 = (k30) obj;
            int c = d30.c(k30Var3.c.J);
            int h = d30.h(k30Var3.a);
            if (h != 0) {
                if (h != 1) {
                    if (h != 2 && h != 3) {
                    }
                } else if (c != 2) {
                    k30Var2 = k30Var3;
                }
            }
            if (c == 2 && k30Var == null) {
                k30Var = k30Var3;
            }
        }
        if (bl.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + k30Var + " to " + k30Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        mk mkVar = ((k30) arrayList2.get(arrayList2.size() - 1)).c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            kk kkVar = ((k30) obj2).c.M;
            kk kkVar2 = mkVar.M;
            kkVar.b = kkVar2.b;
            kkVar.c = kkVar2.c;
            kkVar.d = kkVar2.d;
            kkVar.e = kkVar2.e;
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            k30 k30Var4 = (k30) obj3;
            h9 h9Var = new h9();
            k30Var4.d();
            HashSet hashSet = k30Var4.e;
            hashSet.add(h9Var);
            xe xeVar = new xe(k30Var4, h9Var);
            xeVar.d = false;
            xeVar.c = z;
            arrayList3.add(xeVar);
            h9 h9Var2 = new h9();
            k30Var4.d();
            hashSet.add(h9Var2);
            boolean z3 = !z ? k30Var4 != k30Var2 : k30Var4 != k30Var;
            ye yeVar = new ye(k30Var4, h9Var2);
            int i5 = k30Var4.a;
            mk mkVar2 = k30Var4.c;
            if (i5 == 2) {
                if (z) {
                    kk kkVar3 = mkVar2.M;
                } else {
                    mkVar2.getClass();
                }
                if (z) {
                    kk kkVar4 = mkVar2.M;
                } else {
                    kk kkVar5 = mkVar2.M;
                }
            } else if (z) {
                kk kkVar6 = mkVar2.M;
            } else {
                mkVar2.getClass();
            }
            if (z3) {
                if (z) {
                    kk kkVar7 = mkVar2.M;
                } else {
                    mkVar2.getClass();
                }
            }
            arrayList4.add(yeVar);
            k30Var4.d.add(new f1(this, arrayList5, k30Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList4.get(i6);
            i6++;
            k30 k30Var5 = (k30) ((ye) obj4).a;
            if (d30.c(k30Var5.c.J) != k30Var5.a) {
            }
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            ye yeVar2 = (ye) obj5;
            hashMap.put((k30) yeVar2.a, Boolean.FALSE);
            yeVar2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z4 = false;
        int i8 = 0;
        while (i8 < size6) {
            Object obj6 = arrayList3.get(i8);
            int i9 = i8 + 1;
            xe xeVar2 = (xe) obj6;
            boolean z5 = containsValue;
            k30 k30Var6 = (k30) xeVar2.a;
            ArrayList arrayList7 = arrayList3;
            int c2 = d30.c(k30Var6.c.J);
            int i10 = k30Var6.a;
            int i11 = size6;
            if (c2 == i10 || !(c2 == 2 || i10 == 2)) {
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
                xeVar2.d();
            } else {
                q4 j = xeVar2.j(context);
                if (j == null) {
                    xeVar2.d();
                } else {
                    Animator animator = (Animator) j.h;
                    if (animator == null) {
                        arrayList6.add(xeVar2);
                    } else {
                        k30 k30Var7 = (k30) xeVar2.a;
                        mk mkVar3 = k30Var7.c;
                        z2 = z4;
                        i = i9;
                        if (Boolean.TRUE.equals(hashMap.get(k30Var7))) {
                            if (bl.G(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + mkVar3 + " as this Fragment was involved in a Transition.");
                            }
                            xeVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = k30Var7.a == 3;
                            if (z6) {
                                arrayList5.remove(k30Var7);
                            }
                            View view = mkVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new ue(viewGroup3, view, z6, k30Var7, xeVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (bl.G(2)) {
                                Log.v("FragmentManager", "Animator from operation " + k30Var7 + " has started.");
                            }
                            ((h9) xeVar2.b).a(new q4(animator, k30Var7, 13));
                            size6 = i11;
                            containsValue = z5;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            i8 = i;
                            z4 = true;
                        }
                    }
                }
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
            }
            size6 = i11;
            containsValue = z5;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            i8 = i;
            z4 = z2;
        }
        boolean z7 = containsValue;
        boolean z8 = z4;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i12 = 0;
        while (i12 < size7) {
            Object obj7 = arrayList6.get(i12);
            i12++;
            xe xeVar3 = (xe) obj7;
            k30 k30Var8 = (k30) xeVar3.a;
            mk mkVar4 = k30Var8.c;
            if (z7) {
                if (bl.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + mkVar4 + " as Animations cannot run alongside Transitions.");
                }
                xeVar3.d();
            } else if (z8) {
                if (bl.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + mkVar4 + " as Animations cannot run alongside Animators.");
                }
                xeVar3.d();
            } else {
                View view2 = mkVar4.J;
                q4 j2 = xeVar3.j(context);
                j2.getClass();
                Animation animation = (Animation) j2.g;
                animation.getClass();
                int i13 = size7;
                if (k30Var8.a != 1) {
                    view2.startAnimation(animation);
                    xeVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    pk pkVar = new pk(animation, viewGroup4, view2);
                    pkVar.setAnimationListener(new ve(k30Var8, viewGroup4, view2, xeVar3));
                    view2.startAnimation(pkVar);
                    if (bl.G(2)) {
                        Log.v("FragmentManager", "Animation from operation " + k30Var8 + " has started.");
                    }
                }
                h9 h9Var3 = (h9) xeVar3.b;
                we weVar = new we();
                weVar.f = view2;
                weVar.g = viewGroup4;
                weVar.h = xeVar3;
                weVar.i = k30Var8;
                h9Var3.a(weVar);
                size7 = i13;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            k30 k30Var9 = (k30) obj8;
            d30.a(k30Var9.c.J, k30Var9.a);
        }
        arrayList5.clear();
        if (bl.G(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + k30Var + " to " + k30Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = x80.a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        k30 k30Var = (k30) obj;
                        if (bl.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + k30Var);
                        }
                        k30Var.a();
                        if (!k30Var.g) {
                            this.c.add(k30Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (bl.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((k30) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (bl.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k30 d(mk mkVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k30 k30Var = (k30) obj;
            mk mkVar2 = k30Var.c;
            mkVar2.getClass();
            if (mkVar2 == mkVar && !k30Var.f) {
                return k30Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (bl.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = x80.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((k30) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    k30 k30Var = (k30) obj2;
                    if (bl.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(k30Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    k30Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    k30 k30Var2 = (k30) obj3;
                    if (bl.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(k30Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    k30Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k30 k30Var = (k30) obj;
            if (k30Var.b == 2) {
                k30Var.c(d30.b(k30Var.c.F().getVisibility()), 1);
            }
        }
    }
}
