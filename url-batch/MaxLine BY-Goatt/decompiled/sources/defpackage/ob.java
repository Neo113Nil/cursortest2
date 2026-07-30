package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ob extends o81 implements Function1 {
    public final /* synthetic */ long m;
    public final /* synthetic */ Function0 n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(long j, Function0 function0, boolean z) {
        super(1);
        this.m = j;
        this.n = function0;
        this.o = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ir irVar = (ir) obj;
        return irVar.a(new nb(this.n, this.o, iv1.r(irVar, ql2.d(irVar.m.f()) / 2.0f), new mo(this.m, 5)));
    }
}
