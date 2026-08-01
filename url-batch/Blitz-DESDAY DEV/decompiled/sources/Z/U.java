package Z;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.AbstractC0267e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1095a;

    /* renamed from: b, reason: collision with root package name */
    public int f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0047q f1097c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1098e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1099f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1100g;
    public final O h;

    public U(int i, int i2, O o2, I.c cVar) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
        this.d = new ArrayList();
        this.f1098e = new HashSet();
        this.f1099f = false;
        this.f1100g = false;
        this.f1095a = i;
        this.f1096b = i2;
        this.f1097c = abstractComponentCallbacksC0047q;
        cVar.a(new E.g(19, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1099f) {
            return;
        }
        this.f1099f = true;
        HashSet hashSet = this.f1098e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            I.c cVar = (I.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f328a) {
                        cVar.f328a = true;
                        cVar.f330c = true;
                        I.b bVar = cVar.f329b;
                        if (bVar != null) {
                            try {
                                bVar.l();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f330c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f330c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1100g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1100g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0267e.a(i2);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1097c;
        if (a2 == 0) {
            if (this.f1095a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0047q + " mFinalState = " + X0.a.k(this.f1095a) + " -> " + X0.a.k(i) + ". ");
                }
                this.f1095a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1095a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0047q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + X0.a.j(this.f1096b) + " to ADDING.");
                }
                this.f1095a = 2;
                this.f1096b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0047q + " mFinalState = " + X0.a.k(this.f1095a) + " -> REMOVED. mLifecycleImpact  = " + X0.a.j(this.f1096b) + " to REMOVING.");
        }
        this.f1095a = 1;
        this.f1096b = 3;
    }

    public final void d() {
        int i = this.f1096b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = o2.f1079c;
                View D2 = abstractComponentCallbacksC0047q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0047q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f1079c;
        View findFocus = abstractComponentCallbacksC0047q2.f1176E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0047q2.e().f1170k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0047q2);
            }
        }
        View D3 = this.f1097c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(0.0f);
        }
        if (D3.getAlpha() == 0.0f && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0046p c0046p = abstractComponentCallbacksC0047q2.H;
        D3.setAlpha(c0046p == null ? 1.0f : c0046p.f1169j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + X0.a.k(this.f1095a) + "} {mLifecycleImpact = " + X0.a.j(this.f1096b) + "} {mFragment = " + this.f1097c + "}";
    }
}
