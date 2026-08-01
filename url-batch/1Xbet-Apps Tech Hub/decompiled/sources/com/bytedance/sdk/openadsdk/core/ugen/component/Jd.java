package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.bNS;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.adexpress.icD.Wyp;
import com.bytedance.sdk.component.adexpress.icD.so;
import com.bytedance.sdk.component.adexpress.icD.yiw;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* compiled from: UGenRenderInterceptor.java */
/* loaded from: classes2.dex */
public class Jd implements Wyp {
    private ScheduledFuture<?> Jd;
    private AtomicBoolean NB = new AtomicBoolean(false);
    private com.bytedance.sdk.openadsdk.core.ugen.vG.vG icD;
    private Context pvs;
    private Ju vG;

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public void pvs() {
    }

    public Jd(Context context, com.bytedance.sdk.openadsdk.core.ugen.vG.vG vGVar, so soVar, Ju ju) {
        this.pvs = context;
        this.icD = vGVar;
        this.vG = ju;
        this.icD.pvs(soVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Wyp
    public boolean pvs(final Wyp.pvs pvsVar) {
        int sUS = this.vG.sUS();
        if (sUS < 0) {
            pvs(pvsVar, Opcodes.L2F, "time is ".concat(String.valueOf(sUS)));
        } else {
            this.Jd = ae.pvs().schedule(new pvs(1, pvsVar), sUS, TimeUnit.MILLISECONDS);
            this.icD.pvs(new yiw() { // from class: com.bytedance.sdk.openadsdk.core.ugen.component.Jd.1
                @Override // com.bytedance.sdk.component.adexpress.icD.yiw
                public void pvs(View view, IP ip) {
                    Jd.this.icD();
                    if (pvsVar.vG()) {
                        return;
                    }
                    bNS bns = new bNS();
                    bns.pvs(0);
                    ((com.bytedance.sdk.openadsdk.core.ugen.vG.pvs) Jd.this.vG).ae().pvs(bns);
                    Jd.this.vG.NB().Wyp();
                    com.bytedance.sdk.component.adexpress.icD.bNS icD = pvsVar.icD();
                    if (icD == null) {
                        return;
                    }
                    icD.pvs(Jd.this.icD, ip);
                    pvsVar.pvs(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.icD.yiw
                public void pvs(int i, String str) {
                    Jd.this.pvs(pvsVar, i, str);
                }
            });
        }
        return true;
    }

    /* compiled from: UGenRenderInterceptor.java */
    private class pvs implements Runnable {
        Wyp.pvs pvs;
        private int vG;

        pvs(int i, Wyp.pvs pvsVar) {
            this.vG = i;
            this.pvs = pvsVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.vG == 1) {
                Jd.this.icD.pvs(true);
                Jd.this.pvs(this.pvs, Opcodes.L2F, "real time out" + Jd.this.vG.sUS());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(Wyp.pvs pvsVar, int i, String str) {
        com.bytedance.sdk.component.adexpress.icD.bNS icD;
        if (pvsVar.vG() || this.NB.get()) {
            return;
        }
        icD();
        bNS bns = new bNS();
        bns.pvs(i);
        bns.pvs(str);
        ((com.bytedance.sdk.openadsdk.core.ugen.vG.pvs) this.vG).ae().pvs(bns);
        if (pvsVar.icD(this)) {
            pvsVar.pvs(this);
        } else {
            if (pvsVar.vG() || (icD = pvsVar.icD()) == null) {
                return;
            }
            pvsVar.pvs(true);
            icD.a_(i);
        }
        this.NB.getAndSet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        try {
            ScheduledFuture<?> scheduledFuture = this.Jd;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Jd.cancel(false);
            this.Jd = null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }
}
