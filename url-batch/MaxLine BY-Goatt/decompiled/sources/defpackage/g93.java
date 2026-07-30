package defpackage;

import com.majelw.libystne.R;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g93 implements c00, fd1 {
    public final t7 m;
    public final k00 n;
    public boolean o;
    public ad1 p;
    public Function2 q = yy.a;

    public g93(t7 t7Var, k00 k00Var) {
        this.m = t7Var;
        this.n = k00Var;
    }

    public final void a() {
        if (!this.o) {
            this.o = true;
            this.m.getView().setTag(R.id.wrapped_composition_tag, null);
            ad1 ad1Var = this.p;
            if (ad1Var != null) {
                ad1Var.c(this);
            }
        }
        this.n.l();
    }

    public final void c(Function2 function2) {
        this.m.setOnViewTreeOwnersAvailable(new ih2(14, this, function2));
    }

    @Override // defpackage.fd1
    public final void o(id1 id1Var, yc1 yc1Var) {
        if (yc1Var == yc1.ON_DESTROY) {
            a();
        } else {
            if (yc1Var != yc1.ON_CREATE || this.o) {
                return;
            }
            c(this.q);
        }
    }
}
