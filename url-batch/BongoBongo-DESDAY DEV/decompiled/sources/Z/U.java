package Z;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import r.AbstractC0290e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1081a;

    /* renamed from: b, reason: collision with root package name */
    public int f1082b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0050q f1083c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1084e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1085f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1086g;

    /* renamed from: h, reason: collision with root package name */
    public final O f1087h;

    public U(int i, int i2, O o2, H.c cVar) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
        this.d = new ArrayList();
        this.f1084e = new HashSet();
        this.f1085f = false;
        this.f1086g = false;
        this.f1081a = i;
        this.f1082b = i2;
        this.f1083c = abstractComponentCallbacksC0050q;
        cVar.a(new D.g(19, this));
        this.f1087h = o2;
    }

    public final void a() {
        if (this.f1085f) {
            return;
        }
        this.f1085f = true;
        HashSet hashSet = this.f1084e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            H.c cVar = (H.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f288a) {
                        cVar.f288a = true;
                        cVar.f290c = true;
                        H.b bVar = cVar.f289b;
                        if (bVar != null) {
                            try {
                                bVar.m();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f290c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f290c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1086g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1086g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f1087h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0290e.a(i2);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1083c;
        if (a2 == 0) {
            if (this.f1081a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050q + " mFinalState = " + V.k(this.f1081a) + " -> " + V.k(i) + ". ");
                }
                this.f1081a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1081a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.j(this.f1082b) + " to ADDING.");
                }
                this.f1081a = 2;
                this.f1082b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0050q + " mFinalState = " + V.k(this.f1081a) + " -> REMOVED. mLifecycleImpact  = " + V.j(this.f1082b) + " to REMOVING.");
        }
        this.f1081a = 1;
        this.f1082b = 3;
    }

    public final void d() {
        int i = this.f1082b;
        O o2 = this.f1087h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = o2.f1064c;
                View D2 = abstractComponentCallbacksC0050q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0050q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1064c;
        View findFocus = abstractComponentCallbacksC0050q2.f1166E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0050q2.f().f1160k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0050q2);
            }
        }
        View D3 = this.f1083c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(RecyclerView.A0);
        }
        if (D3.getAlpha() == RecyclerView.A0 && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0049p c0049p = abstractComponentCallbacksC0050q2.f1168H;
        D3.setAlpha(c0049p == null ? 1.0f : c0049p.f1159j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.k(this.f1081a) + "} {mLifecycleImpact = " + V.j(this.f1082b) + "} {mFragment = " + this.f1083c + "}";
    }
}
