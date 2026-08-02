package org.bouncycastle.pkix;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;

/* loaded from: classes9.dex */
public class PKIXNameConstraintValidator {
    ASN1PKIXNameConstraintValidator validator = new ASN1PKIXNameConstraintValidator();

    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        this.validator.addExcludedSubtree(generalSubtree);
    }

    public void checkExcluded(GeneralName generalName) {
        try {
            this.validator.checkExcluded(generalName);
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkExcludedDN(ASN1Sequence aSN1Sequence) {
        try {
            this.validator.checkExcludedDN(X500Name.getInstance(aSN1Sequence));
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermitted(GeneralName generalName) {
        try {
            this.validator.checkPermitted(generalName);
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermittedDN(ASN1Sequence aSN1Sequence) {
        try {
            this.validator.checkPermittedDN(X500Name.getInstance(aSN1Sequence));
        } catch (NameConstraintValidatorException e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PKIXNameConstraintValidator) {
            return this.validator.equals(((PKIXNameConstraintValidator) obj).validator);
        }
        return false;
    }

    public int hashCode() {
        return this.validator.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i) {
        this.validator.intersectEmptyPermittedSubtree(i);
    }

    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        this.validator.intersectPermittedSubtree(generalSubtree);
    }

    public String toString() {
        return this.validator.toString();
    }

    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        this.validator.intersectPermittedSubtree(generalSubtreeArr);
    }
}
