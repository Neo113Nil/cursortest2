package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f667a;

    /* renamed from: b, reason: collision with root package name */
    public int f668b;

    /* renamed from: c, reason: collision with root package name */
    public final u f669c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f670e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f671f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f672g;
    public final q0 h;

    public v0(int i, int i4, q0 q0Var, j0.e eVar) {
        u uVar = q0Var.f623c;
        this.d = new ArrayList();
        this.f670e = new HashSet();
        this.f671f = false;
        this.f672g = false;
        this.f667a = i;
        this.f668b = i4;
        this.f669c = uVar;
        eVar.a(new a0.a(5, this));
        this.h = q0Var;
    }

    public final void a() {
        if (this.f671f) {
            return;
        }
        this.f671f = true;
        if (this.f670e.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.f670e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j0.e eVar = (j0.e) obj;
            synchronized (eVar) {
                try {
                    if (!eVar.f2130a) {
                        eVar.f2130a = true;
                        eVar.f2132c = true;
                        j0.d dVar = eVar.f2131b;
                        if (dVar != null) {
                            try {
                                dVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (eVar) {
                                    eVar.f2132c = false;
                                    eVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (eVar) {
                            eVar.f2132c = false;
                            eVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f672g) {
            if (k0.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f672g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i4) {
        int a5 = t.e.a(i4);
        u uVar = this.f669c;
        if (a5 == 0) {
            if (this.f667a != 1) {
                if (k0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + a4.b.l(this.f667a) + " -> " + a4.b.l(i) + ". ");
                }
                this.f667a = i;
                return;
            }
            return;
        }
        if (a5 == 1) {
            if (this.f667a == 1) {
                if (k0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a4.b.k(this.f668b) + " to ADDING.");
                }
                this.f667a = 2;
                this.f668b = 2;
                return;
            }
            return;
        }
        if (a5 != 2) {
            return;
        }
        if (k0.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + a4.b.l(this.f667a) + " -> REMOVED. mLifecycleImpact  = " + a4.b.k(this.f668b) + " to REMOVING.");
        }
        this.f667a = 1;
        this.f668b = 3;
    }

    public final void d() {
        int i = this.f668b;
        q0 q0Var = this.h;
        if (i != 2) {
            if (i == 3) {
                u uVar = q0Var.f623c;
                View D = uVar.D();
                if (k0.H(2)) {
                    Log.v("FragmentManager", "Clearing focus " + D.findFocus() + " on view " + D + " for Fragment " + uVar);
                }
                D.clearFocus();
                return;
            }
            return;
        }
        u uVar2 = q0Var.f623c;
        View findFocus = uVar2.J.findFocus();
        if (findFocus != null) {
            uVar2.d().f639k = findFocus;
            if (k0.H(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar2);
            }
        }
        View D2 = this.f669c.D();
        if (D2.getParent() == null) {
            q0Var.b();
            D2.setAlpha(0.0f);
        }
        if (D2.getAlpha() == 0.0f && D2.getVisibility() == 0) {
            D2.setVisibility(4);
        }
        s sVar = uVar2.M;
        D2.setAlpha(sVar == null ? 1.0f : sVar.f638j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + a4.b.l(this.f667a) + "} {mLifecycleImpact = " + a4.b.k(this.f668b) + "} {mFragment = " + this.f669c + "}";
    }
}
