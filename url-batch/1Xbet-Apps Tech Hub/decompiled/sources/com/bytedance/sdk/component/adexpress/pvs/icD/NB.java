package com.bytedance.sdk.component.adexpress.pvs.icD;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.pvs.vG.pvs;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.cR;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: TemplateManager.java */
/* loaded from: classes.dex */
public class NB extends vG {
    private static volatile NB icD;
    private static File pvs;
    private AtomicBoolean vG = new AtomicBoolean(true);
    private AtomicBoolean Jd = new AtomicBoolean(false);
    private boolean NB = false;
    private AtomicBoolean sUS = new AtomicBoolean(false);
    private AtomicInteger yiw = new AtomicInteger(0);
    private AtomicLong so = new AtomicLong();

    public static NB icD() {
        if (icD == null) {
            synchronized (NB.class) {
                if (icD == null) {
                    icD = new NB();
                }
            }
        }
        return icD;
    }

    private NB() {
        Wyp();
    }

    public void vG() {
        Wyp();
    }

    private void Wyp() {
        com.bytedance.sdk.component.adexpress.Jd.vG.icD(new com.bytedance.sdk.component.so.so("init") { // from class: com.bytedance.sdk.component.adexpress.pvs.icD.NB.1
            @Override // java.lang.Runnable
            public void run() {
                so.pvs();
                NB.this.vG.set(false);
                NB.this.Jd();
                NB.this.yiw();
                if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() == null || !cR.pvs(com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().icD())) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().vG().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.pvs.icD.NB.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() != null) {
                            com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().Jd();
                        }
                    }
                });
            }
        }, 10);
    }

    public void Jd() {
        com.bytedance.sdk.component.adexpress.pvs.vG.pvs icD2 = so.icD();
        if (icD2 == null || !icD2.yiw()) {
            return;
        }
        boolean pvs2 = pvs(icD2);
        if (!pvs2) {
            so.Jd();
        }
        this.NB = pvs2;
    }

    public boolean pvs(com.bytedance.sdk.component.adexpress.pvs.vG.pvs pvsVar) {
        if (pvsVar == null) {
            return false;
        }
        return pvs(pvsVar.pvs()) || pvs(pvsVar.NB()) || pvs(pvsVar.sUS());
    }

    public boolean NB() {
        return this.NB;
    }

    public com.bytedance.sdk.component.adexpress.pvs.vG.pvs sUS() {
        return so.icD();
    }

    @Override // com.bytedance.sdk.component.adexpress.pvs.icD.vG
    public File pvs() {
        return so();
    }

    public void yiw() {
        pvs(false);
    }

    public void pvs(boolean z) {
        List<pvs.C0043pvs> list;
        boolean z2;
        if (this.vG.get()) {
            return;
        }
        try {
            if (this.Jd.get()) {
                if (z) {
                    this.yiw.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.Jd.set(true);
            com.bytedance.sdk.component.adexpress.pvs.vG.pvs NB = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().NB();
            com.bytedance.sdk.component.adexpress.pvs.vG.pvs icD2 = so.icD();
            if (NB != null && NB.yiw()) {
                if (!so.icD(NB)) {
                    this.Jd.set(false);
                    this.so.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() != null) {
                    com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().vG().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.pvs.icD.NB.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.NB.NB.pvs().icD();
                        }
                    });
                }
                so.pvs(NB);
                boolean pvs2 = (NB.NB() == null || TextUtils.isEmpty(NB.NB().pvs())) ? false : pvs(NB.NB().pvs());
                if (NB.pvs().size() != 0) {
                    list = pvs(NB, icD2);
                    z2 = list != null;
                } else {
                    list = null;
                    z2 = pvs2;
                }
                if (!pvs2) {
                    List<pvs.C0043pvs> icD3 = icD(NB, icD2);
                    if (list == null || icD3 == null) {
                        list = icD3;
                    } else {
                        list.addAll(icD3);
                    }
                    if (icD3 == null) {
                        z3 = false;
                    }
                    if (icD3 == null) {
                        this.Jd.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && pvs(NB)) {
                    so.pvs(NB);
                    so.vG();
                    icD(list);
                }
                Jd();
                this.Jd.set(false);
                this.so.set(System.currentTimeMillis());
                qh();
                return;
            }
            this.Jd.set(false);
            pvs(109);
        } catch (Throwable unused) {
        }
    }

    private void qh() {
        if (this.yiw.getAndSet(0) <= 0 || System.currentTimeMillis() - this.so.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        yiw();
    }

    public static File so() {
        if (pvs == null) {
            try {
                File file = new File(new File(Jd.pvs(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                pvs = file;
            } catch (Throwable th) {
                Ju.pvs("TemplateManager", "getTemplateDir error", th);
            }
        }
        return pvs;
    }

    public void icD(boolean z) {
        this.sUS.set(z);
    }

    public void Mxy() {
        this.sUS.set(true);
        this.NB = false;
        this.Jd.set(false);
    }
}
