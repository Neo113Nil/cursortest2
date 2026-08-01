package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class m60 {
    public int a;
    public int b;
    public final pm c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final ln h;

    public m60(int i, int i2, ln lnVar, u9 u9Var) {
        pm pmVar = lnVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = pmVar;
        u9Var.a(new pw(this));
        this.h = lnVar;
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
            u9 u9Var = (u9) obj;
            synchronized (u9Var) {
                try {
                    if (!u9Var.a) {
                        u9Var.a = true;
                        u9Var.c = true;
                        t9 t9Var = u9Var.b;
                        if (t9Var != null) {
                            try {
                                t9Var.onCancel();
                            } catch (Throwable th) {
                                synchronized (u9Var) {
                                    u9Var.c = false;
                                    u9Var.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (u9Var) {
                            u9Var.c = false;
                            u9Var.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (en.G(2)) {
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
        this.h.k();
    }

    public final void c(int i, int i2) {
        int j = f60.j(i2);
        pm pmVar = this.c;
        if (j == 0) {
            if (this.a != 1) {
                if (en.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pmVar + " mFinalState = " + f60.l(this.a) + " -> " + f60.l(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (j == 1) {
            if (this.a == 1) {
                if (en.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pmVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + f60.k(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (j != 2) {
            return;
        }
        if (en.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + pmVar + " mFinalState = " + f60.l(this.a) + " -> REMOVED. mLifecycleImpact  = " + f60.k(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        ln lnVar = this.h;
        if (i != 2) {
            if (i == 3) {
                pm pmVar = lnVar.c;
                View F = pmVar.F();
                if (en.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + F.findFocus() + " on view " + F + " for Fragment " + pmVar);
                }
                F.clearFocus();
                return;
            }
            return;
        }
        pm pmVar2 = lnVar.c;
        View findFocus = pmVar2.J.findFocus();
        if (findFocus != null) {
            pmVar2.f().k = findFocus;
            if (en.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + pmVar2);
            }
        }
        View F2 = this.c.F();
        if (F2.getParent() == null) {
            lnVar.b();
            F2.setAlpha(0.0f);
        }
        if (F2.getAlpha() == 0.0f && F2.getVisibility() == 0) {
            F2.setVisibility(4);
        }
        om omVar = pmVar2.M;
        F2.setAlpha(omVar == null ? 1.0f : omVar.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + f60.l(this.a) + "} {mLifecycleImpact = " + f60.k(this.b) + "} {mFragment = " + this.c + "}";
    }
}
