package org.bouncycastle.jce.provider;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: classes9.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8(boolean z) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) {
        if (x509Certificate instanceof BCX509Certificate) {
            try {
            } catch (RuntimeException e) {
                e = e;
            }
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            Mod$$ExternalSyntheticBUOutline0.m$1("unable to process TBSCertificate", e);
            return;
        }
        try {
            TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e2) {
            throw new AnnotatedException(e2.getMessage());
        } catch (CertificateEncodingException e3) {
            Mod$$ExternalSyntheticBUOutline0.m$1("unable to process TBSCertificate", e3);
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        PKIXExtendedParameters pKIXExtendedParameters;
        List<? extends Certificate> list;
        X500Name ca;
        PublicKey cAPublicKey;
        HashSet hashSet;
        int i;
        PKIXCertRevocationChecker pKIXCertRevocationChecker;
        boolean z;
        HashSet hashSet2;
        ArrayList arrayList;
        HashSet hashSet3;
        CertPath certPath2 = certPath;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException(re$$ExternalSyntheticOutline0.m(PKIXParameters.class, new StringBuilder("Parameters must be a "), " instance."));
            }
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (pKIXExtendedParameters.getTrustAnchors() == null) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("trustAnchors is null, this is not allowed for certification path validation.");
            return null;
        }
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath2, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(pKIXExtendedParameters, new Date());
        Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
        try {
            TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
            if (findTrustAnchor == null) {
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath2, -1);
                } catch (AnnotatedException e) {
                    e = e;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, list.size() - 1);
                }
            }
            checkCertificate(findTrustAnchor.getTrustedCert());
            PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
            ArrayList arrayList2 = new ArrayList();
            PKIXCertRevocationChecker pKIXCertRevocationChecker2 = null;
            for (PKIXCertPathChecker pKIXCertPathChecker : build.getCertPathCheckers()) {
                pKIXCertPathChecker.init(false);
                if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                    arrayList2.add(pKIXCertPathChecker);
                } else {
                    if (pKIXCertRevocationChecker2 != null) {
                        throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                    }
                    pKIXCertRevocationChecker2 = pKIXCertPathChecker instanceof PKIXCertRevocationChecker ? (PKIXCertRevocationChecker) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                }
            }
            if (build.isRevocationEnabled() && pKIXCertRevocationChecker2 == null) {
                pKIXCertRevocationChecker2 = new ProvRevocationChecker(this.helper);
            }
            int i2 = size + 1;
            ArrayList[] arrayListArr = new ArrayList[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                arrayListArr[i3] = new ArrayList();
            }
            HashSet hashSet4 = new HashSet();
            int i4 = 1;
            hashSet4.add(RFC3280CertPathUtilities.ANY_POLICY);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet4, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
            arrayListArr[0].add(pKIXPolicyNode);
            PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
            HashSet hashSet5 = new HashSet();
            int i5 = build.isExplicitPolicyRequired() ? 0 : i2;
            int i6 = build.isAnyPolicyInhibited() ? 0 : i2;
            if (build.isPolicyMappingInhibited()) {
                i2 = 0;
            }
            X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
            try {
                if (trustedCert != null) {
                    ca = PrincipalUtils.getSubjectPrincipal(trustedCert);
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    ca = PrincipalUtils.getCA(findTrustAnchor);
                    cAPublicKey = findTrustAnchor.getCAPublicKey();
                }
                try {
                    AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                    algorithmIdentifier.getAlgorithm();
                    algorithmIdentifier.getParameters();
                    if (build.getTargetConstraints() != null && !build.getTargetConstraints().match((Certificate) certificates.get(0))) {
                        Mod$$ExternalSyntheticBUOutline0.m("Target certificate in certification path does not match targetConstraints.", null, certPath2, 0);
                        return null;
                    }
                    int i7 = i5;
                    PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                    int i8 = i7;
                    PublicKey publicKey = cAPublicKey;
                    ArrayList arrayList3 = arrayList2;
                    int size2 = certificates.size() - 1;
                    int i9 = i2;
                    PublicKey publicKey2 = publicKey;
                    X509Certificate x509Certificate = null;
                    int i10 = size;
                    while (size2 >= 0) {
                        int i11 = size - size2;
                        List<? extends Certificate> list2 = certificates;
                        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                        if (size2 == list2.size() - 1) {
                            i = i8;
                            pKIXCertRevocationChecker = pKIXCertRevocationChecker2;
                            z = i4;
                        } else {
                            i = i8;
                            pKIXCertRevocationChecker = pKIXCertRevocationChecker2;
                            z = 0;
                        }
                        try {
                            checkCertificate(x509Certificate2);
                            X509Certificate x509Certificate3 = trustedCert;
                            ArrayList[] arrayListArr2 = arrayListArr;
                            X500Name x500Name = ca;
                            int i12 = i10;
                            TrustAnchor trustAnchor = findTrustAnchor;
                            int i13 = i;
                            certPath2 = certPath;
                            RFC3280CertPathUtilities.processCertA(certPath2, build, validityDate, pKIXCertRevocationChecker, size2, publicKey2, z, x500Name, x509Certificate3);
                            PKIXExtendedParameters pKIXExtendedParameters2 = build;
                            int i14 = size2;
                            PublicKey publicKey3 = publicKey2;
                            Date date = validityDate;
                            PKIXCertRevocationChecker pKIXCertRevocationChecker3 = pKIXCertRevocationChecker;
                            RFC3280CertPathUtilities.processCertBC(certPath2, i14, pKIXNameConstraintValidator, this.isForCRLCheck);
                            HashSet hashSet6 = hashSet5;
                            int i15 = i6;
                            PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath2, i14, RFC3280CertPathUtilities.processCertD(certPath2, i14, hashSet6, pKIXPolicyNode2, arrayListArr2, i15, this.isForCRLCheck));
                            RFC3280CertPathUtilities.processCertF(certPath2, i14, processCertE, i13);
                            if (i11 != size) {
                                if (x509Certificate2 != null) {
                                    hashSet2 = hashSet6;
                                    int i16 = i4;
                                    if (x509Certificate2.getVersion() == i16) {
                                        if (i11 != i16 || !x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                            throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath2, i14);
                                        }
                                    }
                                } else {
                                    hashSet2 = hashSet6;
                                }
                                RFC3280CertPathUtilities.prepareNextCertA(certPath2, i14);
                                PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i14, arrayListArr2, processCertE, i9);
                                RFC3280CertPathUtilities.prepareNextCertG(certPath2, i14, pKIXNameConstraintValidator);
                                int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i14, i13);
                                int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i14, i9);
                                int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i14, i15);
                                int prepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i14, prepareNextCertH1);
                                int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i14, prepareNextCertH2);
                                int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i14, prepareNextCertH3);
                                RFC3280CertPathUtilities.prepareNextCertK(certPath2, i14);
                                i10 = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i14, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i14, i12));
                                RFC3280CertPathUtilities.prepareNextCertN(certPath2, i14);
                                Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs != null) {
                                    hashSet3 = new HashSet(criticalExtensionOIDs);
                                    hashSet3.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                    hashSet3.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                    hashSet3.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                    hashSet3.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                    hashSet3.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                    hashSet3.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                    hashSet3.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                    hashSet3.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                    hashSet3.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    hashSet3.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                } else {
                                    hashSet3 = new HashSet();
                                }
                                ArrayList arrayList4 = arrayList3;
                                RFC3280CertPathUtilities.prepareNextCertO(certPath2, i14, hashSet3, arrayList4);
                                X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                try {
                                    PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath2.getCertificates(), i14, this.helper);
                                    AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                    algorithmIdentifier2.getAlgorithm();
                                    algorithmIdentifier2.getParameters();
                                    i6 = prepareNextCertJ;
                                    trustedCert = x509Certificate2;
                                    ca = subjectPrincipal;
                                    i8 = prepareNextCertI1;
                                    publicKey2 = nextWorkingKey;
                                    arrayList = arrayList4;
                                    pKIXPolicyNode2 = prepareCertB;
                                    i9 = prepareNextCertI2;
                                    hashSet5 = hashSet2;
                                    arrayList3 = arrayList;
                                    validityDate = date;
                                    pKIXCertRevocationChecker2 = pKIXCertRevocationChecker3;
                                    x509Certificate = x509Certificate2;
                                    findTrustAnchor = trustAnchor;
                                    certificates = list2;
                                    i4 = 1;
                                    arrayListArr = arrayListArr2;
                                    size2 = i14 - 1;
                                    build = pKIXExtendedParameters2;
                                } catch (CertPathValidatorException e2) {
                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath2, i14);
                                }
                            } else {
                                hashSet2 = hashSet6;
                            }
                            i10 = i12;
                            arrayList = arrayList3;
                            pKIXPolicyNode2 = processCertE;
                            i6 = i15;
                            i8 = i13;
                            publicKey2 = publicKey3;
                            ca = x500Name;
                            trustedCert = x509Certificate3;
                            hashSet5 = hashSet2;
                            arrayList3 = arrayList;
                            validityDate = date;
                            pKIXCertRevocationChecker2 = pKIXCertRevocationChecker3;
                            x509Certificate = x509Certificate2;
                            findTrustAnchor = trustAnchor;
                            certificates = list2;
                            i4 = 1;
                            arrayListArr = arrayListArr2;
                            size2 = i14 - 1;
                            build = pKIXExtendedParameters2;
                        } catch (AnnotatedException e3) {
                            throw new CertPathValidatorException(e3.getMessage(), e3.getUnderlyingException(), certPath, size2);
                        }
                    }
                    PKIXExtendedParameters pKIXExtendedParameters3 = build;
                    int i17 = size2;
                    ArrayList[] arrayListArr3 = arrayListArr;
                    TrustAnchor trustAnchor2 = findTrustAnchor;
                    HashSet hashSet7 = hashSet5;
                    ArrayList arrayList5 = arrayList3;
                    int i18 = i8;
                    PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                    int i19 = i17 + 1;
                    int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i19, RFC3280CertPathUtilities.wrapupCertA(i18, x509Certificate));
                    Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                    if (criticalExtensionOIDs2 != null) {
                        hashSet = new HashSet(criticalExtensionOIDs2);
                        hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                        hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                        hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                        hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                        hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                        hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                        hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                        hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                        hashSet.remove(Extension.extendedKeyUsage.getId());
                    } else {
                        hashSet = new HashSet();
                    }
                    RFC3280CertPathUtilities.wrapupCertF(certPath2, i19, arrayList5, hashSet);
                    PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath2, pKIXExtendedParameters3, initialPolicies, i19, arrayListArr3, pKIXPolicyNode3, hashSet7);
                    if (wrapupCertB > 0 || wrapupCertG != null) {
                        return new PKIXCertPathValidatorResult(trustAnchor2, wrapupCertG, x509Certificate.getPublicKey());
                    }
                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath2, i17);
                } catch (CertPathValidatorException e4) {
                    Mod$$ExternalSyntheticBUOutline0.m("Algorithm identifier of public key of trust anchor could not be read.", e4, certPath2, -1);
                    return null;
                }
            } catch (RuntimeException e5) {
                Mod$$ExternalSyntheticBUOutline0.m("Subject of trust anchor could not be (re)encoded.", e5, certPath2, -1);
                return null;
            }
        } catch (AnnotatedException e6) {
            e = e6;
            list = certificates;
        }
    }

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }
}
