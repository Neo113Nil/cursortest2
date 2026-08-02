package androidx.fragment.app;

import android.util.Log;
import b.C0241b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class W extends b.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f4783a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(f0 f0Var) {
        super(false);
        this.f4783a = f0Var;
    }

    @Override // b.q
    public final void handleOnBackCancelled() {
        boolean J4 = f0.J(3);
        f0 f0Var = this.f4783a;
        if (J4) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + f0Var);
        }
        C0193a c0193a = f0Var.f4854h;
        if (c0193a != null) {
            c0193a.f4802q = false;
            c0193a.d(false);
            f0Var.z(true);
            f0Var.D();
            Iterator it = f0Var.f4859m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        f0Var.f4854h = null;
    }

    @Override // b.q
    public final void handleOnBackPressed() {
        boolean J4 = f0.J(3);
        f0 f0Var = this.f4783a;
        if (J4) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + f0Var);
        }
        W w4 = f0Var.f4855i;
        ArrayList arrayList = f0Var.f4859m;
        f0Var.z(true);
        if (f0Var.f4854h == null) {
            if (w4.isEnabled()) {
                if (f0.J(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                f0Var.P();
                return;
            } else {
                if (f0.J(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                f0Var.f4853g.c();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(f0.E(f0Var.f4854h));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        ArrayList arrayList2 = f0Var.f4854h.f4788a;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            F f4 = ((o0) obj2).f4941b;
            if (f4 != null) {
                f4.mTransitioning = false;
            }
        }
        Iterator it2 = f0Var.f(new ArrayList(Collections.singletonList(f0Var.f4854h)), 0, 1).iterator();
        while (it2.hasNext()) {
            C0211o c0211o = (C0211o) it2.next();
            ArrayList arrayList3 = c0211o.f4937c;
            if (f0.J(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            c0211o.l(arrayList3);
            c0211o.c(arrayList3);
        }
        f0Var.f4854h = null;
        f0Var.c0();
        if (f0.J(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + w4.isEnabled() + " for  FragmentManager " + f0Var);
        }
    }

    @Override // b.q
    public final void handleOnBackProgressed(C0241b backEvent) {
        boolean J4 = f0.J(2);
        f0 f0Var = this.f4783a;
        if (J4) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + f0Var);
        }
        if (f0Var.f4854h != null) {
            Iterator it = f0Var.f(new ArrayList(Collections.singletonList(f0Var.f4854h)), 0, 1).iterator();
            while (it.hasNext()) {
                C0211o c0211o = (C0211o) it.next();
                c0211o.getClass();
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                if (f0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f5215c);
                }
                ArrayList arrayList = c0211o.f4937c;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    d3.o.Z(arrayList2, ((B0) obj).f4733k);
                }
                List n02 = d3.i.n0(d3.i.p0(arrayList2));
                int size2 = n02.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((A0) n02.get(i5)).d(backEvent, c0211o.f4935a);
                }
            }
            Iterator it2 = f0Var.f4859m.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // b.q
    public final void handleOnBackStarted(C0241b c0241b) {
        boolean J4 = f0.J(3);
        f0 f0Var = this.f4783a;
        if (J4) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + f0Var);
        }
        f0Var.w();
        f0Var.x(new e0(f0Var), false);
    }
}
