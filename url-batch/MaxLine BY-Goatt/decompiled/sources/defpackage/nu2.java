package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nu2 extends o81 implements Function2 {
    public final /* synthetic */ long m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu2(long j, Function2 function2, int i) {
        super(2);
        this.m = j;
        this.n = function2;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(this.o | 1);
        pu2.c(this.m, this.n, (a00) obj, R);
        return Unit.a;
    }
}
