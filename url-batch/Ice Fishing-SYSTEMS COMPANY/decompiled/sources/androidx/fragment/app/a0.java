package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r7.AbstractC4979j;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5058a;

    /* renamed from: b, reason: collision with root package name */
    public int f5059b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0485s f5060c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5061d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f5062e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5064g;

    /* renamed from: h, reason: collision with root package name */
    public final V f5065h;

    public a0(int i, int i4, V v6, K.f fVar) {
        CL.o(i, "finalState");
        CL.o(i4, "lifecycleImpact");
        AbstractComponentCallbacksC0485s fragment = v6.f5019c;
        kotlin.jvm.internal.h.d(fragment, "fragmentStateManager.fragment");
        CL.o(i, "finalState");
        CL.o(i4, "lifecycleImpact");
        kotlin.jvm.internal.h.e(fragment, "fragment");
        this.f5058a = i;
        this.f5059b = i4;
        this.f5060c = fragment;
        this.f5061d = new ArrayList();
        this.f5062e = new LinkedHashSet();
        fVar.a(new K.e() { // from class: androidx.fragment.app.b0
            @Override // K.e
            public final void a() {
                a0 this$0 = a0.this;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                this$0.a();
            }
        });
        this.f5065h = v6;
    }

    public final void a() {
        if (this.f5063f) {
            return;
        }
        this.f5063f = true;
        LinkedHashSet linkedHashSet = this.f5062e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        for (K.f fVar : AbstractC4979j.U(linkedHashSet)) {
            synchronized (fVar) {
                try {
                    if (!fVar.f1474a) {
                        fVar.f1474a = true;
                        fVar.f1476c = true;
                        K.e eVar = fVar.f1475b;
                        if (eVar != null) {
                            try {
                                eVar.a();
                            } catch (Throwable th) {
                                synchronized (fVar) {
                                    fVar.f1476c = false;
                                    fVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (fVar) {
                            fVar.f1476c = false;
                            fVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void b() {
        if (!this.f5064g) {
            if (N.E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f5064g = true;
            Iterator it = this.f5061d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f5065h.k();
    }

    public final void c(int i, int i4) {
        CL.o(i, "finalState");
        CL.o(i4, "lifecycleImpact");
        int d2 = AbstractC5088e.d(i4);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5060c;
        if (d2 == 0) {
            if (this.f5058a != 1) {
                if (N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0485s + " mFinalState = " + D.y.w(this.f5058a) + " -> " + D.y.w(i) + '.');
                }
                this.f5058a = i;
                return;
            }
            return;
        }
        if (d2 == 1) {
            if (this.f5058a == 1) {
                if (N.E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0485s + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + D.y.v(this.f5059b) + " to ADDING.");
                }
                this.f5058a = 2;
                this.f5059b = 2;
                return;
            }
            return;
        }
        if (d2 != 2) {
            return;
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0485s + " mFinalState = " + D.y.w(this.f5058a) + " -> REMOVED. mLifecycleImpact  = " + D.y.v(this.f5059b) + " to REMOVING.");
        }
        this.f5058a = 1;
        this.f5059b = 3;
    }

    public final void d() {
        int i = this.f5059b;
        V v6 = this.f5065h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = v6.f5019c;
                kotlin.jvm.internal.h.d(abstractComponentCallbacksC0485s, "fragmentStateManager.fragment");
                View z8 = abstractComponentCallbacksC0485s.z();
                if (N.E(2)) {
                    Log.v("FragmentManager", "Clearing focus " + z8.findFocus() + " on view " + z8 + " for Fragment " + abstractComponentCallbacksC0485s);
                }
                z8.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = v6.f5019c;
        kotlin.jvm.internal.h.d(abstractComponentCallbacksC0485s2, "fragmentStateManager.fragment");
        View findFocus = abstractComponentCallbacksC0485s2.f5162X.findFocus();
        if (findFocus != null) {
            abstractComponentCallbacksC0485s2.b().f5138k = findFocus;
            if (N.E(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0485s2);
            }
        }
        View z9 = this.f5060c.z();
        if (z9.getParent() == null) {
            v6.b();
            z9.setAlpha(0.0f);
        }
        if (z9.getAlpha() == 0.0f && z9.getVisibility() == 0) {
            z9.setVisibility(4);
        }
        r rVar = abstractComponentCallbacksC0485s2.f5165n0;
        z9.setAlpha(rVar == null ? 1.0f : rVar.f5137j);
    }

    public final String toString() {
        StringBuilder m8 = CL.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        m8.append(D.y.w(this.f5058a));
        m8.append(" lifecycleImpact = ");
        m8.append(D.y.v(this.f5059b));
        m8.append(" fragment = ");
        m8.append(this.f5060c);
        m8.append('}');
        return m8.toString();
    }
}
