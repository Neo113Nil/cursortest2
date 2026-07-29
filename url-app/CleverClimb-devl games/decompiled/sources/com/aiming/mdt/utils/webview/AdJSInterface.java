package com.aiming.mdt.utils.webview;

import android.webkit.JavascriptInterface;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0162;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.Constants;
import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdJSInterface {
    private String TAG = "AdJSInterface";
    private SoftReference<InterfaceC0267> mCallback;
    private String ori_data;
    private String placementId;

    public AdJSInterface(String str, String str2, InterfaceC0267 interfaceC0267) {
        this.placementId = str;
        this.ori_data = str2;
        this.mCallback = new SoftReference<>(interfaceC0267);
    }

    @JavascriptInterface
    public void click() {
        if (this.mCallback.get() != null) {
            this.mCallback.get().click();
        }
    }

    @JavascriptInterface
    public void close() {
        if (this.mCallback.get() != null) {
            this.mCallback.get().close();
        }
    }

    @JavascriptInterface
    public String getCampaign() {
        return this.ori_data;
    }

    @JavascriptInterface
    public String getDid() {
        try {
            return (String) C0162.m619().m622("AdvertisingId", String.class);
        } catch (Throwable th) {
            C0282.m972("AdJSInterface", th);
            C0076.m232().m236(th);
            return "";
        }
    }

    @JavascriptInterface
    public String getDinfo() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("did", C0162.m619().m622("AdvertisingId", String.class));
            hashMap.put("placement_id", this.placementId);
            hashMap.put(TapjoyConstants.TJC_APP_ID, C0162.m619().m622("PackageName", String.class));
            hashMap.put("make", C0162.m619().m622("Manufacturer", String.class));
            hashMap.put("brand", C0162.m619().m622("Brand", String.class));
            hashMap.put("model", C0162.m619().m622("Model", String.class));
            hashMap.put("osv", C0162.m619().m622("OSVersion", String.class));
            hashMap.put("sdkv", Constants.SDK_V);
            hashMap.put("con_type", C0162.m619().m622("ConnectType", String.class));
            hashMap.put(d.O, C0162.m619().m622("NetworkOperatorName", String.class));
            hashMap.put(WebUtils.LANG, C0162.m619().m622("Lang", String.class));
            hashMap.put("lang_code", C0162.m619().m622("LangCode", String.class));
            return new JSONObject(hashMap).toString();
        } catch (Throwable th) {
            C0282.m972("AdJSInterface", th);
            C0076.m232().m236(th);
            return "";
        }
    }

    @JavascriptInterface
    public String getPlacement() {
        return "";
    }

    @JavascriptInterface
    public String getPlacementId() {
        return this.placementId;
    }

    @JavascriptInterface
    public void hideClose() {
        if (this.mCallback.get() != null) {
            this.mCallback.get().hideClose();
        }
    }

    @JavascriptInterface
    public boolean isVideoReady() {
        if (this.mCallback.get() == null || !(this.mCallback.get() instanceof InterfaceC0268)) {
            return false;
        }
        return ((InterfaceC0268) this.mCallback.get()).isVideoReady();
    }

    @JavascriptInterface
    public void loadVideo() {
        if (this.mCallback.get() == null || !(this.mCallback.get() instanceof InterfaceC0268)) {
            return;
        }
        ((InterfaceC0268) this.mCallback.get()).loadVideo();
    }

    public void onDestroy() {
        this.mCallback.clear();
    }

    @JavascriptInterface
    public boolean playVideo() {
        if (this.mCallback.get() == null || !(this.mCallback.get() instanceof InterfaceC0268)) {
            return false;
        }
        return ((InterfaceC0268) this.mCallback.get()).playVideo();
    }

    @JavascriptInterface
    public void showClose() {
        if (this.mCallback.get() != null) {
            this.mCallback.get().showClose();
        }
    }
}
