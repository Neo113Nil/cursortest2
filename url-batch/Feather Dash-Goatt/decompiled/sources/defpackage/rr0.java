package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rr0 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ o10 e;
    public final /* synthetic */ o10 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ z6 i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr0(o10 o10Var, o10 o10Var2, Object obj, int i, z6 z6Var, int i2) {
        super(1);
        this.d = i2;
        this.e = o10Var;
        this.g = o10Var2;
        this.j = obj;
        this.h = i;
        this.i = z6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        z6 z6Var = this.i;
        int i2 = this.h;
        Object obj2 = this.j;
        o10 o10Var = this.g;
        o10 o10Var2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hd hdVar = (hd) obj;
                if (o10Var2 != ((e10) ((d4) op.J(o10Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean J = t80.J(o10Var, (o10) obj2, i2, z6Var);
                Boolean valueOf = Boolean.valueOf(J);
                if (J || !hdVar.a()) {
                    return valueOf;
                }
                return null;
            default:
                hd hdVar2 = (hd) obj;
                if (o10Var2 != ((e10) ((d4) op.J(o10Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean L = gb0.L(i2, z6Var, o10Var, (s11) obj2);
                Boolean valueOf2 = Boolean.valueOf(L);
                if (L || !hdVar2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
