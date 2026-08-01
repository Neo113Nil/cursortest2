package Y;

import G1.AbstractC0001b;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0309e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1365a;

    /* renamed from: b, reason: collision with root package name */
    public int f1366b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0050q f1367c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1368e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1369f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1370g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
        this.d = new ArrayList();
        this.f1368e = new HashSet();
        this.f1369f = false;
        this.f1370g = false;
        this.f1365a = i;
        this.f1366b = i2;
        this.f1367c = abstractComponentCallbacksC0050q;
        cVar.a(new A0.c(21, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1369f) {
            return;
        }
        this.f1369f = true;
        HashSet hashSet = this.f1368e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f284a) {
                        cVar.f284a = true;
                        cVar.f286c = true;
                        G.b bVar = cVar.f285b;
                        if (bVar != null) {
                            try {
                                bVar.j();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f286c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f286c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1370g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1370g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0309e.a(i2);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1367c;
        if (a2 == 0) {
            if (this.f1365a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050q + " mFinalState = " + AbstractC0001b.m(this.f1365a) + " -> " + AbstractC0001b.m(i) + ". ");
                }
                this.f1365a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1365a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0001b.l(this.f1366b) + " to ADDING.");
                }
                this.f1365a = 2;
                this.f1366b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050q + " mFinalState = " + AbstractC0001b.m(this.f1365a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0001b.l(this.f1366b) + " to REMOVING.");
        }
        this.f1365a = 1;
        this.f1366b = 3;
    }

    public final void d() {
        int i = this.f1366b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1349c;
                View D2 = abstractComponentCallbacksC0050q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0050q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1349c;
        View findFocus = abstractComponentCallbacksC0050q2.f1446E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0050q2.f().f1440k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0050q2);
            }
        }
        View D3 = this.f1367c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(RecyclerView.f1937A0);
        }
        if (D3.getAlpha() == RecyclerView.f1937A0 && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0049p c0049p = abstractComponentCallbacksC0050q2.f1448H;
        D3.setAlpha(c0049p == null ? 1.0f : c0049p.f1439j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC0001b.m(this.f1365a) + "} {mLifecycleImpact = " + AbstractC0001b.l(this.f1366b) + "} {mFragment = " + this.f1367c + "}";
    }
}
