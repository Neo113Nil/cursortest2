package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fh2 extends o81 implements Function0 {
    public final /* synthetic */ gn m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(gn gnVar, int i) {
        super(0);
        this.m = gnVar;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(((bw2) this.m.e).e(this.n));
    }
}
