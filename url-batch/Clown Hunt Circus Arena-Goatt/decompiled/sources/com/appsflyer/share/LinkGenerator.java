package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFa1dSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.appsflyer.internal.AFg1xSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class LinkGenerator {
    private String AFInAppEventParameterName;
    private String AFInAppEventType;
    private final String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> AFLogger$LogLevel = new HashMap();
    private String AFVersionDeclaration;
    private String afDebugLog;
    private String afErrorLog;
    private String afInfoLog;
    private String afRDLog;
    private String getLevel;
    String valueOf;
    String values;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFKeystoreWrapper = str;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }

    public String getBrandDomain() {
        return this.AFVersionDeclaration;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.afRDLog = str;
        return this;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.getLevel = str;
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
        this.afInfoLog = str;
        return this;
    }

    public String getMediaSource() {
        return this.AFKeystoreWrapper;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.AFLogger$LogLevel);
    }

    public String getCampaign() {
        return this.AFInAppEventParameterName;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFInAppEventParameterName = str;
        return this;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.AFLogger$LogLevel.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.AFLogger$LogLevel.putAll(map);
        }
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.afDebugLog = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.values = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.values = String.format("https://%s/%s", str2, str);
        return this;
    }

    private Map<String, String> valueOf() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.AFKeystoreWrapper);
        String str = this.afDebugLog;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFInAppEventType;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.afInfoLog;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFInAppEventParameterName;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.AFLogger;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.afErrorLog;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.getLevel != null) {
            StringBuilder append = new StringBuilder().append(this.getLevel);
            String str7 = this.afRDLog;
            if (str7 != null) {
                this.afRDLog = str7.replaceFirst("^[/]", "");
                append.append(this.getLevel.endsWith("/") ? "" : "/");
                append.append(this.afRDLog);
            }
            hashMap.put("af_dp", append.toString());
        }
        for (Map.Entry<String, String> entry : this.AFLogger$LogLevel.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1ySDK.valueOf(hashMap);
    }

    public String generateLink() {
        StringBuilder sb = new StringBuilder();
        String str = this.values;
        if (str != null && str.startsWith("http")) {
            sb.append(this.values);
        } else {
            sb.append(String.format(AFg1xSDK.AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        }
        if (this.valueOf != null) {
            sb.append('/').append(this.valueOf);
        }
        Map<String, String> valueOf = valueOf();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : valueOf.entrySet()) {
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
        String str = this.AFVersionDeclaration;
        Map<String, String> valueOf = valueOf();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFc1zSDK AFInAppEventParameterName = AFa1dSDK.valueOf().AFInAppEventParameterName();
        AFd1sSDK aFd1sSDK = new AFd1sSDK(AFInAppEventParameterName, UUID.randomUUID(), string, valueOf, str, responseListener);
        AFd1tSDK level = AFInAppEventParameterName.getLevel();
        level.AFKeystoreWrapper.execute(level.new AnonymousClass5(aFd1sSDK));
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
