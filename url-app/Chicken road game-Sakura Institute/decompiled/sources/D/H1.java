package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class H1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f1313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1314e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1315i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2.c f1316j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f1317k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O.a f1318l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1319m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(S.o oVar, long j4, long j5, L2.c cVar, Function2 function2, O.a aVar, int i2) {
        super(2);
        this.f1313d = oVar;
        this.f1314e = j4;
        this.f1315i = j5;
        this.f1316j = cVar;
        this.f1317k = function2;
        this.f1318l = aVar;
        this.f1319m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1319m | 1);
        O.a aVar = this.f1318l;
        long j4 = this.f1315i;
        L2.c cVar = this.f1316j;
        I1.b(this.f1313d, this.f1314e, j4, cVar, this.f1317k, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
