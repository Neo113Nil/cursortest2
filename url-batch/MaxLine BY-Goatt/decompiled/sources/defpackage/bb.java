package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bb extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ n12 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb(n12 n12Var, int i) {
        super(1);
        this.m = i;
        this.n = n12Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        n12 n12Var = this.n;
        switch (i) {
            case 0:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
            case 1:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
            case 2:
                m12.g((m12) obj, n12Var, 0, 0);
                break;
            case 3:
                m12.g((m12) obj, n12Var, 0, 0);
                break;
            case 4:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
            case 5:
                m12 m12Var = (m12) obj;
                if (m12Var.c() == u81.m || m12Var.e() == 0) {
                    m12.a(m12Var, n12Var);
                    n12Var.i0(s31.c(0L, n12Var.q), 0.0f, null);
                } else {
                    m12.a(m12Var, n12Var);
                    n12Var.i0(s31.c((m12Var.e() - n12Var.m) << 32, n12Var.q), 0.0f, null);
                }
                break;
            case 6:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                m12.j((m12) obj, n12Var, 0, 0);
                break;
            case 8:
                m12.g((m12) obj, n12Var, 0, 0);
                break;
            case 9:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
            case 10:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
            case 11:
                m12.g((m12) obj, n12Var, 0, 0);
                break;
            default:
                m12.i((m12) obj, n12Var, 0, 0);
                break;
        }
        return Unit.a;
    }
}
