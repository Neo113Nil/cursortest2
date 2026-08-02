package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class X9ECPoint extends ASN1Object {
    private ECCurve c;

    /* renamed from: encoding, reason: collision with root package name */
    private final ASN1OctetString f1568encoding;
    private ECPoint p;

    public X9ECPoint(ECPoint eCPoint, boolean z) {
        this.p = eCPoint.normalize();
        this.f1568encoding = new DEROctetString(eCPoint.getEncoded(z));
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.p == null) {
                this.p = this.c.decodePoint(this.f1568encoding.getOctets()).normalize();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.f1568encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b;
        byte[] octets = this.f1568encoding.getOctets();
        return octets != null && octets.length > 0 && ((b = octets[0]) == 2 || b == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f1568encoding;
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.c = eCCurve;
        this.f1568encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }
}
