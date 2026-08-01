package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.IP;
import com.bytedance.sdk.openadsdk.core.vA;
import com.bytedance.sdk.openadsdk.icD.icD;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.ktor.client.utils.CacheControl;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAndroidObject.java */
/* loaded from: classes2.dex */
public class CvL implements com.bytedance.sdk.component.adexpress.NB.icD, dyT.pvs, com.bytedance.sdk.openadsdk.yiw.icD {
    private static final Map<String, Boolean> so;
    private com.bytedance.sdk.openadsdk.core.icD.Jd CvL;
    private com.bytedance.sdk.openadsdk.Mxy.icD Gp;
    private String IP;
    private WeakReference<SSWebView> Jd;
    private int Ju;
    private com.bytedance.sdk.openadsdk.yiw.vG Mxy;
    private com.bytedance.sdk.openadsdk.yiw.Jd OT;
    private com.bytedance.sdk.openadsdk.core.widget.pvs.pvs OhP;
    private boolean SE;
    private String Wyp;
    private com.bytedance.sdk.openadsdk.Mxy.NB ZhG;
    private pvs ZsW;
    private com.bytedance.sdk.openadsdk.Mxy.Mxy ae;
    private int bNS;
    private JSONObject cR;
    private JSONObject dX;
    private HashMap<String, Mxy> dx;
    private com.bytedance.sdk.openadsdk.Mxy.Jd dyT;
    private com.bytedance.sdk.openadsdk.core.video.vG.icD ea;
    private com.bytedance.sdk.component.pvs.vA gSd;
    boolean icD;
    private com.bytedance.sdk.openadsdk.Mxy.sUS jhZ;
    private List<com.bytedance.sdk.openadsdk.core.model.cR> jlb;
    private String kj;
    private com.bytedance.sdk.openadsdk.Mxy.pvs ny;
    protected Map<String, Object> pvs;
    private String qD;
    private WeakReference<View> qh;
    private JSONObject rCZ;
    private com.bytedance.sdk.openadsdk.icD.vG.NB sP;
    private String sUS;
    private Context sq;
    private com.bytedance.sdk.openadsdk.core.nativeexpress.kj uc;
    private com.bytedance.sdk.openadsdk.core.model.cR vA;
    private boolean yWX;
    private com.bytedance.sdk.openadsdk.core.widget.icD yiw;
    private com.bytedance.sdk.component.adexpress.icD.qh zM;
    private boolean mnm = true;
    private boolean gA = true;
    private boolean Pj = false;
    private boolean cRf = false;
    boolean vG = false;
    private boolean od = false;
    private final com.bytedance.sdk.component.utils.dyT NB = new com.bytedance.sdk.component.utils.dyT(Looper.getMainLooper(), this);

    /* compiled from: TTAndroidObject.java */
    public static class icD {
        public JSONObject Jd;
        public int NB;
        public String icD;
        public String pvs;
        public String vG;
    }

    /* compiled from: TTAndroidObject.java */
    public interface pvs {
        void pvs();
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        so = concurrentHashMap;
        concurrentHashMap.put("log_event", Boolean.TRUE);
        concurrentHashMap.put(CacheControl.PRIVATE, Boolean.TRUE);
        concurrentHashMap.put("dispatch_message", Boolean.TRUE);
        concurrentHashMap.put("custom_event", Boolean.TRUE);
        concurrentHashMap.put("log_event_v3", Boolean.TRUE);
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.core.widget.pvs.pvs pvsVar) {
        this.OhP = pvsVar;
        return this;
    }

    public CvL(Context context) {
        this.sq = context;
    }

    public CvL icD(String str) {
        this.sUS = str;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.core.widget.icD icd) {
        this.yiw = icd;
        return this;
    }

    public CvL pvs(SSWebView sSWebView) {
        WebView webView = sSWebView.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.pvs.vA icD2 = com.bytedance.sdk.component.pvs.vA.pvs(webView).pvs(new com.bytedance.sdk.openadsdk.so.pvs()).pvs("ToutiaoJSBridge").pvs(new com.bytedance.sdk.component.pvs.kj() { // from class: com.bytedance.sdk.openadsdk.core.CvL.1
                @Override // com.bytedance.sdk.component.pvs.kj
                public <T> T pvs(String str, Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.pvs.kj
                public <T> String pvs(T t) {
                    return null;
                }
            }).pvs(so.icD().vA()).icD(true).pvs().icD();
            this.gSd = icD2;
            com.bytedance.sdk.openadsdk.so.pvs.NB.pvs(icD2, this);
            com.bytedance.sdk.openadsdk.so.pvs.pvs.pvs(this.gSd, this);
            com.bytedance.sdk.openadsdk.so.pvs.icD.pvs(this.gSd, this);
            com.bytedance.sdk.openadsdk.so.pvs.vG.pvs(this.gSd, this);
            com.bytedance.sdk.openadsdk.so.pvs.Jd.pvs(this.gSd, this);
            com.bytedance.sdk.openadsdk.so.pvs.yiw.pvs(this.gSd, this);
            com.bytedance.sdk.openadsdk.so.pvs.Mxy.pvs(this.gSd, this);
            com.bytedance.sdk.openadsdk.so.pvs.so.pvs(this.gSd, sSWebView);
            com.bytedance.sdk.openadsdk.so.pvs.sUS.pvs(this.gSd, this);
        } catch (Exception unused) {
        }
        return this;
    }

    public com.bytedance.sdk.component.pvs.vA pvs() {
        return this.gSd;
    }

    private WebView Ju() {
        SSWebView sSWebView;
        WeakReference<SSWebView> weakReference = this.Jd;
        if (weakReference == null || (sSWebView = weakReference.get()) == null) {
            return null;
        }
        return sSWebView.getWebView();
    }

    public CvL icD(SSWebView sSWebView) {
        this.Jd = new WeakReference<>(sSWebView);
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.icD.vG.NB nb) {
        this.sP = nb;
        return this;
    }

    public CvL pvs(boolean z) {
        this.icD = z;
        return this;
    }

    public CvL icD(boolean z) {
        this.cRf = z;
        return this;
    }

    public CvL vG(String str) {
        this.Wyp = str;
        return this;
    }

    public CvL pvs(View view) {
        this.qh = new WeakReference<>(view);
        return this;
    }

    @JProtect
    private JSONObject IP() {
        View view;
        SSWebView sSWebView;
        try {
            view = this.qh.get();
            sSWebView = this.Jd.get();
        } catch (Throwable unused) {
        }
        if (view == null || sSWebView == null) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
            return null;
        }
        int[] icD2 = Pj.icD(view);
        int[] icD3 = Pj.icD((View) sSWebView);
        if (icD2 != null && icD3 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x", Pj.vG(mnm.pvs(), icD2[0] - icD3[0]));
            jSONObject.put("y", Pj.vG(mnm.pvs(), icD2[1] - icD3[1]));
            jSONObject.put("w", Pj.vG(mnm.pvs(), view.getWidth()));
            jSONObject.put("h", Pj.vG(mnm.pvs(), view.getHeight()));
            jSONObject.put("isExist", true);
            return jSONObject;
        }
        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
        return null;
    }

    public CvL pvs(int i) {
        this.bNS = i;
        return this;
    }

    public void icD() {
        com.bytedance.sdk.component.pvs.vA vAVar = this.gSd;
        if (vAVar == null) {
            return;
        }
        vAVar.pvs();
        this.gSd = null;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        this.vA = cRVar;
        if (cRVar != null) {
            this.cR = cRVar.MY();
        }
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.Mxy.icD icd) {
        this.Gp = icd;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.Mxy.Mxy mxy) {
        this.ae = mxy;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.model.cR vG() {
        return this.vA;
    }

    public boolean Jd() {
        com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
        return cRVar != null && cRVar.ny();
    }

    public CvL Jd(String str) {
        this.kj = str;
        return this;
    }

    public CvL icD(int i) {
        this.Ju = i;
        return this;
    }

    public CvL NB(String str) {
        this.IP = str;
        return this;
    }

    private List<String> bNS() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    public CvL pvs(Map<String, Object> map) {
        this.pvs = map;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.component.adexpress.icD.qh qhVar) {
        this.zM = qhVar;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.core.nativeexpress.kj kjVar) {
        this.uc = kjVar;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.yiw.Jd jd) {
        this.OT = jd;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.core.icD.Jd jd) {
        this.CvL = jd;
        return this;
    }

    public CvL pvs(JSONObject jSONObject) {
        this.rCZ = jSONObject;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.Mxy.pvs pvsVar) {
        this.ny = pvsVar;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.Mxy.NB nb) {
        this.ZhG = nb;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.Mxy.Jd jd) {
        this.dyT = jd;
        return this;
    }

    public CvL pvs(List<com.bytedance.sdk.openadsdk.core.model.cR> list) {
        this.jlb = list;
        return this;
    }

    public CvL pvs(com.bytedance.sdk.openadsdk.Mxy.sUS sus) {
        this.jhZ = sus;
        return this;
    }

    public boolean NB() {
        return this.vG;
    }

    @JProtect
    private void pvs(JSONObject jSONObject, int i) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = bNS().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.pvs.pvs());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.pvs.NB());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.pvs.icD());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.pvs.vG());
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_VERSION, com.bytedance.sdk.openadsdk.common.pvs.Jd());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.pvs.sUS());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.pvs.pvs(mnm.pvs()));
        if (DeviceUtils.icD(mnm.pvs())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    private void yiw(JSONObject jSONObject) throws Exception {
        if (this.SE) {
            com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
            if ((cRVar instanceof com.bytedance.sdk.openadsdk.core.model.zM) && ((com.bytedance.sdk.openadsdk.core.model.zM) cRVar).aSt()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.cR cRVar2 : ((com.bytedance.sdk.openadsdk.core.model.zM) this.vA).XY()) {
                    JSONObject jSONObject2 = new JSONObject();
                    pvs(jSONObject2, cRVar2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        pvs(jSONObject, this.vA);
    }

    private static void pvs(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.cR cRVar) throws Exception {
        String neB = cRVar.neB();
        if (!TextUtils.isEmpty(neB)) {
            jSONObject.put("cid", neB);
        }
        String HWd = cRVar.HWd();
        if (!TextUtils.isEmpty(HWd)) {
            jSONObject.put("log_extra", HWd);
        }
        String Sn = cRVar.Sn();
        if (!TextUtils.isEmpty(Sn)) {
            jSONObject.put("download_url", Sn);
        }
        jSONObject.put("dc", TextUtils.isEmpty(mnm.Jd().OhP()) ? mnm.Jd().OhP() : "SG");
        jSONObject.put("language", qh.pvs());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().HWd());
    }

    private void so(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.rCZ.Jd(this.vA))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.rCZ.Jd(this.vA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x034e, code lost:
    
        if (r4 != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x039b, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0399, code lost:
    
        if (r4 != null) goto L225;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject pvs(icD icd, int i) throws Exception {
        char c;
        JSONObject jSONObject;
        Context context;
        JSONObject jSONObject2;
        if (!NotificationCompat.CATEGORY_CALL.equals(icd.pvs)) {
            return null;
        }
        if (so.icD().vA()) {
            Log.d("TTAD.AndroidObject", "[JSB-REQ] version:" + i + " method:" + icd.vG);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str = icd.vG;
        str.hashCode();
        switch (str.hashCode()) {
            case -2036781162:
                if (str.equals("subscribe_app_ad")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1423303823:
                if (str.equals("adInfo")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1330994877:
                if (str.equals("pauseWebView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1169135450:
                if (str.equals("changeVideoState")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1023873614:
                if (str.equals("openAdLandPageLinks")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -844321441:
                if (str.equals("webview_time_track")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -800853518:
                if (str.equals("clickEvent")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -794273169:
                if (str.equals("appInfo")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -715147645:
                if (str.equals("getScreenSize")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -511324706:
                if (str.equals("openPrivacy")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -489318846:
                if (str.equals("getMaterialMeta")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -278382602:
                if (str.equals("send_temai_product_ids")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -173752734:
                if (str.equals("getTeMaiAds")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 27837080:
                if (str.equals("download_app_ad")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 105049135:
                if (str.equals("unsubscribe_app_ad")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 399543522:
                if (str.equals("getCloseButtonInfo")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 402955465:
                if (str.equals("isViewable")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 425443791:
                if (str.equals("getNativeSiteCustomData")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 442647767:
                if (str.equals("sendReward")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 571273292:
                if (str.equals("dynamicTrack")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 650209982:
                if (str.equals("getTemplateInfo")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 672928467:
                if (str.equals("cancel_download_app_ad")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 711635577:
                if (str.equals("getCurrentVideoState")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 885131792:
                if (str.equals("getVolume")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1107374321:
                if (str.equals("pauseWebViewTimers")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (str.equals("muteVideo")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1237100796:
                if (str.equals("renderDidFinish")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1532142616:
                if (str.equals("removeLoading")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1634511418:
                if (str.equals("endcard_load")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1713585602:
                if (str.equals("getNetworkData")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1731806400:
                if (str.equals("playable_style")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 1979895452:
                if (str.equals("sendLog")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2086000188:
                if (str.equals("skipVideo")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case 2105008900:
                if (str.equals("landscape_click")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ny();
                com.bytedance.sdk.openadsdk.icD.vG.icD(this.vA, this.qD, 0, (JSONObject) null);
                Context context2 = this.sq;
                if (context2 != null) {
                    this.Mxy.pvs(context2, icd.Jd, this.kj, this.Ju, this.mnm);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.icD.vG.icD(this.vA, this.qD, -1, (JSONObject) null);
                    break;
                }
            case 1:
                yiw(jSONObject3);
                break;
            case 2:
                vA();
                break;
            case 3:
                kj(icd.Jd);
                break;
            case 4:
                JSONObject jSONObject4 = icd.Jd;
                if (pvs(jSONObject4, jSONObject3)) {
                    icD(jSONObject4);
                    break;
                }
                break;
            case 5:
                Mxy(icd.Jd);
                break;
            case 6:
                vG(icd.Jd);
                break;
            case 7:
                pvs(jSONObject3, icd.NB);
                break;
            case '\b':
                com.bytedance.sdk.openadsdk.Mxy.pvs pvsVar = this.ny;
                if (pvsVar != null) {
                    int icD2 = pvsVar.icD();
                    int pvs2 = this.ny.pvs();
                    jSONObject3.put("width", icD2);
                    jSONObject3.put("height", pvs2);
                    break;
                }
                break;
            case '\t':
                uc();
                break;
            case '\n':
                cR(jSONObject3);
                break;
            case 11:
                vA(icd.Jd);
                break;
            case '\f':
                jSONObject = this.dX;
                break;
            case '\r':
                this.od = true;
                com.bytedance.sdk.openadsdk.icD.vG.icD(this.vA, this.qD, 1, (JSONObject) null);
                com.bytedance.sdk.openadsdk.core.icD.Jd jd = this.CvL;
                if (jd != null) {
                    jd.icD(this.gA);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.yiw.vG vGVar = this.Mxy;
                    if (vGVar != null && (context = this.sq) != null) {
                        vGVar.pvs(context, icd.Jd, this.qD);
                        com.bytedance.sdk.openadsdk.core.video.vG.icD icd2 = this.ea;
                        if (icd2 != null) {
                            icd2.Jd();
                            break;
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.icD.vG.icD(this.vA, this.qD, -2, (JSONObject) null);
                        break;
                    }
                }
                break;
            case 14:
                sUS();
                break;
            case 15:
                com.bytedance.sdk.openadsdk.yiw.vG vGVar2 = this.Mxy;
                if (vGVar2 != null) {
                    vGVar2.pvs(icd.Jd);
                    break;
                }
                break;
            case 16:
                jSONObject = IP();
                break;
            case 17:
                jSONObject3.put("viewStatus", this.cRf ? 1 : 0);
                break;
            case 18:
                com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
                if (cRVar != null && !TextUtils.isEmpty(cRVar.Pj())) {
                    jSONObject3.put("data", this.vA.Pj());
                    break;
                }
                break;
            case 19:
                this.vG = true;
                com.bytedance.sdk.openadsdk.Mxy.NB nb = this.ZhG;
                if (nb != null) {
                    nb.pvs();
                    break;
                }
                break;
            case 20:
                mnm(icd.Jd);
                break;
            case 21:
                JSONObject jSONObject5 = this.rCZ;
                if (jSONObject5 != null) {
                    jSONObject5.put("setting", rCZ());
                    com.bytedance.sdk.openadsdk.core.model.cR cRVar2 = this.vA;
                    if (cRVar2 != null) {
                        this.rCZ.put("extension", cRVar2.RKd());
                    }
                }
                jSONObject3 = this.rCZ;
                break;
            case 23:
                Ju(jSONObject3);
                break;
            case 24:
                AudioManager audioManager = (AudioManager) mnm.pvs().getSystemService("audio");
                jSONObject3.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case 25:
                cR();
                break;
            case 26:
                qh(icd.Jd);
                break;
            case 27:
                IP(icd.Jd);
                break;
            case 28:
                com.bytedance.sdk.openadsdk.Mxy.Jd jd2 = this.dyT;
                if (jd2 != null) {
                    jd2.pvs();
                    break;
                }
                break;
            case 29:
                Wyp(icd.Jd);
                break;
            case 30:
                pvs(icd, jSONObject3);
                break;
            case 31:
                so(jSONObject3);
                break;
            case ' ':
                JSONObject jSONObject6 = icd.Jd;
                if (jSONObject6 != null && (jSONObject2 = jSONObject6.getJSONObject("extJson")) != null && jSONObject2.has("category") && jSONObject2.has("tag") && jSONObject2.has("label")) {
                    String optString = jSONObject2.optString("category");
                    String optString2 = jSONObject2.optString("tag");
                    String optString3 = jSONObject2.optString("label");
                    long optLong = jSONObject6.optLong("value");
                    long optLong2 = jSONObject6.optLong("extValue");
                    try {
                        jSONObject2.putOpt("ua_policy", Integer.valueOf(this.bNS));
                    } catch (Exception unused) {
                    }
                    if ("click".equals(optString3)) {
                        jSONObject2 = uc(jSONObject2);
                    }
                    String pvs3 = pvs(optString2, optString3);
                    boolean Jd = com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.vA);
                    pvs(jSONObject2, Jd, optString3);
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, optString, pvs3, optString3, optLong, optLong2, jSONObject2, Jd);
                    break;
                }
                break;
            case '!':
                zM();
                break;
            case '\"':
                Context context3 = this.sq;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.video.vG.icD) {
                    ((com.bytedance.sdk.openadsdk.core.video.vG.icD) context3).Jd();
                    break;
                }
                break;
        }
        if (i == 1 && !TextUtils.isEmpty(icd.icD)) {
            icD(icd.icD, jSONObject3);
            if (so.icD().vA()) {
                Log.d("TTAD.AndroidObject", "[JSB-RSP] version:" + i + " data=" + jSONObject3);
            }
        }
        return jSONObject3;
    }

    private void pvs(JSONObject jSONObject, boolean z, String str) {
        com.bytedance.sdk.openadsdk.core.widget.icD icd;
        if (z) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString) || new JSONObject(optString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (icd = this.yiw) == null) {
                    return;
                }
                icd.pvs();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean pvs(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int i;
        String str2;
        if (jSONObject != null) {
            i = jSONObject.optInt("landingStyle");
            str = jSONObject.optString(ImagesContract.URL);
            str2 = jSONObject.optString("fallback_url");
        } else {
            str = null;
            i = -1;
            str2 = null;
        }
        boolean z = false;
        if (i == 1) {
            if (!com.bytedance.sdk.component.utils.mnm.pvs(str)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
                return z;
            }
        } else if (i == 2) {
            try {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.mnm.pvs(str2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
            return z;
        }
        z = true;
        return z;
    }

    public void sUS() {
        com.bytedance.sdk.openadsdk.Mxy.icD icd;
        if (this.yWX && (icd = this.Gp) != null) {
            icd.pvs();
            return;
        }
        Context context = this.sq;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.cR.pvs((Activity) context)) {
            ((Activity) this.sq).finish();
        }
    }

    public void icD(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("landingStyle");
        String optString = jSONObject.optString(ImagesContract.URL);
        String optString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", this.sq instanceof Activity);
        } catch (JSONException unused) {
        }
        boolean z = true;
        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, this.qD, 1, jSONObject);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            WebView Ju = Ju();
            if (Ju != null) {
                Ju.loadUrl(optString);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, this.qD, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, this.qD, -1, (JSONObject) null);
            }
        } else if (optInt == 1 || optInt == 8) {
            com.bytedance.sdk.openadsdk.Wyp.pvs.icD icd = new com.bytedance.sdk.openadsdk.Wyp.pvs.icD();
            icd.pvs(icD.pvs.icD);
            icd.pvs(this.vA);
            icd.icD(this.qD);
            icd.pvs(-1);
            icd.pvs(false);
            icd.icD(this.vA.jhZ());
            com.bytedance.sdk.openadsdk.icD.vG.pvs(icd);
            com.bytedance.sdk.openadsdk.utils.cR.pvs(mnm(), optString, this.vA, icD.pvs.icD);
        } else if (optInt == 2) {
            Context mnm = mnm();
            if (!com.bytedance.sdk.openadsdk.utils.cR.icD(mnm, optString, this.vA, this.qD)) {
                com.bytedance.sdk.openadsdk.Wyp.pvs.icD icd2 = new com.bytedance.sdk.openadsdk.Wyp.pvs.icD();
                icd2.pvs(icD.pvs.icD);
                icd2.pvs(this.vA);
                icd2.icD(this.qD);
                icd2.pvs(-1);
                icd2.pvs(false);
                icd2.icD(this.vA.jhZ());
                com.bytedance.sdk.openadsdk.icD.vG.pvs(icd2);
                HashMap hashMap = new HashMap();
                hashMap.put("deeplink_url", optString);
                hashMap.put("fallback_url", optString2);
                hashMap.put("jsb_deeplink", 1);
                com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, this.qD, "open_fallback_url", hashMap);
                com.bytedance.sdk.openadsdk.utils.cR.pvs(mnm, optString2, this.vA, icD.pvs.icD);
            }
        } else if (optInt != 3) {
            z = false;
        } else if (ae.icD(mnm(), optString, this.vA, this.Ju, this.qD, false)) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, this.qD, 3, (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.vA, this.qD, -2, (JSONObject) null);
        }
        com.bytedance.sdk.openadsdk.core.widget.icD icd3 = this.yiw;
        if (icd3 == null || !z) {
            return;
        }
        icd3.pvs();
    }

    private Context mnm() {
        WeakReference<SSWebView> weakReference = this.Jd;
        Activity pvs2 = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.icD.pvs(this.Jd.get());
        return pvs2 == null ? this.sq : pvs2;
    }

    private void Mxy(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.icD.vG.NB nb;
        if (jSONObject == null || (nb = this.sP) == null) {
            return;
        }
        nb.icD(jSONObject);
    }

    private void pvs(String str, boolean z) {
        if (this.sP == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.sP.pvs(str);
        } else {
            this.sP.icD(str);
        }
    }

    private void vA() {
        com.bytedance.sdk.openadsdk.Mxy.Mxy mxy = this.ae;
        if (mxy == null) {
            return;
        }
        mxy.pvs();
    }

    private void cR() {
        com.bytedance.sdk.openadsdk.Mxy.Mxy mxy = this.ae;
        if (mxy == null) {
            return;
        }
        mxy.icD();
    }

    private void Wyp(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.Mxy.icD icd = this.Gp;
        if (icd == null || jSONObject == null) {
            return;
        }
        icd.pvs(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            yiw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            pvs(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public String getTemplateInfo() {
        pvs("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.rCZ;
            if (jSONObject != null) {
                jSONObject.put("setting", rCZ());
                com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
                if (cRVar != null) {
                    this.rCZ.put("extension", cRVar.RKd());
                }
            }
            pvs("getTemplateInfo", false);
            return this.rCZ.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            IP(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CvL.3
                @Override // java.lang.Runnable
                public void run() {
                    CvL.this.qh(jSONObject);
                }
            });
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            mnm(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CvL.4
                @Override // java.lang.Runnable
                public void run() {
                    CvL.this.kj(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CvL.5
                @Override // java.lang.Runnable
                public void run() {
                    CvL.this.vG(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CvL.6
            @Override // java.lang.Runnable
            public void run() {
                CvL.this.zM();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        Ju(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CvL.7
            @Override // java.lang.Runnable
            public void run() {
                if (CvL.this.OhP != null) {
                    CvL.this.OhP.pvs();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    public void pvs(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("time");
            String optString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.nativeexpress.kj kjVar = this.uc;
            if (kjVar != null) {
                kjVar.pvs(optInt, optString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zM() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.kj kjVar = this.uc;
        if (kjVar != null) {
            kjVar.pvs();
        }
    }

    private void uc() {
        if (this.sq == null || TextUtils.isEmpty(mnm.Jd().gSd())) {
            return;
        }
        TTWebsiteActivity.pvs(this.sq, this.vA, this.qD);
    }

    public void yiw() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.kj kjVar = this.uc;
        if (kjVar != null) {
            kjVar.icD();
        }
    }

    public void sUS(String str) {
        this.qD = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh(JSONObject jSONObject) {
        if (this.uc == null || jSONObject == null) {
            return;
        }
        try {
            this.uc.pvs(jSONObject.optBoolean("mute", false));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kj(JSONObject jSONObject) {
        if (this.uc == null || jSONObject == null) {
            return;
        }
        try {
            this.uc.pvs(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private boolean Ju(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.kj kjVar = this.uc;
        if (kjVar != null && jSONObject != null) {
            double vG = kjVar.vG();
            int Jd = this.uc.Jd();
            try {
                jSONObject.put("currentTime", vG / 1000.0d);
                jSONObject.put(RemoteConfigConstants.ResponseFieldKey.STATE, Jd);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[Catch: Exception -> 0x00d2, TryCatch #0 {Exception -> 0x00d2, blocks: (B:6:0x000c, B:8:0x0011, B:9:0x0017, B:11:0x001b, B:12:0x0021, B:14:0x004e, B:22:0x0067, B:23:0x0080, B:25:0x009a, B:28:0x00a3, B:30:0x00ac, B:31:0x00b2, B:33:0x00c4, B:36:0x00cf, B:41:0x0074), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    @JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject rCZ() {
        int i;
        int yTz;
        int VLm;
        int Wyp;
        int zM;
        boolean sUS;
        boolean z;
        boolean vA;
        JSONObject jSONObject = new JSONObject();
        if (mnm.Jd() == null) {
            return jSONObject;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
            i = 0;
            yTz = cRVar != null ? cRVar.yTz() : 0;
            com.bytedance.sdk.openadsdk.core.model.cR cRVar2 = this.vA;
            VLm = cRVar2 != null ? cRVar2.VLm() : 0;
            Wyp = mnm.Jd().Wyp(String.valueOf(yTz));
            zM = mnm.Jd().zM(String.valueOf(yTz));
            sUS = mnm.Jd().sUS(String.valueOf(yTz));
            z = !com.bytedance.sdk.openadsdk.core.model.cR.NB(this.vA) && mnm.Jd().Ju(String.valueOf(yTz)) == 1;
        } catch (Exception unused) {
        }
        if (VLm != 7 && VLm != 8) {
            vA = mnm.Jd().vG(String.valueOf(yTz));
            jSONObject.put("voice_control", vA);
            jSONObject.put("rv_skip_time", Wyp);
            jSONObject.put("fv_skip_show", sUS);
            jSONObject.put("iv_skip_time", zM);
            com.bytedance.sdk.openadsdk.core.model.cR cRVar3 = this.vA;
            jSONObject.put("show_dislike", cRVar3 == null && cRVar3.yhq());
            com.bytedance.sdk.openadsdk.core.model.cR cRVar4 = this.vA;
            jSONObject.put("video_adaptation", cRVar4 == null ? cRVar4.Gp() : 0);
            jSONObject.put("skip_change_to_close", z);
            if (this.vA.EAq() && com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().Mnp()) {
                i = 1;
            }
            jSONObject.put("bar_render_platform", i);
            return jSONObject;
        }
        vA = mnm.Jd().vA(String.valueOf(yTz));
        jSONObject.put("voice_control", vA);
        jSONObject.put("rv_skip_time", Wyp);
        jSONObject.put("fv_skip_show", sUS);
        jSONObject.put("iv_skip_time", zM);
        com.bytedance.sdk.openadsdk.core.model.cR cRVar32 = this.vA;
        jSONObject.put("show_dislike", cRVar32 == null && cRVar32.yhq());
        com.bytedance.sdk.openadsdk.core.model.cR cRVar42 = this.vA;
        jSONObject.put("video_adaptation", cRVar42 == null ? cRVar42.Gp() : 0);
        jSONObject.put("skip_change_to_close", z);
        if (this.vA.EAq()) {
            i = 1;
        }
        jSONObject.put("bar_render_platform", i);
        return jSONObject;
    }

    public void vG(JSONObject jSONObject) {
        String str;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.zM.pvs("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String optString = jSONObject.optString("adId");
            int optInt = jSONObject.optInt("areaType", 1);
            String optString2 = jSONObject.optString("clickAreaType");
            JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
            double d10 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("down_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                d3 = optJSONObject.optDouble("down_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble2 = optJSONObject.optDouble("up_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble3 = optJSONObject.optDouble("up_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble4 = optJSONObject.optDouble("down_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble5 = optJSONObject.optDouble("up_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble6 = optJSONObject.optDouble("button_x", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble7 = optJSONObject.optDouble("button_y", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble8 = optJSONObject.optDouble("button_width", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                double optDouble9 = optJSONObject.optDouble("button_height", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                jSONObject2 = optJSONObject.optJSONObject("rectInfo");
                d9 = optDouble9;
                d10 = optDouble;
                d2 = optDouble2;
                d4 = optDouble4;
                d5 = optDouble5;
                d6 = optDouble6;
                d7 = optDouble7;
                d8 = optDouble8;
                str = optString;
                d = optDouble3;
            } else {
                str = optString;
                d = 0.0d;
                d2 = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
                d7 = 0.0d;
                d8 = 0.0d;
                d9 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.model.IP pvs2 = new IP.pvs().Jd((float) d10).vG((float) d3).icD((float) d2).pvs((float) d).icD((long) d4).pvs((long) d5).vG((int) d6).Jd((int) d7).NB((int) d8).sUS((int) d9).pvs(optString2).pvs((SparseArray<vG.pvs>) null).pvs(true).icD(optInt).pvs(jSONObject2).pvs(jSONObject.optInt("clickAreaCategory", -1)).icD(optJSONObject).pvs();
            com.bytedance.sdk.component.adexpress.icD.qh qhVar = this.zM;
            if (qhVar != null) {
                qhVar.pvs(null, optInt, pvs2);
            }
            pvs(str, optInt, pvs2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.icD.qh qhVar2 = this.zM;
            if (qhVar2 != null) {
                qhVar2.pvs(null, -1, null);
            }
        }
    }

    @JProtect
    private void IP(JSONObject jSONObject) {
        int i;
        double d;
        double d2;
        JSONObject optJSONObject;
        boolean z;
        double d3;
        String optString;
        int optInt;
        com.bytedance.sdk.openadsdk.Mxy.sUS sus;
        CvL cvL = this;
        if (cvL.zM == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.icD.IP ip = new com.bytedance.sdk.component.adexpress.icD.IP();
        ip.pvs(1);
        try {
            boolean optBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("AdSize");
            if (optJSONObject2 != null) {
                d = optJSONObject2.optDouble("width");
                d2 = optJSONObject2.optDouble("height");
            } else {
                d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                d2 = 0.0d;
            }
            optJSONObject = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject != null) {
                try {
                    double optDouble = optJSONObject.optDouble("x");
                    double optDouble2 = optJSONObject.optDouble("y");
                    z = optBoolean;
                    double optDouble3 = optJSONObject.optDouble("width");
                    double optDouble4 = optJSONObject.optDouble("height");
                    if (cvL.bNS(optJSONObject)) {
                        d3 = d2;
                        ip.pvs((float) optJSONObject.optDouble("borderRadiusTopLeft"));
                        ip.icD((float) optJSONObject.optDouble("borderRadiusTopRight"));
                        ip.vG((float) optJSONObject.optDouble("borderRadiusBottomLeft"));
                        ip.Jd((float) optJSONObject.optDouble("borderRadiusBottomRight"));
                    } else {
                        d3 = d2;
                    }
                    ip.vG(optDouble);
                    ip.Jd(optDouble2);
                    ip.NB(optDouble3);
                    ip.sUS(optDouble4);
                } catch (Exception unused) {
                    i = 101;
                    cvL = this;
                    ip.icD(i);
                    ip.pvs(yiw.pvs(i));
                    cvL.zM.pvs(ip);
                }
            } else {
                z = optBoolean;
                d3 = d2;
            }
            try {
                optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE, yiw.pvs(101));
                optInt = jSONObject.optInt("code", 101);
            } catch (Exception unused2) {
                cvL = this;
                i = 101;
                ip.icD(i);
                ip.pvs(yiw.pvs(i));
                cvL.zM.pvs(ip);
            }
        } catch (Exception unused3) {
        }
        try {
            ip.pvs(z);
            ip.pvs(d);
            ip.icD(d3);
            ip.pvs(optString);
            ip.icD(optInt);
            cvL = this;
            cvL.zM.pvs(ip);
            if (optJSONObject == null || (sus = cvL.jhZ) == null) {
                return;
            }
            sus.pvs(ip);
        } catch (Exception unused4) {
            cvL = this;
            i = 101;
            ip.icD(i);
            ip.pvs(yiw.pvs(i));
            cvL.zM.pvs(ip);
        }
    }

    private boolean bNS(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void mnm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.bNS.pvs(parse, this);
            }
        } catch (Exception unused) {
        }
    }

    private void vA(JSONObject jSONObject) {
        if (jSONObject == null || this.OT == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.OT.pvs(true, optJSONArray);
            } else {
                this.OT.pvs(false, null);
            }
        } catch (Exception unused) {
            this.OT.pvs(false, null);
        }
    }

    private boolean cR(JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", icD(this.jlb));
        } catch (Exception unused) {
        }
        return true;
    }

    private void pvs(final icD icd, final JSONObject jSONObject) {
        if (icd == null) {
            return;
        }
        try {
            pvs(icd.Jd, new com.bytedance.sdk.openadsdk.Mxy.vG() { // from class: com.bytedance.sdk.openadsdk.core.CvL.8
                @Override // com.bytedance.sdk.openadsdk.Mxy.vG
                public void pvs(boolean z, List<com.bytedance.sdk.openadsdk.core.model.cR> list) {
                    if (!z) {
                        CvL.this.icD(icd.icD, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", CvL.icD(list));
                        CvL.this.icD(icd.icD, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    @JProtect
    private boolean pvs(String str, int i, com.bytedance.sdk.openadsdk.core.model.IP ip) {
        HashMap<String, Mxy> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.dx) == null || hashMap.get(str) == null) {
            return false;
        }
        throw null;
    }

    @JProtect
    public void pvs(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.Mxy.vG vGVar) {
        if (vGVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.Mxy.vG vGVar2 = new com.bytedance.sdk.openadsdk.Mxy.vG() { // from class: com.bytedance.sdk.openadsdk.core.CvL.9
                @Override // com.bytedance.sdk.openadsdk.Mxy.vG
                public void pvs(final boolean z, final List<com.bytedance.sdk.openadsdk.core.model.cR> list) {
                    com.bytedance.sdk.openadsdk.utils.ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.CvL.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            vGVar.pvs(z, list);
                        }
                    });
                }
            };
            if (this.vA != null && !TextUtils.isEmpty(this.kj)) {
                int VLm = this.vA.VLm();
                AdSlot jlb = this.vA.jlb();
                com.bytedance.sdk.openadsdk.core.model.uc ucVar = new com.bytedance.sdk.openadsdk.core.model.uc();
                ucVar.sUS = true;
                if (this.vA.gSd() != null) {
                    ucVar.so = 2;
                }
                JSONObject jSONObject2 = this.cR;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                ucVar.yiw = jSONObject2;
                mnm.vG().pvs(jlb, ucVar, VLm, new vA.pvs() { // from class: com.bytedance.sdk.openadsdk.core.CvL.10
                    @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
                    public void pvs(int i, String str) {
                        vGVar2.pvs(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.vA.pvs
                    public void pvs(com.bytedance.sdk.openadsdk.core.model.pvs pvsVar, com.bytedance.sdk.openadsdk.core.model.icD icd) {
                        if (pvsVar.vG() != null && !pvsVar.vG().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.cR cRVar = pvsVar.vG().get(0);
                            if (cRVar != null) {
                                CvL.this.cR = cRVar.MY();
                            }
                            vGVar2.pvs(true, pvsVar.vG());
                            return;
                        }
                        vGVar2.pvs(false, null);
                        icd.pvs(-3);
                        com.bytedance.sdk.openadsdk.core.model.icD.pvs(icd);
                    }
                });
                return;
            }
            vGVar2.pvs(false, null);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.AndroidObject", "get ads error", e);
        }
    }

    public static JSONArray icD(List<com.bytedance.sdk.openadsdk.core.model.cR> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).wjr());
        }
        return jSONArray;
    }

    private boolean OT() {
        com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
        if (cRVar == null || cRVar.MY() == null || com.bytedance.sdk.openadsdk.core.model.rCZ.icD(this.vA) || this.Pj || this.vA.MY().optInt("parent_type") != 2) {
            return false;
        }
        int VLm = this.vA.VLm();
        if (VLm != 8 && VLm != 7) {
            return false;
        }
        this.Pj = true;
        return true;
    }

    public void vG(boolean z) {
        this.vG = z;
    }

    public boolean so() {
        return this.od;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            zM(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void zM(JSONObject jSONObject) {
        WebView Ju;
        if (jSONObject == null || (Ju = Ju()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.kj.pvs(Ju, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private void vG(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            zM(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void yiw(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                icD icd = new icD();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        icd.pvs = optJSONObject.optString("__msg_type", null);
                        icd.icD = optJSONObject.optString("__callback_id", null);
                        icd.vG = optJSONObject.optString("func");
                        icd.Jd = optJSONObject.optJSONObject("params");
                        icd.NB = optJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(icd.pvs) && !TextUtils.isEmpty(icd.vG)) {
                    Message obtainMessage = this.NB.obtainMessage(11);
                    obtainMessage.obj = icd;
                    this.NB.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public boolean pvs(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return so.containsKey(uri.getHost());
        }
        return false;
    }

    public void icD(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if (CacheControl.PRIVATE.equals(host) || "dispatch_message".equals(host)) {
                    Mxy(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.CvL.2
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String str;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    CvL.this.qD = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (CvL.this.so(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j3 = j2;
                        String queryParameter4 = uri.getQueryParameter("extra");
                        JSONObject jSONObject = null;
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(CvL.this.bNS));
                                } catch (Exception unused3) {
                                }
                                jSONObject = jSONObject2;
                            } catch (Exception unused4) {
                            }
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = CvL.this.uc(jSONObject);
                        }
                        if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                            str = CvL.this.pvs(queryParameter2, queryParameter3);
                        } else {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                for (String str2 : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str2)) {
                                            jSONObject3.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject3.put(str2, uri.getQueryParameter(str2));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                str = CvL.this.sUS;
                                jSONObject = jSONObject3;
                            } catch (Exception unused6) {
                                return;
                            }
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.pvs(CvL.this.vA, queryParameter, str, queryParameter3, j, j3, jSONObject, com.bytedance.sdk.openadsdk.core.model.mnm.Jd(CvL.this.vA));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean so(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return Mxy();
        }
        return true;
    }

    boolean Mxy() {
        com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
        return cRVar != null && cRVar.qD() == 1;
    }

    public void vG(int i) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.kj kjVar = this.uc;
        if (kjVar != null) {
            kjVar.icD(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject uc(JSONObject jSONObject) {
        if (this.pvs != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("ad_extra_data", null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry<String, Object> entry : this.pvs.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.icD(e.toString());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String pvs(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.vA)) {
            return "show".equals(str2) ? jlb.pvs(this.Ju) : "aggregate_page";
        }
        if (this.Gp != null) {
            return jlb.pvs(this.Ju);
        }
        return this.zM == null ? jlb.icD(this.Ju) : str;
    }

    private void Mxy(String str) {
        int indexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView Ju = Ju();
                    if (Ju != null) {
                        com.bytedance.sdk.component.utils.kj.pvs(Ju, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (!str.startsWith("bytedance://private/setresult/") || (indexOf = str.indexOf(38, 30)) <= 0) {
                    return;
                }
                String substring = str.substring(30, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (!substring.equals("SCENE_FETCHQUEUE") || substring2.length() <= 0) {
                    return;
                }
                yiw(substring2);
            } catch (Exception unused) {
            }
        }
    }

    public void Wyp() {
        OT();
    }

    public void qh() {
        com.bytedance.sdk.openadsdk.yiw.vG vGVar = this.Mxy;
        if (vGVar != null) {
            vGVar.pvs();
        }
        this.sq = null;
        this.ea = null;
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof icD)) {
            try {
                pvs((icD) message.obj, 1);
            } catch (Exception unused) {
            }
        }
    }

    private void ny() {
        if (this.Mxy == null) {
            this.Mxy = com.bytedance.sdk.openadsdk.yiw.pvs.pvs(this, this.vA);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.yiw.icD
    public void pvs(String str, JSONObject jSONObject) {
        vG(str, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.NB.icD
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("video_choose");
            long optLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.Mxy.sUS sus = this.jhZ;
            if (sus != null) {
                sus.pvs(optInt, optLong);
            }
        } catch (Exception unused) {
        }
    }

    public void kj() {
        pvs pvsVar = this.ZsW;
        if (pvsVar != null) {
            pvsVar.pvs();
        }
    }

    public void Jd(boolean z) {
        this.SE = z;
    }

    public void NB(boolean z) {
        this.yWX = z;
    }

    public void Jd(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.cR pvs2 = com.bytedance.sdk.openadsdk.core.icD.pvs(jSONObject);
        if (pvs2 != null) {
            boolean Jd = com.bytedance.sdk.openadsdk.core.model.mnm.Jd(this.vA);
            pvs(pvs2, Jd ? jlb.icD(this.Ju) : this.qD, !Jd);
        }
    }

    private void pvs(com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.icD.pvs(mnm.pvs(), cRVar, str, this.Ju);
        pvsVar.pvs(com.com.bytedance.overseas.sdk.pvs.Jd.pvs(mnm.pvs(), cRVar, str));
        if (!z) {
            pvsVar.pvs(false);
        }
        pvsVar.onClick(null);
    }

    public JSONObject NB(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
            if (cRVar instanceof com.bytedance.sdk.openadsdk.core.model.zM) {
                List<com.bytedance.sdk.openadsdk.core.model.cR> vG = ((com.bytedance.sdk.openadsdk.core.model.zM) cRVar).wgm().vG();
                for (int i = 0; i < vG.size(); i++) {
                    jSONArray.put(icD(vG.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private JSONObject icD(com.bytedance.sdk.openadsdk.core.model.cR cRVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put("cid", cRVar.cQ());
        jSONObject2.put("req_id", cRVar.Yjw());
        jSONObject2.put("ad_id", cRVar.neB());
        jSONObject2.put("log_extra", cRVar.HWd());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().HWd());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", cRVar.Jpl());
        return jSONObject;
    }

    public void sUS(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.pvs wgm;
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt(FirebaseAnalytics.Param.INDEX);
        com.bytedance.sdk.openadsdk.core.model.cR cRVar = this.vA;
        if (!(cRVar instanceof com.bytedance.sdk.openadsdk.core.model.zM) || (wgm = ((com.bytedance.sdk.openadsdk.core.model.zM) cRVar).wgm()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.cR> vG = wgm.vG();
        if (optInt < 0 || optInt >= vG.size()) {
            return;
        }
        pvs(vG.get(optInt), this.qD, false);
        com.bytedance.sdk.openadsdk.core.video.vG.icD icd = this.ea;
        if (icd != null) {
            icd.Jd();
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.video.vG.icD icd) {
        this.ea = icd;
    }

    public void pvs(pvs pvsVar) {
        this.ZsW = pvsVar;
    }
}
