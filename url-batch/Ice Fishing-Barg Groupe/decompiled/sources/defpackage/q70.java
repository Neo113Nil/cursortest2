package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q70 implements e70 {
    public final be2 OPXfSBeufaJ8;
    public final CopyOnWriteArrayList dgRBjINgWbAK;
    public final rs1 rtx2ld2ELZv4;
    public long wdg6QnbFHrFF;
    public final LinkedBlockingDeque x50lh2ztY7Y5;

    public q70(rs1 rs1Var, be2 be2Var) {
        be2Var.getClass();
        this.rtx2ld2ELZv4 = rs1Var;
        this.OPXfSBeufaJ8 = be2Var;
        this.wdg6QnbFHrFF = Long.MIN_VALUE;
        this.dgRBjINgWbAK = new CopyOnWriteArrayList();
        this.x50lh2ztY7Y5 = new LinkedBlockingDeque();
    }

    public final void PxuCJdSBwIXG() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.dgRBjINgWbAK;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            vx1 vx1Var = (vx1) it.next();
            vx1Var.cancel();
            vx1 PxuCJdSBwIXG = vx1Var.PxuCJdSBwIXG();
            if (PxuCJdSBwIXG != null) {
                this.rtx2ld2ELZv4.BRwzKIf41E4i.addLast(PxuCJdSBwIXG);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0002, B:5:0x000a, B:11:0x001d, B:13:0x0025, B:20:0x004e, B:64:0x005a, B:67:0x0065, B:25:0x006e, B:27:0x0074, B:31:0x007d, B:33:0x0088, B:34:0x008e, B:36:0x0092, B:41:0x0099, B:44:0x00a3, B:46:0x00a7, B:49:0x00ad, B:50:0x00b1, B:52:0x00b5, B:53:0x00b6, B:56:0x00ba, B:69:0x0042, B:71:0x00c3, B:72:0x00ca), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0002, B:5:0x000a, B:11:0x001d, B:13:0x0025, B:20:0x004e, B:64:0x005a, B:67:0x0065, B:25:0x006e, B:27:0x0074, B:31:0x007d, B:33:0x0088, B:34:0x008e, B:36:0x0092, B:41:0x0099, B:44:0x00a3, B:46:0x00a7, B:49:0x00ad, B:50:0x00b1, B:52:0x00b5, B:53:0x00b6, B:56:0x00ba, B:69:0x0042, B:71:0x00c3, B:72:0x00ca), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0002, B:5:0x000a, B:11:0x001d, B:13:0x0025, B:20:0x004e, B:64:0x005a, B:67:0x0065, B:25:0x006e, B:27:0x0074, B:31:0x007d, B:33:0x0088, B:34:0x008e, B:36:0x0092, B:41:0x0099, B:44:0x00a3, B:46:0x00a7, B:49:0x00ad, B:50:0x00b1, B:52:0x00b5, B:53:0x00b6, B:56:0x00ba, B:69:0x0042, B:71:0x00c3, B:72:0x00ca), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006e A[SYNTHETIC] */
    @Override // defpackage.e70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ls1 Y1f8riQaR6yg() {
        ux1 lS5Rgt96tfkO;
        long j;
        Throwable th;
        vx1 vx1Var;
        ux1 ux1Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.dgRBjINgWbAK.isEmpty() && !this.rtx2ld2ELZv4.PxuCJdSBwIXG(null)) {
                    PxuCJdSBwIXG();
                    iOException.getClass();
                    throw iOException;
                }
                if (this.rtx2ld2ELZv4.x50lh2ztY7Y5.ZbWwgt3aGe7A) {
                    throw new IOException("Canceled");
                }
                b42 b42Var = this.OPXfSBeufaJ8.PxuCJdSBwIXG;
                long nanoTime = System.nanoTime();
                long j2 = this.wdg6QnbFHrFF - nanoTime;
                if (!this.dgRBjINgWbAK.isEmpty() && j2 > 0) {
                    j = j2;
                    lS5Rgt96tfkO = null;
                    if (lS5Rgt96tfkO != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        CopyOnWriteArrayList copyOnWriteArrayList = this.dgRBjINgWbAK;
                        if (!copyOnWriteArrayList.isEmpty() && (ux1Var = (ux1) this.x50lh2ztY7Y5.poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(ux1Var.PxuCJdSBwIXG);
                            lS5Rgt96tfkO = ux1Var;
                            if (lS5Rgt96tfkO != null) {
                            }
                        }
                        lS5Rgt96tfkO = null;
                        if (lS5Rgt96tfkO != null) {
                        }
                    }
                    boolean z = false;
                    if (lS5Rgt96tfkO.lS5Rgt96tfkO != null && lS5Rgt96tfkO.TSizfFm2Yiuu == null) {
                        PxuCJdSBwIXG();
                        if (!lS5Rgt96tfkO.PxuCJdSBwIXG.e9gEMXR7LXtO()) {
                            lS5Rgt96tfkO = lS5Rgt96tfkO.PxuCJdSBwIXG.TSizfFm2Yiuu();
                        }
                        if (lS5Rgt96tfkO.lS5Rgt96tfkO == null && lS5Rgt96tfkO.TSizfFm2Yiuu == null) {
                            z = true;
                        }
                        if (z) {
                            return lS5Rgt96tfkO.PxuCJdSBwIXG.Y1f8riQaR6yg();
                        }
                    }
                    th = lS5Rgt96tfkO.TSizfFm2Yiuu;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            f2.RAsUl2FVSrh6(iOException, th);
                        }
                    }
                    vx1Var = lS5Rgt96tfkO.lS5Rgt96tfkO;
                    if (vx1Var == null) {
                        this.rtx2ld2ELZv4.BRwzKIf41E4i.addFirst(vx1Var);
                    }
                }
                lS5Rgt96tfkO = lS5Rgt96tfkO();
                j = 250000000;
                this.wdg6QnbFHrFF = nanoTime + 250000000;
                if (lS5Rgt96tfkO != null) {
                }
                boolean z2 = false;
                if (lS5Rgt96tfkO.lS5Rgt96tfkO != null && lS5Rgt96tfkO.TSizfFm2Yiuu == null) {
                }
                th = lS5Rgt96tfkO.TSizfFm2Yiuu;
                if (th != null) {
                }
                vx1Var = lS5Rgt96tfkO.lS5Rgt96tfkO;
                if (vx1Var == null) {
                }
            } finally {
                PxuCJdSBwIXG();
            }
        }
    }

    @Override // defpackage.e70
    public final rs1 e9gEMXR7LXtO() {
        return this.rtx2ld2ELZv4;
    }

    public final ux1 lS5Rgt96tfkO() {
        vx1 n70Var;
        rs1 rs1Var = this.rtx2ld2ELZv4;
        if (rs1Var.PxuCJdSBwIXG(null)) {
            try {
                n70Var = rs1Var.lS5Rgt96tfkO();
            } catch (Throwable th) {
                n70Var = new n70(th);
            }
            if (n70Var.e9gEMXR7LXtO()) {
                return new ux1(n70Var, (Throwable) null, 6);
            }
            if (n70Var instanceof n70) {
                return ((n70) n70Var).PxuCJdSBwIXG;
            }
            this.dgRBjINgWbAK.add(n70Var);
            this.OPXfSBeufaJ8.Y1f8riQaR6yg().TSizfFm2Yiuu(new p70(mv2.lS5Rgt96tfkO + " connect " + rs1Var.wdg6QnbFHrFF.rtx2ld2ELZv4.a92UlCVFR9N8(), n70Var, this), 0L);
        }
        return null;
    }
}
