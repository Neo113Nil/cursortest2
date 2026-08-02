package org.bouncycastle.cert.crmf;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.MacCalculator;

/* loaded from: classes9.dex */
abstract class PKMACValueGenerator {
    private PKMACValueGenerator() {
    }

    public static PKMACValue generate(PKMACBuilder pKMACBuilder, char[] cArr, SubjectPublicKeyInfo subjectPublicKeyInfo) {
        MacCalculator build = pKMACBuilder.build(cArr);
        OutputStream outputStream = build.getOutputStream();
        try {
            outputStream.write(subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return new PKMACValue(build.getAlgorithmIdentifier(), new DERBitString(build.getMac()));
        } catch (IOException e) {
            throw new CRMFException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("exception encoding mac input: ")), e);
        }
    }
}
