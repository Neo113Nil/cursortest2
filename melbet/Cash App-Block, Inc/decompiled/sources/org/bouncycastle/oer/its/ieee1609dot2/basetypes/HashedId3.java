package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: classes8.dex */
public class HashedId3 extends HashedId {
    public HashedId3(byte[] bArr) {
        super(bArr);
        if (bArr.length == 3) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("hash id not 3 bytes");
        throw null;
    }

    public static HashedId3 getInstance(Object obj) {
        if (obj instanceof HashedId3) {
            return (HashedId3) obj;
        }
        if (obj != null) {
            return new HashedId3(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
