package androidx.fragment.app;

import E.AbstractC0005f;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4723a;

    /* renamed from: b, reason: collision with root package name */
    public int f4724b;

    /* renamed from: c, reason: collision with root package name */
    public final F f4725c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4726d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4728f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4729g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4730h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4731i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4732j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4733k;

    /* renamed from: l, reason: collision with root package name */
    public final m0 f4734l;

    public B0(int i4, int i5, m0 m0Var) {
        AbstractC0005f.t(i4, "finalState");
        AbstractC0005f.t(i5, "lifecycleImpact");
        F fragment = m0Var.f4925c;
        kotlin.jvm.internal.i.d(fragment, "fragmentStateManager.fragment");
        AbstractC0005f.t(i4, "finalState");
        AbstractC0005f.t(i5, "lifecycleImpact");
        kotlin.jvm.internal.i.e(fragment, "fragment");
        this.f4723a = i4;
        this.f4724b = i5;
        this.f4725c = fragment;
        this.f4726d = new ArrayList();
        this.f4731i = true;
        ArrayList arrayList = new ArrayList();
        this.f4732j = arrayList;
        this.f4733k = arrayList;
        this.f4734l = m0Var;
    }

    public final void a(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f4730h = false;
        if (this.f4727e) {
            return;
        }
        this.f4727e = true;
        if (this.f4732j.isEmpty()) {
            b();
            return;
        }
        for (A0 a02 : d3.i.n0(this.f4733k)) {
            a02.getClass();
            if (!a02.f4717b) {
                a02.b(container);
            }
            a02.f4717b = true;
        }
    }

    public final void b() {
        this.f4730h = false;
        if (!this.f4728f) {
            if (f0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4728f = true;
            ArrayList arrayList = this.f4726d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((Runnable) obj).run();
            }
        }
        this.f4725c.mTransitioning = false;
        this.f4734l.k();
    }

    public final void c(A0 effect) {
        kotlin.jvm.internal.i.e(effect, "effect");
        ArrayList arrayList = this.f4732j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i4, int i5) {
        AbstractC0005f.t(i4, "finalState");
        AbstractC0005f.t(i5, "lifecycleImpact");
        int b4 = M.j.b(i5);
        F f4 = this.f4725c;
        if (b4 == 0) {
            if (this.f4723a != 1) {
                if (f0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + f4 + " mFinalState = " + AbstractC0005f.B(this.f4723a) + " -> " + AbstractC0005f.B(i4) + '.');
                }
                this.f4723a = i4;
                return;
            }
            return;
        }
        if (b4 == 1) {
            if (this.f4723a == 1) {
                if (f0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + f4 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC0005f.A(this.f4724b) + " to ADDING.");
                }
                this.f4723a = 2;
                this.f4724b = 2;
                this.f4731i = true;
                return;
            }
            return;
        }
        if (b4 != 2) {
            return;
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + f4 + " mFinalState = " + AbstractC0005f.B(this.f4723a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC0005f.A(this.f4724b) + " to REMOVING.");
        }
        this.f4723a = 1;
        this.f4724b = 3;
        this.f4731i = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + AbstractC0005f.B(this.f4723a) + " lifecycleImpact = " + AbstractC0005f.A(this.f4724b) + " fragment = " + this.f4725c + '}';
    }
}
