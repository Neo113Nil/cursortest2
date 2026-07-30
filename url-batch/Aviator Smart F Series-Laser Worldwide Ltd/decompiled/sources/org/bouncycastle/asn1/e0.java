package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class e0 extends a {
    public e0(int i8, f fVar) {
        this(true, i8, fVar);
    }

    private static byte[] getEncodedVector(g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != gVar.size(); i8++) {
            try {
                byteArrayOutputStream.write(((n) gVar.get(i8)).getEncoded("BER"));
            } catch (IOException e8) {
                throw new ASN1ParsingException("malformed object: " + e8, e8);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] getEncoding(boolean z7, f fVar) {
        byte[] encoded = fVar.toASN1Primitive().getEncoded("BER");
        if (z7) {
            return encoded;
        }
        int lengthOfHeader = a.getLengthOfHeader(encoded);
        int length = encoded.length - lengthOfHeader;
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, lengthOfHeader, bArr, 0, length);
        return bArr;
    }

    @Override // org.bouncycastle.asn1.a, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncodedIndef(z7, this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    public e0(int i8, g gVar) {
        super(true, i8, getEncodedVector(gVar));
    }

    public e0(boolean z7, int i8, f fVar) {
        super(z7 || fVar.toASN1Primitive().isConstructed(), i8, getEncoding(z7, fVar));
    }

    e0(boolean z7, int i8, byte[] bArr) {
        super(z7, i8, bArr);
    }
}
