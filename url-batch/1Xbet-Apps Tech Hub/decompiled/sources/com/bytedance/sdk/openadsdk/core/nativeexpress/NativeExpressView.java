package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.adexpress.icD.Wyp;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.CvL;
import com.bytedance.sdk.openadsdk.core.Gp;
import com.bytedance.sdk.openadsdk.core.ae;
import com.bytedance.sdk.openadsdk.core.bannerexpress.VastBannerBackupView;
import com.bytedance.sdk.openadsdk.core.bannerexpress.pvs;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.icD.pvs;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.rCZ;
import com.bytedance.sdk.openadsdk.core.ugen.vG.pvs;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.zM;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NativeExpressView extends PAGFrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.Jd, com.bytedance.sdk.component.adexpress.icD.bNS, com.bytedance.sdk.component.adexpress.icD.so, pvs.InterfaceC0074pvs, kj {
    public static int rCZ = 500;
    private List<com.bytedance.sdk.component.adexpress.icD.Wyp> BSi;
    private float Ca;
    private Wyp.pvs CjQ;
    protected com.bytedance.sdk.component.adexpress.icD.icD CvL;
    private final SparseArray<vG.pvs> Cwg;
    public com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> Gp;
    private long HWd;
    protected boolean IP;
    private TTDislikeDialogAbstract Jd;
    protected boolean Ju;
    protected String Mxy;
    private PAGExpressAdWrapperListener NB;
    public boolean OT;
    private icD OhP;
    private com.bytedance.sdk.component.adexpress.icD.sUS OyE;
    private String Pj;
    private final Runnable SE;
    protected AdSlot Wyp;
    private VastBannerBackupView Ye;
    boolean ZhG;
    private float Zm;
    private vA ZsW;
    private String ae;
    protected com.bytedance.sdk.component.adexpress.icD.vG bNS;
    private float cGU;
    protected int cR;
    private String cRf;
    private com.bytedance.sdk.component.adexpress.icD.mnm cnN;
    long dX;
    private com.bytedance.sdk.openadsdk.icD.vG.NB dx;
    public com.bytedance.sdk.openadsdk.icD.yiw dyT;
    private ThemeStatusBroadcastReceiver ea;
    private float gA;
    private boolean gSd;
    private int icD;
    private final ViewTreeObserver.OnScrollChangedListener jhZ;
    private float jlb;
    private com.bytedance.sdk.openadsdk.core.ugen.component.Jd joF;
    public FrameLayout kj;
    protected boolean mnm;
    private float neB;
    int ny;
    private final AtomicBoolean od;
    private boolean pvs;
    private bNS qD;
    private com.bytedance.sdk.component.adexpress.icD.Ju qd;
    protected cR qh;
    private int rW;
    private pvs.InterfaceC0073pvs sP;
    private sUS sUS;
    protected final Context so;
    private final Runnable sq;
    private com.bytedance.sdk.component.adexpress.icD.Mxy thO;
    protected HashSet<String> uc;
    boolean vA;
    private com.bytedance.sdk.openadsdk.dislike.icD vG;
    private final Runnable yWX;
    private yiw yiw;
    protected String zM;

    public int Jd() {
        return 0;
    }

    public void NB() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void d_() {
    }

    public void icD() {
    }

    public void icD(int i) {
    }

    public void pvs() {
    }

    public void pvs(int i) {
    }

    public void pvs(int i, String str) {
    }

    protected void pvs(Ju.pvs pvsVar) {
    }

    protected void pvs(JSONObject jSONObject) {
    }

    public void pvs(boolean z) {
    }

    protected boolean pvs(com.bytedance.sdk.component.adexpress.icD.IP ip) {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void setTimeUpdate(int i) {
    }

    public long vG() {
        return 0L;
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.icD icd) {
        if (this.ZsW == null || getJsObject() == null) {
            return;
        }
        getJsObject().pvs(icd);
    }

    public com.bytedance.sdk.openadsdk.icD.yiw getAdShowTime() {
        return this.dyT;
    }

    public void setClosedListenerKey(String str) {
        this.cRf = str;
        icD icd = this.OhP;
        if (icd != null) {
            icd.pvs(str);
        }
    }

    public icD getBrandBannerController() {
        return this.OhP;
    }

    public String getClosedListenerKey() {
        return this.cRf;
    }

    public void setBannerClickClosedListener(pvs.InterfaceC0073pvs interfaceC0073pvs) {
        this.sP = interfaceC0073pvs;
    }

    public NativeExpressView(Context context, cR cRVar, AdSlot adSlot, String str) {
        super(context);
        this.pvs = true;
        this.icD = 0;
        this.Mxy = "embeded_ad";
        this.ae = null;
        this.IP = false;
        this.mnm = false;
        this.vA = true;
        this.cR = -1;
        this.Pj = "";
        this.OT = false;
        this.gSd = true;
        this.ny = -1;
        this.dyT = new com.bytedance.sdk.openadsdk.icD.yiw();
        this.dX = 0L;
        this.od = new AtomicBoolean(false);
        this.jhZ = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (NativeExpressView.this.vA) {
                    NativeExpressView.this.rCZ();
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.removeCallbacks(nativeExpressView.SE);
                    NativeExpressView nativeExpressView2 = NativeExpressView.this;
                    nativeExpressView2.postDelayed(nativeExpressView2.SE, 500L);
                }
            }
        };
        this.SE = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (Gp.pvs(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.NB(nativeExpressView.getVisibility());
                } else {
                    NativeExpressView.this.NB(8);
                }
            }
        };
        this.yWX = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.NB(0);
            }
        };
        this.sq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.NB(8);
            }
        };
        this.rW = 8;
        this.Cwg = new SparseArray<>();
        this.neB = -1.0f;
        this.cGU = -1.0f;
        this.Ca = -1.0f;
        this.Zm = -1.0f;
        this.HWd = 0L;
        this.Mxy = str;
        this.so = context;
        this.qh = cRVar;
        this.Wyp = adSlot;
        this.OT = false;
        sUS();
    }

    public NativeExpressView(Context context, cR cRVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        super(context);
        this.pvs = true;
        this.icD = 0;
        this.Mxy = "embeded_ad";
        this.ae = null;
        this.IP = false;
        this.mnm = false;
        this.vA = true;
        this.cR = -1;
        this.Pj = "";
        this.OT = false;
        this.gSd = true;
        this.ny = -1;
        this.dyT = new com.bytedance.sdk.openadsdk.icD.yiw();
        this.dX = 0L;
        this.od = new AtomicBoolean(false);
        this.jhZ = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (NativeExpressView.this.vA) {
                    NativeExpressView.this.rCZ();
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.removeCallbacks(nativeExpressView.SE);
                    NativeExpressView nativeExpressView2 = NativeExpressView.this;
                    nativeExpressView2.postDelayed(nativeExpressView2.SE, 500L);
                }
            }
        };
        this.SE = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                if (Gp.pvs(NativeExpressView.this, 0, 5)) {
                    NativeExpressView nativeExpressView = NativeExpressView.this;
                    nativeExpressView.NB(nativeExpressView.getVisibility());
                } else {
                    NativeExpressView.this.NB(8);
                }
            }
        };
        this.yWX = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.3
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.NB(0);
            }
        };
        this.sq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.4
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressView.this.NB(8);
            }
        };
        this.rW = 8;
        this.Cwg = new SparseArray<>();
        this.neB = -1.0f;
        this.cGU = -1.0f;
        this.Ca = -1.0f;
        this.Zm = -1.0f;
        this.HWd = 0L;
        this.Mxy = str;
        this.so = context;
        this.qh = cRVar;
        this.Wyp = adSlot;
        this.OT = z;
        this.gSd = z2;
        sUS();
    }

    protected void sUS() {
        this.uc = new HashSet<>();
        this.ea = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.Wyp;
        if (adSlot != null) {
            this.gA = adSlot.getExpressViewAcceptedWidth();
            this.jlb = this.Wyp.getExpressViewAcceptedHeight();
            yiw();
            this.ae = this.Wyp.getCodeId();
            if (TextUtils.equals(this.Mxy, "fullscreen_interstitial_ad")) {
                this.ny = com.bytedance.sdk.openadsdk.core.mnm.Jd().zM(this.ae);
            } else if (TextUtils.equals(this.Mxy, "rewarded_video")) {
                this.ny = com.bytedance.sdk.openadsdk.core.mnm.Jd().Wyp(this.ae);
            } else if (TextUtils.equals(this.Mxy, "open_ad")) {
                int OT = com.bytedance.sdk.openadsdk.core.mnm.Jd().OT(this.ae);
                this.ny = OT;
                if (OT < 0) {
                    this.ny = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.qh.Mnp()) {
            this.OhP = new icD(this.so, this, this.qh, this.Mxy);
            return;
        }
        mnm();
        this.BSi = new ArrayList();
        vA();
        com.bytedance.sdk.component.adexpress.icD.mnm mnmVar = this.cnN;
        if (mnmVar != null) {
            this.ZsW = (vA) mnmVar.icD();
        }
        CvL jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.sUS(this.Mxy);
        }
    }

    private void yiw() {
        cR.pvs gSd = this.qh.gSd();
        if (!TextUtils.equals(this.Mxy, "embeded_ad") || gSd == null) {
            return;
        }
        String qh = gSd.qh();
        if (TextUtils.isEmpty(qh)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(qh);
            int optInt = jSONObject.optInt("width");
            int optInt2 = jSONObject.optInt("height");
            if (optInt == 0 || optInt2 == 0) {
                return;
            }
            this.jlb = optInt2;
            this.gA = optInt;
        } catch (Exception unused) {
        }
    }

    public SSWebView getWebView() {
        vA vAVar = this.ZsW;
        if (vAVar == null) {
            return null;
        }
        return vAVar.pvs();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void mnm() {
        long j;
        boolean z;
        Ju.pvs pvsVar;
        cR.pvs gSd;
        this.dx = new com.bytedance.sdk.openadsdk.icD.vA(1, this.Mxy, this.qh);
        this.thO = new qh(this.dx, this.Mxy, this.qh, this.ae);
        try {
            j = new JSONObject(this.qh.gSd().Wyp()).optLong("render_delay_time");
        } catch (Exception unused) {
            j = 0;
        }
        if (!cR.NB(this.qh)) {
            if (com.bytedance.sdk.openadsdk.core.mnm.Jd().Ju(this.ae) == 1) {
                z = true;
                long min = Math.min(Math.max(j, 0L), WorkRequest.MIN_BACKOFF_MILLIS);
                int renderTimeout = getRenderTimeout();
                double sUS = this.qh.od() == null ? this.qh.od().sUS() * this.qh.od().OT() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                int i = this.ny;
                this.ZhG = i == -1 && i < ((int) sUS);
                if (!com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(this.qh)) {
                    pvs.C0081pvs c0081pvs = new pvs.C0081pvs();
                    c0081pvs.pvs(com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(this.qh, this.Mxy));
                    c0081pvs.pvs((com.bytedance.adsdk.ugeno.core.mnm) this.thO);
                    c0081pvs.pvs(this.gA);
                    c0081pvs.icD(this.jlb);
                    pvsVar = c0081pvs;
                } else {
                    pvsVar = new Ju.pvs();
                }
                pvsVar.pvs(this.Mxy).icD(this.qh.neB()).vG(this.qh.Sn()).Jd(this.qh.HWd()).pvs(this.thO).Jd(this.qh.Lxj()).pvs(renderTimeout).icD(this.qh.yhq()).vG(this.gSd).icD(this.qh.Gp()).pvs(min).vG(this.qh.jhZ()).pvs(com.bytedance.sdk.openadsdk.core.nativeexpress.pvs.icD.pvs(this.qh)).Jd(z).NB(this.ny).pvs(this.ZhG).pvs(sUS).sUS(com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().FFl()).pvs(new com.bytedance.sdk.component.adexpress.icD.NB() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.5
                    @Override // com.bytedance.sdk.component.adexpress.icD.NB
                    public JSONObject pvs() {
                        if (NativeExpressView.this.qh == null) {
                            NativeExpressView.this.Pj = "material is null";
                            return null;
                        }
                        if (com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(NativeExpressView.this.qh)) {
                            NativeExpressView.this.qD = new bNS();
                            JSONObject pvs = com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(NativeExpressView.this.qh, NativeExpressView.this.qD);
                            NativeExpressView.this.Pj = com.bytedance.sdk.openadsdk.core.ugen.vG.pvs();
                            return pvs;
                        }
                        JSONObject pvs2 = com.bytedance.sdk.openadsdk.core.nativeexpress.pvs.icD.pvs(NativeExpressView.this.gA, NativeExpressView.this.jlb, NativeExpressView.this.IP, NativeExpressView.this.qh);
                        NativeExpressView.this.pvs(pvs2);
                        return pvs2;
                    }
                });
                gSd = this.qh.gSd();
                if (gSd != null) {
                    pvsVar.NB(gSd.Ju());
                }
                pvs(pvsVar);
                this.qd = pvsVar.pvs();
            }
        }
        z = false;
        long min2 = Math.min(Math.max(j, 0L), WorkRequest.MIN_BACKOFF_MILLIS);
        int renderTimeout2 = getRenderTimeout();
        if (this.qh.od() == null) {
        }
        int i2 = this.ny;
        this.ZhG = i2 == -1 && i2 < ((int) sUS);
        if (!com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(this.qh)) {
        }
        pvsVar.pvs(this.Mxy).icD(this.qh.neB()).vG(this.qh.Sn()).Jd(this.qh.HWd()).pvs(this.thO).Jd(this.qh.Lxj()).pvs(renderTimeout2).icD(this.qh.yhq()).vG(this.gSd).icD(this.qh.Gp()).pvs(min2).vG(this.qh.jhZ()).pvs(com.bytedance.sdk.openadsdk.core.nativeexpress.pvs.icD.pvs(this.qh)).Jd(z).NB(this.ny).pvs(this.ZhG).pvs(sUS).sUS(com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().FFl()).pvs(new com.bytedance.sdk.component.adexpress.icD.NB() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.5
            @Override // com.bytedance.sdk.component.adexpress.icD.NB
            public JSONObject pvs() {
                if (NativeExpressView.this.qh == null) {
                    NativeExpressView.this.Pj = "material is null";
                    return null;
                }
                if (com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(NativeExpressView.this.qh)) {
                    NativeExpressView.this.qD = new bNS();
                    JSONObject pvs = com.bytedance.sdk.openadsdk.core.ugen.vG.pvs(NativeExpressView.this.qh, NativeExpressView.this.qD);
                    NativeExpressView.this.Pj = com.bytedance.sdk.openadsdk.core.ugen.vG.pvs();
                    return pvs;
                }
                JSONObject pvs2 = com.bytedance.sdk.openadsdk.core.nativeexpress.pvs.icD.pvs(NativeExpressView.this.gA, NativeExpressView.this.jlb, NativeExpressView.this.IP, NativeExpressView.this.qh);
                NativeExpressView.this.pvs(pvs2);
                return pvs2;
            }
        });
        gSd = this.qh.gSd();
        if (gSd != null) {
        }
        pvs(pvsVar);
        this.qd = pvsVar.pvs();
    }

    public String getUgenTemplateErrorReason() {
        return this.Pj;
    }

    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.mnm.Jd().Gp();
    }

    private void vA() {
        if (this.qh.VLm() == 1 && this.qh.SJ()) {
            com.bytedance.sdk.component.adexpress.icD.sUS sus = new com.bytedance.sdk.component.adexpress.icD.sUS(this.so, this.qd, new IP(this, this.ea, this.qd));
            this.OyE = sus;
            this.BSi.add(sus);
            this.CjQ = new com.bytedance.sdk.component.adexpress.icD.kj(this.BSi, this.thO);
            return;
        }
        if (dyT()) {
            cR();
            return;
        }
        try {
            zM();
            this.ZsW = new vA(this.so, this.qd, this.ea, this.dx, this.qh);
            com.bytedance.sdk.component.adexpress.icD.mnm mnmVar = new com.bytedance.sdk.component.adexpress.icD.mnm(this.so, this.qd, this.ZsW, this);
            this.cnN = mnmVar;
            this.BSi.add(mnmVar);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        com.bytedance.sdk.component.adexpress.icD.sUS sus2 = new com.bytedance.sdk.component.adexpress.icD.sUS(this.so, this.qd, new IP(this, this.ea, this.qd));
        this.OyE = sus2;
        this.BSi.add(sus2);
        this.CjQ = new com.bytedance.sdk.component.adexpress.icD.kj(this.BSi, this.thO);
    }

    private void cR() {
        this.icD = this.qh.dyT();
        try {
            zM();
            uc();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        boolean z = this.qh.dX() == 1;
        this.pvs = z;
        if (z) {
            com.bytedance.sdk.component.adexpress.icD.sUS sus = new com.bytedance.sdk.component.adexpress.icD.sUS(this.so, this.qd, new IP(this, this.ea, this.qd));
            this.OyE = sus;
            this.BSi.add(sus);
        }
        new StringBuilder("initRender: mRenderSequenceType is ").append(this.icD).append(", mInterceptors is ").append(this.BSi);
        this.CjQ = new com.bytedance.sdk.component.adexpress.icD.kj(this.BSi, this.thO);
    }

    private void zM() {
        if (com.bytedance.sdk.openadsdk.core.Ju.NB()) {
            return;
        }
        Wyp.pvs();
    }

    private void uc() {
        com.bytedance.sdk.openadsdk.core.vG.pvs.pvs pvsVar = new com.bytedance.sdk.openadsdk.core.vG.pvs.pvs();
        int i = this.icD;
        if (i == 3) {
            com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw yiwVar = new com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw();
            com.bytedance.sdk.component.adexpress.icD.icD icd = new com.bytedance.sdk.component.adexpress.icD.icD(this.so.getApplicationContext(), this.qd, this.ea, this.OT, yiwVar, this, pvsVar, new Jd(this.so, this.ea, this.OT, yiwVar, this.qd, pvsVar));
            this.CvL = icd;
            this.BSi.add(icd);
            return;
        }
        if (i == 7) {
            com.bytedance.sdk.openadsdk.core.ugen.component.Jd jd = new com.bytedance.sdk.openadsdk.core.ugen.component.Jd(this.so, new com.bytedance.sdk.openadsdk.core.ugen.vG.vG(this.so, this.qh, this.OT, (com.bytedance.sdk.openadsdk.core.ugen.vG.pvs) this.qd, this), this, this.qd);
            this.joF = jd;
            this.BSi.add(jd);
            return;
        }
        this.ZsW = new vA(this.so, this.qd, this.ea, this.dx, this.qh);
        com.bytedance.sdk.component.adexpress.icD.mnm mnmVar = new com.bytedance.sdk.component.adexpress.icD.mnm(this.so, this.qd, this.ZsW, this);
        this.cnN = mnmVar;
        this.BSi.add(mnmVar);
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd != null && (jd instanceof IP) && (backupView = (BackupView) jd.NB()) != null) {
            backupView.setDislikeOuter(tTDislikeDialogAbstract);
        }
        icD icd = this.OhP;
        if (icd != null) {
            icd.pvs(tTDislikeDialogAbstract);
        }
        this.Jd = tTDislikeDialogAbstract;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.dislike.icD icd) {
        BackupView backupView;
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd != null && (jd instanceof IP) && (backupView = (BackupView) jd.NB()) != null) {
            backupView.setDislikeInner(icd);
        }
        icD icd2 = this.OhP;
        if (icd2 != null) {
            icd2.pvs(icd);
        }
        this.vG = icd;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.NB = pAGExpressAdWrapperListener;
        icD icd = this.OhP;
        if (icd != null) {
            icd.pvs(pAGExpressAdWrapperListener);
        }
    }

    public void setClickCreativeListener(sUS sus) {
        this.sUS = sus;
        if (sus != null) {
            sus.pvs((pvs.InterfaceC0074pvs) this);
        }
    }

    public sUS getClickCreativeListener() {
        return this.sUS;
    }

    public yiw getClickListener() {
        return this.yiw;
    }

    public void setClickListener(yiw yiwVar) {
        this.yiw = yiwVar;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.icD.vG vGVar) {
        this.bNS = vGVar;
        com.bytedance.sdk.component.adexpress.icD.sUS sus = this.OyE;
        if (sus != null) {
            sus.pvs(vGVar);
        }
    }

    public void so() {
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd instanceof vA) {
            if (jd == null) {
                return;
            } else {
                ((vA) jd).so();
            }
        }
        cR cRVar = this.qh;
        if (cRVar == null || cRVar.ig() == null || this.qh.ig().pvs() == null) {
            return;
        }
        this.qh.ig().pvs().pvs(0L);
    }

    public void NB(int i) {
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd == null || !(jd instanceof vA)) {
            return;
        }
        ((vA) jd).icD(i);
        this.rW = i;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        pvs(i, true);
    }

    public void pvs(int i, boolean z) {
        this.vA = z;
        removeCallbacks(this.sq);
        removeCallbacks(this.yWX);
        if (i == 0) {
            postDelayed(this.yWX, 50L);
        } else {
            postDelayed(this.sq, 50L);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z ? getVisibility() : 8);
        }
        rCZ();
        if (z) {
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.qh, 4);
        } else {
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.qh, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rCZ() {
        if (this.od.get()) {
            this.dyT.pvs(System.currentTimeMillis(), Gp.pvs(this));
        }
    }

    public void Mxy() {
        if (this.qh == null) {
            return;
        }
        this.dX = SystemClock.elapsedRealtime();
        if (this.qh.Mnp()) {
            icD icd = this.OhP;
            if (icd == null) {
                a_(106);
                return;
            } else {
                icd.pvs((com.bytedance.sdk.component.adexpress.icD.bNS) this);
                this.OhP.pvs();
                return;
            }
        }
        this.dx.pvs();
        Wyp.pvs pvsVar = this.CjQ;
        if (pvsVar != null) {
            pvsVar.pvs(this);
        }
        try {
            this.CjQ.pvs();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        SparseArray<vG.pvs> sparseArray;
        sUS sus = this.sUS;
        int i2 = 0;
        if (sus != null) {
            sus.icD(motionEvent.getDeviceId());
            this.sUS.pvs(motionEvent.getSource());
            this.sUS.vG(motionEvent.getToolType(0));
        }
        yiw yiwVar = this.yiw;
        if (yiwVar != null) {
            yiwVar.icD(motionEvent.getDeviceId());
            this.yiw.pvs(motionEvent.getSource());
            this.yiw.vG(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            i2 = 3;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.Ca += Math.abs(motionEvent.getX() - this.neB);
                    this.Zm += Math.abs(motionEvent.getY() - this.cGU);
                    this.neB = motionEvent.getX();
                    this.cGU = motionEvent.getY();
                    i = (System.currentTimeMillis() - this.HWd <= 200 || (this.Ca <= 8.0f && this.Zm <= 8.0f)) ? 2 : 1;
                    sparseArray = this.Cwg;
                    if (sparseArray != null) {
                        sparseArray.put(motionEvent.getActionMasked(), new vG.pvs(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                i2 = actionMasked != 3 ? -1 : 4;
            }
        } else {
            this.neB = motionEvent.getRawX();
            this.cGU = motionEvent.getRawY();
            this.HWd = System.currentTimeMillis();
        }
        i = i2;
        sparseArray = this.Cwg;
        if (sparseArray != null) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void pvs(View view, int i, com.bytedance.sdk.component.adexpress.vG vGVar) {
        View view2;
        zM.pvs("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || vGVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (rCZ.qh(this.qh)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.IP ip = (com.bytedance.sdk.openadsdk.core.model.IP) vGVar;
        sUS sus = this.sUS;
        if (sus != null) {
            sus.Jd(getDynamicShowType());
            this.sUS.pvs(hashMap);
        }
        yiw yiwVar = this.yiw;
        if (yiwVar != null) {
            yiwVar.Jd(getDynamicShowType());
            this.yiw.pvs(hashMap);
        }
        float f = ip.pvs;
        float f2 = ip.icD;
        float f3 = ip.vG;
        float f4 = ip.Jd;
        boolean z = ip.bNS;
        SparseArray<vG.pvs> sparseArray = ip.IP;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.Cwg;
        }
        SparseArray<vG.pvs> sparseArray2 = sparseArray;
        String str = ip.qh;
        if (view == null) {
            view2 = this;
        } else {
            r7 = view != this ? pvs(view) : null;
            view2 = view;
        }
        if (ip != null) {
            ip.kj = i;
            if (r7 != null && ip.Ju == null) {
                ip.Ju = r7;
            }
        }
        switch (i) {
            case 1:
                FrameLayout frameLayout = this.kj;
                if (frameLayout != null) {
                    frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                cR cRVar = this.qh;
                if (cRVar == null || cRVar.cR() != 1 || z) {
                    yiw yiwVar2 = this.yiw;
                    if (yiwVar2 != null) {
                        yiwVar2.pvs(ip);
                        this.yiw.pvs(str);
                        this.yiw.pvs(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.NB;
                    if (pAGExpressAdWrapperListener != null) {
                        pAGExpressAdWrapperListener.onAdClicked();
                        break;
                    }
                }
                break;
            case 2:
                if (ip.mnm > 0) {
                    ae.pvs(true);
                }
                sUS sus2 = this.sUS;
                if (sus2 != null) {
                    sus2.pvs(ip);
                    this.sUS.pvs(str);
                    this.sUS.pvs(view2, f, f2, f3, f4, sparseArray2, z);
                }
                PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.NB;
                if (pAGExpressAdWrapperListener2 != null) {
                    pAGExpressAdWrapperListener2.onAdClicked();
                }
                ae.pvs(false);
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.qh, 9);
                break;
            case 3:
                TTDislikeDialogAbstract tTDislikeDialogAbstract = this.Jd;
                if (tTDislikeDialogAbstract != null) {
                    tTDislikeDialogAbstract.show();
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.dislike.icD icd = this.vG;
                    if (icd != null) {
                        icd.pvs();
                        break;
                    } else {
                        TTDelegateActivity.pvs(this.qh, this.cRf);
                        break;
                    }
                }
            case 4:
                FrameLayout frameLayout2 = this.kj;
                if (frameLayout2 != null) {
                    frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                }
                cR cRVar2 = this.qh;
                if (cRVar2 == null || cRVar2.cR() != 1 || z) {
                    jlb.icD(this.qh);
                    if ("embeded_ad".equals(this.Mxy) && OT() && !this.Ju && jlb.icD(this.qh)) {
                        sUS sus3 = this.sUS;
                        if (sus3 != null) {
                            sus3.pvs(ip);
                            this.sUS.pvs(str);
                            this.sUS.pvs(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    } else {
                        yiw yiwVar3 = this.yiw;
                        if (yiwVar3 != null) {
                            yiwVar3.pvs(ip);
                            this.yiw.pvs(str);
                            this.yiw.pvs(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.NB;
                    if (pAGExpressAdWrapperListener3 != null) {
                        pAGExpressAdWrapperListener3.onAdClicked();
                        break;
                    }
                }
                break;
            case 5:
                pvs(!this.OT);
                break;
            case 6:
                pvs();
                break;
            case 7:
                TTWebsiteActivity.pvs(this.so, this.qh, this.Mxy);
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs.InterfaceC0074pvs
    public long getVideoProgress() {
        VastBannerBackupView vastBannerBackupView = this.Ye;
        if (vastBannerBackupView != null) {
            return vastBannerBackupView.getVideoProgress();
        }
        return 0L;
    }

    public static JSONObject pvs(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean OT() {
        return cR.NB(this.qh);
    }

    private int getAdSlotType() {
        String str = this.Mxy;
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        rCZ();
        ny();
        com.bytedance.sdk.component.utils.Ju.pvs("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.jhZ);
        com.bytedance.sdk.openadsdk.core.so.icD().pvs(this.cRf, this.sP);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        rCZ();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.Ju.pvs("webviewpool", "onFinishTemporaryDetach+++");
    }

    private void ny() {
        List<com.bytedance.sdk.component.adexpress.icD.Wyp> list = this.BSi;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.icD.Wyp> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void ZhG() {
        List<com.bytedance.sdk.component.adexpress.icD.Wyp> list = this.BSi;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.icD.Wyp> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void Wyp() {
        vA vAVar = this.ZsW;
        if (vAVar == null || vAVar.NB() == null) {
            return;
        }
        this.ZsW.sUS();
    }

    public void qh() {
        try {
            icD icd = this.OhP;
            if (icd != null) {
                icd.icD();
            }
            IP();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.icD.Wyp> list = this.BSi;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.icD.Wyp> it = list.iterator();
                while (it.hasNext()) {
                    it.next().pvs();
                }
            }
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this.qh);
            this.vG = null;
            this.Jd = null;
            this.Wyp = null;
            this.qh = null;
            this.NB = null;
            this.sUS = null;
            this.bNS = null;
            this.yiw = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("NativeExpressView", "detach error", th);
        }
    }

    public void kj() {
        try {
            FrameLayout frameLayout = this.kj;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.kj);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.jhZ);
        com.bytedance.sdk.openadsdk.core.so.icD().Jd(this.cRf);
        ZhG();
        com.bytedance.sdk.component.utils.Ju.pvs("webviewpool", "onDetachedFromWindow===");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.Ju.pvs("webviewpool", "onStartTemporaryDetach===");
    }

    public void pvs(com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd, com.bytedance.sdk.component.adexpress.icD.IP ip) {
        cR cRVar;
        this.od.set(true);
        this.Gp = jd;
        if (this.rW != getWindowVisibility()) {
            NB(getWindowVisibility());
        }
        Object[] objArr = new Object[2];
        Integer.valueOf(jd.vG());
        if (jd.vG() == 3 && (cRVar = this.qh) != null && cRVar.mnm() == 1) {
            this.qh.icD(0);
        }
        if (jd.vG() == 2 || jd.vG() == 0 || jd.vG() == 3 || jd.vG() == 7) {
            View NB = jd.NB();
            if (NB.getParent() != null) {
                ((ViewGroup) NB.getParent()).removeView(NB);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof SSWebView) {
                    removeView((View) arrayList.get(i2));
                }
            }
            addView(jd.NB());
        }
        cR cRVar2 = this.qh;
        if (cRVar2 != null) {
            com.bytedance.sdk.openadsdk.Wyp.vG.pvs(cRVar2.icD(), this.dX, this.Mxy, jd.vG());
        }
        com.bytedance.sdk.component.adexpress.icD.Mxy mxy = this.thO;
        if (mxy != null) {
            ((qh) mxy).qh();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.NB;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) ip.Jd(), (float) ip.NB());
        }
        if (pvs(ip)) {
            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(this, this.qh, vG(getDynamicShowType()));
        }
        bNS bns = this.qD;
        if (bns != null) {
            bns.pvs(this.qh, this.Mxy);
        }
    }

    protected NB.pvs vG(int i) {
        return new NB.pvs(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.bNS
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.icD.Mxy mxy = this.thO;
        if (mxy != null) {
            if (!this.pvs) {
                mxy.so();
            }
            this.thO.Mxy();
            ((qh) this.thO).qh();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.NB;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.yiw.pvs(i), i);
        }
        bNS bns = this.qD;
        if (bns != null) {
            bns.pvs(this.qh, this.Mxy);
        }
    }

    public boolean Ju() {
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        return jd != null && jd.vG() == 1;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd != null) {
            return jd.vG();
        }
        return 0;
    }

    public JSONObject pvs(JSONObject jSONObject, cR cRVar) {
        if (!(this.Gp instanceof vA)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (cRVar != null && cRVar.gSd() != null && cRVar.gSd().Ju()) {
                jSONObject.put("engine_version", cRVar.gSd().kj());
            } else {
                jSONObject.put("engine_version", "v1");
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }

    public int getRenderEngineCacheType() {
        so bNS;
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (!(jd instanceof vA) || (bNS = ((vA) jd).bNS()) == null) {
            return 0;
        }
        return bNS.pvs();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.gA).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.jlb).intValue();
    }

    public CvL getJsObject() {
        vA vAVar = this.ZsW;
        if (vAVar != null) {
            return vAVar.mnm();
        }
        return null;
    }

    private boolean dyT() {
        return TextUtils.equals(this.Mxy, "fullscreen_interstitial_ad") || TextUtils.equals(this.Mxy, "rewarded_video") || TextUtils.equals("open_ad", this.Mxy) || vA.icD(this.Mxy) || TextUtils.equals(this.Mxy, "embeded_ad");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void pvs(CharSequence charSequence, int i, int i2, boolean z) {
        icD(Integer.parseInt(String.valueOf(charSequence)), i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Jd
    public void setSoundMute(boolean z) {
        this.OT = z;
        com.bytedance.sdk.component.adexpress.icD.icD icd = this.CvL;
        if (icd != null && icd.icD() != null) {
            this.CvL.icD().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if ((jd instanceof com.bytedance.sdk.openadsdk.core.ugen.vG.vG) && jd.vG() == 7) {
            ((com.bytedance.sdk.openadsdk.core.ugen.vG.vG) this.Gp).setSoundMute(z);
        }
    }

    protected void icD(int i, int i2) {
        int i3;
        if (TextUtils.equals(this.Mxy, "banner_ad")) {
            return;
        }
        int i4 = this.ny;
        int i5 = ((i2 < i4 || i4 < 0 || !(this.ZhG || TextUtils.equals(this.Mxy, "open_ad"))) && Jd() != 5) ? 0 : 1;
        if (i2 <= this.ny) {
            cR cRVar = this.qh;
            if (cRVar != null && cRVar.od() != null) {
                i3 = (int) (Math.min(this.ny, this.qh.od().sUS() * this.qh.od().OT()) - i2);
            } else {
                i3 = this.ny - i2;
            }
        } else {
            i3 = 0;
        }
        com.bytedance.sdk.component.adexpress.icD.icD icd = this.CvL;
        if (icd != null && icd.icD() != null) {
            this.CvL.icD().pvs(String.valueOf(i), i5, i3, false);
        }
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd instanceof com.bytedance.sdk.openadsdk.core.ugen.vG.vG) {
            ((com.bytedance.sdk.openadsdk.core.ugen.vG.vG) jd).pvs((CharSequence) String.valueOf(i), i5, i3, false);
        }
    }

    public void IP() {
        cR cRVar = this.qh;
        if (cRVar == null || cRVar.ig() == null || this.qh.ig().pvs() == null) {
            return;
        }
        this.qh.ig().pvs().NB(getVideoProgress());
    }

    public void setVastVideoHelper(VastBannerBackupView vastBannerBackupView) {
        this.Ye = vastBannerBackupView;
    }

    public boolean bNS() {
        return this.od.get();
    }

    public void icD(int i, String str) {
        CvL mnm;
        com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd = this.Gp;
        if (jd == null || !(jd instanceof vA) || (mnm = ((vA) jd).mnm()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            mnm.pvs("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
