package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.pvs.vA;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.kj.yiw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullPlayableManager.java */
/* loaded from: classes2.dex */
public class yiw implements Handler.Callback, com.bytedance.sdk.openadsdk.Mxy.yiw {
    private static final yiw.pvs Mxy = new yiw.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.1
        @Override // com.bytedance.sdk.openadsdk.kj.yiw.pvs
        public void pvs(String str, String str2, Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs(str, str2, th);
        }
    };
    private final pvs IP;
    private final String Ju;
    private boolean OT;
    private volatile boolean Wyp;
    private boolean ZhG;
    private PlayableLoadingView cR;
    private boolean dyT;
    private final cR kj;
    private bNS mnm;
    private volatile boolean ny;
    private final Activity qh;
    private com.bytedance.sdk.openadsdk.kj.so rCZ;
    private boolean so;
    private HomeWatcherReceiver uc;
    protected final AtomicBoolean pvs = new AtomicBoolean(false);
    private final Handler bNS = new Handler(this);
    boolean icD = false;
    boolean vG = false;
    long Jd = 0;
    int NB = 0;
    int sUS = 0;
    int yiw = 0;
    private int vA = 1;
    private boolean zM = true;
    private final com.bytedance.sdk.openadsdk.Mxy.Jd dX = new com.bytedance.sdk.openadsdk.Mxy.Jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.8
        @Override // com.bytedance.sdk.openadsdk.Mxy.Jd
        public void icD() {
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.Jd
        public void pvs(int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.Mxy.Jd
        public void pvs() {
            if (!yiw.this.IP.od.isFinishing() && yiw.this.IP.icD.SLG() && rCZ.Mxy(yiw.this.IP.icD)) {
                yiw.this.bNS.removeMessages(800);
                yiw.this.bNS.sendMessage(yiw.pvs(1, 0));
            }
        }
    };

    public yiw(pvs pvsVar) {
        this.IP = pvsVar;
        this.qh = pvsVar.od;
        this.Ju = pvsVar.NB;
        this.kj = pvsVar.icD;
    }

    public static Message pvs(int i, int i2) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i;
        if (i == 3) {
            obtain.arg2 = i2;
        }
        return obtain;
    }

    public void icD(int i) {
        if (i == 5) {
            this.so = true;
            if (rCZ.mnm(this.kj)) {
                this.bNS.removeMessages(TypedValues.Custom.TYPE_INT);
                this.IP.SE.sendEmptyMessage(600);
            }
        }
        this.bNS.sendMessage(pvs(i, 0));
    }

    public void pvs() {
        if (this.OT) {
            return;
        }
        this.OT = true;
        this.mnm = this.IP.dx;
        this.vA = this.IP.cnN;
        OT();
        if (rCZ.icD(this.kj)) {
            DeviceUtils.AudioInfoReceiver.pvs(this);
        }
        if (ny() && rCZ.qh(this.kj) && rCZ.Mxy(this.kj)) {
            Handler handler = this.bNS;
            handler.sendMessageDelayed(handler.obtainMessage(800, 2, rCZ.pvs(2)), rCZ.Ju(this.kj) * 1000);
        }
    }

    public void pvs(final com.bytedance.sdk.openadsdk.Mxy.NB nb, boolean z) {
        com.bytedance.sdk.openadsdk.Wyp.icD icd;
        vA pvs;
        com.bytedance.sdk.openadsdk.kj.so Jd;
        if (rCZ.icD(this.kj) && this.IP.yWX) {
            if (com.bytedance.sdk.openadsdk.core.so.icD().vA()) {
                com.bytedance.sdk.openadsdk.kj.yiw.pvs(Mxy);
            }
            com.bytedance.sdk.openadsdk.kj.pvs pvsVar = new com.bytedance.sdk.openadsdk.kj.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.2
                @Override // com.bytedance.sdk.openadsdk.kj.pvs
                public void pvs(int i, String str) {
                    super.pvs(i, str);
                    if (yiw.this.cR == null || !yiw.this.cR.isShown()) {
                        return;
                    }
                    yiw.this.bNS.sendMessage(yiw.pvs(3, rCZ.pvs(i)));
                }

                @Override // com.bytedance.sdk.openadsdk.kj.pvs
                public com.bytedance.sdk.openadsdk.kj.Jd pvs() {
                    return yiw.rCZ();
                }

                @Override // com.bytedance.sdk.openadsdk.kj.pvs
                public void icD() {
                    yiw.this.IP.dx.Wyp().vG(true);
                    com.bytedance.sdk.openadsdk.Mxy.NB nb2 = nb;
                    if (nb2 != null) {
                        nb2.pvs();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.kj.pvs
                public void pvs(JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.icD.vG.icD(yiw.this.kj, yiw.this.Ju, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.kj.vG vGVar = new com.bytedance.sdk.openadsdk.kj.vG() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.3
                @Override // com.bytedance.sdk.openadsdk.kj.vG
                public void pvs(String str, JSONObject jSONObject) {
                    yiw.this.IP.dx.Wyp().pvs(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", this.kj.neB());
                jSONObject.put("log_extra", this.kj.HWd());
                Jd = com.bytedance.sdk.openadsdk.kj.so.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs(), this.IP.dx.so().getWebView(), vGVar, pvsVar).sUS(this.IP.dx.OT()).NB(com.bytedance.sdk.openadsdk.common.pvs.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs())).pvs(com.bytedance.sdk.openadsdk.common.pvs.pvs()).vG(jSONObject).pvs("sdkEdition", com.bytedance.sdk.openadsdk.common.pvs.vG()).icD(com.bytedance.sdk.openadsdk.common.pvs.NB()).Jd(com.bytedance.sdk.openadsdk.common.pvs.Jd()).vG(false).pvs(z).pvs(rCZ.Ju(this.kj)).icD(rCZ.Ju(this.kj)).Jd(rCZ.qh(this.kj));
                this.rCZ = Jd;
            } catch (Exception unused) {
                if (this.rCZ == null) {
                    icd = new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.4
                        @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                        public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("PlayablePlugin_init").icD(jSONObject2.toString());
                        }
                    };
                }
            } catch (Throwable th) {
                if (this.rCZ == null) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.4
                        @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                        public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("PlayablePlugin_init").icD(jSONObject2.toString());
                        }
                    });
                }
                throw th;
            }
            if (Jd == null) {
                icd = new com.bytedance.sdk.openadsdk.Wyp.icD() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.4
                    @Override // com.bytedance.sdk.openadsdk.Wyp.icD
                    public com.bytedance.sdk.openadsdk.Wyp.pvs.vG getLogStats() throws Exception {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("PlayablePlugin_is_null", true);
                        return com.bytedance.sdk.openadsdk.Wyp.pvs.Jd.icD().pvs("PlayablePlugin_init").icD(jSONObject2.toString());
                    }
                };
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs("PlayablePlugin_init", false, icd);
            }
            if (this.rCZ != null && !TextUtils.isEmpty(rCZ.Jd(this.kj))) {
                this.rCZ.vG(rCZ.Jd(this.kj));
            }
            com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
            if (soVar != null) {
                Set<String> qh = soVar.qh();
                final WeakReference weakReference = new WeakReference(this.rCZ);
                for (String str : qh) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (pvs = this.IP.dx.Wyp().pvs()) != null) {
                        pvs.pvs(str, new com.bytedance.sdk.component.pvs.NB<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.5
                            @Override // com.bytedance.sdk.component.pvs.NB
                            public JSONObject pvs(JSONObject jSONObject2, com.bytedance.sdk.component.pvs.sUS sus) {
                                try {
                                    com.bytedance.sdk.openadsdk.kj.so soVar2 = (com.bytedance.sdk.openadsdk.kj.so) weakReference.get();
                                    if (soVar2 == null) {
                                        return null;
                                    }
                                    return soVar2.Jd(pvs(), jSONObject2);
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.kj.Jd rCZ() {
        String sUS = com.bytedance.sdk.openadsdk.common.pvs.sUS();
        sUS.hashCode();
        switch (sUS) {
            case "2g":
                return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_2G;
            case "3g":
                return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_3G;
            case "4g":
                return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_4G;
            case "5g":
                return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_5G;
            case "wifi":
                return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.kj.Jd.TYPE_UNKNOWN;
        }
    }

    private void OT() {
        this.cR = (PlayableLoadingView) this.IP.qD.findViewById(com.bytedance.sdk.openadsdk.utils.kj.OBt);
    }

    private boolean ny() {
        if (this.cR == null) {
            return false;
        }
        if (this.kj.SLG() && rCZ.qh(this.kj)) {
            this.cR.icD();
            return true;
        }
        this.cR.pvs();
        return false;
    }

    public void icD() {
        if (this.pvs.getAndSet(true)) {
            return;
        }
        this.mnm.jlb();
        if (rCZ.vG(this.kj)) {
            this.mnm.sUS();
        }
    }

    public void pvs(DownloadListener downloadListener) {
        SSWebView Mxy2 = this.mnm.Mxy();
        if (Mxy2 == null) {
            return;
        }
        String ZhG = ZhG();
        if (TextUtils.isEmpty(ZhG)) {
            return;
        }
        Mxy2.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.NB(this.qh, this.mnm.qh(), this.kj.neB(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (yiw.this.zM) {
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), yiw.this.kj, yiw.this.Ju, "loading_h5_success");
                }
                super.onPageFinished(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                yiw.this.zM = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                yiw.this.zM = false;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.NB, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                yiw.this.zM = false;
            }
        });
        Mxy2.a_(ZhG);
        Mxy2.setDisplayZoomControls(false);
        Mxy2.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pvs.Jd(this.mnm.qh(), this.mnm.kj()));
        Mxy2.setDownloadListener(downloadListener);
    }

    private String ZhG() {
        String CvL = com.bytedance.sdk.openadsdk.core.mnm.Jd().CvL();
        if (TextUtils.isEmpty(CvL) || this.kj.Ca() == null) {
            return CvL;
        }
        String icD = this.kj.Ca().icD();
        double Jd = this.kj.Ca().Jd();
        int NB = this.kj.Ca().NB();
        String pvs = (this.kj.ea() == null || TextUtils.isEmpty(this.kj.ea().pvs())) ? "" : this.kj.ea().pvs();
        String neB = this.kj.neB();
        String vG = this.kj.Ca().vG();
        String pvs2 = this.kj.Ca().pvs();
        String icD2 = this.kj.Ca().icD();
        String qd = this.kj.qd();
        StringBuilder sb = new StringBuilder("appname=");
        sb.append(URLEncoder.encode(icD)).append("&stars=").append(Jd).append("&comments=").append(NB).append("&icon=").append(URLEncoder.encode(pvs)).append("&downloading=true&id=").append(URLEncoder.encode(neB)).append("&packageName=").append(URLEncoder.encode(vG)).append("&downloadUrl=").append(URLEncoder.encode(pvs2)).append("&name=").append(URLEncoder.encode(icD2)).append("&orientation=").append(this.vA == 1 ? "portrait" : "landscape").append("&apptitle=").append(URLEncoder.encode(qd));
        return CvL + "?" + ((Object) sb);
    }

    public void vG() {
        this.icD = true;
    }

    public boolean Jd() {
        return this.icD;
    }

    public void NB() {
        if (this.dyT) {
            return;
        }
        this.dyT = true;
        vG(false);
        pvs(this.qh.getApplicationContext());
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.cRf();
        }
        this.bNS.removeCallbacksAndMessages(null);
        DeviceUtils.AudioInfoReceiver.icD(this);
    }

    public void pvs(boolean z) {
        if (z) {
            this.mnm.so().setDomStorageEnabled(true);
        }
    }

    public void icD(boolean z) {
        if (z) {
            try {
                if (!TextUtils.isEmpty(this.mnm.OT()) && this.mnm.uc() != 0) {
                    com.bytedance.sdk.openadsdk.Wyp.vG.pvs().pvs(this.mnm.OT(), this.mnm.uc(), this.mnm.rCZ());
                }
            } catch (Throwable unused) {
            }
        }
        if (z) {
            try {
                if (TextUtils.isEmpty(this.mnm.OT())) {
                    return;
                }
                com.bytedance.sdk.openadsdk.Wyp.vG.pvs().icD(this.mnm.OT());
            } catch (Throwable unused2) {
            }
        }
    }

    public void sUS() {
        try {
            HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
            this.uc = homeWatcherReceiver;
            homeWatcherReceiver.pvs(new HomeWatcherReceiver.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.yiw.7
                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.pvs
                public void pvs() {
                    yiw.this.vG = true;
                }

                @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.pvs
                public void icD() {
                    yiw.this.vG = true;
                }
            });
            this.qh.getApplicationContext().registerReceiver(this.uc, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable unused) {
        }
    }

    private void pvs(Context context) {
        try {
            this.uc.pvs(null);
            context.getApplicationContext().unregisterReceiver(this.uc);
        } catch (Throwable unused) {
        }
    }

    public void pvs(String str) {
        if (this.vG) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TypedValues.TransitionType.S_DURATION, System.currentTimeMillis() - this.Jd);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFPM", "sendPlayableEvent error", e);
            }
            com.bytedance.sdk.openadsdk.icD.vG.icD(this.kj, this.Ju, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.vG = false;
            }
        }
    }

    public void yiw() {
        if (this.Jd > 0) {
            return;
        }
        this.Jd = System.currentTimeMillis();
        Handler handler = this.bNS;
        handler.sendMessage(handler.obtainMessage(TypedValues.Custom.TYPE_INT, qh(), 0));
        vG(true);
    }

    public void pvs(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put(TypedValues.TransitionType.S_DURATION, System.currentTimeMillis() - this.Jd);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFPM", "endShow json error", e);
            }
        }
    }

    public void vG(int i) {
        PlayableLoadingView playableLoadingView = this.cR;
        if (playableLoadingView != null) {
            playableLoadingView.setProgress(i);
        }
    }

    public void pvs(com.bytedance.sdk.openadsdk.core.icD.NB nb) {
        PlayableLoadingView playableLoadingView = this.cR;
        if (playableLoadingView == null || playableLoadingView.getPlayView() == null) {
            return;
        }
        if (rCZ.qh(this.kj) || rCZ.mnm(this.kj)) {
            this.cR.getPlayView().setOnClickListener(nb);
            this.cR.getPlayView().setOnTouchListener(nb);
        }
    }

    public void so() {
        if (!rCZ.vG(this.kj) && this.cR.isShown() && this.IP.Ye != null) {
            this.IP.Ye.pvs(qh() * 1000);
        }
        if (rCZ.kj(this.kj) && this.cR.isShown()) {
            this.IP.sP.pvs(this.IP.Zm);
        }
        PlayableLoadingView playableLoadingView = this.cR;
        if (playableLoadingView != null) {
            playableLoadingView.pvs();
        }
        if (this.pvs.getAndSet(true) || !rCZ.icD(this.kj) || !rCZ.mnm(this.kj) || this.IP.dx == null || this.IP.dx.Pj()) {
            return;
        }
        if (rCZ.qh(this.IP.icD)) {
            pvs(this.IP.sUS, this.IP.icD, this.IP.icD.FJ());
            yiw();
            this.IP.OhP.qh();
        }
        this.IP.sP.pvs(false);
        this.IP.dx.dx();
        this.ny = true;
        this.IP.cRf.vG(false);
        this.IP.jlb.pvs(true);
        this.IP.ea = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_event", "PL_sdk_page_show");
            jSONObject.put("playable_ts", System.currentTimeMillis());
            String NB = rCZ.NB(this.kj);
            String OT = this.IP.dx.OT();
            if (!TextUtils.isEmpty(OT)) {
                NB = OT;
            }
            jSONObject.put("playable_url", NB);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_network_type", rCZ());
            jSONObject.put("render_type", 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.kj, this.Ju, "playable_track", jSONObject);
        if (rCZ.kj(this.kj)) {
            this.bNS.removeMessages(TypedValues.Custom.TYPE_INT);
            this.IP.cRf.Jd(false);
            if (this.IP.SE != null) {
                this.IP.SE.removeMessages(1);
                this.IP.SE.sendEmptyMessageDelayed(600, 1000L);
            }
        }
    }

    public void Mxy() {
        if (this.cR.isShown()) {
            return;
        }
        PlayableLoadingView playableLoadingView = this.cR;
        if (playableLoadingView != null) {
            playableLoadingView.icD();
            this.cR.setProgress(this.IP.dx.so() != null ? this.IP.dx.so().getProgress() : 0);
        }
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.ae();
        }
    }

    public boolean Wyp() {
        return this.Wyp;
    }

    public void vG(boolean z) {
        this.Wyp = z;
        if (z) {
            return;
        }
        this.bNS.removeMessages(TypedValues.Custom.TYPE_INT);
    }

    public int Jd(int i) {
        return this.yiw - (this.sUS - i);
    }

    public int qh() {
        return this.sUS;
    }

    public int kj() {
        return this.NB;
    }

    public void pvs(int i, cR cRVar, boolean z) {
        if (cRVar == null) {
            return;
        }
        this.sUS = cRVar.AEt();
        this.yiw = com.bytedance.sdk.openadsdk.core.mnm.Jd().pvs(String.valueOf(i), z);
    }

    public void NB(int i) {
        this.NB = i - 1;
    }

    public void sUS(int i) {
        this.NB = i;
    }

    @Override // com.bytedance.sdk.openadsdk.Mxy.yiw
    public void pvs(int i) {
        if (!rCZ.kj(this.IP.icD) || this.IP.Wyp.get()) {
            if (rCZ.qh(this.IP.icD) || rCZ.kj(this.IP.icD)) {
                if (this.IP.jlb.icD()) {
                    boolean z = this.IP.ea;
                    this.IP.jlb.pvs();
                    if (i == 0) {
                        this.IP.cRf.icD(true);
                        this.IP.ny.icD(true);
                        return;
                    } else {
                        this.IP.cRf.icD(false);
                        this.IP.ny.icD(false);
                        return;
                    }
                }
                this.IP.jlb.pvs(-1);
                boolean z2 = this.IP.ea;
                this.IP.jlb.pvs();
                if (this.IP.ZsW) {
                    if (i == 0) {
                        this.IP.ea = true;
                        this.IP.cRf.icD(true);
                        this.IP.ny.icD(true);
                    } else {
                        this.IP.ea = false;
                        this.IP.cRf.icD(false);
                        this.IP.ny.icD(false);
                    }
                }
            }
        }
    }

    public void Ju() {
        if (this.rCZ == null || !Pj.Jd(this.IP.dx.so())) {
            return;
        }
        this.rCZ.icD(true);
    }

    public void IP() {
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.icD(false);
        }
        this.bNS.removeMessages(TypedValues.Custom.TYPE_INT);
    }

    public void Jd(boolean z) {
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.icD(z);
        }
    }

    public void NB(boolean z) {
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.pvs(z);
        }
    }

    public void pvs(int i, String str, String str2) {
        try {
            com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
            if (soVar != null) {
                soVar.pvs(i, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public void pvs(boolean z, String str, int i) {
        try {
            com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
            if (soVar != null) {
                soVar.pvs(z, str, i);
            }
        } catch (Exception unused) {
        }
    }

    public void icD(String str) {
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.so(str);
        }
        if (vA()) {
            this.IP.dx.Jd(true);
            this.IP.jlb.pvs(true);
            this.IP.ea = true;
        }
    }

    public void vG(String str) {
        com.bytedance.sdk.openadsdk.kj.so soVar = this.rCZ;
        if (soVar != null) {
            soVar.yiw(str);
        }
    }

    public void bNS() {
        this.bNS.removeMessages(TypedValues.Custom.TYPE_INT);
        this.bNS.removeMessages(600);
    }

    public void pvs(long j) {
        Message obtain = Message.obtain();
        obtain.what = TypedValues.Custom.TYPE_INT;
        obtain.arg1 = kj();
        this.bNS.sendMessageDelayed(obtain, j);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        PlayableLoadingView playableLoadingView;
        if (message.what == 900) {
            if (!this.Wyp || !rCZ.qh(this.IP.icD)) {
                return true;
            }
            int i = message.arg1;
            if (i > 0) {
                this.IP.cRf.Jd(true);
                int Jd = this.IP.dyT.Jd(i);
                if (Jd == i) {
                    this.IP.cRf.pvs(String.valueOf(i), null);
                } else if (Jd > 0) {
                    this.IP.cRf.pvs(String.valueOf(i), String.format(uc.pvs(this.IP.od.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(Jd)));
                } else if (vA()) {
                    this.IP.zM.set(true);
                    this.IP.Zm.mnm();
                } else {
                    this.IP.cRf.pvs(String.valueOf(i), uc.pvs(this.IP.od.getApplicationContext(), "tt_txt_skip"));
                    this.IP.cRf.NB(true);
                }
                Message obtain = Message.obtain();
                obtain.what = TypedValues.Custom.TYPE_INT;
                obtain.arg1 = i - 1;
                this.bNS.sendMessageDelayed(obtain, 1000L);
                this.IP.dyT.NB(i);
            } else {
                if (rCZ.vG(this.kj) && (!rCZ.mnm(this.kj) || !this.IP.dyT.vA())) {
                    this.IP.cRf.vG();
                    this.IP.cRf.NB(true);
                } else {
                    this.IP.cRf.Jd(false);
                    this.IP.zM.set(true);
                    this.IP.Zm.mnm();
                }
                if (!this.so) {
                    this.ZhG = true;
                }
            }
            this.IP.OhP.IP();
        } else {
            if (message.what != 800 || ((playableLoadingView = this.cR) != null && (!playableLoadingView.isShown() || this.cR.vG()))) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                String NB = rCZ.NB(this.kj);
                pvs pvsVar = this.IP;
                if (pvsVar != null && pvsVar.dx != null) {
                    String OT = this.IP.dx.OT();
                    if (!TextUtils.isEmpty(OT)) {
                        NB = OT;
                    }
                }
                jSONObject.put("playable_url", NB);
                PlayableLoadingView playableLoadingView2 = this.cR;
                r3 = playableLoadingView2 != null ? playableLoadingView2.getDisplayDuration() : 0L;
                jSONObject.put(TypedValues.TransitionType.S_DURATION, r3);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFPM", "handleMessage json error", e);
            }
            com.bytedance.sdk.openadsdk.icD.vG.pvs(this.IP.icD, this.IP.NB, "remove_loading_page", jSONObject, r3);
            this.bNS.removeMessages(800);
            if (!this.qh.isFinishing()) {
                this.IP.dyT.so();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.Mxy.Jd mnm() {
        return this.dX;
    }

    public void sUS(boolean z) {
        if (!z || this.IP.dyT.vA()) {
            return;
        }
        boolean qh = rCZ.qh(this.kj);
        if ((qh || rCZ.mnm(this.kj)) && this.kj.SLG() && !rCZ.Mxy(this.kj)) {
            Handler handler = this.bNS;
            handler.sendMessageDelayed(handler.obtainMessage(800, 0, 0), 1000L);
        }
        if (qh) {
            this.IP.dyT.icD();
            this.IP.dx.icD(true);
            this.IP.dx.vG(true);
            com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), this.IP.icD, this.Ju, "py_loading_success");
        }
    }

    public boolean vA() {
        return this.ny;
    }

    public boolean cR() {
        return this.ZhG;
    }

    public boolean zM() {
        PlayableLoadingView playableLoadingView = this.cR;
        return playableLoadingView != null && playableLoadingView.isShown();
    }
}
