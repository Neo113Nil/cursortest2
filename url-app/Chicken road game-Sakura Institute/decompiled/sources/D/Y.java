package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class Y extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f1678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f1679e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1680i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1681j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(S.o oVar, float f4, long j4, int i2) {
        super(2);
        this.f1678d = oVar;
        this.f1679e = f4;
        this.f1680i = j4;
        this.f1681j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f1681j | 1);
        long j4 = this.f1680i;
        W0.e(this.f1678d, this.f1679e, j4, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
