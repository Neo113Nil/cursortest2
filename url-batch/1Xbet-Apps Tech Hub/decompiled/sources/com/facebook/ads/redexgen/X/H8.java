package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class H8 {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gc) STATIC call: com.facebook.ads.redexgen.X.Hx.A0W(com.facebook.ads.redexgen.X.Gc):void A[MD:(com.facebook.ads.redexgen.X.Gc):void (m)], block:B:44:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gc) STATIC call: com.facebook.ads.redexgen.X.Hx.A0W(com.facebook.ads.redexgen.X.Gc):void A[MD:(com.facebook.ads.redexgen.X.Gc):void (m)], block:B:46:0x00ae */
    public static long A00(C0516Gg c0516Gg, long j, long j2, InterfaceC0512Gc interfaceC0512Gc, byte[] bArr, C0545Hl c0545Hl, int i, H7 h7) throws IOException, InterruptedException {
        InterfaceC0512Gc interfaceC0512Gc2;
        while (true) {
            if (c0545Hl != null) {
                c0545Hl.A01(i);
            }
            try {
                break;
            } catch (C0544Hk unused) {
            } finally {
                C0557Hx.A0W(interfaceC0512Gc2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0516Gg c0516Gg2 = new C0516Gg(c0516Gg.A04, c0516Gg.A06, j, (c0516Gg.A03 + j) - c0516Gg.A01, -1L, c0516Gg.A05, c0516Gg.A00 | 2);
        long ADb = interfaceC0512Gc2.ADb(c0516Gg2);
        if (h7.A01 == -1 && ADb != -1) {
            h7.A01 = c0516Gg2.A01 + ADb;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = interfaceC0512Gc2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (read != -1) {
                j3 += read;
                h7.A02 += read;
            } else if (h7.A01 == -1) {
                h7.A01 = c0516Gg2.A01 + j3;
            }
        }
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0516Gg c0516Gg) {
        if (c0516Gg.A05 != null) {
            return c0516Gg.A05;
        }
        Uri uri = c0516Gg.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0516Gg c0516Gg, H2 h2, V0 v0, byte[] bArr, C0545Hl c0545Hl, int i, H7 h7, AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        long start;
        H7 h72 = h7;
        HI.A01(v0);
        HI.A01(bArr);
        if (h72 != null) {
            A04(c0516Gg, h2, h72);
        } else {
            h72 = new H7();
        }
        String A02 = A02(c0516Gg);
        long j = c0516Gg.A01;
        long start2 = c0516Gg.A02;
        if (start2 != -1) {
            start = c0516Gg.A02;
        } else {
            start = h2.A6Q(A02);
        }
        while (true) {
            long j2 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6B = h2.A6B(A02, j, start != -1 ? start : Long.MAX_VALUE);
                    if (A6B <= 0) {
                        long j3 = -A6B;
                        A6B = j3;
                        if (A00(c0516Gg, j, j3, v0, bArr, c0545Hl, i, h72) < A6B) {
                            if (!z || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j += A6B;
                    if (start != -1) {
                        j2 = A6B;
                    }
                    start -= j2;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0516Gg c0516Gg, H2 h2, H7 h7) {
        long left;
        String A02 = A02(c0516Gg);
        long j = c0516Gg.A01;
        if (c0516Gg.A02 != -1) {
            left = c0516Gg.A02;
        } else {
            left = h2.A6Q(A02);
        }
        h7.A01 = left;
        h7.A00 = 0L;
        h7.A02 = 0L;
        while (left != 0) {
            long A6B = h2.A6B(A02, j, left != -1 ? left : Long.MAX_VALUE);
            if (A6B > 0) {
                h7.A00 += A6B;
            } else {
                A6B = -A6B;
                if (A6B == Long.MAX_VALUE) {
                    return;
                }
            }
            j += A6B;
            if (left == -1) {
                A6B = 0;
            }
            left -= A6B;
        }
    }

    public static void A05(H2 h2, String str) {
        Iterator<H6> it = h2.A6C(str).iterator();
        while (it.hasNext()) {
            try {
                h2.AEZ(it.next());
            } catch (H0 unused) {
            }
        }
    }
}
