package com.bytedance.sdk.openadsdk.klz.zmn;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kw extends com.bytedance.sdk.component.zmn.kgc<JSONObject, JSONObject> {
    public static final HashSet<String> zmn = new HashSet<>(Arrays.asList("sendStatsLog", "callBackToPublisher", "trackVideoStateWithOmSdk", "commitDislike", "responseHeartBeat", "trackUrl", "postVideoState", "renderLandingPage", "changeLpClickable", "closeLandingPage"));
    private nqi fb;
    private boolean fs = false;
    private final fkt zn;

    public kw(fkt fktVar, nqi nqiVar) {
        this.zn = fktVar;
        this.fb = nqiVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar, nqi nqiVar) {
        cnVar.zmn(zmn, new kw(fktVar, nqiVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        return r7;
     */
    @Override // com.bytedance.sdk.component.zmn.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        JSONObject jSONObject2;
        jSONObject2 = new JSONObject();
        str.hashCode();
        switch (str) {
            case "responseHeartBeat":
                Log.d("BaseManagerBundle", "invoke: ");
                this.zn.phc();
                jSONObject2.put("success", true);
                break;
            case "commitDislike":
                btk(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "closeLandingPage":
                fs(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "renderLandingPage":
                zn(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "trackVideoStateWithOmSdk":
                nps(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "callBackToPublisher":
                zg(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "changeLpClickable":
                zmn(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "postVideoState":
                fb(jSONObject);
                jSONObject2.put("success", true);
                break;
            case "trackUrl":
                hhw(jSONObject);
                break;
            case "sendStatsLog":
                bvs(jSONObject);
                jSONObject2.put("success", true);
                break;
        }
    }

    private void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("lpClickable", true);
        this.zn.zmn(jSONObject.optString(SDKConstants.PARAM_SESSION_ID), optBoolean);
    }

    private void fs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.zn.nps(jSONObject.optString("url"));
    }

    private void zn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.zn.zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fb.fs(jSONObject));
    }

    private void fb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        float optDouble = (float) jSONObject.optDouble("percent");
        jSONObject.optInt("current");
        jSONObject.optInt(IronSourceConstants.EVENTS_DURATION);
        jSONObject.optInt("play_count");
        if (this.fs || optDouble < 0.3f || this.fb == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoPercent30", this.fb);
        this.fs = true;
    }

    private void btk(JSONObject jSONObject) {
        FilterWord fs;
        if (jSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filter_words");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (fs = com.bytedance.sdk.openadsdk.core.fs.fs(optJSONObject)) != null) {
                    arrayList.add(fs);
                }
            }
        }
        String optString = jSONObject.optString("dislike_source");
        com.bytedance.sdk.openadsdk.zn.fs.zmn().zmn(jSONObject.optString("ext"), arrayList, null, jSONObject.optString("suggestion"), optString);
    }

    private void hhw(JSONObject jSONObject) {
        if (jSONObject == null || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.mw.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn()))) {
            return;
        }
        int optInt = jSONObject.optInt("type");
        List<String> zmn2 = zmn(jSONObject.optJSONArray("urls"));
        String optString = jSONObject.optString(CreativeInfo.c);
        if (optInt == 1) {
            com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(zmn2, true), 1, optString);
        } else if (optInt == 2) {
            com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(zmn2, true), 2, optString);
        }
    }

    private List<String> zmn(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }

    private void nps(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.zn.zmn(jSONObject.optInt("state"), jSONObject);
    }

    private void zg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.zn.btk(jSONObject.optInt("type"));
    }

    private void bvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        final String optString = jSONObject.optString("type");
        int optInt = jSONObject.optInt("isRealTime");
        jSONObject.optInt("defaultRate");
        final JSONObject optJSONObject = jSONObject.optJSONObject("ext");
        com.bytedance.sdk.openadsdk.cyb.fb.zmn(optString, optInt == 1, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.kw.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject2 = optJSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn(optString).fs(jSONObject2.toString());
            }
        });
    }
}
