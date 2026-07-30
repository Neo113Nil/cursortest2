package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ am0 g;

    public /* synthetic */ td(int i, int i2, am0 am0Var) {
        this.e = i;
        this.g = am0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        hl hlVar = (hl) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                vd.a(this.g, hlVar, gb0.P(this.e | 1));
                break;
            default:
                yr1.n(this.e, this.g, hlVar, gb0.P(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ td(am0 am0Var, int i) {
        this.g = am0Var;
        this.e = i;
    }
}
