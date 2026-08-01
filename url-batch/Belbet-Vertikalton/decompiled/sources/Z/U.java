package Z;

import G1.AbstractC0001b;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.AbstractC0380e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1512a;

    /* renamed from: b, reason: collision with root package name */
    public int f1513b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0053q f1514c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1515d;
    public final HashSet e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1516f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1517g;

    /* renamed from: h, reason: collision with root package name */
    public final O f1518h;

    public U(int i, int i2, O o2, I.c cVar) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
        this.f1515d = new ArrayList();
        this.e = new HashSet();
        this.f1516f = false;
        this.f1517g = false;
        this.f1512a = i;
        this.f1513b = i2;
        this.f1514c = abstractComponentCallbacksC0053q;
        cVar.a(new C1.d(19, this));
        this.f1518h = o2;
    }

    public final void a() {
        if (this.f1516f) {
            return;
        }
        this.f1516f = true;
        HashSet hashSet = this.e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            I.c cVar = (I.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f572a) {
                        cVar.f572a = true;
                        cVar.f574c = true;
                        I.b bVar = cVar.f573b;
                        if (bVar != null) {
                            try {
                                bVar.k();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f574c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f574c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1517g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1517g = true;
            Iterator it = this.f1515d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1518h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0380e.a(i2);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1514c;
        if (a2 == 0) {
            if (this.f1512a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0053q + " mFinalState = " + AbstractC0001b.m(this.f1512a) + " -> " + AbstractC0001b.m(i) + ". ");
                }
                this.f1512a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1512a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0053q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0001b.l(this.f1513b) + " to ADDING.");
                }
                this.f1512a = 2;
                this.f1513b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0053q + " mFinalState = " + AbstractC0001b.m(this.f1512a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0001b.l(this.f1513b) + " to REMOVING.");
        }
        this.f1512a = 1;
        this.f1513b = 3;
    }

    public final void d() {
        int i = this.f1513b;
        O o2 = this.f1518h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = o2.f1494c;
                View D2 = abstractComponentCallbacksC0053q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0053q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = o2.f1494c;
        View findFocus = abstractComponentCallbacksC0053q2.f1595E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0053q2.f().f1589k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0053q2);
            }
        }
        View D3 = this.f1514c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0052p c0052p = abstractComponentCallbacksC0053q2.H;
        D3.setAlpha(c0052p == null ? 1.0f : c0052p.j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0001b.m(this.f1512a) + "} {mLifecycleImpact = " + AbstractC0001b.l(this.f1513b) + "} {mFragment = " + this.f1514c + "}";
    }
}
