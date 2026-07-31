package com.bytedance.sdk.openadsdk.core.iv;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.fs.iv;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.fb.nps;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.hgd;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.mw.hhw.zmn;
import com.bytedance.sdk.openadsdk.core.nu;
import com.bytedance.sdk.openadsdk.core.zn.zmn;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.moloco.sdk.internal.services.init.i;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class phc extends com.bytedance.sdk.openadsdk.core.hhw.zn implements com.bytedance.sdk.component.adexpress.dynamic.fb, com.bytedance.sdk.component.adexpress.fs.cn, com.bytedance.sdk.component.adexpress.fs.zg, cyb, zmn.InterfaceC0185zmn {
    public com.bytedance.sdk.component.adexpress.fs.fb<? extends View> am;
    boolean bjh;
    private PAGExpressAdWrapperListener btk;
    protected final Context bvs;
    private com.bytedance.sdk.component.adexpress.fs.cyb bxw;
    private com.bytedance.sdk.component.adexpress.fs.mw cd;
    protected boolean cn;
    private final Runnable cud;
    protected com.bytedance.sdk.component.adexpress.fs.zn cyb;
    private final ViewTreeObserver.OnScrollChangedListener dgt;
    protected ViewGroup doe;
    private float ev;
    private TTDislikeDialogAbstract fb;
    private com.bytedance.sdk.openadsdk.core.mw.zn.fs fkt;
    private int fs;
    private final Runnable gn;
    private boolean hgd;
    private bvs hhw;
    private float hwg;

    /* renamed from: io, reason: collision with root package name */
    private final SparseArray<zn.zmn> f3741io;
    protected String iqz;
    protected String iv;
    private nqi jy;
    boolean kgc;
    long kjb;
    protected com.bytedance.sdk.openadsdk.core.model.nqi klz;
    private kjb kra;
    protected int kw;
    private float lbc;
    private int lt;
    private List<com.bytedance.sdk.component.adexpress.fs.iv> mhu;
    public FrameLayout mw;
    private iv.zmn na;
    private long nkt;
    private iv nps;
    public boolean nqi;
    private String nu;
    private com.bytedance.sdk.openadsdk.core.fb.bvs oep;
    protected com.bytedance.sdk.openadsdk.fb.fb.btk olo;
    private boolean oub;
    protected HashSet<String> phc;
    protected AdSlot rc;
    private float rje;
    public com.bytedance.sdk.openadsdk.fb.nps rp;
    protected boolean rt;
    private float so;
    private com.bytedance.sdk.component.adexpress.fs.hhw tet;
    private String tf;
    private final Runnable uqd;
    int uqh;
    private com.bytedance.sdk.component.adexpress.fs.bvs ve;
    private final AtomicBoolean vlj;
    private nps.zmn ww;
    private com.bytedance.sdk.openadsdk.core.mw.hhw.fb xrr;
    protected Activity yj;
    private com.bytedance.sdk.openadsdk.core.mw.fs.nps yo;
    private zn yof;
    protected com.bytedance.sdk.component.adexpress.fs.fs zak;
    private String zg;
    private float zi;
    private boolean zmn;
    private com.bytedance.sdk.openadsdk.zn.zn zn;

    public int btk() {
        return 0;
    }

    protected boolean bvs() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/iv/phc;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.u, this, motionEvent);
        return safedk_phc_dispatchTouchEvent_1b3134c375517e00a7fb6562789fa19e(motionEvent);
    }

    public long fb() {
        return 0L;
    }

    public void fs() {
    }

    public void fs(int i) {
    }

    protected boolean fs(com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        return true;
    }

    public boolean fs(JSONObject jSONObject) {
        return false;
    }

    public void hhw() {
    }

    protected boolean iqz() {
        return true;
    }

    protected boolean iv() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTimeUpdate(int i) {
    }

    public void zmn() {
    }

    public void zmn(int i) {
    }

    public void zmn(int i, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
    }

    public void zmn(int i, String str) {
    }

    protected void zmn(mw.zmn zmnVar) {
    }

    public void zmn(String str, JSONObject jSONObject) {
    }

    public void zmn(boolean z, String str) {
    }

    public boolean zmn(JSONObject jSONObject) {
        return false;
    }

    public long zn() {
        return 0L;
    }

    protected void zn(JSONObject jSONObject) {
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.btk btkVar) {
        if (this.kra != null && getJsObject() != null) {
            getJsObject().zmn(btkVar);
        }
        com.bytedance.sdk.openadsdk.core.mw.hhw.fb fbVar = this.xrr;
        if (fbVar != null) {
            fbVar.zmn(btkVar);
        }
    }

    public com.bytedance.sdk.openadsdk.fb.nps getAdShowTime() {
        return this.rp;
    }

    public void setClosedListenerKey(String str) {
        this.nu = str;
        zn znVar = this.yof;
        if (znVar != null) {
            znVar.zmn(str);
        }
    }

    public zn getBrandBannerController() {
        return this.yof;
    }

    public String getClosedListenerKey() {
        return this.nu;
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.btk;
    }

    public void setBannerClickClosedListener(nps.zmn zmnVar) {
        this.ww = zmnVar;
    }

    public phc(Activity activity, @NonNull Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, String str) {
        super(context);
        this.zmn = true;
        this.fs = 0;
        this.iv = "embeded_ad";
        this.zg = null;
        this.cn = false;
        this.kgc = true;
        this.kw = -1;
        this.tf = "";
        this.nqi = false;
        this.oub = true;
        this.uqh = -1;
        this.rp = new com.bytedance.sdk.openadsdk.fb.nps();
        this.kjb = 0L;
        this.vlj = new AtomicBoolean(false);
        this.dgt = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                phc phcVar = phc.this;
                if (phcVar.kgc && phcVar.iv()) {
                    phc.this.am();
                    phc phcVar2 = phc.this;
                    phcVar2.removeCallbacks(phcVar2.cud);
                    phc phcVar3 = phc.this;
                    phcVar3.postDelayed(phcVar3.cud, 500L);
                }
            }
        };
        this.cud = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.2
            @Override // java.lang.Runnable
            public void run() {
                if (hgd.zmn(phc.this, 0, 5, false)) {
                    phc phcVar = phc.this;
                    phcVar.hhw(phcVar.getVisibility());
                } else {
                    phc.this.hhw(8);
                }
            }
        };
        this.gn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.3
            @Override // java.lang.Runnable
            public void run() {
                phc.this.hhw(0);
            }
        };
        this.uqd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.4
            @Override // java.lang.Runnable
            public void run() {
                phc.this.hhw(8);
            }
        };
        this.lt = 8;
        this.f3741io = new SparseArray<>();
        this.lbc = -1.0f;
        this.hwg = -1.0f;
        this.rje = -1.0f;
        this.zi = -1.0f;
        this.nkt = 0L;
        this.yj = activity;
        this.iv = str;
        this.bvs = context;
        this.klz = nqiVar;
        this.rc = adSlot;
        this.nqi = false;
        nps();
    }

    public phc(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, String str) {
        super(context);
        this.zmn = true;
        this.fs = 0;
        this.iv = "embeded_ad";
        this.zg = null;
        this.cn = false;
        this.kgc = true;
        this.kw = -1;
        this.tf = "";
        this.nqi = false;
        this.oub = true;
        this.uqh = -1;
        this.rp = new com.bytedance.sdk.openadsdk.fb.nps();
        this.kjb = 0L;
        this.vlj = new AtomicBoolean(false);
        this.dgt = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                phc phcVar = phc.this;
                if (phcVar.kgc && phcVar.iv()) {
                    phc.this.am();
                    phc phcVar2 = phc.this;
                    phcVar2.removeCallbacks(phcVar2.cud);
                    phc phcVar3 = phc.this;
                    phcVar3.postDelayed(phcVar3.cud, 500L);
                }
            }
        };
        this.cud = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.2
            @Override // java.lang.Runnable
            public void run() {
                if (hgd.zmn(phc.this, 0, 5, false)) {
                    phc phcVar = phc.this;
                    phcVar.hhw(phcVar.getVisibility());
                } else {
                    phc.this.hhw(8);
                }
            }
        };
        this.gn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.3
            @Override // java.lang.Runnable
            public void run() {
                phc.this.hhw(0);
            }
        };
        this.uqd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.4
            @Override // java.lang.Runnable
            public void run() {
                phc.this.hhw(8);
            }
        };
        this.lt = 8;
        this.f3741io = new SparseArray<>();
        this.lbc = -1.0f;
        this.hwg = -1.0f;
        this.rje = -1.0f;
        this.zi = -1.0f;
        this.nkt = 0L;
        this.iv = str;
        this.bvs = context;
        this.klz = nqiVar;
        this.rc = adSlot;
        this.nqi = false;
        nps();
    }

    public phc(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        super(context);
        this.zmn = true;
        this.fs = 0;
        this.iv = "embeded_ad";
        this.zg = null;
        this.cn = false;
        this.kgc = true;
        this.kw = -1;
        this.tf = "";
        this.nqi = false;
        this.oub = true;
        this.uqh = -1;
        this.rp = new com.bytedance.sdk.openadsdk.fb.nps();
        this.kjb = 0L;
        this.vlj = new AtomicBoolean(false);
        this.dgt = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                phc phcVar = phc.this;
                if (phcVar.kgc && phcVar.iv()) {
                    phc.this.am();
                    phc phcVar2 = phc.this;
                    phcVar2.removeCallbacks(phcVar2.cud);
                    phc phcVar3 = phc.this;
                    phcVar3.postDelayed(phcVar3.cud, 500L);
                }
            }
        };
        this.cud = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.2
            @Override // java.lang.Runnable
            public void run() {
                if (hgd.zmn(phc.this, 0, 5, false)) {
                    phc phcVar = phc.this;
                    phcVar.hhw(phcVar.getVisibility());
                } else {
                    phc.this.hhw(8);
                }
            }
        };
        this.gn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.3
            @Override // java.lang.Runnable
            public void run() {
                phc.this.hhw(0);
            }
        };
        this.uqd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.4
            @Override // java.lang.Runnable
            public void run() {
                phc.this.hhw(8);
            }
        };
        this.lt = 8;
        this.f3741io = new SparseArray<>();
        this.lbc = -1.0f;
        this.hwg = -1.0f;
        this.rje = -1.0f;
        this.zi = -1.0f;
        this.nkt = 0L;
        this.iv = str;
        this.bvs = context;
        this.klz = nqiVar;
        this.rc = adSlot;
        this.nqi = z;
        this.oub = z2;
        nps();
    }

    protected void nps() {
        this.phc = new HashSet<>();
        AdSlot adSlot = this.rc;
        if (adSlot != null) {
            this.so = adSlot.getExpressViewAcceptedWidth();
            this.ev = this.rc.getExpressViewAcceptedHeight();
            rt();
            this.zg = this.rc.getCodeId();
            if (TextUtils.equals(this.iv, "fullscreen_interstitial_ad")) {
                this.uqh = this.klz.ab();
            } else if (TextUtils.equals(this.iv, "rewarded_video")) {
                this.uqh = this.klz.nkw();
            } else if (TextUtils.equals(this.iv, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
                if (nqiVar != null && nqiVar.fs() >= 0) {
                    this.uqh = this.klz.fs();
                } else {
                    this.uqh = com.bytedance.sdk.openadsdk.core.kgc.fb().nqi(this.zg);
                }
                if (this.uqh < 0) {
                    this.uqh = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.klz.xup()) {
            this.yof = new zn(this.bvs, this, this.klz, this.iv);
            return;
        }
        cn();
        this.mhu = new ArrayList();
        cyb();
        com.bytedance.sdk.component.adexpress.fs.cyb cybVar = this.bxw;
        if (cybVar != null) {
            this.kra = (kjb) cybVar.fs();
        }
        fkt jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.hhw(this.iv);
        }
    }

    public void setActivity(Activity activity) {
        this.yj = activity;
    }

    private void rt() {
        nqi.zmn ouf = this.klz.ouf();
        if (!TextUtils.equals(this.iv, "embeded_ad") || ouf == null) {
            return;
        }
        String iv = ouf.iv();
        if (TextUtils.isEmpty(iv)) {
            return;
        }
        try {
            JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit(iv);
            int optInt = jsonObjectInit.optInt("width");
            int optInt2 = jsonObjectInit.optInt("height");
            if (optInt == 0 || optInt2 == 0) {
                return;
            }
            this.ev = optInt2;
            this.so = optInt;
        } catch (Exception unused) {
        }
    }

    public com.bytedance.sdk.component.bvs.nps getWebView() {
        kjb kjbVar = this.kra;
        if (kjbVar == null) {
            return null;
        }
        return kjbVar.fb();
    }

    protected void zg() {
        this.olo = new com.bytedance.sdk.openadsdk.fb.kw(1, this.iv, this.klz);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(2:2|3)|(2:5|(22:7|8|9|10|(2:12|(13:14|15|16|(2:22|23)|49|25|(1:27)(1:47)|28|(1:46)|32|(3:42|(1:44)|45)(1:38)|39|40))|52|15|16|(4:18|20|22|23)|49|25|(0)(0)|28|(1:30)|46|32|(1:34)|42|(0)|45|39|40))|55|8|9|10|(0)|52|15|16|(0)|49|25|(0)(0)|28|(0)|46|32|(0)|42|(0)|45|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r12.klz.sft() != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[Catch: Exception -> 0x007d, TRY_LEAVE, TryCatch #1 {Exception -> 0x007d, blocks: (B:10:0x003d, B:12:0x0045), top: B:9:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:16:0x0054, B:18:0x0060, B:20:0x0069, B:22:0x0072), top: B:15:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void cn() {
        long j;
        boolean z;
        mw.zmn zmnVar;
        nqi.zmn ouf;
        zg();
        this.ve = new rt(this.olo, this.iv, this.klz, this.zg, this.hgd);
        final boolean sxr = this.klz.sxr();
        try {
            ouf = this.klz.ouf();
        } catch (Exception unused) {
        }
        if (ouf != null) {
            String bvs = ouf.bvs();
            if (!TextUtils.isEmpty(bvs)) {
                j = PangleNetworkBridge.jsonObjectInit(bvs).optLong("render_delay_time");
                if (!com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.klz)) {
                    if (com.bytedance.sdk.openadsdk.core.kgc.fb().rt(this.zg) == 1) {
                        z = true;
                        if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().cn(this.zg) && this.klz.cd() != 5 && this.klz.cd() != 6) {
                        }
                        z = true;
                        long min = Math.min(Math.max(j, 0L), 10000L);
                        int renderTimeout = getRenderTimeout();
                        double hhw = this.klz.mrt() != null ? this.klz.mrt().hhw() * this.klz.mrt().doe() : 0.0d;
                        int i = this.uqh;
                        this.bjh = i == -1 && i < ((int) hhw);
                        if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz) || com.bytedance.sdk.openadsdk.core.mw.btk.fs(this.klz) || com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw.zmn(this.iv)) {
                            zmn.C0171zmn c0171zmn = new zmn.C0171zmn();
                            if (com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz)) {
                                c0171zmn.zmn(com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz, this.iv));
                            }
                            c0171zmn.zmn((com.bytedance.adsdk.ugeno.core.kgc) this.ve);
                            c0171zmn.zmn(this.so);
                            c0171zmn.fs(this.ev);
                            c0171zmn.nps(this.hgd);
                            zmnVar = c0171zmn;
                        } else {
                            zmnVar = new mw.zmn();
                        }
                        zmnVar.btk(sxr);
                        zmnVar.zmn(this.iv).fs(this.klz.ji()).zn(this.klz.gor()).fb(this.klz.ze()).zmn(this.ve).fb(this.klz.xn()).zmn(renderTimeout).fs(this.klz.bn()).zn(this.oub).fs(this.klz.nlz()).zmn(min).zn(this.klz.va()).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.fs(this.klz)).fb(z).btk(this.uqh).zmn(this.bjh).zmn(hhw).hhw(com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw()).hhw(com.bytedance.sdk.openadsdk.uqh.btk.zmn("inject_data_reuse_open", 0)).nps(this.klz.ew().zmn()).zg(this.klz.ew().fs()).zmn(new com.bytedance.sdk.component.adexpress.fs.btk() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.5
                            @Override // com.bytedance.sdk.component.adexpress.fs.btk
                            public JSONObject zmn() {
                                try {
                                    phc phcVar = phc.this;
                                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = phcVar.klz;
                                    if (nqiVar == null) {
                                        phcVar.tf = "material is null";
                                        return null;
                                    }
                                    if (sxr) {
                                        phcVar.jy = new nqi();
                                        float f = phc.this.so;
                                        float f2 = phc.this.ev;
                                        phc phcVar2 = phc.this;
                                        JSONObject zmn = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f, f2, phcVar2.cn, phcVar2.klz, phcVar2.iv, phcVar2.jy);
                                        phc.this.tf = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn();
                                        return zmn;
                                    }
                                    if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(nqiVar)) {
                                        float f3 = phc.this.so;
                                        float f4 = phc.this.ev;
                                        phc phcVar3 = phc.this;
                                        JSONObject zmn2 = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f3, f4, phcVar3.cn, phcVar3.klz);
                                        phc.this.zn(zmn2);
                                        return zmn2;
                                    }
                                    phc.this.jy = new nqi();
                                    phc phcVar4 = phc.this;
                                    JSONObject zmn3 = com.bytedance.sdk.openadsdk.core.mw.btk.zmn(phcVar4.klz, phcVar4.jy);
                                    phc.this.tf = com.bytedance.sdk.openadsdk.core.mw.btk.zmn();
                                    return zmn3;
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                        zmn(zmnVar);
                        this.cd = zmnVar.zmn();
                    }
                }
                z = false;
                if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().cn(this.zg)) {
                }
                z = true;
                long min2 = Math.min(Math.max(j, 0L), 10000L);
                int renderTimeout2 = getRenderTimeout();
                if (this.klz.mrt() != null) {
                }
                int i2 = this.uqh;
                this.bjh = i2 == -1 && i2 < ((int) hhw);
                if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz)) {
                }
                zmn.C0171zmn c0171zmn2 = new zmn.C0171zmn();
                if (com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz)) {
                }
                c0171zmn2.zmn((com.bytedance.adsdk.ugeno.core.kgc) this.ve);
                c0171zmn2.zmn(this.so);
                c0171zmn2.fs(this.ev);
                c0171zmn2.nps(this.hgd);
                zmnVar = c0171zmn2;
                zmnVar.btk(sxr);
                zmnVar.zmn(this.iv).fs(this.klz.ji()).zn(this.klz.gor()).fb(this.klz.ze()).zmn(this.ve).fb(this.klz.xn()).zmn(renderTimeout2).fs(this.klz.bn()).zn(this.oub).fs(this.klz.nlz()).zmn(min2).zn(this.klz.va()).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.fs(this.klz)).fb(z).btk(this.uqh).zmn(this.bjh).zmn(hhw).hhw(com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw()).hhw(com.bytedance.sdk.openadsdk.uqh.btk.zmn("inject_data_reuse_open", 0)).nps(this.klz.ew().zmn()).zg(this.klz.ew().fs()).zmn(new com.bytedance.sdk.component.adexpress.fs.btk() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.5
                    @Override // com.bytedance.sdk.component.adexpress.fs.btk
                    public JSONObject zmn() {
                        try {
                            phc phcVar = phc.this;
                            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = phcVar.klz;
                            if (nqiVar == null) {
                                phcVar.tf = "material is null";
                                return null;
                            }
                            if (sxr) {
                                phcVar.jy = new nqi();
                                float f = phc.this.so;
                                float f2 = phc.this.ev;
                                phc phcVar2 = phc.this;
                                JSONObject zmn = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f, f2, phcVar2.cn, phcVar2.klz, phcVar2.iv, phcVar2.jy);
                                phc.this.tf = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn();
                                return zmn;
                            }
                            if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(nqiVar)) {
                                float f3 = phc.this.so;
                                float f4 = phc.this.ev;
                                phc phcVar3 = phc.this;
                                JSONObject zmn2 = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f3, f4, phcVar3.cn, phcVar3.klz);
                                phc.this.zn(zmn2);
                                return zmn2;
                            }
                            phc.this.jy = new nqi();
                            phc phcVar4 = phc.this;
                            JSONObject zmn3 = com.bytedance.sdk.openadsdk.core.mw.btk.zmn(phcVar4.klz, phcVar4.jy);
                            phc.this.tf = com.bytedance.sdk.openadsdk.core.mw.btk.zmn();
                            return zmn3;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
                zmn(zmnVar);
                this.cd = zmnVar.zmn();
            }
        }
        j = 0;
        if (!com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.klz)) {
        }
        z = false;
        if (com.bytedance.sdk.openadsdk.core.settings.rc.fs().cn(this.zg)) {
        }
        z = true;
        long min22 = Math.min(Math.max(j, 0L), 10000L);
        int renderTimeout22 = getRenderTimeout();
        if (this.klz.mrt() != null) {
        }
        int i22 = this.uqh;
        this.bjh = i22 == -1 && i22 < ((int) hhw);
        if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz)) {
        }
        zmn.C0171zmn c0171zmn22 = new zmn.C0171zmn();
        if (com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz)) {
        }
        c0171zmn22.zmn((com.bytedance.adsdk.ugeno.core.kgc) this.ve);
        c0171zmn22.zmn(this.so);
        c0171zmn22.fs(this.ev);
        c0171zmn22.nps(this.hgd);
        zmnVar = c0171zmn22;
        zmnVar.btk(sxr);
        zmnVar.zmn(this.iv).fs(this.klz.ji()).zn(this.klz.gor()).fb(this.klz.ze()).zmn(this.ve).fb(this.klz.xn()).zmn(renderTimeout22).fs(this.klz.bn()).zn(this.oub).fs(this.klz.nlz()).zmn(min22).zn(this.klz.va()).zmn(com.bytedance.sdk.openadsdk.core.iv.fs.zn.fs(this.klz)).fb(z).btk(this.uqh).zmn(this.bjh).zmn(hhw).hhw(com.bytedance.sdk.openadsdk.core.settings.rc.fs().kw()).hhw(com.bytedance.sdk.openadsdk.uqh.btk.zmn("inject_data_reuse_open", 0)).nps(this.klz.ew().zmn()).zg(this.klz.ew().fs()).zmn(new com.bytedance.sdk.component.adexpress.fs.btk() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.5
            @Override // com.bytedance.sdk.component.adexpress.fs.btk
            public JSONObject zmn() {
                try {
                    phc phcVar = phc.this;
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = phcVar.klz;
                    if (nqiVar == null) {
                        phcVar.tf = "material is null";
                        return null;
                    }
                    if (sxr) {
                        phcVar.jy = new nqi();
                        float f = phc.this.so;
                        float f2 = phc.this.ev;
                        phc phcVar2 = phc.this;
                        JSONObject zmn = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f, f2, phcVar2.cn, phcVar2.klz, phcVar2.iv, phcVar2.jy);
                        phc.this.tf = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn();
                        return zmn;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(nqiVar)) {
                        float f3 = phc.this.so;
                        float f4 = phc.this.ev;
                        phc phcVar3 = phc.this;
                        JSONObject zmn2 = com.bytedance.sdk.openadsdk.core.iv.fs.zn.zmn(f3, f4, phcVar3.cn, phcVar3.klz);
                        phc.this.zn(zmn2);
                        return zmn2;
                    }
                    phc.this.jy = new nqi();
                    phc phcVar4 = phc.this;
                    JSONObject zmn3 = com.bytedance.sdk.openadsdk.core.mw.btk.zmn(phcVar4.klz, phcVar4.jy);
                    phc.this.tf = com.bytedance.sdk.openadsdk.core.mw.btk.zmn();
                    return zmn3;
                } catch (Throwable unused2) {
                    return null;
                }
            }
        });
        zmn(zmnVar);
        this.cd = zmnVar.zmn();
    }

    public String getUgenTemplateErrorReason() {
        return this.tf;
    }

    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.kgc.fb().tf();
    }

    private void cyb() {
        if (this.klz.ldx() == 1 && this.klz.ch()) {
            kgc();
            this.na = new com.bytedance.sdk.component.adexpress.fs.klz(this.mhu, this.ve);
            return;
        }
        if (tf()) {
            olo();
            return;
        }
        try {
            kjb();
            kjb kjbVar = new kjb(this.bvs, this.cd, this.olo, this.klz);
            this.kra = kjbVar;
            com.bytedance.sdk.component.adexpress.fs.cyb cybVar = new com.bytedance.sdk.component.adexpress.fs.cyb(this.bvs, this.cd, kjbVar, this);
            this.bxw = cybVar;
            this.mhu.add(cybVar);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        kgc();
        this.na = new com.bytedance.sdk.component.adexpress.fs.klz(this.mhu, this.ve);
    }

    private void olo() {
        this.fs = this.klz.skn();
        try {
            kjb();
            zak();
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zmn("NativeExpressView", "NativeExpressView dynamicRender fail", e);
        }
        this.zmn = this.klz.ax() == 1;
        boolean zmn = com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.klz);
        if (this.zmn && !zmn) {
            kgc();
        }
        Objects.toString(this.mhu);
        this.na = new com.bytedance.sdk.component.adexpress.fs.klz(this.mhu, this.ve);
    }

    private void kgc() {
        if (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw.zmn(this.iv)) {
            com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw(this.bvs, this.klz, this.nqi, (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn) this.cd, this, this.so, this.ev, this.cn, this.iv);
            com.bytedance.sdk.openadsdk.core.mw.fs.nps npsVar = new com.bytedance.sdk.openadsdk.core.mw.fs.nps(this.bvs, hhwVar, this, this.cd);
            hhwVar.zmn((cyb) this);
            this.mhu.add(npsVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.fs.hhw hhwVar2 = new com.bytedance.sdk.component.adexpress.fs.hhw(this.bvs, this.cd, new doe(this, this.cd));
        this.tet = hhwVar2;
        this.mhu.add(hhwVar2);
    }

    private void kjb() {
        if (com.bytedance.sdk.openadsdk.core.cn.btk()) {
            return;
        }
        mw.zmn();
    }

    private void zak() {
        com.bytedance.sdk.openadsdk.core.mw.hhw.fb fbVar;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.klz;
        if (nqiVar2 == null || nqiVar2.ldx() != 1 || this.klz.nkt() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw.zmn(this.iv) || (nqiVar = this.klz) == null || nqiVar.nkt() == 2) {
                com.bytedance.sdk.openadsdk.core.zg.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.core.zg.zmn.zmn();
                int i = this.fs;
                if (i != 0) {
                    if (i == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.btk.nps npsVar = new com.bytedance.sdk.component.adexpress.dynamic.btk.nps();
                        Context applicationContext = this.bvs.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.fs.mw mwVar = this.cd;
                        boolean z = this.nqi;
                        com.bytedance.sdk.component.adexpress.fs.fs fsVar = new com.bytedance.sdk.component.adexpress.fs.fs(applicationContext, mwVar, z, npsVar, this, zmnVar, new nps(this.bvs, z, npsVar, mwVar, zmnVar));
                        this.zak = fsVar;
                        this.mhu.add(fsVar);
                        return;
                    }
                    if (i == 7) {
                        com.bytedance.sdk.openadsdk.core.mw.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.mw.hhw.fb(this.bvs, this.klz, this.nqi, (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn) this.cd, this);
                        this.xrr = fbVar2;
                        com.bytedance.sdk.openadsdk.core.mw.fs.nps npsVar2 = new com.bytedance.sdk.openadsdk.core.mw.fs.nps(this.bvs, fbVar2, this, this.cd);
                        this.yo = npsVar2;
                        npsVar2.zmn(this);
                        this.mhu.add(this.yo);
                        return;
                    }
                    switch (i) {
                        case 10:
                            if (this.hgd && (fbVar = this.xrr) != null) {
                                fbVar.zmn(this.klz, this.nqi, (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn) this.cd, this);
                            } else {
                                this.xrr = new com.bytedance.sdk.openadsdk.core.mw.hhw.nps(this.bvs, this.klz, this.nqi, (com.bytedance.sdk.openadsdk.core.mw.hhw.zmn) this.cd, this);
                            }
                            com.bytedance.sdk.openadsdk.core.mw.fs.nps npsVar3 = new com.bytedance.sdk.openadsdk.core.mw.fs.nps(this.bvs, this.xrr, this, this.cd);
                            this.yo = npsVar3;
                            npsVar3.zmn(this);
                            this.mhu.add(this.yo);
                            break;
                        case 11:
                            bjh bjhVar = new bjh(this.bvs, this.cd, this.olo, this.klz);
                            this.kra = bjhVar;
                            bjhVar.fs(this.yj);
                            com.bytedance.sdk.component.adexpress.fs.cyb cybVar = new com.bytedance.sdk.component.adexpress.fs.cyb(this.bvs, this.cd, this.kra, this);
                            this.bxw = cybVar;
                            this.mhu.add(cybVar);
                            break;
                    }
                }
                kjb kjbVar = new kjb(this.bvs, this.cd, this.olo, this.klz);
                this.kra = kjbVar;
                com.bytedance.sdk.component.adexpress.fs.cyb cybVar2 = new com.bytedance.sdk.component.adexpress.fs.cyb(this.bvs, this.cd, kjbVar, this);
                this.bxw = cybVar2;
                this.mhu.add(cybVar2);
            }
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        zmn zmnVar;
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar != null && (fbVar instanceof doe) && (zmnVar = (zmn) fbVar.btk()) != null) {
            zmnVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        zn znVar = this.yof;
        if (znVar != null) {
            znVar.zmn(tTDislikeDialogAbstract);
        }
        this.fb = tTDislikeDialogAbstract;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.zn.zn znVar) {
        zmn zmnVar;
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar != null && (fbVar instanceof doe) && (zmnVar = (zmn) fbVar.btk()) != null) {
            zmnVar.setDislikeInner(znVar);
        }
        zn znVar2 = this.yof;
        if (znVar2 != null) {
            znVar2.zmn(znVar);
        }
        this.zn = znVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.btk = pAGExpressAdWrapperListener;
        zn znVar = this.yof;
        if (znVar != null) {
            znVar.zmn(pAGExpressAdWrapperListener);
        }
    }

    public void setClickCreativeListener(bvs bvsVar) {
        this.hhw = bvsVar;
        if (bvsVar != null) {
            bvsVar.zmn((zmn.InterfaceC0185zmn) this);
        }
    }

    public bvs getClickCreativeListener() {
        return this.hhw;
    }

    public iv getClickListener() {
        return this.nps;
    }

    public void setClickListener(iv ivVar) {
        this.nps = ivVar;
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.fs.zn znVar) {
        this.cyb = znVar;
        com.bytedance.sdk.component.adexpress.fs.hhw hhwVar = this.tet;
        if (hhwVar != null) {
            hhwVar.zmn(znVar);
        }
    }

    public void kw() {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof kjb) {
            if (fbVar == null) {
                return;
            }
            ((kjb) fbVar).rc();
            com.bytedance.sdk.component.utils.bvs.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.6
                @Override // java.lang.Runnable
                public void run() {
                    phc.this.btk(1);
                }
            }, (this.klz != null ? r0.rp().fb() : 5) * 1000);
        } else if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.nps) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.nps) fbVar).rc();
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
        if (nqiVar != null && (exj = nqiVar.exj()) != null && (zmn = exj.zmn()) != null) {
            zmn.zmn(0L);
        }
        if ((this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.nps) && com.bytedance.sdk.openadsdk.core.model.olo.zmn(this.klz)) {
            zmn(this.am);
        }
    }

    public void btk(int i) {
        if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(this.klz)) {
            com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
            if (fbVar instanceof kjb) {
                ((kjb) fbVar).fs(i);
            }
        }
    }

    public void hhw(int i) {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar == null || !(fbVar instanceof kjb)) {
            return;
        }
        ((kjb) fbVar).zmn(i);
        this.lt = i;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (iqz()) {
            zmn(i, true, false);
        }
    }

    public void zmn(int i, boolean z, boolean z2) {
        this.kgc = z;
        removeCallbacks(this.uqd);
        removeCallbacks(this.gn);
        if (i == 0) {
            if (z2) {
                this.gn.run();
                return;
            } else {
                postDelayed(this.gn, 50L);
                return;
            }
        }
        if (z2) {
            this.uqd.run();
        } else {
            postDelayed(this.uqd, 50L);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        onWindowVisibilityChanged(z ? getVisibility() : 8);
        am();
        com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(this.klz, z);
        if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.klz)) {
            return;
        }
        if (z) {
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.klz, 4);
        } else {
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.klz, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        if (this.vlj.get()) {
            this.rp.zmn(System.currentTimeMillis(), hgd.zmn(this));
        }
    }

    public void phc() {
        if (this.klz == null) {
            return;
        }
        this.kjb = SystemClock.elapsedRealtime();
        if (this.klz.xup()) {
            zn znVar = this.yof;
            if (znVar == null) {
                a_(106);
                return;
            } else {
                znVar.zmn((com.bytedance.sdk.component.adexpress.fs.cn) this);
                this.yof.zmn();
                return;
            }
        }
        this.olo.zmn();
        iv.zmn zmnVar = this.na;
        if (zmnVar != null) {
            zmnVar.zmn(this);
        }
        try {
            this.na.zmn();
        } catch (Throwable unused) {
        }
    }

    public boolean safedk_phc_dispatchTouchEvent_1b3134c375517e00a7fb6562789fa19e(MotionEvent p0) {
        int i;
        bvs bvsVar = this.hhw;
        if (bvsVar != null) {
            bvsVar.fs(p0.getDeviceId());
            this.hhw.zmn(p0.getSource());
            this.hhw.zn(p0.getToolType(0));
        }
        iv ivVar = this.nps;
        if (ivVar != null) {
            ivVar.fs(p0.getDeviceId());
            this.nps.zmn(p0.getSource());
            this.nps.zn(p0.getToolType(0));
        }
        int actionMasked = p0.getActionMasked();
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    i2 = actionMasked != 3 ? -1 : 4;
                } else {
                    this.rje += Math.abs(p0.getX() - this.lbc);
                    this.zi += Math.abs(p0.getY() - this.hwg);
                    this.lbc = p0.getX();
                    this.hwg = p0.getY();
                    i = (System.currentTimeMillis() - this.nkt <= 200 || (this.rje <= 8.0f && this.zi <= 8.0f)) ? 2 : 1;
                }
            }
            i = i2;
        } else {
            this.lbc = p0.getRawX();
            this.hwg = p0.getRawY();
            this.nkt = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.klz.zn.zmn(p0);
            i = 0;
        }
        SparseArray<zn.zmn> sparseArray = this.f3741io;
        if (sparseArray != null) {
            sparseArray.put(p0.getActionMasked(), new zn.zmn(i, p0.getSize(), p0.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(p0);
        } catch (Exception unused) {
            return false;
        }
    }

    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.iqz.zmn("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i));
        if (i == -1 || znVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (am.zn(this.klz)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        hashMap.put("dynamic_show_type", Integer.valueOf(getDynamicShowType()));
        com.bytedance.sdk.openadsdk.core.model.cyb cybVar = (com.bytedance.sdk.openadsdk.core.model.cyb) znVar;
        if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.klz)) {
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Integer.valueOf(cybVar.olo));
        }
        if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(this.klz)) {
            try {
                JSONObject jSONObject2 = cybVar.mw;
                if (jSONObject2 != null) {
                    int optInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", optInt);
                    hashMap.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn(th.toString(), new Object[0]);
            }
        }
        bvs bvsVar = this.hhw;
        if (bvsVar != null) {
            bvsVar.fb(getDynamicShowType());
            this.hhw.zmn(hashMap);
        }
        iv ivVar = this.nps;
        if (ivVar != null) {
            ivVar.fb(getDynamicShowType());
            this.nps.zmn(hashMap);
        }
        float f = cybVar.zmn;
        float f2 = cybVar.fs;
        float f3 = cybVar.zn;
        float f4 = cybVar.fb;
        boolean z = cybVar.rc;
        SparseArray<zn.zmn> sparseArray = cybVar.iv;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.f3741io;
        }
        SparseArray<zn.zmn> sparseArray2 = sparseArray;
        String str = cybVar.nps;
        if (view == null) {
            view2 = this;
        } else {
            r6 = view != this ? zmn(view) : null;
            view2 = view;
        }
        cybVar.zg = i;
        if (r6 != null && cybVar.bvs == null) {
            cybVar.bvs = r6;
        }
        if (i != 13) {
            switch (i) {
                case 1:
                    FrameLayout frameLayout = this.mw;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
                    if (nqiVar == null || nqiVar.lbc() != 1 || z) {
                        iv ivVar2 = this.nps;
                        if (ivVar2 != null) {
                            ivVar2.zmn(cybVar);
                            this.nps.zmn(str);
                            this.nps.zmn(view2, f, f2, f3, f4, sparseArray2, z);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.btk;
                        if (pAGExpressAdWrapperListener != null && !cybVar.rt) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (cybVar.klz > 0) {
                        nu.zmn(true);
                    }
                    bvs bvsVar2 = this.hhw;
                    if (bvsVar2 != null) {
                        bvsVar2.zmn(cybVar);
                        this.hhw.zmn(str);
                        if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(this.klz) && (jSONObject = cybVar.mw) != null) {
                            this.hhw.fb(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.hhw.zmn(view2, f, f2, f3, f4, sparseArray2, z);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.btk;
                    if (pAGExpressAdWrapperListener2 != null && !cybVar.rt) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    nu.zmn(false);
                    if (!com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.klz)) {
                        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.klz, 9);
                        break;
                    }
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fb;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                        break;
                    } else {
                        com.bytedance.sdk.openadsdk.zn.zn znVar2 = this.zn;
                        if (znVar2 != null) {
                            znVar2.zmn();
                            break;
                        } else {
                            TTDelegateActivity.zmn(this.klz, this.nu);
                            break;
                        }
                    }
                case 4:
                    FrameLayout frameLayout2 = this.mw;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.klz;
                    if (nqiVar2 == null || nqiVar2.lbc() != 1 || z) {
                        oub.zn(this.klz);
                        if ("embeded_ad".equals(this.iv) && yj() && !this.rt && oub.zn(this.klz)) {
                            bvs bvsVar3 = this.hhw;
                            if (bvsVar3 != null) {
                                bvsVar3.zmn(cybVar);
                                this.hhw.zmn(str);
                                this.hhw.zmn(view2, f, f2, f3, f4, sparseArray2, z);
                            }
                        } else {
                            iv ivVar3 = this.nps;
                            if (ivVar3 != null) {
                                ivVar3.zmn(cybVar);
                                this.nps.zmn(str);
                                this.nps.zmn(view2, f, f2, f3, f4, sparseArray2, z);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.btk;
                        if (pAGExpressAdWrapperListener3 != null && !cybVar.rt) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    zmn(!this.nqi, "dynamicClick");
                    break;
                case 6:
                    zmn();
                    break;
                case 7:
                    if (com.bytedance.sdk.openadsdk.utils.fs.btk() && com.bytedance.sdk.openadsdk.core.kgc.fb().am()) {
                        IABLandingPageActivity.zmn(this.bvs, this.klz, this.iv);
                        break;
                    } else {
                        TTWebsiteActivity.zmn(this.bvs, this.klz, this.iv);
                        break;
                    }
            }
            return;
        }
        int i2 = cybVar.cn;
        if (i2 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i2);
                zmn(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zn.zmn.InterfaceC0185zmn
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.fb.bvs bvsVar = this.oep;
        if (bvsVar != null) {
            return bvsVar.getVideoProgress();
        }
        return 0L;
    }

    public static JSONObject zmn(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean yj() {
        return com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.klz);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        am();
        so();
        getViewTreeObserver().addOnScrollChangedListener(this.dgt);
        com.bytedance.sdk.openadsdk.core.iv.fs().zmn(this.nu, this.ww);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        am();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    private void so() {
        List<com.bytedance.sdk.component.adexpress.fs.iv> list = this.mhu;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.fs.iv> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void ev() {
        List<com.bytedance.sdk.component.adexpress.fs.iv> list = this.mhu;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.fs.iv> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void rc() {
        kjb kjbVar = this.kra;
        if (kjbVar == null || kjbVar.btk() == null) {
            return;
        }
        this.kra.bvs();
    }

    public void klz() {
        kjb kjbVar = this.kra;
        if (kjbVar == null || kjbVar.btk() == null) {
            return;
        }
        this.kra.kgc();
    }

    public void mw() {
        try {
            zn znVar = this.yof;
            if (znVar != null) {
                znVar.fs();
            }
            uqh();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.fs.iv> list = this.mhu;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.fs.iv> it = list.iterator();
                while (it.hasNext()) {
                    it.next().zmn();
                }
            }
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.klz);
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs(this.klz);
            this.zn = null;
            this.fb = null;
            this.rc = null;
            this.klz = null;
            this.btk = null;
            this.hhw = null;
            this.cyb = null;
            this.nps = null;
            com.bytedance.sdk.openadsdk.core.mw.zn.fs fsVar = this.fkt;
            if (fsVar != null) {
                fsVar.fb();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("NativeExpressView", "detach error", th);
        }
    }

    public void doe() {
        try {
            FrameLayout frameLayout = this.mw;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.mw);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.dgt);
        com.bytedance.sdk.openadsdk.core.iv.fs().hhw(this.nu);
        ev();
        zmn(8, true, true);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    public void zmn(com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar;
        this.vlj.set(true);
        this.am = fbVar;
        fbVar.zn();
        if (this.lt != getWindowVisibility() && bvs()) {
            hhw(getWindowVisibility());
        }
        if (fbVar.zn() == 3 && (nqiVar = this.klz) != null && nqiVar.cd() == 1) {
            this.klz.klz(0);
        }
        if (fbVar.zn() != 1 || (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb)) {
            View btk = fbVar.btk();
            if (btk.getParent() != null) {
                ((ViewGroup) btk.getParent()).removeView(btk);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                arrayList.add(getChildAt(i));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) instanceof com.bytedance.sdk.component.bvs.nps) {
                    removeView((View) arrayList.get(i2));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(this.klz)) {
                addView(fbVar.btk(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(fbVar.btk());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar2 = this.klz;
        if (nqiVar2 != null) {
            com.bytedance.sdk.openadsdk.cyb.fb.zmn(nqiVar2.bvs(), this.kjb, this.iv, fbVar.zn());
        }
        com.bytedance.sdk.component.adexpress.fs.bvs bvsVar = this.ve;
        if (bvsVar != null) {
            ((rt) bvsVar).iv();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.btk;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) rtVar.zn(), (float) rtVar.fb());
        }
        if ((this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.nps) && com.bytedance.sdk.openadsdk.core.model.olo.zmn(this.klz)) {
            rp();
        }
        if (!com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(this.klz) && fs(rtVar)) {
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this, this.klz, zn(getDynamicShowType()));
        }
        nqi nqiVar3 = this.jy;
        if (nqiVar3 != null) {
            nqiVar3.zmn(this.klz, this.iv);
        }
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar4 = this.klz;
        if (nqiVar4 != null) {
            nqiVar4.hwg(fbVar.zn());
        }
    }

    protected btk.zmn zn(int i) {
        return new btk.zmn(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.cn
    public void a_(int i) {
        com.bytedance.sdk.component.adexpress.fs.bvs bvsVar = this.ve;
        if (bvsVar != null) {
            if (!this.zmn) {
                bvsVar.nps();
            }
            this.ve.zg();
            ((rt) this.ve).iv();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.btk;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.bvs.zmn(i), i);
        }
        nqi nqiVar = this.jy;
        if (nqiVar != null) {
            nqiVar.zmn(this.klz, this.iv);
        }
    }

    public boolean nqi() {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        return fbVar != null && (fbVar instanceof doe);
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar != null) {
            return fbVar.zn();
        }
        return 0;
    }

    public JSONObject zmn(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        if (!(this.am instanceof kjb)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (nqiVar != null) {
                if (nqiVar.ouf() != null && nqiVar.ouf().klz()) {
                    jSONObject.put("engine_version", nqiVar.ouf().rc());
                } else if (nqiVar.rsi() != null) {
                    if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar)) {
                        jSONObject.put("engine_version", "v4");
                    } else {
                        jSONObject.put("engine_version", "v3");
                    }
                } else if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar) && com.bytedance.sdk.openadsdk.core.model.iqz.btk(nqiVar)) {
                    jSONObject.put("engine_version", "v4");
                } else {
                    jSONObject.put("engine_version", i.a);
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e) {
            e.getMessage();
        }
        return jSONObject;
    }

    public int getRenderEngineCacheType() {
        rc nqi;
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (!(fbVar instanceof kjb) || (nqi = ((kjb) fbVar).nqi()) == null) {
            return 0;
        }
        return nqi.zmn();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.so).intValue();
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.ev).intValue();
    }

    public fkt getJsObject() {
        kjb kjbVar = this.kra;
        if (kjbVar != null) {
            return kjbVar.uqh();
        }
        return null;
    }

    private boolean tf() {
        return TextUtils.equals(this.iv, "fullscreen_interstitial_ad") || TextUtils.equals(this.iv, "rewarded_video") || TextUtils.equals("open_ad", this.iv) || kjb.fs(this.iv) || TextUtils.equals(this.iv, "embeded_ad");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        try {
            int parseInt = Integer.parseInt(String.valueOf(charSequence));
            fs(parseInt, i);
            com.bytedance.sdk.openadsdk.core.mw.zn.fs fsVar = this.fkt;
            if (fsVar != null) {
                fsVar.zmn(parseInt);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setSoundMute(boolean z) {
        this.nqi = z;
        com.bytedance.sdk.component.adexpress.fs.fs fsVar = this.zak;
        if (fsVar != null && fsVar.fs() != null) {
            this.zak.fs().setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) fbVar).setSoundMute(z);
        }
    }

    protected void fs(int i, int i2) {
        int i3;
        if (TextUtils.equals(this.iv, "banner_ad")) {
            return;
        }
        String str = this.iv;
        int i4 = this.uqh;
        int i5 = ((i2 < i4 || i4 < 0 || !(this.bjh || TextUtils.equals(str, "open_ad"))) && !((i == 0 && TextUtils.equals(this.iv, "open_ad")) || btk() == 5)) ? 0 : 1;
        if (i2 <= this.uqh) {
            com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
            if (nqiVar != null && nqiVar.mrt() != null) {
                i3 = (int) (Math.min(this.uqh, this.klz.mrt().hhw() * this.klz.mrt().doe()) - i2);
            } else {
                i3 = this.uqh - i2;
            }
        } else {
            i3 = 0;
        }
        com.bytedance.sdk.component.adexpress.fs.fs fsVar = this.zak;
        if (fsVar != null && fsVar.fs() != null) {
            this.zak.fs().setTime(String.valueOf(i), i5, i3, false);
        }
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) fbVar).setTime(String.valueOf(i), i5, i3, false);
        }
    }

    public void uqh() {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
        if (nqiVar == null || (exj = nqiVar.exj()) == null || (zmn = exj.zmn()) == null) {
            return;
        }
        zmn.btk(getVideoProgress());
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.fb.bvs bvsVar) {
        this.oep = bvsVar;
    }

    public boolean bjh() {
        return this.vlj.get();
    }

    public void fs(int i, String str) {
        fkt uqh;
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar == null || !(fbVar instanceof kjb) || (uqh = ((kjb) fbVar).uqh()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i);
            jSONObject.put("flag", str);
            uqh.zmn("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void rp() {
        com.bytedance.sdk.openadsdk.core.mw.zn.fs fsVar = new com.bytedance.sdk.openadsdk.core.mw.zn.fs(this.bvs, this.klz);
        this.fkt = fsVar;
        fsVar.zmn(this);
        this.fkt.zmn(new com.bytedance.sdk.openadsdk.core.mw.zn.zmn() { // from class: com.bytedance.sdk.openadsdk.core.iv.phc.7
            @Override // com.bytedance.sdk.openadsdk.core.mw.zn.zmn
            public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
                zmn(view, i, znVar);
            }
        });
    }

    public void zmn(com.bytedance.sdk.component.adexpress.fs.fb fbVar) {
        if (this.fkt == null) {
            return;
        }
        try {
            if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.nps) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.mw.hhw.nps) fbVar).hhw().rc();
                this.doe = viewGroup;
                if (viewGroup != null) {
                    this.fkt.fs();
                    View zn = this.fkt.zn();
                    if (zn != null) {
                        ViewGroup viewGroup2 = (ViewGroup) zn.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(zn);
                        }
                        this.doe.addView(zn, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.mw.zg zgVar) {
        if (this.kra == null || getJsObject() == null) {
            return;
        }
        getJsObject().zmn(zgVar);
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar) {
        kjb kjbVar = this.kra;
        if (kjbVar != null) {
            kjbVar.zmn(fsVar);
        }
    }

    public void nps(int i) {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if ((fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.nps) && i == 4) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.nps) fbVar).iv();
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, String str, boolean z, boolean z2) {
        if (nqiVar == null) {
            return;
        }
        this.iv = str;
        this.klz = nqiVar;
        this.rc = adSlot;
        this.nqi = z;
        this.oub = z2;
        int skn = nqiVar.skn();
        this.fs = skn;
        if (skn != 10) {
            return;
        }
        this.hgd = true;
        nps();
        phc();
        this.hgd = false;
    }

    public void setDirectDestroyWebView(boolean z) {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.component.adexpress.btk.zmn) {
            ((com.bytedance.sdk.component.adexpress.btk.zmn) fbVar).fs(z);
        }
    }
}
