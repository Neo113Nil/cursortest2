package com.instagram.common.viewpoint.core;

import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.jc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1528jc implements GP {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C4J A02 = new C4J();
    public final C4R A03;

    public C1528jc(int i, C4R c4r, int i2) {
        this.A00 = i;
        this.A03 = c4r;
        this.A01 = i2;
    }

    private GN A00(C4J c4j, long j, long j2) {
        int A00;
        int A002;
        int A0A = c4j.A0A();
        long j3 = -1;
        long j4 = -1;
        long lastPcrTimeUsInRange = -9223372036854775807L;
        while (c4j.A07() >= 188 && (A002 = (A00 = AbstractC0553Kg.A00(c4j.A0l(), c4j.A09(), A0A)) + Opcodes.NEWARRAY) <= A0A) {
            long A01 = AbstractC0553Kg.A01(c4j, A00, this.A00);
            if (A01 != -9223372036854775807L) {
                long A06 = this.A03.A06(A01);
                if (A06 > j) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == -9223372036854775807L) {
                        return GN.A04(A06, j2);
                    }
                    return GN.A03(j2 + j3);
                }
                long j5 = A06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j5 > j) {
                        return GN.A03(A00 + j2);
                    }
                    j3 = A00;
                    lastPcrTimeUsInRange = A06;
                } else {
                    A04[4] = "5ynNf";
                    if (j5 > j) {
                        return GN.A03(A00 + j2);
                    }
                    j3 = A00;
                    lastPcrTimeUsInRange = A06;
                }
            }
            c4j.A0f(A002);
            j4 = A002;
        }
        if (lastPcrTimeUsInRange != -9223372036854775807L) {
            return GN.A05(lastPcrTimeUsInRange, j2 + j4);
        }
        return GN.A03;
    }

    @Override // com.instagram.common.viewpoint.core.GP
    public final void AFA() {
        this.A02.A0i(AbstractC01484a.A07);
    }

    @Override // com.instagram.common.viewpoint.core.GP
    public final GN AIC(InterfaceC1625lN interfaceC1625lN, long j) throws IOException {
        long A8f = interfaceC1625lN.A8f();
        int min = (int) Math.min(this.A01, interfaceC1625lN.A8G() - A8f);
        this.A02.A0d(min);
        interfaceC1625lN.AG9(this.A02.A0l(), 0, min);
        return A00(this.A02, j, A8f);
    }
}
