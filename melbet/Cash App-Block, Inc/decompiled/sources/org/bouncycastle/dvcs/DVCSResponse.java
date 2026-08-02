package org.bouncycastle.dvcs;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.bouncycastle.cms.CMSSignedData;

/* loaded from: classes9.dex */
public class DVCSResponse extends DVCSMessage {
    private org.bouncycastle.asn1.dvcs.DVCSResponse asn1;

    public DVCSResponse(ContentInfo contentInfo) {
        super(contentInfo);
        if (!DVCSObjectIdentifiers.id_ct_DVCSResponseData.equals((ASN1Primitive) contentInfo.getContentType())) {
            throw new DVCSConstructionException("ContentInfo not a DVCS Response");
        }
        try {
            this.asn1 = org.bouncycastle.asn1.dvcs.DVCSResponse.getInstance(contentInfo.getContent().toASN1Primitive() instanceof ASN1Sequence ? contentInfo.getContent() : ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
        } catch (Exception e) {
            throw new DVCSConstructionException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Unable to parse content: ")), e);
        }
    }

    @Override // org.bouncycastle.dvcs.DVCSMessage
    public ASN1Encodable getContent() {
        return this.asn1;
    }

    public DVCSResponse(CMSSignedData cMSSignedData) {
        this(SignedData.getInstance(cMSSignedData.toASN1Structure().getContent()).getEncapContentInfo());
    }
}
