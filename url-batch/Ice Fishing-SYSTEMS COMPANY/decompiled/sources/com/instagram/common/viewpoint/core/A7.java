package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A7 extends AbstractC2284oQ {
    public int[] A00;
    public int[] A01;

    @Override // com.instagram.common.viewpoint.core.AbstractC2284oQ
    public final C06073i A09(C06073i c06073i) throws C06083j {
        int[] iArr = this.A01;
        if (iArr == null) {
            return C06073i.A05;
        }
        if (c06073i.A02 == 2) {
            int i = c06073i.A01 != iArr.length ? 1 : 0;
            int i4 = 0;
            while (i4 < iArr.length) {
                int i9 = iArr[i4];
                if (i9 < c06073i.A01) {
                    i |= i9 != i4 ? 1 : 0;
                    i4++;
                } else {
                    throw new C06083j(c06073i);
                }
            }
            if (i != 0) {
                return new C06073i(c06073i.A03, iArr.length, 2);
            }
            return C06073i.A05;
        }
        throw new C06083j(c06073i);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2284oQ
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06093k
    public final void AHH(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC06233y.A01(this.A00);
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
