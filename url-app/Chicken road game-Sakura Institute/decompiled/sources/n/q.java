package n;

import A.C0028y;
import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f8544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f8545e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.o f8546i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f8547j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0028y f8548k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8549l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar, Function0 function0, S.o oVar, c cVar, C0028y c0028y, int i2) {
        super(2);
        this.f8544d = hVar;
        this.f8545e = function0;
        this.f8546i = oVar;
        this.f8547j = cVar;
        this.f8548k = c0028y;
        this.f8549l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f8549l | 1);
        C0028y c0028y = this.f8548k;
        Function0 function0 = this.f8545e;
        S.o oVar = this.f8546i;
        r.d(this.f8544d, function0, oVar, this.f8547j, c0028y, (C0216p) obj, U3);
        return Unit.f7487a;
    }
}
