package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1533jh implements GP {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C4J A00;
    public final C4R A01;

    public C1533jh(C4R c4r) {
        this.A01 = c4r;
        this.A00 = new C4J();
    }

    private GN A00(C4J c4j, long scrValue, long scrTimeUs) {
        int A00;
        int i = -1;
        int i2 = -1;
        long j = -9223372036854775807L;
        while (c4j.A07() >= 4) {
            A00 = C1532jg.A00(c4j.A0l(), c4j.A09());
            if (A00 != 442) {
                c4j.A0g(1);
            } else {
                c4j.A0g(4);
                long A06 = KU.A06(c4j);
                if (A06 != -9223372036854775807L) {
                    long A062 = this.A01.A06(A06);
                    if (A062 > scrValue) {
                        if (j == -9223372036854775807L) {
                            return GN.A04(A062, scrTimeUs);
                        }
                        return GN.A03(i + scrTimeUs);
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
                        return GN.A03(c4j.A09() + scrTimeUs);
                    }
                    j = A062;
                    i = c4j.A09();
                }
                A01(c4j);
                i2 = c4j.A09();
            }
        }
        if (j != -9223372036854775807L) {
            return GN.A05(j, i2 + scrTimeUs);
        }
        return GN.A03;
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A01(C4J c4j) {
        int packStuffingLength;
        int packStuffingLength2;
        int systemHeaderLength = c4j.A0A();
        if (c4j.A07() < 10) {
            c4j.A0f(systemHeaderLength);
            return;
        }
        c4j.A0g(9);
        int limit = c4j.A0I();
        int packStuffingLength3 = limit & 7;
        int limit2 = c4j.A07();
        if (limit2 < packStuffingLength3) {
            c4j.A0f(systemHeaderLength);
            return;
        }
        c4j.A0g(packStuffingLength3);
        int limit3 = c4j.A07();
        if (limit3 < 4) {
            c4j.A0f(systemHeaderLength);
            return;
        }
        byte[] A0l = c4j.A0l();
        int limit4 = c4j.A09();
        packStuffingLength = C1532jg.A00(A0l, limit4);
        if (packStuffingLength == 443) {
            c4j.A0g(4);
            int packStuffingLength4 = c4j.A0M();
            int limit5 = c4j.A07();
            if (limit5 < packStuffingLength4) {
                c4j.A0f(systemHeaderLength);
                return;
            }
            c4j.A0g(packStuffingLength4);
        }
        while (limit >= 4) {
            byte[] A0l2 = c4j.A0l();
            int limit6 = c4j.A09();
            packStuffingLength2 = C1532jg.A00(A0l2, limit6);
            if (packStuffingLength2 == 442 || packStuffingLength2 == 441 || (packStuffingLength2 >>> 8) != 1) {
                return;
            }
            c4j.A0g(4);
            if (c4j.A07() < 2) {
                c4j.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c4j.A0M();
            int packStuffingLength5 = c4j.A0A();
            int limit7 = c4j.A09();
            c4j.A0f(Math.min(packStuffingLength5, limit7 + nextStartCode));
        }
    }

    @Override // com.instagram.common.viewpoint.core.GP
    public final void AFA() {
        this.A00.A0i(AbstractC01484a.A07);
    }

    @Override // com.instagram.common.viewpoint.core.GP
    public final GN AIC(InterfaceC1625lN interfaceC1625lN, long j) throws IOException {
        long A8f = interfaceC1625lN.A8f();
        int min = (int) Math.min(20000L, interfaceC1625lN.A8G() - A8f);
        this.A00.A0d(min);
        interfaceC1625lN.AG9(this.A00.A0l(), 0, min);
        return A00(this.A00, j, A8f);
    }
}
