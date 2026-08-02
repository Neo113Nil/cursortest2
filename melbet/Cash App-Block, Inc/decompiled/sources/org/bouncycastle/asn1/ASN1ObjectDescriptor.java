package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class ASN1ObjectDescriptor extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1ObjectDescriptor.class, 7) { // from class: org.bouncycastle.asn1.ASN1ObjectDescriptor.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return new ASN1ObjectDescriptor((ASN1GraphicString) ASN1GraphicString.TYPE.fromImplicitConstructed(aSN1Sequence));
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return new ASN1ObjectDescriptor((ASN1GraphicString) ASN1GraphicString.TYPE.fromImplicitPrimitive(dEROctetString));
        }
    };
    private final ASN1GraphicString baseGraphicString;

    public ASN1ObjectDescriptor(ASN1GraphicString aSN1GraphicString) {
        if (aSN1GraphicString != null) {
            this.baseGraphicString = aSN1GraphicString;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("'baseGraphicString' cannot be null");
            throw null;
        }
    }

    public static ASN1ObjectDescriptor createPrimitive(byte[] bArr) {
        return new ASN1ObjectDescriptor(ASN1GraphicString.createPrimitive(bArr));
    }

    public static ASN1ObjectDescriptor getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1ObjectDescriptor)) {
            return (ASN1ObjectDescriptor) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
                return (ASN1ObjectDescriptor) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1ObjectDescriptor) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("failed to construct object descriptor from byte[]: "));
            }
        }
        m = Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: ");
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            return this.baseGraphicString.asn1Equals(((ASN1ObjectDescriptor) aSN1Primitive).baseGraphicString);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeIdentifier(z, 7);
        this.baseGraphicString.encode(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return this.baseGraphicString.encodedLength(z);
    }

    public ASN1GraphicString getBaseGraphicString() {
        return this.baseGraphicString;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return ~this.baseGraphicString.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        ASN1GraphicString aSN1GraphicString = (ASN1GraphicString) this.baseGraphicString.toDERObject();
        return aSN1GraphicString == this.baseGraphicString ? this : new ASN1ObjectDescriptor(aSN1GraphicString);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        ASN1GraphicString aSN1GraphicString = (ASN1GraphicString) this.baseGraphicString.toDLObject();
        return aSN1GraphicString == this.baseGraphicString ? this : new ASN1ObjectDescriptor(aSN1GraphicString);
    }

    public static ASN1ObjectDescriptor getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1ObjectDescriptor) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
