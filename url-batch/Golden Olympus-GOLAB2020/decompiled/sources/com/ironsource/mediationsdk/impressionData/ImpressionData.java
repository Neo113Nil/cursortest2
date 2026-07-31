package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.o9;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f17601a;

    /* renamed from: b, reason: collision with root package name */
    private String f17602b;

    /* renamed from: c, reason: collision with root package name */
    private String f17603c;

    /* renamed from: d, reason: collision with root package name */
    private String f17604d;

    /* renamed from: e, reason: collision with root package name */
    private String f17605e;

    /* renamed from: f, reason: collision with root package name */
    private String f17606f;

    /* renamed from: g, reason: collision with root package name */
    private String f17607g;

    /* renamed from: h, reason: collision with root package name */
    private String f17608h;

    /* renamed from: i, reason: collision with root package name */
    private String f17609i;

    /* renamed from: j, reason: collision with root package name */
    private String f17610j;

    /* renamed from: k, reason: collision with root package name */
    private String f17611k;

    /* renamed from: l, reason: collision with root package name */
    private String f17612l;

    /* renamed from: m, reason: collision with root package name */
    private String f17613m;

    /* renamed from: n, reason: collision with root package name */
    private Double f17614n;

    /* renamed from: o, reason: collision with root package name */
    private String f17615o;

    /* renamed from: p, reason: collision with root package name */
    private Double f17616p;

    /* renamed from: q, reason: collision with root package name */
    private String f17617q;

    /* renamed from: r, reason: collision with root package name */
    private String f17618r;

    /* renamed from: s, reason: collision with root package name */
    private DecimalFormat f17619s = new DecimalFormat("#.#####");

    public ImpressionData(@NotNull ImpressionData impressionData) {
        this.f17602b = null;
        this.f17603c = null;
        this.f17604d = null;
        this.f17605e = null;
        this.f17606f = null;
        this.f17607g = null;
        this.f17608h = null;
        this.f17609i = null;
        this.f17610j = null;
        this.f17611k = null;
        this.f17612l = null;
        this.f17613m = null;
        this.f17614n = null;
        this.f17615o = null;
        this.f17616p = null;
        this.f17617q = null;
        this.f17618r = null;
        this.f17601a = impressionData.f17601a;
        this.f17602b = impressionData.f17602b;
        this.f17603c = impressionData.f17603c;
        this.f17604d = impressionData.f17604d;
        this.f17605e = impressionData.f17605e;
        this.f17606f = impressionData.f17606f;
        this.f17607g = impressionData.f17607g;
        this.f17608h = impressionData.f17608h;
        this.f17609i = impressionData.f17609i;
        this.f17610j = impressionData.f17610j;
        this.f17611k = impressionData.f17611k;
        this.f17612l = impressionData.f17612l;
        this.f17613m = impressionData.f17613m;
        this.f17615o = impressionData.f17615o;
        this.f17617q = impressionData.f17617q;
        this.f17616p = impressionData.f17616p;
        this.f17614n = impressionData.f17614n;
        this.f17618r = impressionData.f17618r;
    }

    public String getAb() {
        return this.f17608h;
    }

    public String getAdFormat() {
        return this.f17606f;
    }

    public String getAdNetwork() {
        return this.f17611k;
    }

    @Deprecated
    public String getAdUnit() {
        return this.f17603c;
    }

    public JSONObject getAllData() {
        return this.f17601a;
    }

    public String getAuctionId() {
        return this.f17602b;
    }

    public String getCountry() {
        return this.f17607g;
    }

    public String getCreativeId() {
        return this.f17618r;
    }

    public String getEncryptedCPM() {
        return this.f17617q;
    }

    public String getInstanceId() {
        return this.f17613m;
    }

    public String getInstanceName() {
        return this.f17612l;
    }

    @Deprecated
    public Double getLifetimeRevenue() {
        return this.f17616p;
    }

    public String getMediationAdUnitId() {
        return this.f17605e;
    }

    public String getMediationAdUnitName() {
        return this.f17604d;
    }

    public String getPlacement() {
        return this.f17610j;
    }

    public String getPrecision() {
        return this.f17615o;
    }

    public Double getRevenue() {
        return this.f17614n;
    }

    public String getSegmentName() {
        return this.f17609i;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f17610j;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f17610j = replace;
            JSONObject jSONObject = this.f17601a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error(e4.toString());
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("auctionId: '");
        sb.append(this.f17602b);
        sb.append('\'');
        sb.append(", adUnit: '");
        sb.append(this.f17603c);
        sb.append('\'');
        sb.append(", mediationAdUnitName: '");
        sb.append(this.f17604d);
        sb.append('\'');
        sb.append(", mediationAdUnitId: '");
        sb.append(this.f17605e);
        sb.append('\'');
        sb.append(", adFormat: '");
        sb.append(this.f17606f);
        sb.append('\'');
        sb.append(", country: '");
        sb.append(this.f17607g);
        sb.append('\'');
        sb.append(", ab: '");
        sb.append(this.f17608h);
        sb.append('\'');
        sb.append(", segmentName: '");
        sb.append(this.f17609i);
        sb.append('\'');
        sb.append(", placement: '");
        sb.append(this.f17610j);
        sb.append('\'');
        sb.append(", adNetwork: '");
        sb.append(this.f17611k);
        sb.append('\'');
        sb.append(", instanceName: '");
        sb.append(this.f17612l);
        sb.append('\'');
        sb.append(", instanceId: '");
        sb.append(this.f17613m);
        sb.append('\'');
        sb.append(", revenue: ");
        Double d4 = this.f17614n;
        sb.append(d4 == null ? null : this.f17619s.format(d4));
        sb.append(", precision: '");
        sb.append(this.f17615o);
        sb.append('\'');
        sb.append(", lifetimeRevenue: ");
        Double d5 = this.f17616p;
        sb.append(d5 != null ? this.f17619s.format(d5) : null);
        sb.append(", encryptedCPM: '");
        sb.append(this.f17617q);
        sb.append('\'');
        sb.append(", creativeId: '");
        sb.append(this.f17618r);
        sb.append('\'');
        return sb.toString();
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d4 = null;
        this.f17602b = null;
        this.f17603c = null;
        this.f17604d = null;
        this.f17605e = null;
        this.f17606f = null;
        this.f17607g = null;
        this.f17608h = null;
        this.f17609i = null;
        this.f17610j = null;
        this.f17611k = null;
        this.f17612l = null;
        this.f17613m = null;
        this.f17614n = null;
        this.f17615o = null;
        this.f17616p = null;
        this.f17617q = null;
        this.f17618r = null;
        if (jSONObject != null) {
            try {
                this.f17601a = jSONObject;
                this.f17602b = jSONObject.optString("auctionId", null);
                this.f17603c = jSONObject.optString("adUnit", null);
                this.f17604d = jSONObject.optString(IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME, null);
                this.f17605e = jSONObject.optString("mediationAdUnitId", null);
                this.f17606f = jSONObject.optString(IMPRESSION_DATA_KEY_AD_FORMAT, null);
                this.f17607g = jSONObject.optString("country", null);
                this.f17608h = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, null);
                this.f17609i = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, null);
                this.f17610j = jSONObject.optString("placement", null);
                this.f17611k = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, null);
                this.f17612l = jSONObject.optString("instanceName", null);
                this.f17613m = jSONObject.optString("instanceId", null);
                this.f17615o = jSONObject.optString("precision", null);
                this.f17617q = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, null);
                this.f17618r = jSONObject.optString(IMPRESSION_DATA_KEY_CREATIVE_ID, null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f17616p = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble("revenue");
                if (!Double.isNaN(optDouble2)) {
                    d4 = Double.valueOf(optDouble2);
                }
                this.f17614n = d4;
            } catch (Exception e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error("error parsing impression " + e4.getMessage());
            }
        }
    }
}
