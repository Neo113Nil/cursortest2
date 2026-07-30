package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x30 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ zn1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x30(zn1 zn1Var, int i) {
        super(0);
        this.m = i;
        this.n = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        zn1 zn1Var = this.n;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) zn1Var.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                return new da1((Function1) zn1Var.getValue());
            case 2:
                return (mb1) ((Function0) zn1Var.getValue()).invoke();
            default:
                return (qa2) zn1Var.getValue();
        }
    }
}
