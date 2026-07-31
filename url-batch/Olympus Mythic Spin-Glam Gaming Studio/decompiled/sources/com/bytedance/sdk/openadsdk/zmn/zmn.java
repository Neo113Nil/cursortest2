package com.bytedance.sdk.openadsdk.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.bvs;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.rc.fs;
import com.bytedance.sdk.openadsdk.core.settings.nps;
import com.bytedance.sdk.openadsdk.kgc.fb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.Map;

/* loaded from: classes13.dex */
public class zmn {
    public static boolean zmn(PAGLoadListener pAGLoadListener) {
        if (nps.zmn()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void zmn(final zn znVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                if (!cn.btk()) {
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (fs.zmn().rc() && iv.fs().rc()) {
                    PAGLoadListener pAGLoadListener3 = PAGLoadListener.this;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, bvs.zmn(10004));
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.kgc.zn.zmn(new fb() { // from class: com.bytedance.sdk.openadsdk.zmn.zmn.1.1
                    @Override // com.bytedance.sdk.openadsdk.kgc.fb
                    public com.bytedance.sdk.openadsdk.kgc.fs.zmn zmn() {
                        com.bytedance.sdk.openadsdk.kgc.fs.zmn zmnVar = new com.bytedance.sdk.openadsdk.kgc.fs.zmn();
                        zmnVar.fs("load_ad");
                        zmnVar.zn(adSlot.getCodeId());
                        zmnVar.fb(oub.zn(adSlot.getDurationSlotType()));
                        zmnVar.nps(oub.zmn(adSlot).toString());
                        return zmnVar;
                    }
                });
                nu.zn(znVar);
            }
        };
        if (cn.btk()) {
            runnable.run();
        } else {
            cn.fs().post(runnable);
        }
    }

    public static void zmn(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!cn.btk() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey(CreativeInfo.c) && extraInfo.get(CreativeInfo.c) != null) {
            builder.setAdId(extraInfo.get(CreativeInfo.c).toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean zmn(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
