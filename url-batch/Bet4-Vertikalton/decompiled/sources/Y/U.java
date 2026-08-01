package Y;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.AbstractC0287e;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f1006a;

    /* renamed from: b, reason: collision with root package name */
    public int f1007b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0051q f1008c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f1009e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1010f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1011g;
    public final O h;

    public U(int i, int i2, O o2, G.c cVar) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
        this.d = new ArrayList();
        this.f1009e = new HashSet();
        this.f1010f = false;
        this.f1011g = false;
        this.f1006a = i;
        this.f1007b = i2;
        this.f1008c = abstractComponentCallbacksC0051q;
        cVar.a(new C.g(19, this));
        this.h = o2;
    }

    public final void a() {
        if (this.f1010f) {
            return;
        }
        this.f1010f = true;
        HashSet hashSet = this.f1009e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            G.c cVar = (G.c) it.next();
            synchronized (cVar) {
                try {
                    if (!cVar.f227a) {
                        cVar.f227a = true;
                        cVar.f229c = true;
                        G.b bVar = cVar.f228b;
                        if (bVar != null) {
                            try {
                                bVar.l();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f229c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f229c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f1011g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1011g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        int a2 = AbstractC0287e.a(i2);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1008c;
        if (a2 == 0) {
            if (this.f1006a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0051q + " mFinalState = " + V.k(this.f1006a) + " -> " + V.k(i) + ". ");
                }
                this.f1006a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f1006a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0051q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + V.j(this.f1007b) + " to ADDING.");
                }
                this.f1006a = 2;
                this.f1007b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0051q + " mFinalState = " + V.k(this.f1006a) + " -> REMOVED. mLifecycleImpact  = " + V.j(this.f1007b) + " to REMOVING.");
        }
        this.f1006a = 1;
        this.f1007b = 3;
    }

    public final void d() {
        int i = this.f1007b;
        O o2 = this.h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = o2.f990c;
                View D2 = abstractComponentCallbacksC0051q.D();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + D2.findFocus() + " on view " + D2 + " for Fragment " + abstractComponentCallbacksC0051q);
                }
                D2.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f990c;
        View findFocus = abstractComponentCallbacksC0051q2.f1087E.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0051q2.f().f1081k = findFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0051q2);
            }
        }
        View D3 = this.f1008c.D();
        if (D3.getParent() == null) {
            o2.b();
            D3.setAlpha(RecyclerView.f1530C0);
        }
        if (D3.getAlpha() == RecyclerView.f1530C0 && D3.getVisibility() == 0) {
            D3.setVisibility(4);
        }
        C0050p c0050p = abstractComponentCallbacksC0051q2.f1089H;
        D3.setAlpha(c0050p == null ? 1.0f : c0050p.f1080j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + V.k(this.f1006a) + "} {mLifecycleImpact = " + V.j(this.f1007b) + "} {mFragment = " + this.f1008c + "}";
    }
}
