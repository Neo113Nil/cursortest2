package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class im1 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ jm1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im1(jm1 jm1Var, int i) {
        super(1);
        this.d = i;
        this.e = jm1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        jm1 jm1Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                jm1Var.d = true;
                jm1Var.f.invoke();
                return Unit.a;
            default:
                hu huVar = (hu) obj;
                q50 q50Var = jm1Var.b;
                float f = jm1Var.k;
                float f2 = jm1Var.l;
                i8 v = huVar.v();
                long i2 = v.i();
                v.g().k();
                try {
                    ((s40) v.e).x(f, f2, 0L);
                    q50Var.a(huVar);
                    qy0.s(v, i2);
                    return Unit.a;
                } catch (Throwable th) {
                    qy0.s(v, i2);
                    throw th;
                }
        }
    }
}
