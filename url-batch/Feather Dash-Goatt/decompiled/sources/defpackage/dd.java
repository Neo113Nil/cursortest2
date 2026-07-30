package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd implements Function0 {
    public final /* synthetic */ int d;

    public /* synthetic */ dd(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ke1 ke1Var = fd.a;
                return null;
            case 1:
                return oi.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 2:
                ke1 ke1Var2 = oi.a;
                return Boolean.TRUE;
            case 3:
                ke1 ke1Var3 = sl.a;
                return null;
            case 4:
                kl.b("Unexpected call to default provider");
                throw new kc0();
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                zl zlVar = r70.a;
                return tp.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                ke1 ke1Var4 = j90.a;
                return null;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new wf0(0, 0);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 9:
                ke1 ke1Var5 = ii0.a;
                return j50.y;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case RequestError.STOP_TRACKING /* 11 */:
                zl zlVar2 = ki0.a;
                return null;
            case 12:
                ke1 ke1Var6 = mk0.a;
                return Boolean.FALSE;
            case 13:
                return om0.a;
            case 14:
                return new au0();
            case 15:
                return new y31();
            case 16:
                return new r51(new LinkedHashMap());
            case 17:
                ke1 ke1Var7 = v51.a;
                return null;
            case 18:
                return new h71(0);
            case 19:
                zl zlVar3 = f81.a;
                return null;
            case 20:
                return new y91();
            case 21:
                return new bt(0.0f);
            case 22:
                return ik1.a;
            case 23:
                return oh1.b;
            default:
                return new fk1(null, 32767);
        }
    }
}
