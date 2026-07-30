package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bv1 extends Thread {
    public final int rtx2ld2ELZv4;

    public bv1(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.rtx2ld2ELZv4 = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.rtx2ld2ELZv4);
        super.run();
    }
}
