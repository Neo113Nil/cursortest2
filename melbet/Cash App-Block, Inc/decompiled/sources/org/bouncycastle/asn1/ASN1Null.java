package org.bouncycastle.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class ASN1Null extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Null.class, 5) { // from class: org.bouncycastle.asn1.ASN1Null.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Null.createPrimitive(dEROctetString.getOctets());
        }
    };

    public static ASN1Null createPrimitive(byte[] bArr) {
        if (bArr.length == 0) {
            return DERNull.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$1("malformed NULL encoding encountered");
        return null;
    }

    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj != null) {
            try {
                return (ASN1Null) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m$3(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("failed to construct NULL from byte[]: ")));
            }
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    public static ASN1Null getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Null) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
