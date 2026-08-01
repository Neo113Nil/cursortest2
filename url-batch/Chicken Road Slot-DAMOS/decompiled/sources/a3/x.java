package a3;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends d1.k implements i1.p, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver C;
    public final w D = new w(this, 0);
    public final w E = new w(this, 1);

    @Override // d1.k
    public final void A() {
        ViewTreeObserver viewTreeObserver = c2.k.w(this).getViewTreeObserver();
        this.C = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // d1.k
    public final void B() {
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.C = null;
        c2.k.w(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final i1.t I() {
        boolean z10;
        if (!this.f3305d.B) {
            z1.a.b("visitLocalDescendants called on an unattached node");
        }
        d1.k kVar = this.f3305d;
        if ((kVar.f3308r & 1024) != 0) {
            boolean z11 = false;
            for (d1.k kVar2 = kVar.f3310t; kVar2 != null; kVar2 = kVar2.f3310t) {
                if ((kVar2.f3307i & 1024) != 0) {
                    d1.k kVar3 = kVar2;
                    o0.e eVar = null;
                    while (kVar3 != null) {
                        if (kVar3 instanceof i1.t) {
                            i1.t tVar = (i1.t) kVar3;
                            if (z11) {
                                return tVar;
                            }
                            z10 = false;
                            z11 = true;
                        } else {
                            z10 = true;
                        }
                        if (z10 && (kVar3.f3307i & 1024) != 0 && (kVar3 instanceof c2.j)) {
                            int i3 = 0;
                            for (d1.k kVar4 = ((c2.j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                if ((kVar4.f3307i & 1024) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar3 = kVar4;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar3 != null) {
                                            eVar.b(kVar3);
                                            kVar3 = null;
                                        }
                                        eVar.b(kVar4);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar3 = c2.k.e(eVar);
                    }
                }
            }
        }
        i0.l("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // i1.p
    public final void l(i1.m mVar) {
        mVar.d(false);
        mVar.a(this.D);
        mVar.b(this.E);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        boolean z11;
        if (c2.k.u(this).B == null) {
            return;
        }
        View c10 = o.c(this);
        i1.h focusOwner = c2.k.v(this).getFocusOwner();
        d2.v v10 = c2.k.v(this);
        if (view != null && !view.equals(v10)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == c10.getParent()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (view2 != null && !view2.equals(v10)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == c10.getParent()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z10 && z11) {
            return;
        }
        if (!z11) {
            if (z10 && I().M().a()) {
                ((i1.k) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        i1.t I = I();
        int ordinal = I.M().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return;
        }
        if (ordinal == 3) {
            k7.e.F(I);
        } else {
            a2.r.p();
        }
    }
}
