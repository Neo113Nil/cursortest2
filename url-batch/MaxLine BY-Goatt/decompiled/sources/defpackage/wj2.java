package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class wj2 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ zn1 n;

    public /* synthetic */ wj2(zn1 zn1Var, int i) {
        this.m = i;
        this.n = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        zn1 zn1Var = this.n;
        switch (i) {
            case 0:
                zn1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                zn1Var.setValue(Boolean.valueOf(!((Boolean) zn1Var.getValue()).booleanValue()));
                break;
            case 2:
                zn1Var.setValue(Boolean.FALSE);
                break;
            default:
                zn1Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
