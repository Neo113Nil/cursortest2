package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bo2 {
    public int a;
    public int b;
    public final fr0 c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final is0 h;

    public bo2(int i, int i2, is0 is0Var, is isVar) {
        fr0 fr0Var = is0Var.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = fr0Var;
        isVar.a(new at0(this));
        this.h = is0Var;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            is isVar = (is) obj;
            synchronized (isVar) {
                try {
                    if (!isVar.a) {
                        isVar.a = true;
                        isVar.c = true;
                        hs hsVar = isVar.b;
                        if (hsVar != null) {
                            try {
                                hsVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (isVar) {
                                    isVar.c = false;
                                    isVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (isVar) {
                            isVar.c = false;
                            isVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (as0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.j();
    }

    public final void c(int i, int i2) {
        int u = q40.u(i2);
        fr0 fr0Var = this.c;
        if (u == 0) {
            if (this.a != 1) {
                if (as0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fr0Var + " mFinalState = " + in1.s(this.a) + " -> " + in1.s(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (u == 1) {
            if (this.a == 1) {
                if (as0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fr0Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + in1.r(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (u != 2) {
            return;
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fr0Var + " mFinalState = " + in1.s(this.a) + " -> REMOVED. mLifecycleImpact  = " + in1.r(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        is0 is0Var = this.h;
        if (i != 2) {
            if (i == 3) {
                fr0 fr0Var = is0Var.c;
                View requireView = fr0Var.requireView();
                if (as0.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fr0Var);
                }
                requireView.clearFocus();
                return;
            }
            return;
        }
        fr0 fr0Var2 = is0Var.c;
        View findFocus = fr0Var2.mView.findFocus();
        if (findFocus != null) {
            fr0Var2.setFocusedView(findFocus);
            if (as0.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fr0Var2);
            }
        }
        View requireView2 = this.c.requireView();
        if (requireView2.getParent() == null) {
            is0Var.a();
            requireView2.setAlpha(0.0f);
        }
        if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
            requireView2.setVisibility(4);
        }
        requireView2.setAlpha(fr0Var2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + in1.s(this.a) + "} {mLifecycleImpact = " + in1.r(this.b) + "} {mFragment = " + this.c + "}";
    }
}
