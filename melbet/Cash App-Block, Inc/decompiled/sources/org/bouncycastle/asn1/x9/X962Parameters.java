package org.bouncycastle.asn1.x9;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* loaded from: classes9.dex */
public class X962Parameters extends ASN1Object implements ASN1Choice {
    private ASN1Primitive params;

    public X962Parameters(X9ECParameters x9ECParameters) {
        this.params = null;
        this.params = x9ECParameters.toASN1Primitive();
    }

    public static X962Parameters getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof X962Parameters)) {
            return (X962Parameters) obj;
        }
        if (obj instanceof ASN1Primitive) {
            return new X962Parameters((ASN1Primitive) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return new X962Parameters(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (Exception e) {
                m = Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to parse encoded data: "));
            }
        } else {
            m = "unknown object in getInstance()";
        }
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public ASN1Primitive getParameters() {
        return this.params;
    }

    public boolean isImplicitlyCA() {
        return this.params instanceof ASN1Null;
    }

    public boolean isNamedCurve() {
        return this.params instanceof ASN1ObjectIdentifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.params;
    }

    public X962Parameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.params = aSN1ObjectIdentifier;
    }

    private X962Parameters(ASN1Primitive aSN1Primitive) {
        this.params = aSN1Primitive;
    }

    public X962Parameters(ASN1Null aSN1Null) {
        this.params = aSN1Null;
    }

    public static X962Parameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
        a$$ExternalSyntheticBUOutline0.m$3("choice item must be explicitly tagged");
        return null;
    }
}
