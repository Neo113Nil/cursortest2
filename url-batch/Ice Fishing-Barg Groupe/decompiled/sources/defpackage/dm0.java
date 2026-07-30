package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dm0 implements pr0 {
    public static final zl0 Companion = new zl0();
    public final cm0 PxuCJdSBwIXG = cm0.e9gEMXR7LXtO;
    public volatile t50 TSizfFm2Yiuu;
    public volatile am0 Y1f8riQaR6yg;
    public volatile t50 lS5Rgt96tfkO;

    public dm0() {
        t50 t50Var = t50.rtx2ld2ELZv4;
        this.lS5Rgt96tfkO = t50Var;
        this.TSizfFm2Yiuu = t50Var;
        this.Y1f8riQaR6yg = am0.rtx2ld2ELZv4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0257, code lost:
    
        if (r5 == null) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.pr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nv1 PxuCJdSBwIXG(ps1 ps1Var) {
        boolean z;
        String str;
        Long l;
        Charset charset;
        nv1 nv1Var;
        es1 es1Var;
        long j;
        int IAToe7bXGz4N;
        String str2;
        am0 am0Var = this.Y1f8riQaR6yg;
        xb xbVar = ps1Var.e9gEMXR7LXtO;
        if (am0Var == am0.rtx2ld2ELZv4) {
            return ps1Var.lS5Rgt96tfkO(xbVar);
        }
        boolean z2 = am0Var == am0.wdg6QnbFHrFF;
        boolean z3 = z2 || am0Var == am0.OPXfSBeufaJ8;
        jv jvVar = ps1Var.Y1f8riQaR6yg;
        ls1 TSizfFm2Yiuu = jvVar != null ? jvVar.TSizfFm2Yiuu() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append((String) xbVar.TSizfFm2Yiuu);
        sb.append(' ');
        gm0 gm0Var = (gm0) xbVar.lS5Rgt96tfkO;
        gm0Var.getClass();
        this.TSizfFm2Yiuu.getClass();
        sb.append(gm0Var.rtx2ld2ELZv4);
        sb.append(TSizfFm2Yiuu != null ? " " + TSizfFm2Yiuu.RAsUl2FVSrh6 : "");
        ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq(sb.toString());
        if (z3) {
            hj0 hj0Var = (hj0) xbVar.Y1f8riQaR6yg;
            int size = hj0Var.size();
            for (int i = 0; i < size; i++) {
                lS5Rgt96tfkO(hj0Var, i);
            }
            ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("--> END " + ((String) xbVar.TSizfFm2Yiuu));
        }
        long nanoTime = System.nanoTime();
        try {
            nv1 lS5Rgt96tfkO = ps1Var.lS5Rgt96tfkO(xbVar);
            long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
            qv1 qv1Var = lS5Rgt96tfkO.r3s1LDPKFs1S;
            qv1Var.getClass();
            long lS5Rgt96tfkO2 = qv1Var.lS5Rgt96tfkO();
            if (lS5Rgt96tfkO2 != -1) {
                z = z3;
                str = lS5Rgt96tfkO2 + "-byte";
            } else {
                z = z3;
                str = "unknown-length";
            }
            boolean z4 = z2;
            cm0 cm0Var = this.PxuCJdSBwIXG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<-- " + lS5Rgt96tfkO.dgRBjINgWbAK);
            if (lS5Rgt96tfkO.wdg6QnbFHrFF.length() > 0) {
                sb2.append(" " + lS5Rgt96tfkO.wdg6QnbFHrFF);
            }
            StringBuilder sb3 = new StringBuilder(" ");
            gm0 gm0Var2 = (gm0) lS5Rgt96tfkO.rtx2ld2ELZv4.lS5Rgt96tfkO;
            gm0Var2.getClass();
            this.TSizfFm2Yiuu.getClass();
            sb3.append(gm0Var2.rtx2ld2ELZv4);
            sb3.append(" (");
            sb3.append(nanoTime2);
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z) {
                sb2.append(", " + str + " body");
            }
            sb2.append(")");
            ((fb0) cm0Var).S9EYkSpbGuxq(sb2.toString());
            if (!z) {
                return lS5Rgt96tfkO;
            }
            hj0 hj0Var2 = lS5Rgt96tfkO.cpQdD2nAriOS;
            int size2 = hj0Var2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                lS5Rgt96tfkO(hj0Var2, i2);
            }
            if (!z4 || !yl0.PxuCJdSBwIXG(lS5Rgt96tfkO)) {
                ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("<-- END HTTP");
                return lS5Rgt96tfkO;
            }
            String PxuCJdSBwIXG = lS5Rgt96tfkO.cpQdD2nAriOS.PxuCJdSBwIXG("Content-Encoding");
            if (PxuCJdSBwIXG != null && !PxuCJdSBwIXG.equalsIgnoreCase("identity") && !PxuCJdSBwIXG.equalsIgnoreCase("gzip")) {
                ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("<-- END HTTP (encoded body omitted)");
                return lS5Rgt96tfkO;
            }
            q51 a92UlCVFR9N8 = lS5Rgt96tfkO.r3s1LDPKFs1S.a92UlCVFR9N8();
            if (a92UlCVFR9N8 != null && a92UlCVFR9N8.lS5Rgt96tfkO.equals("text") && a92UlCVFR9N8.TSizfFm2Yiuu.equals("event-stream")) {
                ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("<-- END HTTP (streaming)");
                return lS5Rgt96tfkO;
            }
            if (qv1Var instanceof uo2) {
                ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("<-- END HTTP (unreadable body)");
                return lS5Rgt96tfkO;
            }
            ig OPXfSBeufaJ8 = qv1Var.OPXfSBeufaJ8();
            OPXfSBeufaJ8.r3s1LDPKFs1S(Long.MAX_VALUE);
            long nanoTime3 = (System.nanoTime() - nanoTime) / 1000000;
            yf PxuCJdSBwIXG2 = OPXfSBeufaJ8.PxuCJdSBwIXG();
            if ("gzip".equalsIgnoreCase(hj0Var2.PxuCJdSBwIXG("Content-Encoding"))) {
                l = Long.valueOf(PxuCJdSBwIXG2.OPXfSBeufaJ8);
                ii0 ii0Var = new ii0(PxuCJdSBwIXG2.clone());
                try {
                    PxuCJdSBwIXG2 = new yf();
                    PxuCJdSBwIXG2.ryVscX7ZL4Ux(ii0Var);
                    ii0Var.close();
                } finally {
                }
            } else {
                l = null;
            }
            q51 a92UlCVFR9N82 = qv1Var.a92UlCVFR9N8();
            if (a92UlCVFR9N82 != null) {
                p51 p51Var = q51.Companion;
                String[] strArr = a92UlCVFR9N82.Y1f8riQaR6yg;
                int i3 = 0;
                int aF05bpZJlKEP = kj0.aF05bpZJlKEP(0, strArr.length - 1, 2);
                if (aF05bpZJlKEP >= 0) {
                    while (!pa2.xbgXKYA2cIfu(strArr[i3], "charset", true)) {
                        if (i3 != aF05bpZJlKEP) {
                            i3 += 2;
                        }
                    }
                    str2 = strArr[i3 + 1];
                    if (str2 != null) {
                        try {
                            charset = Charset.forName(str2);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    charset = null;
                }
                str2 = null;
                if (str2 != null) {
                }
                charset = null;
            }
            charset = pj.PxuCJdSBwIXG;
            PxuCJdSBwIXG2.getClass();
            try {
                es1Var = new es1(new el1(PxuCJdSBwIXG2));
                j = 0;
            } catch (EOFException unused2) {
                nv1Var = lS5Rgt96tfkO;
            }
            while (j < 16) {
                if (es1Var.lS5Rgt96tfkO()) {
                    break;
                }
                es1Var.J54yh1s3n4Aq(1L);
                yf yfVar = es1Var.OPXfSBeufaJ8;
                nv1Var = lS5Rgt96tfkO;
                try {
                    byte cpQdD2nAriOS = yfVar.cpQdD2nAriOS(0L);
                    if ((cpQdD2nAriOS & 224) == 192) {
                        es1Var.J54yh1s3n4Aq(2L);
                    } else if ((cpQdD2nAriOS & 240) == 224) {
                        es1Var.J54yh1s3n4Aq(3L);
                    } else if ((cpQdD2nAriOS & 248) == 240) {
                        es1Var.J54yh1s3n4Aq(4L);
                    }
                    IAToe7bXGz4N = yfVar.IAToe7bXGz4N();
                } catch (EOFException unused3) {
                }
                if (Character.isISOControl(IAToe7bXGz4N) && !Character.isWhitespace(IAToe7bXGz4N)) {
                    ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("");
                    ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("<-- END HTTP (" + nanoTime3 + "ms, binary " + PxuCJdSBwIXG2.OPXfSBeufaJ8 + "-byte body omitted)");
                    return nv1Var;
                }
                j++;
                lS5Rgt96tfkO = nv1Var;
            }
            nv1 nv1Var2 = lS5Rgt96tfkO;
            if (lS5Rgt96tfkO2 != 0) {
                ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq("");
                cm0 cm0Var2 = this.PxuCJdSBwIXG;
                yf clone = PxuCJdSBwIXG2.clone();
                charset.getClass();
                ((fb0) cm0Var2).S9EYkSpbGuxq(clone.ZbWwgt3aGe7A(clone.OPXfSBeufaJ8, charset));
            }
            cm0 cm0Var3 = this.PxuCJdSBwIXG;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("<-- END HTTP (" + nanoTime3 + "ms, " + PxuCJdSBwIXG2.OPXfSBeufaJ8 + "-byte");
            if (l != null) {
                sb4.append(", " + l.longValue() + "-gzipped-byte");
            }
            sb4.append(" body)");
            ((fb0) cm0Var3).S9EYkSpbGuxq(sb4.toString());
            return nv1Var2;
        } catch (Exception e) {
            long nanoTime4 = (System.nanoTime() - nanoTime) / 1000000;
            StringBuilder sb5 = new StringBuilder(" ");
            gm0 gm0Var3 = (gm0) xbVar.lS5Rgt96tfkO;
            gm0Var3.getClass();
            this.TSizfFm2Yiuu.getClass();
            sb5.append(gm0Var3.rtx2ld2ELZv4);
            sb5.append(" (");
            sb5.append(nanoTime4);
            sb5.append("ms)");
            ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq(("<-- HTTP FAILED: " + e + '.').concat(sb5.toString()));
            throw e;
        }
    }

    public final void lS5Rgt96tfkO(hj0 hj0Var, int i) {
        t50 t50Var = this.lS5Rgt96tfkO;
        hj0Var.lS5Rgt96tfkO(i);
        t50Var.getClass();
        String Y1f8riQaR6yg = hj0Var.Y1f8riQaR6yg(i);
        ((fb0) this.PxuCJdSBwIXG).S9EYkSpbGuxq(hj0Var.lS5Rgt96tfkO(i) + ": " + Y1f8riQaR6yg);
    }
}
