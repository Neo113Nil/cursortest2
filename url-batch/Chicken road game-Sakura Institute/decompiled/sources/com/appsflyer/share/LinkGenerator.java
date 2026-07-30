package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1rSDK;
import com.appsflyer.internal.AFj1qSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    private String AFInAppEventType;
    String AFKeystoreWrapper;
    private String AFLogger;
    private String afInfoLog;
    private String d;
    private String e;
    private String registerClient;
    private String unregisterClient;
    private final Map<String, String> v = new HashMap();
    String valueOf;
    private final String values;
    private String w;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.values = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.w = str;
        return this;
    }

    public String getBrandDomain() {
        return this.w;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.e = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afInfoLog = str;
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
        this.AFLogger = str;
        return this;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.v);
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.v.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.v.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.unregisterClient = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.d = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFKeystoreWrapper = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()), str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFKeystoreWrapper = String.format("https://%s/%s", str2, str);
        }
        return this;
    }

    private Map<String, String> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.values);
        String str = this.registerClient;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventType;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.AFLogger;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventParameterName;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.unregisterClient;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.d;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.afInfoLog != null) {
            StringBuilder append = new StringBuilder().append(this.afInfoLog);
            String str7 = this.e;
            if (str7 != null) {
                this.e = str7.replaceFirst("^[/]", "");
                append.append(this.afInfoLog.endsWith("/") ? "" : "/");
                append.append(this.e);
            }
            hashMap.put("af_dp", append.toString());
        }
        for (Map.Entry<String, String> entry : this.v.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1aSDK.valueOf(hashMap);
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str != null && str.startsWith("http")) {
            sb.append(this.AFKeystoreWrapper);
        } else {
            sb.append(String.format(AFj1qSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        }
        if (this.valueOf != null) {
            sb.append('/').append(this.valueOf);
        }
        Map<String, String> values = values();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
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
        String str = this.w;
        Map<String, String> values = values();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1vSDK.AFKeystoreWrapper().valueOf(context);
        AFd1kSDK AFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        AFf1rSDK aFf1rSDK = new AFf1rSDK(AFInAppEventParameterName, UUID.randomUUID(), string, values, str, responseListener, this);
        AFe1cSDK afInfoLog = AFInAppEventParameterName.afInfoLog();
        afInfoLog.valueOf.execute(afInfoLog.new AnonymousClass2(aFf1rSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
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
