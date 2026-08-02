package org.bouncycastle.cert.crmf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.CertRequest;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.crmf.POPOSigningKey;
import org.bouncycastle.asn1.crmf.POPOSigningKeyInput;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;

/* loaded from: classes9.dex */
public class ProofOfPossessionSigningKeyBuilder {
    private CertRequest certRequest;
    private GeneralName name;
    private SubjectPublicKeyInfo pubKeyInfo;
    private PKMACValue publicKeyMAC;

    public ProofOfPossessionSigningKeyBuilder(CertRequest certRequest) {
        this.certRequest = certRequest;
    }

    public POPOSigningKey build(ContentSigner contentSigner) {
        GeneralName generalName = this.name;
        POPOSigningKeyInput pOPOSigningKeyInput = null;
        if (generalName != null && this.publicKeyMAC != null) {
            a$$ExternalSyntheticBUOutline0.m$1("name and publicKeyMAC cannot both be set.");
            return null;
        }
        CertRequest certRequest = this.certRequest;
        if (certRequest != null) {
            CRMFUtil.derEncodeToStream(certRequest, contentSigner.getOutputStream());
        } else {
            pOPOSigningKeyInput = generalName != null ? new POPOSigningKeyInput(generalName, this.pubKeyInfo) : new POPOSigningKeyInput(this.publicKeyMAC, this.pubKeyInfo);
            CRMFUtil.derEncodeToStream(pOPOSigningKeyInput, contentSigner.getOutputStream());
        }
        return new POPOSigningKey(pOPOSigningKeyInput, contentSigner.getAlgorithmIdentifier(), new DERBitString(contentSigner.getSignature()));
    }

    public ProofOfPossessionSigningKeyBuilder setPublicKeyMac(PKMACBuilder pKMACBuilder, char[] cArr) {
        this.publicKeyMAC = PKMACValueGenerator.generate(pKMACBuilder, cArr, this.pubKeyInfo);
        return this;
    }

    public ProofOfPossessionSigningKeyBuilder setSender(GeneralName generalName) {
        this.name = generalName;
        return this;
    }

    public ProofOfPossessionSigningKeyBuilder(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.pubKeyInfo = subjectPublicKeyInfo;
    }
}
