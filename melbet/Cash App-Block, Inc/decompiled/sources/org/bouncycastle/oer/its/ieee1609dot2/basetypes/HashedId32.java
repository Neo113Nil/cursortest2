package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: classes8.dex */
public class HashedId32 extends HashedId {
    public HashedId32(byte[] bArr) {
        super(bArr);
        if (bArr.length == 32) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("hash id not 32 bytes");
        throw null;
    }

    public static HashedId32 getInstance(Object obj) {
        if (obj instanceof HashedId32) {
            return (HashedId32) obj;
        }
        if (obj != null) {
            return new HashedId32(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
