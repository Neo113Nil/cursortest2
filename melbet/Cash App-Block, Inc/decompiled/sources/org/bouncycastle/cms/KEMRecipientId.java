package org.bouncycastle.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;

/* loaded from: classes9.dex */
public class KEMRecipientId extends PKIXRecipientId {
    public KEMRecipientId(X500Name x500Name, BigInteger bigInteger) {
        super(4, x500Name, bigInteger, null);
    }

    @Override // org.bouncycastle.cms.PKIXRecipientId, org.bouncycastle.cms.RecipientId, org.bouncycastle.util.Selector
    public Object clone() {
        return new KEMRecipientId(this.baseSelector);
    }

    @Override // org.bouncycastle.cms.PKIXRecipientId, org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return obj instanceof KEMRecipientInformation ? ((KEMRecipientInformation) obj).getRID().equals(this) : super.match(obj);
    }

    public KEMRecipientId(X500Name x500Name, BigInteger bigInteger, byte[] bArr) {
        super(4, x500Name, bigInteger, bArr);
    }

    private KEMRecipientId(X509CertificateHolderSelector x509CertificateHolderSelector) {
        super(4, x509CertificateHolderSelector);
    }

    public KEMRecipientId(byte[] bArr) {
        super(4, null, null, bArr);
    }
}
