package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ql0 implements Closeable {
    public static final ol0 Companion = new ol0();
    public static final Logger dgRBjINgWbAK;
    public final pl0 OPXfSBeufaJ8;
    public final ig rtx2ld2ELZv4;
    public final qk0 wdg6QnbFHrFF;

    static {
        Logger logger = Logger.getLogger(zk0.class.getName());
        logger.getClass();
        dgRBjINgWbAK = logger;
    }

    public ql0(es1 es1Var) {
        es1Var.getClass();
        this.rtx2ld2ELZv4 = es1Var;
        pl0 pl0Var = new pl0(es1Var);
        this.OPXfSBeufaJ8 = pl0Var;
        this.wdg6QnbFHrFF = new qk0(pl0Var);
    }

    public final List OPXfSBeufaJ8(int i, int i2, int i3, int i4) {
        pl0 pl0Var = this.OPXfSBeufaJ8;
        pl0Var.dgRBjINgWbAK = i;
        pl0Var.x50lh2ztY7Y5 = i2;
        pl0Var.OPXfSBeufaJ8 = i3;
        pl0Var.wdg6QnbFHrFF = i4;
        qk0 qk0Var = this.wdg6QnbFHrFF;
        es1 es1Var = qk0Var.Y1f8riQaR6yg;
        while (!es1Var.lS5Rgt96tfkO()) {
            byte readByte = es1Var.readByte();
            byte[] bArr = kv2.PxuCJdSBwIXG;
            int i5 = readByte & 255;
            if (i5 == 128) {
                u9.S9EYkSpbGuxq("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int a92UlCVFR9N8 = qk0Var.a92UlCVFR9N8(i5, 127);
                int i6 = a92UlCVFR9N8 - 1;
                if (i6 >= 0) {
                    fj0[] fj0VarArr = sk0.PxuCJdSBwIXG;
                    if (i6 <= fj0VarArr.length - 1) {
                        qk0Var.PxuCJdSBwIXG(fj0VarArr[i6]);
                    }
                }
                int length = qk0Var.a92UlCVFR9N8 + 1 + (i6 - sk0.PxuCJdSBwIXG.length);
                if (length >= 0) {
                    fj0[] fj0VarArr2 = qk0Var.e9gEMXR7LXtO;
                    if (length < fj0VarArr2.length) {
                        fj0 fj0Var = fj0VarArr2[length];
                        fj0Var.getClass();
                        qk0Var.PxuCJdSBwIXG(fj0Var);
                    }
                }
                u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("Header index too large ", a92UlCVFR9N8));
                return null;
            }
            if (i5 == 64) {
                fj0[] fj0VarArr3 = sk0.PxuCJdSBwIXG;
                ah e9gEMXR7LXtO = qk0Var.e9gEMXR7LXtO();
                sk0.PxuCJdSBwIXG(e9gEMXR7LXtO);
                qk0Var.Y1f8riQaR6yg(new fj0(e9gEMXR7LXtO, qk0Var.e9gEMXR7LXtO()));
            } else if ((readByte & 64) == 64) {
                qk0Var.Y1f8riQaR6yg(new fj0(qk0Var.TSizfFm2Yiuu(qk0Var.a92UlCVFR9N8(i5, 63) - 1), qk0Var.e9gEMXR7LXtO()));
            } else if ((readByte & 32) == 32) {
                int a92UlCVFR9N82 = qk0Var.a92UlCVFR9N8(i5, 31);
                qk0Var.PxuCJdSBwIXG = a92UlCVFR9N82;
                if (a92UlCVFR9N82 < 0 || a92UlCVFR9N82 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + qk0Var.PxuCJdSBwIXG);
                }
                int i7 = qk0Var.rtx2ld2ELZv4;
                if (a92UlCVFR9N82 < i7) {
                    if (a92UlCVFR9N82 == 0) {
                        na.v6yxfmkxNKhL(0, r4.length, null, qk0Var.e9gEMXR7LXtO);
                        qk0Var.a92UlCVFR9N8 = qk0Var.e9gEMXR7LXtO.length - 1;
                        qk0Var.RAsUl2FVSrh6 = 0;
                        qk0Var.rtx2ld2ELZv4 = 0;
                    } else {
                        qk0Var.lS5Rgt96tfkO(i7 - a92UlCVFR9N82);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                fj0[] fj0VarArr4 = sk0.PxuCJdSBwIXG;
                ah e9gEMXR7LXtO2 = qk0Var.e9gEMXR7LXtO();
                sk0.PxuCJdSBwIXG(e9gEMXR7LXtO2);
                qk0Var.PxuCJdSBwIXG(new fj0(e9gEMXR7LXtO2, qk0Var.e9gEMXR7LXtO()));
            } else {
                qk0Var.PxuCJdSBwIXG(new fj0(qk0Var.TSizfFm2Yiuu(qk0Var.a92UlCVFR9N8(i5, 15) - 1), qk0Var.e9gEMXR7LXtO()));
            }
        }
        ArrayList arrayList = qk0Var.lS5Rgt96tfkO;
        List i8 = zk.i(arrayList);
        arrayList.clear();
        qk0Var.TSizfFm2Yiuu = 0L;
        return i8;
    }

    public final void a92UlCVFR9N8(kl0 kl0Var, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            u9.S9EYkSpbGuxq("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            u9.S9EYkSpbGuxq("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.rtx2ld2ELZv4.readByte();
            byte[] bArr = kv2.PxuCJdSBwIXG;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        Companion.getClass();
        final int PxuCJdSBwIXG = ol0.PxuCJdSBwIXG(i, i2, i4);
        ig igVar = this.rtx2ld2ELZv4;
        igVar.getClass();
        final ll0 ll0Var = kl0Var.OPXfSBeufaJ8;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            final yf yfVar = new yf();
            long j = PxuCJdSBwIXG;
            igVar.J54yh1s3n4Aq(j);
            igVar.RAsUl2FVSrh6(j, yfVar);
            zd2.lS5Rgt96tfkO(ll0Var.gPXPFXrUH4XX, ll0Var.wdg6QnbFHrFF + '[' + i3 + "] onData", 0L, new ae0(i3, yfVar, PxuCJdSBwIXG, z4) { // from class: cl0
                public final /* synthetic */ int OPXfSBeufaJ8;
                public final /* synthetic */ int dgRBjINgWbAK;
                public final /* synthetic */ yf wdg6QnbFHrFF;

                @Override // defpackage.ae0
                public final Object PxuCJdSBwIXG() {
                    ll0 ll0Var2 = ll0.this;
                    int i5 = this.OPXfSBeufaJ8;
                    yf yfVar2 = this.wdg6QnbFHrFF;
                    int i6 = this.dgRBjINgWbAK;
                    try {
                        ll0Var2.XL4ISE6Oc65B.getClass();
                        yfVar2.skip(i6);
                        ll0Var2.rZjpSjn4zoMv.RfyTYNmI9Srp(i5, o60.r3s1LDPKFs1S);
                        synchronized (ll0Var2) {
                            ll0Var2.ozEBbv0hFTAB.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return no2.PxuCJdSBwIXG;
                }
            }, 6);
        } else {
            vl0 a92UlCVFR9N8 = ll0Var.a92UlCVFR9N8(i3);
            if (a92UlCVFR9N8 == null) {
                kl0Var.OPXfSBeufaJ8.RfyTYNmI9Srp(i3, o60.wdg6QnbFHrFF);
                long j2 = PxuCJdSBwIXG;
                kl0Var.OPXfSBeufaJ8.gPXPFXrUH4XX(j2);
                igVar.skip(j2);
            } else {
                TimeZone timeZone = mv2.PxuCJdSBwIXG;
                tl0 tl0Var = a92UlCVFR9N8.QrzZRwfaDlRX;
                long j3 = PxuCJdSBwIXG;
                tl0Var.getClass();
                long j4 = j3;
                while (true) {
                    vl0 vl0Var = tl0Var.cpQdD2nAriOS;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = mv2.PxuCJdSBwIXG;
                        vl0Var.OPXfSBeufaJ8.gPXPFXrUH4XX(j3);
                        tl0Var.cpQdD2nAriOS.OPXfSBeufaJ8.ZbWwgt3aGe7A.getClass();
                        break;
                    }
                    synchronized (vl0Var) {
                        z2 = tl0Var.OPXfSBeufaJ8;
                        z3 = tl0Var.dgRBjINgWbAK.OPXfSBeufaJ8 + j4 > tl0Var.rtx2ld2ELZv4;
                    }
                    if (z3) {
                        igVar.skip(j4);
                        tl0Var.cpQdD2nAriOS.e9gEMXR7LXtO(o60.x50lh2ztY7Y5);
                        break;
                    }
                    if (z2) {
                        igVar.skip(j4);
                        break;
                    }
                    long RAsUl2FVSrh6 = igVar.RAsUl2FVSrh6(j4, tl0Var.wdg6QnbFHrFF);
                    if (RAsUl2FVSrh6 == -1) {
                        throw new EOFException();
                    }
                    j4 -= RAsUl2FVSrh6;
                    vl0 vl0Var2 = tl0Var.cpQdD2nAriOS;
                    synchronized (vl0Var2) {
                        try {
                            if (tl0Var.x50lh2ztY7Y5) {
                                yf yfVar2 = tl0Var.wdg6QnbFHrFF;
                                yfVar2.skip(yfVar2.OPXfSBeufaJ8);
                            } else {
                                yf yfVar3 = tl0Var.dgRBjINgWbAK;
                                boolean z5 = yfVar3.OPXfSBeufaJ8 == 0;
                                yfVar3.ryVscX7ZL4Ux(tl0Var.wdg6QnbFHrFF);
                                if (z5) {
                                    vl0Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    a92UlCVFR9N8.OPXfSBeufaJ8(hj0.OPXfSBeufaJ8, true);
                }
            }
        }
        this.rtx2ld2ELZv4.skip(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.rtx2ld2ELZv4.close();
    }

    public final void cpQdD2nAriOS(kl0 kl0Var, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        ll0 ll0Var;
        if (i3 == 0) {
            u9.S9EYkSpbGuxq("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.rtx2ld2ELZv4.readByte();
            byte[] bArr = kv2.PxuCJdSBwIXG;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            ig igVar = this.rtx2ld2ELZv4;
            igVar.readInt();
            igVar.readByte();
            byte[] bArr2 = kv2.PxuCJdSBwIXG;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        Companion.getClass();
        List OPXfSBeufaJ8 = OPXfSBeufaJ8(ol0.PxuCJdSBwIXG(i5, i2, i4), i4, i2, i3);
        ll0 ll0Var2 = kl0Var.OPXfSBeufaJ8;
        if (i3 != 0 && (i3 & 1) == 0) {
            z2 = z;
        }
        if (z2) {
            zd2.lS5Rgt96tfkO(ll0Var2.gPXPFXrUH4XX, ll0Var2.wdg6QnbFHrFF + '[' + i3 + "] onHeaders", 0L, new dl0(ll0Var2, i3, OPXfSBeufaJ8, z3), 6);
            return;
        }
        synchronized (ll0Var2) {
            try {
                vl0 a92UlCVFR9N8 = ll0Var2.a92UlCVFR9N8(i3);
                if (a92UlCVFR9N8 != null) {
                    a92UlCVFR9N8.OPXfSBeufaJ8(mv2.RAsUl2FVSrh6(OPXfSBeufaJ8), z3);
                    return;
                }
                if (ll0Var2.cpQdD2nAriOS) {
                    return;
                }
                if (i3 <= ll0Var2.dgRBjINgWbAK) {
                    return;
                }
                if (i3 % 2 == ll0Var2.x50lh2ztY7Y5 % 2) {
                    return;
                }
                ll0Var = ll0Var2;
                try {
                    vl0 vl0Var = new vl0(i3, ll0Var, false, z3, mv2.RAsUl2FVSrh6(OPXfSBeufaJ8));
                    ll0Var.dgRBjINgWbAK = i3;
                    ll0Var.OPXfSBeufaJ8.put(Integer.valueOf(i3), vl0Var);
                    zd2.lS5Rgt96tfkO(ll0Var.r3s1LDPKFs1S.Y1f8riQaR6yg(), ll0Var.wdg6QnbFHrFF + '[' + i3 + "] onStream", 0L, new e6(11, ll0Var, vl0Var), 6);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                ll0Var = ll0Var2;
            }
        }
    }

    public final void gPXPFXrUH4XX(kl0 kl0Var, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            u9.S9EYkSpbGuxq("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.rtx2ld2ELZv4.readByte();
            byte[] bArr = kv2.PxuCJdSBwIXG;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.rtx2ld2ELZv4.readInt() & Integer.MAX_VALUE;
        Companion.getClass();
        List OPXfSBeufaJ8 = OPXfSBeufaJ8(ol0.PxuCJdSBwIXG(i - 4, i2, i4), i4, i2, i3);
        ll0 ll0Var = kl0Var.OPXfSBeufaJ8;
        synchronized (ll0Var) {
            if (ll0Var.ozEBbv0hFTAB.contains(Integer.valueOf(readInt))) {
                ll0Var.RfyTYNmI9Srp(readInt, o60.wdg6QnbFHrFF);
                return;
            }
            ll0Var.ozEBbv0hFTAB.add(Integer.valueOf(readInt));
            zd2.lS5Rgt96tfkO(ll0Var.gPXPFXrUH4XX, ll0Var.wdg6QnbFHrFF + '[' + readInt + "] onRequest", 0L, new dl0(ll0Var, readInt, OPXfSBeufaJ8, i5), 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x023d, code lost:
    
        defpackage.u9.S9EYkSpbGuxq(defpackage.o0.wdg6QnbFHrFF("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0246, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean lS5Rgt96tfkO(boolean z, kl0 kl0Var) {
        int x50lh2ztY7Y5;
        Object[] array;
        try {
            this.rtx2ld2ELZv4.J54yh1s3n4Aq(9L);
            x50lh2ztY7Y5 = kv2.x50lh2ztY7Y5(this.rtx2ld2ELZv4);
        } catch (EOFException unused) {
        }
        if (x50lh2ztY7Y5 > 16384) {
            u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("FRAME_SIZE_ERROR: ", x50lh2ztY7Y5));
            return false;
        }
        int readByte = this.rtx2ld2ELZv4.readByte() & 255;
        byte readByte2 = this.rtx2ld2ELZv4.readByte();
        int i = readByte2 & 255;
        int readInt = this.rtx2ld2ELZv4.readInt();
        int i2 = Integer.MAX_VALUE & readInt;
        int i3 = 1;
        if (readByte != 8) {
            Logger logger = dgRBjINgWbAK;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(zk0.lS5Rgt96tfkO(true, i2, x50lh2ztY7Y5, readByte, i));
            }
        }
        if (z && readByte != 4) {
            throw new IOException("Expected a SETTINGS frame but was " + zk0.PxuCJdSBwIXG(readByte));
        }
        o60 o60Var = null;
        switch (readByte) {
            case 0:
                a92UlCVFR9N8(kl0Var, x50lh2ztY7Y5, i, i2);
                return true;
            case 1:
                cpQdD2nAriOS(kl0Var, x50lh2ztY7Y5, i, i2);
                return true;
            case 2:
                if (x50lh2ztY7Y5 != 5) {
                    u9.S9EYkSpbGuxq(o0.OPXfSBeufaJ8(x50lh2ztY7Y5, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i2 == 0) {
                    u9.S9EYkSpbGuxq("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                ig igVar = this.rtx2ld2ELZv4;
                igVar.readInt();
                igVar.readByte();
                return true;
            case 3:
                if (x50lh2ztY7Y5 != 4) {
                    u9.S9EYkSpbGuxq(o0.OPXfSBeufaJ8(x50lh2ztY7Y5, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i2 == 0) {
                    u9.S9EYkSpbGuxq("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int readInt2 = this.rtx2ld2ELZv4.readInt();
                o60.Companion.getClass();
                o60[] values = o60.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        o60 o60Var2 = values[i4];
                        if (o60Var2.rtx2ld2ELZv4 == readInt2) {
                            o60Var = o60Var2;
                        } else {
                            i4++;
                        }
                    }
                }
                if (o60Var == null) {
                    u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("TYPE_RST_STREAM unexpected error code: ", readInt2));
                    return false;
                }
                ll0 ll0Var = kl0Var.OPXfSBeufaJ8;
                if (i2 == 0 || (readInt & 1) != 0) {
                    vl0 OPXfSBeufaJ8 = ll0Var.OPXfSBeufaJ8(i2);
                    if (OPXfSBeufaJ8 != null) {
                        synchronized (OPXfSBeufaJ8) {
                            if (OPXfSBeufaJ8.a92UlCVFR9N8() == null) {
                                OPXfSBeufaJ8.RfyTYNmI9Srp = o60Var;
                                OPXfSBeufaJ8.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                }
                zd2.lS5Rgt96tfkO(ll0Var.gPXPFXrUH4XX, ll0Var.wdg6QnbFHrFF + '[' + i2 + "] onReset", 0L, new dl0(ll0Var, i2, o60Var, i3), 6);
                return true;
            case 4:
                ig igVar2 = this.rtx2ld2ELZv4;
                if (i2 != 0) {
                    u9.S9EYkSpbGuxq("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((readByte2 & 1) != 0) {
                    if (x50lh2ztY7Y5 != 0) {
                        u9.S9EYkSpbGuxq("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (x50lh2ztY7Y5 % 6 != 0) {
                    u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("TYPE_SETTINGS length % 6 != 0: ", x50lh2ztY7Y5));
                    return false;
                }
                t42 t42Var = new t42();
                yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, x50lh2ztY7Y5), 6);
                int i5 = BjEWd04qc7Mw.rtx2ld2ELZv4;
                int i6 = BjEWd04qc7Mw.OPXfSBeufaJ8;
                int i7 = BjEWd04qc7Mw.wdg6QnbFHrFF;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (true) {
                        short readShort = igVar2.readShort();
                        byte[] bArr = kv2.PxuCJdSBwIXG;
                        int i8 = readShort & 65535;
                        int readInt3 = igVar2.readInt();
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                }
                            } else if (readInt3 < 0) {
                                u9.S9EYkSpbGuxq("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (readInt3 != 0 && readInt3 != 1) {
                            u9.S9EYkSpbGuxq("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        t42Var.lS5Rgt96tfkO(i8, readInt3);
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                }
                ll0 ll0Var2 = kl0Var.OPXfSBeufaJ8;
                zd2.lS5Rgt96tfkO(ll0Var2.QrzZRwfaDlRX, o0.gPXPFXrUH4XX(new StringBuilder(), ll0Var2.wdg6QnbFHrFF, " applyAndAckSettings"), 0L, new e6(12, kl0Var, t42Var), 6);
                return true;
            case 5:
                gPXPFXrUH4XX(kl0Var, x50lh2ztY7Y5, i, i2);
                return true;
            case 6:
                if (x50lh2ztY7Y5 != 8) {
                    u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("TYPE_PING length != 8: ", x50lh2ztY7Y5));
                    return false;
                }
                if (i2 != 0) {
                    u9.S9EYkSpbGuxq("TYPE_PING streamId != 0");
                    return false;
                }
                final int readInt4 = this.rtx2ld2ELZv4.readInt();
                final int readInt5 = this.rtx2ld2ELZv4.readInt();
                r0 = (readByte2 & 1) != 0 ? 1 : 0;
                ll0 ll0Var3 = kl0Var.OPXfSBeufaJ8;
                if (r0 == 0) {
                    zd2 zd2Var = ll0Var3.QrzZRwfaDlRX;
                    String gPXPFXrUH4XX = o0.gPXPFXrUH4XX(new StringBuilder(), kl0Var.OPXfSBeufaJ8.wdg6QnbFHrFF, " ping");
                    final ll0 ll0Var4 = kl0Var.OPXfSBeufaJ8;
                    zd2.lS5Rgt96tfkO(zd2Var, gPXPFXrUH4XX, 0L, new ae0() { // from class: jl0
                        @Override // defpackage.ae0
                        public final Object PxuCJdSBwIXG() {
                            ll0 ll0Var5 = ll0.this;
                            try {
                                ll0Var5.rZjpSjn4zoMv.XL4ISE6Oc65B(readInt4, readInt5, true);
                            } catch (IOException e) {
                                o60 o60Var3 = o60.wdg6QnbFHrFF;
                                ll0Var5.lS5Rgt96tfkO(o60Var3, o60Var3, e);
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                    }, 6);
                    return true;
                }
                synchronized (ll0Var3) {
                    try {
                        if (readInt4 == 1) {
                            ll0Var3.EcgxDIVH5in8++;
                        } else if (readInt4 == 2) {
                            ll0Var3.VhhvGxCb8gfr++;
                        } else if (readInt4 == 3) {
                            ll0Var3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (x50lh2ztY7Y5 < 8) {
                    u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("TYPE_GOAWAY length < 8: ", x50lh2ztY7Y5));
                    return false;
                }
                if (i2 != 0) {
                    u9.S9EYkSpbGuxq("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int readInt6 = this.rtx2ld2ELZv4.readInt();
                int readInt7 = this.rtx2ld2ELZv4.readInt();
                int i9 = x50lh2ztY7Y5 - 8;
                o60.Companion.getClass();
                o60[] values2 = o60.values();
                int length2 = values2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        o60 o60Var3 = values2[i10];
                        if (o60Var3.rtx2ld2ELZv4 == readInt7) {
                            o60Var = o60Var3;
                        } else {
                            i10++;
                        }
                    }
                }
                if (o60Var == null) {
                    u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("TYPE_GOAWAY unexpected error code: ", readInt7));
                    return false;
                }
                ah ahVar = ah.dgRBjINgWbAK;
                if (i9 > 0) {
                    ahVar = this.rtx2ld2ELZv4.x50lh2ztY7Y5(i9);
                }
                ahVar.getClass();
                ahVar.TSizfFm2Yiuu();
                ll0 ll0Var5 = kl0Var.OPXfSBeufaJ8;
                synchronized (ll0Var5) {
                    array = ll0Var5.OPXfSBeufaJ8.values().toArray(new vl0[0]);
                    ll0Var5.cpQdD2nAriOS = true;
                }
                vl0[] vl0VarArr = (vl0[]) array;
                int length3 = vl0VarArr.length;
                while (r0 < length3) {
                    vl0 vl0Var = vl0VarArr[r0];
                    if (vl0Var.rtx2ld2ELZv4 > readInt6 && vl0Var.RAsUl2FVSrh6()) {
                        o60 o60Var4 = o60.cpQdD2nAriOS;
                        synchronized (vl0Var) {
                            if (vl0Var.a92UlCVFR9N8() == null) {
                                vl0Var.RfyTYNmI9Srp = o60Var4;
                                vl0Var.notifyAll();
                            }
                        }
                        kl0Var.OPXfSBeufaJ8.OPXfSBeufaJ8(vl0Var.rtx2ld2ELZv4);
                    }
                    r0++;
                }
                return true;
            case 8:
                try {
                    if (x50lh2ztY7Y5 != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + x50lh2ztY7Y5);
                    }
                    long readInt8 = this.rtx2ld2ELZv4.readInt() & 2147483647L;
                    if (readInt8 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = dgRBjINgWbAK;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(zk0.TSizfFm2Yiuu(true, i2, x50lh2ztY7Y5, readInt8));
                    }
                    ll0 ll0Var6 = kl0Var.OPXfSBeufaJ8;
                    if (i2 == 0) {
                        synchronized (ll0Var6) {
                            ll0Var6.aF05bpZJlKEP += readInt8;
                            ll0Var6.notifyAll();
                        }
                        return true;
                    }
                    vl0 a92UlCVFR9N8 = ll0Var6.a92UlCVFR9N8(i2);
                    if (a92UlCVFR9N8 != null) {
                        synchronized (a92UlCVFR9N8) {
                            a92UlCVFR9N8.x50lh2ztY7Y5 += readInt8;
                            if (readInt8 > 0) {
                                a92UlCVFR9N8.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    dgRBjINgWbAK.fine(zk0.lS5Rgt96tfkO(true, i2, x50lh2ztY7Y5, 8, i));
                    throw e;
                }
            default:
                this.rtx2ld2ELZv4.skip(x50lh2ztY7Y5);
                return true;
        }
    }
}
