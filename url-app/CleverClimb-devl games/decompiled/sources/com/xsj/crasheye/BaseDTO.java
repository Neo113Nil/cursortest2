package com.xsj.crasheye;

import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import com.xsj.crasheye.util.Utils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class BaseDTO {
    protected static final String UNKNOWN = "NA";
    protected boolean appIsBetaVersion;
    protected String appVersionCode;
    protected String appVersionName;
    protected String carrier;
    protected String channelId;
    protected String connection;
    protected Long crashTime;
    protected HashMap<String, Object> customData;
    protected String device;
    protected ExtraData extraData;
    protected Boolean isRunningService;
    protected String locale;
    protected String osVersion;
    protected String packageName;
    protected String remoteIP;
    protected Boolean rooted;
    protected String screenOrientation;
    protected String screenSize;
    protected int sessionCount;
    protected String state;
    protected EnumActionType type;
    protected String userIdentifier;
    protected String uuid;
    protected Long timestampMilis = Long.valueOf(System.currentTimeMillis());
    protected String appStartTime = Utils.getTime();
    protected String sdkVersion = "2.2.3";
    protected String platform = "Android";
    protected String appKey = Properties.APP_KEY;

    public BaseDTO(EnumActionType enumActionType, HashMap<String, Object> hashMap) {
        String str;
        this.type = enumActionType;
        if (Properties.PHONE_BRAND != null) {
            str = String.valueOf(Properties.PHONE_BRAND) + " ";
        } else {
            str = "";
        }
        this.device = String.valueOf(str) + Properties.PHONE_MODEL;
        this.osVersion = Properties.OS_VERSION;
        this.appVersionCode = Properties.APP_VERSIONCODE;
        this.appVersionName = Properties.APP_VERSIONNAME;
        this.appIsBetaVersion = Properties.APP_ISBETAVERSION;
        this.packageName = Properties.APP_PACKAGE;
        this.locale = Properties.LOCALE;
        this.rooted = Boolean.valueOf(Properties.HAS_ROOT);
        this.uuid = Properties.UID;
        this.userIdentifier = Properties.userIdentifier;
        this.connection = Properties.CONNECTION;
        this.state = Properties.STATE;
        this.extraData = Properties.extraData;
        this.screenOrientation = Properties.SCREEN_ORIENTATION;
        this.screenSize = Properties.SCREEN_SIZE;
        this.customData = hashMap;
        this.channelId = Properties.APP_CHANNELID;
        this.sessionCount = Properties.sessionCount;
        this.isRunningService = Boolean.valueOf(!Utils.isRunningService(Properties.AppContent));
    }

    public JSONObject getBasicDataFixtureJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appstarttime", this.appStartTime);
            jSONObject.put("crashtime", this.crashTime);
            jSONObject.put("sdkversion", this.sdkVersion);
            jSONObject.put("appkey", this.appKey);
            jSONObject.put(TapjoyConstants.TJC_PLATFORM, this.platform);
            jSONObject.put(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX, this.device);
            jSONObject.put("osversion", this.osVersion);
            jSONObject.put("locale", this.locale);
            jSONObject.put("uuid", this.uuid);
            jSONObject.put("useridentifier", this.userIdentifier);
            jSONObject.put(d.O, this.carrier);
            jSONObject.put("appversioncode", this.appVersionCode);
            jSONObject.put("appversionname", this.appVersionName);
            jSONObject.put("is_beta_version", this.appIsBetaVersion ? "1" : "0");
            jSONObject.put("packagename", this.packageName);
            jSONObject.put("netstatus", this.connection);
            jSONObject.put("connection", this.state);
            jSONObject.put("screenorientation", this.screenOrientation);
            jSONObject.put("screensize", this.screenSize);
            jSONObject.put("channel", this.channelId);
            jSONObject.put("sessioncount", this.sessionCount);
            jSONObject.put("isservice", this.isRunningService);
            JSONObject jSONObject2 = new JSONObject();
            if (this.extraData != null && !this.extraData.isEmpty()) {
                for (Map.Entry<String, Object> entry : this.extraData.entrySet()) {
                    if (entry.getValue() == null) {
                        jSONObject2.put(entry.getKey(), "null");
                    } else {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (this.customData != null && !this.customData.isEmpty()) {
                for (Map.Entry<String, Object> entry2 : this.customData.entrySet()) {
                    if (entry2.getValue() == null) {
                        jSONObject2.put(entry2.getKey(), "null");
                    } else {
                        jSONObject2.put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            jSONObject.put("extradata", jSONObject2);
            JSONArray jSONArray = new JSONArray();
            if (Properties.transactions != null) {
                Iterator<String> it = Properties.transactions.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            jSONObject.put("transactions", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
