package org.bouncycastle.jce.provider;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* loaded from: classes9.dex */
class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void checkCRL(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) {
        Set<String> criticalExtensionOIDs;
        if (date2.getTime() > date.getTime()) {
            Mod$$ExternalSyntheticBUOutline0.m$1("Validation time is in future.");
            return;
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(pKIXCertRevocationCheckerParameters, distributionPoint, x509Certificate, pKIXExtendedParameters, date2).iterator();
        boolean z = false;
        AnnotatedException e = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask processCRLD = processCRLD(x509crl, distributionPoint);
                if (processCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        X509CRL processCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores(), jcaJceHelper), processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        processCRLB1(distributionPoint, x509Certificate, x509crl);
                        processCRLB2(distributionPoint, x509Certificate, x509crl);
                        processCRLC(processCRLH, x509crl, pKIXExtendedParameters);
                        processCRLI(date2, processCRLH, x509Certificate, certStatus, pKIXExtendedParameters);
                        processCRLJ(date2, x509crl, x509Certificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(processCRLD);
                        Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(Extension.issuingDistributionPoint.getId());
                            hashSet.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet.isEmpty()) {
                                throw new AnnotatedException("CRL contains unsupported critical extensions.");
                            }
                        }
                        if (processCRLH != null && (criticalExtensionOIDs = processCRLH.getCriticalExtensionOIDs()) != null) {
                            HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                            hashSet2.remove(Extension.issuingDistributionPoint.getId());
                            hashSet2.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet2.isEmpty()) {
                                throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
                            }
                        }
                        z = true;
                    } catch (AnnotatedException e2) {
                        e = e2;
                    }
                } else {
                    continue;
                }
            } catch (AnnotatedException e3) {
                e = e3;
            }
        }
        throw e;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void checkCRLs(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, List list, JcaJceHelper jcaJceHelper) {
        AnnotatedException e;
        boolean z;
        int i;
        int i2;
        DistributionPoint[] distributionPointArr;
        int i3;
        try {
            X509Certificate x509Certificate3 = x509Certificate;
            CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate3, CRL_DISTRIBUTION_POINTS));
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
            try {
                Date date3 = date2;
                JcaJceHelper jcaJceHelper2 = jcaJceHelper;
                Iterator<PKIXCRLStore> it = CertPathValidatorUtilities.getAdditionalStoresFromCRLDistributionPoint(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap(), date3, jcaJceHelper2).iterator();
                while (it.hasNext()) {
                    builder.addCRLStore(it.next());
                }
                CertStatus certStatus = new CertStatus();
                ReasonsMask reasonsMask = new ReasonsMask();
                PKIXExtendedParameters build = builder.build();
                int i4 = 11;
                Object obj = null;
                if (cRLDistPoint != null) {
                    try {
                        DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                        if (distributionPoints != null) {
                            e = null;
                            int i5 = 0;
                            z = false;
                            while (i5 < distributionPoints.length && certStatus.getCertStatus() == i4 && !reasonsMask.isAllReasons()) {
                                try {
                                    i2 = i4;
                                    distributionPointArr = distributionPoints;
                                    i3 = i5;
                                    try {
                                        checkCRL(pKIXCertRevocationCheckerParameters, distributionPoints[i5], build, date, date3, x509Certificate3, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper2);
                                        z = true;
                                    } catch (AnnotatedException e2) {
                                        e = e2;
                                    }
                                } catch (AnnotatedException e3) {
                                    e = e3;
                                    i2 = i4;
                                    distributionPointArr = distributionPoints;
                                    i3 = i5;
                                }
                                i5 = i3 + 1;
                                date3 = date2;
                                x509Certificate3 = x509Certificate;
                                jcaJceHelper2 = jcaJceHelper;
                                i4 = i2;
                                distributionPoints = distributionPointArr;
                                obj = null;
                            }
                            i = i4;
                            if (certStatus.getCertStatus() == i) {
                                try {
                                    if (!reasonsMask.isAllReasons()) {
                                        try {
                                            checkCRL(pKIXCertRevocationCheckerParameters, new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, PrincipalUtils.getIssuerPrincipal(x509Certificate)))), null, null), (PKIXExtendedParameters) pKIXExtendedParameters.clone(), date, date2, x509Certificate, x509Certificate2, publicKey, certStatus, reasonsMask, list, jcaJceHelper);
                                            z = true;
                                        } catch (RuntimeException e4) {
                                            throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e4);
                                        }
                                    }
                                } catch (AnnotatedException e5) {
                                    e = e5;
                                }
                            }
                            if (z) {
                                if (e != null) {
                                    throw e;
                                }
                                Mod$$ExternalSyntheticBUOutline0.m$1("No valid CRL found.", e);
                                return;
                            } else {
                                if (certStatus.getCertStatus() == i) {
                                    if (!reasonsMask.isAllReasons() && certStatus.getCertStatus() == i) {
                                        certStatus.setCertStatus(12);
                                    }
                                    if (certStatus.getCertStatus() != 12) {
                                        return;
                                    }
                                    Mod$$ExternalSyntheticBUOutline0.m$1("Certificate status could not be determined.");
                                    return;
                                }
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                                StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m("Certificate revocation after " + simpleDateFormat.format(certStatus.getRevocationDate()), ", reason: ");
                                m108m.append(crlReasons[certStatus.getCertStatus()]);
                                throw new AnnotatedException(m108m.toString());
                            }
                        }
                    } catch (Exception e6) {
                        Mod$$ExternalSyntheticBUOutline0.m$1("Distribution points could not be read.", e6);
                        return;
                    }
                }
                i = 11;
                z = false;
                e = null;
                if (certStatus.getCertStatus() == i) {
                }
                if (z) {
                }
            } catch (AnnotatedException e7) {
                Mod$$ExternalSyntheticBUOutline0.m$1("No additional CRL locations could be decoded from CRL distribution point extension.", e7);
            }
        } catch (Exception e8) {
            Mod$$ExternalSyntheticBUOutline0.m$1("CRL distribution point extension could not be read.", e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x010a, code lost:
    
        throw new java.security.cert.CertPathValidatorException("Policy information could not be decoded.", r0, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010b, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x014a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x014b, code lost:
    
        r4 = "Certificate policies extension could not be decoded.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ab, code lost:
    
        r5 = r19[r7].iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b5, code lost:
    
        if (r5.hasNext() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        r6 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
    
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r6.getValidPolicy()) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d1, code lost:
    
        r5 = ((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r4, org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES)).getObjects();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d9, code lost:
    
        if (r5.hasMoreElements() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00db, code lost:
    
        r8 = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(r5.nextElement());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ef, code lost:
    
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r8.getPolicyIdentifier().getId()) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f9, code lost:
    
        r10 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r8.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        if (r4.getCriticalExtensionOIDs() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0112, code lost:
    
        r12 = r4.getCriticalExtensionOIDs().contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011f, code lost:
    
        r5 = (org.bouncycastle.jce.provider.PKIXPolicyNode) r6.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012d, code lost:
    
        if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(r5.getValidPolicy()) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012f, code lost:
    
        r5 = new org.bouncycastle.jce.provider.PKIXPolicyNode(new java.util.ArrayList(), r7, (java.util.Set) r13.get(r11), r5, r10, r11, r12);
        r5.addChild(r5);
        r19[r7].add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011e, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fc, code lost:
    
        r4 = "Policy qualifier info set could not be decoded.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fe, code lost:
    
        org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0.m(r4, r0, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0101, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0102, code lost:
    
        r0 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PKIXPolicyNode prepareCertB(CertPath certPath, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, int i2) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size() - i;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, POLICY_MAPPINGS));
            if (aSN1Sequence == null) {
                return pKIXPolicyNode;
            }
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < aSN1Sequence.size(); i3++) {
                ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(i3);
                String id = ((ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(0)).getId();
                String id2 = ((ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1)).getId();
                if (hashMap.containsKey(id)) {
                    ((Set) hashMap.get(id)).add(id2);
                } else {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(id2);
                    hashMap.put(id, hashSet2);
                    hashSet.add(id);
                }
            }
            Iterator it = hashSet.iterator();
            PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i2 > 0) {
                    Iterator it2 = listArr[size].iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) it2.next();
                        if (pKIXPolicyNode3.getValidPolicy().equals(str)) {
                            pKIXPolicyNode3.expectedPolicies = (Set) hashMap.get(str);
                            break;
                        }
                    }
                } else if (i2 <= 0) {
                    Iterator it3 = listArr[size].iterator();
                    while (it3.hasNext()) {
                        PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) it3.next();
                        if (pKIXPolicyNode4.getValidPolicy().equals(str)) {
                            ((PKIXPolicyNode) pKIXPolicyNode4.getParent()).removeChild(pKIXPolicyNode4);
                            it3.remove();
                            for (int i4 = size - 1; i4 >= 0; i4--) {
                                List list = listArr[i4];
                                PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode2;
                                for (int i5 = 0; i5 < list.size(); i5++) {
                                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list.get(i5);
                                    if (!pKIXPolicyNode6.hasChildren() && (pKIXPolicyNode5 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode5, listArr, pKIXPolicyNode6)) == null) {
                                        break;
                                    }
                                }
                                pKIXPolicyNode2 = pKIXPolicyNode5;
                            }
                        }
                    }
                }
            }
            return pKIXPolicyNode2;
        } catch (AnnotatedException e) {
            e = e;
            String str2 = "Policy mappings extension could not be decoded.";
        }
    }

    public static void prepareNextCertA(CertPath certPath, int i) {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                    try {
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i2));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i);
                        }
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i);
                        }
                    } catch (Exception e) {
                        e = e;
                        str = "Policy mappings extension contents could not be decoded.";
                        Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                        return;
                    }
                }
            }
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Policy mappings extension could not be decoded.";
        }
    }

    public static void prepareNextCertG(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator) {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), NAME_CONSTRAINTS));
            NameConstraints nameConstraints = aSN1Sequence != null ? NameConstraints.getInstance(aSN1Sequence) : null;
            if (nameConstraints != null) {
                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                if (permittedSubtrees != null) {
                    try {
                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                    } catch (Exception e) {
                        e = e;
                        str = "Permitted subtrees cannot be build from name constraints extension.";
                        Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                        return;
                    }
                }
                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                if (excludedSubtrees != null) {
                    for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                        try {
                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                        } catch (Exception e2) {
                            e = e2;
                            str = "Excluded subtrees cannot be build from name constraints extension.";
                            Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = "Name constraints extension could not be decoded.";
        }
    }

    public static int prepareNextCertH1(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i, int i2) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r4 = org.bouncycastle.asn1.ASN1Integer.getInstance(r2, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r4 >= r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int prepareNextCertI1(CertPath certPath, int i, int i2) {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects.hasMoreElements()) {
                        break;
                    }
                    try {
                        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
                        if (aSN1TaggedObject.getTagNo() == 0) {
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "Policy constraints extension contents cannot be decoded.";
                        Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                        return 0;
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            e = e2;
            str = "Policy constraints extension cannot be decoded.";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r5 = org.bouncycastle.asn1.ASN1Integer.getInstance(r2, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r5 >= r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int prepareNextCertI2(CertPath certPath, int i, int i2) {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects.hasMoreElements()) {
                        break;
                    }
                    try {
                        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects.nextElement());
                        if (aSN1TaggedObject.getTagNo() == 1) {
                            break;
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str = "Policy constraints extension contents cannot be decoded.";
                        Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                        return 0;
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            e = e2;
            str = "Policy constraints extension cannot be decoded.";
        }
    }

    public static int prepareNextCertJ(CertPath certPath, int i, int i2) {
        int intValueExact;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (intValueExact = aSN1Integer.intValueExact()) >= i2) ? i2 : intValueExact;
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
            return 0;
        }
    }

    public static void prepareNextCertK(CertPath certPath, int i) {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            if (basicConstraints == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i);
            }
            if (!basicConstraints.isCA()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i);
            }
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i, int i2) {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        Mod$$ExternalSyntheticBUOutline0.m("Max path length not greater than zero", null, certPath, i);
        return 0;
    }

    public static int prepareNextCertM(CertPath certPath, int i, int i2) {
        ASN1Integer pathLenConstraintInteger;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), BASIC_CONSTRAINTS));
            return (basicConstraints == null || !basicConstraints.isCA() || (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) == null) ? i2 : Math.min(i2, pathLenConstraintInteger.intPositiveValueExact());
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m("Basic constraints extension cannot be decoded.", e, certPath, i);
            return 0;
        }
    }

    public static void prepareNextCertN(CertPath certPath, int i) {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                Mod$$ExternalSyntheticBUOutline0.m("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i);
            }
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i, Set set, List list) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
    }

    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z = true;
        boolean z2 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                boolean z3 = false;
                for (int i = 0; i < names.length; i++) {
                    if (names[i].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z3 = true;
                            }
                        } catch (IOException e) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("CRL issuer information from distribution point cannot be decoded.", e);
                            return;
                        }
                    }
                }
                if (z3 && !z2) {
                    Mod$$ExternalSyntheticBUOutline0.m$1("Distribution point contains cRLIssuer field but CRL is not indirect.");
                    return;
                } else {
                    if (!z3) {
                        Mod$$ExternalSyntheticBUOutline0.m$1("CRL issuer of CRL does not match CRL issuer of distribution point.");
                        return;
                    }
                    z = z3;
                }
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z = false;
            }
            if (z) {
                return;
            }
            Mod$$ExternalSyntheticBUOutline0.m$1("Cannot find matching CRL issuer for certificate.");
        } catch (IOException e2) {
            throw new AnnotatedException(SVG$Unit$EnumUnboxingLocalUtility.m(e2, new StringBuilder("Exception encoding CRL issuer: ")), e2);
        }
    }

    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) {
        int i;
        GeneralName[] generalNameArr;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                    ArrayList arrayList = new ArrayList();
                    if (distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            arrayList.add(generalName);
                        }
                    }
                    if (distributionPoint2.getType() == 1) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                            while (objects.hasMoreElements()) {
                                aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                            }
                            aSN1EncodableVector.add(distributionPoint2.getName());
                            arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                        } catch (Exception e) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("Could not read CRL issuer.", e);
                            return;
                        }
                    }
                    if (distributionPoint.getDistributionPoint() == null) {
                        if (distributionPoint.getCRLIssuer() == null) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                            return;
                        }
                        GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                        while (i < names.length) {
                            i = arrayList.contains(names[i]) ? 0 : i + 1;
                        }
                        Mod$$ExternalSyntheticBUOutline0.m$1("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        return;
                    }
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] names2 = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            generalNameArr = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            generalNameArr = new GeneralName[1];
                            try {
                                generalNameArr[0] = new GeneralName(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                            } catch (Exception e2) {
                                Mod$$ExternalSyntheticBUOutline0.m$1("Could not read certificate issuer.", e2);
                                return;
                            }
                        }
                        names2 = generalNameArr;
                        for (int i2 = 0; i2 < names2.length; i2++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names2[i2].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            names2[i2] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names2 != null) {
                        while (i < names2.length) {
                            i = arrayList.contains(names2[i]) ? 0 : i + 1;
                        }
                    }
                    Mod$$ExternalSyntheticBUOutline0.m$1("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    return;
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("CA Cert CRL only contains user certificates.");
                            return;
                        } else if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("End CRL only contains CA certificates.");
                            return;
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        Mod$$ExternalSyntheticBUOutline0.m$1("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e3) {
                    Mod$$ExternalSyntheticBUOutline0.m$1("Basic constraints extension could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            Mod$$ExternalSyntheticBUOutline0.m$1("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            Mod$$ExternalSyntheticBUOutline0.m$1("delta CRL has unsupported critical extensions");
            return;
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    Mod$$ExternalSyntheticBUOutline0.m$1("Complete CRL issuer does not match delta CRL issuer.");
                    return;
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        Mod$$ExternalSyntheticBUOutline0.m$1("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                        return;
                    }
                    try {
                        String str2 = AUTHORITY_KEY_IDENTIFIER;
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                            if (extensionValue == null) {
                                Mod$$ExternalSyntheticBUOutline0.m$1("CRL authority key identifier is null.");
                            } else if (extensionValue2 == null) {
                                Mod$$ExternalSyntheticBUOutline0.m$1("Delta CRL authority key identifier is null.");
                            } else {
                                if (extensionValue.equals(extensionValue2)) {
                                    return;
                                }
                                Mod$$ExternalSyntheticBUOutline0.m$1("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                            }
                        } catch (AnnotatedException e) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("Authority key identifier extension could not be extracted from delta CRL.", e);
                        }
                    } catch (AnnotatedException e2) {
                        Mod$$ExternalSyntheticBUOutline0.m$1("Authority key identifier extension could not be extracted from complete CRL.", e2);
                    }
                } catch (Exception e3) {
                    Mod$$ExternalSyntheticBUOutline0.m$1("Issuing distribution point extension from delta CRL could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            Mod$$ExternalSyntheticBUOutline0.m$1("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m$1("Issuing distribution point extension could not be decoded.", e);
            return null;
        }
    }

    public static Set processCRLF(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, JcaJceHelper jcaJceHelper) {
        int i;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> build = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                CertPathValidatorUtilities.findCertificates(linkedHashSet, build, pKIXExtendedParameters.getCertificateStores());
                CertPathValidatorUtilities.findCertificates(linkedHashSet, build, pKIXExtendedParameters.getCertStores());
                linkedHashSet.add(x509Certificate);
                Iterator it = linkedHashSet.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            CertPathBuilderSpi pKIXCertPathBuilderSpi_8 = revChkClass != null ? new PKIXCertPathBuilderSpi_8(true) : new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi_8.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(CertPathValidatorUtilities.getNextWorkingKey(certificates, 0, jcaJceHelper));
                        } catch (CertPathBuilderException e) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("CertPath for CRL signer failed to validate.", e);
                            return null;
                        } catch (CertPathValidatorException e2) {
                            Mod$$ExternalSyntheticBUOutline0.m$1("Public key of issuer certificate of CRL could not be retrieved.", e2);
                            return null;
                        } catch (Exception e3) {
                            throw new AnnotatedException(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null) {
                        if (!Properties.isOverrideSet("org.bouncycastle.x509.allow_ca_without_crl_sign", true)) {
                            annotatedException = new AnnotatedException("No key usage extension on CRL issuer certificate.");
                        }
                        hashSet.add(arrayList2.get(i));
                    } else {
                        if (keyUsage.length <= 6 || !keyUsage[6]) {
                            annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                        }
                        hashSet.add(arrayList2.get(i));
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    Mod$$ExternalSyntheticBUOutline0.m$1("Cannot find a valid issuer certificate.");
                    return null;
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e4) {
                Mod$$ExternalSyntheticBUOutline0.m$1("Issuer certificate for CRL cannot be searched.", e4);
                return null;
            }
        } catch (IOException e5) {
            Mod$$ExternalSyntheticBUOutline0.m$1("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
            return null;
        }
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        Mod$$ExternalSyntheticBUOutline0.m$1("Cannot verify CRL.", e);
        return null;
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        Mod$$ExternalSyntheticBUOutline0.m$1("Cannot verify delta CRL.", e);
        return null;
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    public static void processCertA(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Date date, PKIXCertRevocationChecker pKIXCertRevocationChecker, int i, PublicKey publicKey, boolean z, X500Name x500Name, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = (X509Certificate) certPath.getCertificates().get(i);
        if (!z) {
            try {
                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, publicKey, pKIXExtendedParameters.getSigProvider());
            } catch (GeneralSecurityException e) {
                e = e;
                str = "Could not validate certificate signature.";
                Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
            }
        }
        try {
            Date validCertDateFromValidityModel = CertPathValidatorUtilities.getValidCertDateFromValidityModel(date, pKIXExtendedParameters.getValidityModel(), certPath, i);
            try {
                x509Certificate2.checkValidity(validCertDateFromValidityModel);
                if (pKIXCertRevocationChecker != null) {
                    pKIXCertRevocationChecker.initialize(new PKIXCertRevocationCheckerParameters(pKIXExtendedParameters, validCertDateFromValidityModel, certPath, i, x509Certificate, publicKey));
                    pKIXCertRevocationChecker.check(x509Certificate2);
                }
                X500Name issuerPrincipal = PrincipalUtils.getIssuerPrincipal(x509Certificate2);
                if (issuerPrincipal.equals(x500Name)) {
                    return;
                }
                throw new ExtCertPathValidatorException("IssuerName(" + issuerPrincipal + ") does not match SubjectName(" + x500Name + ") of signing certificate.", null, certPath, i);
            } catch (CertificateExpiredException e2) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e2.getMessage(), e2, certPath, i);
            } catch (CertificateNotYetValidException e3) {
                throw new ExtCertPathValidatorException("Could not validate certificate: " + e3.getMessage(), e3, certPath, i);
            }
        } catch (AnnotatedException e4) {
            e = e4;
            str = "Could not validate time of certificate.";
            Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
        }
    }

    public static void processCertBC(CertPath certPath, int i, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z) {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i2 >= size && !z)) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                        for (int i3 = 0; i3 != rDNs.length; i3++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i3].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i4 = 0; i4 < names.length; i4++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i4]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i4]);
                                    } catch (PKIXNameConstraintValidatorException e2) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                    }
                                }
                            } catch (Exception e3) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                            }
                        }
                    } catch (Exception e4) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (PKIXNameConstraintValidatorException e5) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (Exception e6) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i2, boolean z) {
        String str;
        String str2;
        int i3;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i4 = size - i;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = aSN1Sequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!ANY_POLICY.equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i4, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i4, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e) {
                        e = e;
                        str = "Policy qualifier info set could not be build.";
                        Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                        return null;
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i2 > 0 || ((i4 < size || z) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if (ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i4 - 1];
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i5);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    str2 = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    str2 = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                String str3 = str2;
                                Iterator children = pKIXPolicyNode2.getChildren();
                                boolean z2 = false;
                                while (children.hasNext()) {
                                    if (str3.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                        z2 = true;
                                    }
                                }
                                if (!z2) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str3);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i4, hashSet3, pKIXPolicyNode2, qualifierSet2, str3, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i4].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNode4 = pKIXPolicyNode;
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                List list2 = listArr[i6];
                for (0; i3 < list2.size(); i3 + 1) {
                    PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i3);
                    i3 = (pKIXPolicyNode5.hasChildren() || (pKIXPolicyNode4 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode4, listArr, pKIXPolicyNode5)) != null) ? i3 + 1 : 0;
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(CERTIFICATE_POLICIES);
                List list3 = listArr[i4];
                for (int i7 = 0; i7 < list3.size(); i7++) {
                    ((PKIXPolicyNode) list3.get(i7)).setCritical(contains);
                }
            }
            return pKIXPolicyNode4;
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Could not read certificate policies extension from certificate.";
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode) {
        try {
            if (ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e) {
            Mod$$ExternalSyntheticBUOutline0.m("Could not read certificate policies extension from certificate.", e, certPath, i);
            return null;
        }
    }

    public static void processCertF(CertPath certPath, int i, PKIXPolicyNode pKIXPolicyNode, int i2) {
        if (i2 > 0 || pKIXPolicyNode != null) {
            return;
        }
        Mod$$ExternalSyntheticBUOutline0.m("No valid policy tree found when one expected.", null, certPath, i);
    }

    public static int wrapupCertA(int i, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i == 0) ? i : i - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i, int i2) {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            e = e;
                            str = "Policy constraints requireExplicitPolicy field could not be decoded.";
                            Mod$$ExternalSyntheticBUOutline0.m(str, e, certPath, i);
                            return 0;
                        }
                    }
                }
            }
            return i2;
        } catch (AnnotatedException e2) {
            e = e2;
            str = "Policy constraints could not be decoded.";
        }
    }

    public static void wrapupCertF(CertPath certPath, int i, List list, Set set) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException(e.getMessage(), e, certPath, i);
            } catch (Exception e2) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e2, certPath, i);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return null;
            }
            Mod$$ExternalSyntheticBUOutline0.m("Explicit policy requested but none available.", null, certPath, i);
            return null;
        }
        if (CertPathValidatorUtilities.isAnyPolicy(set)) {
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return pKIXPolicyNode;
            }
            if (set2.isEmpty()) {
                Mod$$ExternalSyntheticBUOutline0.m("Explicit policy requested but none available.", null, certPath, i);
                return null;
            }
            HashSet hashSet = new HashSet();
            for (List list : listArr) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i2);
                    if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            hashSet.add(children.next());
                        }
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                List list2 = listArr[i3];
                for (int i4 = 0; i4 < list2.size(); i4++) {
                    PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) list2.get(i4);
                    if (!pKIXPolicyNode3.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode3);
                    }
                }
            }
            return pKIXPolicyNode;
        }
        HashSet hashSet2 = new HashSet();
        for (List list3 : listArr) {
            for (int i5 = 0; i5 < list3.size(); i5++) {
                PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) list3.get(i5);
                if (ANY_POLICY.equals(pKIXPolicyNode4.getValidPolicy())) {
                    Iterator children2 = pKIXPolicyNode4.getChildren();
                    while (children2.hasNext()) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) children2.next();
                        if (!ANY_POLICY.equals(pKIXPolicyNode5.getValidPolicy())) {
                            hashSet2.add(pKIXPolicyNode5);
                        }
                    }
                }
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) it2.next();
            if (!set.contains(pKIXPolicyNode6.getValidPolicy())) {
                pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode6);
            }
        }
        if (pKIXPolicyNode != null) {
            for (int i6 = size - 1; i6 >= 0; i6--) {
                List list4 = listArr[i6];
                for (int i7 = 0; i7 < list4.size(); i7++) {
                    PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list4.get(i7);
                    if (!pKIXPolicyNode7.hasChildren()) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
