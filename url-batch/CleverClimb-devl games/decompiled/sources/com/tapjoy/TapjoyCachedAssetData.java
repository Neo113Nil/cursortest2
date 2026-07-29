package com.tapjoy;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TapjoyCachedAssetData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private long f7761a;

    /* renamed from: b, reason: collision with root package name */
    private long f7762b;

    /* renamed from: c, reason: collision with root package name */
    private String f7763c;

    /* renamed from: d, reason: collision with root package name */
    private String f7764d;
    private String e;
    private long f;
    private String g;
    private String h;

    public TapjoyCachedAssetData(String str, String str2, long j) {
        this(str, str2, j, System.currentTimeMillis() / 1000);
    }

    public TapjoyCachedAssetData(String str, String str2, long j, long j2) {
        setAssetURL(str);
        setLocalFilePath(str2);
        this.f7762b = j;
        this.f7761a = j2;
        this.f = j2 + j;
    }

    public void setAssetURL(String str) {
        this.f7763c = str;
        this.g = TapjoyUtil.determineMimeType(str);
    }

    public void setLocalFilePath(String str) {
        this.f7764d = str;
        this.e = "file://" + str;
    }

    public void resetTimeToLive(long j) {
        this.f7762b = j;
        this.f = (System.currentTimeMillis() / 1000) + j;
    }

    public void setOfferID(String str) {
        this.h = str;
    }

    public long getTimestampInSeconds() {
        return this.f7761a;
    }

    public long getTimeToLiveInSeconds() {
        return this.f7762b;
    }

    public long getTimeOfDeathInSeconds() {
        return this.f;
    }

    public String getAssetURL() {
        return this.f7763c;
    }

    public String getLocalFilePath() {
        return this.f7764d;
    }

    public String getLocalURL() {
        return this.e;
    }

    public String getMimeType() {
        return this.g;
    }

    public String getOfferId() {
        return this.h;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TapjoyConstants.TJC_TIMESTAMP, getTimestampInSeconds());
            jSONObject.put(TapjoyConstants.TJC_TIME_TO_LIVE, getTimeToLiveInSeconds());
            jSONObject.put("assetURL", getAssetURL());
            jSONObject.put("localFilePath", getLocalFilePath());
            jSONObject.put("offerID", getOfferId());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toRawJSONString() {
        return toJSON().toString();
    }

    public static TapjoyCachedAssetData fromRawJSONString(String str) {
        try {
            return fromJSONObject(new JSONObject(str));
        } catch (JSONException unused) {
            TapjoyLog.i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- error reading json string");
            return null;
        }
    }

    public static TapjoyCachedAssetData fromJSONObject(JSONObject jSONObject) {
        TapjoyCachedAssetData tapjoyCachedAssetData;
        try {
            tapjoyCachedAssetData = new TapjoyCachedAssetData(jSONObject.getString("assetURL"), jSONObject.getString("localFilePath"), jSONObject.getLong(TapjoyConstants.TJC_TIME_TO_LIVE), jSONObject.getLong(TapjoyConstants.TJC_TIMESTAMP));
        } catch (JSONException unused) {
            tapjoyCachedAssetData = null;
        }
        try {
            tapjoyCachedAssetData.setOfferID(jSONObject.optString("offerID"));
        } catch (JSONException unused2) {
            TapjoyLog.i("TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- not enough data.");
            return tapjoyCachedAssetData;
        }
        return tapjoyCachedAssetData;
    }

    public String toString() {
        return "\nURL=" + this.e + "\nAssetURL=" + this.f7763c + "\nMimeType=" + this.g + "\nTimestamp=" + getTimestampInSeconds() + "\nTimeOfDeath=" + this.f + "\nTimeToLive=" + this.f7762b + "\n";
    }
}
