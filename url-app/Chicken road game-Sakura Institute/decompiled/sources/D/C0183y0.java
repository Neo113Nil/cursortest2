package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183y0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f2107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2108e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2109i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2110j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q.m0 f2111k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O.a f2112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2113m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183y0(S.o oVar, long j4, long j5, float f4, q.m0 m0Var, O.a aVar, int i2) {
        super(2);
        this.f2107d = oVar;
        this.f2108e = j4;
        this.f2109i = j5;
        this.f2110j = f4;
        this.f2111k = m0Var;
        this.f2112l = aVar;
        this.f2113m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f2113m | 1);
        O.a aVar = this.f2112l;
        long j4 = this.f2109i;
        float f4 = this.f2110j;
        H0.a(this.f2107d, this.f2108e, j4, f4, this.f2111k, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
