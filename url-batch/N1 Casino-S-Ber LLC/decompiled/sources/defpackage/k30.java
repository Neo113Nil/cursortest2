package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class k30 {
    public int a;
    public int b;
    public final mk c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final a h;

    public k30(int i, int i2, a aVar, h9 h9Var) {
        mk mkVar = aVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = mkVar;
        h9Var.a(new mr(this));
        this.h = aVar;
    }

    public final void a() {
        HashSet hashSet = this.e;
        if (this.f) {
            return;
        }
        this.f = true;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h9 h9Var = (h9) obj;
            synchronized (h9Var) {
                try {
                    if (!h9Var.a) {
                        h9Var.a = true;
                        h9Var.c = true;
                        g9 g9Var = h9Var.b;
                        if (g9Var != null) {
                            try {
                                g9Var.onCancel();
                            } catch (Throwable th) {
                                synchronized (h9Var) {
                                    h9Var.c = false;
                                    h9Var.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (h9Var) {
                            h9Var.c = false;
                            h9Var.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (bl.G(2)) {
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
        int h = d30.h(i2);
        mk mkVar = this.c;
        if (h == 0) {
            if (this.a != 1) {
                if (bl.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + mkVar + " mFinalState = " + d30.j(this.a) + " -> " + d30.j(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (h == 1) {
            if (this.a == 1) {
                if (bl.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + mkVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + d30.i(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (h != 2) {
            return;
        }
        if (bl.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + mkVar + " mFinalState = " + d30.j(this.a) + " -> REMOVED. mLifecycleImpact  = " + d30.i(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        a aVar = this.h;
        if (i != 2) {
            if (i == 3) {
                mk mkVar = aVar.c;
                View F = mkVar.F();
                if (bl.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + F.findFocus() + " on view " + F + " for Fragment " + mkVar);
                }
                F.clearFocus();
                return;
            }
            return;
        }
        mk mkVar2 = aVar.c;
        View findFocus = mkVar2.J.findFocus();
        if (findFocus != null) {
            mkVar2.f().k = findFocus;
            if (bl.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + mkVar2);
            }
        }
        View F2 = this.c.F();
        if (F2.getParent() == null) {
            aVar.b();
            F2.setAlpha(0.0f);
        }
        if (F2.getAlpha() == 0.0f && F2.getVisibility() == 0) {
            F2.setVisibility(4);
        }
        kk kkVar = mkVar2.M;
        F2.setAlpha(kkVar == null ? 1.0f : kkVar.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + d30.j(this.a) + "} {mLifecycleImpact = " + d30.i(this.b) + "} {mFragment = " + this.c + "}";
    }
}
