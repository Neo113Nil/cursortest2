package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class Y extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f9732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.n f9733e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1063d f9734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f9735j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f9736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f9737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f9738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, S.n nVar, C1063d c1063d, long j4, r rVar, boolean z4, boolean z5) {
        super(0);
        this.f9732d = a0Var;
        this.f9733e = nVar;
        this.f9734i = c1063d;
        this.f9735j = j4;
        this.f9736k = rVar;
        this.f9737l = z4;
        this.f9738m = z5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f9732d.R0(AbstractC1065f.e(this.f9733e, this.f9734i.a()), this.f9734i, this.f9735j, this.f9736k, this.f9737l, this.f9738m);
        return Unit.f7487a;
    }
}
