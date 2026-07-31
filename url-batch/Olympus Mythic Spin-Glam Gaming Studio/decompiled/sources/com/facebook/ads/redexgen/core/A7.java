package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC3663oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3663oQ
    public final C19863i A09(C19863i c19863i) throws C19873j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C19863i.A05;
        }
        if (c19863i.A02 == 2) {
            int i = c19863i.A01 != iArr.length ? 1 : 0;
            int i2 = 0;
            while (i2 < iArr.length) {
                int i3 = iArr[i2];
                if (i3 < c19863i.A01) {
                    i |= i3 != i2 ? 1 : 0;
                    i2++;
                } else {
                    throw new C19873j(c19863i);
                }
            }
            if (i != 0) {
                return new C19863i(c19863i.A03, iArr.length, 2);
            }
            return C19863i.A05;
        }
        throw new C19873j(c19863i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3663oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC20023y.A01(this.A00);
        int position = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position2 = outputSize - position;
        ByteBuffer A00 = A00(this.A06.A00 * (position2 / this.A05.A00));
        while (position < outputSize) {
            for (int i : iArr) {
                A00.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        A00.flip();
    }
}
