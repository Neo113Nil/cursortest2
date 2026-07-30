package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tl0 implements o82 {
    public boolean OPXfSBeufaJ8;
    public final /* synthetic */ vl0 cpQdD2nAriOS;
    public final long rtx2ld2ELZv4;
    public boolean x50lh2ztY7Y5;
    public final yf wdg6QnbFHrFF = new yf();
    public final yf dgRBjINgWbAK = new yf();

    public tl0(vl0 vl0Var, long j, boolean z) {
        this.cpQdD2nAriOS = vl0Var;
        this.rtx2ld2ELZv4 = j;
        this.OPXfSBeufaJ8 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:12:0x001c, B:32:0x00b9, B:63:0x00df, B:64:0x00e4, B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:4:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:13:0x0025, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[Catch: all -> 0x0022, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:12:0x001c, B:32:0x00b9, B:63:0x00df, B:64:0x00e4, B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:4:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    @Override // defpackage.o82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long RAsUl2FVSrh6(long j, yf yfVar) {
        boolean z;
        boolean z2;
        Throwable th;
        long j2;
        long j3;
        do {
            vl0 vl0Var = this.cpQdD2nAriOS;
            synchronized (vl0Var) {
                vl0Var.OPXfSBeufaJ8.getClass();
                sl0 sl0Var = vl0Var.gPXPFXrUH4XX;
                z = true;
                try {
                    if (!sl0Var.wdg6QnbFHrFF && !sl0Var.rtx2ld2ELZv4) {
                        z2 = false;
                        if (z2) {
                            vl0Var.BRwzKIf41E4i.wdg6QnbFHrFF();
                        }
                        if (vl0Var.a92UlCVFR9N8() != null || this.OPXfSBeufaJ8) {
                            th = null;
                        } else {
                            th = vl0Var.EcgxDIVH5in8;
                            if (th == null) {
                                o60 a92UlCVFR9N8 = vl0Var.a92UlCVFR9N8();
                                a92UlCVFR9N8.getClass();
                                th = new aa2(a92UlCVFR9N8);
                            }
                        }
                        if (!this.x50lh2ztY7Y5) {
                            throw new IOException("stream closed");
                        }
                        yf yfVar2 = this.dgRBjINgWbAK;
                        long j4 = yfVar2.OPXfSBeufaJ8;
                        if (j4 > 0) {
                            j3 = yfVar2.RAsUl2FVSrh6(Math.min(8192L, j4), yfVar);
                            hs2.lS5Rgt96tfkO(vl0Var.wdg6QnbFHrFF, j3, 0L, 2);
                            long PxuCJdSBwIXG = vl0Var.wdg6QnbFHrFF.PxuCJdSBwIXG();
                            if (th == null) {
                                j2 = -1;
                                if (PxuCJdSBwIXG >= vl0Var.OPXfSBeufaJ8.pnx5pC0XzaCw.PxuCJdSBwIXG() / 2) {
                                    vl0Var.OPXfSBeufaJ8.S2OOm9zPNm0h(vl0Var.rtx2ld2ELZv4, PxuCJdSBwIXG);
                                    hs2.lS5Rgt96tfkO(vl0Var.wdg6QnbFHrFF, 0L, PxuCJdSBwIXG, 1);
                                }
                            } else {
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                            if (this.OPXfSBeufaJ8 || th != null) {
                                j3 = -1;
                            } else {
                                try {
                                    vl0Var.wait();
                                    j3 = -1;
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                        }
                        z = false;
                    }
                    if (vl0Var.a92UlCVFR9N8() != null) {
                    }
                    th = null;
                    if (!this.x50lh2ztY7Y5) {
                    }
                } finally {
                    if (z2) {
                        vl0Var.BRwzKIf41E4i.r3s1LDPKFs1S();
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
            this.cpQdD2nAriOS.OPXfSBeufaJ8.ZbWwgt3aGe7A.getClass();
        } while (z);
        if (j3 != j2) {
            return j3;
        }
        if (th == null) {
            return j2;
        }
        throw th;
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.cpQdD2nAriOS.BRwzKIf41E4i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        vl0 vl0Var = this.cpQdD2nAriOS;
        synchronized (vl0Var) {
            this.x50lh2ztY7Y5 = true;
            yf yfVar = this.dgRBjINgWbAK;
            j = yfVar.OPXfSBeufaJ8;
            yfVar.skip(j);
            vl0Var.notifyAll();
        }
        if (j > 0) {
            vl0 vl0Var2 = this.cpQdD2nAriOS;
            TimeZone timeZone = mv2.PxuCJdSBwIXG;
            vl0Var2.OPXfSBeufaJ8.gPXPFXrUH4XX(j);
        }
        this.cpQdD2nAriOS.PxuCJdSBwIXG();
    }
}
