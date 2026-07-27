package I0;

import M2.p;
import Z.AbstractC0319p;
import Z.N;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r0.L;
import r0.P;

/* loaded from: classes.dex */
public final class d extends p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f3358e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3359i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, long j4, Object obj) {
        super(0);
        this.f3357d = i2;
        this.f3359i = obj;
        this.f3358e = j4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3357d) {
            case 0:
                return ((N) ((AbstractC0319p) this.f3359i)).b(this.f3358e);
            default:
                P M02 = ((L) this.f3359i).a().M0();
                Intrinsics.c(M02);
                M02.a(this.f3358e);
                return Unit.f7487a;
        }
    }
}
