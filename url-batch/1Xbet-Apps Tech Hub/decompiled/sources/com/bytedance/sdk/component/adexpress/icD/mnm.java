package com.bytedance.sdk.component.adexpress.icD;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.icD.Wyp;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewRenderInterceptor.java */
/* loaded from: classes.dex */
public class mnm implements Wyp {
    private Ju Jd;
    private ScheduledFuture<?> NB;
    private com.bytedance.sdk.component.adexpress.NB.pvs icD;
    private Context pvs;
    private AtomicBoolean sUS = new AtomicBoolean(false);
    private so vG;

    public mnm(Context context, Ju ju, com.bytedance.sdk.component.adexpress.NB.pvs pvsVar, so soVar) {
        this.pvs = context;
        this.Jd = ju;
        this.vG = soVar;
        this.icD = pvsVar;
        pvsVar.pvs(this.vG);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public boolean pvs(final Wyp.pvs pvsVar) {
        int sUS = this.Jd.sUS();
        if (sUS < 0) {
            pvs(pvsVar, 107, "time is ".concat(String.valueOf(sUS)));
        } else {
            this.NB = com.bytedance.sdk.component.adexpress.Jd.vG.pvs(new pvs(1, pvsVar), sUS, TimeUnit.MILLISECONDS);
            this.icD.pvs(new yiw() { // from class: com.bytedance.sdk.component.adexpress.icD.mnm.1
                @Override // com.bytedance.sdk.component.adexpress.icD.yiw
                public void pvs(View view, IP ip) {
                    bNS icD;
                    mnm.this.vG();
                    if (pvsVar.vG() || (icD = pvsVar.icD()) == null) {
                        return;
                    }
                    icD.pvs(mnm.this.icD, ip);
                    pvsVar.pvs(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.icD.yiw
                public void pvs(int i, String str) {
                    mnm.this.pvs(pvsVar, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public void pvs() {
        this.icD.Jd();
        vG();
    }

    public com.bytedance.sdk.component.adexpress.NB.pvs icD() {
        return this.icD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG() {
        try {
            ScheduledFuture<?> scheduledFuture = this.NB;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.NB.cancel(false);
            this.NB = null;
        } catch (Throwable unused) {
        }
    }

    /* compiled from: WebViewRenderInterceptor.java */
    private class pvs implements Runnable {
        Wyp.pvs pvs;
        private int vG;

        public pvs(int i, Wyp.pvs pvsVar) {
            this.vG = i;
            this.pvs = pvsVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.vG == 1) {
                mnm.this.icD.pvs(true);
                mnm.this.pvs(this.pvs, 107, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(Wyp.pvs pvsVar, int i, String str) {
        bNS icD;
        if (pvsVar.vG() || this.sUS.get()) {
            return;
        }
        vG();
        this.Jd.NB().pvs(i, str);
        if (pvsVar.icD(this)) {
            pvsVar.pvs(this);
        } else {
            if (pvsVar.vG() || (icD = pvsVar.icD()) == null) {
                return;
            }
            pvsVar.pvs(true);
            icD.a_(i);
        }
        this.sUS.getAndSet(true);
    }
}
