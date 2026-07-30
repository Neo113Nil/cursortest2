package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vl0 implements g82 {
    public static final rl0 Companion = new rl0();
    public final ul0 BRwzKIf41E4i;
    public IOException EcgxDIVH5in8;
    public final ll0 OPXfSBeufaJ8;
    public final tl0 QrzZRwfaDlRX;
    public o60 RfyTYNmI9Srp;
    public final ul0 XL4ISE6Oc65B;
    public final ArrayDeque cpQdD2nAriOS;
    public long dgRBjINgWbAK;
    public final sl0 gPXPFXrUH4XX;
    public boolean r3s1LDPKFs1S;
    public final int rtx2ld2ELZv4;
    public final hs2 wdg6QnbFHrFF;
    public long x50lh2ztY7Y5;

    public vl0(int i, ll0 ll0Var, boolean z, boolean z2, hj0 hj0Var) {
        ll0Var.getClass();
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = ll0Var;
        this.wdg6QnbFHrFF = new hs2(i);
        this.x50lh2ztY7Y5 = ll0Var.IAToe7bXGz4N.PxuCJdSBwIXG();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.cpQdD2nAriOS = arrayDeque;
        this.QrzZRwfaDlRX = new tl0(this, ll0Var.pnx5pC0XzaCw.PxuCJdSBwIXG(), z2);
        this.gPXPFXrUH4XX = new sl0(this, z);
        this.BRwzKIf41E4i = new ul0(this);
        this.XL4ISE6Oc65B = new ul0(this);
        if (hj0Var == null) {
            if (RAsUl2FVSrh6()) {
                return;
            }
            u9.rtx2ld2ELZv4("remotely-initiated streams should have headers");
            throw null;
        }
        if (RAsUl2FVSrh6()) {
            u9.rtx2ld2ELZv4("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(hj0Var);
    }

    @Override // defpackage.g82
    public final y52 BRwzKIf41E4i() {
        return this.gPXPFXrUH4XX;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:13:0x002d, B:14:0x0031, B:22:0x0024), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OPXfSBeufaJ8(hj0 hj0Var, boolean z) {
        boolean rtx2ld2ELZv4;
        hj0Var.getClass();
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        synchronized (this) {
            try {
                if (this.r3s1LDPKFs1S && hj0Var.PxuCJdSBwIXG(":status") == null && hj0Var.PxuCJdSBwIXG(":method") == null) {
                    this.QrzZRwfaDlRX.getClass();
                    if (z) {
                        this.QrzZRwfaDlRX.OPXfSBeufaJ8 = true;
                    }
                    rtx2ld2ELZv4 = rtx2ld2ELZv4();
                    notifyAll();
                }
                this.r3s1LDPKFs1S = true;
                this.cpQdD2nAriOS.add(hj0Var);
                if (z) {
                }
                rtx2ld2ELZv4 = rtx2ld2ELZv4();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rtx2ld2ELZv4) {
            return;
        }
        this.OPXfSBeufaJ8.OPXfSBeufaJ8(this.rtx2ld2ELZv4);
    }

    public final void PxuCJdSBwIXG() {
        boolean z;
        boolean rtx2ld2ELZv4;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        synchronized (this) {
            try {
                tl0 tl0Var = this.QrzZRwfaDlRX;
                if (!tl0Var.OPXfSBeufaJ8 && tl0Var.x50lh2ztY7Y5) {
                    sl0 sl0Var = this.gPXPFXrUH4XX;
                    if (!sl0Var.rtx2ld2ELZv4) {
                        if (sl0Var.wdg6QnbFHrFF) {
                        }
                    }
                    z = true;
                    rtx2ld2ELZv4 = rtx2ld2ELZv4();
                }
                z = false;
                rtx2ld2ELZv4 = rtx2ld2ELZv4();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            TSizfFm2Yiuu(o60.r3s1LDPKFs1S, null);
        } else {
            if (rtx2ld2ELZv4) {
                return;
            }
            this.OPXfSBeufaJ8.OPXfSBeufaJ8(this.rtx2ld2ELZv4);
        }
    }

    public final boolean RAsUl2FVSrh6() {
        boolean z = (this.rtx2ld2ELZv4 & 1) == 1;
        this.OPXfSBeufaJ8.getClass();
        return true == z;
    }

    public final void TSizfFm2Yiuu(o60 o60Var, IOException iOException) {
        if (Y1f8riQaR6yg(o60Var, iOException)) {
            ll0 ll0Var = this.OPXfSBeufaJ8;
            ll0Var.getClass();
            ll0Var.rZjpSjn4zoMv.RfyTYNmI9Srp(this.rtx2ld2ELZv4, o60Var);
        }
    }

    @Override // defpackage.g82
    public final o82 XL4ISE6Oc65B() {
        return this.QrzZRwfaDlRX;
    }

    public final boolean Y1f8riQaR6yg(o60 o60Var, IOException iOException) {
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        synchronized (this) {
            if (a92UlCVFR9N8() != null) {
                return false;
            }
            this.RfyTYNmI9Srp = o60Var;
            this.EcgxDIVH5in8 = iOException;
            notifyAll();
            if (this.QrzZRwfaDlRX.OPXfSBeufaJ8) {
                if (this.gPXPFXrUH4XX.rtx2ld2ELZv4) {
                    return false;
                }
            }
            this.OPXfSBeufaJ8.OPXfSBeufaJ8(this.rtx2ld2ELZv4);
            return true;
        }
    }

    public final o60 a92UlCVFR9N8() {
        o60 o60Var;
        synchronized (this) {
            o60Var = this.RfyTYNmI9Srp;
        }
        return o60Var;
    }

    @Override // defpackage.g82
    public final void cancel() {
        e9gEMXR7LXtO(o60.r3s1LDPKFs1S);
    }

    public final void e9gEMXR7LXtO(o60 o60Var) {
        if (Y1f8riQaR6yg(o60Var, null)) {
            this.OPXfSBeufaJ8.RfyTYNmI9Srp(this.rtx2ld2ELZv4, o60Var);
        }
    }

    public final void lS5Rgt96tfkO() {
        sl0 sl0Var = this.gPXPFXrUH4XX;
        if (sl0Var.wdg6QnbFHrFF) {
            u9.S9EYkSpbGuxq("stream closed");
            return;
        }
        if (sl0Var.rtx2ld2ELZv4) {
            u9.S9EYkSpbGuxq("stream finished");
            return;
        }
        if (a92UlCVFR9N8() != null) {
            IOException iOException = this.EcgxDIVH5in8;
            if (iOException != null) {
                throw iOException;
            }
            o60 a92UlCVFR9N8 = a92UlCVFR9N8();
            a92UlCVFR9N8.getClass();
            throw new aa2(a92UlCVFR9N8);
        }
    }

    public final boolean rtx2ld2ELZv4() {
        synchronized (this) {
            try {
                if (a92UlCVFR9N8() != null) {
                    return false;
                }
                tl0 tl0Var = this.QrzZRwfaDlRX;
                if (!tl0Var.OPXfSBeufaJ8) {
                    if (tl0Var.x50lh2ztY7Y5) {
                    }
                    return true;
                }
                sl0 sl0Var = this.gPXPFXrUH4XX;
                if (sl0Var.rtx2ld2ELZv4 || sl0Var.wdg6QnbFHrFF) {
                    if (this.r3s1LDPKFs1S) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
