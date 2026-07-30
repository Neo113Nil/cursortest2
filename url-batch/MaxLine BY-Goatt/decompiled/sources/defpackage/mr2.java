package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mr2 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ nd n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr2(nd ndVar, int i) {
        super(0);
        this.m = i;
        this.n = ndVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                this.n.r = false;
                break;
            default:
                this.n.r = false;
                break;
        }
        return Unit.a;
    }
}
