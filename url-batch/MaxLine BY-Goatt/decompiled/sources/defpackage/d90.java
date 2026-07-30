package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d90 {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public d90(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static void a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = i53.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                a(childAt, arrayList);
            }
        }
    }

    public static void e(hi hiVar, View view) {
        WeakHashMap weakHashMap = e53.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            hiVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    e(hiVar, childAt);
                }
            }
        }
    }

    public static d90 h(ViewGroup viewGroup, u30 u30Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof d90) {
            return (d90) tag;
        }
        u30Var.getClass();
        d90 d90Var = new d90(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, d90Var);
        return d90Var;
    }

    public static d90 i(ViewGroup viewGroup, as0 as0Var) {
        return h(viewGroup, as0Var.E());
    }

    public static void k(hi hiVar, Collection collection) {
        Iterator it = ((ci) hiVar.entrySet()).iterator();
        while (true) {
            fi fiVar = (fi) it;
            if (!fiVar.hasNext()) {
                return;
            }
            fiVar.next();
            View view = (View) fiVar.getValue();
            WeakHashMap weakHashMap = e53.a;
            if (!collection.contains(view.getTransitionName())) {
                fiVar.remove();
            }
        }
    }

    public final void b(int i, int i2, is0 is0Var) {
        synchronized (this.b) {
            try {
                is isVar = new is();
                bo2 f = f(is0Var.c);
                if (f != null) {
                    f.c(i, i2);
                    return;
                }
                bo2 bo2Var = new bo2(i, i2, is0Var, isVar);
                this.b.add(bo2Var);
                bo2Var.d.add(new ao2(this, bo2Var, 0));
                bo2Var.d.add(new ao2(this, bo2Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x099c A[LOOP:7: B:156:0x099a->B:157:0x099c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0800  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9, types: [fl2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        HashMap hashMap;
        TransitionSet transitionSet;
        String str;
        bo2 bo2Var;
        int i;
        ?? r9;
        ArrayList arrayList3;
        int i2;
        String str2;
        int i3;
        bo2 bo2Var2;
        TransitionSet transitionSet2;
        View view;
        View view2;
        Rect rect;
        vs0 vs0Var;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i4;
        HashMap hashMap2;
        View view3;
        boolean z2;
        View view4;
        TransitionSet transitionSet3;
        int i5;
        vs0 vs0Var2;
        boolean z3;
        vs0 vs0Var3;
        int i6;
        int i7;
        View view5;
        int size;
        int i8;
        int size2;
        int i9;
        int size3;
        int i10;
        boolean z4;
        int i11;
        int i12;
        boolean z5 = z;
        int size4 = arrayList.size();
        bo2 bo2Var3 = null;
        bo2 bo2Var4 = null;
        int i13 = 0;
        while (i13 < size4) {
            Object obj = arrayList.get(i13);
            i13++;
            bo2 bo2Var5 = (bo2) obj;
            int c = in1.c(bo2Var5.c.mView);
            int u = q40.u(bo2Var5.a);
            if (u != 0) {
                if (u != 1) {
                    if (u != 2 && u != 3) {
                    }
                } else if (c != 2) {
                    bo2Var4 = bo2Var5;
                }
            }
            if (c == 2 && bo2Var3 == null) {
                bo2Var3 = bo2Var5;
            }
        }
        String str3 = " to ";
        String str4 = "FragmentManager";
        if (as0.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + bo2Var3 + " to " + bo2Var4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(arrayList);
        fr0 fr0Var = ((bo2) arrayList.get(arrayList.size() - 1)).c;
        int size5 = arrayList.size();
        int i14 = 2;
        int i15 = 0;
        while (i15 < size5) {
            Object obj2 = arrayList.get(i15);
            i15++;
            cr0 cr0Var = ((bo2) obj2).c.mAnimationInfo;
            cr0 cr0Var2 = fr0Var.mAnimationInfo;
            cr0Var.b = cr0Var2.b;
            cr0Var.c = cr0Var2.c;
            cr0Var.d = cr0Var2.d;
            cr0Var.e = cr0Var2.e;
        }
        int size6 = arrayList.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj3 = arrayList.get(i16);
            i16++;
            bo2 bo2Var6 = (bo2) obj3;
            is isVar = new is();
            bo2Var6.d();
            HashSet hashSet = bo2Var6.e;
            hashSet.add(isVar);
            a90 a90Var = new a90(bo2Var6, isVar);
            a90Var.d = false;
            a90Var.c = z5;
            arrayList6.add(a90Var);
            is isVar2 = new is();
            bo2Var6.d();
            hashSet.add(isVar2);
            arrayList7.add(new c90(bo2Var6, isVar2, z5, !z5 ? bo2Var6 != bo2Var4 : bo2Var6 != bo2Var3));
            bo2Var6.d.add(new iu0(this, arrayList8, bo2Var6, 1));
        }
        HashMap hashMap3 = new HashMap();
        int size7 = arrayList7.size();
        vs0 vs0Var4 = null;
        int i17 = 0;
        while (i17 < size7) {
            Object obj4 = arrayList7.get(i17);
            i17++;
            c90 c90Var = (c90) obj4;
            boolean k = c90Var.k();
            fr0 fr0Var2 = ((bo2) c90Var.a).c;
            int i18 = size7;
            Object obj5 = c90Var.c;
            if (k) {
                size7 = i18;
            } else {
                vs0 o = c90Var.o(obj5);
                Object obj6 = c90Var.e;
                vs0 o2 = c90Var.o(obj6);
                String str5 = str3;
                ArrayList arrayList9 = arrayList6;
                if (o != null && o2 != null && o != o2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + fr0Var2 + " returned Transition " + obj5 + " which uses a different Transition  type than its shared element transition " + obj6);
                }
                if (o == null) {
                    o = o2;
                }
                if (vs0Var4 == null) {
                    vs0Var4 = o;
                } else if (o != null && vs0Var4 != o) {
                    dm0.k("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", fr0Var2, " returned Transition ", obj5, " which uses a different Transition  type than other Fragments.");
                    return;
                }
                size7 = i18;
                i17 = i17;
                str3 = str5;
                arrayList6 = arrayList9;
            }
        }
        ArrayList arrayList10 = arrayList6;
        String str6 = str3;
        ViewGroup viewGroup = this.a;
        if (vs0Var4 == null) {
            int size8 = arrayList7.size();
            int i19 = 0;
            while (i19 < size8) {
                Object obj7 = arrayList7.get(i19);
                i19++;
                c90 c90Var2 = (c90) obj7;
                hashMap3.put((bo2) c90Var2.a, Boolean.FALSE);
                c90Var2.d();
            }
            hashMap = hashMap3;
            bo2Var = bo2Var4;
            str = "FragmentManager";
            arrayList2 = arrayList8;
        } else {
            View view6 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            hi hiVar = new hi(0);
            int size9 = arrayList7.size();
            arrayList2 = arrayList8;
            boolean z6 = false;
            View view7 = null;
            TransitionSet transitionSet4 = null;
            int i20 = 0;
            while (i20 < size9) {
                Object obj8 = arrayList7.get(i20);
                int i21 = i20 + 1;
                int i22 = size9;
                Object obj9 = ((c90) obj8).e;
                if (obj9 != null && bo2Var3 != null) {
                    fr0 fr0Var3 = bo2Var3.c;
                    if (bo2Var4 != null) {
                        fr0 fr0Var4 = bo2Var4.c;
                        i4 = i21;
                        Transition clone = ((Transition) obj9).clone();
                        if (clone == null) {
                            arrayList5 = arrayList7;
                            transitionSet3 = null;
                        } else {
                            arrayList5 = arrayList7;
                            transitionSet3 = new TransitionSet();
                            transitionSet3.addTransition(clone);
                        }
                        ArrayList<String> sharedElementSourceNames = fr0Var4.getSharedElementSourceNames();
                        HashMap hashMap4 = hashMap3;
                        ArrayList<String> sharedElementSourceNames2 = fr0Var3.getSharedElementSourceNames();
                        View view8 = view6;
                        ArrayList<String> sharedElementTargetNames = fr0Var3.getSharedElementTargetNames();
                        Rect rect3 = rect2;
                        vs0Var = vs0Var4;
                        int i23 = 0;
                        while (i23 < sharedElementTargetNames.size()) {
                            int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i23));
                            ArrayList<String> arrayList13 = sharedElementTargetNames;
                            if (indexOf != -1) {
                                sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i23));
                            }
                            i23++;
                            sharedElementTargetNames = arrayList13;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fr0Var4.getSharedElementTargetNames();
                        if (z5) {
                            fr0Var3.getEnterTransitionCallback();
                            fr0Var4.getExitTransitionCallback();
                        } else {
                            fr0Var3.getExitTransitionCallback();
                            fr0Var4.getEnterTransitionCallback();
                        }
                        int i24 = 0;
                        for (int size10 = sharedElementSourceNames.size(); i24 < size10; size10 = size10) {
                            hiVar.put(sharedElementSourceNames.get(i24), sharedElementTargetNames2.get(i24));
                            i24++;
                        }
                        if (as0.G(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            int i25 = 0;
                            for (int size11 = sharedElementTargetNames2.size(); i25 < size11; size11 = size11) {
                                String str7 = sharedElementTargetNames2.get(i25);
                                Log.v("FragmentManager", "Name: " + str7);
                                i25++;
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            int i26 = 0;
                            for (int size12 = sharedElementSourceNames.size(); i26 < size12; size12 = size12) {
                                String str8 = sharedElementSourceNames.get(i26);
                                Log.v("FragmentManager", "Name: " + str8);
                                i26++;
                            }
                        }
                        hi hiVar2 = new hi(0);
                        e(hiVar2, fr0Var3.mView);
                        hiVar2.k(sharedElementSourceNames);
                        hiVar.k(hiVar2.keySet());
                        hi hiVar3 = new hi(0);
                        e(hiVar3, fr0Var4.mView);
                        hiVar3.k(sharedElementTargetNames2);
                        hiVar3.k(hiVar.values());
                        vs0 vs0Var5 = qs0.a;
                        int i27 = hiVar.o - 1;
                        while (i27 >= 0) {
                            fr0 fr0Var5 = fr0Var3;
                            if (!hiVar3.containsKey((String) hiVar.h(i27))) {
                                hiVar.f(i27);
                            }
                            i27--;
                            fr0Var3 = fr0Var5;
                        }
                        fr0 fr0Var6 = fr0Var3;
                        k(hiVar2, hiVar.keySet());
                        k(hiVar3, hiVar.values());
                        if (hiVar.isEmpty()) {
                            arrayList11.clear();
                            arrayList12.clear();
                            z2 = z6;
                            view4 = view7;
                            arrayList4 = arrayList12;
                            view3 = view8;
                            rect = rect3;
                            hashMap2 = hashMap4;
                            transitionSet4 = null;
                        } else {
                            if (z5) {
                                fr0Var6.getEnterTransitionCallback();
                            } else {
                                fr0Var4.getEnterTransitionCallback();
                            }
                            gv1.a(viewGroup, new z80(bo2Var4, bo2Var3, z5, hiVar3));
                            arrayList11.addAll(hiVar2.values());
                            if (sharedElementSourceNames.isEmpty()) {
                                i5 = 0;
                                view4 = view7;
                            } else {
                                i5 = 0;
                                view4 = (View) hiVar2.get(sharedElementSourceNames.get(0));
                                if (view4 != null) {
                                    Rect rect4 = new Rect();
                                    vs0.b(view4, rect4);
                                    transitionSet3.setEpicenterCallback(new rs0(0, rect4));
                                }
                            }
                            arrayList12.addAll(hiVar3.values());
                            if (sharedElementTargetNames2.isEmpty() || (view5 = (View) hiVar3.get(sharedElementTargetNames2.get(i5))) == null) {
                                vs0Var2 = vs0Var;
                                rect = rect3;
                                z3 = z6;
                            } else {
                                vs0Var2 = vs0Var;
                                rect = rect3;
                                gv1.a(viewGroup, new iu0(vs0Var2, view5, rect, 7));
                                z3 = true;
                            }
                            List<View> targets = transitionSet3.getTargets();
                            targets.clear();
                            int size13 = arrayList11.size();
                            int i28 = 0;
                            while (i28 < size13) {
                                boolean z7 = z3;
                                View view9 = (View) arrayList11.get(i28);
                                int size14 = targets.size();
                                int i29 = size13;
                                int i30 = 0;
                                while (true) {
                                    if (i30 < size14) {
                                        vs0Var3 = vs0Var2;
                                        if (targets.get(i30) == view9) {
                                            break;
                                        }
                                        i30++;
                                        vs0Var2 = vs0Var3;
                                    } else {
                                        vs0Var3 = vs0Var2;
                                        WeakHashMap weakHashMap = e53.a;
                                        if (view9.getTransitionName() != null) {
                                            targets.add(view9);
                                        }
                                        int i31 = size14;
                                        while (i31 < targets.size()) {
                                            View view10 = targets.get(i31);
                                            if (view10 instanceof ViewGroup) {
                                                ViewGroup viewGroup2 = (ViewGroup) view10;
                                                int childCount = viewGroup2.getChildCount();
                                                i6 = i31;
                                                int i32 = 0;
                                                while (i32 < childCount) {
                                                    int i33 = childCount;
                                                    View childAt = viewGroup2.getChildAt(i32);
                                                    int i34 = i32;
                                                    int i35 = 0;
                                                    while (true) {
                                                        if (i35 < size14) {
                                                            i7 = size14;
                                                            if (targets.get(i35) == childAt) {
                                                                break;
                                                            }
                                                            i35++;
                                                            size14 = i7;
                                                        } else {
                                                            i7 = size14;
                                                            if (childAt.getTransitionName() != null) {
                                                                targets.add(childAt);
                                                            }
                                                        }
                                                    }
                                                    i32 = i34 + 1;
                                                    childCount = i33;
                                                    size14 = i7;
                                                }
                                            } else {
                                                i6 = i31;
                                            }
                                            i31 = i6 + 1;
                                            size14 = size14;
                                        }
                                    }
                                }
                                i28++;
                                z3 = z7;
                                size13 = i29;
                                vs0Var2 = vs0Var3;
                            }
                            boolean z8 = z3;
                            vs0Var = vs0Var2;
                            view3 = view8;
                            targets.add(view3);
                            arrayList11.add(view3);
                            vs0.a(transitionSet3, arrayList11);
                            ArrayList arrayList14 = arrayList12;
                            arrayList4 = arrayList14;
                            transitionSet3.addListener((Transition.TransitionListener) new ts0(vs0Var, null, null, transitionSet3, arrayList14));
                            Boolean bool = Boolean.TRUE;
                            hashMap2 = hashMap4;
                            hashMap2.put(bo2Var3, bool);
                            hashMap2.put(bo2Var4, bool);
                            z2 = z8;
                            transitionSet4 = transitionSet3;
                        }
                        arrayList12 = arrayList4;
                        z6 = z2;
                        view7 = view4;
                        vs0Var4 = vs0Var;
                        i20 = i4;
                        arrayList7 = arrayList5;
                        z5 = z;
                        view6 = view3;
                        hashMap3 = hashMap2;
                        rect2 = rect;
                        size9 = i22;
                    }
                }
                rect = rect2;
                vs0Var = vs0Var4;
                arrayList4 = arrayList12;
                arrayList5 = arrayList7;
                i4 = i21;
                hashMap2 = hashMap3;
                view3 = view6;
                z2 = z6;
                view4 = view7;
                arrayList12 = arrayList4;
                z6 = z2;
                view7 = view4;
                vs0Var4 = vs0Var;
                i20 = i4;
                arrayList7 = arrayList5;
                z5 = z;
                view6 = view3;
                hashMap3 = hashMap2;
                rect2 = rect;
                size9 = i22;
            }
            Rect rect5 = rect2;
            vs0 vs0Var6 = vs0Var4;
            ArrayList arrayList15 = arrayList12;
            ArrayList arrayList16 = arrayList7;
            hashMap = hashMap3;
            View view11 = view6;
            ArrayList arrayList17 = new ArrayList();
            int size15 = arrayList16.size();
            TransitionSet transitionSet5 = null;
            TransitionSet transitionSet6 = null;
            int i36 = 0;
            while (i36 < size15) {
                int i37 = size15;
                ArrayList arrayList18 = arrayList16;
                Object obj10 = arrayList18.get(i36);
                int i38 = i36 + 1;
                c90 c90Var3 = (c90) obj10;
                boolean k2 = c90Var3.k();
                hi hiVar4 = hiVar;
                bo2 bo2Var7 = (bo2) c90Var3.a;
                if (k2) {
                    hashMap.put(bo2Var7, Boolean.FALSE);
                    c90Var3.d();
                    arrayList16 = arrayList18;
                    i36 = i38;
                    hiVar = hiVar4;
                    str4 = str4;
                } else {
                    String str9 = str4;
                    Object obj11 = c90Var3.c;
                    Transition clone2 = obj11 != null ? ((Transition) obj11).clone() : null;
                    boolean z9 = transitionSet4 != null && (bo2Var7 == bo2Var3 || bo2Var7 == bo2Var4);
                    if (clone2 == null) {
                        if (!z9) {
                            hashMap.put(bo2Var7, Boolean.FALSE);
                            c90Var3.d();
                        }
                        view = view11;
                        arrayList16 = arrayList18;
                        bo2Var2 = bo2Var4;
                        transitionSet2 = transitionSet4;
                        view2 = view7;
                    } else {
                        bo2Var2 = bo2Var4;
                        ArrayList arrayList19 = new ArrayList();
                        arrayList16 = arrayList18;
                        fr0 fr0Var7 = bo2Var7.c;
                        transitionSet2 = transitionSet4;
                        a(fr0Var7.mView, arrayList19);
                        if (z9) {
                            if (bo2Var7 == bo2Var3) {
                                arrayList19.removeAll(arrayList11);
                            } else {
                                arrayList19.removeAll(arrayList15);
                            }
                        }
                        if (arrayList19.isEmpty()) {
                            clone2.addTarget(view11);
                            view = view11;
                        } else {
                            vs0.a(clone2, arrayList19);
                            clone2.addListener(new ts0(vs0Var6, clone2, arrayList19, null, null));
                            view = view11;
                            if (bo2Var7.a == 3) {
                                arrayList2.remove(bo2Var7);
                                ArrayList arrayList20 = new ArrayList(arrayList19);
                                arrayList20.remove(fr0Var7.mView);
                                clone2.addListener(new ss0(fr0Var7.mView, arrayList20));
                                gv1.a(viewGroup, new r7(3, arrayList19));
                            }
                        }
                        if (bo2Var7.a == i14) {
                            arrayList17.addAll(arrayList19);
                            if (z6) {
                                clone2.setEpicenterCallback(new rs0(1, rect5));
                            }
                        } else if (view7 != null) {
                            Rect rect6 = new Rect();
                            view2 = view7;
                            vs0.b(view2, rect6);
                            clone2.setEpicenterCallback(new rs0(0, rect6));
                            hashMap.put(bo2Var7, Boolean.TRUE);
                            if (c90Var3.d) {
                                TransitionSet transitionSet7 = new TransitionSet();
                                if (transitionSet6 != null) {
                                    transitionSet7.addTransition(transitionSet6);
                                }
                                transitionSet7.addTransition(clone2);
                                transitionSet6 = transitionSet7;
                            } else {
                                TransitionSet transitionSet8 = new TransitionSet();
                                if (transitionSet5 != null) {
                                    transitionSet8.addTransition(transitionSet5);
                                }
                                transitionSet8.addTransition(clone2);
                                transitionSet5 = transitionSet8;
                            }
                        }
                        view2 = view7;
                        hashMap.put(bo2Var7, Boolean.TRUE);
                        if (c90Var3.d) {
                        }
                    }
                    view7 = view2;
                    view11 = view;
                    i36 = i38;
                    hiVar = hiVar4;
                    transitionSet4 = transitionSet2;
                    str4 = str9;
                    bo2Var4 = bo2Var2;
                    i14 = 2;
                }
                size15 = i37;
            }
            bo2 bo2Var8 = bo2Var4;
            hi hiVar5 = hiVar;
            String str10 = str4;
            TransitionSet transitionSet9 = transitionSet4;
            TransitionSet transitionSet10 = transitionSet5;
            TransitionSet transitionSet11 = transitionSet6;
            if (transitionSet10 != null && transitionSet11 != null) {
                transitionSet10 = new TransitionSet().addTransition(transitionSet10).addTransition(transitionSet11).setOrdering(1);
            } else if (transitionSet10 == null) {
                transitionSet10 = transitionSet11 != null ? transitionSet11 : null;
            }
            if (transitionSet9 != null) {
                TransitionSet transitionSet12 = new TransitionSet();
                if (transitionSet10 != null) {
                    transitionSet12.addTransition(transitionSet10);
                }
                transitionSet = transitionSet9;
                transitionSet12.addTransition(transitionSet);
                transitionSet10 = transitionSet12;
            } else {
                transitionSet = transitionSet9;
            }
            if (transitionSet10 == null) {
                str = str10;
                bo2Var = bo2Var8;
            } else {
                int size16 = arrayList16.size();
                int i39 = 0;
                while (i39 < size16) {
                    ArrayList arrayList21 = arrayList16;
                    Object obj12 = arrayList21.get(i39);
                    i39++;
                    c90 c90Var4 = (c90) obj12;
                    boolean k3 = c90Var4.k();
                    bo2 bo2Var9 = (bo2) c90Var4.a;
                    if (k3) {
                        arrayList16 = arrayList21;
                    } else {
                        Object obj13 = c90Var4.c;
                        bo2 bo2Var10 = bo2Var8;
                        boolean z10 = transitionSet != null && (bo2Var9 == bo2Var3 || bo2Var9 == bo2Var10);
                        if (obj13 != null || z10) {
                            WeakHashMap weakHashMap2 = e53.a;
                            if (viewGroup.isLaidOut()) {
                                str2 = str10;
                                i3 = size16;
                                transitionSet10.addListener(new us0(new iu0(8, c90Var4, bo2Var9)));
                            } else {
                                if (as0.G(2)) {
                                    str2 = str10;
                                    Log.v(str2, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + bo2Var9);
                                } else {
                                    str2 = str10;
                                }
                                c90Var4.d();
                                i3 = size16;
                            }
                        } else {
                            i3 = size16;
                            str2 = str10;
                        }
                        size16 = i3;
                        arrayList16 = arrayList21;
                        bo2Var8 = bo2Var10;
                        str10 = str2;
                    }
                }
                str = str10;
                bo2Var = bo2Var8;
                WeakHashMap weakHashMap3 = e53.a;
                if (viewGroup.isLaidOut()) {
                    qs0.a(4, arrayList17);
                    ArrayList arrayList22 = new ArrayList();
                    int size17 = arrayList15.size();
                    for (int i40 = 0; i40 < size17; i40++) {
                        View view12 = (View) arrayList15.get(i40);
                        WeakHashMap weakHashMap4 = e53.a;
                        arrayList22.add(view12.getTransitionName());
                        view12.setTransitionName(null);
                    }
                    if (as0.G(2)) {
                        Log.v(str, ">>>>> Beginning transition <<<<<");
                        Log.v(str, ">>>>> SharedElementFirstOutViews <<<<<");
                        int i41 = 0;
                        for (int size18 = arrayList11.size(); i41 < size18; size18 = size18) {
                            Object obj14 = arrayList11.get(i41);
                            i41++;
                            View view13 = (View) obj14;
                            Log.v(str, "View: " + view13 + " Name: " + view13.getTransitionName());
                        }
                        Log.v(str, ">>>>> SharedElementLastInViews <<<<<");
                        int i42 = 0;
                        for (int size19 = arrayList15.size(); i42 < size19; size19 = size19) {
                            Object obj15 = arrayList15.get(i42);
                            i42++;
                            View view14 = (View) obj15;
                            Log.v(str, "View: " + view14 + " Name: " + view14.getTransitionName());
                        }
                    }
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet10);
                    int size20 = arrayList15.size();
                    ArrayList arrayList23 = new ArrayList();
                    int i43 = 0;
                    while (i43 < size20) {
                        View view15 = (View) arrayList11.get(i43);
                        WeakHashMap weakHashMap5 = e53.a;
                        String transitionName = view15.getTransitionName();
                        arrayList23.add(transitionName);
                        if (transitionName == null) {
                            i2 = size20;
                            arrayList3 = arrayList23;
                            r9 = hiVar5;
                        } else {
                            view15.setTransitionName(null);
                            r9 = hiVar5;
                            String str11 = (String) r9.get(transitionName);
                            arrayList3 = arrayList23;
                            int i44 = 0;
                            while (true) {
                                i2 = size20;
                                if (i44 >= size20) {
                                    break;
                                }
                                if (str11.equals(arrayList22.get(i44))) {
                                    ((View) arrayList15.get(i44)).setTransitionName(transitionName);
                                    break;
                                } else {
                                    i44++;
                                    size20 = i2;
                                }
                            }
                        }
                        i43++;
                        hiVar5 = r9;
                        size20 = i2;
                        arrayList23 = arrayList3;
                    }
                    gv1.a(viewGroup, new ws0(size20, arrayList15, arrayList22, arrayList11, arrayList23));
                    i = 0;
                    qs0.a(0, arrayList17);
                    if (transitionSet != null) {
                        transitionSet.getTargets().clear();
                        transitionSet.getTargets().addAll(arrayList15);
                        vs0.d(transitionSet, arrayList11, arrayList15);
                    }
                    boolean containsValue = hashMap.containsValue(Boolean.TRUE);
                    Context context = viewGroup.getContext();
                    ArrayList arrayList24 = new ArrayList();
                    size = arrayList10.size();
                    int i45 = i;
                    i8 = i45;
                    while (i8 < size) {
                        ArrayList arrayList25 = arrayList10;
                        Object obj16 = arrayList25.get(i8);
                        i8++;
                        a90 a90Var2 = (a90) obj16;
                        if (a90Var2.k()) {
                            a90Var2.d();
                        } else {
                            t21 o3 = a90Var2.o(context);
                            if (o3 == null) {
                                a90Var2.d();
                            } else {
                                Animator animator = (Animator) o3.o;
                                if (animator == null) {
                                    arrayList24.add(a90Var2);
                                } else {
                                    bo2 bo2Var11 = (bo2) a90Var2.a;
                                    z4 = containsValue;
                                    fr0 fr0Var8 = bo2Var11.c;
                                    i11 = size;
                                    i12 = i45;
                                    if (Boolean.TRUE.equals(hashMap.get(bo2Var11))) {
                                        if (as0.G(2)) {
                                            Log.v(str, "Ignoring Animator set on " + fr0Var8 + " as this Fragment was involved in a Transition.");
                                        }
                                        a90Var2.d();
                                        containsValue = z4;
                                        size = i11;
                                        i45 = i12;
                                        arrayList10 = arrayList25;
                                    } else {
                                        boolean z11 = bo2Var11.a == 3;
                                        ArrayList arrayList26 = arrayList2;
                                        if (z11) {
                                            arrayList26.remove(bo2Var11);
                                        }
                                        View view16 = fr0Var8.mView;
                                        viewGroup.startViewTransition(view16);
                                        ViewGroup viewGroup3 = viewGroup;
                                        animator.addListener(new x80(viewGroup3, view16, z11, bo2Var11, a90Var2));
                                        animator.setTarget(view16);
                                        animator.start();
                                        if (as0.G(2)) {
                                            Log.v(str, "Animator from operation " + bo2Var11 + " has started.");
                                        }
                                        ((is) a90Var2.b).a(new t21(13, animator, bo2Var11));
                                        containsValue = z4;
                                        arrayList2 = arrayList26;
                                        viewGroup = viewGroup3;
                                        arrayList10 = arrayList25;
                                        i45 = 1;
                                        size = i11;
                                    }
                                }
                            }
                        }
                        z4 = containsValue;
                        i11 = size;
                        i12 = i45;
                        containsValue = z4;
                        size = i11;
                        i45 = i12;
                        arrayList10 = arrayList25;
                    }
                    boolean z12 = containsValue;
                    int i46 = i45;
                    ArrayList arrayList27 = arrayList2;
                    ViewGroup viewGroup4 = viewGroup;
                    size2 = arrayList24.size();
                    i9 = 0;
                    while (i9 < size2) {
                        Object obj17 = arrayList24.get(i9);
                        i9++;
                        a90 a90Var3 = (a90) obj17;
                        bo2 bo2Var12 = (bo2) a90Var3.a;
                        fr0 fr0Var9 = bo2Var12.c;
                        if (z12) {
                            if (as0.G(2)) {
                                Log.v(str, "Ignoring Animation set on " + fr0Var9 + " as Animations cannot run alongside Transitions.");
                            }
                            a90Var3.d();
                        } else if (i46 != 0) {
                            if (as0.G(2)) {
                                Log.v(str, "Ignoring Animation set on " + fr0Var9 + " as Animations cannot run alongside Animators.");
                            }
                            a90Var3.d();
                        } else {
                            View view17 = fr0Var9.mView;
                            t21 o4 = a90Var3.o(context);
                            o4.getClass();
                            Animation animation = (Animation) o4.n;
                            animation.getClass();
                            if (bo2Var12.a != 1) {
                                view17.startAnimation(animation);
                                a90Var3.d();
                            } else {
                                viewGroup4.startViewTransition(view17);
                                lr0 lr0Var = new lr0(animation, viewGroup4, view17);
                                lr0Var.setAnimationListener(new y80(bo2Var12, viewGroup4, view17, a90Var3));
                                view17.startAnimation(lr0Var);
                                if (as0.G(2)) {
                                    Log.v(str, "Animation from operation " + bo2Var12 + " has started.");
                                }
                            }
                            ((is) a90Var3.b).a(new js0(view17, viewGroup4, a90Var3, bo2Var12));
                        }
                    }
                    size3 = arrayList27.size();
                    i10 = 0;
                    while (i10 < size3) {
                        Object obj18 = arrayList27.get(i10);
                        i10++;
                        bo2 bo2Var13 = (bo2) obj18;
                        in1.a(bo2Var13.c.mView, bo2Var13.a);
                    }
                    arrayList27.clear();
                    if (as0.G(2)) {
                        return;
                    }
                    Log.v(str, "Completed executing operations from " + bo2Var3 + str6 + bo2Var);
                    return;
                }
            }
        }
        i = 0;
        boolean containsValue2 = hashMap.containsValue(Boolean.TRUE);
        Context context2 = viewGroup.getContext();
        ArrayList arrayList242 = new ArrayList();
        size = arrayList10.size();
        int i452 = i;
        i8 = i452;
        while (i8 < size) {
        }
        boolean z122 = containsValue2;
        int i462 = i452;
        ArrayList arrayList272 = arrayList2;
        ViewGroup viewGroup42 = viewGroup;
        size2 = arrayList242.size();
        i9 = 0;
        while (i9 < size2) {
        }
        size3 = arrayList272.size();
        i10 = 0;
        while (i10 < size3) {
        }
        arrayList272.clear();
        if (as0.G(2)) {
        }
    }

    public final void d() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = e53.a;
        if (!viewGroup.isAttachedToWindow()) {
            g();
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
                        bo2 bo2Var = (bo2) obj;
                        if (as0.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bo2Var);
                        }
                        bo2Var.a();
                        if (!bo2Var.g) {
                            this.c.add(bo2Var);
                        }
                    }
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (as0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((bo2) obj2).d();
                    }
                    c(arrayList2, this.d);
                    this.d = false;
                    if (as0.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final bo2 f(fr0 fr0Var) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bo2 bo2Var = (bo2) obj;
            if (bo2Var.c.equals(fr0Var) && !bo2Var.f) {
                return bo2Var;
            }
        }
        return null;
    }

    public final void g() {
        String str;
        String str2;
        if (as0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = e53.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((bo2) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    bo2 bo2Var = (bo2) obj2;
                    if (as0.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = BuildConfig.FLAVOR;
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(bo2Var);
                        Log.v("FragmentManager", sb.toString());
                    }
                    bo2Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    bo2 bo2Var2 = (bo2) obj3;
                    if (as0.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(bo2Var2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    bo2Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.b) {
            try {
                l();
                this.e = false;
                int size = this.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    bo2 bo2Var = (bo2) this.b.get(size);
                    int c = in1.c(bo2Var.c.mView);
                    if (bo2Var.a == 2 && c != 2) {
                        this.e = bo2Var.c.isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bo2 bo2Var = (bo2) obj;
            if (bo2Var.b == 2) {
                bo2Var.c(in1.b(bo2Var.c.requireView().getVisibility()), 1);
            }
        }
    }
}
