package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ll0 implements Closeable {
    public static final fl0 Companion = new fl0();
    public static final t42 tmVwIGCQF4zR;
    public final zd2 BRwzKIf41E4i;
    public final kl0 BjEWd04qc7Mw;
    public long EcgxDIVH5in8;
    public t42 IAToe7bXGz4N;
    public final LinkedHashMap OPXfSBeufaJ8 = new LinkedHashMap();
    public final zd2 QrzZRwfaDlRX;
    public long RfyTYNmI9Srp;
    public long S2OOm9zPNm0h;
    public long S9EYkSpbGuxq;
    public long VhhvGxCb8gfr;
    public final ib0 XL4ISE6Oc65B;
    public final x80 ZbWwgt3aGe7A;
    public long aF05bpZJlKEP;
    public boolean cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public final hs2 e6tOsSdd2EFb;
    public final zd2 gPXPFXrUH4XX;
    public long jyegZNwi31qc;
    public final m9 kpCQ9veP6n3I;
    public final LinkedHashSet ozEBbv0hFTAB;
    public final t42 pnx5pC0XzaCw;
    public final be2 r3s1LDPKFs1S;
    public final xl0 rZjpSjn4zoMv;
    public final il0 rtx2ld2ELZv4;
    public final String wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    static {
        t42 t42Var = new t42();
        t42Var.lS5Rgt96tfkO(4, 65535);
        t42Var.lS5Rgt96tfkO(5, 16384);
        tmVwIGCQF4zR = t42Var;
    }

    public ll0(el0 el0Var) {
        this.rtx2ld2ELZv4 = el0Var.Y1f8riQaR6yg;
        String str = el0Var.TSizfFm2Yiuu;
        if (str == null) {
            cs0.tmVwIGCQF4zR("connectionName");
            throw null;
        }
        this.wdg6QnbFHrFF = str;
        this.x50lh2ztY7Y5 = 3;
        be2 be2Var = el0Var.PxuCJdSBwIXG;
        this.r3s1LDPKFs1S = be2Var;
        zd2 Y1f8riQaR6yg = be2Var.Y1f8riQaR6yg();
        this.QrzZRwfaDlRX = Y1f8riQaR6yg;
        this.gPXPFXrUH4XX = be2Var.Y1f8riQaR6yg();
        this.BRwzKIf41E4i = be2Var.Y1f8riQaR6yg();
        this.XL4ISE6Oc65B = el0Var.e9gEMXR7LXtO;
        this.ZbWwgt3aGe7A = el0Var.RAsUl2FVSrh6;
        t42 t42Var = new t42();
        t42Var.lS5Rgt96tfkO(4, 16777216);
        this.pnx5pC0XzaCw = t42Var;
        this.IAToe7bXGz4N = tmVwIGCQF4zR;
        int i = 0;
        this.e6tOsSdd2EFb = new hs2(0);
        this.aF05bpZJlKEP = r2.PxuCJdSBwIXG();
        m9 m9Var = el0Var.lS5Rgt96tfkO;
        if (m9Var == null) {
            cs0.tmVwIGCQF4zR("socket");
            throw null;
        }
        this.kpCQ9veP6n3I = m9Var;
        this.rZjpSjn4zoMv = new xl0((ds1) m9Var.dgRBjINgWbAK);
        this.BjEWd04qc7Mw = new kl0(this, new ql0((es1) m9Var.wdg6QnbFHrFF));
        this.ozEBbv0hFTAB = new LinkedHashSet();
        int i2 = el0Var.a92UlCVFR9N8;
        if (i2 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            Y1f8riQaR6yg.TSizfFm2Yiuu(new yd2(str.concat(" ping"), new al0(this, nanos, i)), nanos);
        }
    }

    public final vl0 OPXfSBeufaJ8(int i) {
        vl0 vl0Var;
        synchronized (this) {
            vl0Var = (vl0) this.OPXfSBeufaJ8.remove(Integer.valueOf(i));
            notifyAll();
        }
        return vl0Var;
    }

    public final void RfyTYNmI9Srp(int i, o60 o60Var) {
        zd2.lS5Rgt96tfkO(this.QrzZRwfaDlRX, this.wdg6QnbFHrFF + '[' + i + "] writeSynReset", 0L, new i60(this, i, o60Var), 6);
    }

    public final void S2OOm9zPNm0h(final int i, final long j) {
        zd2.lS5Rgt96tfkO(this.QrzZRwfaDlRX, this.wdg6QnbFHrFF + '[' + i + "] windowUpdate", 0L, new ae0() { // from class: bl0
            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                ll0 ll0Var = ll0.this;
                try {
                    ll0Var.rZjpSjn4zoMv.S2OOm9zPNm0h(i, j);
                } catch (IOException e) {
                    o60 o60Var = o60.wdg6QnbFHrFF;
                    ll0Var.lS5Rgt96tfkO(o60Var, o60Var, e);
                }
                return no2.PxuCJdSBwIXG;
            }
        }, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.rZjpSjn4zoMv.wdg6QnbFHrFF);
        r6 = r2;
        r8.jyegZNwi31qc += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void XL4ISE6Oc65B(int i, boolean z, yf yfVar, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.rZjpSjn4zoMv.a92UlCVFR9N8(z, i, yfVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.jyegZNwi31qc;
                            long j4 = this.aF05bpZJlKEP;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.OPXfSBeufaJ8.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.rZjpSjn4zoMv.a92UlCVFR9N8(z && j == 0, i, yfVar, min);
        }
    }

    public final vl0 a92UlCVFR9N8(int i) {
        vl0 vl0Var;
        synchronized (this) {
            vl0Var = (vl0) this.OPXfSBeufaJ8.get(Integer.valueOf(i));
        }
        return vl0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lS5Rgt96tfkO(o60.OPXfSBeufaJ8, o60.r3s1LDPKFs1S, null);
    }

    public final void cpQdD2nAriOS(o60 o60Var) {
        synchronized (this.rZjpSjn4zoMv) {
            synchronized (this) {
                if (this.cpQdD2nAriOS) {
                    return;
                }
                this.cpQdD2nAriOS = true;
                this.rZjpSjn4zoMv.cpQdD2nAriOS(this.dgRBjINgWbAK, o60Var, kv2.PxuCJdSBwIXG);
            }
        }
    }

    public final void flush() {
        this.rZjpSjn4zoMv.flush();
    }

    public final void gPXPFXrUH4XX(long j) {
        synchronized (this) {
            try {
                hs2.lS5Rgt96tfkO(this.e6tOsSdd2EFb, j, 0L, 2);
                long PxuCJdSBwIXG = this.e6tOsSdd2EFb.PxuCJdSBwIXG();
                if (PxuCJdSBwIXG >= this.pnx5pC0XzaCw.PxuCJdSBwIXG() / 2) {
                    S2OOm9zPNm0h(0, PxuCJdSBwIXG);
                    hs2.lS5Rgt96tfkO(this.e6tOsSdd2EFb, 0L, PxuCJdSBwIXG, 1);
                }
                x80 x80Var = this.ZbWwgt3aGe7A;
                hs2 hs2Var = this.e6tOsSdd2EFb;
                x80Var.getClass();
                hs2Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void lS5Rgt96tfkO(o60 o60Var, o60 o60Var2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        try {
            cpQdD2nAriOS(o60Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.OPXfSBeufaJ8.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.OPXfSBeufaJ8.values().toArray(new vl0[0]);
                this.OPXfSBeufaJ8.clear();
            }
        }
        vl0[] vl0VarArr = (vl0[]) objArr;
        if (vl0VarArr != null) {
            for (vl0 vl0Var : vl0VarArr) {
                try {
                    vl0Var.TSizfFm2Yiuu(o60Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.rZjpSjn4zoMv.close();
        } catch (IOException unused3) {
        }
        try {
            this.kpCQ9veP6n3I.cancel();
        } catch (IOException unused4) {
        }
        this.QrzZRwfaDlRX.e9gEMXR7LXtO();
        this.gPXPFXrUH4XX.e9gEMXR7LXtO();
        this.BRwzKIf41E4i.e9gEMXR7LXtO();
    }
}
