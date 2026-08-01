package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0285e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f986a;

    /* renamed from: b, reason: collision with root package name */
    public int f987b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f988c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f989e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f990f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f991g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f970c;
        this.d = new ArrayList();
        this.f989e = new HashSet();
        this.f990f = false;
        this.f991g = false;
        this.f986a = i;
        this.f987b = i2;
        this.f988c = abstractComponentCallbacksC0048q;
        cVar.a(new C.g(18, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f990f) {
            return;
        }
        this.f990f = true;
        HashSet hashSet = this.f989e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f240a) {
                        cVar.f240a = true;
                        cVar.f242c = true;
                        G.b bVar = cVar.f241b;
                        if (bVar != null) {
                            try {
                                bVar.m();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f242c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f242c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f991g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f991g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0285e.a(i2);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f988c;
        if (a2 == 0) {
            if (this.f986a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + T0.c.j(this.f986a) + " -> " + T0.c.j(i) + ". ");
                }
                this.f986a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f986a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + T0.c.i(this.f987b) + " to ADDING.");
                }
                this.f986a = 2;
                this.f987b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + T0.c.j(this.f986a) + " -> REMOVED. mLifecycleImpact  = " + T0.c.i(this.f987b) + " to REMOVING.");
        }
        this.f986a = 1;
        this.f987b = 3;
    }

    public final void d() {
        int i = this.f987b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f970c;
                View D2 = abstractComponentCallbacksC0048q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0048q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f970c;
        View findFocus = abstractComponentCallbacksC0048q2.f1067E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0048q2.f().f1061k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q2);
            }
        }
        View D3 = this.f988c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q2.f1069H;
        D3.setAlpha(c0047p == null ? 1.0f : c0047p.f1060j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + T0.c.j(this.f986a) + "} {mLifecycleImpact = " + T0.c.i(this.f987b) + "} {mFragment = " + this.f988c + "}";
    }
}
