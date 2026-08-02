package org.bouncycastle.pkcs;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class PKCS12PfxPdu {
    private Pfx pfx;

    public PKCS12PfxPdu(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static Pfx parseBytes(byte[] bArr) {
        try {
            return Pfx.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (ClassCastException e) {
            Mod$$ExternalSyntheticBUOutline0.m("malformed data: ", e.getMessage(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            throw new PKCSIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed data: ")), e2);
        }
    }

    public ContentInfo[] getContentInfos() {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(this.pfx.getAuthSafe().getContent()).getOctets());
        ContentInfo[] contentInfoArr = new ContentInfo[aSN1Sequence.size()];
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            contentInfoArr[i] = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
        }
        return contentInfoArr;
    }

    public byte[] getEncoded() {
        return toASN1Structure().getEncoded();
    }

    public AlgorithmIdentifier getMacAlgorithmID() {
        MacData macData = this.pfx.getMacData();
        if (macData != null) {
            return macData.getMac().getAlgorithmId();
        }
        return null;
    }

    public boolean hasMac() {
        return this.pfx.getMacData() != null;
    }

    public boolean isMacValid(PKCS12MacCalculatorBuilderProvider pKCS12MacCalculatorBuilderProvider, char[] cArr) {
        if (!hasMac()) {
            a$$ExternalSyntheticBUOutline0.m$1("no MAC present on PFX");
            return false;
        }
        MacData macData = this.pfx.getMacData();
        try {
            return Arrays.constantTimeAreEqual(new MacDataGenerator(pKCS12MacCalculatorBuilderProvider.get(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), new PKCS12PBEParams(macData.getSalt(), macData.getIterationCount().intValue())))).build(cArr, ASN1OctetString.getInstance(this.pfx.getAuthSafe().getContent()).getOctets()).getEncoded(), this.pfx.getMacData().getEncoded());
        } catch (IOException e) {
            throw new PKCSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to process AuthSafe: ")));
        }
    }

    public Pfx toASN1Structure() {
        return this.pfx;
    }

    public PKCS12PfxPdu(Pfx pfx) {
        this.pfx = pfx;
    }

    public byte[] getEncoded(String str) {
        return toASN1Structure().getEncoded(str);
    }
}
