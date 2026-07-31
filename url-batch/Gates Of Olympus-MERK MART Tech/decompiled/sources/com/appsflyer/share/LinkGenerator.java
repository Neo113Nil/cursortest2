package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass5;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFi1bSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class LinkGenerator {
    String AFInAppEventParameterName;
    private String AFInAppEventType;
    private final String AFKeystoreWrapper;
    private String AFLogger;
    private String afInfoLog;
    private String d;
    private String e;
    private final Map<String, String> i = new HashMap();
    private String registerClient;
    private String unregisterClient;
    private String v;
    private String valueOf;
    String values;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFKeystoreWrapper = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afInfoLog = str;
        return this;
    }

    public String getBrandDomain() {
        return this.afInfoLog;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.d = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.v = str;
        return this;
    }

    public String getChannel() {
        return this.AFInAppEventType;
    }

    public LinkGenerator setChannel(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.unregisterClient = str;
        return this;
    }

    public String getMediaSource() {
        return this.AFKeystoreWrapper;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.i);
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public LinkGenerator setCampaign(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.i.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.i.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.e = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventParameterName = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.AFInAppEventParameterName = String.format("https://%s/%s", str2, str);
        return this;
    }

    private Map<String, String> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.AFKeystoreWrapper);
        String str = this.AFLogger;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventType;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.unregisterClient;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.valueOf;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.registerClient;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.e;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.v != null) {
            StringBuilder append = new StringBuilder().append(this.v);
            String str7 = this.d;
            if (str7 != null) {
                this.d = str7.replaceFirst("^[/]", "");
                append.append(this.v.endsWith("/") ? "" : "/");
                append.append(this.d);
            }
            hashMap.put("af_dp", append.toString());
        }
        for (Map.Entry<String, String> entry : this.i.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1cSDK.AFInAppEventType(hashMap);
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFInAppEventParameterName;
        if (str != null && str.startsWith("http")) {
            sb.append(this.AFInAppEventParameterName);
        } else {
            sb.append(String.format(AFi1bSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.AFInAppEventType().getHostName()));
        }
        if (this.values != null) {
            sb.append('/').append(this.values);
        }
        Map<String, String> AFKeystoreWrapper = AFKeystoreWrapper();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : AFKeystoreWrapper.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append(Typography.amp);
            }
            sb2.append(entry.getKey()).append('=').append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.afInfoLog;
        Map<String, String> AFKeystoreWrapper = AFKeystoreWrapper();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1tSDK.AFInAppEventType().valueOf(context);
        AFd1mSDK values = AFb1tSDK.AFInAppEventType().values();
        AFf1tSDK aFf1tSDK = new AFf1tSDK(values, UUID.randomUUID(), string, AFKeystoreWrapper, str, responseListener, this);
        AFe1cSDK i = values.i();
        i.AFInAppEventParameterName.execute(i.new AnonymousClass5(aFf1tSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.5
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
