package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Objects;

/* loaded from: classes9.dex */
public abstract class ASN1External extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1External.class, 8) { // from class: org.bouncycastle.asn1.ASN1External.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1External();
        }
    };
    ASN1Primitive dataValueDescriptor;
    ASN1ObjectIdentifier directReference;

    /* renamed from: encoding, reason: collision with root package name */
    int f1560encoding;
    ASN1Primitive externalContent;
    ASN1Integer indirectReference;

    public ASN1External(ASN1Sequence aSN1Sequence) {
        int i = 0;
        ASN1Primitive objFromSequence = getObjFromSequence(aSN1Sequence, 0);
        if (objFromSequence instanceof ASN1ObjectIdentifier) {
            this.directReference = (ASN1ObjectIdentifier) objFromSequence;
            objFromSequence = getObjFromSequence(aSN1Sequence, 1);
            i = 1;
        }
        if (objFromSequence instanceof ASN1Integer) {
            this.indirectReference = (ASN1Integer) objFromSequence;
            i++;
            objFromSequence = getObjFromSequence(aSN1Sequence, i);
        }
        if (!(objFromSequence instanceof ASN1TaggedObject)) {
            this.dataValueDescriptor = objFromSequence;
            i++;
            objFromSequence = getObjFromSequence(aSN1Sequence, i);
        }
        if (aSN1Sequence.size() != i + 1) {
            a$$ExternalSyntheticBUOutline0.m$3("input sequence too large");
            throw null;
        }
        if (!(objFromSequence instanceof ASN1TaggedObject)) {
            a$$ExternalSyntheticBUOutline0.m$3("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objFromSequence;
        this.f1560encoding = checkEncoding(aSN1TaggedObject.getTagNo());
        this.externalContent = getExternalContent(aSN1TaggedObject);
    }

    private static int checkEncoding(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "invalid encoding value: "));
        return 0;
    }

    private static ASN1Primitive checkExternalContent(int i, ASN1Primitive aSN1Primitive) {
        ASN1UniversalType aSN1UniversalType;
        if (i == 1) {
            aSN1UniversalType = ASN1OctetString.TYPE;
        } else {
            if (i != 2) {
                return aSN1Primitive;
            }
            aSN1UniversalType = ASN1BitString.TYPE;
        }
        return aSN1UniversalType.checkedCast(aSN1Primitive);
    }

    private static ASN1Primitive getExternalContent(ASN1TaggedObject aSN1TaggedObject) {
        ASN1Util.checkContextTagClass(aSN1TaggedObject);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return aSN1TaggedObject.getExplicitBaseObject().toASN1Primitive();
        }
        if (tagNo == 1) {
            return ASN1OctetString.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 2) {
            return ASN1BitString.getInstance(aSN1TaggedObject, false);
        }
        Path$$ExternalSyntheticBUOutline0.m(ASN1Util.getTagText(aSN1TaggedObject), "invalid tag: ");
        return null;
    }

    public static ASN1External getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1External)) {
            return (ASN1External) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1External) {
                return (ASN1External) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1External) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("failed to construct external from byte[]: "));
            }
        }
        m = Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: ");
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    private static ASN1Primitive getObjFromSequence(ASN1Sequence aSN1Sequence, int i) {
        if (aSN1Sequence.size() > i) {
            return aSN1Sequence.getObjectAt(i).toASN1Primitive();
        }
        a$$ExternalSyntheticBUOutline0.m$3("too few objects in input sequence");
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            return false;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        return Objects.areEqual(this.directReference, aSN1External.directReference) && Objects.areEqual(this.indirectReference, aSN1External.indirectReference) && Objects.areEqual(this.dataValueDescriptor, aSN1External.dataValueDescriptor) && this.f1560encoding == aSN1External.f1560encoding && this.externalContent.equals(aSN1External.externalContent);
    }

    public abstract ASN1Sequence buildSequence();

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeIdentifier(z, 40);
        buildSequence().encode(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return buildSequence().encodedLength(z);
    }

    public ASN1Primitive getDataValueDescriptor() {
        return this.dataValueDescriptor;
    }

    public ASN1ObjectIdentifier getDirectReference() {
        return this.directReference;
    }

    public int getEncoding() {
        return this.f1560encoding;
    }

    public ASN1Integer getIndirectReference() {
        return this.indirectReference;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.externalContent.hashCode() ^ (((Objects.hashCode(this.directReference) ^ Objects.hashCode(this.indirectReference)) ^ Objects.hashCode(this.dataValueDescriptor)) ^ this.f1560encoding);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERExternal(this.directReference, this.indirectReference, this.dataValueDescriptor, this.f1560encoding, this.externalContent);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLExternal(this.directReference, this.indirectReference, this.dataValueDescriptor, this.f1560encoding, this.externalContent);
    }

    public ASN1Primitive getExternalContent() {
        return this.externalContent;
    }

    public static ASN1External getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1External) TYPE.getContextInstance(aSN1TaggedObject, z);
    }

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, DERTaggedObject dERTaggedObject) {
        this.directReference = aSN1ObjectIdentifier;
        this.indirectReference = aSN1Integer;
        this.dataValueDescriptor = aSN1Primitive;
        this.f1560encoding = checkEncoding(dERTaggedObject.getTagNo());
        this.externalContent = getExternalContent(dERTaggedObject);
    }

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, int i, ASN1Primitive aSN1Primitive2) {
        this.directReference = aSN1ObjectIdentifier;
        this.indirectReference = aSN1Integer;
        this.dataValueDescriptor = aSN1Primitive;
        this.f1560encoding = checkEncoding(i);
        this.externalContent = checkExternalContent(i, aSN1Primitive2);
    }
}
