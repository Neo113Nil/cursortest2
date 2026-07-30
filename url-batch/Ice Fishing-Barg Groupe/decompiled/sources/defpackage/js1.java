package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class js1 implements Cloneable {
    private static final hs1 Companion = new hs1();
    public boolean BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public final CopyOnWriteArrayList IAToe7bXGz4N;
    public final xb OPXfSBeufaJ8;
    public e70 QrzZRwfaDlRX;
    public boolean RfyTYNmI9Srp;
    public boolean S2OOm9zPNm0h;
    public boolean S9EYkSpbGuxq;
    public boolean VhhvGxCb8gfr;
    public jv XL4ISE6Oc65B;
    public volatile boolean ZbWwgt3aGe7A;
    public final AtomicBoolean cpQdD2nAriOS;
    public volatile s60 dgRBjINgWbAK;
    public ls1 gPXPFXrUH4XX;
    public volatile jv pnx5pC0XzaCw;
    public Object r3s1LDPKFs1S;
    public final if1 rtx2ld2ELZv4;
    public final os1 wdg6QnbFHrFF;
    public final is1 x50lh2ztY7Y5;

    static {
        AtomicReferenceFieldUpdater.newUpdater(js1.class, s60.class, "dgRBjINgWbAK");
    }

    public js1(if1 if1Var, xb xbVar) {
        this.rtx2ld2ELZv4 = if1Var;
        this.OPXfSBeufaJ8 = xbVar;
        this.wdg6QnbFHrFF = (os1) if1Var.kpCQ9veP6n3I.OPXfSBeufaJ8;
        if1Var.Y1f8riQaR6yg.getClass();
        this.dgRBjINgWbAK = s60.PxuCJdSBwIXG;
        is1 is1Var = new is1(this);
        is1Var.RAsUl2FVSrh6(0L, TimeUnit.MILLISECONDS);
        this.x50lh2ztY7Y5 = is1Var;
        this.cpQdD2nAriOS = new AtomicBoolean();
        this.S2OOm9zPNm0h = true;
        this.IAToe7bXGz4N = new CopyOnWriteArrayList();
        new AtomicReference((ih0) xbVar.e9gEMXR7LXtO);
    }

    public static final String PxuCJdSBwIXG(js1 js1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(js1Var.ZbWwgt3aGe7A ? "canceled " : "");
        sb.append("web socket");
        sb.append(" to ");
        sb.append(((gm0) js1Var.OPXfSBeufaJ8.lS5Rgt96tfkO).a92UlCVFR9N8());
        return sb.toString();
    }

    public final Socket OPXfSBeufaJ8() {
        ls1 ls1Var = this.gPXPFXrUH4XX;
        ls1Var.getClass();
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        ArrayList arrayList = ls1Var.BRwzKIf41E4i;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (cs0.wdg6QnbFHrFF(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            u9.rtx2ld2ELZv4("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.gPXPFXrUH4XX = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        ls1Var.XL4ISE6Oc65B = System.nanoTime();
        os1 os1Var = this.wdg6QnbFHrFF;
        ConcurrentLinkedQueue concurrentLinkedQueue = os1Var.Y1f8riQaR6yg;
        TimeZone timeZone2 = mv2.PxuCJdSBwIXG;
        if (!ls1Var.dgRBjINgWbAK) {
            os1Var.lS5Rgt96tfkO.TSizfFm2Yiuu(os1Var.TSizfFm2Yiuu, 0L);
            return null;
        }
        ls1Var.dgRBjINgWbAK = true;
        concurrentLinkedQueue.remove(ls1Var);
        if (concurrentLinkedQueue.isEmpty()) {
            zd2 zd2Var = os1Var.lS5Rgt96tfkO;
            synchronized (zd2Var.PxuCJdSBwIXG) {
                if (zd2Var.PxuCJdSBwIXG()) {
                    zd2Var.PxuCJdSBwIXG.TSizfFm2Yiuu(zd2Var);
                }
            }
        }
        return ls1Var.e9gEMXR7LXtO;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException RAsUl2FVSrh6(jv jvVar, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        jvVar.getClass();
        if (jvVar.equals(this.pnx5pC0XzaCw)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.RfyTYNmI9Srp) {
                        }
                        if (z) {
                            this.RfyTYNmI9Srp = false;
                        }
                        if (z2) {
                            this.EcgxDIVH5in8 = false;
                        }
                        if (z4) {
                            this.S9EYkSpbGuxq = false;
                        }
                        if (z3) {
                            this.VhhvGxCb8gfr = false;
                        }
                        z7 = (!this.RfyTYNmI9Srp || this.EcgxDIVH5in8 || this.S9EYkSpbGuxq || this.VhhvGxCb8gfr) ? false : true;
                        if (z7) {
                            if (!this.S2OOm9zPNm0h) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.EcgxDIVH5in8) && ((!z4 || !this.S9EYkSpbGuxq) && (!z3 || !this.VhhvGxCb8gfr))) {
                    z6 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (!this.RfyTYNmI9Srp) {
                }
                if (z7) {
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
            }
            if (z5) {
                this.pnx5pC0XzaCw = null;
                ls1 ls1Var = this.gPXPFXrUH4XX;
                if (ls1Var != null) {
                    synchronized (ls1Var) {
                        ls1Var.r3s1LDPKFs1S++;
                    }
                }
            }
            if (z6) {
                return TSizfFm2Yiuu(iOException);
            }
        }
        return iOException;
    }

    public final IOException TSizfFm2Yiuu(IOException iOException) {
        IOException iOException2;
        Socket OPXfSBeufaJ8;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        ls1 ls1Var = this.gPXPFXrUH4XX;
        if (ls1Var != null) {
            synchronized (ls1Var) {
                OPXfSBeufaJ8 = OPXfSBeufaJ8();
            }
            if (this.gPXPFXrUH4XX == null) {
                if (OPXfSBeufaJ8 != null) {
                    mv2.TSizfFm2Yiuu(OPXfSBeufaJ8);
                }
                this.dgRBjINgWbAK.getClass();
            } else if (OPXfSBeufaJ8 != null) {
                u9.rtx2ld2ELZv4("Check failed.");
                return null;
            }
        }
        if (!this.BRwzKIf41E4i && this.x50lh2ztY7Y5.dgRBjINgWbAK()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        s60 s60Var = this.dgRBjINgWbAK;
        if (iOException == null) {
            s60Var.getClass();
            return iOException2;
        }
        iOException2.getClass();
        s60Var.getClass();
        return iOException2;
    }

    public final void Y1f8riQaR6yg() {
        if (this.ZbWwgt3aGe7A) {
            return;
        }
        this.ZbWwgt3aGe7A = true;
        jv jvVar = this.pnx5pC0XzaCw;
        if (jvVar != null) {
            ((d70) jvVar.Y1f8riQaR6yg).cancel();
        }
        Iterator it = this.IAToe7bXGz4N.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((vx1) it.next()).cancel();
        }
        this.dgRBjINgWbAK.getClass();
    }

    public final nv1 a92UlCVFR9N8() {
        ArrayList arrayList = new ArrayList();
        el.MBpAROcyNHKN(this.rtx2ld2ELZv4.lS5Rgt96tfkO, arrayList);
        arrayList.add(new bw1());
        arrayList.add(new ph(2));
        arrayList.add(new hh());
        arrayList.add(ph.TSizfFm2Yiuu);
        arrayList.add(ph.lS5Rgt96tfkO);
        xb xbVar = this.OPXfSBeufaJ8;
        if1 if1Var = this.rtx2ld2ELZv4;
        ps1 ps1Var = new ps1(this, arrayList, 0, null, xbVar, if1Var.VhhvGxCb8gfr, if1Var.S2OOm9zPNm0h, if1Var.ZbWwgt3aGe7A, if1Var.RAsUl2FVSrh6, if1Var.EcgxDIVH5in8, if1Var.kpCQ9veP6n3I, if1Var.wdg6QnbFHrFF, if1Var.dgRBjINgWbAK, if1Var.RfyTYNmI9Srp, if1Var.cpQdD2nAriOS, if1Var.x50lh2ztY7Y5, if1Var.e9gEMXR7LXtO, if1Var.r3s1LDPKFs1S, if1Var.QrzZRwfaDlRX, if1Var.gPXPFXrUH4XX, if1Var.S9EYkSpbGuxq);
        boolean z = false;
        try {
            try {
                nv1 lS5Rgt96tfkO = ps1Var.lS5Rgt96tfkO(this.OPXfSBeufaJ8);
                if (this.ZbWwgt3aGe7A) {
                    kv2.PxuCJdSBwIXG(lS5Rgt96tfkO);
                    throw new IOException("Canceled");
                }
                rtx2ld2ELZv4(null);
                return lS5Rgt96tfkO;
            } catch (IOException e) {
                z = true;
                IOException rtx2ld2ELZv4 = rtx2ld2ELZv4(e);
                rtx2ld2ELZv4.getClass();
                throw rtx2ld2ELZv4;
            }
        } catch (Throwable th) {
            if (!z) {
                rtx2ld2ELZv4(null);
            }
            throw th;
        }
    }

    public final Object clone() {
        return new js1(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8);
    }

    public final void e9gEMXR7LXtO(boolean z) {
        jv jvVar;
        synchronized (this) {
            if (!this.S2OOm9zPNm0h) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (jvVar = this.pnx5pC0XzaCw) != null) {
            ((d70) jvVar.Y1f8riQaR6yg).cancel();
            ((js1) jvVar.lS5Rgt96tfkO).RAsUl2FVSrh6(jvVar, true, true, true, true, null);
        }
        this.XL4ISE6Oc65B = null;
    }

    public final void lS5Rgt96tfkO(ls1 ls1Var) {
        ls1Var.getClass();
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        if (this.gPXPFXrUH4XX != null) {
            u9.rtx2ld2ELZv4("Check failed.");
        } else {
            this.gPXPFXrUH4XX = ls1Var;
            ls1Var.BRwzKIf41E4i.add(new gs1(this, this.r3s1LDPKFs1S));
        }
    }

    public final IOException rtx2ld2ELZv4(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.S2OOm9zPNm0h) {
                this.S2OOm9zPNm0h = false;
                if (!this.RfyTYNmI9Srp && !this.EcgxDIVH5in8 && !this.S9EYkSpbGuxq) {
                    if (!this.VhhvGxCb8gfr) {
                        z = true;
                    }
                }
            }
        }
        return z ? TSizfFm2Yiuu(iOException) : iOException;
    }
}
