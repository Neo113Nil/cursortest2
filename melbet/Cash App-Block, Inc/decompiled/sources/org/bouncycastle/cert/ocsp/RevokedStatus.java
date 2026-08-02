package org.bouncycastle.cert.ocsp;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Date;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ocsp.RevokedInfo;
import org.bouncycastle.asn1.x509.CRLReason;

/* loaded from: classes9.dex */
public class RevokedStatus implements CertificateStatus {
    RevokedInfo info;

    public RevokedStatus(Date date, int i) {
        this.info = new RevokedInfo(new ASN1GeneralizedTime(date), CRLReason.lookup(i));
    }

    public int getRevocationReason() {
        if (this.info.getRevocationReason() != null) {
            return this.info.getRevocationReason().getValue().intValue();
        }
        a$$ExternalSyntheticBUOutline0.m$1("attempt to get a reason where none is available");
        return 0;
    }

    public Date getRevocationTime() {
        return OCSPUtils.extractDate(this.info.getRevocationTime());
    }

    public boolean hasRevocationReason() {
        return this.info.getRevocationReason() != null;
    }

    public RevokedStatus(Date date) {
        this.info = new RevokedInfo(new ASN1GeneralizedTime(date));
    }

    public RevokedStatus(RevokedInfo revokedInfo) {
        this.info = revokedInfo;
    }
}
