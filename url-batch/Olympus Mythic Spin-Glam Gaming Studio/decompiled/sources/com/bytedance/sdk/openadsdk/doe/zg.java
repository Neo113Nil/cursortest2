package com.bytedance.sdk.openadsdk.doe;

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
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import io.bidmachine.iab.vast.tags.VastAttributes;
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

/* loaded from: classes9.dex */
public class zg {
    private long am;
    private boolean ao;
    private com.bytedance.sdk.openadsdk.doe.zmn ax;
    private String bjh;
    private Map<String, String> bmc;
    public final String btk;
    private Runnable bvs;
    private int bxw;
    private int cd;
    private fs cn;
    private int cud;
    private boolean cyb;
    private boolean db;
    private int dey;
    private int dgt;
    private boolean doe;
    private int es;
    private float eug;
    private long ev;
    public final String fb;
    private long fkt;
    public final String fs;
    private boolean fw;
    private boolean gn;
    private String gt;
    private long hgd;
    private final String hhw;
    private float hip;
    private JSONObject hsp;
    private JSONObject hwg;
    private boolean hz;

    /* renamed from: io, reason: collision with root package name */
    private long f3744io;
    private String iqz;
    private Runnable iv;
    private String ji;
    private String jy;
    private boolean kgc;
    private String kh;
    private long kjb;
    private final Handler klz;
    private int kra;
    private Set<String> kw;
    private long lbc;
    private int lgz;
    private int ljl;
    private int lt;
    private int ltf;
    private int lwz;
    private boolean mf;
    private int mhu;
    private String mig;
    private WeakReference<View> mpi;
    private int mrt;
    private Runnable mw;
    private boolean my;
    private int na;
    private zmn nkt;
    private int nlz;
    private final String nps;
    private boolean nqi;
    private long nu;
    private String ob;
    private zn obg;
    private Context oep;
    private boolean olo;
    private String oub;
    private String ouf;
    private ViewTreeObserver.OnGlobalLayoutListener pa;
    private boolean pf;
    private String phc;
    private int pl;
    private List<JSONObject> pw;
    private boolean qr;
    private int quu;
    private Runnable rc;
    private int rje;
    private long rp;
    private float rsi;
    private Runnable rt;
    private hhw skn;
    private boolean sl;
    private long so;
    private String sxr;

    @Nullable
    private WebView tdm;
    private String tet;
    private JSONObject tev;
    private long tf;
    private String tj;
    private int uaq;
    private int uqd;
    private boolean uqh;
    private String utx;
    private String uw;
    private int va;
    private int ve;
    private boolean vgx;
    private String vlj;
    private int vpd;
    private JSONObject vtz;
    private String wd;
    private String wq;
    private long ww;
    private int xrr;
    private long yj;
    private boolean yo;
    private String yof;
    private int zak;
    private volatile boolean ze;
    private final Handler zg;
    private int zi;
    public final String zmn;
    public final String zn;
    private volatile boolean zq;

    public enum zmn {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    static /* synthetic */ int klz(zg zgVar) {
        int i = zgVar.dgt;
        zgVar.dgt = i + 1;
        return i;
    }

    static /* synthetic */ int mw(zg zgVar) {
        int i = zgVar.cud;
        zgVar.cud = i + 1;
        return i;
    }

    private zg(Context context, WebView webView, zn znVar, com.bytedance.sdk.openadsdk.doe.zmn zmnVar, zmn zmnVar2) {
        this.hhw = "playable_stuck_check_ping";
        this.nps = "playable_apply_media_permission_callback";
        this.zg = new Handler(Looper.getMainLooper());
        this.klz = new Handler(Looper.getMainLooper());
        this.cyb = true;
        this.olo = true;
        this.kgc = true;
        this.zmn = "PL_sdk_playable_global_viewable";
        this.fs = "PL_sdk_page_screen_blank";
        this.zn = "PL_sdk_playable_destroy_analyze_summary";
        this.fb = "PL_sdk_playable_hardware_dialog_cancel";
        this.btk = "PL_sdk_playable_hardware_dialog_setting";
        this.kw = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.iqz = null;
        this.phc = "embeded_ad";
        this.doe = true;
        this.nqi = true;
        this.uqh = false;
        this.bjh = "";
        this.rp = 10L;
        this.kjb = 10L;
        this.zak = 700;
        this.am = 0L;
        this.yj = 0L;
        this.so = -1L;
        this.ev = -1L;
        this.tf = -1L;
        this.fkt = -1L;
        this.hgd = -1L;
        this.nu = -1L;
        this.ww = -1L;
        this.oub = "";
        this.jy = "";
        this.vlj = "";
        this.yof = "";
        this.dgt = 0;
        this.cud = 0;
        this.gn = false;
        this.uqd = 0;
        this.kra = -1;
        this.na = 0;
        this.mhu = 0;
        this.bxw = 0;
        this.tet = null;
        this.yo = false;
        this.xrr = 0;
        this.ve = 0;
        this.cd = 0;
        this.lt = 0;
        this.f3744io = 0L;
        this.lbc = 0L;
        this.rje = -2;
        this.zi = 0;
        this.nlz = 0;
        this.es = 0;
        this.hsp = new JSONObject();
        this.bmc = new HashMap();
        this.vtz = new JSONObject();
        this.ob = "";
        this.rsi = 0.0f;
        this.hip = 0.0f;
        this.hz = false;
        this.pf = false;
        this.qr = false;
        this.pw = new ArrayList();
        this.my = true;
        this.ze = true;
        this.zq = true;
        this.pa = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.doe.zg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) zg.this.mpi.get();
                    if (view == null) {
                        return;
                    }
                    zg.this.fs(view);
                } catch (Throwable th) {
                    nps.zmn("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.ltf = -1;
        this.rje = 0;
        this.nkt = zmnVar2;
        this.tdm = webView;
        bvs.zmn(webView);
        zmn(webView);
        zmn(context, znVar, zmnVar);
    }

    private zg(Context context, int i, zn znVar, com.bytedance.sdk.openadsdk.doe.zmn zmnVar) {
        this.hhw = "playable_stuck_check_ping";
        this.nps = "playable_apply_media_permission_callback";
        this.zg = new Handler(Looper.getMainLooper());
        this.klz = new Handler(Looper.getMainLooper());
        this.cyb = true;
        this.olo = true;
        this.kgc = true;
        this.zmn = "PL_sdk_playable_global_viewable";
        this.fs = "PL_sdk_page_screen_blank";
        this.zn = "PL_sdk_playable_destroy_analyze_summary";
        this.fb = "PL_sdk_playable_hardware_dialog_cancel";
        this.btk = "PL_sdk_playable_hardware_dialog_setting";
        this.kw = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.iqz = null;
        this.phc = "embeded_ad";
        this.doe = true;
        this.nqi = true;
        this.uqh = false;
        this.bjh = "";
        this.rp = 10L;
        this.kjb = 10L;
        this.zak = 700;
        this.am = 0L;
        this.yj = 0L;
        this.so = -1L;
        this.ev = -1L;
        this.tf = -1L;
        this.fkt = -1L;
        this.hgd = -1L;
        this.nu = -1L;
        this.ww = -1L;
        this.oub = "";
        this.jy = "";
        this.vlj = "";
        this.yof = "";
        this.dgt = 0;
        this.cud = 0;
        this.gn = false;
        this.uqd = 0;
        this.kra = -1;
        this.na = 0;
        this.mhu = 0;
        this.bxw = 0;
        this.tet = null;
        this.yo = false;
        this.xrr = 0;
        this.ve = 0;
        this.cd = 0;
        this.lt = 0;
        this.f3744io = 0L;
        this.lbc = 0L;
        this.rje = -2;
        this.zi = 0;
        this.nlz = 0;
        this.es = 0;
        this.hsp = new JSONObject();
        this.bmc = new HashMap();
        this.vtz = new JSONObject();
        this.ob = "";
        this.rsi = 0.0f;
        this.hip = 0.0f;
        this.hz = false;
        this.pf = false;
        this.qr = false;
        this.pw = new ArrayList();
        this.my = true;
        this.ze = true;
        this.zq = true;
        this.pa = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.doe.zg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) zg.this.mpi.get();
                    if (view == null) {
                        return;
                    }
                    zg.this.fs(view);
                } catch (Throwable th) {
                    nps.zmn("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.ltf = -1;
        this.rje = i;
        this.nkt = zmn.LAND_PAGE;
        zmn(context, znVar, zmnVar);
    }

    private void zmn(Context context, zn znVar, com.bytedance.sdk.openadsdk.doe.zmn zmnVar) {
        this.iqz = UUID.randomUUID().toString();
        this.oep = context;
        this.ax = zmnVar;
        this.obg = znVar;
        iv.zmn(zmnVar);
        this.skn = new hhw(this);
        jy();
        if (this.tdm == null) {
            this.ltf = 4;
            this.zg.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.4
                @Override // java.lang.Runnable
                public void run() {
                    zg.this.zmn(5, "webview is null");
                }
            });
        }
    }

    private void jy() {
        this.cn = new fs(this, this.zak);
        this.bvs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.5
            @Override // java.lang.Runnable
            public void run() {
                if (zg.this.doe) {
                    zg.this.doe = false;
                    zg.this.zg.removeCallbacks(zg.this.iv);
                    zg.this.zmn(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.iv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.6
            @Override // java.lang.Runnable
            public void run() {
                if (zg.this.doe) {
                    zg.this.doe = false;
                    zg.this.ze = false;
                    zg.this.zg.removeCallbacks(zg.this.bvs);
                    zg.this.zmn(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.mw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (zg.this.tdm != null) {
                    zg.this.tdm.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.doe.zg.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (zg.this.cn != null) {
                                zg.this.cn.zmn(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (zg.this.klz != null) {
                    zg.this.klz.postDelayed(this, 500L);
                }
            }
        };
        this.rt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                zg.this.zmn("playable_stuck_check_ping", new JSONObject());
                if (zg.this.klz != null) {
                    zg.this.klz.postDelayed(this, 500L);
                }
            }
        };
        this.rc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.9
            @Override // java.lang.Runnable
            public void run() {
                if (zg.this.lbc <= 0) {
                    zg.this.fs(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (zg.this.lbc - zg.this.f3744io <= zg.this.zak) {
                        zg.this.ev();
                        zg.this.f3744io = 0L;
                        zg.this.lbc = 0L;
                        return;
                    }
                    zg.this.fs(1, "Clicking on the hot zone causes the program to freeze.");
                }
            }
        };
    }

    private boolean klz(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public void zmn(View view) {
        if (view == null) {
            return;
        }
        try {
            this.mpi = new WeakReference<>(view);
            fs(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.pa);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.nlz == view.getWidth() && this.es == view.getHeight()) {
                return;
            }
            this.nlz = view.getWidth();
            this.es = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.nlz);
            jSONObject.put("height", this.es);
            zmn(n.g, jSONObject);
            this.hsp = jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public Context zmn() {
        return this.oep;
    }

    public zg zmn(String str, String str2) {
        this.bmc.put(str, str2);
        return this;
    }

    public Map<String, String> fs() {
        return this.bmc;
    }

    public zg zmn(String str) {
        this.utx = str;
        return this;
    }

    public zg fs(String str) {
        this.uw = str;
        return this;
    }

    public JSONObject zn() {
        return this.tev;
    }

    public zg zn(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.tev = jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public String fb() {
        return this.uw;
    }

    public String btk() {
        return this.utx;
    }

    public zg fb(String str) {
        this.wq = str;
        return this;
    }

    public String hhw() {
        return this.wq;
    }

    public zg btk(String str) {
        this.tj = str;
        return this;
    }

    public String nps() {
        return this.tj;
    }

    public zg zmn(boolean z) {
        this.ao = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.ao);
            zmn("volumeChange", jSONObject);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public boolean zg() {
        return this.ao;
    }

    public zg fs(boolean z) {
        this.db = z;
        return this;
    }

    public zg zmn(long j) {
        if (j <= 0) {
            this.rp = 10L;
        } else {
            this.rp = j;
        }
        return this;
    }

    public zg fs(long j) {
        if (j <= 0) {
            this.kjb = 10L;
        } else {
            this.kjb = j;
        }
        return this;
    }

    public void zmn(int i) {
        this.ltf = i;
    }

    public zg zn(boolean z) {
        if (this.ltf == -1 || this.vgx == z) {
            return this;
        }
        this.vgx = z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.vgx) {
                jSONObject.put("playable_background_show_type", this.ve);
            }
        } catch (JSONException unused) {
        }
        zn(this.vgx ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.ev == -1 && this.vgx) {
            this.ev = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.ltf == 1 ? 1 : 2);
                int i = this.ltf;
                if (i != -1) {
                    jSONObject2.put("webview_state", i);
                }
            } catch (JSONException unused2) {
            }
            zn("PL_sdk_page_show", jSONObject2);
        }
        if (this.ev != -1 && !this.vgx && !this.hz) {
            this.hz = true;
        }
        if (this.vgx) {
            this.so = System.currentTimeMillis();
        } else if (this.so != -1) {
            this.am += System.currentTimeMillis() - this.so;
            this.so = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.vgx);
            zmn(X3.h.V, jSONObject3);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "setViewable error", th);
        }
        if (this.vgx) {
            ev();
        } else {
            tf();
        }
        return this;
    }

    public boolean bvs() {
        return this.vgx;
    }

    public zg fb(boolean z) {
        this.sl = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.sl);
            zmn("change_playable_click", jSONObject);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public JSONObject iv() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.sl);
            return jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public Set<String> rc() {
        return this.skn.zmn();
    }

    public JSONObject klz() {
        try {
            boolean zmn2 = btk.zmn(this.oep, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zmn2);
            return jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject mw() {
        try {
            boolean zmn2 = btk.zmn(this.oep, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zmn2);
            return jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject rt() {
        boolean zmn2;
        boolean zmn3;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zmn2 = btk.zmn(this.oep, "android.permission.READ_MEDIA_IMAGES");
                zmn3 = true;
            } else {
                zmn2 = btk.zmn(this.oep, "android.permission.READ_EXTERNAL_STORAGE");
                zmn3 = btk.zmn(this.oep, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zmn2);
            jSONObject.put("isHasWrite", zmn3);
            if (!zmn2 || !zmn3) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void zmn(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.doe.zmn zmnVar = this.ax;
        if (zmnVar == null || zmnVar.fs(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            fs(optString2, optString);
        }
    }

    public void fs(JSONObject jSONObject) {
        if (this.ax != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject cn() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.nkt.ordinal());
            jSONObject.put("safe_area_top_height", this.rsi);
            jSONObject.put("safe_area_bottom_height", this.hip);
            jSONObject.put("playable_enter_from", this.mhu);
            jSONObject.put("playable_retry_count", this.na);
            jSONObject.put("playable_card_session", this.oub);
            jSONObject.put("playable_video_session", this.jy);
            jSONObject.put("playable_network_type", cyb());
            jSONObject.put("aweme_id", this.yof);
            return jSONObject;
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void zmn(String str, JSONObject jSONObject) {
        if (this.fw) {
            if (!nps.zmn() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (nps.zmn() && jSONObject != null) {
            jSONObject.toString();
        }
        zn znVar = this.obg;
        if (znVar != null) {
            znVar.zmn(str, jSONObject);
        }
    }

    public void fs(String str, String str2) {
        Bitmap zmn2;
        if (TextUtils.isEmpty(str2) || (zmn2 = btk.zmn(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.oep.getContentResolver(), zmn2, str, "");
    }

    public String cyb() {
        com.bytedance.sdk.openadsdk.doe.zmn zmnVar;
        if (TextUtils.isEmpty(this.vlj) && (zmnVar = this.ax) != null) {
            this.vlj = zmnVar.zmn().toString();
        }
        return this.vlj;
    }

    public com.bytedance.sdk.openadsdk.doe.zmn olo() {
        return this.ax;
    }

    public JSONObject kgc() {
        if (this.hsp.isNull("width")) {
            View view = this.mpi.get();
            if (view == null) {
                return this.hsp;
            }
            fs(view);
        }
        return this.hsp;
    }

    public JSONObject kw() {
        return this.vtz;
    }

    public zg zn(JSONObject jSONObject) {
        this.vtz = jSONObject;
        return this;
    }

    public zg hhw(String str) {
        this.phc = str;
        return this;
    }

    public zg nps(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.ob = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!X3.i.K.equalsIgnoreCase(host) && (host == null || !host.contains(X3.i.K))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.rje == -1) {
                        fs(2);
                    } else {
                        fs(1);
                    }
                }
                this.mig = str;
                return this;
            }
            fs(0);
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.mig = str;
            return this;
        }
        fs(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.mig = str;
        return this;
    }

    public zg fs(int i) {
        this.rje = i;
        return this;
    }

    public zg zmn(float f) {
        this.eug = f;
        return this;
    }

    public JSONObject iqz() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.eug);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.mrt);
            jSONObject2.put("height", this.dey);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(VastAttributes.HORIZONTAL_POSITION, this.va);
            jSONObject3.put(VastAttributes.VERTICAL_POSITION, this.lgz);
            jSONObject3.put("width", this.vpd);
            jSONObject3.put("height", this.lwz);
            jSONObject.put(X3.i.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(VastAttributes.HORIZONTAL_POSITION, this.uaq);
            jSONObject4.put(VastAttributes.VERTICAL_POSITION, this.ljl);
            jSONObject4.put("width", this.quu);
            jSONObject4.put("height", this.pl);
            jSONObject.put(VastAttributes.VISIBLE, jSONObject4);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void phc() {
        com.bytedance.sdk.openadsdk.doe.zmn zmnVar = this.ax;
        if (zmnVar != null) {
            zmnVar.fs();
        }
    }

    public void doe() {
        com.bytedance.sdk.openadsdk.doe.zmn zmnVar = this.ax;
        if (zmnVar != null) {
            zmnVar.zn();
        }
    }

    public void nqi() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.hgd > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.hgd);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.tf > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.tf;
                this.ww = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            zn("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void fb(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.tet = jSONObject.optString("section");
        }
    }

    public void uqh() {
        this.kra = 2;
    }

    public void bjh() {
        this.yo = true;
    }

    public void rp() {
        if (this.ax != null) {
            zmn zmnVar = zmn.LAND_PAGE;
        }
    }

    public void kjb() {
        if (this.ax != null) {
            zmn zmnVar = zmn.LAND_PAGE;
        }
    }

    public void btk(JSONObject jSONObject) {
        this.hwg = jSONObject;
        this.bxw++;
        tf();
        this.zg.removeCallbacks(this.rc);
        if (this.nqi) {
            this.nu = System.currentTimeMillis();
            this.f3744io = System.currentTimeMillis();
            this.lbc = 0L;
            int i = this.rje;
            if (i == 0) {
                WebView webView = this.tdm;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.doe.zg.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            zg.this.lbc = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                zmn("playable_stuck_check_ping", new JSONObject());
            }
            this.zg.postDelayed(this.rc, this.zak);
        }
    }

    public void zak() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.hgd > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.hgd);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.tf > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.tf);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            zn("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void hhw(JSONObject jSONObject) {
        fs(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void am() {
        fs fsVar;
        this.lbc = System.currentTimeMillis();
        int i = this.rje;
        if ((i == 1 || i == 2) && (fsVar = this.cn) != null) {
            fsVar.zmn(System.currentTimeMillis());
        }
    }

    public JSONObject nps(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            return klz();
        }
        if (optInt != 2) {
            return optInt != 3 ? jSONObject2 : rt();
        }
        return mw();
    }

    public JSONObject zg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            jSONObject2.put("result", btk.fs(this.oep, "android.permission.RECORD_AUDIO"));
        } else {
            if (optInt != 2) {
                if (optInt == 3) {
                    jSONObject2.put("result", btk.zmn(this.oep));
                }
                return jSONObject2;
            }
            jSONObject2.put("result", btk.fs(this.oep, "android.permission.CAMERA"));
        }
        return jSONObject2;
    }

    public void zg(String str) {
        this.zi = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.tf = currentTimeMillis;
            long j = this.ev;
            jSONObject.put("playable_page_show_duration", j != -1 ? currentTimeMillis - j : 0L);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        zn("PL_sdk_html_load_start", jSONObject);
        this.ze = true;
        this.zq = true;
        if (this.my) {
            yj();
            this.ze = false;
            this.zq = false;
        }
        if (this.olo) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (btk.zmn(this.oep, btk.klz)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (btk.fs(this.oep, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (btk.zmn(this.oep, btk.rc)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (btk.zmn(this.oep, btk.iv)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (btk.zmn(this.oep, btk.bvs)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (btk.zmn(this.oep, btk.zg)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (btk.fs(this.oep, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (btk.zmn(this.oep, btk.nps)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (btk.zmn(this.oep)) {
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
                zn("PL_sdk_hardware_detect", jSONObject2);
                this.olo = false;
            } catch (Throwable th2) {
                nps.zmn("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void yj() {
        int i;
        int i2 = this.rje;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.ze) {
                this.zg.postDelayed(this.bvs, this.rp * 1000);
            }
            if ((this.zq && klz(this.mig)) || (i = this.rje) == 1 || i == 2) {
                this.zg.postDelayed(this.iv, this.kjb * 1000);
            }
        }
    }

    public void bvs(String str) {
        WebView webView;
        boolean z = this.zi == -1;
        this.zi = 2;
        if (!z) {
            this.ouf = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.fkt = currentTimeMillis;
                long j = this.tf;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? currentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", nu());
            } catch (Throwable th) {
                nps.zmn("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            zn("PL_sdk_html_load_finish", jSONObject);
        }
        this.ze = false;
        this.zg.removeCallbacks(this.bvs);
        try {
            if (this.rje == 0) {
                if (this.cyb && (webView = this.tdm) != null) {
                    this.cyb = false;
                    webView.evaluateJavascript(ww(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.doe.zg.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                ev();
            }
        } catch (Throwable th2) {
            nps.zmn("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void so() {
        this.zq = false;
        this.zg.removeCallbacks(this.iv);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.tf > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.tf);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            zn("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void bvs(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.zi = 3;
                ev();
            } else {
                this.zi = -2;
            }
            if (optBoolean || !this.doe) {
                return;
            }
            this.doe = false;
            this.ze = false;
            this.zq = false;
            this.zg.removeCallbacks(this.bvs);
            this.zg.removeCallbacks(this.iv);
            zmn(4, "CaseRenderFail");
        }
    }

    private void zn(int i, String str) {
        com.bytedance.sdk.openadsdk.doe.zmn zmnVar = this.ax;
        if (zmnVar != null) {
            zmnVar.zmn(i, str);
        }
    }

    protected void zmn(int i, String str) {
        tf();
        zn(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "reportRenderFatal error", th);
        }
        zn("PL_sdk_global_faild", jSONObject);
    }

    public void fs(int i, String str) {
        this.kra = i;
        if (this.hwg == null) {
            this.hwg = new JSONObject();
        }
        try {
            this.hwg.put("playable_stuck_type", i);
            this.hwg.put("playable_stuck_reason", str);
            if (this.nu > 0) {
                this.hwg.put("playable_stuck_duration", System.currentTimeMillis() - this.nu);
            } else {
                this.hwg.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        zn("PL_sdk_page_stuck", this.hwg);
        tf();
        if (this.ax == null || i != 2) {
            return;
        }
        this.hwg = new JSONObject();
    }

    protected void fs(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        btk(str, jSONObject);
    }

    private String zn(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.sxr) && !TextUtils.isEmpty(this.ob)) {
            Uri parse = Uri.parse(this.ob);
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
            this.sxr = appendQueryParameter.toString();
        }
        return this.sxr;
    }

    private String fb(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.mig = format;
        return format;
    }

    private void vlj() {
        String str;
        if (this.vtz == null || (str = this.mig) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.vtz.optString("cid");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        String host = Uri.parse(this.mig).getHost();
        if (TextUtils.isEmpty(host)) {
            this.mig += "/cid_" + optString;
            return;
        }
        this.mig = this.mig.replace(host, host + "/cid_" + optString);
    }

    private void btk(String str, JSONObject jSONObject) {
        try {
            int i = this.rje;
            if (i == 0) {
                if (this.nkt != zmn.LAND_PAGE && !klz(this.mig)) {
                    vlj();
                }
                jSONObject.put("playable_url", this.mig);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", zn(this.gt, this.wd));
                    }
                }
                jSONObject.put("playable_url", fb(this.ji, this.kh));
            }
            jSONObject.put("playable_render_type", this.rje);
            if (this.ax != null) {
                if (this.rje == 0 && (this.nkt != zmn.LAND_PAGE || klz(this.mig))) {
                    this.ax.zmn(jSONObject);
                } else if (this.rje != 0) {
                    this.ax.zmn(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void zn(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.gn && this.cud > 0) {
                this.gn = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.mf ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.vgx);
            jSONObject.put("playable_session_id", this.iqz);
            int i = this.rje;
            if (i == 0) {
                if (this.nkt != zmn.LAND_PAGE && !klz(this.mig)) {
                    vlj();
                }
                jSONObject.put("playable_url", this.mig);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", zn(this.gt, this.wd));
                    }
                }
                jSONObject.put("playable_url", fb(this.ji, this.kh));
            }
            jSONObject.put("playable_full_url", this.ob);
            jSONObject.put("playable_replay_count", this.uqd);
            jSONObject.put("playable_is_prerender", this.db);
            jSONObject.put("playable_is_preload", this.gn);
            jSONObject.put("playable_render_type", this.rje);
            jSONObject.put("playable_scenes_type", this.nkt.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.gt) ? "" : this.gt);
            if (!TextUtils.isEmpty(this.wd)) {
                str2 = this.wd;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.ji);
            jSONObject.put("playable_minigamelite_schema", this.kh);
            jSONObject.put("playable_is_debug", this.pf);
            jSONObject.put("playable_retry_count", this.na);
            jSONObject.put("playable_enter_from", this.mhu);
            jSONObject.put("playable_sequence", this.bxw);
            jSONObject.put("playable_current_section", this.tet);
            jSONObject.put("is_playable_finish", this.yo);
            jSONObject.put("playable_card_session", this.oub);
            jSONObject.put("playable_video_session", this.jy);
            jSONObject.put("playable_network_type", cyb());
            jSONObject.put("playable_lynx_version", this.bjh);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.phc);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.vtz.opt("cid"));
            jSONObject2.put("log_extra", this.vtz.opt("log_extra"));
            int i2 = this.rje;
            if (i2 != -1 && i2 != -2) {
                if (this.ax != null) {
                    List<JSONObject> list = this.pw;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.pw.iterator();
                        while (it.hasNext()) {
                            JSONObject optJSONObject = it.next().optJSONObject("adExtraData");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.rje);
                                optJSONObject.put("playable_url", this.mig);
                            }
                            this.ax.zmn(optJSONObject);
                        }
                        this.pw.clear();
                    }
                    if (this.rje == 0 && (this.nkt != zmn.LAND_PAGE || klz(this.mig))) {
                        this.ax.zmn(jSONObject);
                        return;
                    } else {
                        if (this.rje != 0) {
                            this.ax.zmn(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.pw == null) {
                this.pw = new ArrayList();
            }
            this.pw.add(jSONObject2);
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void iv(String str) {
        this.zg.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.2
            @Override // java.lang.Runnable
            public void run() {
                zg.klz(zg.this);
            }
        });
    }

    public void rc(String str) {
        this.zg.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.zg.3
            @Override // java.lang.Runnable
            public void run() {
                zg.mw(zg.this);
            }
        });
    }

    public void ev() {
        if (this.nqi) {
            this.nu = System.currentTimeMillis();
            if (this.nkt == zmn.FEED_AWEME) {
                if (this.vgx && this.zi == 3) {
                    fs fsVar = this.cn;
                    if (fsVar != null && fsVar.fs()) {
                        yof();
                        return;
                    } else {
                        if (this.cn == null) {
                            this.cn = new fs(this, this.zak);
                            yof();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.vgx && this.zi == 2) {
                fs fsVar2 = this.cn;
                if (fsVar2 != null && fsVar2.fs()) {
                    yof();
                } else if (this.cn == null) {
                    this.cn = new fs(this, this.zak);
                    yof();
                }
            }
        }
    }

    private void yof() {
        Runnable runnable;
        Runnable runnable2;
        this.cn.zmn(System.currentTimeMillis());
        Handler handler = this.klz;
        if (handler != null) {
            int i = this.rje;
            if (i == 0 && (runnable2 = this.mw) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.rt) != null) {
                handler.post(runnable);
            }
            this.cn.zmn(500);
        }
    }

    public void tf() {
        try {
            fs fsVar = this.cn;
            if (fsVar != null) {
                fsVar.zmn();
            }
            Handler handler = this.klz;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void fkt() {
        this.nlz = 0;
        this.es = 0;
        this.eug = 0.0f;
        this.mrt = 0;
        this.dey = 0;
        this.lgz = 0;
        this.va = 0;
        this.vpd = 0;
        this.lwz = 0;
        this.ljl = 0;
        this.uaq = 0;
        this.quu = 0;
        this.pl = 0;
    }

    public void hgd() {
        if (this.qr) {
            return;
        }
        this.qr = true;
        this.yj = 0L;
        this.olo = true;
        fkt();
        try {
            View view = this.mpi.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.pa);
            }
        } catch (Throwable unused) {
        }
        try {
            this.skn.fs();
        } catch (Throwable unused2) {
        }
        try {
            fs fsVar = this.cn;
            if (fsVar != null) {
                fsVar.zmn();
                this.cn = null;
            }
            Handler handler = this.klz;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.mig)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.dgt);
                jSONObject.put("playable_hit_times", this.cud);
                int i = this.dgt;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.cud / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                zn("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.mig)) {
                if (this.so != -1) {
                    this.am += System.currentTimeMillis() - this.so;
                    this.so = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.am);
                zn("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.ze = false;
        this.zq = false;
        this.zg.removeCallbacks(this.bvs);
        this.zg.removeCallbacks(this.iv);
        this.zg.removeCallbacksAndMessages(null);
    }

    public void zmn(int i, String str, String str2) {
        this.zi = -1;
        this.ouf = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", nu());
        } catch (Throwable th) {
            nps.zmn("PlayablePlugin", "onWebReceivedError error", th);
        }
        zn("PL_sdk_html_load_error", jSONObject);
        if (this.doe) {
            this.doe = false;
            this.ze = false;
            this.zq = false;
            this.zg.removeCallbacks(this.bvs);
            this.zg.removeCallbacks(this.iv);
            zmn(1, "ContainerLoadFail");
        }
    }

    public int nu() {
        return (this.ev == -1 || !this.vgx) ? 1 : 2;
    }

    public void zmn(boolean z, String str, int i) {
        if (z) {
            this.zi = -1;
            this.ouf = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", nu());
            } catch (Throwable th) {
                nps.zmn("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            zn("PL_sdk_html_load_error", jSONObject);
            if (this.doe) {
                this.doe = false;
                this.ze = false;
                this.zq = false;
                this.zg.removeCallbacks(this.bvs);
                this.zg.removeCallbacks(this.iv);
                zmn(1, "ContainerLoadFail");
            }
        }
    }

    public String ww() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public int oub() {
        return this.ltf;
    }

    public JSONObject fb(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (nps.zmn() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject zmn2 = this.skn.zmn(str, jSONObject);
        if (nps.zmn()) {
            System.currentTimeMillis();
            if (zmn2 != null) {
                zmn2.toString();
            }
        }
        return zmn2;
    }

    public zg btk(boolean z) {
        this.my = z;
        return this;
    }

    public void hhw(boolean z) {
        this.mf = z;
    }

    public void nps(boolean z) {
        this.fw = z;
    }

    public static zg zmn(Context context, @Nullable WebView webView, zn znVar, com.bytedance.sdk.openadsdk.doe.zmn zmnVar) {
        if (znVar == null || zmnVar == null) {
            return null;
        }
        if (webView == null) {
            return new zg(context, 0, znVar, zmnVar);
        }
        return new zg(context, webView, znVar, zmnVar, zmn.LAND_PAGE);
    }
}
