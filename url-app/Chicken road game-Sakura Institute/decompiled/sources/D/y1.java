package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2115e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O.a f2117j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2118k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(long j4, long j5, boolean z4, O.a aVar, int i2) {
        super(2);
        this.f2114d = j4;
        this.f2115e = j5;
        this.f2116i = z4;
        this.f2117j = aVar;
        this.f2118k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f2118k | 1);
        O.a aVar = this.f2117j;
        z1.c(this.f2114d, this.f2115e, this.f2116i, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
