package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ei0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ am0 g;
    public final /* synthetic */ hk h;
    public final /* synthetic */ int i;

    public /* synthetic */ ei0(int i, am0 am0Var, hk hkVar, int i2, int i3) {
        this.d = i3;
        this.e = i;
        this.g = am0Var;
        this.h = hkVar;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.i;
        hk hkVar = this.h;
        am0 am0Var = this.g;
        int i3 = this.e;
        hl hlVar = (hl) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                la0.o(i3, am0Var, hkVar, hlVar, gb0.P(i2 | 1));
                break;
            default:
                op.h(i3, am0Var, hkVar, hlVar, gb0.P(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
