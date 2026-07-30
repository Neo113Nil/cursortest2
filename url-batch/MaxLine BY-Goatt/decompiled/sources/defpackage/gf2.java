package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gf2 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ hf2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf2(hf2 hf2Var, int i) {
        super(0);
        this.m = i;
        this.n = hf2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        hf2 hf2Var = this.n;
        switch (i) {
            case 0:
                return Float.valueOf(hf2Var.A.a.h());
            default:
                return Float.valueOf(hf2Var.A.d.h());
        }
    }
}
