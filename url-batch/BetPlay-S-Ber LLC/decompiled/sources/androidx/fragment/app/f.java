package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.awerser.monnit.betplay.R;
import defpackage.c7;
import defpackage.c9;
import defpackage.e7;
import defpackage.e90;
import defpackage.fk;
import defpackage.fl;
import defpackage.h1;
import defpackage.h5;
import defpackage.h8;
import defpackage.i90;
import defpackage.kl;
import defpackage.lk;
import defpackage.ll;
import defpackage.ml;
import defpackage.n7;
import defpackage.o30;
import defpackage.o8;
import defpackage.uw;
import defpackage.ve;
import defpackage.vg;
import defpackage.we;
import defpackage.xe;
import defpackage.ye;
import defpackage.z6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class f {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public f(ViewGroup viewGroup) {
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
        int i = i90.a;
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

    public static void e(e7 e7Var, View view) {
        WeakHashMap weakHashMap = e90.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            e7Var.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    e(e7Var, childAt);
                }
            }
        }
    }

    public static f h(ViewGroup viewGroup, vg vgVar) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof f) {
            return (f) tag;
        }
        vgVar.getClass();
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
        return fVar;
    }

    public static f i(ViewGroup viewGroup, n nVar) {
        return h(viewGroup, nVar.E());
    }

    public static void k(e7 e7Var, Collection collection) {
        Iterator it = ((z6) e7Var.entrySet()).iterator();
        while (true) {
            c7 c7Var = (c7) it;
            if (!c7Var.hasNext()) {
                return;
            }
            c7Var.next();
            View view = (View) c7Var.getValue();
            WeakHashMap weakHashMap = e90.a;
            if (!collection.contains(view.getTransitionName())) {
                c7Var.remove();
            }
        }
    }

    public final void b(int i, int i2, q qVar) {
        synchronized (this.b) {
            try {
                c9 c9Var = new c9();
                s f = f(qVar.c);
                if (f != null) {
                    f.c(i, i2);
                    return;
                }
                s sVar = new s(i, i2, qVar, c9Var);
                this.b.add(sVar);
                sVar.d.add(new c(this, sVar));
                sVar.d.add(new h1(this, sVar, 8));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0848 A[LOOP:7: B:156:0x0846->B:157:0x0848, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06b0  */
    /* JADX WARN: Type inference failed for: r7v5, types: [h30] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ArrayList arrayList, boolean z) {
        int i;
        ArrayList arrayList2;
        HashMap hashMap;
        s sVar;
        String str;
        int i2;
        ?? r7;
        ArrayList arrayList3;
        int i3;
        int i4;
        String str2;
        int i5;
        s sVar2;
        Object obj;
        View view;
        int i6;
        View view2;
        ArrayList arrayList4;
        int i7;
        ArrayList arrayList5;
        HashMap hashMap2;
        View view3;
        int i8;
        View view4;
        View view5;
        int size;
        int i9;
        int size2;
        int i10;
        int size3;
        int i11;
        boolean z2;
        int i12;
        int size4 = arrayList.size();
        s sVar3 = null;
        s sVar4 = null;
        int i13 = 0;
        while (true) {
            i = 2;
            if (i13 >= size4) {
                break;
            }
            Object obj2 = arrayList.get(i13);
            i13++;
            s sVar5 = (s) obj2;
            int c = o30.c(sVar5.c.mView);
            int i14 = o30.i(sVar5.a);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2 && i14 != 3) {
                    }
                } else if (c != 2) {
                    sVar4 = sVar5;
                }
            }
            if (c == 2 && sVar3 == null) {
                sVar3 = sVar5;
            }
        }
        String str3 = " to ";
        String str4 = "FragmentManager";
        if (n.G(2)) {
            Log.v("FragmentManager", "Executing operations from " + sVar3 + " to " + sVar4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(arrayList);
        Fragment fragment = ((s) arrayList.get(arrayList.size() - 1)).c;
        int i15 = 1;
        int size5 = arrayList.size();
        int i16 = 0;
        while (i16 < size5) {
            Object obj3 = arrayList.get(i16);
            i16++;
            int i17 = i;
            fk fkVar = ((s) obj3).c.mAnimationInfo;
            fk fkVar2 = fragment.mAnimationInfo;
            fkVar.b = fkVar2.b;
            fkVar.c = fkVar2.c;
            fkVar.d = fkVar2.d;
            fkVar.e = fkVar2.e;
            i = i17;
        }
        int i18 = i;
        int size6 = arrayList.size();
        int i19 = 0;
        while (i19 < size6) {
            Object obj4 = arrayList.get(i19);
            i19++;
            s sVar6 = (s) obj4;
            c9 c9Var = new c9();
            sVar6.d();
            HashSet hashSet = sVar6.e;
            hashSet.add(c9Var);
            d dVar = new d(sVar6, c9Var);
            dVar.d = false;
            dVar.c = z;
            arrayList6.add(dVar);
            c9 c9Var2 = new c9();
            sVar6.d();
            hashSet.add(c9Var2);
            arrayList7.add(new ye(sVar6, c9Var2, z, !z ? sVar6 != sVar4 : sVar6 != sVar3));
            sVar6.d.add(new c(this, arrayList8, sVar6));
        }
        HashMap hashMap3 = new HashMap();
        int size7 = arrayList7.size();
        ml mlVar = null;
        int i20 = 0;
        while (i20 < size7) {
            Object obj5 = arrayList7.get(i20);
            i20++;
            ye yeVar = (ye) obj5;
            boolean b = yeVar.b();
            Fragment fragment2 = yeVar.a.c;
            int i21 = size7;
            Object obj6 = yeVar.c;
            if (b) {
                size7 = i21;
            } else {
                ml c2 = yeVar.c(obj6);
                Object obj7 = yeVar.e;
                ml c3 = yeVar.c(obj7);
                String str5 = str3;
                ArrayList arrayList9 = arrayList6;
                if (c2 != null && c3 != null && c2 != c3) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + fragment2 + " returned Transition " + obj6 + " which uses a different Transition  type than its shared element transition " + obj7);
                }
                if (c2 == null) {
                    c2 = c3;
                }
                if (mlVar == null) {
                    mlVar = c2;
                } else if (c2 != null && mlVar != c2) {
                    o8.o("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ", fragment2, " returned Transition ", obj6, " which uses a different Transition  type than other Fragments.");
                    return;
                }
                size7 = i21;
                i20 = i20;
                str3 = str5;
                arrayList6 = arrayList9;
            }
        }
        ArrayList arrayList10 = arrayList6;
        String str6 = str3;
        ViewGroup viewGroup = this.a;
        if (mlVar == null) {
            int size8 = arrayList7.size();
            int i22 = 0;
            while (i22 < size8) {
                Object obj8 = arrayList7.get(i22);
                i22++;
                ye yeVar2 = (ye) obj8;
                hashMap3.put(yeVar2.a, Boolean.FALSE);
                yeVar2.a();
            }
            hashMap = hashMap3;
            sVar = sVar4;
            str = "FragmentManager";
            arrayList2 = arrayList8;
        } else {
            View view6 = new View(viewGroup.getContext());
            Rect rect = new Rect();
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            e7 e7Var = new e7(0);
            int size9 = arrayList7.size();
            arrayList2 = arrayList8;
            Object obj9 = null;
            int i23 = 0;
            boolean z3 = false;
            View view7 = null;
            while (i23 < size9) {
                Object obj10 = arrayList7.get(i23);
                int i24 = i23 + 1;
                int i25 = size9;
                Object obj11 = ((ye) obj10).e;
                if (obj11 == null || sVar3 == null) {
                    arrayList4 = arrayList7;
                    i7 = i24;
                } else {
                    i7 = i24;
                    Fragment fragment3 = sVar3.c;
                    if (sVar4 != null) {
                        Fragment fragment4 = sVar4.c;
                        Object r = mlVar.r(mlVar.f(obj11));
                        arrayList4 = arrayList7;
                        ArrayList<String> sharedElementSourceNames = fragment4.getSharedElementSourceNames();
                        HashMap hashMap4 = hashMap3;
                        ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                        View view8 = view6;
                        ArrayList<String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                        Rect rect2 = rect;
                        ArrayList arrayList13 = arrayList12;
                        int i26 = 0;
                        while (i26 < sharedElementTargetNames.size()) {
                            int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i26));
                            ArrayList<String> arrayList14 = sharedElementTargetNames;
                            if (indexOf != -1) {
                                sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i26));
                            }
                            i26++;
                            sharedElementTargetNames = arrayList14;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment4.getSharedElementTargetNames();
                        if (z) {
                            fragment3.getEnterTransitionCallback();
                            fragment4.getExitTransitionCallback();
                        } else {
                            fragment3.getExitTransitionCallback();
                            fragment4.getEnterTransitionCallback();
                        }
                        int i27 = 0;
                        for (int size10 = sharedElementSourceNames.size(); i27 < size10; size10 = size10) {
                            e7Var.put(sharedElementSourceNames.get(i27), sharedElementTargetNames2.get(i27));
                            i27++;
                        }
                        if (n.G(i18)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            int i28 = 0;
                            for (int size11 = sharedElementTargetNames2.size(); i28 < size11; size11 = size11) {
                                String str7 = sharedElementTargetNames2.get(i28);
                                Log.v("FragmentManager", "Name: " + str7);
                                i28++;
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            int i29 = 0;
                            for (int size12 = sharedElementSourceNames.size(); i29 < size12; size12 = size12) {
                                String str8 = sharedElementSourceNames.get(i29);
                                Log.v("FragmentManager", "Name: " + str8);
                                i29++;
                            }
                        }
                        e7 e7Var2 = new e7(0);
                        e(e7Var2, fragment3.mView);
                        e7Var2.l(sharedElementSourceNames);
                        e7Var.l(e7Var2.keySet());
                        e7 e7Var3 = new e7(0);
                        e(e7Var3, fragment4.mView);
                        e7Var3.l(sharedElementTargetNames2);
                        e7Var3.l(e7Var.values());
                        kl klVar = fl.a;
                        int i30 = e7Var.h - 1;
                        while (i30 >= 0) {
                            Fragment fragment5 = fragment4;
                            if (!e7Var3.containsKey((String) e7Var.i(i30))) {
                                e7Var.g(i30);
                            }
                            i30--;
                            fragment4 = fragment5;
                        }
                        Fragment fragment6 = fragment4;
                        k(e7Var2, e7Var.keySet());
                        k(e7Var3, e7Var.values());
                        if (e7Var.isEmpty()) {
                            arrayList11.clear();
                            arrayList13.clear();
                            arrayList5 = arrayList13;
                            view3 = view8;
                            rect = rect2;
                            hashMap2 = hashMap4;
                            obj9 = null;
                        } else {
                            if (z) {
                                fragment3.getEnterTransitionCallback();
                            } else {
                                fragment6.getEnterTransitionCallback();
                            }
                            uw.a(viewGroup, new xe(sVar4, sVar3, z, e7Var3));
                            arrayList11.addAll(e7Var2.values());
                            if (sharedElementSourceNames.isEmpty()) {
                                i8 = 0;
                                view4 = view7;
                            } else {
                                i8 = 0;
                                view4 = (View) e7Var2.get(sharedElementSourceNames.get(0));
                                mlVar.m(view4, r);
                            }
                            arrayList5 = arrayList13;
                            arrayList5.addAll(e7Var3.values());
                            if (sharedElementTargetNames2.isEmpty() || (view5 = (View) e7Var3.get(sharedElementTargetNames2.get(i8))) == null) {
                                rect = rect2;
                            } else {
                                rect = rect2;
                                uw.a(viewGroup, new h1(mlVar, view5, rect));
                                z3 = true;
                            }
                            view3 = view8;
                            mlVar.p(r, view3, arrayList11);
                            mlVar.l(r, null, null, r, arrayList5);
                            Boolean bool = Boolean.TRUE;
                            hashMap2 = hashMap4;
                            hashMap2.put(sVar3, bool);
                            hashMap2.put(sVar4, bool);
                            view7 = view4;
                            obj9 = r;
                        }
                        size9 = i25;
                        i23 = i7;
                        view6 = view3;
                        hashMap3 = hashMap2;
                        arrayList12 = arrayList5;
                        arrayList7 = arrayList4;
                    } else {
                        arrayList4 = arrayList7;
                    }
                }
                arrayList5 = arrayList12;
                hashMap2 = hashMap3;
                view3 = view6;
                size9 = i25;
                i23 = i7;
                view6 = view3;
                hashMap3 = hashMap2;
                arrayList12 = arrayList5;
                arrayList7 = arrayList4;
            }
            ArrayList arrayList15 = arrayList7;
            ArrayList arrayList16 = arrayList12;
            hashMap = hashMap3;
            View view9 = view6;
            ArrayList arrayList17 = new ArrayList();
            int size13 = arrayList15.size();
            e7 e7Var4 = e7Var;
            int i31 = 0;
            Object obj12 = null;
            Object obj13 = null;
            while (i31 < size13) {
                int i32 = size13;
                ArrayList arrayList18 = arrayList15;
                Object obj14 = arrayList18.get(i31);
                int i33 = i31 + 1;
                ye yeVar3 = (ye) obj14;
                boolean b2 = yeVar3.b();
                String str9 = str4;
                s sVar7 = yeVar3.a;
                if (b2) {
                    arrayList15 = arrayList18;
                    hashMap.put(sVar7, Boolean.FALSE);
                    yeVar3.a();
                    size13 = i32;
                    i31 = i33;
                    str4 = str9;
                } else {
                    arrayList15 = arrayList18;
                    Object f = mlVar.f(yeVar3.c);
                    boolean z4 = obj9 != null && (sVar7 == sVar3 || sVar7 == sVar4);
                    if (f == null) {
                        if (!z4) {
                            hashMap.put(sVar7, Boolean.FALSE);
                            yeVar3.a();
                        }
                        view = view9;
                        sVar2 = sVar4;
                        obj = obj9;
                        view2 = view7;
                    } else {
                        sVar2 = sVar4;
                        ArrayList arrayList19 = new ArrayList();
                        obj = obj9;
                        Fragment fragment7 = sVar7.c;
                        Object obj15 = obj13;
                        a(fragment7.mView, arrayList19);
                        if (z4) {
                            if (sVar7 == sVar3) {
                                arrayList19.removeAll(arrayList11);
                            } else {
                                arrayList19.removeAll(arrayList16);
                            }
                        }
                        if (arrayList19.isEmpty()) {
                            mlVar.a(view9, f);
                            view = view9;
                        } else {
                            mlVar.b(f, arrayList19);
                            mlVar.l(f, f, arrayList19, null, null);
                            view = view9;
                            if (sVar7.a == 3) {
                                arrayList2.remove(sVar7);
                                ArrayList arrayList20 = new ArrayList(arrayList19);
                                arrayList20.remove(fragment7.mView);
                                mlVar.k(f, fragment7.mView, arrayList20);
                                i6 = i18;
                                uw.a(viewGroup, new n7(i6, arrayList19));
                                if (sVar7.a != i6) {
                                    arrayList17.addAll(arrayList19);
                                    if (z3) {
                                        mlVar.n(f, rect);
                                    }
                                    view2 = view7;
                                } else {
                                    view2 = view7;
                                    mlVar.m(view2, f);
                                }
                                hashMap.put(sVar7, Boolean.TRUE);
                                if (yeVar3.d) {
                                    obj13 = mlVar.j(obj15, f);
                                } else {
                                    obj12 = mlVar.j(obj12, f);
                                    obj13 = obj15;
                                }
                            }
                        }
                        i6 = i18;
                        if (sVar7.a != i6) {
                        }
                        hashMap.put(sVar7, Boolean.TRUE);
                        if (yeVar3.d) {
                        }
                    }
                    size13 = i32;
                    i31 = i33;
                    view7 = view2;
                    view9 = view;
                    obj9 = obj;
                    str4 = str9;
                    sVar4 = sVar2;
                    i18 = 2;
                }
            }
            sVar = sVar4;
            String str10 = str4;
            Object i34 = mlVar.i(obj12, obj13, obj9);
            if (i34 == null) {
                str = str10;
            } else {
                int size14 = arrayList15.size();
                int i35 = 0;
                while (i35 < size14) {
                    ArrayList arrayList21 = arrayList15;
                    Object obj16 = arrayList21.get(i35);
                    i35++;
                    ye yeVar4 = (ye) obj16;
                    boolean b3 = yeVar4.b();
                    s sVar8 = yeVar4.a;
                    if (b3) {
                        arrayList15 = arrayList21;
                    } else {
                        Object obj17 = yeVar4.c;
                        s sVar9 = sVar;
                        boolean z5 = obj9 != null && (sVar8 == sVar3 || sVar8 == sVar9);
                        if (obj17 != null || z5) {
                            WeakHashMap weakHashMap = e90.a;
                            if (viewGroup.isLaidOut()) {
                                i4 = size14;
                                str2 = str10;
                                i5 = i35;
                                arrayList15 = arrayList21;
                                sVar = sVar9;
                                mlVar.o(i34, yeVar4.b, new h1(yeVar4, sVar8, 6, false));
                            } else {
                                if (n.G(2)) {
                                    i4 = size14;
                                    str2 = str10;
                                    Log.v(str2, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + sVar8);
                                } else {
                                    i4 = size14;
                                    str2 = str10;
                                }
                                yeVar4.a();
                                i5 = i35;
                                arrayList15 = arrayList21;
                                sVar = sVar9;
                            }
                        } else {
                            i4 = size14;
                            i5 = i35;
                            arrayList15 = arrayList21;
                            sVar = sVar9;
                            str2 = str10;
                        }
                        size14 = i4;
                        i35 = i5;
                        str10 = str2;
                    }
                }
                str = str10;
                WeakHashMap weakHashMap2 = e90.a;
                if (viewGroup.isLaidOut()) {
                    fl.a(arrayList17, 4);
                    ArrayList arrayList22 = new ArrayList();
                    int size15 = arrayList16.size();
                    for (int i36 = 0; i36 < size15; i36++) {
                        View view10 = (View) arrayList16.get(i36);
                        WeakHashMap weakHashMap3 = e90.a;
                        arrayList22.add(view10.getTransitionName());
                        view10.setTransitionName(null);
                    }
                    if (n.G(2)) {
                        Log.v(str, ">>>>> Beginning transition <<<<<");
                        Log.v(str, ">>>>> SharedElementFirstOutViews <<<<<");
                        int i37 = 0;
                        for (int size16 = arrayList11.size(); i37 < size16; size16 = size16) {
                            Object obj18 = arrayList11.get(i37);
                            i37++;
                            View view11 = (View) obj18;
                            Log.v(str, "View: " + view11 + " Name: " + view11.getTransitionName());
                        }
                        Log.v(str, ">>>>> SharedElementLastInViews <<<<<");
                        int i38 = 0;
                        for (int size17 = arrayList16.size(); i38 < size17; size17 = size17) {
                            Object obj19 = arrayList16.get(i38);
                            i38++;
                            View view12 = (View) obj19;
                            Log.v(str, "View: " + view12 + " Name: " + view12.getTransitionName());
                        }
                    }
                    mlVar.c(viewGroup, i34);
                    int size18 = arrayList16.size();
                    ArrayList arrayList23 = new ArrayList();
                    int i39 = 0;
                    while (i39 < size18) {
                        View view13 = (View) arrayList11.get(i39);
                        WeakHashMap weakHashMap4 = e90.a;
                        String transitionName = view13.getTransitionName();
                        arrayList23.add(transitionName);
                        if (transitionName == null) {
                            r7 = e7Var4;
                            i3 = size18;
                            arrayList3 = arrayList23;
                        } else {
                            view13.setTransitionName(null);
                            r7 = e7Var4;
                            String str11 = (String) r7.get(transitionName);
                            arrayList3 = arrayList23;
                            int i40 = 0;
                            while (true) {
                                i3 = size18;
                                if (i40 >= size18) {
                                    break;
                                }
                                if (str11.equals(arrayList22.get(i40))) {
                                    ((View) arrayList16.get(i40)).setTransitionName(transitionName);
                                    break;
                                } else {
                                    i40++;
                                    size18 = i3;
                                }
                            }
                        }
                        i39++;
                        e7Var4 = r7;
                        size18 = i3;
                        arrayList23 = arrayList3;
                    }
                    uw.a(viewGroup, new ll(size18, arrayList16, arrayList22, arrayList11, arrayList23));
                    i2 = 0;
                    fl.a(arrayList17, 0);
                    mlVar.q(obj9, arrayList11, arrayList16);
                    boolean containsValue = hashMap.containsValue(Boolean.TRUE);
                    Context context = viewGroup.getContext();
                    ArrayList arrayList24 = new ArrayList();
                    size = arrayList10.size();
                    i9 = i2;
                    int i41 = i9;
                    while (i9 < size) {
                        ArrayList arrayList25 = arrayList10;
                        Object obj20 = arrayList25.get(i9);
                        i9++;
                        d dVar2 = (d) obj20;
                        if (dVar2.b()) {
                            dVar2.a();
                        } else {
                            h5 c4 = dVar2.c(context);
                            if (c4 == null) {
                                dVar2.a();
                            } else {
                                Animator animator = (Animator) c4.h;
                                if (animator == null) {
                                    arrayList24.add(dVar2);
                                } else {
                                    s sVar10 = dVar2.a;
                                    Fragment fragment8 = sVar10.c;
                                    z2 = containsValue;
                                    i12 = size;
                                    if (Boolean.TRUE.equals(hashMap.get(sVar10))) {
                                        if (n.G(2)) {
                                            Log.v(str, "Ignoring Animator set on " + fragment8 + " as this Fragment was involved in a Transition.");
                                        }
                                        dVar2.a();
                                        containsValue = z2;
                                        size = i12;
                                        arrayList10 = arrayList25;
                                    } else {
                                        boolean z6 = sVar10.a == 3;
                                        ArrayList arrayList26 = arrayList2;
                                        if (z6) {
                                            arrayList26.remove(sVar10);
                                        }
                                        View view14 = fragment8.mView;
                                        viewGroup.startViewTransition(view14);
                                        ViewGroup viewGroup2 = viewGroup;
                                        animator.addListener(new ve(viewGroup2, view14, z6, sVar10, dVar2));
                                        animator.setTarget(view14);
                                        animator.start();
                                        if (n.G(2)) {
                                            Log.v(str, "Animator from operation " + sVar10 + " has started.");
                                        }
                                        dVar2.b.a(new h5(animator, sVar10, 10));
                                        size = i12;
                                        arrayList2 = arrayList26;
                                        arrayList10 = arrayList25;
                                        viewGroup = viewGroup2;
                                        i41 = 1;
                                        containsValue = z2;
                                    }
                                }
                            }
                        }
                        z2 = containsValue;
                        i12 = size;
                        containsValue = z2;
                        size = i12;
                        arrayList10 = arrayList25;
                    }
                    ViewGroup viewGroup3 = viewGroup;
                    boolean z7 = containsValue;
                    ArrayList arrayList27 = arrayList2;
                    size2 = arrayList24.size();
                    i10 = 0;
                    while (i10 < size2) {
                        Object obj21 = arrayList24.get(i10);
                        i10++;
                        d dVar3 = (d) obj21;
                        s sVar11 = dVar3.a;
                        Fragment fragment9 = sVar11.c;
                        if (z7) {
                            if (n.G(2)) {
                                Log.v(str, "Ignoring Animation set on " + fragment9 + " as Animations cannot run alongside Transitions.");
                            }
                            dVar3.a();
                        } else if (i41 != 0) {
                            if (n.G(2)) {
                                Log.v(str, "Ignoring Animation set on " + fragment9 + " as Animations cannot run alongside Animators.");
                            }
                            dVar3.a();
                        } else {
                            View view15 = fragment9.mView;
                            h5 c5 = dVar3.c(context);
                            c5.getClass();
                            Animation animation = (Animation) c5.g;
                            animation.getClass();
                            int i42 = i15;
                            if (sVar11.a != i42) {
                                view15.startAnimation(animation);
                                dVar3.a();
                            } else {
                                viewGroup3.startViewTransition(view15);
                                lk lkVar = new lk(animation, viewGroup3, view15);
                                lkVar.setAnimationListener(new we(sVar11, viewGroup3, view15, dVar3));
                                view15.startAnimation(lkVar);
                                if (n.G(2)) {
                                    Log.v(str, "Animation from operation " + sVar11 + " has started.");
                                }
                            }
                            c9 c9Var3 = dVar3.b;
                            h8 h8Var = new h8();
                            h8Var.f = view15;
                            h8Var.g = viewGroup3;
                            h8Var.h = dVar3;
                            h8Var.i = sVar11;
                            c9Var3.a(h8Var);
                            i15 = i42;
                        }
                    }
                    size3 = arrayList27.size();
                    i11 = 0;
                    while (i11 < size3) {
                        Object obj22 = arrayList27.get(i11);
                        i11++;
                        s sVar12 = (s) obj22;
                        o30.a(sVar12.c.mView, sVar12.a);
                    }
                    arrayList27.clear();
                    if (n.G(2)) {
                        return;
                    }
                    Log.v(str, "Completed executing operations from " + sVar3 + str6 + sVar);
                    return;
                }
            }
        }
        i2 = 0;
        boolean containsValue2 = hashMap.containsValue(Boolean.TRUE);
        Context context2 = viewGroup.getContext();
        ArrayList arrayList242 = new ArrayList();
        size = arrayList10.size();
        i9 = i2;
        int i412 = i9;
        while (i9 < size) {
        }
        ViewGroup viewGroup32 = viewGroup;
        boolean z72 = containsValue2;
        ArrayList arrayList272 = arrayList2;
        size2 = arrayList242.size();
        i10 = 0;
        while (i10 < size2) {
        }
        size3 = arrayList272.size();
        i11 = 0;
        while (i11 < size3) {
        }
        arrayList272.clear();
        if (n.G(2)) {
        }
    }

    public final void d() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = e90.a;
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
                        s sVar = (s) obj;
                        if (n.G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + sVar);
                        }
                        sVar.a();
                        if (!sVar.g) {
                            this.c.add(sVar);
                        }
                    }
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (n.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((s) obj2).d();
                    }
                    c(arrayList2, this.d);
                    this.d = false;
                    if (n.G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s f(Fragment fragment) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s sVar = (s) obj;
            if (sVar.c.equals(fragment) && !sVar.f) {
                return sVar;
            }
        }
        return null;
    }

    public final void g() {
        String str;
        String str2;
        if (n.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = e90.a;
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
                    ((s) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    s sVar = (s) obj2;
                    if (n.G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(sVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    sVar.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    s sVar2 = (s) obj3;
                    if (n.G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(sVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    sVar2.a();
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
                    s sVar = (s) this.b.get(size);
                    int c = o30.c(sVar.c.mView);
                    if (sVar.a == 2 && c != 2) {
                        this.e = sVar.c.isPostponed();
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
            s sVar = (s) obj;
            if (sVar.b == 2) {
                sVar.c(o30.b(sVar.c.requireView().getVisibility()), 1);
            }
        }
    }
}
