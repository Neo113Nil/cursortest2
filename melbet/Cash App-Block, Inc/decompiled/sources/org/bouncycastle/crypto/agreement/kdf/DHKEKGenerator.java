package org.bouncycastle.crypto.agreement.kdf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;
    private byte[] z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) {
        int i3 = i2;
        int i4 = 0;
        int i5 = i;
        if (bArr.length - i3 < i5) {
            f$$ExternalSyntheticLambda0.m$3("output buffer too small");
            return 0;
        }
        long j = i3;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            a$$ExternalSyntheticBUOutline0.m$3("Output length too large");
            return 0;
        }
        long j2 = digestSize;
        int i6 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i7 = 0;
        int i8 = 1;
        while (true) {
            Digest digest = this.digest;
            if (i7 >= i6) {
                digest.reset();
                return (int) j;
            }
            byte[] bArr3 = this.z;
            digest.update(bArr3, i4, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i8)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            }
            aSN1EncodableVector.add(new DERTaggedObject(true, 2, (ASN1Encodable) new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i3 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i5, digestSize);
                    i5 += digestSize;
                    i3 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i5, i3);
                }
                i8++;
                i7++;
                i4 = 0;
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m$3(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to encode parameter info: ")));
                return 0;
            }
        }
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
