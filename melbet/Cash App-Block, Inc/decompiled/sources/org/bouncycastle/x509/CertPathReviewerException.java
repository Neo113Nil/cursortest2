package org.bouncycastle.x509;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.security.cert.CertPath;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocalizedException;

/* loaded from: classes10.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th, CertPath certPath, int i) {
        super(errorBundle, th);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i == -1) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
        if (i < -1 || i >= certPath.getCertificates().size()) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            throw null;
        }
        this.certPath = certPath;
        this.index = i;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th) {
        super(errorBundle, th);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i == -1) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
        if (i < -1 || i >= certPath.getCertificates().size()) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            throw null;
        }
        this.certPath = certPath;
        this.index = i;
    }
}
