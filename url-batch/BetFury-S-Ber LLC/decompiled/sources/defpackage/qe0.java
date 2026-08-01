package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qe0 {
    public se0 a;
    public re0 b;
    public final a c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final e h;

    public qe0(se0 se0Var, re0 re0Var, e eVar, ma maVar) {
        a aVar = eVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = se0Var;
        this.b = re0Var;
        this.c = aVar;
        maVar.a(new kz(this));
        this.h = eVar;
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
            ma maVar = (ma) obj;
            synchronized (maVar) {
                try {
                    if (!maVar.a) {
                        maVar.a = true;
                        maVar.c = true;
                        la laVar = maVar.b;
                        if (laVar != null) {
                            try {
                                laVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (maVar) {
                                    maVar.c = false;
                                    maVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (maVar) {
                            maVar.c = false;
                            maVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (c.G(2)) {
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

    public final void c(se0 se0Var, re0 re0Var) {
        int i = pe0.b[re0Var.ordinal()];
        a aVar = this.c;
        if (i == 1) {
            if (this.a == se0.REMOVED) {
                if (c.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.a = se0.VISIBLE;
                this.b = re0.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (c.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aVar + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.a = se0.REMOVED;
            this.b = re0.REMOVING;
            return;
        }
        if (i == 3 && this.a != se0.REMOVED) {
            if (c.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + aVar + " mFinalState = " + this.a + " -> " + se0Var + ". ");
            }
            this.a = se0Var;
        }
    }

    public final void d() {
        re0 re0Var = this.b;
        re0 re0Var2 = re0.ADDING;
        e eVar = this.h;
        if (re0Var != re0Var2) {
            if (re0Var == re0.REMOVING) {
                a aVar = eVar.c;
                View F = aVar.F();
                if (c.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + F.findFocus() + " on view " + F + " for Fragment " + aVar);
                }
                F.clearFocus();
                return;
            }
            return;
        }
        a aVar2 = eVar.c;
        View findFocus = aVar2.J.findFocus();
        if (findFocus != null) {
            aVar2.f().k = findFocus;
            if (c.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + aVar2);
            }
        }
        View F2 = this.c.F();
        if (F2.getParent() == null) {
            eVar.b();
            F2.setAlpha(0.0f);
        }
        if (F2.getAlpha() == 0.0f && F2.getVisibility() == 0) {
            F2.setVisibility(4);
        }
        vp vpVar = aVar2.M;
        F2.setAlpha(vpVar == null ? 1.0f : vpVar.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.a + "} {mLifecycleImpact = " + this.b + "} {mFragment = " + this.c + "}";
    }
}
