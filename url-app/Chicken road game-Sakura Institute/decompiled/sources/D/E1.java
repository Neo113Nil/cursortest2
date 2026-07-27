package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class E1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f1229e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1231j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ L2.c f1232k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function2 f1233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O.a f1234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1235n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(int i2, S.o oVar, long j4, long j5, L2.c cVar, Function2 function2, O.a aVar, int i4) {
        super(2);
        this.f1228d = i2;
        this.f1229e = oVar;
        this.f1230i = j4;
        this.f1231j = j5;
        this.f1232k = cVar;
        this.f1233l = function2;
        this.f1234m = aVar;
        this.f1235n = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1235n | 1);
        O.a aVar = this.f1234m;
        long j4 = this.f1231j;
        L2.c cVar = this.f1232k;
        I1.a(this.f1228d, this.f1229e, this.f1230i, j4, cVar, this.f1233l, aVar, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
