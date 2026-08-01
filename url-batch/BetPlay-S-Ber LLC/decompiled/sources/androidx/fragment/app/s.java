package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import defpackage.b9;
import defpackage.c9;
import defpackage.o30;
import defpackage.tx;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s {
    public int a;
    public int b;
    public final Fragment c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final q h;

    public s(int i, int i2, q qVar, c9 c9Var) {
        Fragment fragment = qVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = fragment;
        c9Var.a(new tx(this));
        this.h = qVar;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (this.e.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c9 c9Var = (c9) obj;
            synchronized (c9Var) {
                try {
                    if (!c9Var.a) {
                        c9Var.a = true;
                        c9Var.c = true;
                        b9 b9Var = c9Var.b;
                        if (b9Var != null) {
                            try {
                                b9Var.onCancel();
                            } catch (Throwable th) {
                                synchronized (c9Var) {
                                    c9Var.c = false;
                                    c9Var.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c9Var) {
                            c9Var.c = false;
                            c9Var.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (n.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.j();
    }

    public final void c(int i, int i2) {
        int i3 = o30.i(i2);
        Fragment fragment = this.c;
        if (i3 == 0) {
            if (this.a != 1) {
                if (n.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + o30.k(this.a) + " -> " + o30.k(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (this.a == 1) {
                if (n.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + o30.j(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (i3 != 2) {
            return;
        }
        if (n.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + o30.k(this.a) + " -> REMOVED. mLifecycleImpact  = " + o30.j(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        q qVar = this.h;
        if (i != 2) {
            if (i == 3) {
                Fragment fragment = qVar.c;
                View requireView = fragment.requireView();
                if (n.G(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + fragment);
                }
                requireView.clearFocus();
                return;
            }
            return;
        }
        Fragment fragment2 = qVar.c;
        View findFocus = fragment2.mView.findFocus();
        if (findFocus != null) {
            fragment2.setFocusedView(findFocus);
            if (n.G(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment2);
            }
        }
        View requireView2 = this.c.requireView();
        if (requireView2.getParent() == null) {
            qVar.a();
            requireView2.setAlpha(0.0f);
        }
        if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
            requireView2.setVisibility(4);
        }
        requireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + o30.k(this.a) + "} {mLifecycleImpact = " + o30.j(this.b) + "} {mFragment = " + this.c + "}";
    }
}
