package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import defpackage.ry0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0012\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001c\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010$R\u0014\u0010(\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFe1cSDK;", "Lcom/appsflyer/internal/AFe1bSDK;", "", "Lcom/appsflyer/internal/AFi1nSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "Lcom/appsflyer/internal/AFd1zSDK;", "p2", "Lcom/appsflyer/internal/AFg1vSDK;", "p3", "Lcom/appsflyer/internal/AFc1fSDK;", "p4", "Lcom/appsflyer/internal/AFh1eSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFi1nSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1vSDK;Lcom/appsflyer/internal/AFc1fSDK;Lcom/appsflyer/internal/AFh1eSDK;)V", "Lcom/appsflyer/internal/AFd1fSDK;", "getRevenue", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "", "()J", "Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "component1", "()Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "", "copy", "()Z", "AFAdRevenueData", "hashCode", "Lcom/appsflyer/internal/AFc1fSDK;", "getMonetizationNetwork", "component2", "Lcom/appsflyer/internal/AFh1eSDK;", "copydefault", "Lcom/appsflyer/internal/AFg1vSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "getCurrencyIso4217Code", "toString", "Lcom/appsflyer/internal/AFi1nSDK;", "getMediationNetwork"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1cSDK extends AFe1bSDK<String> {

    /* renamed from: component2, reason: from kotlin metadata */
    public AFh1eSDK AFAdRevenueData;

    /* renamed from: copy, reason: from kotlin metadata */
    private final AFc1kSDK getCurrencyIso4217Code;

    /* renamed from: copydefault, reason: from kotlin metadata */
    private final AFg1vSDK getRevenue;

    /* renamed from: hashCode, reason: from kotlin metadata */
    private final AFc1fSDK getMonetizationNetwork;

    /* renamed from: toString, reason: from kotlin metadata */
    private final AFi1nSDK getMediationNetwork;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFe1cSDK(AFi1nSDK aFi1nSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1fSDK aFc1fSDK, AFh1eSDK aFh1eSDK) {
        super(r0, new AFe1lSDK[]{r1}, aFd1zSDK, "PIA");
        aFi1nSDK.getClass();
        aFc1kSDK.getClass();
        aFd1zSDK.getClass();
        aFg1vSDK.getClass();
        aFc1fSDK.getClass();
        aFh1eSDK.getClass();
        AFe1lSDK aFe1lSDK = AFe1lSDK.PLAY_INTEGRITY_API;
        AFe1lSDK aFe1lSDK2 = AFe1lSDK.CONVERSION;
        this.getMediationNetwork = aFi1nSDK;
        this.getCurrencyIso4217Code = aFc1kSDK;
        this.getRevenue = aFg1vSDK;
        this.getMonetizationNetwork = aFc1fSDK;
        this.AFAdRevenueData = aFh1eSDK;
        this.getRevenue.add(aFe1lSDK2);
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(String p0) {
        AFd1cSDK aFd1cSDK;
        String str;
        LinkedHashMap linkedHashMap;
        p0.getClass();
        AFh1eSDK aFh1eSDK = this.AFAdRevenueData;
        Map<String, Object> map = aFh1eSDK.AFAdRevenueData;
        map.getClass();
        map.put("app_id", this.getCurrencyIso4217Code.getRevenue.getCurrencyIso4217Code.getPackageName());
        map.put("sdk_version", AFc1kSDK.getRevenue());
        map.put("app_version_name", this.getCurrencyIso4217Code.n_().versionName);
        this.getRevenue.AFAdRevenueData(map);
        try {
            AFi1mSDK monetizationNetwork = this.getMediationNetwork.getMonetizationNetwork();
            if (monetizationNetwork != null) {
                linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("pia_timestamp", Long.valueOf(monetizationNetwork.getMonetizationNetwork));
                linkedHashMap2.put("ttr_millis", Long.valueOf(monetizationNetwork.getCurrencyIso4217Code));
                String str2 = monetizationNetwork.AFAdRevenueData;
                if (str2 != null) {
                    linkedHashMap2.put("pia_token", str2);
                }
                String str3 = monetizationNetwork.getMediationNetwork;
                if (str3 != null) {
                    linkedHashMap2.put("error_code", str3);
                }
                linkedHashMap.put("pia", linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                aFh1eSDK.getCurrencyIso4217Code(linkedHashMap);
            }
            if (!this.getMediationNetwork.getMediationNetwork()) {
                Map<String, Object> map2 = aFh1eSDK.AFAdRevenueData;
                map2.getClass();
                AFj1cSDK.AFAdRevenueData(map2).put("pia_disabled", Boolean.TRUE);
            }
        } catch (Throwable th) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        AFd1fSDK<String> aFd1fSDK = (AFd1fSDK) AFd1mSDK.getCurrencyIso4217Code(new Object[]{aFd1mSDK, this.AFAdRevenueData, ((AFe1bSDK) this).component1.getMonetizationNetwork(), this.getMonetizationNetwork}, -846475552, 846475554, System.identityHashCode(aFd1mSDK));
        Map<String, Object> map3 = this.AFAdRevenueData.AFAdRevenueData;
        map3.getClass();
        if (aFd1fSDK != null && (aFd1cSDK = aFd1fSDK.getMediationNetwork) != null && (str = aFd1cSDK.AFAdRevenueData) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFg1fSDK.getMediationNetwork(jSONObject2.getString("pia_token")));
                }
            }
            AFg1fSDK.AFAdRevenueData(toString() + ": preparing data: ", jSONObject);
            AFd1lSDK aFd1lSDK = ((AFe1bSDK) this).areAllFieldsValid;
            String jSONObject3 = jSONObject.toString();
            jSONObject3.getClass();
            aFd1lSDK.getMonetizationNetwork(str, jSONObject3);
        }
        return aFd1fSDK;
    }

    public /* synthetic */ AFe1cSDK(AFi1nSDK aFi1nSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1fSDK aFc1fSDK, AFh1eSDK aFh1eSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1nSDK, aFc1kSDK, aFd1zSDK, aFg1vSDK, aFc1fSDK, (i & 32) != 0 ? new AFh1eSDK() : aFh1eSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1cSDK(AFi1nSDK aFi1nSDK, AFc1kSDK aFc1kSDK, AFd1zSDK aFd1zSDK, AFg1vSDK aFg1vSDK, AFc1fSDK aFc1fSDK) {
        this(aFi1nSDK, aFc1kSDK, aFd1zSDK, aFg1vSDK, aFc1fSDK, null, 32, null);
        aFi1nSDK.getClass();
        aFc1kSDK.getClass();
        aFd1zSDK.getClass();
        aFg1vSDK.getClass();
        aFc1fSDK.getClass();
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return 60000L;
    }
}
