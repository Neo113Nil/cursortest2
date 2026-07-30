package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class av2 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ dv2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av2(dv2 dv2Var, int i) {
        super(0);
        this.m = i;
        this.n = dv2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        dv2 dv2Var = this.n;
        switch (i) {
            case 0:
                return Boolean.valueOf(dv2Var.a.h() > 0.0f);
            default:
                return Boolean.valueOf(dv2Var.a.h() < dv2Var.b.h());
        }
    }
}
