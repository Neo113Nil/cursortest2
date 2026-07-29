package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.adt.bean.AdBean;
import com.applovin.mediation.AppLovinNativeAdapter;
import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʼʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0137 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f448;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f449;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f450;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f451;

    public C0137(String str) {
        this.f450 = str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static AdBean m519(JSONObject jSONObject) {
        AdBean.C0199 c0199 = new AdBean.C0199();
        c0199.m774(jSONObject.toString()).m786(jSONObject.optString("campaign_id")).m780(jSONObject.optString(AppLovinNativeAdapter.KEY_EXTRA_AD_ID)).m793(jSONObject.optString("ad_type")).m778(jSONObject.optString("apk_url")).m790(jSONObject.optString(TJAdUnitConstants.String.TITLE)).m783(jSONObject.optString("description")).m794(jSONObject.optString("ad_url")).m781(jSONObject.optBoolean("cache_video", false)).m788(jSONObject.optString("cid")).m789(jSONObject.optString("icon_url")).m779(jSONObject.optString("mainimg_url")).m777(jSONObject.optString("video_url")).m776(jSONObject.optBoolean("is_webview", false)).m792(jSONObject.optString("google_store_id")).m769(jSONObject.optString(TapjoyConstants.TJC_APP_ID)).m787(jSONObject.optString("play_url")).m784(jSONObject.optDouble("rating")).m785(jSONObject.optInt(WebUtils.SC)).m768(jSONObject.optInt("action")).m773(jSONObject.optInt("expire_at")).m772(jSONObject.optInt("vpc")).m782(jSONObject.optString("resource_md5"));
        JSONArray optJSONArray = jSONObject.optJSONArray("imptrackers");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
            c0199.m775(arrayList);
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("clks");
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            ArrayList arrayList2 = new ArrayList();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString2 = optJSONArray2.optString(i2);
                if (!TextUtils.isEmpty(optString2)) {
                    arrayList2.add(optString2);
                }
            }
            c0199.m791(arrayList2);
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("resources");
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            ArrayList arrayList3 = new ArrayList();
            int length3 = optJSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                String optString3 = optJSONArray3.optString(i3);
                if (!TextUtils.isEmpty(optString3)) {
                    arrayList3.add(optString3);
                }
            }
            c0199.m770(arrayList3);
        }
        return c0199.m771();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static AdBean m520(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            linkedList.add(m519(jSONArray.optJSONObject(i)));
        }
        return (AdBean) linkedList.pop();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlacementInfo{mId='");
        sb.append(this.f450);
        sb.append('\'');
        sb.append(", mWidth=");
        sb.append(this.f448);
        sb.append(", mHeight=");
        sb.append(this.f451);
        sb.append(", mAdType=");
        sb.append(this.f449);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m521() {
        return this.f448;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public int m522() {
        return this.f451;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public C0137 m523(int i) {
        int i2;
        this.f449 = i;
        if (i != 4) {
            switch (i) {
                case 0:
                    this.f448 = 640;
                    i2 = 100;
                    break;
                case 1:
                    this.f448 = 1200;
                    i2 = 627;
                    break;
            }
        } else {
            this.f448 = 768;
            i2 = 1024;
        }
        this.f451 = i2;
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public String m524() {
        return this.f450;
    }
}
