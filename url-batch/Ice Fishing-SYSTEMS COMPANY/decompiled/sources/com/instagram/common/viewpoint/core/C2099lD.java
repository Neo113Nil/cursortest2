package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.lD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2099lD implements H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C06464v A00;
    public final AnonymousClass53 A01;

    public C2099lD(AnonymousClass53 anonymousClass53) {
        this.A01 = anonymousClass53;
        this.A00 = new C06464v();
    }

    private C0942Gz A00(C06464v c06464v, long scrValue, long scrTimeUs) {
        int A00;
        int i = -1;
        int i4 = -1;
        long j9 = b.f6539b;
        while (c06464v.A07() >= 4) {
            A00 = C2098lC.A00(c06464v.A0l(), c06464v.A09());
            if (A00 != 442) {
                c06464v.A0g(1);
            } else {
                c06464v.A0g(4);
                long A06 = L6.A06(c06464v);
                if (A06 != b.f6539b) {
                    long A062 = this.A01.A06(A06);
                    if (A062 > scrValue) {
                        if (j9 == b.f6539b) {
                            return C0942Gz.A04(A062, scrTimeUs);
                        }
                        return C0942Gz.A03(i + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + A062;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C0942Gz.A03(c06464v.A09() + scrTimeUs);
                    }
                    j9 = A062;
                    i = c06464v.A09();
                }
                A01(c06464v);
                i4 = c06464v.A09();
            }
        }
        if (j9 != b.f6539b) {
            return C0942Gz.A05(j9, i4 + scrTimeUs);
        }
        return C0942Gz.A03;
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A01(C06464v c06464v) {
        int packStuffingLength;
        int packStuffingLength2;
        int systemHeaderLength = c06464v.A0A();
        if (c06464v.A07() < 10) {
            c06464v.A0f(systemHeaderLength);
            return;
        }
        c06464v.A0g(9);
        int limit = c06464v.A0I();
        int packStuffingLength3 = limit & 7;
        int limit2 = c06464v.A07();
        if (limit2 < packStuffingLength3) {
            c06464v.A0f(systemHeaderLength);
            return;
        }
        c06464v.A0g(packStuffingLength3);
        int limit3 = c06464v.A07();
        if (limit3 < 4) {
            c06464v.A0f(systemHeaderLength);
            return;
        }
        byte[] A0l = c06464v.A0l();
        int limit4 = c06464v.A09();
        packStuffingLength = C2098lC.A00(A0l, limit4);
        if (packStuffingLength == 443) {
            c06464v.A0g(4);
            int packStuffingLength4 = c06464v.A0M();
            int limit5 = c06464v.A07();
            if (limit5 < packStuffingLength4) {
                c06464v.A0f(systemHeaderLength);
                return;
            }
            c06464v.A0g(packStuffingLength4);
        }
        while (limit >= 4) {
            byte[] A0l2 = c06464v.A0l();
            int limit6 = c06464v.A09();
            packStuffingLength2 = C2098lC.A00(A0l2, limit6);
            if (packStuffingLength2 == 442 || packStuffingLength2 == 441 || (packStuffingLength2 >>> 8) != 1) {
                return;
            }
            c06464v.A0g(4);
            if (c06464v.A07() < 2) {
                c06464v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c06464v.A0M();
            int packStuffingLength5 = c06464v.A0A();
            int limit7 = c06464v.A09();
            c06464v.A0f(Math.min(packStuffingLength5, limit7 + nextStartCode));
        }
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final void AFs() {
        this.A00.A0i(C5C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0942Gz AIw(InterfaceC2190ms interfaceC2190ms, long j9) throws IOException {
        long A8n = interfaceC2190ms.A8n();
        int min = (int) Math.min(20000L, interfaceC2190ms.A8O() - A8n);
        this.A00.A0d(min);
        interfaceC2190ms.AGt(this.A00.A0l(), 0, min);
        return A00(this.A00, j9, A8n);
    }
}
