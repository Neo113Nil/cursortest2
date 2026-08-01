package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.sUS.icD;
import com.bytedance.sdk.component.utils.Ju;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private Map<String, Object> CvL;
    private boolean IP;
    private float Jd;
    private boolean Ju;
    private int Mxy;
    private float NB;
    private int OT;
    private String Wyp;
    private JSONArray ZhG;
    private String bNS;
    private String cR;
    private String dX;
    private Bundle dyT;
    private int icD;
    private int kj;
    private String mnm;
    private int ny;
    private String pvs;
    private String qh;
    private int rCZ;
    private int sUS;
    private String so;
    private int uc;
    private String vA;
    private int vG;
    private boolean yiw;
    private String zM;

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    private AdSlot() {
        this.Ju = true;
        this.IP = false;
        this.uc = 0;
        this.rCZ = 0;
        this.OT = 0;
    }

    public void setUserData(String str) {
        this.zM = str;
    }

    public String getUserData() {
        return this.zM;
    }

    public String getCodeId() {
        return this.pvs;
    }

    public boolean isAutoPlay() {
        return this.Ju;
    }

    public boolean isExpressAd() {
        return this.IP;
    }

    public String getBidAdm() {
        return this.bNS;
    }

    public int getImgAcceptedWidth() {
        return this.icD;
    }

    public int getImgAcceptedHeight() {
        return this.vG;
    }

    public float getExpressViewAcceptedWidth() {
        return this.Jd;
    }

    public float getExpressViewAcceptedHeight() {
        return this.NB;
    }

    public boolean isSupportDeepLink() {
        return this.yiw;
    }

    public int getAdCount() {
        return this.sUS;
    }

    public void setAdCount(int i) {
        this.sUS = i;
    }

    @Deprecated
    public String getRewardName() {
        return this.so;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.Mxy;
    }

    public String getMediaExtra() {
        return this.Wyp;
    }

    public String getUserID() {
        return this.qh;
    }

    public int getNativeAdType() {
        return this.kj;
    }

    public void setNativeAdType(int i) {
        this.kj = i;
    }

    public String getAdId() {
        return this.mnm;
    }

    public String getCreativeId() {
        return this.vA;
    }

    public String getExt() {
        return this.cR;
    }

    public int getIsRotateBanner() {
        return this.uc;
    }

    public void setIsRotateBanner(int i) {
        this.uc = i;
    }

    public int getRotateTime() {
        return this.rCZ;
    }

    public void setRotateTime(int i) {
        this.rCZ = i;
    }

    public int getRotateOrder() {
        return this.OT;
    }

    public void setRotateOrder(int i) {
        this.OT = i;
    }

    public void setDurationSlotType(int i) {
        this.ny = i;
    }

    public int getDurationSlotType() {
        return this.ny;
    }

    public Map<String, Object> getRequestExtraMap() {
        return this.CvL;
    }

    public JSONArray getBiddingTokens() {
        return this.ZhG;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.ZhG = jSONArray;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.dyT;
    }

    public String getLinkId() {
        return this.dX;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.pvs);
            jSONObject.put("mAdCount", this.sUS);
            jSONObject.put("mIsAutoPlay", this.Ju);
            jSONObject.put("mImgAcceptedWidth", this.icD);
            jSONObject.put("mImgAcceptedHeight", this.vG);
            jSONObject.put("mExpressViewAcceptedWidth", this.Jd);
            jSONObject.put("mExpressViewAcceptedHeight", this.NB);
            jSONObject.put("mSupportDeepLink", this.yiw);
            jSONObject.put("mRewardName", this.so);
            jSONObject.put("mRewardAmount", this.Mxy);
            jSONObject.put("mMediaExtra", this.Wyp);
            jSONObject.put("mUserID", this.qh);
            jSONObject.put("mNativeAdType", this.kj);
            jSONObject.put("mIsExpressAd", this.IP);
            jSONObject.put("mAdId", this.mnm);
            jSONObject.put("mCreativeId", this.vA);
            jSONObject.put("mExt", this.cR);
            jSONObject.put("mBidAdm", this.bNS);
            jSONObject.put("mUserData", this.zM);
            jSONObject.put("mDurationSlotType", this.ny);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public static class Builder {
        private String IP;
        private boolean Ju;
        private String OT;
        private int Wyp;
        private String bNS;
        private String cR;
        private float kj;
        private String mnm;
        private int ny;
        private String pvs;
        private float qh;
        private Bundle rCZ;
        private String so;
        private String vA;
        private int icD = 640;
        private int vG = 320;
        private final boolean Jd = true;
        private int NB = 1;
        private final String sUS = "";
        private final int yiw = 0;
        private String Mxy = "defaultUser";
        private boolean zM = true;
        private Map<String, Object> uc = null;

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.bNS = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.mnm = str;
            return this;
        }

        public Builder setExt(String str) {
            this.vA = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.zM = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.pvs = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.Ju = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.icD = i;
            this.vG = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.qh = f;
            this.kj = f2;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.ny = i;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.NB = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.so = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.Mxy = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.Wyp = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (Ju.Jd()) {
                icD.pvs(str);
            }
            this.IP = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.cR = str;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.uc = map;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.rCZ = bundle;
            return this;
        }

        public Builder setLinkId(String str) {
            this.OT = str;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.pvs = this.pvs;
            adSlot.sUS = this.NB;
            adSlot.yiw = true;
            adSlot.icD = this.icD;
            adSlot.vG = this.vG;
            float f = this.qh;
            if (f <= 0.0f) {
                adSlot.Jd = this.icD;
                adSlot.NB = this.vG;
            } else {
                adSlot.Jd = f;
                adSlot.NB = this.kj;
            }
            adSlot.so = "";
            adSlot.Mxy = 0;
            adSlot.Wyp = this.so;
            adSlot.qh = this.Mxy;
            adSlot.kj = this.Wyp;
            adSlot.Ju = this.zM;
            adSlot.IP = this.Ju;
            adSlot.bNS = this.IP;
            adSlot.mnm = this.bNS;
            adSlot.vA = this.mnm;
            adSlot.cR = this.vA;
            adSlot.zM = this.cR;
            adSlot.CvL = this.uc;
            adSlot.dX = this.OT;
            adSlot.ny = this.ny;
            return adSlot;
        }
    }
}
