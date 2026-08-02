package org.bouncycastle.oer;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.ASN1Encodable;

/* loaded from: classes8.dex */
public class OEREncoder {
    public static byte[] toByteArray(ASN1Encodable aSN1Encodable, Element element) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new OEROutputStream(byteArrayOutputStream).write(aSN1Encodable, element);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m(e.getMessage(), e);
            return null;
        }
    }
}
