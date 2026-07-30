package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qz extends d0 {
    public final lz1 u;
    public boolean v;

    public qz(re reVar) {
        super(reVar);
        this.u = ij2.j(null);
    }

    @Override // defpackage.d0
    public final void b(int i, a00 a00Var) {
        a00Var.Z(420213850);
        int i2 = (a00Var.h(this) ? 4 : 2) | i;
        if (a00Var.P(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) this.u.getValue();
            if (function2 == null) {
                a00Var.X(-1238798753);
            } else {
                a00Var.X(98586082);
                function2.invoke(a00Var, 0);
            }
            a00Var.q(false);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c0(i, 5, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return qz.class.getName();
    }

    @Override // defpackage.d0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.v;
    }

    public final void setContent(Function2<? super a00, ? super Integer, Unit> function2) {
        this.v = true;
        this.u.setValue(function2);
        if (isAttachedToWindow()) {
            if (this.p != null || isAttachedToWindow()) {
                d();
            } else {
                lh.g("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
