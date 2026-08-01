package com.bytedance.sdk.openadsdk.apiImpl;

import android.text.TextUtils;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.settings.kj;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.Map;

/* compiled from: AdLoadUtils.java */
/* loaded from: classes2.dex */
public class pvs {
    public static boolean pvs(PAGLoadListener pAGLoadListener) {
        if (kj.pvs()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
        return true;
    }

    public static void pvs(final so soVar, final PAGLoadListener pAGLoadListener, AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                if (!Ju.NB()) {
                    com.bytedance.sdk.component.utils.Ju.pvs("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                ae.Jd(soVar);
            }
        };
        if (Ju.NB()) {
            runnable.run();
        } else {
            Ju.icD().post(runnable);
        }
    }

    public static void pvs(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!Ju.NB() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
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

    public static boolean pvs(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
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
