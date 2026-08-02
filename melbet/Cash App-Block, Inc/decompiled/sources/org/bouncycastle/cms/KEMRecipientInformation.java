package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes9.dex */
public class KEMRecipientInformation extends RecipientInformation {
    private KEMRecipientInfo info;

    public KEMRecipientInformation(KEMRecipientInfo kEMRecipientInfo, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable) {
        super(kEMRecipientInfo.getKem(), algorithmIdentifier, cMSSecureReadable);
        KEMRecipientId kEMRecipientId;
        this.info = kEMRecipientInfo;
        RecipientIdentifier recipientIdentifier = kEMRecipientInfo.getRecipientIdentifier();
        boolean isTagged = recipientIdentifier.isTagged();
        ASN1Encodable id = recipientIdentifier.getId();
        if (isTagged) {
            kEMRecipientId = new KEMRecipientId(ASN1OctetString.getInstance(id).getOctets());
        } else {
            IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(id);
            kEMRecipientId = new KEMRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
        }
        this.rid = kEMRecipientId;
    }

    @Override // org.bouncycastle.cms.RecipientInformation
    public RecipientOperator getRecipientOperator(Recipient recipient) {
        return ((KEMRecipient) recipient).getRecipientOperator(new AlgorithmIdentifier(this.keyEncAlg.getAlgorithm(), this.info), this.messageAlgorithm, this.info.getEncryptedKey().getOctets());
    }
}
