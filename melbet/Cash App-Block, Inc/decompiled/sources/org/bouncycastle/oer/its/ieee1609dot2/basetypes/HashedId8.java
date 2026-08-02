package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1OctetString;

/* loaded from: classes9.dex */
public class HashedId8 extends HashedId {
    public HashedId8(byte[] bArr) {
        super(bArr);
        if (bArr.length == 8) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("hash id not 8 bytes");
        throw null;
    }

    public static HashedId8 getInstance(Object obj) {
        if (obj instanceof HashedId8) {
            return (HashedId8) obj;
        }
        if (obj != null) {
            return new HashedId8(ASN1OctetString.getInstance(obj).getOctets());
        }
        return null;
    }
}
