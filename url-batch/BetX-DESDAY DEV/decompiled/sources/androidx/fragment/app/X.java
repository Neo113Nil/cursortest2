package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0319e;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public int f1294a;

    /* renamed from: b, reason: collision with root package name */
    public int f1295b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0060q f1296c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1297d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1298e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1299f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1300g;
    public final S h;

    public X(int i, int i2, S s2, G.d dVar) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
        this.f1297d = new ArrayList();
        this.f1298e = new HashSet();
        this.f1299f = false;
        this.f1300g = false;
        this.f1294a = i;
        this.f1295b = i2;
        this.f1296c = abstractComponentCallbacksC0060q;
        dVar.a(new B0.d(16, this));
        this.h = s2;
    }

    public final void a() {
        if (this.f1299f) {
            return;
        }
        this.f1299f = true;
        HashSet hashSet = this.f1298e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.d dVar = (G.d) it.next();
            synchronized (dVar) {
                try {
                    if (!dVar.f196a) {
                        dVar.f196a = true;
                        dVar.f198c = true;
                        G.c cVar = dVar.f197b;
                        if (cVar != null) {
                            try {
                                cVar.l();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f198c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f198c = false;
                            dVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1300g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1300g = true;
            Iterator it = this.f1297d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0319e.a(i2);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1296c;
        if (a2 == 0) {
            if (this.f1294a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0060q + " mFinalState = " + X0.e.j(this.f1294a) + " -> " + X0.e.j(i) + ". ");
                }
                this.f1294a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1294a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0060q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + X0.e.i(this.f1295b) + " to ADDING.");
                }
                this.f1294a = 2;
                this.f1295b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0060q + " mFinalState = " + X0.e.j(this.f1294a) + " -> REMOVED. mLifecycleImpact  = " + X0.e.i(this.f1295b) + " to REMOVING.");
        }
        this.f1294a = 1;
        this.f1295b = 3;
    }

    public final void d() {
        int i = this.f1295b;
        S s2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = s2.f1275c;
                View z2 = abstractComponentCallbacksC0060q.z();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + z2.findFocus() + " on view " + z2 + " for Fragment " + abstractComponentCallbacksC0060q);
                }
                z2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = s2.f1275c;
        View findFocus = abstractComponentCallbacksC0060q2.f1382E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0060q2.b().f1376k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0060q2);
            }
        }
        View z3 = this.f1296c.z();
        if (z3.getParent() == null) {
            s2.b();
            z3.setAlpha(0.0f);
        }
        if (z3.getAlpha() == 0.0f && z3.getVisibility() == 0) {
            z3.setVisibility(4);
        }
        C0059p c0059p = abstractComponentCallbacksC0060q2.f1384H;
        z3.setAlpha(c0059p == null ? 1.0f : c0059p.f1375j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + X0.e.j(this.f1294a) + "} {mLifecycleImpact = " + X0.e.i(this.f1295b) + "} {mFragment = " + this.f1296c + "}";
    }
}
