package org.bouncycastle.asn1.x9;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* loaded from: classes9.dex */
public class DHPublicKey extends ASN1Object {
    private ASN1Integer y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.y = new ASN1Integer(bigInteger);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Invalid DHPublicKey: "));
        return null;
    }

    public BigInteger getY() {
        return this.y.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            this.y = aSN1Integer;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("'y' cannot be null");
            throw null;
        }
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z));
    }
}
