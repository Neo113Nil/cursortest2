package G0;

import P.Q;
import P.Z;
import P.c0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z6.C1081v;
import z6.I;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, Object obj) {
        super(1);
        this.f817d = i2;
        this.f818e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f817d) {
            case 0:
                Throwable th = (Throwable) obj;
                m mVar = (m) this.f818e;
                if (th == null) {
                    if (!mVar.f819d.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    mVar.f819d.cancel(true);
                } else {
                    R0.k kVar = mVar.f819d;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    kVar.j(th);
                }
                return Unit.f6114a;
            case 1:
                ((O1.a) this.f818e).cancel(false);
                return Unit.f6114a;
            case 2:
                Throwable th2 = (Throwable) obj;
                Q q4 = (Q) this.f818e;
                if (th2 != null) {
                    q4.f2024p.w(new c0(th2));
                }
                if (q4.f2026r.f2427e != R5.C.f2403a) {
                    ((Z) q4.f2026r.getValue()).close();
                }
                return Unit.f6114a;
            case 3:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                x6.f fVar = (x6.f) this.f818e;
                sb.append(fVar.f8433e[intValue]);
                sb.append(": ");
                sb.append(fVar.f8434f[intValue].b());
                return sb.toString();
            case 4:
                x6.a buildSerialDescriptor = (x6.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                kotlin.collections.A a7 = ((I) this.f818e).f8743b;
                buildSerialDescriptor.getClass();
                Intrinsics.checkNotNullParameter(a7, "<set-?>");
                buildSerialDescriptor.f8414b = a7;
                return Unit.f6114a;
            default:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                C1081v c1081v = (C1081v) this.f818e;
                sb2.append(c1081v.f8819c[intValue2]);
                sb2.append(": ");
                sb2.append(c1081v.i(intValue2).b());
                return sb2.toString();
        }
    }
}
