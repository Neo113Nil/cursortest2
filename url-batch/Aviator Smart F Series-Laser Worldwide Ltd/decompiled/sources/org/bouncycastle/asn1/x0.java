package org.bouncycastle.asn1;

import java.util.Date;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class x0 extends j {
    public x0(String str) {
        super(str);
    }

    private byte[] getDERTime() {
        byte[] bArr = this.time;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!hasMinutes()) {
            byte[] bArr2 = this.time;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(Strings.toByteArray("0000Z"), 0, bArr3, this.time.length - 1, 5);
            return bArr3;
        }
        if (!hasSeconds()) {
            byte[] bArr4 = this.time;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(Strings.toByteArray("00Z"), 0, bArr5, this.time.length - 1, 3);
            return bArr5;
        }
        if (!hasFractionalSeconds()) {
            return this.time;
        }
        int length = this.time.length - 2;
        while (length > 0 && this.time[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.time;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = a4.a.T0;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i8 = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i8);
        bArr8[i8] = a4.a.T0;
        return bArr8;
    }

    @Override // org.bouncycastle.asn1.j, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 24, getDERTime());
    }

    @Override // org.bouncycastle.asn1.j, org.bouncycastle.asn1.s
    int encodedLength() {
        int length = getDERTime().length;
        return h2.calculateBodyLength(length) + 1 + length;
    }

    @Override // org.bouncycastle.asn1.j, org.bouncycastle.asn1.s
    s toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.j, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public x0(Date date) {
        super(date);
    }

    public x0(byte[] bArr) {
        super(bArr);
    }
}
