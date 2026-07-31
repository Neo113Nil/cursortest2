package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.zmn.zmn.zmn.nps.fs;
import com.bytedance.sdk.component.utils.cn;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private boolean bjh;
    private float btk;
    private int bvs;
    private String cn;
    private String cyb;
    private int doe;
    private float fb;
    private int fs;
    private int hhw;
    private int iqz;
    private String iv;
    private String kgc;
    private long kjb;
    private int klz;
    private String kw;
    private boolean mw;
    private boolean nps;
    private int nqi;
    private String olo;
    private int phc;
    private String rc;
    private int rp;
    private boolean rt;
    private int uqh;
    private Map<String, Object> zak;
    private String zg;
    private String zmn;
    private int zn;

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
        this.mw = true;
        this.rt = false;
        this.iqz = 0;
        this.phc = 0;
        this.doe = 0;
        this.uqh = 1;
    }

    public void setUserData(String str) {
        this.kw = str;
    }

    public String getUserData() {
        return this.kw;
    }

    public String getCodeId() {
        return this.zmn;
    }

    public boolean isAutoPlay() {
        return this.mw;
    }

    public boolean isExpressAd() {
        return this.rt;
    }

    public String getBidAdm() {
        return this.cn;
    }

    public int getImgAcceptedWidth() {
        return this.fs;
    }

    public int getImgAcceptedHeight() {
        return this.zn;
    }

    public float getExpressViewAcceptedWidth() {
        return this.fb;
    }

    public float getExpressViewAcceptedHeight() {
        return this.btk;
    }

    public void setExpressViewAccepted(float f, float f2) {
        this.fb = f;
        this.btk = f2;
    }

    public boolean isSupportDeepLink() {
        return this.nps;
    }

    public int getAdCount() {
        return this.hhw;
    }

    public void setAdCount(int i) {
        this.hhw = i;
    }

    public String getRewardName() {
        return this.zg;
    }

    public int getRewardAmount() {
        return this.bvs;
    }

    public String getMediaExtra() {
        return this.iv;
    }

    public String getUserID() {
        return this.rc;
    }

    public String getAdId() {
        return this.cyb;
    }

    public String getCreativeId() {
        return this.olo;
    }

    public String getExt() {
        return this.kgc;
    }

    public int getIsRotateBanner() {
        return this.iqz;
    }

    public void setIsRotateBanner(int i) {
        this.iqz = i;
    }

    public int getRotateTime() {
        return this.phc;
    }

    public void setRotateTime(int i) {
        this.phc = i;
    }

    public int getRotateOrder() {
        return this.doe;
    }

    public void setRotateOrder(int i) {
        this.doe = i;
    }

    public void setDurationSlotType(int i) {
        this.nqi = i;
    }

    public int getDurationSlotType() {
        return this.nqi;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.zak;
    }

    public void setPreload(boolean z) {
        this.bjh = z;
    }

    public boolean isPreload() {
        return this.bjh;
    }

    public void setCacheScene(int i) {
        this.rp = i;
    }

    public int getCacheScene() {
        return this.rp;
    }

    public void setCacheTime(long j) {
        this.kjb = j;
    }

    public long getCacheTime() {
        return this.kjb;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.zmn);
            jSONObject.put("mAdCount", this.hhw);
            jSONObject.put("mIsAutoPlay", this.mw);
            jSONObject.put("mImgAcceptedWidth", this.fs);
            jSONObject.put("mImgAcceptedHeight", this.zn);
            jSONObject.put("mExpressViewAcceptedWidth", this.fb);
            jSONObject.put("mExpressViewAcceptedHeight", this.btk);
            jSONObject.put("mSupportDeepLink", this.nps);
            jSONObject.put("mRewardName", this.zg);
            jSONObject.put("mRewardAmount", this.bvs);
            jSONObject.put("mMediaExtra", this.iv);
            jSONObject.put("mUserID", this.rc);
            jSONObject.put("mNativeAdType", this.klz);
            jSONObject.put("mIsExpressAd", this.rt);
            jSONObject.put("mAdId", this.cyb);
            jSONObject.put("mCreativeId", this.olo);
            jSONObject.put("mExt", this.kgc);
            jSONObject.put("mBidAdm", this.cn);
            jSONObject.put("mUserData", this.kw);
            jSONObject.put("mDurationSlotType", this.nqi);
            jSONObject.put("mBannerType", this.uqh);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int getBannerType() {
        return this.uqh;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
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
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot build = builder.build();
        build.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return build;
    }

    public static class Builder {
        private String cn;
        private String cyb;
        private int iv;
        private String kgc;
        private float klz;
        private boolean mw;
        private String olo;
        private int phc;
        private float rc;
        private String rt;
        private String zg;
        private String zmn;
        private int fs = 640;
        private int zn = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        private final boolean fb = true;
        private int btk = 1;
        private final String hhw = "";
        private final int nps = 0;
        private String bvs = "defaultUser";
        private boolean kw = true;
        private Map<String, Object> iqz = null;
        private int doe = 1;

        public Builder setRewardAmount(int i) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setAdId(String str) {
            this.cn = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.cyb = str;
            return this;
        }

        public Builder setExt(String str) {
            this.olo = str;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.kw = z;
            return this;
        }

        public Builder setCodeId(String str) {
            this.zmn = str;
            return this;
        }

        public Builder isExpressAd(boolean z) {
            this.mw = z;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.fs = i;
            this.zn = i2;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.rc = f;
            this.klz = f2;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.phc = i;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.btk = i;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.zg = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.bvs = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.iv = i;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (cn.zn()) {
                fs.zmn(str);
            }
            this.rt = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.kgc = str;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.iqz = map;
            return this;
        }

        public Builder setBannerType(int i) {
            this.doe = i;
            return this;
        }

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.zmn = this.zmn;
            adSlot.hhw = this.btk;
            adSlot.nps = true;
            adSlot.fs = this.fs;
            adSlot.zn = this.zn;
            float f = this.rc;
            if (f <= 0.0f) {
                adSlot.fb = this.fs;
                adSlot.btk = this.zn;
            } else {
                adSlot.fb = f;
                adSlot.btk = this.klz;
            }
            adSlot.zg = "";
            adSlot.bvs = 0;
            adSlot.iv = this.zg;
            adSlot.rc = this.bvs;
            adSlot.klz = this.iv;
            adSlot.mw = this.kw;
            adSlot.rt = this.mw;
            adSlot.cn = this.rt;
            adSlot.cyb = this.cn;
            adSlot.olo = this.cyb;
            adSlot.kgc = this.olo;
            adSlot.kw = this.kgc;
            adSlot.zak = this.iqz;
            adSlot.nqi = this.phc;
            adSlot.uqh = this.doe;
            return adSlot;
        }
    }
}
