package com.bytedance.sdk.openadsdk.kj;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayablePlugin.java */
/* loaded from: classes2.dex */
public class so {
    private pvs Ayu;
    private int BiC;
    private String EFw;
    private String FN;
    private int GcG;
    private int HWd;
    private Runnable IP;
    private int Irm;
    private String Je;
    private Runnable Ju;
    private String LDD;
    private int LEC;
    private boolean LHy;
    private int Lxj;
    private com.bytedance.sdk.openadsdk.kj.pvs MY;
    private JSONObject Mnp;
    private Runnable Mxy;
    private int Oa;
    private int RGX;
    private float RKd;
    private String SJ;
    private String SLG;
    private String VLm;
    private int VVr;
    private sUS Wby;
    private Runnable Wyp;
    private JSONObject Zm;
    private icD bNS;
    private WebView elv;
    private String mRq;
    private boolean mo;
    private int nS;
    private String pR;
    private int qVe;
    private Runnable qh;
    private vG rcB;
    private WeakReference<View> tCd;
    private Context tQ;
    private String wjr;
    private boolean wr;
    private String xa;
    private boolean zn;
    private final String sUS = "playable_stuck_check_ping";
    private final String yiw = "playable_apply_media_permission_callback";
    private final Handler so = new Handler(Looper.getMainLooper());
    private final Handler kj = new Handler(Looper.getMainLooper());
    private boolean mnm = true;
    private boolean vA = true;
    private boolean cR = true;
    public final String pvs = "PL_sdk_playable_global_viewable";
    public final String icD = "PL_sdk_page_screen_blank";
    public final String vG = "PL_sdk_playable_destroy_analyze_summary";
    public final String Jd = "PL_sdk_playable_hardware_dialog_cancel";
    public final String NB = "PL_sdk_playable_hardware_dialog_setting";
    private Set<String> zM = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
    private String uc = null;
    private String rCZ = "embeded_ad";
    private boolean OT = true;
    private boolean ny = true;
    private boolean ZhG = false;
    private String dyT = "";
    private long dX = 10;
    private long CvL = 10;
    private int Gp = TypedValues.TransitionType.TYPE_DURATION;
    private long ae = 0;
    private long gA = 0;
    private long jlb = -1;
    private long dx = -1;
    private long Pj = -1;
    private long cRf = -1;
    private long sP = -1;
    private long gSd = -1;
    private long qD = -1;
    private String od = "";
    private String OhP = "";
    private String jhZ = "";
    private String SE = "";
    private int yWX = 0;
    private int sq = 0;
    private boolean ea = false;
    private int ZsW = 0;
    private int CjQ = -1;
    private int BSi = 0;
    private int cnN = 0;
    private int OyE = 0;
    private String joF = null;
    private boolean thO = false;
    private int qd = 0;
    private int rW = 0;
    private int Cwg = 0;
    private int neB = 0;
    private long cGU = 0;
    private long Ca = 0;
    private int Ye = 0;
    private int UYh = 0;
    private int FFl = 0;
    private JSONObject yhq = new JSONObject();
    private Map<String, String> sR = new HashMap();
    private JSONObject AEt = new JSONObject();
    private String ig = "";
    private float Tdd = 0.0f;
    private float ABo = 0.0f;
    private boolean MA = false;
    private boolean eOd = false;
    private boolean cUm = false;
    private List<JSONObject> CSZ = new ArrayList();
    private boolean FJ = true;
    private volatile boolean RgU = true;
    private volatile boolean VXe = true;
    private ViewTreeObserver.OnGlobalLayoutListener lHK = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.kj.so.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                View view = (View) so.this.tCd.get();
                if (view == null) {
                    return;
                }
                so.this.icD(view);
            } catch (Throwable th) {
                yiw.pvs("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };

    /* compiled from: PlayablePlugin.java */
    public enum pvs {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    public String sP() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    static /* synthetic */ int Ju(so soVar) {
        int i = soVar.sq;
        soVar.sq = i + 1;
        return i;
    }

    static /* synthetic */ int kj(so soVar) {
        int i = soVar.yWX;
        soVar.yWX = i + 1;
        return i;
    }

    private so(Context context, WebView webView, vG vGVar, com.bytedance.sdk.openadsdk.kj.pvs pvsVar, pvs pvsVar2) {
        this.HWd = -2;
        this.HWd = 0;
        this.Ayu = pvsVar2;
        this.elv = webView;
        Mxy.pvs(webView);
        pvs(webView);
        pvs(context, vGVar, pvsVar);
    }

    private void pvs(Context context, vG vGVar, com.bytedance.sdk.openadsdk.kj.pvs pvsVar) {
        this.uc = UUID.randomUUID().toString();
        this.tQ = context;
        this.MY = pvsVar;
        this.rcB = vGVar;
        Wyp.pvs(pvsVar);
        this.Wby = new sUS(this);
        gSd();
    }

    private void gSd() {
        this.bNS = new icD(this, this.Gp);
        this.Mxy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.3
            @Override // java.lang.Runnable
            public void run() {
                if (so.this.OT) {
                    so.this.OT = false;
                    so.this.so.removeCallbacks(so.this.Wyp);
                    so.this.pvs(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.Wyp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.4
            @Override // java.lang.Runnable
            public void run() {
                if (so.this.OT) {
                    so.this.OT = false;
                    so.this.RgU = false;
                    so.this.so.removeCallbacks(so.this.Mxy);
                    so.this.pvs(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.Ju = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.5
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (so.this.elv != null) {
                    so.this.elv.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.kj.so.5.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (so.this.bNS != null) {
                                so.this.bNS.pvs(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (so.this.kj != null) {
                    so.this.kj.postDelayed(this, 500L);
                }
            }
        };
        this.IP = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.6
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                so.this.pvs("playable_stuck_check_ping", new JSONObject());
                if (so.this.kj != null) {
                    so.this.kj.postDelayed(this, 500L);
                }
            }
        };
        this.qh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.7
            @Override // java.lang.Runnable
            public void run() {
                if (so.this.Ca <= 0) {
                    so.this.icD(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (so.this.Ca - so.this.cGU <= so.this.Gp) {
                        so.this.jlb();
                        so.this.cGU = 0L;
                        so.this.Ca = 0L;
                        return;
                    }
                    so.this.icD(1, "Clicking on the hot zone causes the program to freeze.");
                }
            }
        };
    }

    private boolean qh(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public void pvs(View view) {
        if (view == null) {
            return;
        }
        try {
            this.tCd = new WeakReference<>(view);
            icD(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.lHK);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.UYh == view.getWidth() && this.FFl == view.getHeight()) {
                return;
            }
            this.UYh = view.getWidth();
            this.FFl = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.UYh);
            jSONObject.put("height", this.FFl);
            pvs("resize", jSONObject);
            this.yhq = jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public Context pvs() {
        return this.tQ;
    }

    public so pvs(String str, String str2) {
        this.sR.put(str, str2);
        return this;
    }

    public Map<String, String> icD() {
        return this.sR;
    }

    public so pvs(String str) {
        this.wjr = str;
        return this;
    }

    public so icD(String str) {
        this.pR = str;
        return this;
    }

    public JSONObject vG() {
        return this.Mnp;
    }

    public so vG(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.Mnp = jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public String Jd() {
        return this.pR;
    }

    public String NB() {
        return this.wjr;
    }

    public so Jd(String str) {
        this.EFw = str;
        return this;
    }

    public String sUS() {
        return this.EFw;
    }

    public so NB(String str) {
        this.xa = str;
        return this;
    }

    public String yiw() {
        return this.xa;
    }

    public so pvs(boolean z) {
        this.LHy = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.LHy);
            pvs("volumeChange", jSONObject);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public boolean so() {
        return this.LHy;
    }

    public so pvs(long j) {
        if (j <= 0) {
            this.dX = 10L;
        } else {
            this.dX = j;
        }
        return this;
    }

    public so icD(long j) {
        if (j <= 0) {
            this.CvL = 10L;
        } else {
            this.CvL = j;
        }
        return this;
    }

    public so icD(boolean z) {
        if (this.wr == z) {
            return this;
        }
        this.wr = z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.wr) {
                jSONObject.put("playable_background_show_type", this.rW);
            }
        } catch (JSONException unused) {
        }
        vG(this.wr ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.dx == -1 && this.wr) {
            this.dx = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", 1);
            } catch (JSONException unused2) {
            }
            vG("PL_sdk_page_show", jSONObject2);
        }
        if (this.dx != -1 && !this.wr && !this.MA) {
            this.MA = true;
        }
        if (this.wr) {
            this.jlb = System.currentTimeMillis();
        } else if (this.jlb != -1) {
            this.ae += System.currentTimeMillis() - this.jlb;
            this.jlb = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.wr);
            pvs("viewableChange", jSONObject3);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "setViewable error", th);
        }
        if (this.wr) {
            jlb();
        } else {
            dx();
        }
        return this;
    }

    public boolean Mxy() {
        return this.wr;
    }

    public so vG(boolean z) {
        this.mo = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.mo);
            pvs("change_playable_click", jSONObject);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public JSONObject Wyp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.mo);
            return jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public Set<String> qh() {
        return this.Wby.pvs();
    }

    public JSONObject kj() {
        try {
            boolean pvs2 = NB.pvs(this.tQ, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", pvs2);
            return jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject Ju() {
        try {
            boolean pvs2 = NB.pvs(this.tQ, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", pvs2);
            return jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject IP() {
        boolean pvs2;
        boolean pvs3;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                pvs2 = NB.pvs(this.tQ, "android.permission.READ_MEDIA_IMAGES");
                pvs3 = true;
            } else {
                pvs2 = NB.pvs(this.tQ, "android.permission.READ_EXTERNAL_STORAGE");
                pvs3 = NB.pvs(this.tQ, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", pvs2);
            jSONObject.put("isHasWrite", pvs3);
            if (!pvs2 || !pvs3) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void pvs(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.kj.pvs pvsVar = this.MY;
        if (pvsVar == null || pvsVar.icD(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            icD(optString2, optString);
        }
    }

    public void icD(JSONObject jSONObject) {
        if (this.MY != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject bNS() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.Ayu.ordinal());
            jSONObject.put("safe_area_top_height", this.Tdd);
            jSONObject.put("safe_area_bottom_height", this.ABo);
            jSONObject.put("playable_enter_from", this.cnN);
            jSONObject.put("playable_retry_count", this.BSi);
            jSONObject.put("playable_card_session", this.od);
            jSONObject.put("playable_video_session", this.OhP);
            jSONObject.put("playable_network_type", mnm());
            jSONObject.put("aweme_id", this.SE);
            return jSONObject;
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void pvs(String str, JSONObject jSONObject) {
        if (yiw.pvs() && jSONObject != null) {
            jSONObject.toString();
        }
        vG vGVar = this.rcB;
        if (vGVar != null) {
            vGVar.pvs(str, jSONObject);
        }
    }

    public void icD(String str, String str2) {
        Bitmap pvs2;
        if (TextUtils.isEmpty(str2) || (pvs2 = NB.pvs(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.tQ.getContentResolver(), pvs2, str, "");
    }

    public String mnm() {
        com.bytedance.sdk.openadsdk.kj.pvs pvsVar;
        if (TextUtils.isEmpty(this.jhZ) && (pvsVar = this.MY) != null) {
            this.jhZ = pvsVar.pvs().toString();
        }
        return this.jhZ;
    }

    public com.bytedance.sdk.openadsdk.kj.pvs vA() {
        return this.MY;
    }

    public JSONObject cR() {
        if (this.yhq.isNull("width")) {
            View view = this.tCd.get();
            if (view == null) {
                return this.yhq;
            }
            icD(view);
        }
        return this.yhq;
    }

    public JSONObject zM() {
        return this.AEt;
    }

    public so vG(JSONObject jSONObject) {
        this.AEt = jSONObject;
        return this;
    }

    public so sUS(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.ig = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.HWd == -1) {
                        pvs(2);
                    } else {
                        pvs(1);
                    }
                }
                this.FN = str;
                return this;
            }
            pvs(0);
            String queryParameter = parse.getQueryParameter(ImagesContract.URL);
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.FN = str;
            return this;
        }
        pvs(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.FN = str;
        return this;
    }

    public so pvs(int i) {
        this.HWd = i;
        return this;
    }

    public JSONObject uc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.RKd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.Oa);
            jSONObject2.put("height", this.RGX);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.nS);
            jSONObject3.put("y", this.GcG);
            jSONObject3.put("width", this.Lxj);
            jSONObject3.put("height", this.VVr);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.Irm);
            jSONObject4.put("y", this.BiC);
            jSONObject4.put("width", this.qVe);
            jSONObject4.put("height", this.LEC);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void rCZ() {
        com.bytedance.sdk.openadsdk.kj.pvs pvsVar = this.MY;
        if (pvsVar != null) {
            pvsVar.icD();
        }
    }

    public void OT() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.sP > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.sP);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.Pj > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.Pj;
                this.qD = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            vG("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Jd(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.joF = jSONObject.optString("section");
        }
    }

    public void ny() {
        this.CjQ = 2;
    }

    public void ZhG() {
        this.thO = true;
    }

    public void dyT() {
        if (this.MY != null) {
            pvs pvsVar = pvs.FEED_AWEME;
        }
    }

    public void dX() {
        if (this.MY != null) {
            pvs pvsVar = pvs.FEED_AWEME;
        }
    }

    public void NB(JSONObject jSONObject) {
        this.Zm = jSONObject;
        this.OyE++;
        dx();
        this.so.removeCallbacks(this.qh);
        if (this.ny) {
            this.gSd = System.currentTimeMillis();
            this.cGU = System.currentTimeMillis();
            this.Ca = 0L;
            int i = this.HWd;
            if (i == 0) {
                WebView webView = this.elv;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.kj.so.8
                        @Override // android.webkit.ValueCallback
                        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            so.this.Ca = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                pvs("playable_stuck_check_ping", new JSONObject());
            }
            this.so.postDelayed(this.qh, this.Gp);
        }
    }

    public void CvL() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.sP > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.sP);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.Pj > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.Pj);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            vG("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void sUS(JSONObject jSONObject) {
        icD(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void Gp() {
        icD icd;
        this.Ca = System.currentTimeMillis();
        int i = this.HWd;
        if ((i == 1 || i == 2) && (icd = this.bNS) != null) {
            icd.pvs(System.currentTimeMillis());
        }
    }

    public JSONObject yiw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt(LinkHeader.Parameters.Type, 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            return kj();
        }
        if (optInt != 2) {
            return optInt != 3 ? jSONObject2 : IP();
        }
        return Ju();
    }

    public JSONObject so(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt(LinkHeader.Parameters.Type, 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            jSONObject2.put("result", NB.icD(this.tQ, "android.permission.RECORD_AUDIO"));
        } else {
            if (optInt != 2) {
                if (optInt == 3) {
                    jSONObject2.put("result", NB.pvs(this.tQ));
                }
                return jSONObject2;
            }
            jSONObject2.put("result", NB.icD(this.tQ, "android.permission.CAMERA"));
        }
        return jSONObject2;
    }

    public void yiw(String str) {
        this.Ye = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.Pj = currentTimeMillis;
            long j = this.dx;
            jSONObject.put("playable_page_show_duration", j != -1 ? currentTimeMillis - j : 0L);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        vG("PL_sdk_html_load_start", jSONObject);
        this.RgU = true;
        this.VXe = true;
        if (this.FJ) {
            ae();
            this.RgU = false;
            this.VXe = false;
        }
        if (this.vA) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (NB.pvs(this.tQ, NB.kj)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (NB.icD(this.tQ, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (NB.pvs(this.tQ, NB.qh)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (NB.pvs(this.tQ, NB.Wyp)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (NB.pvs(this.tQ, NB.Mxy)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (NB.pvs(this.tQ, NB.so)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (NB.icD(this.tQ, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (NB.pvs(this.tQ, NB.yiw)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (NB.pvs(this.tQ)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                vG("PL_sdk_hardware_detect", jSONObject2);
                this.vA = false;
            } catch (Throwable th2) {
                yiw.pvs("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void ae() {
        int i;
        int i2 = this.HWd;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.RgU) {
                this.so.postDelayed(this.Mxy, this.dX * 1000);
            }
            if ((this.VXe && qh(this.FN)) || (i = this.HWd) == 1 || i == 2) {
                this.so.postDelayed(this.Wyp, this.CvL * 1000);
            }
        }
    }

    public void so(String str) {
        WebView webView;
        this.Ye = 2;
        this.mRq = str;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.cRf = currentTimeMillis;
            long j = this.Pj;
            jSONObject.put("playable_html_load_start_duration", j != -1 ? currentTimeMillis - j : 0L);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        vG("PL_sdk_html_load_finish", jSONObject);
        this.RgU = false;
        this.so.removeCallbacks(this.Mxy);
        try {
            if (this.HWd == 0) {
                if (this.mnm && (webView = this.elv) != null) {
                    this.mnm = false;
                    webView.evaluateJavascript(sP(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.kj.so.9
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                jlb();
            }
        } catch (Throwable th2) {
            yiw.pvs("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void gA() {
        this.VXe = false;
        this.so.removeCallbacks(this.Wyp);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.Pj > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.Pj);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            vG("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Mxy(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS, true);
            if (optBoolean) {
                this.Ye = 3;
                jlb();
            } else {
                this.Ye = -2;
            }
            if (optBoolean || !this.OT) {
                return;
            }
            this.OT = false;
            this.RgU = false;
            this.VXe = false;
            this.so.removeCallbacks(this.Mxy);
            this.so.removeCallbacks(this.Wyp);
            pvs(4, "CaseRenderFail");
        }
    }

    private void vG(int i, String str) {
        com.bytedance.sdk.openadsdk.kj.pvs pvsVar = this.MY;
        if (pvsVar != null) {
            pvsVar.pvs(i, str);
        }
    }

    protected void pvs(int i, String str) {
        dx();
        vG(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "reportRenderFatal error", th);
        }
        vG("PL_sdk_global_faild", jSONObject);
    }

    public void icD(int i, String str) {
        this.CjQ = i;
        if (this.Zm == null) {
            this.Zm = new JSONObject();
        }
        try {
            this.Zm.put("playable_stuck_type", i);
            this.Zm.put("playable_stuck_reason", str);
            if (this.gSd > 0) {
                this.Zm.put("playable_stuck_duration", System.currentTimeMillis() - this.gSd);
            } else {
                this.Zm.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        vG("PL_sdk_page_stuck", this.Zm);
        dx();
        if (this.MY == null || i != 2) {
            return;
        }
        this.Zm = new JSONObject();
    }

    protected void icD(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NB(str, jSONObject);
    }

    private String vG(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.SJ) && !TextUtils.isEmpty(this.ig)) {
            Uri parse = Uri.parse(this.ig);
            String host = parse.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.SJ = appendQueryParameter.toString();
        }
        return this.SJ;
    }

    private String Jd(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.FN = format;
        return format;
    }

    private void qD() {
        String str;
        if (this.AEt == null || (str = this.FN) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.AEt.optString("cid");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        String host = Uri.parse(this.FN).getHost();
        if (TextUtils.isEmpty(host)) {
            this.FN += "/cid_" + optString;
        } else {
            this.FN = this.FN.replace(host, host + "/cid_" + optString);
        }
    }

    private void NB(String str, JSONObject jSONObject) {
        try {
            int i = this.HWd;
            if (i == 0) {
                if (this.Ayu != pvs.LAND_PAGE && !qh(this.FN)) {
                    qD();
                }
                jSONObject.put("playable_url", this.FN);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", vG(this.SLG, this.Je));
                    }
                }
                jSONObject.put("playable_url", Jd(this.VLm, this.LDD));
            }
            jSONObject.put("playable_render_type", this.HWd);
            if (this.MY != null) {
                if (this.HWd == 0 && (this.Ayu != pvs.LAND_PAGE || qh(this.FN))) {
                    this.MY.pvs(jSONObject);
                } else if (this.HWd != 0) {
                    this.MY.pvs(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void vG(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.ea && this.sq > 0) {
                this.ea = true;
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.wr);
            jSONObject.put("playable_session_id", this.uc);
            int i = this.HWd;
            if (i == 0) {
                if (this.Ayu != pvs.LAND_PAGE && !qh(this.FN)) {
                    qD();
                }
                jSONObject.put("playable_url", this.FN);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", vG(this.SLG, this.Je));
                    }
                }
                jSONObject.put("playable_url", Jd(this.VLm, this.LDD));
            }
            jSONObject.put("playable_full_url", this.ig);
            jSONObject.put("playable_replay_count", this.ZsW);
            jSONObject.put("playable_is_prerender", this.zn);
            jSONObject.put("playable_is_preload", this.ea);
            jSONObject.put("playable_render_type", this.HWd);
            jSONObject.put("playable_scenes_type", this.Ayu.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.SLG) ? "" : this.SLG);
            if (!TextUtils.isEmpty(this.Je)) {
                str2 = this.Je;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.VLm);
            jSONObject.put("playable_minigamelite_schema", this.LDD);
            jSONObject.put("playable_is_debug", this.eOd);
            jSONObject.put("playable_retry_count", this.BSi);
            jSONObject.put("playable_enter_from", this.cnN);
            jSONObject.put("playable_sequence", this.OyE);
            jSONObject.put("playable_current_section", this.joF);
            jSONObject.put("is_playable_finish", this.thO);
            jSONObject.put("playable_card_session", this.od);
            jSONObject.put("playable_video_session", this.OhP);
            jSONObject.put("playable_network_type", mnm());
            jSONObject.put("playable_lynx_version", this.dyT);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.rCZ);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.AEt.opt("cid"));
            jSONObject2.put("log_extra", this.AEt.opt("log_extra"));
            int i2 = this.HWd;
            if (i2 != -1 && i2 != -2) {
                if (this.MY != null) {
                    List<JSONObject> list = this.CSZ;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.CSZ.iterator();
                        while (it.hasNext()) {
                            JSONObject optJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.HWd);
                                optJSONObject.put("playable_url", this.FN);
                            }
                            this.MY.pvs(optJSONObject);
                        }
                        this.CSZ.clear();
                    }
                    if (this.HWd == 0 && (this.Ayu != pvs.LAND_PAGE || qh(this.FN))) {
                        this.MY.pvs(jSONObject);
                        return;
                    } else {
                        if (this.HWd != 0) {
                            this.MY.pvs(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.CSZ == null) {
                this.CSZ = new ArrayList();
            }
            this.CSZ.add(jSONObject2);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void Mxy(String str) {
        this.so.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.10
            @Override // java.lang.Runnable
            public void run() {
                so.kj(so.this);
            }
        });
    }

    public void Wyp(String str) {
        this.so.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.so.2
            @Override // java.lang.Runnable
            public void run() {
                so.Ju(so.this);
            }
        });
    }

    public void jlb() {
        if (this.ny) {
            this.gSd = System.currentTimeMillis();
            if (this.Ayu == pvs.FEED_AWEME) {
                if (this.wr && this.Ye == 3) {
                    icD icd = this.bNS;
                    if (icd != null && icd.icD()) {
                        od();
                        return;
                    } else {
                        if (this.bNS == null) {
                            this.bNS = new icD(this, this.Gp);
                            od();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.wr && this.Ye == 2) {
                icD icd2 = this.bNS;
                if (icd2 != null && icd2.icD()) {
                    od();
                } else if (this.bNS == null) {
                    this.bNS = new icD(this, this.Gp);
                    od();
                }
            }
        }
    }

    private void od() {
        Runnable runnable;
        Runnable runnable2;
        this.bNS.pvs(System.currentTimeMillis());
        Handler handler = this.kj;
        if (handler != null) {
            int i = this.HWd;
            if (i == 0 && (runnable2 = this.Ju) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.IP) != null) {
                handler.post(runnable);
            }
            this.bNS.pvs(500);
        }
    }

    public void dx() {
        try {
            icD icd = this.bNS;
            if (icd != null) {
                icd.pvs();
            }
            Handler handler = this.kj;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            new StringBuilder("The stuttering detection has been paused due to a crash.-- ").append(th);
        }
    }

    public void Pj() {
        this.UYh = 0;
        this.FFl = 0;
        this.RKd = 0.0f;
        this.Oa = 0;
        this.RGX = 0;
        this.GcG = 0;
        this.nS = 0;
        this.Lxj = 0;
        this.VVr = 0;
        this.BiC = 0;
        this.Irm = 0;
        this.qVe = 0;
        this.LEC = 0;
    }

    public void cRf() {
        if (this.cUm) {
            return;
        }
        this.cUm = true;
        this.gA = 0L;
        this.vA = true;
        Pj();
        try {
            View view = this.tCd.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.lHK);
            }
        } catch (Throwable unused) {
        }
        try {
            this.Wby.icD();
        } catch (Throwable unused2) {
        }
        try {
            icD icd = this.bNS;
            if (icd != null) {
                icd.pvs();
                this.bNS = null;
            }
            Handler handler = this.kj;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            new StringBuilder("crash -- ").append(th);
        }
        try {
            if (!TextUtils.isEmpty(this.FN)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.yWX);
                jSONObject.put("playable_hit_times", this.sq);
                int i = this.yWX;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.sq / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                vG("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.FN)) {
                if (this.jlb != -1) {
                    this.ae += System.currentTimeMillis() - this.jlb;
                    this.jlb = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.ae);
                vG("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.RgU = false;
        this.VXe = false;
        this.so.removeCallbacks(this.Mxy);
        this.so.removeCallbacks(this.Wyp);
        this.so.removeCallbacksAndMessages(null);
    }

    public void pvs(int i, String str, String str2) {
        this.Ye = -1;
        this.mRq = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
        } catch (Throwable th) {
            yiw.pvs("PlayablePlugin", "onWebReceivedError error", th);
        }
        vG("PL_sdk_html_load_error", jSONObject);
        if (this.OT) {
            this.OT = false;
            this.RgU = false;
            this.VXe = false;
            this.so.removeCallbacks(this.Mxy);
            this.so.removeCallbacks(this.Wyp);
            pvs(1, "ContainerLoadFail");
        }
    }

    public void pvs(boolean z, String str, int i) {
        if (z) {
            this.Ye = -1;
            this.mRq = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
            } catch (Throwable th) {
                yiw.pvs("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            vG("PL_sdk_html_load_error", jSONObject);
            if (this.OT) {
                this.OT = false;
                this.RgU = false;
                this.VXe = false;
                this.so.removeCallbacks(this.Mxy);
                this.so.removeCallbacks(this.Wyp);
                pvs(1, "ContainerLoadFail");
            }
        }
    }

    public JSONObject Jd(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (yiw.pvs() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject pvs2 = this.Wby.pvs(str, jSONObject);
        if (yiw.pvs()) {
            System.currentTimeMillis();
            if (pvs2 != null) {
                pvs2.toString();
            }
        }
        return pvs2;
    }

    public so Jd(boolean z) {
        this.FJ = z;
        return this;
    }

    public static so pvs(Context context, WebView webView, vG vGVar, com.bytedance.sdk.openadsdk.kj.pvs pvsVar) {
        if (webView == null || vGVar == null || pvsVar == null) {
            return null;
        }
        return new so(context, webView, vGVar, pvsVar, pvs.LAND_PAGE);
    }
}
