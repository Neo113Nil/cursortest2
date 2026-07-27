package V;

import M2.A;
import M2.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.C0815m;
import o.T;
import r0.p0;
import r0.q0;
import w2.C1294c;

/* loaded from: classes.dex */
public final class c extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f4140e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(A a4, int i2) {
        super(1);
        this.f4139d = i2;
        this.f4140e = a4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4;
        switch (this.f4139d) {
            case 0:
                if (!((e) obj).f3990s) {
                    return p0.f9829e;
                }
                A a4 = this.f4140e;
                a4.f3576d = a4.f3576d;
                return p0.f9828d;
            case 1:
                if (!((C0815m) obj).f7917u) {
                    return p0.f9828d;
                }
                this.f4140e.f3576d = false;
                return p0.f9830i;
            default:
                q0 q0Var = (q0) obj;
                A a5 = this.f4140e;
                if (!a5.f3576d) {
                    Intrinsics.d(q0Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (!((T) q0Var).f8714t) {
                        z4 = false;
                        a5.f3576d = z4;
                        return Boolean.valueOf(!z4);
                    }
                }
                z4 = true;
                a5.f3576d = z4;
                return Boolean.valueOf(!z4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C1294c c1294c, e eVar, A a4) {
        super(1);
        this.f4139d = 0;
        this.f4140e = a4;
    }
}
