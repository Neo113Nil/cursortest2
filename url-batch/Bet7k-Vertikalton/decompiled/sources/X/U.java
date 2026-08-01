package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0290e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f874a;

    /* renamed from: b, reason: collision with root package name */
    public int f875b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f876c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f877e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f878f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f879g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
        this.d = new ArrayList();
        this.f877e = new HashSet();
        this.f878f = false;
        this.f879g = false;
        this.f874a = i;
        this.f875b = i2;
        this.f876c = abstractComponentCallbacksC0048q;
        cVar.a(new B0.d(19, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f878f) {
            return;
        }
        this.f878f = true;
        HashSet hashSet = this.f877e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f187a) {
                        cVar.f187a = true;
                        cVar.f189c = true;
                        G.b bVar = cVar.f188b;
                        if (bVar != null) {
                            try {
                                bVar.i();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f189c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f189c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f879g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f879g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0290e.a(i2);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f876c;
        if (a2 == 0) {
            if (this.f874a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + V.j(this.f874a) + " -> " + V.j(i) + ". ");
                }
                this.f874a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f874a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.i(this.f875b) + " to ADDING.");
                }
                this.f874a = 2;
                this.f875b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + V.j(this.f874a) + " -> REMOVED. mLifecycleImpact  = " + V.i(this.f875b) + " to REMOVING.");
        }
        this.f874a = 1;
        this.f875b = 3;
    }

    public final void d() {
        int i = this.f875b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f858c;
                View D2 = abstractComponentCallbacksC0048q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0048q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f858c;
        View findFocus = abstractComponentCallbacksC0048q2.f955E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0048q2.f().f949k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q2);
            }
        }
        View D3 = this.f876c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q2.f957H;
        D3.setAlpha(c0047p == null ? 1.0f : c0047p.f948j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.j(this.f874a) + "} {mLifecycleImpact = " + V.i(this.f875b) + "} {mFragment = " + this.f876c + "}";
    }
}
