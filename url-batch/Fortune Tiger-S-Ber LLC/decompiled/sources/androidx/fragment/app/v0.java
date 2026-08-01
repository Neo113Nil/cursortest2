package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f542a;

    /* renamed from: b, reason: collision with root package name */
    public int f543b;
    public final u c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f544d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f546f;
    public boolean g;
    public final q0 h;

    public v0(int i4, int i5, q0 q0Var, g0.b bVar) {
        u uVar = q0Var.c;
        this.f544d = new ArrayList();
        this.f545e = new HashSet();
        this.f546f = false;
        this.g = false;
        this.f542a = i4;
        this.f543b = i5;
        this.c = uVar;
        bVar.a(new a2.e(5, this));
        this.h = q0Var;
    }

    public final void a() {
        HashSet hashSet = this.f545e;
        if (this.f546f) {
            return;
        }
        this.f546f = true;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            g0.b bVar = (g0.b) obj;
            synchronized (bVar) {
                try {
                    if (!bVar.f1753a) {
                        bVar.f1753a = true;
                        bVar.c = true;
                        g0.a aVar = bVar.f1754b;
                        if (aVar != null) {
                            try {
                                aVar.onCancel();
                            } catch (Throwable th) {
                                synchronized (bVar) {
                                    bVar.c = false;
                                    bVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (bVar) {
                            bVar.c = false;
                            bVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (k0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.f544d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i4, int i5) {
        int a4 = q.e.a(i5);
        u uVar = this.c;
        if (a4 == 0) {
            if (this.f542a != 1) {
                if (k0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + w0.k(this.f542a) + " -> " + w0.k(i4) + ". ");
                }
                this.f542a = i4;
                return;
            }
            return;
        }
        if (a4 == 1) {
            if (this.f542a == 1) {
                if (k0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + w0.j(this.f543b) + " to ADDING.");
                }
                this.f542a = 2;
                this.f543b = 2;
                return;
            }
            return;
        }
        if (a4 != 2) {
            return;
        }
        if (k0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + uVar + " mFinalState = " + w0.k(this.f542a) + " -> REMOVED. mLifecycleImpact  = " + w0.j(this.f543b) + " to REMOVING.");
        }
        this.f542a = 1;
        this.f543b = 3;
    }

    public final void d() {
        int i4 = this.f543b;
        q0 q0Var = this.h;
        if (i4 != 2) {
            if (i4 == 3) {
                u uVar = q0Var.c;
                View D = uVar.D();
                if (k0.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + D.findFocus() + " on view " + D + " for Fragment " + uVar);
                }
                D.clearFocus();
                return;
            }
            return;
        }
        u uVar2 = q0Var.c;
        View findFocus = uVar2.J.findFocus();
        if (findFocus != null) {
            uVar2.d().f516k = findFocus;
            if (k0.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar2);
            }
        }
        View D2 = this.c.D();
        if (D2.getParent() == null) {
            q0Var.b();
            D2.setAlpha(0.0f);
        }
        if (D2.getAlpha() == 0.0f && D2.getVisibility() == 0) {
            D2.setVisibility(4);
        }
        s sVar = uVar2.M;
        D2.setAlpha(sVar == null ? 1.0f : sVar.f515j);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + w0.k(this.f542a) + "} {mLifecycleImpact = " + w0.j(this.f543b) + "} {mFragment = " + this.c + "}";
    }
}
