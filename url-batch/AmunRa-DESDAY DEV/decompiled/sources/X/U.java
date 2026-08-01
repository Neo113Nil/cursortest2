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
    public int f917a;

    /* renamed from: b, reason: collision with root package name */
    public int f918b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f919c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f920e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f921f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f922g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
        this.d = new ArrayList();
        this.f920e = new HashSet();
        this.f921f = false;
        this.f922g = false;
        this.f917a = i;
        this.f918b = i2;
        this.f919c = abstractComponentCallbacksC0048q;
        cVar.a(new C.g(18, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f921f) {
            return;
        }
        this.f921f = true;
        HashSet hashSet = this.f920e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f180a) {
                        cVar.f180a = true;
                        cVar.f182c = true;
                        G.b bVar = cVar.f181b;
                        if (bVar != null) {
                            try {
                                bVar.k();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f182c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f182c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f922g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f922g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0285e.a(i2);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f919c;
        if (a2 == 0) {
            if (this.f917a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + V.j(this.f917a) + " -> " + V.j(i) + ". ");
                }
                this.f917a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f917a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.i(this.f918b) + " to ADDING.");
                }
                this.f917a = 2;
                this.f918b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0048q + " mFinalState = " + V.j(this.f917a) + " -> REMOVED. mLifecycleImpact  = " + V.i(this.f918b) + " to REMOVING.");
        }
        this.f917a = 1;
        this.f918b = 3;
    }

    public final void d() {
        int i = this.f918b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f901c;
                View D2 = abstractComponentCallbacksC0048q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0048q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f901c;
        View findFocus = abstractComponentCallbacksC0048q2.f995E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0048q2.f().f989k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q2);
            }
        }
        View D3 = this.f919c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q2.f997H;
        D3.setAlpha(c0047p == null ? 1.0f : c0047p.f988j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.j(this.f917a) + "} {mLifecycleImpact = " + V.i(this.f918b) + "} {mFragment = " + this.f919c + "}";
    }
}
