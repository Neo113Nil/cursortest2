package com.bytedance.sdk.component.yiw.Jd;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class vG {
    private icD icD;
    private pvs pvs;

    /* compiled from: Logger.java */
    public interface icD {
    }

    /* compiled from: Logger.java */
    public enum pvs {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    private vG() {
        this.pvs = pvs.OFF;
        this.icD = new com.bytedance.sdk.component.yiw.Jd.icD();
    }

    /* compiled from: Logger.java */
    /* renamed from: com.bytedance.sdk.component.yiw.Jd.vG$vG, reason: collision with other inner class name */
    private static class C0059vG {
        private static final vG pvs = new vG();
    }

    public static void pvs(pvs pvsVar) {
        synchronized (vG.class) {
            C0059vG.pvs.pvs = pvsVar;
        }
    }
}
