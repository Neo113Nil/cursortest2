package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.nps.fb;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.common.hhw;
import com.bytedance.sdk.openadsdk.core.bvs;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.ev;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.zg.zmn;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    static {
        zmn.zmn();
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        cn.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                zmn.zmn(context, pAGConfig, pAGInitCallback);
            }
        });
        cn.nps();
    }

    public static boolean isInitSuccess() {
        return cn.fb() == 1;
    }

    public static String getSDKVersion() {
        if (ev.zmn() != null) {
            return ev.zmn().zn();
        }
        return "";
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (hhw.zmn()) {
            biddingTokenCallback.onBiddingTokenCollected("");
        } else {
            nu.fb(new zn("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    kgc.fs(context);
                    zmn.zmn(pAGBiddingRequest, new PAGBidCallback() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2.1
                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenCollected(String str) {
                            biddingTokenCallback.onBiddingTokenCollected(str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
                            biddingTokenCallback.onBiddingTokenCollected("");
                        }
                    });
                    com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(false);
                }
            });
        }
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (hhw.zmn()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, bvs.zmn(10009)));
        } else {
            nu.fb(new zn("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    kgc.fs(context);
                    zmn.zmn(pAGBiddingRequest, pAGBidCallback);
                    com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().zmn(false);
                }
            });
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.kw.zmn.zmn();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && cn.fb() == 0) {
            zmn.zmn.add(pAGInitCallback);
        }
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        doe.zmn(str);
        fb.zmn(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && kgc.fb().olo() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn().zmn(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        hhw.zmn(z);
    }
}
