package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0317e;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public int f1293a;

    /* renamed from: b, reason: collision with root package name */
    public int f1294b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0060q f1295c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1296d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1297e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1298f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1299g;
    public final S h;

    public X(int i, int i2, S s2, G.d dVar) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1274c;
        this.f1296d = new ArrayList();
        this.f1297e = new HashSet();
        this.f1298f = false;
        this.f1299g = false;
        this.f1293a = i;
        this.f1294b = i2;
        this.f1295c = abstractComponentCallbacksC0060q;
        dVar.a(new B0.d(17, this));
        this.h = s2;
    }

    public final void a() {
        if (this.f1298f) {
            return;
        }
        this.f1298f = true;
        HashSet hashSet = this.f1297e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.d dVar = (G.d) it.next();
            synchronized (dVar) {
                try {
                    if (!dVar.f197a) {
                        dVar.f197a = true;
                        dVar.f199c = true;
                        G.c cVar = dVar.f198b;
                        if (cVar != null) {
                            try {
                                cVar.k();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f199c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f199c = false;
                            dVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1299g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1299g = true;
            Iterator it = this.f1296d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0317e.a(i2);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1295c;
        if (a2 == 0) {
            if (this.f1293a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0060q + " mFinalState = " + X0.e.j(this.f1293a) + " -> " + X0.e.j(i) + ". ");
                }
                this.f1293a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1293a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0060q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + X0.e.i(this.f1294b) + " to ADDING.");
                }
                this.f1293a = 2;
                this.f1294b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0060q + " mFinalState = " + X0.e.j(this.f1293a) + " -> REMOVED. mLifecycleImpact  = " + X0.e.i(this.f1294b) + " to REMOVING.");
        }
        this.f1293a = 1;
        this.f1294b = 3;
    }

    public final void d() {
        int i = this.f1294b;
        S s2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1274c;
                View z2 = abstractComponentCallbacksC0060q.z();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + z2.findFocus() + " on view " + z2 + " for Fragment " + abstractComponentCallbacksC0060q);
                }
                z2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = s2.f1274c;
        View findFocus = abstractComponentCallbacksC0060q2.f1381E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0060q2.b().f1375k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0060q2);
            }
        }
        View z3 = this.f1295c.z();
        if (z3.getParent() == null) {
            s2.b();
            z3.setAlpha(0.0f);
        }
        if (z3.getAlpha() == 0.0f && z3.getVisibility() == 0) {
            z3.setVisibility(4);
        }
        C0059p c0059p = abstractComponentCallbacksC0060q2.f1383H;
        z3.setAlpha(c0059p == null ? 1.0f : c0059p.f1374j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + X0.e.j(this.f1293a) + "} {mLifecycleImpact = " + X0.e.i(this.f1294b) + "} {mFragment = " + this.f1295c + "}";
    }
}
