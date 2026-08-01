package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zi {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public zi(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static zi f(ViewGroup viewGroup, sl slVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof zi) {
            return (zi) tag;
        }
        slVar.getClass();
        zi ziVar = new zi(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, ziVar);
        return ziVar;
    }

    public final void a(se0 se0Var, re0 re0Var, e eVar) {
        synchronized (this.b) {
            try {
                ma maVar = new ma();
                qe0 d = d(eVar.c);
                if (d != null) {
                    d.c(se0Var, re0Var);
                    return;
                }
                qe0 qe0Var = new qe0(se0Var, re0Var, eVar, maVar);
                this.b.add(qe0Var);
                qe0Var.d.add(new oe0(this, qe0Var, 0));
                qe0Var.d.add(new oe0(this, qe0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        int i;
        boolean z2;
        int i2;
        ViewGroup viewGroup;
        se0 se0Var;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        qe0 qe0Var = null;
        qe0 qe0Var2 = null;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList2.get(i3);
            i3++;
            qe0 qe0Var3 = (qe0) obj;
            se0 from = se0.from(qe0Var3.c.J);
            int i4 = ti.a[qe0Var3.a.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                if (from == se0.VISIBLE && qe0Var == null) {
                    qe0Var = qe0Var3;
                }
            } else if (i4 == 4 && from != se0.VISIBLE) {
                qe0Var2 = qe0Var3;
            }
        }
        if (c.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + qe0Var + " to " + qe0Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        a aVar = ((qe0) arrayList2.get(arrayList2.size() - 1)).c;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            int i6 = i;
            vp vpVar = ((qe0) obj2).c.M;
            vp vpVar2 = aVar.M;
            vpVar.b = vpVar2.b;
            vpVar.c = vpVar2.c;
            vpVar.d = vpVar2.d;
            vpVar.e = vpVar2.e;
            i = i6;
        }
        int i7 = i;
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            qe0 qe0Var4 = (qe0) obj3;
            ma maVar = new ma();
            qe0Var4.d();
            HashSet hashSet = qe0Var4.e;
            hashSet.add(maVar);
            xi xiVar = new xi(qe0Var4, maVar);
            xiVar.d = false;
            xiVar.c = z;
            arrayList3.add(xiVar);
            ma maVar2 = new ma();
            qe0Var4.d();
            hashSet.add(maVar2);
            boolean z3 = !z ? qe0Var4 != qe0Var2 : qe0Var4 != qe0Var;
            yi yiVar = new yi(qe0Var4, maVar2);
            se0 se0Var2 = qe0Var4.a;
            a aVar2 = qe0Var4.c;
            if (se0Var2 == se0.VISIBLE) {
                if (z) {
                    vp vpVar3 = aVar2.M;
                } else {
                    aVar2.getClass();
                }
                if (z) {
                    vp vpVar4 = aVar2.M;
                } else {
                    vp vpVar5 = aVar2.M;
                }
            } else if (z) {
                vp vpVar6 = aVar2.M;
            } else {
                aVar2.getClass();
            }
            if (z3) {
                if (z) {
                    vp vpVar7 = aVar2.M;
                } else {
                    aVar2.getClass();
                }
            }
            arrayList4.add(yiVar);
            qe0Var4.d.add(new j1(this, arrayList5, qe0Var4));
            arrayList2 = arrayList;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i9 = 0;
        while (i9 < size4) {
            Object obj4 = arrayList4.get(i9);
            i9++;
            qe0 qe0Var5 = (qe0) ((yi) obj4).a;
            if (se0.from(qe0Var5.c.J) != qe0Var5.a) {
                se0 se0Var3 = se0.VISIBLE;
            }
        }
        int size5 = arrayList4.size();
        int i10 = 0;
        while (i10 < size5) {
            Object obj5 = arrayList4.get(i10);
            i10++;
            yi yiVar2 = (yi) obj5;
            hashMap.put((qe0) yiVar2.a, Boolean.FALSE);
            yiVar2.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z4 = false;
        int i11 = 0;
        while (i11 < size6) {
            Object obj6 = arrayList3.get(i11);
            int i12 = i11 + 1;
            xi xiVar2 = (xi) obj6;
            boolean z5 = containsValue;
            qe0 qe0Var6 = (qe0) xiVar2.a;
            ArrayList arrayList7 = arrayList3;
            se0 from2 = se0.from(qe0Var6.c.J);
            se0 se0Var4 = qe0Var6.a;
            int i13 = size6;
            if (from2 == se0Var4 || !(from2 == (se0Var = se0.VISIBLE) || se0Var4 == se0Var)) {
                z2 = z4;
                i2 = i12;
                viewGroup = viewGroup2;
                xiVar2.d();
            } else {
                i5 j = xiVar2.j(context);
                if (j == null) {
                    xiVar2.d();
                } else {
                    Animator animator = (Animator) j.h;
                    if (animator == null) {
                        arrayList6.add(xiVar2);
                    } else {
                        qe0 qe0Var7 = (qe0) xiVar2.a;
                        a aVar3 = qe0Var7.c;
                        z2 = z4;
                        i2 = i12;
                        if (Boolean.TRUE.equals(hashMap.get(qe0Var7))) {
                            if (c.G(i7)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + aVar3 + " as this Fragment was involved in a Transition.");
                            }
                            xiVar2.d();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = qe0Var7.a == se0.GONE;
                            if (z6) {
                                arrayList5.remove(qe0Var7);
                            }
                            View view = aVar3.J;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new ui(viewGroup3, view, z6, qe0Var7, xiVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (c.G(i7)) {
                                Log.v("FragmentManager", "Animator from operation " + qe0Var7 + " has started.");
                            }
                            ((ma) xiVar2.b).a(new i5(animator, qe0Var7, 12));
                            size6 = i13;
                            containsValue = z5;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            i11 = i2;
                            z4 = true;
                        }
                    }
                }
                z2 = z4;
                i2 = i12;
                viewGroup = viewGroup2;
            }
            size6 = i13;
            containsValue = z5;
            viewGroup2 = viewGroup;
            arrayList3 = arrayList7;
            i11 = i2;
            z4 = z2;
        }
        boolean z7 = containsValue;
        boolean z8 = z4;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i14 = 0;
        while (i14 < size7) {
            Object obj7 = arrayList6.get(i14);
            i14++;
            xi xiVar3 = (xi) obj7;
            qe0 qe0Var8 = (qe0) xiVar3.a;
            a aVar4 = qe0Var8.c;
            if (z7) {
                if (c.G(i7)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + aVar4 + " as Animations cannot run alongside Transitions.");
                }
                xiVar3.d();
            } else if (z8) {
                if (c.G(i7)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + aVar4 + " as Animations cannot run alongside Animators.");
                }
                xiVar3.d();
            } else {
                View view2 = aVar4.J;
                i5 j2 = xiVar3.j(context);
                j2.getClass();
                Animation animation = (Animation) j2.g;
                animation.getClass();
                int i15 = size7;
                if (qe0Var8.a != se0.REMOVED) {
                    view2.startAnimation(animation);
                    xiVar3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    yp ypVar = new yp(animation, viewGroup4, view2);
                    ypVar.setAnimationListener(new vi(qe0Var8, viewGroup4, view2, xiVar3));
                    view2.startAnimation(ypVar);
                    if (c.G(i7)) {
                        Log.v("FragmentManager", "Animation from operation " + qe0Var8 + " has started.");
                    }
                }
                ma maVar3 = (ma) xiVar3.b;
                wi wiVar = new wi();
                wiVar.f = view2;
                wiVar.g = viewGroup4;
                wiVar.h = xiVar3;
                wiVar.i = qe0Var8;
                maVar3.a(wiVar);
                size7 = i15;
            }
        }
        int size8 = arrayList5.size();
        int i16 = 0;
        while (i16 < size8) {
            Object obj8 = arrayList5.get(i16);
            i16++;
            qe0 qe0Var9 = (qe0) obj8;
            qe0Var9.a.applyState(qe0Var9.c.J);
        }
        arrayList5.clear();
        if (c.G(i7)) {
            Log.v("FragmentManager", "Completed executing operations from " + qe0Var + " to " + qe0Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = hm0.a;
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
                        qe0 qe0Var = (qe0) obj;
                        if (c.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + qe0Var);
                        }
                        qe0Var.a();
                        if (!qe0Var.g) {
                            this.c.add(qe0Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (c.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((qe0) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    if (c.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qe0 d(a aVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qe0 qe0Var = (qe0) obj;
            a aVar2 = qe0Var.c;
            aVar2.getClass();
            if (aVar2 == aVar && !qe0Var.f) {
                return qe0Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (c.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = hm0.a;
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
                    ((qe0) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    qe0 qe0Var = (qe0) obj2;
                    if (c.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(qe0Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    qe0Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    qe0 qe0Var2 = (qe0) obj3;
                    if (c.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(qe0Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    qe0Var2.a();
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
            qe0 qe0Var = (qe0) obj;
            if (qe0Var.b == re0.ADDING) {
                qe0Var.c(se0.from(qe0Var.c.F().getVisibility()), re0.NONE);
            }
        }
    }
}
