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

/* loaded from: classes.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    private String AFInAppEventType;
    String AFKeystoreWrapper;
    private String AFLogger;
    private String afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private String f6005d;

    /* renamed from: e, reason: collision with root package name */
    private String f6006e;
    private String registerClient;
    private String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final Map<String, String> f6007v = new HashMap();
    String valueOf;
    private final String values;

    /* renamed from: w, reason: collision with root package name */
    private String f6008w;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.values = str;
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
        String str6 = this.f6005d;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.afInfoLog != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.afInfoLog);
            String str7 = this.f6006e;
            if (str7 != null) {
                this.f6006e = str7.replaceFirst("^[/]", "");
                sb.append(this.afInfoLog.endsWith("/") ? "" : "/");
                sb.append(this.f6006e);
            }
            hashMap.put("af_dp", sb.toString());
        }
        for (Map.Entry<String, String> entry : this.f6007v.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1aSDK.valueOf(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.f6007v.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.f6007v.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str == null || !str.startsWith("http")) {
            sb.append(String.format(AFj1qSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName()));
        } else {
            sb.append(this.AFKeystoreWrapper);
        }
        if (this.valueOf != null) {
            sb.append('/');
            sb.append(this.valueOf);
        }
        Map<String, String> values = values();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (sb2.length() == 0) {
                sb2.append('?');
            } else {
                sb2.append('&');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public String getBrandDomain() {
        return this.f6008w;
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public String getChannel() {
        return this.AFInAppEventType;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.f6007v);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFKeystoreWrapper = "https://" + (AppsFlyerLib.getInstance().getHostPrefix() + "app." + AFb1vSDK.AFKeystoreWrapper().getHostName()) + "/" + str3;
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.AFKeystoreWrapper = "https://" + str2 + "/" + str;
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f6008w = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFInAppEventType = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f6006e = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f6005d = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.unregisterClient = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.registerClient = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.f6008w;
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
