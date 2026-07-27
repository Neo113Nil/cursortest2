package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class Z extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f9740e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S.n f9741i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1063d f9742j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f9743k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f9744l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f9745m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9746n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f9747o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, S.n nVar, C1063d c1063d, long j4, r rVar, boolean z4, boolean z5, float f4, int i2) {
        super(0);
        this.f9739d = i2;
        this.f9740e = a0Var;
        this.f9741i = nVar;
        this.f9742j = c1063d;
        this.f9743k = j4;
        this.f9744l = rVar;
        this.f9745m = z4;
        this.f9746n = z5;
        this.f9747o = f4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9739d) {
            case 0:
                S.n e4 = AbstractC1065f.e(this.f9741i, this.f9742j.a());
                boolean z4 = this.f9746n;
                a0 a0Var = this.f9740e;
                C1063d c1063d = this.f9742j;
                long j4 = this.f9743k;
                r rVar = this.f9744l;
                boolean z5 = this.f9745m;
                if (e4 == null) {
                    a0Var.T0(c1063d, j4, rVar, z5, z4);
                } else {
                    a0Var.getClass();
                    float f4 = this.f9747o;
                    rVar.h(e4, f4, z4, new Z(a0Var, e4, c1063d, j4, rVar, z5, z4, f4, 0));
                }
                break;
            default:
                this.f9740e.e1(AbstractC1065f.e(this.f9741i, this.f9742j.a()), this.f9742j, this.f9743k, this.f9744l, this.f9745m, this.f9746n, this.f9747o);
                break;
        }
        return Unit.f7487a;
    }
}
