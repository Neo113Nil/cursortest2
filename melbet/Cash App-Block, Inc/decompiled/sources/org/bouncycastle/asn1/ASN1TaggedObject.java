package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {
    private static final int DECLARED_EXPLICIT = 1;
    private static final int DECLARED_IMPLICIT = 2;
    private static final int PARSED_EXPLICIT = 3;
    private static final int PARSED_IMPLICIT = 4;
    final int explicitness;
    final ASN1Encodable obj;
    final int tagClass;
    final int tagNo;

    public ASN1TaggedObject(int i, int i2, int i3, ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "invalid tag class: "));
            throw null;
        }
        this.explicitness = aSN1Encodable instanceof ASN1Choice ? 1 : i;
        this.tagClass = i2;
        this.tagNo = i3;
        this.obj = aSN1Encodable;
    }

    private static ASN1TaggedObject checkInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (!z) {
            a$$ExternalSyntheticBUOutline0.m$3("this method not valid for implicitly tagged tagged objects");
            return null;
        }
        if (aSN1TaggedObject != null) {
            return aSN1TaggedObject;
        }
        a$$ExternalSyntheticBUOutline0.m$2("'taggedObject' cannot be null");
        return null;
    }

    private static ASN1TaggedObject checkedCast(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject) aSN1Primitive;
        }
        a$$ExternalSyntheticBUOutline0.m$1("unexpected object: ".concat(aSN1Primitive.getClass().getName()));
        return null;
    }

    public static ASN1Primitive createConstructedDL(int i, int i2, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() == 1 ? new DLTaggedObject(3, i, i2, aSN1EncodableVector.get(0)) : new DLTaggedObject(4, i, i2, DLFactory.createSequence(aSN1EncodableVector));
    }

    public static ASN1Primitive createConstructedIL(int i, int i2, ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() == 1 ? new BERTaggedObject(3, i, i2, aSN1EncodableVector.get(0)) : new BERTaggedObject(4, i, i2, BERFactory.createSequence(aSN1EncodableVector));
    }

    public static ASN1Primitive createPrimitive(int i, int i2, byte[] bArr) {
        return new DLTaggedObject(4, i, i2, new DEROctetString(bArr));
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1TaggedObject) {
                return (ASN1TaggedObject) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return checkedCast(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e) {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("failed to construct tagged object from byte[]: "));
            }
        }
        m = Boxes$$ExternalSyntheticOutline1.m(obj, "unknown object in getInstance: ");
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
        if (this.tagNo != aSN1TaggedObject.tagNo || this.tagClass != aSN1TaggedObject.tagClass) {
            return false;
        }
        if (this.explicitness != aSN1TaggedObject.explicitness && isExplicit() != aSN1TaggedObject.isExplicit()) {
            return false;
        }
        ASN1Primitive aSN1Primitive2 = this.obj.toASN1Primitive();
        ASN1Primitive aSN1Primitive3 = aSN1TaggedObject.obj.toASN1Primitive();
        if (aSN1Primitive2 == aSN1Primitive3) {
            return true;
        }
        if (isExplicit()) {
            return aSN1Primitive2.asn1Equals(aSN1Primitive3);
        }
        try {
            return Arrays.areEqual(getEncoded(), aSN1TaggedObject.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public ASN1Object getBaseObject() {
        ASN1Encodable aSN1Encodable = this.obj;
        return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
    }

    public ASN1Primitive getBaseUniversal(boolean z, ASN1UniversalType aSN1UniversalType) {
        String str;
        if (z) {
            if (isExplicit()) {
                return aSN1UniversalType.checkedCast(this.obj.toASN1Primitive());
            }
            str = "object implicit - explicit expected.";
        } else {
            if (1 != this.explicitness) {
                ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
                int i = this.explicitness;
                return i != 3 ? i != 4 ? aSN1UniversalType.checkedCast(aSN1Primitive) : aSN1Primitive instanceof ASN1Sequence ? aSN1UniversalType.fromImplicitConstructed((ASN1Sequence) aSN1Primitive) : aSN1UniversalType.fromImplicitPrimitive((DEROctetString) aSN1Primitive) : aSN1UniversalType.fromImplicitConstructed(rebuildConstructed(aSN1Primitive));
            }
            str = "object explicit - implicit expected.";
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    public ASN1Object getExplicitBaseObject() {
        if (isExplicit()) {
            ASN1Encodable aSN1Encodable = this.obj;
            return aSN1Encodable instanceof ASN1Object ? (ASN1Object) aSN1Encodable : aSN1Encodable.toASN1Primitive();
        }
        a$$ExternalSyntheticBUOutline0.m$1("object implicit - explicit expected.");
        return null;
    }

    public ASN1TaggedObject getExplicitBaseTagged() {
        if (isExplicit()) {
            return checkedCast(this.obj.toASN1Primitive());
        }
        a$$ExternalSyntheticBUOutline0.m$1("object implicit - explicit expected.");
        return null;
    }

    public ASN1TaggedObject getImplicitBaseTagged(int i, int i2) {
        if (i == 0 || (i & 192) != i) {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "invalid base tag class: "));
            return null;
        }
        int i3 = this.explicitness;
        if (i3 != 1) {
            return i3 != 2 ? replaceTag(i, i2) : ASN1Util.checkTag(checkedCast(this.obj.toASN1Primitive()), i, i2);
        }
        a$$ExternalSyntheticBUOutline0.m$1("object explicit - implicit expected.");
        return null;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive getLoadedObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagClass() {
        return this.tagClass;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this.tagNo;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag(int i) {
        return this.tagClass == 128 && this.tagNo == i;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTag(int i, int i2) {
        return this.tagClass == i && this.tagNo == i2;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasTagClass(int i) {
        return this.tagClass == i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.obj.toASN1Primitive().hashCode() ^ (((this.tagClass * 7919) ^ this.tagNo) ^ (isExplicit() ? 15 : EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
    }

    public boolean isExplicit() {
        int i = this.explicitness;
        return i == 1 || i == 3;
    }

    public boolean isParsed() {
        int i = this.explicitness;
        return i == 3 || i == 4;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z, int i) {
        ASN1Primitive baseUniversal = getBaseUniversal(z, i);
        return i != 3 ? i != 4 ? i != 16 ? i != 17 ? baseUniversal : ((ASN1Set) baseUniversal).parser() : ((ASN1Sequence) baseUniversal).parser() : ((ASN1OctetString) baseUniversal).parser() : ((ASN1BitString) baseUniversal).parser();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() {
        return getExplicitBaseObject();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() {
        return getExplicitBaseTagged();
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) {
        return getImplicitBaseTagged(i, i2);
    }

    public abstract ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive);

    public abstract ASN1TaggedObject replaceTag(int i, int i2);

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLTaggedObject(this.explicitness, this.tagClass, this.tagNo, this.obj);
    }

    public String toString() {
        return ASN1Util.getTagText(this.tagClass, this.tagNo) + this.obj;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public boolean hasContextTag() {
        return this.tagClass == 128;
    }

    private static ASN1TaggedObject checkInstance(Object obj) {
        if (obj != null) {
            return getInstance(obj);
        }
        a$$ExternalSyntheticBUOutline0.m$2("'obj' cannot be null");
        return null;
    }

    public ASN1TaggedObject(boolean z, int i, int i2, ASN1Encodable aSN1Encodable) {
        this(z ? 1 : 2, i, i2, aSN1Encodable);
    }

    public ASN1TaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        this(z, 128, i, aSN1Encodable);
    }

    public static ASN1TaggedObject getInstance(Object obj, int i) {
        return ASN1Util.checkTagClass(checkInstance(obj), i);
    }

    public static ASN1TaggedObject getInstance(Object obj, int i, int i2) {
        return ASN1Util.checkTag(checkInstance(obj), i, i2);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, int i, int i2, boolean z) {
        return ASN1Util.getExplicitBaseTagged(checkInstance(aSN1TaggedObject, z), i, i2);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, int i, boolean z) {
        return ASN1Util.getExplicitBaseTagged(checkInstance(aSN1TaggedObject, z), i);
    }

    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return ASN1Util.getExplicitContextBaseTagged(checkInstance(aSN1TaggedObject, z));
    }

    public ASN1Primitive getBaseUniversal(boolean z, int i) {
        ASN1UniversalType aSN1UniversalType = ASN1UniversalTypes.get(i);
        if (aSN1UniversalType != null) {
            return getBaseUniversal(z, aSN1UniversalType);
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "unsupported UNIVERSAL tag number: "));
        return null;
    }
}
