package com.bytedance.sdk.openadsdk.component.reward.zn;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.zmn.cn;
import com.bytedance.sdk.openadsdk.component.reward.zmn.klz;
import com.bytedance.sdk.openadsdk.component.reward.zn.fs.fs;
import com.bytedance.sdk.openadsdk.core.iv.uqh;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.cyb;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public abstract class fs implements kjb.zmn, PAGExpressAdWrapperListener, zmn, com.bytedance.sdk.openadsdk.component.reward.zn.zmn.btk {
    private com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn bjh;
    protected nqi btk;
    protected klz bvs;
    protected long cn;
    protected boolean cyb;
    private com.bytedance.sdk.openadsdk.core.hhw.zn doe;
    protected Activity fb;
    public boolean fs;
    protected String hhw;
    private com.bytedance.sdk.openadsdk.component.reward.zn.fs.nps iqz;
    protected com.bytedance.sdk.openadsdk.component.reward.zmn.zmn iv;
    private com.bytedance.sdk.openadsdk.component.reward.zn.fs.btk kw;
    protected Context mw;
    public cn nps;
    protected boolean olo;
    private com.bytedance.sdk.openadsdk.component.reward.zn.fs.zmn phc;
    protected com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn rc;
    private ViewGroup uqh;
    protected com.bytedance.sdk.openadsdk.component.reward.zn.fs.fb zg;
    protected String zmn;
    private final AtomicBoolean kgc = new AtomicBoolean(false);
    protected boolean zn = false;
    private boolean nqi = false;
    protected final kjb klz = new kjb(Looper.getMainLooper(), this);
    protected AtomicBoolean rt = new AtomicBoolean(false);
    private AtomicBoolean rp = new AtomicBoolean(false);
    private AtomicBoolean kjb = new AtomicBoolean(false);

    protected abstract void cyb();

    protected abstract void klz();

    protected abstract void mw();

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
    }

    protected void rt() {
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
    }

    protected abstract void zmn(boolean z, int i, String str, int i2, String str2, int i3);

    public fs(Activity activity, Context context, nqi nqiVar, String str, ViewGroup viewGroup, String str2) {
        this.fb = activity;
        this.btk = nqiVar;
        this.hhw = str;
        this.mw = context;
        this.uqh = viewGroup;
        this.zg = new com.bytedance.sdk.openadsdk.component.reward.zn.fs.fb(this, activity, nqiVar, str);
        this.nps = new cn(viewGroup, nqiVar, str, activity, activity.getApplicationContext(), this);
        this.bvs = new klz(activity, nqiVar, nqiVar.ol(), false, this.fs, null);
        this.kw = new com.bytedance.sdk.openadsdk.component.reward.zn.fs.btk(this, activity, nqiVar);
        this.iqz = new com.bytedance.sdk.openadsdk.component.reward.zn.fs.nps(nqiVar);
        this.phc = new com.bytedance.sdk.openadsdk.component.reward.zn.fs.zmn(viewGroup, activity);
        this.iv = new com.bytedance.sdk.openadsdk.component.reward.zmn.zmn(activity, nqiVar, nqiVar.ol(), str);
        this.zmn = str2;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(activity);
        this.doe = znVar;
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn znVar2 = new com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn(activity, nqiVar, znVar, viewGroup, this.nps);
        this.rc = znVar2;
        znVar2.zmn(this);
        this.zg.zmn(this);
        this.nps.zmn((PAGExpressAdWrapperListener) this);
        this.iv.zmn(zmn(nqiVar));
        this.bvs.zmn(nqiVar.utx().getDurationSlotType() == 7);
    }

    public void zmn(@Nullable Bundle bundle) {
        cyb.zmn(this.btk, this.mw, this.hhw, this);
        kgc();
        if (iqz.btk(this.btk)) {
            this.iv.fs();
        }
        this.uqh.addView(this.doe, new ViewGroup.LayoutParams(-1, -1));
        this.doe.setVisibility(8);
    }

    public void fs(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.fb fbVar = this.zg;
        if (fbVar != null && fbVar.zmn()) {
            this.btk.iv(true);
        }
        if (this.kgc.get()) {
            this.btk.zg(true);
        }
    }

    public void zn(Bundle bundle) {
        if (bundle != null) {
            this.cyb = bundle.getBoolean("enable_new_arch", false);
            return;
        }
        Activity activity = this.fb;
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        this.cyb = this.fb.getIntent().getBooleanExtra("enable_new_arch", false);
    }

    public void zn() {
        fb();
        klz klzVar = this.bvs;
        if (klzVar != null) {
            klzVar.zmn(this.klz);
        }
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn znVar = this.rc;
        if (znVar != null) {
            znVar.fs();
        }
    }

    protected void fb() {
        if (this.nqi || this.btk == null) {
            return;
        }
        this.nqi = true;
        this.fb.getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.1
            @Override // java.lang.Runnable
            public void run() {
                int ol = fs.this.btk.ol();
                fs fsVar = fs.this;
                float[] zmn = klz.zmn(ol, fsVar.fb, fsVar.btk, false);
                com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "show loading page");
                cn cnVar = fs.this.nps;
                if (cnVar != null) {
                    cnVar.zmn(zmn);
                    fs fsVar2 = fs.this;
                    fsVar2.nps.zmn(fsVar2.rc);
                    fs.this.nps.zn();
                    fs.this.btk();
                    fs.this.nps.hhw();
                    fs.this.nps.zmn(new com.bytedance.sdk.openadsdk.core.iv.btk() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.iv.btk
                        public void zmn(String str) {
                            if (fs.this.kw != null) {
                                fs.this.kw.zmn(str);
                            }
                        }
                    });
                }
            }
        });
    }

    private void kgc() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar = this.iv;
        if (zmnVar == null) {
            return;
        }
        zmnVar.zmn();
        if (this.iv.hhw() != null) {
            this.uqh.addView(this.iv.hhw(), new FrameLayout.LayoutParams(-1, -1));
            this.iv.zn();
        }
    }

    protected void btk() {
        cn cnVar = this.nps;
        if (cnVar == null) {
            return;
        }
        uqh fs = cnVar.fs();
        this.nps.zmn((zmn) this);
        if (fs != null) {
            this.iqz.zmn(fs.getWebView());
            this.nps.zmn(this.iqz);
            fs.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.btk
                public void zmn() {
                    fs.this.iv();
                }
            });
        }
    }

    public void hhw() {
        com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "onPause: ");
        cn cnVar = this.nps;
        if (cnVar != null) {
            cnVar.btk();
        }
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.zmn zmnVar = this.phc;
        if (zmnVar != null) {
            zmnVar.zn();
        }
    }

    public void nps() {
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn znVar = this.rc;
        if (znVar != null) {
            znVar.zn();
        }
    }

    public void zg() {
        iqz();
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.fb fbVar = this.zg;
        if (fbVar != null && fbVar.zmn() && this.zg.fs() > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.zg.fs());
            cn cnVar = this.nps;
            com.bytedance.sdk.openadsdk.fb.zn.zmn(valueOf, this.btk, this.hhw, (cnVar == null || cnVar.fs() == null) ? null : this.nps.fs().getAdShowTime());
        }
        com.bytedance.sdk.openadsdk.component.reward.zn.fs.btk btkVar = this.kw;
        if (btkVar != null) {
            btkVar.zmn();
        }
        cn cnVar2 = this.nps;
        if (cnVar2 != null) {
            cnVar2.nps();
        }
        cyb.zmn();
    }

    public void bvs() {
        klz klzVar = this.bvs;
        if (klzVar != null) {
            klzVar.zmn();
        }
    }

    public void zmn(boolean z) {
        if (this.zg != null) {
            cn cnVar = this.nps;
            this.zg.zmn(z, (cnVar == null || cnVar.fs() == null) ? null : this.nps.fs().getAdShowTime());
            this.zg.zmn(z, this.btk, this.hhw);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.zmn
    public void zmn() {
        iv();
        this.btk.wl();
        this.btk.fb(true);
        if (nqi.btk(this.btk)) {
            nqi nqiVar = this.btk;
            com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, this.hhw, nqiVar.zvo());
        }
    }

    public void iv() {
        com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        mw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.zmn
    public void fs() {
        if (this.kgc.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.iqz.zmn("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            rc();
        }
    }

    protected void rc() {
        klz();
        cn cnVar = this.nps;
        if (cnVar == null || cnVar.fs() == null) {
            return;
        }
        this.nps.fs().kw();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f, float f2) {
        this.rt.set(true);
        if (iqz.btk(this.btk)) {
            if (this.kjb.get() && !this.rp.get()) {
                this.rp.set(true);
                kw();
                com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn znVar = this.rc;
                if (znVar != null) {
                    znVar.zmn();
                }
                com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar = this.iv;
                if (zmnVar != null) {
                    zmnVar.btk();
                    this.iv.fb();
                }
            } else {
                com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar2 = this.iv;
                if (zmnVar2 != null) {
                    zmnVar2.fs();
                }
            }
        } else {
            kw();
            com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar3 = this.iv;
            if (zmnVar3 != null) {
                zmnVar3.btk();
                this.iv.fb();
            }
        }
        if (this.phc == null || !zg.nps()) {
            return;
        }
        this.phc.zmn();
        this.phc.zmn(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/zn/fs$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view2);
                safedk_fs$3_onClick_721c756f21444c339ca267f5c1ec32c4(view2);
            }

            public void safedk_fs$3_onClick_721c756f21444c339ca267f5c1ec32c4(View p0) {
                fs fsVar = fs.this;
                if (fsVar.fb != null) {
                    cn cnVar = fsVar.nps;
                    if (cnVar != null) {
                        View p02 = cnVar.fs();
                        if (p02 != null) {
                            fs.this.nps.fs().setDirectDestroyWebView(true);
                        }
                    }
                    fs.this.rt();
                    fs.this.fb.finish();
                }
            }
        });
        this.phc.zmn(new fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs.fs.zmn
            public void zmn() {
                cn cnVar = fs.this.nps;
                if (cnVar != null) {
                    cnVar.zmn();
                    com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "onSendHeartbeat: ");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fs.fs.zmn
            public void zmn(fs.EnumC0149fs enumC0149fs) {
                com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "onHeartbeatStatusChanged: ".concat(String.valueOf(enumC0149fs)));
                if (enumC0149fs == fs.EnumC0149fs.TIMEOUT) {
                    fs.this.phc.fs();
                    fs.this.phc.zmn(fs.this.btk);
                }
            }
        });
        this.nps.zmn(new fb() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.zn.fb
            public void zmn() {
                if (fs.this.phc != null) {
                    fs.this.phc.fb();
                    com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "responseHeartBeat: ");
                }
            }
        });
    }

    private void kw() {
        if (this.zg != null) {
            JSONObject jSONObject = new JSONObject();
            cn cnVar = this.nps;
            if (cnVar != null && cnVar.fs() != null) {
                jSONObject = this.nps.fs().zmn(jSONObject, this.btk);
            }
            this.cn = System.currentTimeMillis();
            this.zg.zmn(jSONObject);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
        this.rt.set(false);
    }

    private void iqz() {
        com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "removeLoadingPage: ");
        try {
            com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar = this.iv;
            if (zmnVar != null) {
                zmnVar.fb();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("BaseManagerBundle", "removeLoadingPage: ", th);
            com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar2 = this.iv;
            if (zmnVar2 == null || zmnVar2.hhw() == null) {
                return;
            }
            this.iv.hhw().setAlpha(0.0f);
        }
    }

    public void fs(boolean z) {
        this.zn = z;
    }

    public boolean cn() {
        return this.zn;
    }

    public void olo() {
        Activity activity;
        if (com.bytedance.sdk.openadsdk.uqh.btk.bvs() && (activity = this.fb) != null && activity.isChangingConfigurations()) {
            com.bytedance.sdk.component.utils.iqz.zmn("BVA", "callback close is invoke by config change.");
            return;
        }
        if (!this.olo) {
            this.olo = true;
            nqi nqiVar = this.btk;
            if (nqiVar != null && !nqiVar.yof()) {
                long bvs = this.btk.bvs();
                if (bvs > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - bvs;
                    if (elapsedRealtime > 0) {
                        this.btk.fs(elapsedRealtime);
                    }
                }
                if (this.zg != null) {
                    JSONObject jSONObject = new JSONObject();
                    cn cnVar = this.nps;
                    if (cnVar != null && cnVar.fs() != null) {
                        jSONObject = this.nps.fs().zmn(jSONObject, this.btk);
                    }
                    this.cn = System.currentTimeMillis();
                    this.zg.zmn(jSONObject);
                }
            }
            cyb();
            return;
        }
        com.bytedance.sdk.component.utils.iqz.zmn("BVA", "invoke callback onAdClose has already been called ");
    }

    public com.bytedance.sdk.openadsdk.core.zn.btk zmn(nqi nqiVar) {
        if (this.bjh == null) {
            this.bjh = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.fb, this.hhw);
        }
        Activity activity = this.fb;
        String str = this.hhw;
        com.bytedance.sdk.openadsdk.core.zn.btk btkVar = new com.bytedance.sdk.openadsdk.core.zn.btk(activity, nqiVar, str, TextUtils.equals(str, "rewarded_video") ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.6
            @Override // com.bytedance.sdk.openadsdk.core.zn.btk
            public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, 0);
                hashMap.put("click_scence", 1);
                zmn(hashMap);
                fs.this.iv();
            }
        };
        btkVar.zmn(this.bjh);
        return btkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zn.zmn.btk
    public void zmn(String str, int i, int i2) {
        cn cnVar = this.nps;
        if (cnVar != null) {
            cnVar.zmn(str, i, i2);
            if (i == 2 || i == 3) {
                System.currentTimeMillis();
                this.kjb.set(true);
                if (this.rt.get() && iqz.btk(this.btk) && !this.rp.get()) {
                    this.rp.set(true);
                    kw();
                    com.bytedance.sdk.openadsdk.core.hhw.zn znVar = this.doe;
                    if (znVar != null) {
                        znVar.setVisibility(0);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn znVar2 = this.rc;
                    if (znVar2 != null && i == 2) {
                        znVar2.zmn();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zmn.zmn zmnVar = this.iv;
                    if (zmnVar != null) {
                        zmnVar.fb();
                        this.iv.btk();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.core.hhw.zn znVar3 = this.doe;
                if (znVar3 != null) {
                    znVar3.setVisibility(0);
                }
                com.bytedance.sdk.openadsdk.component.reward.zn.fs.zn znVar4 = this.rc;
                if (znVar4 == null || i != 2) {
                    return;
                }
                znVar4.zmn();
            }
        }
    }
}
