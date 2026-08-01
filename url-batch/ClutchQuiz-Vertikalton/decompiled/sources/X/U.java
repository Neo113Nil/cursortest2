package X;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0317e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1012a;

    /* renamed from: b, reason: collision with root package name */
    public int f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f1014c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1015e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1016f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1017g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
        this.d = new ArrayList();
        this.f1015e = new HashSet();
        this.f1016f = false;
        this.f1017g = false;
        this.f1012a = i;
        this.f1013b = i2;
        this.f1014c = abstractComponentCallbacksC0048q;
        cVar.a(new A0.h(16, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1016f) {
            return;
        }
        this.f1016f = true;
        HashSet hashSet = this.f1015e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f204a) {
                        cVar.f204a = true;
                        cVar.f206c = true;
                        G.b bVar = cVar.f205b;
                        if (bVar != null) {
                            try {
                                bVar.l();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f206c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f206c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1017g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1017g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0317e.a(i2);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1014c;
        if (a2 == 0) {
            if (this.f1012a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + V.j(this.f1012a) + " -> " + V.j(i) + ". ");
                }
                this.f1012a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1012a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.i(this.f1013b) + " to ADDING.");
                }
                this.f1012a = 2;
                this.f1013b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + V.j(this.f1012a) + " -> REMOVED. mLifecycleImpact  = " + V.i(this.f1013b) + " to REMOVING.");
        }
        this.f1012a = 1;
        this.f1013b = 3;
    }

    public final void d() {
        int i = this.f1013b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f996c;
                View D2 = abstractComponentCallbacksC0048q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0048q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f996c;
        View findFocus = abstractComponentCallbacksC0048q2.f1093E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0048q2.f().f1087k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q2);
            }
        }
        View D3 = this.f1014c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q2.f1095H;
        D3.setAlpha(c0047p == null ? 1.0f : c0047p.f1086j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.j(this.f1012a) + "} {mLifecycleImpact = " + V.i(this.f1013b) + "} {mFragment = " + this.f1014c + "}";
    }
}
