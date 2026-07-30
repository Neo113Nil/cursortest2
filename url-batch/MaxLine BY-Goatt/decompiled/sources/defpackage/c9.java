package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c9 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(long j, int i) {
        super(1);
        this.m = i;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                ir irVar = (ir) obj;
                float d = ql2.d(irVar.m.f()) / 2.0f;
                return irVar.a(new b9(d, iv1.r(irVar, d), new mo(this.n, 5)));
            default:
                ((sh2) obj).d(lh2.a, new kh2(xw0.m, this.n, 2, true));
                return Unit.a;
        }
    }
}
