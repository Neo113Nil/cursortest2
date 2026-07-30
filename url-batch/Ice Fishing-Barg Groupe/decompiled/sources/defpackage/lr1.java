package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lr1 {
    public static final kr1 Companion = new kr1();
    public static final List TSizfFm2Yiuu;
    public static final lr1 Y1f8riQaR6yg;
    public static final ah lS5Rgt96tfkO;
    public final sa PxuCJdSBwIXG;

    static {
        ah.Companion.getClass();
        lS5Rgt96tfkO = new ah(Arrays.copyOf(new byte[]{42}, 1));
        TSizfFm2Yiuu = fx1.jJwa0q7P5wHq("*");
        nr1.Companion.getClass();
        Y1f8riQaR6yg = new lr1(new sa());
    }

    public lr1(sa saVar) {
        this.PxuCJdSBwIXG = saVar;
    }

    public static List lS5Rgt96tfkO(String str) {
        List uy1Qfkdvj4xZ = ia2.uy1Qfkdvj4xZ(str, new char[]{'.'});
        if (!cs0.wdg6QnbFHrFF(zk.kRWHK87H9qm4(uy1Qfkdvj4xZ), "")) {
            return uy1Qfkdvj4xZ;
        }
        int size = uy1Qfkdvj4xZ.size() - 1;
        return zk.e(size >= 0 ? size : 0, uy1Qfkdvj4xZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r1 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r5 = (defpackage.ah[]) r2.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r10 >= r9) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        r5[r10] = defpackage.lr1.lS5Rgt96tfkO;
        r11 = defpackage.lr1.Companion;
        r12 = r13.TSizfFm2Yiuu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r12 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        r11 = defpackage.kr1.PxuCJdSBwIXG(r11, r12, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r1 = r1 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r5 >= r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r6 = defpackage.lr1.Companion;
        r9 = r13.Y1f8riQaR6yg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r9 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        r6 = defpackage.kr1.PxuCJdSBwIXG(r6, r9, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        r13 = defpackage.ia2.uy1Qfkdvj4xZ("!".concat(r6), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0117, code lost:
    
        if (r0.size() != r13.size()) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0123, code lost:
    
        if (((java.lang.String) r13.get(0)).charAt(0) == '!') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:
    
        if (((java.lang.String) r13.get(0)).charAt(0) != '!') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        r0 = r0.size();
        r13 = r13.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        r0 = r0 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        r14 = new defpackage.fl(0, lS5Rgt96tfkO(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014f, code lost:
    
        if (r0 < 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        if (r0 != 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        if ((r14 instanceof defpackage.s30) == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:
    
        r14 = ((defpackage.s30) r14).PxuCJdSBwIXG(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015f, code lost:
    
        r14 = new defpackage.r30(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        return defpackage.z32.yQRudnv4La6p(r14, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
    
        defpackage.u9.e9gEMXR7LXtO(defpackage.o0.OPXfSBeufaJ8(r0, "Requested element count ", " is less than zero."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013c, code lost:
    
        r0 = r0.size();
        r13 = r13.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        if (r8 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        if (r11 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e5, code lost:
    
        r13 = defpackage.lr1.TSizfFm2Yiuu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        r1 = defpackage.p50.rtx2ld2ELZv4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ec, code lost:
    
        r2 = defpackage.ia2.uy1Qfkdvj4xZ(r8, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f6, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f8, code lost:
    
        r1 = defpackage.ia2.uy1Qfkdvj4xZ(r11, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0108, code lost:
    
        if (r2.size() <= r1.size()) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010a, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010c, code lost:
    
        r13 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f5, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c7, code lost:
    
        defpackage.cs0.tmVwIGCQF4zR("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00cd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ac, code lost:
    
        defpackage.cs0.tmVwIGCQF4zR("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b0, code lost:
    
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String PxuCJdSBwIXG(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List lS5Rgt96tfkO2 = lS5Rgt96tfkO(unicode);
        sa saVar = this.PxuCJdSBwIXG;
        AtomicBoolean atomicBoolean = saVar.PxuCJdSBwIXG;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                saVar.lS5Rgt96tfkO.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        saVar.lS5Rgt96tfkO();
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    saVar.e9gEMXR7LXtO = e;
                    if (z) {
                    }
                }
            }
        }
        if (saVar.TSizfFm2Yiuu == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) saVar.a92UlCVFR9N8) + " resource.");
            illegalStateException.initCause(saVar.e9gEMXR7LXtO);
            throw illegalStateException;
        }
        int size = lS5Rgt96tfkO2.size();
        ah[] ahVarArr = new ah[size];
        for (int i = 0; i < size; i++) {
            zg zgVar = ah.Companion;
            String str3 = (String) lS5Rgt96tfkO2.get(i);
            zgVar.getClass();
            ahVarArr[i] = zg.lS5Rgt96tfkO(str3);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str2 = null;
                break;
            }
            kr1 kr1Var = Companion;
            ah ahVar = saVar.TSizfFm2Yiuu;
            if (ahVar == null) {
                cs0.tmVwIGCQF4zR("bytes");
                throw null;
            }
            str2 = kr1.PxuCJdSBwIXG(kr1Var, ahVar, ahVarArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
    }
}
