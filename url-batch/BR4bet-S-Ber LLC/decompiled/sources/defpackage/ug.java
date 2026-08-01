package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ug {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public ug(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static ug f(ViewGroup viewGroup, ej ejVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof ug) {
            return (ug) tag;
        }
        ejVar.getClass();
        ug ugVar = new ug(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, ugVar);
        return ugVar;
    }

    public final void a(int i, int i2, ln lnVar) {
        synchronized (this.b) {
            try {
                u9 u9Var = new u9();
                m60 d = d(lnVar.c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                m60 m60Var = new m60(i, i2, lnVar, u9Var);
                this.b.add(m60Var);
                m60Var.d.add(new l60(this, m60Var, 0));
                m60Var.d.add(new l60(this, m60Var, 1));
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
        m60 m60Var = null;
        m60 m60Var2 = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            m60 m60Var3 = (m60) obj;
            int c = f60.c(m60Var3.c.J);
            int j = f60.j(m60Var3.a);
            if (j != 0) {
                if (j != 1) {
                    if (j != 2 && j != 3) {
                    }
                } else if (c != 2) {
                    m60Var2 = m60Var3;
                }
            }
            if (c == 2 && m60Var == null) {
                m60Var = m60Var3;
            }
        }
        if (en.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + m60Var + " to " + m60Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        pm pmVar = ((m60) arrayList2.get(arrayList2.size() - 1)).c;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            om omVar = ((m60) obj2).c.M;
            om omVar2 = pmVar.M;
            omVar.b = omVar2.b;
            omVar.c = omVar2.c;
            omVar.d = omVar2.d;
            omVar.e = omVar2.e;
        }
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            m60 m60Var4 = (m60) obj3;
            u9 u9Var = new u9();
            m60Var4.d();
            HashSet hashSet = m60Var4.e;
            hashSet.add(u9Var);
            sg sgVar = new sg(m60Var4, u9Var);
            sgVar.d = false;
            sgVar.c = z;
            arrayList3.add(sgVar);
            u9 u9Var2 = new u9();
            m60Var4.d();
            hashSet.add(u9Var2);
            boolean z3 = !z ? m60Var4 != m60Var2 : m60Var4 != m60Var;
            tg tgVar = new tg(m60Var4, u9Var2);
            int i5 = m60Var4.a;
            pm pmVar2 = m60Var4.c;
            if (i5 == 2) {
                if (z) {
                    om omVar3 = pmVar2.M;
                } else {
                    pmVar2.getClass();
                }
                if (z) {
                    om omVar4 = pmVar2.M;
                } else {
                    om omVar5 = pmVar2.M;
                }
            } else if (z) {
                om omVar6 = pmVar2.M;
            } else {
                pmVar2.getClass();
            }
            if (z3) {
                if (z) {
                    om omVar7 = pmVar2.M;
                } else {
                    pmVar2.getClass();
                }
            }
            arrayList4.add(tgVar);
            m60Var4.d.add(new g1(this, arrayList5, m60Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj4 = arrayList4.get(i6);
            i6++;
            m60 m60Var5 = (m60) ((tg) obj4).a;
            if (f60.c(m60Var5.c.J) != m60Var5.a) {
            }
        }
        int size5 = arrayList4.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj5 = arrayList4.get(i7);
            i7++;
            tg tgVar2 = (tg) obj5;
            hashMap.put((m60) tgVar2.a, Boolean.FALSE);
            tgVar2.d();
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
            sg sgVar2 = (sg) obj6;
            boolean z5 = containsValue;
            m60 m60Var6 = (m60) sgVar2.a;
            ArrayList arrayList7 = arrayList3;
            int c2 = f60.c(m60Var6.c.J);
            int i10 = m60Var6.a;
            int i11 = size6;
            if (c2 == i10 || !(c2 == 2 || i10 == 2)) {
                z2 = z4;
                i = i9;
                viewGroup = viewGroup2;
                sgVar2.d();
            } else {
                a5 j2 = sgVar2.j(context);
                if (j2 == null) {
                    sgVar2.d();
                } else {
                    Animator animator = (Animator) j2.h;
                    if (animator == null) {
                        arrayList6.add(sgVar2);
                    } else {
                        m60 m60Var7 = (m60) sgVar2.a;
                        pm pmVar3 = m60Var7.c;
                        z2 = z4;
                        i = i9;
                        if (Boolean.TRUE.equals(hashMap.get(m60Var7))) {
                            if (en.G(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + pmVar3 + " as this Fragment was involved in a Transition.");
                            }
                            sgVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = m60Var7.a == 3;
                            if (z6) {
                                arrayList5.remove(m60Var7);
                            }
                            View view = pmVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new pg(viewGroup3, view, z6, m60Var7, sgVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (en.G(2)) {
                                Log.v("FragmentManager", "Animator from operation " + m60Var7 + " has started.");
                            }
                            ((u9) sgVar2.b).a(new a5(animator, m60Var7, 12));
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
            sg sgVar3 = (sg) obj7;
            m60 m60Var8 = (m60) sgVar3.a;
            pm pmVar4 = m60Var8.c;
            if (z7) {
                if (en.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + pmVar4 + " as Animations cannot run alongside Transitions.");
                }
                sgVar3.d();
            } else if (z8) {
                if (en.G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + pmVar4 + " as Animations cannot run alongside Animators.");
                }
                sgVar3.d();
            } else {
                View view2 = pmVar4.J;
                a5 j3 = sgVar3.j(context);
                j3.getClass();
                Animation animation = (Animation) j3.g;
                animation.getClass();
                int i13 = size7;
                if (m60Var8.a != 1) {
                    view2.startAnimation(animation);
                    sgVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    sm smVar = new sm(animation, viewGroup4, view2);
                    smVar.setAnimationListener(new qg(m60Var8, viewGroup4, view2, sgVar3));
                    view2.startAnimation(smVar);
                    if (en.G(2)) {
                        Log.v("FragmentManager", "Animation from operation " + m60Var8 + " has started.");
                    }
                }
                u9 u9Var3 = (u9) sgVar3.b;
                rg rgVar = new rg();
                rgVar.f = view2;
                rgVar.g = viewGroup4;
                rgVar.h = sgVar3;
                rgVar.i = m60Var8;
                u9Var3.a(rgVar);
                size7 = i13;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            m60 m60Var9 = (m60) obj8;
            f60.a(m60Var9.c.J, m60Var9.a);
        }
        arrayList5.clear();
        if (en.G(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + m60Var + " to " + m60Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = ic0.a;
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
                        m60 m60Var = (m60) obj;
                        if (en.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + m60Var);
                        }
                        m60Var.a();
                        if (!m60Var.g) {
                            this.c.add(m60Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (en.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((m60) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (en.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m60 d(pm pmVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m60 m60Var = (m60) obj;
            pm pmVar2 = m60Var.c;
            pmVar2.getClass();
            if (pmVar2 == pmVar && !m60Var.f) {
                return m60Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (en.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = ic0.a;
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
                    ((m60) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    m60 m60Var = (m60) obj2;
                    if (en.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(m60Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    m60Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    m60 m60Var2 = (m60) obj3;
                    if (en.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(m60Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    m60Var2.a();
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
            m60 m60Var = (m60) obj;
            if (m60Var.b == 2) {
                m60Var.c(f60.b(m60Var.c.F().getVisibility()), 1);
            }
        }
    }
}
