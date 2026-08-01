package Y;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0290e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1033a;

    /* renamed from: b, reason: collision with root package name */
    public int f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0051q f1035c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1036e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1037f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1038g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
        this.d = new ArrayList();
        this.f1036e = new HashSet();
        this.f1037f = false;
        this.f1038g = false;
        this.f1033a = i;
        this.f1034b = i2;
        this.f1035c = abstractComponentCallbacksC0051q;
        cVar.a(new C.g(18, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1037f) {
            return;
        }
        this.f1037f = true;
        HashSet hashSet = this.f1036e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f244a) {
                        cVar.f244a = true;
                        cVar.f246c = true;
                        G.b bVar = cVar.f245b;
                        if (bVar != null) {
                            try {
                                bVar.l();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f246c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f246c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1038g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1038g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0290e.a(i2);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1035c;
        if (a2 == 0) {
            if (this.f1033a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0051q + " mFinalState = " + V.k(this.f1033a) + " -> " + V.k(i) + ". ");
                }
                this.f1033a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1033a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0051q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.j(this.f1034b) + " to ADDING.");
                }
                this.f1033a = 2;
                this.f1034b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0051q + " mFinalState = " + V.k(this.f1033a) + " -> REMOVED. mLifecycleImpact  = " + V.j(this.f1034b) + " to REMOVING.");
        }
        this.f1033a = 1;
        this.f1034b = 3;
    }

    public final void d() {
        int i = this.f1034b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f1017c;
                View D2 = abstractComponentCallbacksC0051q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0051q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f1017c;
        View findFocus = abstractComponentCallbacksC0051q2.f1114E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0051q2.f().f1108k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0051q2);
            }
        }
        View D3 = this.f1035c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(RecyclerView.f1559A0);
        }
        if (D3.getAlpha() == RecyclerView.f1559A0 && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0050p c0050p = abstractComponentCallbacksC0051q2.f1116H;
        D3.setAlpha(c0050p == null ? 1.0f : c0050p.f1107j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.k(this.f1033a) + "} {mLifecycleImpact = " + V.j(this.f1034b) + "} {mFragment = " + this.f1035c + "}";
    }
}
