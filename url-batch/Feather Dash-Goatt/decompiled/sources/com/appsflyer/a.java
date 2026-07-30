package com.appsflyer;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFg1hSDK;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFLogger.getMediationNetwork((AFg1hSDK[]) obj);
                break;
            case 1:
                AFLogger.getMonetizationNetwork((AFg1hSDK[]) obj);
                break;
            default:
                AFLogger.getMediationNetwork((Function1) obj);
                break;
        }
    }
}
