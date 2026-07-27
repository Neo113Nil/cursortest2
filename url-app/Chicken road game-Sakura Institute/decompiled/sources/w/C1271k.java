package w;

import P0.C0259a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: w.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271k extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.a0 f11240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1271k(A.a0 a0Var, int i2) {
        super(1);
        this.f11239d = i2;
        this.f11240e = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11239d) {
            case 0:
                return new C0259a(7, this.f11240e);
            default:
                long j4 = ((Y.c) obj).f4372a;
                this.f11240e.o();
                return Unit.f7487a;
        }
    }
}
