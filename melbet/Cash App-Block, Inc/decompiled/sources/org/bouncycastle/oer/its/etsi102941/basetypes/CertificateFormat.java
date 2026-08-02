package org.bouncycastle.oer.its.etsi102941.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes8.dex */
public class CertificateFormat extends ASN1Object {

    /* renamed from: format, reason: collision with root package name */
    private final int f1601format;

    public CertificateFormat(BigInteger bigInteger) {
        this.f1601format = BigIntegers.intValueExact(bigInteger);
    }

    public static CertificateFormat getInstance(Object obj) {
        if (obj instanceof CertificateFormat) {
            return (CertificateFormat) obj;
        }
        if (obj != null) {
            return new CertificateFormat(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public int getFormat() {
        return this.f1601format;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.f1601format);
    }

    public CertificateFormat(int i) {
        this.f1601format = i;
    }

    private CertificateFormat(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
