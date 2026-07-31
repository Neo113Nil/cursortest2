package com.bytedance.sdk.openadsdk.core.mw.fs;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.olo;
import com.bytedance.sdk.component.adexpress.fs.cn;
import com.bytedance.sdk.component.adexpress.fs.iv;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.adexpress.fs.zg;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.iv.cyb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class nps implements iv {
    private AtomicBoolean btk = new AtomicBoolean(false);
    private ScheduledFuture<?> fb;
    private com.bytedance.sdk.openadsdk.core.mw.hhw.fb fs;
    private cyb hhw;
    private Context zmn;
    private mw zn;

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public void zmn() {
    }

    public nps(Context context, com.bytedance.sdk.openadsdk.core.mw.hhw.fb fbVar, zg zgVar, mw mwVar) {
        this.zmn = context;
        this.fs = fbVar;
        this.zn = mwVar;
        this.fs.zmn(zgVar);
    }

    public void zmn(cyb cybVar) {
        this.hhw = cybVar;
        this.fs.zmn(cybVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.iv
    public boolean zmn(final iv.zmn zmnVar) {
        int hhw = this.zn.hhw();
        if (hhw < 0 && !(this.fs instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw)) {
            zmn(zmnVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(hhw)));
        } else {
            if (!(this.fs instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw)) {
                this.fb = nu.zmn().schedule(new zmn(1, zmnVar), hhw, TimeUnit.MILLISECONDS);
            }
            this.fs.zmn(new com.bytedance.sdk.component.adexpress.fs.nps() { // from class: com.bytedance.sdk.openadsdk.core.mw.fs.nps.1
                @Override // com.bytedance.sdk.component.adexpress.fs.nps
                public void zmn(View view, rt rtVar) {
                    nps.this.fs();
                    if (zmnVar.zn()) {
                        return;
                    }
                    olo oloVar = new olo();
                    oloVar.zmn(0);
                    if (nps.this.fs instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw) {
                        nps.this.zn.btk().hhw();
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.mw.hhw.zmn) nps.this.zn).tf().zmn(oloVar);
                    }
                    nps.this.zn.btk().bvs();
                    cn fs = zmnVar.fs();
                    if (fs == null) {
                        return;
                    }
                    fs.zmn(nps.this.fs, rtVar);
                    zmnVar.zmn(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.fs.nps
                public void zmn(int i, String str) {
                    nps.this.zmn(zmnVar, i, str);
                }
            });
        }
        return true;
    }

    private class zmn implements Runnable {
        iv.zmn zmn;
        private int zn;

        zmn(int i, iv.zmn zmnVar) {
            this.zn = i;
            this.zmn = zmnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.zn == 1) {
                nps.this.fs.zmn(true);
                nps.this.zmn(this.zmn, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + nps.this.zn.hhw());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(iv.zmn zmnVar, int i, String str) {
        cn fs;
        if (zmnVar.zn() || this.btk.get()) {
            return;
        }
        fs();
        olo oloVar = new olo();
        oloVar.zmn(i);
        oloVar.zmn(str);
        ((com.bytedance.sdk.openadsdk.core.mw.hhw.zmn) this.zn).tf().zmn(oloVar);
        if (zmnVar.fs(this)) {
            zmnVar.zmn(this);
        } else {
            if (zmnVar.zn() || (fs = zmnVar.fs()) == null) {
                return;
            }
            zmnVar.zmn(true);
            fs.a_(i);
        }
        this.btk.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        try {
            ScheduledFuture<?> scheduledFuture = this.fb;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.fb.cancel(false);
            this.fb = null;
        } catch (Throwable th) {
            iqz.zn("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }
}
