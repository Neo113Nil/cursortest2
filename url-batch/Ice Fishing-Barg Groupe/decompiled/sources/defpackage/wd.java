package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wd extends EcgxDIVH5in8 {
    public final Thread cpQdD2nAriOS;
    public final t60 r3s1LDPKFs1S;

    public wd(hu huVar, Thread thread, t60 t60Var) {
        super(huVar, true);
        this.cpQdD2nAriOS = thread;
        this.r3s1LDPKFs1S = t60Var;
    }

    @Override // defpackage.et0
    public final void gPXPFXrUH4XX(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.cpQdD2nAriOS;
        if (cs0.wdg6QnbFHrFF(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
