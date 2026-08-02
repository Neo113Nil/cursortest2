package org.bouncycastle.asn1.dvcs;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes9.dex */
public class DVCSResponse extends ASN1Object implements ASN1Choice {
    private DVCSCertInfo dvCertInfo;
    private DVCSErrorNotice dvErrorNote;

    public DVCSResponse(DVCSCertInfo dVCSCertInfo) {
        this.dvCertInfo = dVCSCertInfo;
    }

    public static DVCSResponse getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof DVCSResponse)) {
            return (DVCSResponse) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e) {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("failed to construct sequence from byte[]: "));
            }
        } else {
            if (obj instanceof ASN1Sequence) {
                return new DVCSResponse(DVCSCertInfo.getInstance(obj));
            }
            if (obj instanceof ASN1TaggedObject) {
                return new DVCSResponse(DVCSErrorNotice.getInstance(ASN1TaggedObject.getInstance(obj), false));
            }
            m = Boxes$$ExternalSyntheticOutline1.m(obj, "Couldn't convert from object to DVCSResponse: ");
        }
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public DVCSCertInfo getCertInfo() {
        return this.dvCertInfo;
    }

    public DVCSErrorNotice getErrorNotice() {
        return this.dvErrorNote;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DVCSCertInfo dVCSCertInfo = this.dvCertInfo;
        return dVCSCertInfo != null ? dVCSCertInfo.toASN1Primitive() : new DERTaggedObject(false, 0, (ASN1Encodable) this.dvErrorNote);
    }

    public String toString() {
        StringBuilder sb;
        String dVCSErrorNotice;
        if (this.dvCertInfo != null) {
            sb = new StringBuilder("DVCSResponse {\ndvCertInfo: ");
            dVCSErrorNotice = this.dvCertInfo.toString();
        } else {
            sb = new StringBuilder("DVCSResponse {\ndvErrorNote: ");
            dVCSErrorNotice = this.dvErrorNote.toString();
        }
        sb.append(dVCSErrorNotice);
        sb.append("}\n");
        return sb.toString();
    }

    public DVCSResponse(DVCSErrorNotice dVCSErrorNotice) {
        this.dvErrorNote = dVCSErrorNotice;
    }

    public static DVCSResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
