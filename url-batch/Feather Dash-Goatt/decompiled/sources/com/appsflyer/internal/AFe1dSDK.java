package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import defpackage.i31;
import defpackage.ik0;
import defpackage.j31;
import defpackage.k31;
import defpackage.ov;
import defpackage.ry0;
import defpackage.zh;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0014\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0014\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u001dR\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFe1hSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1gSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1gSDK;)V", "", "", "", "getMonetizationNetwork", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1fSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "(Ljava/util/Map;)Ljava/lang/String;", "", "AFAdRevenueData", "(Ljava/lang/String;I)V", "()V", "equals", "Ljava/util/Map;", "copydefault", "Lcom/appsflyer/internal/AFj1gSDK;", "getRevenue", "toString", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "getMediationNetwork", "component2", "Lcom/appsflyer/AppsFlyerProperties;", "hashCode", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1vSDK"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1dSDK extends AFe1hSDK {

    /* renamed from: component2, reason: from kotlin metadata */
    private final AppsFlyerProperties AFAdRevenueData;

    /* renamed from: copydefault, reason: from kotlin metadata */
    private final AFj1gSDK getRevenue;

    /* renamed from: equals, reason: from kotlin metadata */
    private final Map<String, String> getCurrencyIso4217Code;

    /* renamed from: hashCode, reason: from kotlin metadata */
    private final AFPurchaseDetails getMonetizationNetwork;

    /* renamed from: toString, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback getMediationNetwork;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getMediationNetwork = iArr;
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    public static final class AFa1vSDK extends RuntimeException {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1gSDK aFj1gSDK) {
        super(r1, r2, aFd1zSDK, null, r5);
        aFd1zSDK.getClass();
        appsFlyerProperties.getClass();
        aFPurchaseDetails.getClass();
        aFj1gSDK.getClass();
        AFe1lSDK aFe1lSDK = AFe1lSDK.MANUAL_PURCHASE_VALIDATION;
        AFe1lSDK[] aFe1lSDKArr = {AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID};
        ov ovVar = ov.d;
        ovVar.getClass();
        this.AFAdRevenueData = appsFlyerProperties;
        this.getMonetizationNetwork = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.getMediationNetwork = appsFlyerInAppPurchaseValidationCallback;
        this.getRevenue = aFj1gSDK;
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
    }

    private final void AFAdRevenueData(String p0, int p1) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(ik0.c(new Pair("error_code", Integer.valueOf(p1)), new Pair("error_message", p0)));
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final AFd1fSDK<String> getCurrencyIso4217Code(Map<String, Object> p0, String p1, String p2) {
        p0.getClass();
        p1.getClass();
        int i = AFa1uSDK.getMediationNetwork[this.getMonetizationNetwork.getPurchaseType().ordinal()];
        if (i == 1) {
            return ((AFe1bSDK) this).component3.getMediationNetwork(p0, p1);
        }
        if (i == 2) {
            return ((AFe1bSDK) this).component3.getRevenue(p0, p1);
        }
        l.a();
        return null;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final void getMonetizationNetwork(Map<String, Object> p0, String p1) {
        Object obj;
        p0.getClass();
        super.getMonetizationNetwork(p0, p1);
        List e = zh.e(this.getMonetizationNetwork.getPurchaseToken(), this.getMonetizationNetwork.getProductId());
        if (e == null || !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1vSDK();
                }
            }
        }
        p0.put("purchase_token", this.getMonetizationNetwork.getPurchaseToken());
        p0.put("product_id", this.getMonetizationNetwork.getProductId());
        p0.put("purchase_type", this.getMonetizationNetwork.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p0.put("purchase_additional_details", this.getCurrencyIso4217Code);
        }
        String string = this.AFAdRevenueData.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string == null || string.length() == 0) {
            obj = ov.d;
            obj.getClass();
        } else {
            obj = AFj1eSDK.getMonetizationNetwork(new JSONObject(string));
        }
        p0.put("custom_data", obj);
    }

    public /* synthetic */ AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1gSDK aFj1gSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1iSDK() : aFj1gSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1dSDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        aFd1zSDK.getClass();
        appsFlyerProperties.getClass();
        aFPurchaseDetails.getClass();
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        Object j31Var;
        super.getMonetizationNetwork();
        Throwable component2 = component2();
        if (component2 != null && !(component2 instanceof AFe1nSDK)) {
            if (component2 instanceof AFe1pSDK) {
                AFAdRevenueData("No dev key", -1);
            } else if (component2 instanceof AFa1vSDK) {
                AFAdRevenueData("One or more of provided arguments is empty", -1);
            } else {
                AFAdRevenueData("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() == 200) {
                try {
                    i31 i31Var = k31.d;
                    AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMediationNetwork;
                    if (appsFlyerInAppPurchaseValidationCallback != null) {
                        appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationFinished(AFj1eSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                        j31Var = Unit.a;
                    } else {
                        j31Var = null;
                    }
                } catch (Throwable th) {
                    i31 i31Var2 = k31.d;
                    j31Var = new j31(th);
                }
                if (k31.a(j31Var) != null) {
                    AFAdRevenueData("Error while trying to parse JSON response", responseNetwork.getStatusCode());
                    return;
                }
                return;
            }
            AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMediationNetwork;
            if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationError(ik0.c(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final String getMonetizationNetwork(Map<String, Object> p0) {
        p0.getClass();
        return this.getRevenue.getRevenue();
    }
}
