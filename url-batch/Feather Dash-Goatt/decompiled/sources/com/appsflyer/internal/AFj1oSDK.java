package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.ry0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFj1oSDK;", "", "", "", "AFAdRevenueData", "()Ljava/util/Map;", "", "getMonetizationNetwork", "()V", "getMediationNetwork", "AFa1ySDK"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public interface AFj1oSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.getMonetizationNetwork;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    /* renamed from: com.appsflyer.internal.AFj1oSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion getMonetizationNetwork = new Companion();

        private Companion() {
        }
    }

    Map<String, Object> AFAdRevenueData();

    void getMediationNetwork();

    void getMonetizationNetwork();
}
