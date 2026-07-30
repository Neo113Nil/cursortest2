package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class gr0 implements vd2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr0 b;

    public /* synthetic */ gr0(kr0 kr0Var, int i) {
        this.a = i;
        this.b = kr0Var;
    }

    @Override // defpackage.vd2
    public final Bundle a() {
        int i = this.a;
        kr0 kr0Var = this.b;
        switch (i) {
            case 0:
                kr0Var.markFragmentsCreated();
                kr0Var.mFragmentLifecycleRegistry.f(yc1.ON_STOP);
                return new Bundle();
            default:
                return xx.a(kr0Var);
        }
    }
}
