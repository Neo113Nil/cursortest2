package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class es2 implements Closeable {
    public boolean BRwzKIf41E4i;
    public final yf EcgxDIVH5in8;
    public final vs1 OPXfSBeufaJ8;
    public long QrzZRwfaDlRX;
    public final yf RfyTYNmI9Srp;
    public x51 S9EYkSpbGuxq;
    public final byte[] VhhvGxCb8gfr;
    public boolean XL4ISE6Oc65B;
    public boolean cpQdD2nAriOS;
    public final boolean dgRBjINgWbAK;
    public boolean gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public final ig rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public es2(ig igVar, vs1 vs1Var, boolean z, boolean z2) {
        igVar.getClass();
        this.rtx2ld2ELZv4 = igVar;
        this.OPXfSBeufaJ8 = vs1Var;
        this.wdg6QnbFHrFF = z;
        this.dgRBjINgWbAK = z2;
        this.RfyTYNmI9Srp = new yf();
        this.EcgxDIVH5in8 = new yf();
        this.VhhvGxCb8gfr = null;
    }

    public final void OPXfSBeufaJ8() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.cpQdD2nAriOS) {
            u9.S9EYkSpbGuxq("closed");
            return;
        }
        ig igVar = this.rtx2ld2ELZv4;
        long rtx2ld2ELZv4 = igVar.TSizfFm2Yiuu().rtx2ld2ELZv4();
        igVar.TSizfFm2Yiuu().lS5Rgt96tfkO();
        try {
            byte readByte = igVar.readByte();
            byte[] bArr = kv2.PxuCJdSBwIXG;
            igVar.TSizfFm2Yiuu().RAsUl2FVSrh6(rtx2ld2ELZv4, timeUnit);
            int i = readByte & 15;
            this.r3s1LDPKFs1S = i;
            boolean z2 = (readByte & 128) != 0;
            this.gPXPFXrUH4XX = z2;
            boolean z3 = (readByte & 8) != 0;
            this.BRwzKIf41E4i = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.wdg6QnbFHrFF) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.XL4ISE6Oc65B = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = igVar.readByte();
            boolean z5 = (readByte2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.QrzZRwfaDlRX = j;
            if (j == 126) {
                this.QrzZRwfaDlRX = igVar.readShort() & 65535;
            } else if (j == 127) {
                long readLong = igVar.readLong();
                this.QrzZRwfaDlRX = readLong;
                if (readLong < 0) {
                    long j2 = this.QrzZRwfaDlRX;
                    TimeZone timeZone = mv2.PxuCJdSBwIXG;
                    String hexString = Long.toHexString(j2);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.BRwzKIf41E4i && this.QrzZRwfaDlRX > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.VhhvGxCb8gfr;
                bArr2.getClass();
                igVar.readFully(bArr2);
            }
        } catch (Throwable th) {
            igVar.TSizfFm2Yiuu().RAsUl2FVSrh6(rtx2ld2ELZv4, timeUnit);
            throw th;
        }
    }

    public final void a92UlCVFR9N8() {
        String str;
        short s;
        long j = this.QrzZRwfaDlRX;
        if (j > 0) {
            this.rtx2ld2ELZv4.rtx2ld2ELZv4(j, this.RfyTYNmI9Srp);
        }
        switch (this.r3s1LDPKFs1S) {
            case 8:
                yf yfVar = this.RfyTYNmI9Srp;
                long j2 = yfVar.OPXfSBeufaJ8;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = yfVar.readShort();
                    str = this.RfyTYNmI9Srp.pnx5pC0XzaCw();
                    String wdg6QnbFHrFF = (s < 1000 || s >= 5000) ? o0.wdg6QnbFHrFF("Code must be in range [1000,5000): ", s) : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : o0.OPXfSBeufaJ8(s, "Code ", " is reserved and may not be used.");
                    if (wdg6QnbFHrFF != null) {
                        throw new ProtocolException(wdg6QnbFHrFF);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                vs1 vs1Var = this.OPXfSBeufaJ8;
                if (s == -1) {
                    u9.XL4ISE6Oc65B("Failed requirement.");
                    return;
                }
                synchronized (vs1Var) {
                    if (vs1Var.RfyTYNmI9Srp != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    vs1Var.RfyTYNmI9Srp = s;
                    vs1Var.EcgxDIVH5in8 = str;
                }
                e0 e0Var = vs1Var.PxuCJdSBwIXG;
                g0 g0Var = (g0) e0Var.OPXfSBeufaJ8;
                vs1Var.lS5Rgt96tfkO(null, 1000);
                g0.lS5Rgt96tfkO(g0Var, (bi) e0Var.dgRBjINgWbAK, (AtomicBoolean) e0Var.x50lh2ztY7Y5, new IOException("Socket closed before response"));
                this.cpQdD2nAriOS = true;
                return;
            case 9:
                vs1 vs1Var2 = this.OPXfSBeufaJ8;
                yf yfVar2 = this.RfyTYNmI9Srp;
                ah x50lh2ztY7Y5 = yfVar2.x50lh2ztY7Y5(yfVar2.OPXfSBeufaJ8);
                synchronized (vs1Var2) {
                    try {
                        x50lh2ztY7Y5.getClass();
                        if (!vs1Var2.S9EYkSpbGuxq && (!vs1Var2.XL4ISE6Oc65B || !vs1Var2.gPXPFXrUH4XX.isEmpty())) {
                            vs1Var2.QrzZRwfaDlRX.add(x50lh2ztY7Y5);
                            vs1Var2.e9gEMXR7LXtO();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                vs1 vs1Var3 = this.OPXfSBeufaJ8;
                yf yfVar3 = this.RfyTYNmI9Srp;
                ah x50lh2ztY7Y52 = yfVar3.x50lh2ztY7Y5(yfVar3.OPXfSBeufaJ8);
                synchronized (vs1Var3) {
                    x50lh2ztY7Y52.getClass();
                    vs1Var3.S2OOm9zPNm0h = false;
                }
                return;
            default:
                int i = this.r3s1LDPKFs1S;
                TimeZone timeZone = mv2.PxuCJdSBwIXG;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x50lh2ztY7Y5) {
            return;
        }
        this.x50lh2ztY7Y5 = true;
        x51 x51Var = this.S9EYkSpbGuxq;
        if (x51Var != null) {
            kv2.PxuCJdSBwIXG(x51Var);
        }
        kv2.PxuCJdSBwIXG(this.rtx2ld2ELZv4);
    }

    public final void lS5Rgt96tfkO() {
        if (this.x50lh2ztY7Y5) {
            u9.rtx2ld2ELZv4("closed");
            return;
        }
        OPXfSBeufaJ8();
        if (this.BRwzKIf41E4i) {
            a92UlCVFR9N8();
            return;
        }
        int i = this.r3s1LDPKFs1S;
        if (i != 1 && i != 2) {
            TimeZone timeZone = mv2.PxuCJdSBwIXG;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.cpQdD2nAriOS) {
            long j = this.QrzZRwfaDlRX;
            yf yfVar = this.EcgxDIVH5in8;
            if (j > 0) {
                this.rtx2ld2ELZv4.rtx2ld2ELZv4(j, yfVar);
            }
            if (this.gPXPFXrUH4XX) {
                if (this.XL4ISE6Oc65B) {
                    x51 x51Var = this.S9EYkSpbGuxq;
                    if (x51Var == null) {
                        x51Var = new x51(1, this.dgRBjINgWbAK);
                        this.S9EYkSpbGuxq = x51Var;
                    }
                    yf yfVar2 = x51Var.wdg6QnbFHrFF;
                    if (yfVar2.OPXfSBeufaJ8 != 0) {
                        u9.XL4ISE6Oc65B("Failed requirement.");
                        return;
                    }
                    Inflater inflater = (Inflater) x51Var.dgRBjINgWbAK;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        x51Var.dgRBjINgWbAK = inflater;
                    }
                    xo0 xo0Var = (xo0) x51Var.x50lh2ztY7Y5;
                    if (xo0Var == null) {
                        xo0Var = new xo0(new es1(yfVar2), inflater);
                        x51Var.x50lh2ztY7Y5 = xo0Var;
                    }
                    if (x51Var.OPXfSBeufaJ8) {
                        inflater.reset();
                    }
                    yfVar2.ryVscX7ZL4Ux(yfVar);
                    yfVar2.i68hK7ahKtgp(65535);
                    long bytesRead = inflater.getBytesRead() + yfVar2.OPXfSBeufaJ8;
                    do {
                        xo0Var.lS5Rgt96tfkO(Long.MAX_VALUE, yfVar);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        yfVar2.skip(yfVar2.OPXfSBeufaJ8);
                        xo0Var.close();
                        x51Var.x50lh2ztY7Y5 = null;
                        x51Var.dgRBjINgWbAK = null;
                    }
                }
                vs1 vs1Var = this.OPXfSBeufaJ8;
                e0 e0Var = vs1Var.PxuCJdSBwIXG;
                if (i == 1) {
                    g0.PxuCJdSBwIXG((g0) e0Var.OPXfSBeufaJ8, vs1Var, (AtomicBoolean) e0Var.x50lh2ztY7Y5, (bi) e0Var.dgRBjINgWbAK, yfVar.pnx5pC0XzaCw());
                    return;
                } else {
                    ah x50lh2ztY7Y5 = yfVar.x50lh2ztY7Y5(yfVar.OPXfSBeufaJ8);
                    x50lh2ztY7Y5.getClass();
                    g0.PxuCJdSBwIXG((g0) e0Var.OPXfSBeufaJ8, vs1Var, (AtomicBoolean) e0Var.x50lh2ztY7Y5, (bi) e0Var.dgRBjINgWbAK, x50lh2ztY7Y5.x50lh2ztY7Y5());
                    return;
                }
            }
            while (!this.cpQdD2nAriOS) {
                OPXfSBeufaJ8();
                if (!this.BRwzKIf41E4i) {
                    break;
                } else {
                    a92UlCVFR9N8();
                }
            }
            if (this.r3s1LDPKFs1S != 0) {
                int i2 = this.r3s1LDPKFs1S;
                TimeZone timeZone2 = mv2.PxuCJdSBwIXG;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        u9.S9EYkSpbGuxq("closed");
    }
}
