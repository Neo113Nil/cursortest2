package com.bytedance.sdk.openadsdk.core.iv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.rp;
import com.bytedance.sdk.openadsdk.core.fkt;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class bjh extends kjb {
    protected final AtomicBoolean bvs;
    private final rp.zmn iqz;
    private Activity kw;
    protected com.bytedance.sdk.openadsdk.core.iv.zmn.fs zg;

    public bjh(Context context, com.bytedance.sdk.component.adexpress.fs.mw mwVar, com.bytedance.sdk.openadsdk.fb.fb.btk btkVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        super(context, mwVar, btkVar, nqiVar);
        this.bvs = new AtomicBoolean(false);
        this.iqz = new rp.zmn() { // from class: com.bytedance.sdk.openadsdk.core.iv.bjh.1
            @Override // com.bytedance.sdk.component.utils.rp.zmn
            public void zmn(Context context2, Intent intent, boolean z, int i) {
                fkt fktVar = ((kjb) bjh.this).cn;
                if (fktVar != null) {
                    fktVar.fb(i);
                }
            }
        };
        kw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb
    public void cn() {
        super.cn();
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected nps.zn zmn() {
        return nps.zn.ADS_V4;
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected void fs() {
        if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zn()) {
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().fs(this.btk);
        } else {
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().zmn(this.btk);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected com.bytedance.sdk.component.bvs.nps zmn(Context context, String str) {
        return com.bytedance.sdk.component.adexpress.btk.btk.zmn().zmn(context, str);
    }

    public void fs(Activity activity) {
        this.kw = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb
    protected void cyb() {
        if (!com.bytedance.sdk.openadsdk.core.model.iqz.btk(((kjb) this).klz) && !com.bytedance.sdk.component.adexpress.zmn.fs.fs.fs(((kjb) this).mw) && this.fs != null) {
            com.bytedance.sdk.component.adexpress.fs.nps npsVar = this.fs;
            StringBuilder sb = new StringBuilder("data null is ");
            sb.append(((kjb) this).mw == null);
            npsVar.zmn(103, sb.toString());
            return;
        }
        super.cyb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb
    public void olo() {
        fkt fktVar;
        com.bytedance.sdk.component.bvs.nps npsVar = this.btk;
        if (npsVar == null || npsVar.getWebView() == null || (fktVar = ((kjb) this).cn) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.iv.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.core.iv.zmn.fs(fktVar, this.btk, ((kjb) this).klz);
        this.zg = fsVar;
        fsVar.fb();
        this.zg.fs();
        this.zg.zmn(this).zmn(this.kw).zmn(((kjb) this).rt).zmn(this.olo).zmn(((kjb) this).rc).zmn(((kjb) this).mw).zmn(this.cyb).zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb, com.bytedance.sdk.component.adexpress.btk.zmn, com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        super.zmn(rtVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected boolean fs(com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        return rtVar.fs() && TextUtils.equals(rtVar.cn(), "v4");
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb, com.bytedance.sdk.component.adexpress.btk.zmn
    public void zg() {
        super.zg();
        this.zg.zn();
        iqz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb, com.bytedance.sdk.component.adexpress.btk.zmn
    public void bvs() {
        super.bvs();
        com.bytedance.sdk.openadsdk.core.iv.zmn.fs fsVar = this.zg;
        if (fsVar != null) {
            fsVar.hhw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb
    public void kgc() {
        super.kgc();
        com.bytedance.sdk.openadsdk.core.iv.zmn.fs fsVar = this.zg;
        if (fsVar != null) {
            fsVar.btk();
        }
    }

    protected void kw() {
        if (this.bvs.get()) {
            return;
        }
        this.bvs.set(true);
        com.bytedance.sdk.component.utils.rp.zmn(this.iqz, ((kjb) this).iv);
    }

    protected void iqz() {
        if (this.bvs.get()) {
            this.bvs.set(false);
            try {
                com.bytedance.sdk.component.utils.rp.zmn(this.iqz);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.btk.zmn
    protected void hhw() {
        if (!com.bytedance.sdk.openadsdk.component.reward.zn.zg.fs() || this.btk == null) {
            return;
        }
        com.bytedance.sdk.component.utils.iqz.zmn("TTAD.WebViewRender", "refreshWebView: refresh webview by console log ");
        this.btk.a_("javascript:console.log('init engine');");
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.kjb
    protected void phc() {
        if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zn()) {
            com.bytedance.sdk.component.adexpress.btk.btk.zmn().fs(this.btk, ((kjb) this).cn);
        } else {
            super.phc();
        }
    }
}
