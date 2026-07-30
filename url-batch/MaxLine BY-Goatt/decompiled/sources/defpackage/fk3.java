package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fk3 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ cs3 n;
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ mk3 p;

    public /* synthetic */ fk3(mk3 mk3Var, cs3 cs3Var, Bundle bundle, int i) {
        this.m = i;
        this.n = cs3Var;
        this.o = bundle;
        this.p = mk3Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.m;
        Bundle bundle = this.o;
        cs3 cs3Var = this.n;
        mk3 mk3Var = this.p;
        switch (i) {
            case 0:
                mk3Var.g.B();
                break;
            default:
                mk3Var.g.B();
                break;
        }
        return mk3Var.g.d0(bundle, cs3Var);
    }
}
