package D;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class B1 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1 f1195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f1196e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1197i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1198j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1199k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(C1 c12, S.o oVar, float f4, long j4, int i2) {
        super(2);
        this.f1195d = c12;
        this.f1196e = oVar;
        this.f1197i = f4;
        this.f1198j = j4;
        this.f1199k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f1195d.a(this.f1196e, this.f1197i, this.f1198j, (C0216p) obj, C0192d.U(this.f1199k | 1));
        return Unit.f7487a;
    }
}
