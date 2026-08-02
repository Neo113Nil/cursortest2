package org.bouncycastle.cert.crmf;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.cert.CertIOException;

/* loaded from: classes9.dex */
class CRMFUtil {
    public static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, ASN1Encodable aSN1Encodable) {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z, aSN1Encodable);
        } catch (IOException e) {
            throw new CertIOException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("cannot encode extension: ")), e);
        }
    }

    public static void derEncodeToStream(ASN1Object aSN1Object, OutputStream outputStream) {
        try {
            aSN1Object.encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
        } catch (IOException e) {
            throw new CRMFRuntimeException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to DER encode object: ")), e);
        }
    }
}
