package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import defpackage.ae0;
import defpackage.ee0;
import defpackage.i31;
import defpackage.j31;
import defpackage.k31;
import defpackage.pc0;
import defpackage.ry0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u000b\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\r8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFf1oSDK;", "", "Lcom/appsflyer/internal/AFc1kSDK;", "p0", "Lcom/appsflyer/internal/AFf1pSDK;", "p1", "Lcom/appsflyer/internal/AFc1gSDK;", "p2", "<init>", "(Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFf1pSDK;Lcom/appsflyer/internal/AFc1gSDK;)V", "", "getRevenue", "()J", "", "getMonetizationNetwork", "()Z", "Lcom/appsflyer/internal/AFc1kSDK;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFf1pSDK;", "getMediationNetwork", "Lcom/appsflyer/internal/AFc1gSDK;", "AFAdRevenueData", "Lae0;", "AFa1zSDK"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFf1oSDK {
    private static final long component4 = 86400;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final ae0 getRevenue;
    private final AFf1pSDK getCurrencyIso4217Code;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final AFc1gSDK AFAdRevenueData;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final ae0 getMediationNetwork;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final AFc1kSDK getMonetizationNetwork;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1oSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends pc0 implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1oSDK.this.getMonetizationNetwork.getMonetizationNetwork("com.appsflyer.rc.sandbox")));
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFf1oSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends pc0 implements Function0<Boolean> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1oSDK.this.getMonetizationNetwork.getMonetizationNetwork("com.appsflyer.rc.staging")));
        }
    }

    public AFf1oSDK(AFc1kSDK aFc1kSDK, AFf1pSDK aFf1pSDK, AFc1gSDK aFc1gSDK) {
        aFc1kSDK.getClass();
        aFf1pSDK.getClass();
        aFc1gSDK.getClass();
        this.getMonetizationNetwork = aFc1kSDK;
        this.getCurrencyIso4217Code = aFf1pSDK;
        this.AFAdRevenueData = aFc1gSDK;
        this.getRevenue = ee0.b(new AnonymousClass1());
        this.getMediationNetwork = ee0.b(new AnonymousClass5());
    }

    public final boolean AFAdRevenueData() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) this.getMediationNetwork.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        AFi1zSDK aFi1zSDK;
        if (this.AFAdRevenueData.hashCode == null) {
            AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "Cold start - fetching config", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = this.getCurrencyIso4217Code.AFAdRevenueData;
        if (aFh1cSDK == null) {
            AFg1hSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1aSDK aFh1aSDK = aFh1cSDK.getMediationNetwork;
        boolean monetizationNetwork = (aFh1aSDK == null || (aFi1zSDK = aFh1aSDK.AFAdRevenueData) == null) ? false : aFi1zSDK.getMonetizationNetwork();
        long currentTimeMillis = System.currentTimeMillis();
        AFf1pSDK aFf1pSDK = this.getCurrencyIso4217Code;
        return monetizationNetwork || currentTimeMillis - aFf1pSDK.getRevenue > TimeUnit.SECONDS.toMillis(aFf1pSDK.getMediationNetwork);
    }

    public final long getRevenue() {
        Object j31Var;
        String monetizationNetwork = this.getMonetizationNetwork.getMonetizationNetwork("com.appsflyer.rc.cache.max-age-fallback");
        if (monetizationNetwork == null) {
            return component4;
        }
        try {
            i31 i31Var = k31.d;
            j31Var = Long.valueOf(Long.parseLong(monetizationNetwork));
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        Throwable a = k31.a(j31Var);
        if (a != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + a.getMessage(), a);
            j31Var = Long.valueOf(component4);
        }
        return ((Number) j31Var).longValue();
    }
}
