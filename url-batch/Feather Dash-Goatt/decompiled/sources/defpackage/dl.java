package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dl implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ hl e;

    public /* synthetic */ dl(hl hlVar, xm0 xm0Var) {
        this.d = 0;
        this.e = hlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        hl hlVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw null;
            case 1:
                return hlVar.m();
            default:
                return hlVar.m();
        }
    }

    public /* synthetic */ dl(int i, hl hlVar) {
        this.d = i;
        this.e = hlVar;
    }
}
