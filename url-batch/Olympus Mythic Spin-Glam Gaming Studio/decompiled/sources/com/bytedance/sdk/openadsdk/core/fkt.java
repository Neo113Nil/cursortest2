package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.cyb;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.fb.zmn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.C4913ua;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fkt implements com.bytedance.sdk.component.adexpress.btk.fs, kjb.zmn, com.bytedance.sdk.openadsdk.rc.fs {
    private static final Map<String, Boolean> bvs;
    private com.bytedance.sdk.openadsdk.mw.rc am;
    private com.bytedance.sdk.openadsdk.mw.btk bjh;
    private WeakReference<com.bytedance.sdk.component.bvs.nps> btk;
    private com.bytedance.sdk.openadsdk.component.reward.zn.bvs bxw;
    private zn cd;
    private String cn;
    private boolean cud;
    private int cyb;
    private boolean dgt;
    private JSONObject doe;
    private Context gn;
    private com.bytedance.sdk.openadsdk.fb.fb.btk hgd;
    private com.bytedance.sdk.component.adexpress.fs.rc iqz;
    private com.bytedance.sdk.openadsdk.rc.zn iv;
    private com.bytedance.sdk.openadsdk.core.model.nqi kgc;
    private com.bytedance.sdk.openadsdk.core.zn.fb kjb;
    private WeakReference<View> klz;
    private Activity kra;
    private JSONObject kw;
    private com.bytedance.sdk.openadsdk.component.reward.zn.zmn mhu;
    private String mw;
    private com.bytedance.sdk.openadsdk.component.reward.zn.hhw na;
    private String nps;
    private com.bytedance.sdk.openadsdk.rc.fb nqi;
    private com.bytedance.sdk.component.zmn.cn nu;
    private String oub;
    private com.bytedance.sdk.openadsdk.core.iv.cyb phc;
    private String rc;
    private JSONObject rp;
    private int rt;
    private HashMap<String, rc> so;
    private com.bytedance.sdk.openadsdk.component.reward.zn.fb tet;
    private com.bytedance.sdk.openadsdk.core.cn.fb.fs uqd;
    private com.bytedance.sdk.openadsdk.mw.zmn uqh;
    private zmn ve;
    private com.bytedance.sdk.openadsdk.core.widget.zmn.fs vlj;
    private com.bytedance.sdk.openadsdk.mw.fs ww;
    private kjb xrr;
    private com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn yo;
    private com.bytedance.sdk.openadsdk.mw.zg yof;
    private com.bytedance.sdk.openadsdk.mw.zn zak;
    private com.bytedance.sdk.openadsdk.core.widget.btk zg;
    protected Map<String, Object> zmn;
    private boolean olo = true;
    private boolean yj = true;
    private boolean ev = false;
    private boolean tf = false;
    private boolean fkt = false;
    boolean fs = false;
    boolean zn = false;
    boolean fb = false;
    private boolean jy = false;
    private final com.bytedance.sdk.component.utils.kjb hhw = new com.bytedance.sdk.component.utils.kjb(Looper.getMainLooper(), this);

    public static class fs {
        public int btk;
        public JSONObject fb;
        public String fs;
        public String zmn;
        public String zn;
    }

    public interface zmn {
        void zmn();
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        bvs = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.core.widget.zmn.fs fsVar) {
        this.vlj = fsVar;
        return this;
    }

    public fkt(Context context) {
        this.gn = context;
    }

    public fkt fs(String str) {
        this.nps = str;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        this.zg = btkVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.mw.fs zmn() {
        return this.ww;
    }

    public void zmn(com.bytedance.sdk.openadsdk.mw.fs fsVar) {
        this.ww = fsVar;
    }

    public fkt zmn(boolean z) {
        this.zn = z;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        WebView webView;
        if (npsVar == null || (webView = npsVar.getWebView()) == null) {
            return this;
        }
        try {
            this.nu = com.bytedance.sdk.component.zmn.cn.zmn(webView).zmn(this.zn ? new com.bytedance.sdk.openadsdk.klz.fs() : new com.bytedance.sdk.openadsdk.klz.zmn()).zmn("ToutiaoJSBridge").zmn(new com.bytedance.sdk.component.zmn.iv() { // from class: com.bytedance.sdk.openadsdk.core.fkt.1
                @Override // com.bytedance.sdk.component.zmn.iv
                @NonNull
                public <T> T zmn(@NonNull String str, @NonNull Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.zmn.iv
                @NonNull
                public <T> String zmn(@NonNull T t) {
                    return null;
                }
            }).zmn(iv.fs().cn()).fs(true).zmn();
            if (com.bytedance.sdk.openadsdk.uqh.btk.zg()) {
                com.bytedance.sdk.openadsdk.klz.zmn.zg.zmn(this.nu, this);
                com.bytedance.sdk.openadsdk.klz.zmn.iv.zmn(this.nu, this);
                com.bytedance.sdk.openadsdk.klz.zmn.doe.zmn(this.nu, npsVar, this, this.kgc);
            } else {
                com.bytedance.sdk.openadsdk.klz.zmn.nps.zmn(this.nu, this);
                com.bytedance.sdk.openadsdk.klz.zmn.bvs.zmn(this.nu, this);
                com.bytedance.sdk.openadsdk.klz.zmn.phc.zmn(this.nu, npsVar, this, this.kgc);
            }
            com.bytedance.sdk.openadsdk.klz.zmn.zmn.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.fs.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.zn.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.hhw.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.rc.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.cyb.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.mw.zmn(this.nu, npsVar);
            com.bytedance.sdk.openadsdk.klz.zmn.btk.zmn(this.nu, this.doe);
            com.bytedance.sdk.openadsdk.klz.zmn.fb.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.cn.zmn(this.nu, this, this.kgc);
            com.bytedance.sdk.openadsdk.klz.zmn.olo.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.kgc.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.klz.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.iqz.zmn(this.nu, this.kgc);
            com.bytedance.sdk.openadsdk.klz.zmn.rt.zmn(this.nu, this);
            com.bytedance.sdk.openadsdk.klz.zmn.kw.zmn(this.nu, this, this.kgc);
        } catch (Exception unused) {
        }
        return this;
    }

    public com.bytedance.sdk.component.zmn.cn fs() {
        return this.nu;
    }

    private WebView doe() {
        com.bytedance.sdk.component.bvs.nps npsVar;
        WeakReference<com.bytedance.sdk.component.bvs.nps> weakReference = this.btk;
        if (weakReference == null || (npsVar = weakReference.get()) == null) {
            return null;
        }
        return npsVar.getWebView();
    }

    public fkt fs(com.bytedance.sdk.component.bvs.nps npsVar) {
        this.btk = new WeakReference<>(npsVar);
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.fb.fb.btk btkVar) {
        this.hgd = btkVar;
        return this;
    }

    public fkt fs(boolean z) {
        this.tf = z;
        return this;
    }

    public fkt zn(boolean z) {
        this.fkt = z;
        return this;
    }

    public fkt zn(String str) {
        this.rc = str;
        return this;
    }

    public fkt zmn(View view) {
        this.klz = new WeakReference<>(view);
        return this;
    }

    private JSONObject nqi() {
        WeakReference<View> weakReference;
        try {
            weakReference = this.klz;
        } catch (Throwable unused) {
        }
        if (weakReference == null) {
            return null;
        }
        View view = weakReference.get();
        com.bytedance.sdk.component.bvs.nps npsVar = this.btk.get();
        if (view != null && npsVar != null) {
            int[] fs2 = jy.fs(view);
            int[] fs3 = jy.fs((View) npsVar);
            if (fs2 != null && fs3 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, jy.zn(kgc.zmn(), fs2[0] - fs3[0]));
                jSONObject.put(VastAttributes.VERTICAL_POSITION, jy.zn(kgc.zmn(), fs2[1] - fs3[1]));
                jSONObject.put("w", jy.zn(kgc.zmn(), view.getWidth()));
                jSONObject.put("h", jy.zn(kgc.zmn(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
        }
        return null;
    }

    public fkt zmn(int i) {
        this.cyb = i;
        return this;
    }

    public void zn() {
        com.bytedance.sdk.component.zmn.cn cnVar = this.nu;
        if (cnVar == null) {
            return;
        }
        cnVar.zmn();
        this.nu = null;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        this.kgc = nqiVar;
        if (nqiVar != null) {
            this.kw = nqiVar.br();
        }
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.mw.zn znVar) {
        this.zak = znVar;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.mw.rc rcVar) {
        this.am = rcVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.model.nqi fb() {
        return this.kgc;
    }

    public boolean btk() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.kgc;
        return nqiVar != null && nqiVar.tdm();
    }

    public fkt fb(String str) {
        this.mw = str;
        return this;
    }

    public fkt fs(int i) {
        this.rt = i;
        return this;
    }

    public fkt btk(String str) {
        this.cn = str;
        return this;
    }

    private static List<String> uqh() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    public fkt zmn(Map<String, Object> map) {
        this.zmn = map;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.component.adexpress.fs.rc rcVar) {
        this.iqz = rcVar;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.core.iv.cyb cybVar) {
        this.phc = cybVar;
        return this;
    }

    public fkt zmn(JSONObject jSONObject) {
        this.doe = jSONObject;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.mw.zmn zmnVar) {
        this.uqh = zmnVar;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.mw.btk btkVar) {
        this.bjh = btkVar;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.mw.zg zgVar) {
        this.yof = zgVar;
        return this;
    }

    public boolean hhw() {
        return this.fs;
    }

    public static void fs(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = uqh().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.zn.zmn());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.zn.nps());
        jSONObject.put(C4913ua.b, com.bytedance.sdk.openadsdk.common.zn.fs());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.zn.zn());
        jSONObject.put("formatSdkEdition", com.bytedance.sdk.openadsdk.common.zn.fb());
        jSONObject.put("fullSdkEdition", com.bytedance.sdk.openadsdk.common.zn.btk());
        jSONObject.put(X3.j.W, com.bytedance.sdk.openadsdk.common.zn.hhw());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.zn.zg());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.zn.zmn(kgc.zmn()));
        Object obj = Build.VERSION.RELEASE;
        jSONObject.put(CommonUrlParts.OS_VERSION, obj);
        if (DeviceUtils.fs(kgc.zmn())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put(CommonUrlParts.DEVICE_TYPE, obj);
    }

    private void mw(JSONObject jSONObject) throws Exception {
        zmn(jSONObject, this.kgc);
    }

    public static void zmn(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) throws Exception {
        String ji = nqiVar.ji();
        if (!TextUtils.isEmpty(ji)) {
            jSONObject.put("cid", ji);
        }
        String ze = nqiVar.ze();
        if (!TextUtils.isEmpty(ze)) {
            jSONObject.put("log_extra", ze);
        }
        String gor = nqiVar.gor();
        if (!TextUtils.isEmpty(gor)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, gor);
        }
        jSONObject.put("dc", TextUtils.isEmpty(kgc.fb().cud()) ? kgc.fb().cud() : "TX");
        jSONObject.put(POBConstants.KEY_LANGUAGE, mw.fs());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.rc.fs().tdm());
    }

    private void rt(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.am.iv(this.kgc))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.am.iv(this.kgc));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03f4, code lost:
    
        if (r3 != null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03f6, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0448, code lost:
    
        if (r3 != null) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject zmn(fs fsVar, int i) throws Exception {
        char c;
        JSONObject jSONObject;
        Context context;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        int i2 = 0;
        if (!NotificationCompat.CATEGORY_CALL.equals(fsVar.zmn)) {
            return null;
        }
        if (iv.fs().cn()) {
            Log.d("TTAD.AndroidObject", "[JSB-REQ] version:" + i + " method:" + fsVar.zn);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str = fsVar.zn;
        str.hashCode();
        long j = 0;
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
            case -278382602:
                if (str.equals("send_temai_product_ids")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -173752734:
                if (str.equals("getTeMaiAds")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 27837080:
                if (str.equals("download_app_ad")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 105049135:
                if (str.equals("unsubscribe_app_ad")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 399543522:
                if (str.equals("getCloseButtonInfo")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 402955465:
                if (str.equals(X3.i.o)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 425443791:
                if (str.equals("getNativeSiteCustomData")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 442647767:
                if (str.equals("sendReward")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 571273292:
                if (str.equals("dynamicTrack")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 650209982:
                if (str.equals("getTemplateInfo")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 672928467:
                if (str.equals("cancel_download_app_ad")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 711635577:
                if (str.equals("getCurrentVideoState")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 885131792:
                if (str.equals("getVolume")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1107374321:
                if (str.equals("pauseWebViewTimers")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (str.equals("muteVideo")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1237100796:
                if (str.equals("renderDidFinish")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1532142616:
                if (str.equals("removeLoading")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1634511418:
                if (str.equals("endcard_load")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1713585602:
                if (str.equals("getNetworkData")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1731806400:
                if (str.equals("playable_style")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1979895452:
                if (str.equals("sendLog")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 2086000188:
                if (str.equals("skipVideo")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 2105008900:
                if (str.equals("landscape_click")) {
                    c = '!';
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
                ev();
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.kgc, this.oub, 0, (JSONObject) null);
                Context context2 = this.gn;
                if (context2 != null) {
                    this.iv.zmn(context2, fsVar.fb, this.mw, this.rt, this.olo);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.fb.zn.fs(this.kgc, this.oub, -1, (JSONObject) null);
                    break;
                }
            case 1:
                mw(jSONObject3);
                break;
            case 2:
                rp();
                break;
            case 3:
                olo(fsVar.fb);
                break;
            case 4:
                JSONObject jSONObject4 = fsVar.fb;
                if (zmn(jSONObject4, jSONObject3)) {
                    zn(jSONObject4);
                    break;
                }
                break;
            case 5:
                cn(fsVar.fb);
                break;
            case 6:
                btk(fsVar.fb);
                break;
            case 7:
                fs(jSONObject3);
                break;
            case '\b':
                com.bytedance.sdk.openadsdk.mw.zmn zmnVar = this.uqh;
                if (zmnVar != null) {
                    int fs2 = zmnVar.fs();
                    int zmn2 = this.uqh.zmn();
                    jSONObject3.put("width", fs2);
                    jSONObject3.put("height", zmn2);
                    break;
                }
                break;
            case '\t':
                am();
                break;
            case '\n':
                doe(fsVar.fb);
                break;
            case 11:
                jSONObject = this.rp;
                break;
            case '\f':
                this.jy = true;
                com.bytedance.sdk.openadsdk.fb.zn.fs(this.kgc, this.oub, 1, (JSONObject) null);
                com.bytedance.sdk.openadsdk.core.zn.fb fbVar = this.kjb;
                if (fbVar != null) {
                    fbVar.btk(this.yj);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.rc.zn znVar = this.iv;
                    if (znVar != null && (context = this.gn) != null) {
                        znVar.zmn(context, fsVar.fb, this.oub);
                        com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar2 = this.uqd;
                        if (fsVar2 != null) {
                            fsVar2.xrr();
                        }
                        com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar2 = this.mhu;
                        if (zmnVar2 != null) {
                            zmnVar2.zmn();
                            break;
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.fb.zn.fs(this.kgc, this.oub, -2, (JSONObject) null);
                        break;
                    }
                }
                break;
            case '\r':
                nps();
                break;
            case 14:
                com.bytedance.sdk.openadsdk.rc.zn znVar2 = this.iv;
                if (znVar2 != null) {
                    znVar2.zmn(fsVar.fb);
                    break;
                }
                break;
            case 15:
                jSONObject = nqi();
                break;
            case 16:
                jSONObject3.put("viewStatus", this.tf ? 1 : 0);
                jSONObject3.put("adFirstShow", this.fkt ? 1 : 0);
                break;
            case 17:
                com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.kgc;
                if (nqiVar2 != null && !TextUtils.isEmpty(nqiVar2.bmc())) {
                    jSONObject3.put("data", this.kgc.bmc());
                    break;
                }
                break;
            case 18:
                this.fs = true;
                com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar3 = this.uqd;
                if (fsVar3 != null) {
                    fsVar3.fkt();
                }
                if (this.na != null) {
                    JSONObject jSONObject5 = fsVar.fb;
                    if (jSONObject5 != null) {
                        j = jSONObject5.optLong("play_start_ts");
                        i2 = jSONObject5.optInt("user_watched_time");
                    }
                    this.na.zmn(j, i2);
                    break;
                }
                break;
            case 19:
                phc(fsVar.fb);
                break;
            case 20:
                JSONObject jSONObject6 = this.doe;
                if (jSONObject6 != null) {
                    jSONObject6.put("setting", yj());
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar3 = this.kgc;
                    if (nqiVar3 != null && nqiVar3.ri() != null) {
                        this.doe.put("dynamic_configs", this.kgc.ri());
                    }
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar4 = this.kgc;
                    if (nqiVar4 != null) {
                        this.doe.put(ShareConstants.MEDIA_EXTENSION, nqiVar4.hn());
                    }
                }
                jSONObject3 = this.doe;
                break;
            case 22:
                kgc(jSONObject3);
                break;
            case 23:
                AudioManager audioManager = (AudioManager) kgc.zmn().getSystemService("audio");
                jSONObject3.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case 24:
                kjb();
                break;
            case 25:
                fs(this.phc, fsVar.fb);
                break;
            case 26:
                kw(fsVar.fb);
                break;
            case 27:
                com.bytedance.sdk.openadsdk.mw.btk btkVar = this.bjh;
                if (btkVar != null) {
                    btkVar.zmn();
                    break;
                }
                break;
            case 28:
                cyb(fsVar.fb);
                break;
            case 29:
                zmn(fsVar, jSONObject3);
                break;
            case 30:
                rt(jSONObject3);
                break;
            case 31:
                JSONObject jSONObject7 = fsVar.fb;
                if (jSONObject7 != null && (jSONObject2 = jSONObject7.getJSONObject("extJson")) != null && jSONObject2.has("category") && jSONObject2.has("tag") && jSONObject2.has("label")) {
                    String optString = jSONObject2.optString("category");
                    String optString2 = jSONObject2.optString("tag");
                    String optString3 = jSONObject2.optString("label");
                    long optLong = jSONObject7.optLong("value");
                    long optLong2 = jSONObject7.optLong("extValue");
                    try {
                        jSONObject2.putOpt("ua_policy", Integer.valueOf(this.cyb));
                    } catch (Exception unused) {
                    }
                    if ("click".equals(optString3)) {
                        jSONObject2 = uqh(jSONObject2);
                    }
                    if ("insight_log".equals(optString3) && (nqiVar = this.kgc) != null && nqiVar.qb()) {
                        jSONObject2.putOpt("page_visible", Integer.valueOf(this.kgc.gms()));
                        jSONObject2.putOpt("time_to_leave", Long.valueOf(this.kgc.iq() > 0 ? SystemClock.elapsedRealtime() - this.kgc.iq() : -1L));
                        jSONObject2.putOpt("time_to_click", Long.valueOf(this.kgc.dg() > 0 ? SystemClock.elapsedRealtime() - this.kgc.dg() : -1L));
                    }
                    String zmn3 = !com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.kgc) ? zmn(optString2, optString3) : optString2;
                    boolean zg = com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.kgc);
                    zmn(jSONObject2, zg, optString3);
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(this.kgc, optString, zmn3, optString3, optLong, optLong2, jSONObject2, zg);
                    break;
                }
                break;
            case ' ':
                zak();
                break;
            case '!':
                Context context3 = this.gn;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.cn.fb.fs) {
                    ((com.bytedance.sdk.openadsdk.core.cn.fb.fs) context3).xrr();
                }
                com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar3 = this.mhu;
                if (zmnVar3 != null) {
                    zmnVar3.zmn();
                    break;
                }
                break;
        }
        if (i == 1 && !TextUtils.isEmpty(fsVar.fs)) {
            fs(fsVar.fs, jSONObject3);
            if (iv.fs().cn()) {
                Log.d("TTAD.AndroidObject", "[JSB-RSP] version:" + i + " data=" + jSONObject3);
            }
        }
        return jSONObject3;
    }

    private void zmn(JSONObject jSONObject, boolean z, String str) {
        com.bytedance.sdk.openadsdk.core.widget.btk btkVar;
        if (z) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString) || PangleNetworkBridge.jsonObjectInit(optString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (btkVar = this.zg) == null) {
                    return;
                }
                btkVar.zmn();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean zmn(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int i;
        String str2;
        if (jSONObject != null) {
            i = jSONObject.optInt("landingStyle");
            str = jSONObject.optString("url");
            str2 = jSONObject.optString("fallback_url");
        } else {
            str = null;
            i = -1;
            str2 = null;
        }
        boolean z = false;
        if (i == 1) {
            if (!com.bytedance.sdk.component.utils.kgc.zmn(str)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.iqz.zmn("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
                return z;
            }
        } else if (i == 2) {
            try {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.kgc.zmn(str2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.iqz.zmn("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
            return z;
        }
        z = true;
        return z;
    }

    public void nps() {
        com.bytedance.sdk.openadsdk.mw.zn znVar;
        if (this.cud && (znVar = this.zak) != null) {
            znVar.zmn();
            return;
        }
        Context context = this.gn;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.uqh.zmn((Activity) context)) {
            ((Activity) this.gn).finish();
        }
        Activity activity = this.kra;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.kra.finish();
    }

    public void zn(JSONObject jSONObject) {
        kw.zmn(bjh(), this.gn instanceof Activity, jSONObject, this.kgc, this.oub, this.rt, doe(), this.zg);
    }

    private Context bjh() {
        WeakReference<com.bytedance.sdk.component.bvs.nps> weakReference = this.btk;
        Activity zmn2 = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.fs.zmn(this.btk.get());
        return zmn2 == null ? this.gn : zmn2;
    }

    private void cn(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar;
        if (jSONObject == null || (btkVar = this.hgd) == null) {
            return;
        }
        btkVar.fs(jSONObject);
    }

    private void fs(String str, boolean z) {
        if (this.hgd == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.hgd.zmn(str);
        } else {
            this.hgd.fs(str);
        }
    }

    private void rp() {
        com.bytedance.sdk.openadsdk.mw.rc rcVar = this.am;
        if (rcVar == null) {
            return;
        }
        rcVar.zmn();
    }

    private void kjb() {
        com.bytedance.sdk.openadsdk.mw.rc rcVar = this.am;
        if (rcVar == null) {
            return;
        }
        rcVar.fs();
    }

    private void cyb(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.mw.zn znVar = this.zak;
        if (znVar == null || jSONObject == null) {
            return;
        }
        znVar.zmn(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString("msg", ""));
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            mw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            fs(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public String getTemplateInfo() {
        fs("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.doe;
            if (jSONObject != null) {
                jSONObject.put("setting", yj());
                com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.kgc;
                if (nqiVar != null && nqiVar.ri() != null) {
                    this.doe.put("dynamic_configs", this.kgc.ri());
                }
                com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.kgc;
                if (nqiVar2 != null) {
                    this.doe.put(ShareConstants.MEDIA_EXTENSION, nqiVar2.hn());
                }
            }
            fs("getTemplateInfo", false);
            return this.doe.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            kw(PangleNetworkBridge.jsonObjectInit(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            zn znVar = this.cd;
            if (znVar != null) {
                com.bytedance.sdk.openadsdk.utils.nu.fs(znVar);
            }
            zn znVar2 = new zn(this.phc, jsonObjectInit);
            this.cd = znVar2;
            com.bytedance.sdk.openadsdk.utils.nu.zmn(znVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            phc(PangleNetworkBridge.jsonObjectInit(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            com.bytedance.sdk.openadsdk.utils.nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fkt.3
                @Override // java.lang.Runnable
                public void run() {
                    fkt.this.olo(jsonObjectInit);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            com.bytedance.sdk.openadsdk.utils.nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fkt.4
                @Override // java.lang.Runnable
                public void run() {
                    fkt.this.btk(jsonObjectInit);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fkt.5
            @Override // java.lang.Runnable
            public void run() {
                fkt.this.zak();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        kgc(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fkt.6
            @Override // java.lang.Runnable
            public void run() {
                if (fkt.this.vlj != null) {
                    fkt.this.vlj.zmn();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    public void zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            int optInt = jsonObjectInit.optInt("time");
            String optString = jsonObjectInit.optString("flag");
            com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
            if (cybVar != null) {
                cybVar.zmn(optInt, optString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.iqz.zn("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.doe.toString();
        }
        try {
            JSONObject zmn2 = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(this.doe, PangleNetworkBridge.jsonObjectInit(str));
            if (zmn2 == null) {
                return this.doe.toString();
            }
            return zmn2.toString();
        } catch (Exception unused) {
            return this.doe.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.fs
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.yof == null) {
            return;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            com.bytedance.sdk.component.adexpress.fs.rt rtVar = new com.bytedance.sdk.component.adexpress.fs.rt();
            JSONObject optJSONObject = jsonObjectInit.optJSONObject("videoInfo");
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION);
                double optDouble2 = optJSONObject.optDouble(VastAttributes.VERTICAL_POSITION);
                double optDouble3 = optJSONObject.optDouble("width");
                double optDouble4 = optJSONObject.optDouble("height");
                if (iqz(optJSONObject)) {
                    rtVar.zmn((float) optJSONObject.optDouble("borderRadiusTopLeft"));
                    rtVar.fs((float) optJSONObject.optDouble("borderRadiusTopRight"));
                    rtVar.zn((float) optJSONObject.optDouble("borderRadiusBottomLeft"));
                    rtVar.fb((float) optJSONObject.optDouble("borderRadiusBottomRight"));
                }
                rtVar.zn(optDouble);
                rtVar.fb(optDouble2);
                rtVar.btk(optDouble3);
                rtVar.hhw(optDouble4);
            }
            com.bytedance.sdk.openadsdk.mw.zg zgVar = this.yof;
            if (zgVar != null) {
                zgVar.zmn(rtVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void fb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("zoom_type", 1);
        JSONObject optJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.fs.rt rtVar = new com.bytedance.sdk.component.adexpress.fs.rt();
        if (optJSONObject != null) {
            double optDouble = optJSONObject.optDouble(VastAttributes.HORIZONTAL_POSITION);
            double optDouble2 = optJSONObject.optDouble(VastAttributes.VERTICAL_POSITION);
            double optDouble3 = optJSONObject.optDouble("width");
            double optDouble4 = optJSONObject.optDouble("height");
            rtVar.zn(optDouble);
            rtVar.fb(optDouble2);
            rtVar.btk(optDouble3);
            rtVar.hhw(optDouble4);
        }
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            cybVar.zmn(optInt, rtVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zak() {
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            cybVar.zmn();
        }
    }

    private void am() {
        if (this.gn == null || TextUtils.isEmpty(kgc.fb().vlj())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.fs.btk() && kgc.fb().am()) {
            IABLandingPageActivity.zmn(this.gn, this.kgc, this.oub);
        } else {
            TTWebsiteActivity.zmn(this.gn, this.kgc, this.oub);
        }
    }

    public void zg() {
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            cybVar.fs();
        }
    }

    public void hhw(String str) {
        this.oub = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(com.bytedance.sdk.openadsdk.core.iv.cyb cybVar, JSONObject jSONObject) {
        if (cybVar == null || jSONObject == null) {
            return;
        }
        try {
            cybVar.zmn(jSONObject.optBoolean("mute", false), !jSONObject.has("mute") ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void olo(JSONObject jSONObject) {
        if (this.phc == null || jSONObject == null) {
            return;
        }
        try {
            this.phc.zmn(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private boolean kgc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null && jSONObject != null) {
            double zn2 = cybVar.zn();
            double fb = this.phc.fb();
            int btk = this.phc.btk();
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.TopLayoutHelper", "current:", Double.valueOf(zn2), "state", Integer.valueOf(btk), "countdownTime", Double.valueOf(fb));
            try {
                jSONObject.put("currentTime", zn2 / 1000.0d);
                if (fb > 0.0d) {
                    jSONObject.put("countDownTime", fb / 1000.0d);
                }
                jSONObject.put("state", btk);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private JSONObject yj() {
        return fs(this.kgc);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:57:0x000f, B:9:0x0017, B:11:0x001f, B:13:0x0027, B:14:0x002d, B:22:0x0053, B:23:0x006c, B:25:0x0085, B:28:0x008e, B:30:0x0096, B:31:0x009c, B:33:0x00b2, B:35:0x00b8, B:36:0x00c1, B:39:0x00c9, B:41:0x00d2, B:44:0x00d9, B:48:0x00cd, B:51:0x0060), top: B:56:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: Exception -> 0x0135, TRY_ENTER, TryCatch #0 {Exception -> 0x0135, blocks: (B:57:0x000f, B:9:0x0017, B:11:0x001f, B:13:0x0027, B:14:0x002d, B:22:0x0053, B:23:0x006c, B:25:0x0085, B:28:0x008e, B:30:0x0096, B:31:0x009c, B:33:0x00b2, B:35:0x00b8, B:36:0x00c1, B:39:0x00c9, B:41:0x00d2, B:44:0x00d9, B:48:0x00cd, B:51:0x0060), top: B:56:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:57:0x000f, B:9:0x0017, B:11:0x001f, B:13:0x0027, B:14:0x002d, B:22:0x0053, B:23:0x006c, B:25:0x0085, B:28:0x008e, B:30:0x0096, B:31:0x009c, B:33:0x00b2, B:35:0x00b8, B:36:0x00c1, B:39:0x00c9, B:41:0x00d2, B:44:0x00d9, B:48:0x00cd, B:51:0x0060), top: B:56:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject fs(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        int qvo;
        boolean kgc;
        JSONObject jSONObject = new JSONObject();
        if (kgc.fb() == null) {
            return jSONObject;
        }
        int i = 0;
        if (nqiVar != null) {
            try {
                qvo = nqiVar.qvo();
            } catch (Exception unused) {
            }
        } else {
            qvo = 0;
        }
        int ldx = nqiVar != null ? nqiVar.ldx() : 0;
        int nkw = nqiVar != null ? nqiVar.nkw() : 0;
        int ab = nqiVar != null ? nqiVar.ab() : 0;
        boolean hhw = kgc.fb().hhw(String.valueOf(qvo));
        int rt = kgc.fb().rt(String.valueOf(qvo));
        boolean z = rt == 1;
        if (ldx != 7 && ldx != 8) {
            kgc = kgc.fb().zn(String.valueOf(qvo));
            jSONObject.put("voice_control", kgc);
            jSONObject.put("rv_skip_time", nkw);
            jSONObject.put("fv_skip_show", hhw);
            jSONObject.put("iv_skip_time", ab);
            jSONObject.put("show_dislike", nqiVar == null && nqiVar.bn());
            jSONObject.put("video_adaptation", nqiVar == null ? nqiVar.nlz() : 0);
            jSONObject.put("splash_image_count_down_time", kgc.fb().uqh(String.valueOf(qvo)));
            if (nqiVar != null && nqiVar.ri() != null) {
                jSONObject.put("dynamic_configs", nqiVar.ri());
            }
            if (!com.bytedance.sdk.openadsdk.core.model.iqz.zn(nqiVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z);
            }
            if (nqiVar != null && nqiVar.dgt()) {
                i = 1;
            }
            jSONObject.put("bar_render_platform", i);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("endcard_close_time", kgc.fb().zmn(qvo));
            jSONObject.put("video_skip_result", rt);
            jSONObject.put("if_show_win", kgc.fb().bvs(String.valueOf(qvo)));
            jSONObject.put("origin_rv_skip_time", kgc.fb().rc(String.valueOf(qvo)));
            jSONObject.put("origin_iv_skip_time", kgc.fb().iqz(String.valueOf(qvo)));
            jSONObject.put("sdk_video_encode_type", !com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar) ? 1 : 0);
            return jSONObject;
        }
        kgc = kgc.fb().kgc(String.valueOf(qvo));
        jSONObject.put("voice_control", kgc);
        jSONObject.put("rv_skip_time", nkw);
        jSONObject.put("fv_skip_show", hhw);
        jSONObject.put("iv_skip_time", ab);
        jSONObject.put("show_dislike", nqiVar == null && nqiVar.bn());
        jSONObject.put("video_adaptation", nqiVar == null ? nqiVar.nlz() : 0);
        jSONObject.put("splash_image_count_down_time", kgc.fb().uqh(String.valueOf(qvo)));
        if (nqiVar != null) {
            jSONObject.put("dynamic_configs", nqiVar.ri());
        }
        if (!com.bytedance.sdk.openadsdk.core.model.iqz.zn(nqiVar)) {
        }
        if (nqiVar != null) {
            i = 1;
        }
        jSONObject.put("bar_render_platform", i);
        jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
        jSONObject.put("endcard_close_time", kgc.fb().zmn(qvo));
        jSONObject.put("video_skip_result", rt);
        jSONObject.put("if_show_win", kgc.fb().bvs(String.valueOf(qvo)));
        jSONObject.put("origin_rv_skip_time", kgc.fb().rc(String.valueOf(qvo)));
        jSONObject.put("origin_iv_skip_time", kgc.fb().iqz(String.valueOf(qvo)));
        jSONObject.put("sdk_video_encode_type", !com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(nqiVar) ? 1 : 0);
        return jSONObject;
    }

    public void btk(JSONObject jSONObject) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String optString = jSONObject.optString("adId");
            int optInt = jSONObject.optInt("areaType", 1);
            String optString2 = jSONObject.optString("clickAreaType");
            JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
            int i = 0;
            double d6 = 0.0d;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("down_x", 0.0d);
                d2 = optJSONObject.optDouble("down_y", 0.0d);
                double optDouble2 = optJSONObject.optDouble("up_x", 0.0d);
                double optDouble3 = optJSONObject.optDouble("up_y", 0.0d);
                double optDouble4 = optJSONObject.optDouble("down_time", 0.0d);
                double optDouble5 = optJSONObject.optDouble("up_time", 0.0d);
                jSONObject2 = optJSONObject.optJSONObject("rectInfo");
                i = optJSONObject.optInt(IronSourceConstants.EVENTS_DURATION, 0);
                d5 = optDouble5;
                d6 = optDouble;
                d = optDouble2;
                d3 = optDouble3;
                d4 = optDouble4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.model.cyb zmn2 = new cyb.zmn().fb((float) d6).zn((float) d2).fs((float) d).zmn((float) d3).fs((long) d4).zmn((long) d5).zmn(optString2).zmn((SparseArray<zn.zmn>) null).zmn(true).fb(i).fs(optInt).zmn(jSONObject2).zmn(jSONObject.optInt("clickAreaCategory", -1)).fs(optJSONObject).fs(jSONObject.optString("dislike_source")).zmn();
            com.bytedance.sdk.component.adexpress.fs.rc rcVar = this.iqz;
            if (rcVar != null) {
                rcVar.zmn(null, optInt, zmn2);
            }
            zmn(optString, optInt, zmn2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.fs.rc rcVar2 = this.iqz;
            if (rcVar2 != null) {
                rcVar2.zmn(null, -1, null);
            }
        }
    }

    private void kw(JSONObject jSONObject) {
        int i;
        double d;
        double d2;
        boolean z;
        double d3;
        double d4;
        Objects.toString(jSONObject);
        if (this.iqz == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.fb.btk btkVar = this.hgd;
        if (btkVar != null) {
            btkVar.cn();
        }
        com.bytedance.sdk.component.adexpress.fs.rt rtVar = new com.bytedance.sdk.component.adexpress.fs.rt();
        rtVar.zmn(1);
        try {
            boolean optBoolean = jSONObject.optBoolean("isRenderSuc");
            String optString = jSONObject.optString("engineType");
            JSONObject optJSONObject = jSONObject.optJSONObject("AdSize");
            if (optJSONObject != null) {
                d = optJSONObject.optDouble("width");
                d2 = optJSONObject.optDouble("height");
            } else {
                d = 0.0d;
                d2 = 0.0d;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject2 != null) {
                double optDouble = optJSONObject2.optDouble(VastAttributes.HORIZONTAL_POSITION);
                z = optBoolean;
                double optDouble2 = optJSONObject2.optDouble(VastAttributes.VERTICAL_POSITION);
                d4 = d2;
                double optDouble3 = optJSONObject2.optDouble("width");
                double optDouble4 = optJSONObject2.optDouble("height");
                if (iqz(optJSONObject2)) {
                    d3 = d;
                    rtVar.zmn((float) optJSONObject2.optDouble("borderRadiusTopLeft"));
                    rtVar.fs((float) optJSONObject2.optDouble("borderRadiusTopRight"));
                    rtVar.zn((float) optJSONObject2.optDouble("borderRadiusBottomLeft"));
                    rtVar.fb((float) optJSONObject2.optDouble("borderRadiusBottomRight"));
                } else {
                    d3 = d;
                }
                rtVar.zn(optDouble);
                rtVar.fb(optDouble2);
                rtVar.btk(optDouble3);
                rtVar.hhw(optDouble4);
            } else {
                z = optBoolean;
                d3 = d;
                d4 = d2;
            }
            try {
                String optString2 = jSONObject.optString("msg", bvs.zmn(101));
                int optInt = jSONObject.optInt("code", 101);
                rtVar.zmn(z);
                rtVar.zmn(d3);
                rtVar.fs(d4);
                rtVar.zmn(optString2);
                rtVar.fs(optInt);
                rtVar.fs(optString);
                this.iqz.zmn(rtVar);
            } catch (Exception unused) {
                i = 101;
                rtVar.fs(i);
                rtVar.zmn(bvs.zmn(i));
                this.iqz.zmn(rtVar);
            }
        } catch (Exception unused2) {
            i = 101;
        }
    }

    private boolean iqz(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void phc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.iqz.zmn(parse, this);
            }
        } catch (Exception unused) {
        }
    }

    private void doe(JSONObject jSONObject) {
        if (jSONObject == null || this.nqi == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.nqi.zmn(true, optJSONArray);
            } else {
                this.nqi.zmn(false, null);
            }
        } catch (Exception unused) {
            this.nqi.zmn(false, null);
        }
    }

    public void zmn(final fs fsVar, final JSONObject jSONObject) {
        if (fsVar == null) {
            return;
        }
        try {
            zmn(fsVar.fb, new com.bytedance.sdk.openadsdk.mw.fb() { // from class: com.bytedance.sdk.openadsdk.core.fkt.7
                @Override // com.bytedance.sdk.openadsdk.mw.fb
                public void zmn(boolean z, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                    if (!z) {
                        fkt.this.fs(fsVar.fs, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", fkt.zmn(zmnVar));
                        fkt.this.fs(fsVar.fs, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean zmn(String str, int i, com.bytedance.sdk.openadsdk.core.model.cyb cybVar) {
        HashMap<String, rc> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.so) == null || hashMap.get(str) == null) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:6:0x0007, B:8:0x0010, B:11:0x001a, B:13:0x0036, B:16:0x0045, B:18:0x0049, B:20:0x0050, B:22:0x0056, B:24:0x005c, B:25:0x0060, B:27:0x0066, B:29:0x0074, B:31:0x0078, B:33:0x007e, B:35:0x0082, B:36:0x0089, B:38:0x008f, B:39:0x0093, B:41:0x0099, B:43:0x00a9, B:45:0x0042, B:46:0x00b6), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: Exception -> 0x003f, LOOP:0: B:25:0x0060->B:27:0x0066, LOOP_END, TryCatch #0 {Exception -> 0x003f, blocks: (B:6:0x0007, B:8:0x0010, B:11:0x001a, B:13:0x0036, B:16:0x0045, B:18:0x0049, B:20:0x0050, B:22:0x0056, B:24:0x005c, B:25:0x0060, B:27:0x0066, B:29:0x0074, B:31:0x0078, B:33:0x007e, B:35:0x0082, B:36:0x0089, B:38:0x008f, B:39:0x0093, B:41:0x0099, B:43:0x00a9, B:45:0x0042, B:46:0x00b6), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:6:0x0007, B:8:0x0010, B:11:0x001a, B:13:0x0036, B:16:0x0045, B:18:0x0049, B:20:0x0050, B:22:0x0056, B:24:0x005c, B:25:0x0060, B:27:0x0066, B:29:0x0074, B:31:0x0078, B:33:0x007e, B:35:0x0082, B:36:0x0089, B:38:0x008f, B:39:0x0093, B:41:0x0099, B:43:0x00a9, B:45:0x0042, B:46:0x00b6), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:6:0x0007, B:8:0x0010, B:11:0x001a, B:13:0x0036, B:16:0x0045, B:18:0x0049, B:20:0x0050, B:22:0x0056, B:24:0x005c, B:25:0x0060, B:27:0x0066, B:29:0x0074, B:31:0x0078, B:33:0x007e, B:35:0x0082, B:36:0x0089, B:38:0x008f, B:39:0x0093, B:41:0x0099, B:43:0x00a9, B:45:0x0042, B:46:0x00b6), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.mw.fb fbVar) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Iterator<String> keys;
        if (fbVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.mw.fb fbVar2 = new com.bytedance.sdk.openadsdk.mw.fb() { // from class: com.bytedance.sdk.openadsdk.core.fkt.8
                @Override // com.bytedance.sdk.openadsdk.mw.fb
                public void zmn(final boolean z, final com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                    com.bytedance.sdk.openadsdk.utils.nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fkt.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fbVar.zmn(z, zmnVar);
                        }
                    });
                }
            };
            if (this.kgc != null && !TextUtils.isEmpty(this.mw)) {
                int ldx = this.kgc.ldx();
                AdSlot utx = this.kgc.utx();
                com.bytedance.sdk.openadsdk.core.model.kjb kjbVar = new com.bytedance.sdk.openadsdk.core.model.kjb();
                kjbVar.hhw = true;
                if (this.kgc.ouf() == null) {
                    if (this.kgc.rsi() != null) {
                    }
                    jSONObject2 = this.kw;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    if (jSONObject != null && jSONObject.has("session_params") && (optJSONObject2 = jSONObject.optJSONObject("session_params")) != null) {
                        keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, optJSONObject2.opt(next));
                        }
                    }
                    kjbVar.nps = jSONObject2;
                    if (jSONObject != null && jSONObject.has("common_params")) {
                        if (kjbVar.zg == null) {
                            kjbVar.zg = new JSONObject();
                        }
                        optJSONObject = jSONObject.optJSONObject("common_params");
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                kjbVar.zg.put(next2, optJSONObject.opt(next2));
                            }
                        }
                    }
                    kgc.zn().zmn(utx, kjbVar, ldx, new doe() { // from class: com.bytedance.sdk.openadsdk.core.fkt.9
                        @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
                        public void zmn(int i, String str) {
                            fbVar2.zmn(false, null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
                        public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                            fkt.this.zmn(zmnVar, znVar, fbVar2);
                        }
                    });
                    return;
                }
                kjbVar.bvs = 2;
                jSONObject2 = this.kw;
                if (jSONObject2 == null) {
                }
                if (jSONObject != null) {
                    keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                    }
                }
                kjbVar.nps = jSONObject2;
                if (jSONObject != null) {
                    if (kjbVar.zg == null) {
                    }
                    optJSONObject = jSONObject.optJSONObject("common_params");
                    if (optJSONObject != null) {
                    }
                }
                kgc.zn().zmn(utx, kjbVar, ldx, new doe() { // from class: com.bytedance.sdk.openadsdk.core.fkt.9
                    @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
                    public void zmn(int i, String str) {
                        fbVar2.zmn(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.doe, com.bytedance.sdk.openadsdk.core.nqi.zmn
                    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar) {
                        fkt.this.zmn(zmnVar, znVar, fbVar2);
                    }
                });
                return;
            }
            fbVar2.zmn(false, null);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("TTAD.AndroidObject", "get ads error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, com.bytedance.sdk.openadsdk.core.model.zn znVar, com.bytedance.sdk.openadsdk.mw.fb fbVar) {
        if (zmnVar.btk() != null && !zmnVar.btk().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = zmnVar.btk().get(0);
            if (nqiVar != null) {
                this.kw = nqiVar.br();
            }
            fbVar.zmn(true, zmnVar);
            return;
        }
        fbVar.zmn(false, null);
        znVar.zmn(-3);
        znVar.zn(7);
        com.bytedance.sdk.openadsdk.core.model.zn.zmn(znVar);
    }

    public static JSONArray zmn(com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        com.bytedance.sdk.openadsdk.core.model.nqi nps;
        if (zmnVar == null || !zmnVar.hhw() || (nps = zmnVar.nps()) == null || TextUtils.isEmpty(nps.iyj())) {
            return null;
        }
        try {
            return PangleNetworkBridge.jsonObjectInit(nps.iyj()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean so() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.kgc;
        if (nqiVar == null || nqiVar.br() == null || com.bytedance.sdk.openadsdk.core.model.am.fs(this.kgc) || this.ev || this.kgc.br().optInt("parent_type") != 2) {
            return false;
        }
        int ldx = this.kgc.ldx();
        if (ldx != 8 && ldx != 7) {
            return false;
        }
        this.ev = true;
        return true;
    }

    public void fb(boolean z) {
        this.fs = z;
    }

    public boolean bvs() {
        return this.jy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            nqi(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void nqi(JSONObject jSONObject) {
        WebView doe;
        if (jSONObject == null || (doe = doe()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.rt.zmn(doe, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private void zn(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            nqi(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void zg(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                fs fsVar = new fs();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        fsVar.zmn = optJSONObject.optString("__msg_type", null);
                        fsVar.fs = optJSONObject.optString("__callback_id", null);
                        fsVar.zn = optJSONObject.optString("func");
                        fsVar.fb = optJSONObject.optJSONObject("params");
                        fsVar.btk = optJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(fsVar.zmn) && !TextUtils.isEmpty(fsVar.zn)) {
                    Message obtainMessage = this.hhw.obtainMessage(11);
                    obtainMessage.obj = fsVar;
                    this.hhw.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public boolean zmn(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return bvs.containsKey(uri.getHost());
        }
        return false;
    }

    public void fs(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    iv(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.fkt.10
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String str;
                    JSONObject jSONObject;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    fkt.this.oub = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (fkt.this.bvs(queryParameter3)) {
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
                        JSONObject jSONObject2 = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(queryParameter4);
                                try {
                                    jsonObjectInit.putOpt("ua_policy", Integer.valueOf(fkt.this.cyb));
                                } catch (Throwable unused3) {
                                }
                                jSONObject2 = jsonObjectInit;
                            }
                        } catch (Throwable unused4) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject2 = fkt.this.uqh(jSONObject2);
                        }
                        if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                            str = fkt.this.zmn(queryParameter2, queryParameter3);
                            jSONObject = jSONObject2;
                        } else {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                for (String str2 : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str2)) {
                                            jSONObject3.put("ad_extra_data", PangleNetworkBridge.jsonObjectInit(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject3.put(str2, uri.getQueryParameter(str2));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                str = fkt.this.nps;
                                jSONObject = jSONObject3;
                            } catch (Exception unused6) {
                                return;
                            }
                        }
                        com.bytedance.sdk.openadsdk.fb.zn.zmn(fkt.this.kgc, queryParameter, str, queryParameter3, j, j3, jSONObject, com.bytedance.sdk.openadsdk.core.model.iqz.zg(fkt.this.kgc));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bvs(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return iv();
        }
        return true;
    }

    boolean iv() {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.kgc;
        return nqiVar != null && nqiVar.eug() == 1;
    }

    public void zn(int i) {
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            cybVar.fs(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject uqh(JSONObject jSONObject) {
        if (this.zmn != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("ad_extra_data", null);
                if (optString != null) {
                    jSONObject2 = PangleNetworkBridge.jsonObjectInit(optString);
                }
                for (Map.Entry<String, Object> entry : this.zmn.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zn(e.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String zmn(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.kgc)) {
            if ("show".equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.oub.zmn(this.rt);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.am.btk(this.kgc)) {
            return this.nps;
        }
        if (this.zak != null) {
            return com.bytedance.sdk.openadsdk.utils.oub.zmn(this.rt);
        }
        return this.iqz == null ? com.bytedance.sdk.openadsdk.utils.oub.fs(this.rt) : str;
    }

    private void iv(String str) {
        int indexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView doe = doe();
                    if (doe != null) {
                        com.bytedance.sdk.component.utils.rt.zmn(doe, "javascript:ToutiaoJSBridge._fetchQueue()");
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
                zg(substring2);
            } catch (Exception unused) {
            }
        }
    }

    public void rc() {
        so();
    }

    public void klz() {
        com.bytedance.sdk.openadsdk.rc.zn znVar = this.iv;
        if (znVar != null) {
            znVar.zmn();
        }
        zn znVar2 = this.cd;
        if (znVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.nu.fs(znVar2);
            this.cd = null;
        }
        this.gn = null;
        this.uqd = null;
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof fs) {
                try {
                    zmn((fs) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void ev() {
        if (this.iv == null) {
            this.iv = com.bytedance.sdk.openadsdk.rc.zmn.zmn(this, this.kgc);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rc.fs
    public void zmn(String str, JSONObject jSONObject) {
        Objects.toString(jSONObject);
        zn(str, jSONObject);
    }

    public void mw() {
        zmn zmnVar = this.ve;
        if (zmnVar != null) {
            zmnVar.zmn();
        }
    }

    public void btk(boolean z) {
        this.dgt = z;
    }

    public void hhw(boolean z) {
        this.cud = z;
    }

    public void hhw(JSONObject jSONObject) {
        boolean z = false;
        com.bytedance.sdk.openadsdk.core.model.nqi zmn2 = com.bytedance.sdk.openadsdk.core.fs.zmn(jSONObject, null, null, null, 0);
        if (zmn2 != null) {
            boolean zg = com.bytedance.sdk.openadsdk.core.model.iqz.zg(this.kgc);
            String fs2 = zg ? com.bytedance.sdk.openadsdk.utils.oub.fs(this.rt) : this.oub;
            if (!com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(zmn2) && !zg) {
                z = true;
            }
            zmn(zmn2, fs2, z);
        }
    }

    private void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zn.zmn(kgc.zmn(), nqiVar, str, this.rt);
        zmnVar.zmn(com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(kgc.zmn(), str));
        if (!z) {
            zmnVar.zmn(false);
        }
        zmnVar.zmn((View) null);
    }

    public JSONObject nps(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            try {
                jSONObject2.put("state", cybVar.fs(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public JSONObject zg(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            try {
                jSONObject2.put("state", cybVar.zmn(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public JSONObject bvs(JSONObject jSONObject) {
        List<com.bytedance.sdk.openadsdk.core.model.nqi> tet;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.uqd;
            if (fsVar != null && (tet = fsVar.tet()) != null) {
                for (int i = 0; i < tet.size(); i++) {
                    jSONArray.put(zn(tet.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private JSONObject zn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put("cid", nqiVar.gn());
        jSONObject2.put("req_id", nqiVar.wbj());
        jSONObject2.put(CreativeInfo.c, nqiVar.ji());
        jSONObject2.put("log_extra", nqiVar.ze());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.rc.fs().tdm());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", nqiVar.uqd());
        jSONObject.put("dynamic_creative", nqiVar.tev());
        jSONObject.put("title", nqiVar.db());
        com.bytedance.sdk.openadsdk.core.model.nqi.zmn(nqiVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.nqi.fs(nqiVar, jSONObject);
        jSONObject.put("source", nqiVar.dey());
        jSONObject.put("button_text", nqiVar.wd());
        com.bytedance.sdk.openadsdk.core.model.mw my = nqiVar.my();
        if (my != null) {
            jSONObject.put("deeplink_url", my.zmn());
        }
        jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, nqiVar.lgz());
        jSONObject.put("has_show", nqiVar.yof() ? 1 : 0);
        jSONObject.put("has_click", nqiVar.dv() ? 1 : 0);
        return jSONObject;
    }

    public void iv(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.zmn fb;
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.kgc;
        if (nqiVar == null || (fb = nqiVar.fb()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.nqi> btk = fb.btk();
        if (optInt < 0 || optInt >= btk.size()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = btk.get(optInt);
        nqiVar2.xrr(optInt);
        zmn(nqiVar2, this.oub, false);
        com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.uqd;
        if (fsVar != null) {
            fsVar.xrr();
        }
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar = this.mhu;
        if (zmnVar != null) {
            zmnVar.zmn();
        }
    }

    public void zmn(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.iv.cyb cybVar = this.phc;
        if (cybVar != null) {
            cybVar.zmn(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.uqd;
        if (fsVar != null) {
            fsVar.zmn(str, jSONObject);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        this.uqd = fsVar;
    }

    public com.bytedance.sdk.openadsdk.core.cn.fb.fs rt() {
        return this.uqd;
    }

    public void zmn(kjb kjbVar) {
        this.xrr = kjbVar;
    }

    public void cn() {
        kjb kjbVar = this.xrr;
        if (kjbVar != null) {
            kjbVar.m_();
        }
    }

    public void cyb() {
        kjb kjbVar = this.xrr;
        if (kjbVar != null) {
            kjbVar.n_();
        }
    }

    public void rc(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        kjb kjbVar = this.xrr;
        if (kjbVar != null) {
            if (optInt == 1) {
                kjbVar.p_();
            } else if (optInt == 2) {
                kjbVar.q_();
            }
        }
    }

    public JSONObject olo() {
        JSONObject jSONObject = new JSONObject();
        try {
            kjb kjbVar = this.xrr;
            if (kjbVar != null) {
                jSONObject.put("leftTime", kjbVar.o_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void kgc() {
        kjb kjbVar = this.xrr;
        if (kjbVar != null) {
            kjbVar.r_();
        }
    }

    public void zmn(zmn zmnVar) {
        this.ve = zmnVar;
    }

    private static class zn implements Runnable {
        private final JSONObject fs;
        private final com.bytedance.sdk.openadsdk.core.iv.cyb zmn;

        public zn(com.bytedance.sdk.openadsdk.core.iv.cyb cybVar, JSONObject jSONObject) {
            this.zmn = cybVar;
            this.fs = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            fkt.fs(this.zmn, this.fs);
        }
    }

    public void klz(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(new com.bytedance.sdk.component.zg.fs.zn("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.fkt.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
                if (optJSONObject != null && optJSONObject.has("category") && optJSONObject.has("tag") && optJSONObject.has("label")) {
                    String optString = optJSONObject.optString("category");
                    String optString2 = optJSONObject.optString("tag");
                    String optString3 = optJSONObject.optString("label");
                    long optLong = jSONObject.optLong("value");
                    long optLong2 = jSONObject.optLong("extValue");
                    try {
                        optJSONObject.put("ua_policy", fkt.this.cyb);
                        String optString4 = optJSONObject.optString("ad_extra_data");
                        JSONObject jSONObject2 = TextUtils.isEmpty(optString4) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString4);
                        String optString5 = jSONObject2.optString("pag_json_data");
                        JSONObject jSONObject3 = TextUtils.isEmpty(optString5) ? new JSONObject() : PangleNetworkBridge.jsonObjectInit(optString5);
                        if (com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.fs()) {
                            jSONObject3.putOpt("_l_s_t", Integer.valueOf(com.bytedance.sdk.openadsdk.fb.zmn.zmn.hhw.zmn()));
                        }
                        jSONObject2.putOpt("pag_json_data", jSONObject3.toString());
                        optJSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(mw.zmn(kgc.zmn())) && TextUtils.equals(optString3, "click") && fkt.this.kgc != null) {
                        com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn(com.bytedance.sdk.openadsdk.bjh.zmn.zmn(fkt.this.kgc.hz(), true), 2, fkt.this.kgc.ji());
                    }
                    new zmn.C0192zmn(System.currentTimeMillis(), fkt.this.kgc).fb(optString).fs(optString2).zn(optString3).zmn(fkt.this.kgc == null ? "" : fkt.this.kgc.kh()).zmn(fkt.this.kgc == null ? null : fkt.this.kgc.zp()).btk(String.valueOf(optLong)).zg(fkt.this.kgc == null ? "" : fkt.this.kgc.gn()).nps(fkt.this.kgc != null ? fkt.this.kgc.wbj() : "").hhw(String.valueOf(optLong2)).zmn(optJSONObject).zmn((com.bytedance.sdk.openadsdk.fb.fs.zmn) null);
                }
            }
        });
    }

    public void kw() {
        com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar = this.uqd;
        if (fsVar != null) {
            fsVar.yj();
        }
    }

    public void zmn(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            zmn(n.g, jSONObject);
        } catch (Exception e) {
            Log.e("TTAD.AndroidObject", "", e);
        }
    }

    public void nps(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            zmn("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void fb(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netType", i);
            zmn("netTypeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void zmn(String str, int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SDKConstants.PARAM_SESSION_ID, str);
            jSONObject.put("status", i);
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            zmn("landingPageLoadStatus", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void zg(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            zmn(X3.h.V, jSONObject);
        } catch (Exception unused) {
        }
    }

    public fkt zmn(Activity activity) {
        this.kra = activity;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.component.reward.zn.hhw hhwVar) {
        this.na = hhwVar;
        return this;
    }

    public fkt zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar) {
        this.mhu = zmnVar;
        return this;
    }

    public void btk(int i) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar;
        if (i == 0 || i != 1 || (zmnVar = this.mhu) == null) {
            return;
        }
        zmnVar.zmn();
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn znVar) {
        this.yo = znVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.fb fbVar) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn znVar = this.yo;
        if (znVar != null) {
            znVar.zmn(fbVar);
        }
    }

    public void nps(String str) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn znVar = this.yo;
        if (znVar != null) {
            znVar.zmn(str);
        }
    }

    public void zmn(String str, boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn znVar = this.yo;
        if (znVar != null) {
            znVar.zmn(str, z);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.bvs bvsVar) {
        this.bxw = bvsVar;
    }

    public void zmn(int i, JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.reward.zn.bvs bvsVar = this.bxw;
        if (bvsVar != null) {
            bvsVar.zmn(i, jSONObject);
        }
    }

    public void iqz() {
        try {
            zmn("requestHeartBeat", new JSONObject());
        } catch (Exception e) {
            Log.e("TTAD.AndroidObject", "", e);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.fb fbVar) {
        this.tet = fbVar;
    }

    public void phc() {
        com.bytedance.sdk.openadsdk.component.reward.zn.fb fbVar = this.tet;
        if (fbVar != null) {
            fbVar.zmn();
        }
    }
}
