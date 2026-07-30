package defpackage;

import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vs1 {
    public static final ts1 Companion = new ts1();
    public static final List ZbWwgt3aGe7A = fx1.jJwa0q7P5wHq(fr1.wdg6QnbFHrFF);
    public long BRwzKIf41E4i;
    public String EcgxDIVH5in8;
    public ns1 OPXfSBeufaJ8;
    public final e0 PxuCJdSBwIXG;
    public final ArrayDeque QrzZRwfaDlRX;
    public final String RAsUl2FVSrh6;
    public int RfyTYNmI9Srp;
    public boolean S2OOm9zPNm0h;
    public boolean S9EYkSpbGuxq;
    public final long TSizfFm2Yiuu;
    public int VhhvGxCb8gfr;
    public boolean XL4ISE6Oc65B;
    public ds2 Y1f8riQaR6yg;
    public final long a92UlCVFR9N8;
    public String cpQdD2nAriOS;
    public fs2 dgRBjINgWbAK;
    public final long e9gEMXR7LXtO;
    public final ArrayDeque gPXPFXrUH4XX;
    public final Random lS5Rgt96tfkO;
    public m9 r3s1LDPKFs1S;
    public js1 rtx2ld2ELZv4;
    public es2 wdg6QnbFHrFF;
    public final zd2 x50lh2ztY7Y5;

    public vs1(be2 be2Var, xb xbVar, e0 e0Var, Random random, long j, long j2, long j3) {
        be2Var.getClass();
        this.PxuCJdSBwIXG = e0Var;
        this.lS5Rgt96tfkO = random;
        this.TSizfFm2Yiuu = j;
        this.Y1f8riQaR6yg = null;
        this.e9gEMXR7LXtO = j2;
        this.a92UlCVFR9N8 = j3;
        this.x50lh2ztY7Y5 = be2Var.Y1f8riQaR6yg();
        this.QrzZRwfaDlRX = new ArrayDeque();
        this.gPXPFXrUH4XX = new ArrayDeque();
        this.RfyTYNmI9Srp = -1;
        String str = (String) xbVar.TSizfFm2Yiuu;
        if (!"GET".equals(str)) {
            rc1.x50lh2ztY7Y5(str, "Request must be GET: ");
            throw null;
        }
        zg zgVar = ah.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.RAsUl2FVSrh6 = zg.TSizfFm2Yiuu(zgVar, bArr).PxuCJdSBwIXG();
    }

    public static void TSizfFm2Yiuu(vs1 vs1Var, Exception exc, int i) {
        fs2 fs2Var;
        boolean z = (i & 4) == 0;
        vs1Var.getClass();
        zt1 zt1Var = new zt1();
        synchronized (vs1Var) {
            try {
                if (vs1Var.S9EYkSpbGuxq) {
                    return;
                }
                vs1Var.S9EYkSpbGuxq = true;
                m9 m9Var = vs1Var.r3s1LDPKFs1S;
                fs2 fs2Var2 = vs1Var.dgRBjINgWbAK;
                zt1Var.rtx2ld2ELZv4 = fs2Var2;
                vs1Var.dgRBjINgWbAK = null;
                if (!z && fs2Var2 != null) {
                    zd2.lS5Rgt96tfkO(vs1Var.x50lh2ztY7Y5, vs1Var.cpQdD2nAriOS + " writer close", 0L, new o5(28, zt1Var), 2);
                }
                vs1Var.x50lh2ztY7Y5.e9gEMXR7LXtO();
                try {
                    e0 e0Var = vs1Var.PxuCJdSBwIXG;
                    g0.lS5Rgt96tfkO((g0) e0Var.OPXfSBeufaJ8, (bi) e0Var.dgRBjINgWbAK, (AtomicBoolean) e0Var.x50lh2ztY7Y5, exc);
                    if (m9Var != null) {
                        m9Var.cancel();
                    }
                    if (!z || (fs2Var = (fs2) zt1Var.rtx2ld2ELZv4) == null) {
                        return;
                    }
                    kv2.PxuCJdSBwIXG(fs2Var);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g82 PxuCJdSBwIXG(nv1 nv1Var) {
        hj0 hj0Var = nv1Var.cpQdD2nAriOS;
        int i = nv1Var.dgRBjINgWbAK;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(o0.QrzZRwfaDlRX(sb, nv1Var.wdg6QnbFHrFF, '\''));
        }
        String PxuCJdSBwIXG = hj0Var.PxuCJdSBwIXG("Connection");
        if (PxuCJdSBwIXG == null) {
            PxuCJdSBwIXG = null;
        }
        if (!"Upgrade".equalsIgnoreCase(PxuCJdSBwIXG)) {
            throw new ProtocolException(o0.dgRBjINgWbAK("Expected 'Connection' header value 'Upgrade' but was '", PxuCJdSBwIXG, '\''));
        }
        String PxuCJdSBwIXG2 = hj0Var.PxuCJdSBwIXG("Upgrade");
        if (PxuCJdSBwIXG2 == null) {
            PxuCJdSBwIXG2 = null;
        }
        if (!"websocket".equalsIgnoreCase(PxuCJdSBwIXG2)) {
            throw new ProtocolException(o0.dgRBjINgWbAK("Expected 'Upgrade' header value 'websocket' but was '", PxuCJdSBwIXG2, '\''));
        }
        String PxuCJdSBwIXG3 = hj0Var.PxuCJdSBwIXG("Sec-WebSocket-Accept");
        String str = PxuCJdSBwIXG3 != null ? PxuCJdSBwIXG3 : null;
        zg zgVar = ah.Companion;
        String str2 = this.RAsUl2FVSrh6 + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        zgVar.getClass();
        String PxuCJdSBwIXG4 = zg.lS5Rgt96tfkO(str2).lS5Rgt96tfkO("SHA-1").PxuCJdSBwIXG();
        if (cs0.wdg6QnbFHrFF(PxuCJdSBwIXG4, str)) {
            g82 g82Var = nv1Var.QrzZRwfaDlRX;
            if (g82Var != null) {
                return g82Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + PxuCJdSBwIXG4 + "' but was '" + str + '\'');
    }

    public final void Y1f8riQaR6yg() {
        String str;
        es2 es2Var;
        boolean z;
        synchronized (this) {
            try {
                str = this.EcgxDIVH5in8;
                es2Var = this.wdg6QnbFHrFF;
                this.wdg6QnbFHrFF = null;
                if (this.XL4ISE6Oc65B && this.gPXPFXrUH4XX.isEmpty()) {
                    fs2 fs2Var = this.dgRBjINgWbAK;
                    if (fs2Var != null) {
                        this.dgRBjINgWbAK = null;
                        zd2.lS5Rgt96tfkO(this.x50lh2ztY7Y5, this.cpQdD2nAriOS + " writer close", 0L, new o5(27, fs2Var), 2);
                    }
                    this.x50lh2ztY7Y5.e9gEMXR7LXtO();
                }
                if (!this.S9EYkSpbGuxq && this.dgRBjINgWbAK == null) {
                    z = this.RfyTYNmI9Srp != -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            str.getClass();
        }
        if (es2Var != null) {
            kv2.PxuCJdSBwIXG(es2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d3, code lost:
    
        if (r0 < 3000) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x0083, TRY_ENTER, TryCatch #0 {all -> 0x0083, blocks: (B:25:0x0077, B:29:0x0086, B:31:0x008a, B:32:0x0095, B:35:0x00a3, B:39:0x00a7, B:40:0x00a8, B:41:0x00a9, B:43:0x00ad, B:53:0x00d5, B:55:0x00f9, B:57:0x0103, B:58:0x0106, B:62:0x0111, B:64:0x0115, B:67:0x011f, B:68:0x0121, B:69:0x0122, B:70:0x012b, B:75:0x00e9, B:76:0x012c, B:77:0x0131, B:34:0x0096, B:61:0x010e), top: B:23:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:25:0x0077, B:29:0x0086, B:31:0x008a, B:32:0x0095, B:35:0x00a3, B:39:0x00a7, B:40:0x00a8, B:41:0x00a9, B:43:0x00ad, B:53:0x00d5, B:55:0x00f9, B:57:0x0103, B:58:0x0106, B:62:0x0111, B:64:0x0115, B:67:0x011f, B:68:0x0121, B:69:0x0122, B:70:0x012b, B:75:0x00e9, B:76:0x012c, B:77:0x0131, B:34:0x0096, B:61:0x010e), top: B:23:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:25:0x0077, B:29:0x0086, B:31:0x008a, B:32:0x0095, B:35:0x00a3, B:39:0x00a7, B:40:0x00a8, B:41:0x00a9, B:43:0x00ad, B:53:0x00d5, B:55:0x00f9, B:57:0x0103, B:58:0x0106, B:62:0x0111, B:64:0x0115, B:67:0x011f, B:68:0x0121, B:69:0x0122, B:70:0x012b, B:75:0x00e9, B:76:0x012c, B:77:0x0131, B:34:0x0096, B:61:0x010e), top: B:23:0x0075, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:25:0x0077, B:29:0x0086, B:31:0x008a, B:32:0x0095, B:35:0x00a3, B:39:0x00a7, B:40:0x00a8, B:41:0x00a9, B:43:0x00ad, B:53:0x00d5, B:55:0x00f9, B:57:0x0103, B:58:0x0106, B:62:0x0111, B:64:0x0115, B:67:0x011f, B:68:0x0121, B:69:0x0122, B:70:0x012b, B:75:0x00e9, B:76:0x012c, B:77:0x0131, B:34:0x0096, B:61:0x010e), top: B:23:0x0075, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a92UlCVFR9N8() {
        Object obj;
        fs2 fs2Var;
        Object obj2;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.S9EYkSpbGuxq) {
                    return false;
                }
                fs2 fs2Var2 = this.dgRBjINgWbAK;
                Object poll = this.QrzZRwfaDlRX.poll();
                String str = null;
                try {
                    if (poll == null) {
                        obj = this.gPXPFXrUH4XX.poll();
                        if (obj instanceof ss1) {
                            int i = this.RfyTYNmI9Srp;
                            obj2 = this.EcgxDIVH5in8;
                            if (i != -1) {
                                fs2Var = this.dgRBjINgWbAK;
                                this.dgRBjINgWbAK = null;
                                if (fs2Var != null && this.wdg6QnbFHrFF == null) {
                                    z = true;
                                }
                                this.x50lh2ztY7Y5.e9gEMXR7LXtO();
                            } else {
                                long j = ((ss1) obj).TSizfFm2Yiuu;
                                zd2.lS5Rgt96tfkO(this.x50lh2ztY7Y5, this.cpQdD2nAriOS + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new o5(29, this), 4);
                                fs2Var = null;
                            }
                            if (poll == null) {
                                fs2Var2.getClass();
                                fs2Var2.lS5Rgt96tfkO(10, (ah) poll);
                            } else if (obj instanceof us1) {
                                fs2Var2.getClass();
                                fs2Var2.a92UlCVFR9N8(((us1) obj).PxuCJdSBwIXG);
                                synchronized (this) {
                                    this.BRwzKIf41E4i -= ((us1) obj).PxuCJdSBwIXG.rtx2ld2ELZv4.length;
                                }
                            } else {
                                if (!(obj instanceof ss1)) {
                                    throw new AssertionError();
                                }
                                fs2Var2.getClass();
                                int i2 = ((ss1) obj).PxuCJdSBwIXG;
                                ah ahVar = ((ss1) obj).lS5Rgt96tfkO;
                                zg zgVar = ah.Companion;
                                if (i2 >= 1000 && i2 < 5000) {
                                    if (1004 <= i2) {
                                        if (i2 < 1007) {
                                            str = "Code " + i2 + " is reserved and may not be used.";
                                            if (str != null) {
                                                throw new IllegalArgumentException(str.toString());
                                            }
                                            yf yfVar = new yf();
                                            yfVar.zf8DYfih6EZu(i2);
                                            if (ahVar != null) {
                                                yfVar.nLZGh9p8gVSu(ahVar);
                                            }
                                            try {
                                                fs2Var2.lS5Rgt96tfkO(8, yfVar.x50lh2ztY7Y5(yfVar.OPXfSBeufaJ8));
                                                if (z) {
                                                    obj2.getClass();
                                                }
                                            } finally {
                                                fs2Var2.QrzZRwfaDlRX = true;
                                            }
                                        }
                                    }
                                    if (1015 <= i2) {
                                    }
                                    if (str != null) {
                                    }
                                }
                                str = "Code must be in range [1000,5000): " + i2;
                                if (str != null) {
                                }
                            }
                            return true;
                        }
                        if (obj == null) {
                            return false;
                        }
                        fs2Var = null;
                    } else {
                        obj = null;
                        fs2Var = null;
                    }
                    if (poll == null) {
                    }
                    return true;
                } finally {
                    if (fs2Var != null) {
                        kv2.PxuCJdSBwIXG(fs2Var);
                    }
                }
                obj2 = fs2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e9gEMXR7LXtO() {
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        ns1 ns1Var = this.OPXfSBeufaJ8;
        if (ns1Var != null) {
            this.x50lh2ztY7Y5.TSizfFm2Yiuu(ns1Var, 0L);
        }
    }

    public final void lS5Rgt96tfkO(String str, int i) {
        String str2;
        long j = this.a92UlCVFR9N8;
        synchronized (this) {
            ah ahVar = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    ah.Companion.getClass();
                    ahVar = zg.lS5Rgt96tfkO(str);
                    if (ahVar.rtx2ld2ELZv4.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.S9EYkSpbGuxq && !this.XL4ISE6Oc65B) {
                    this.XL4ISE6Oc65B = true;
                    this.gPXPFXrUH4XX.add(new ss1(i, ahVar, j));
                    e9gEMXR7LXtO();
                }
            } finally {
            }
        }
    }
}
