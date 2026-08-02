package org.bouncycastle.crypto.parsers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public class ECIESPublicKeyParser implements KeyParser {
    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.ecParams = eCDomainParameters;
    }

    @Override // org.bouncycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) {
        boolean z;
        int read = inputStream.read();
        if (read < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (read == 0) {
            a$$ExternalSyntheticBUOutline0.m$4("Sender's public key invalid.");
            return null;
        }
        if (read == 2 || read == 3) {
            z = true;
        } else {
            if (read != 4 && read != 6 && read != 7) {
                a$$ExternalSyntheticBUOutline0.m$4(Integer.toString(read, 16), "Sender's public key has invalid point encoding 0x");
                return null;
            }
            z = false;
        }
        ECCurve curve = this.ecParams.getCurve();
        int affinePointEncodingLength = curve.getAffinePointEncodingLength(z);
        byte[] bArr = new byte[affinePointEncodingLength];
        bArr[0] = (byte) read;
        int i = affinePointEncodingLength - 1;
        if (Streams.readFully(inputStream, bArr, 1, i) == i) {
            return new ECPublicKeyParameters(curve.decodePoint(bArr), this.ecParams);
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }
}
