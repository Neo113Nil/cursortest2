package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0273e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f960a;

    /* renamed from: b, reason: collision with root package name */
    public int f961b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0047q f962c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f963e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f964f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f965g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
        this.d = new ArrayList();
        this.f963e = new HashSet();
        this.f964f = false;
        this.f965g = false;
        this.f960a = i;
        this.f961b = i2;
        this.f962c = abstractComponentCallbacksC0047q;
        cVar.a(new C.h(18, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f964f) {
            return;
        }
        this.f964f = true;
        HashSet hashSet = this.f963e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f171a) {
                        cVar.f171a = true;
                        cVar.f173c = true;
                        G.b bVar = cVar.f172b;
                        if (bVar != null) {
                            try {
                                bVar.m();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f173c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f173c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f965g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f965g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0273e.a(i2);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f962c;
        if (a2 == 0) {
            if (this.f960a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0047q + " mFinalState = " + V.j(this.f960a) + " -> " + V.j(i) + ". ");
                }
                this.f960a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f960a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0047q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.i(this.f961b) + " to ADDING.");
                }
                this.f960a = 2;
                this.f961b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0047q + " mFinalState = " + V.j(this.f960a) + " -> REMOVED. mLifecycleImpact  = " + V.i(this.f961b) + " to REMOVING.");
        }
        this.f960a = 1;
        this.f961b = 3;
    }

    public final void d() {
        int i = this.f961b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f944c;
                View D2 = abstractComponentCallbacksC0047q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0047q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f944c;
        View findFocus = abstractComponentCallbacksC0047q2.f1041E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0047q2.f().f1035k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0047q2);
            }
        }
        View D3 = this.f962c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0046p c0046p = abstractComponentCallbacksC0047q2.f1043H;
        D3.setAlpha(c0046p == null ? 1.0f : c0046p.f1034j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.j(this.f960a) + "} {mLifecycleImpact = " + V.i(this.f961b) + "} {mFragment = " + this.f962c + "}";
    }
}
