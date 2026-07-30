package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rb1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ q80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb1(q80 q80Var, int i) {
        super(0);
        this.m = i;
        this.n = q80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.m;
        q80 q80Var = this.n;
        switch (i) {
        }
        return Integer.valueOf(q80Var.m());
    }
}
