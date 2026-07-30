package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sx implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ hk e;

    public /* synthetic */ sx(hk hkVar, int i, int i2) {
        this.d = i2;
        this.e = hkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        hk hkVar = this.e;
        hl hlVar = (hl) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                yr1.o(hkVar, hlVar, gb0.P(7));
                break;
            case 1:
                ka0.a(hkVar, hlVar, gb0.P(7));
                break;
            default:
                yr1.l(hkVar, hlVar, gb0.P(7));
                break;
        }
        return Unit.a;
    }
}
