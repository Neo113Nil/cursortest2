package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f560a;

    /* renamed from: b, reason: collision with root package name */
    public int f561b;

    /* renamed from: c, reason: collision with root package name */
    public final u f562c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f563e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f564f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f565g;

    /* renamed from: h, reason: collision with root package name */
    public final q0 f566h;

    public v0(int i, int i4, q0 q0Var, j0.c cVar) {
        u uVar = q0Var.f511c;
        this.d = new ArrayList();
        this.f563e = new HashSet();
        this.f564f = false;
        this.f565g = false;
        this.f560a = i;
        this.f561b = i4;
        this.f562c = uVar;
        cVar.a(new a0.a(6, this));
        this.f566h = q0Var;
    }

    public final void a() {
        if (this.f564f) {
            return;
        }
        this.f564f = true;
        if (this.f563e.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.f563e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j0.c cVar = (j0.c) obj;
            synchronized (cVar) {
                try {
                    if (!cVar.f1886a) {
                        cVar.f1886a = true;
                        cVar.f1888c = true;
                        j0.b bVar = cVar.f1887b;
                        if (bVar != null) {
                            try {
                                bVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (cVar) {
                                    cVar.f1888c = false;
                                    cVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (cVar) {
                            cVar.f1888c = false;
                            cVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f565g) {
            if (k0.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f565g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f566h.k();
    }

    public final void c(int i, int i4) {
        int a2 = t.e.a(i4);
        u uVar = this.f562c;
        if (a2 == 0) {
            if (this.f560a != 1) {
                if (k0.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + w0.i(this.f560a) + " -> " + w0.i(i) + ". ");
                }
                this.f560a = i;
                return;
            }
            return;
        }
        if (a2 == 1) {
            if (this.f560a == 1) {
                if (k0.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + w0.h(this.f561b) + " to ADDING.");
                }
                this.f560a = 2;
                this.f561b = 2;
                return;
            }
            return;
        }
        if (a2 != 2) {
            return;
        }
        if (k0.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + w0.i(this.f560a) + " -> REMOVED. mLifecycleImpact  = " + w0.h(this.f561b) + " to REMOVING.");
        }
        this.f560a = 1;
        this.f561b = 3;
    }

    public final void d() {
        int i = this.f561b;
        q0 q0Var = this.f566h;
        if (i != 2) {
            if (i == 3) {
                u uVar = q0Var.f511c;
                View D = uVar.D();
                if (k0.E(2)) {
                    Log.v("FragmentManager", "Clearing focus " + D.findFocus() + " on view " + D + " for Fragment " + uVar);
                }
                D.clearFocus();
                return;
            }
            return;
        }
        u uVar2 = q0Var.f511c;
        View findFocus = uVar2.J.findFocus();
        if (findFocus != null) {
            uVar2.f().f529k = findFocus;
            if (k0.E(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar2);
            }
        }
        View D2 = this.f562c.D();
        if (D2.getParent() == null) {
            q0Var.b();
            D2.setAlpha(0.0f);
        }
        if (D2.getAlpha() == 0.0f && D2.getVisibility() == 0) {
            D2.setVisibility(4);
        }
        s sVar = uVar2.M;
        D2.setAlpha(sVar == null ? 1.0f : sVar.f528j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + w0.i(this.f560a) + "} {mLifecycleImpact = " + w0.h(this.f561b) + "} {mFragment = " + this.f562c + "}";
    }
}
