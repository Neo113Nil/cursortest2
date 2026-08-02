package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;

/* loaded from: classes8.dex */
public class SubjectAssurance extends DEROctetString {
    public SubjectAssurance(byte[] bArr) {
        super(bArr);
        if (bArr.length == 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("length is not 1");
        throw null;
    }

    public static SubjectAssurance getInstance(Object obj) {
        if (obj instanceof SubjectAssurance) {
            return (SubjectAssurance) obj;
        }
        if (obj != null) {
            return new SubjectAssurance(ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    private SubjectAssurance(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }
}
