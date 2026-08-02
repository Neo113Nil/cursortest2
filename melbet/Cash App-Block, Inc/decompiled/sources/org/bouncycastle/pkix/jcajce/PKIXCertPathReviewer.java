package org.bouncycastle.pkix.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AccessDescription;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityInformationAccess;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
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
import org.bouncycastle.asn1.x509.qualified.ETSIQCObjectIdentifiers;
import org.bouncycastle.asn1.x509.qualified.MonetaryValue;
import org.bouncycastle.asn1.x509.qualified.QCStatement;
import org.bouncycastle.asn1.x509.qualified.RFC3739QCObjectIdentifiers;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pkix.PKIXNameConstraintValidator;
import org.bouncycastle.pkix.PKIXNameConstraintValidatorException;
import org.bouncycastle.pkix.util.ErrorBundle;
import org.bouncycastle.pkix.util.LocaleString;
import org.bouncycastle.pkix.util.filter.TrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedInput;
import org.bouncycastle.pkix.util.filter.UntrustedUrlInput;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Objects;

/* loaded from: classes10.dex */
public class PKIXCertPathReviewer extends CertPathValidatorUtilities {
    private static final int NAME_CHECK_MAX = 1024;
    private static final String RESOURCE_NAME = "org.bouncycastle.pkix.CertPathReviewerMessages";
    protected CertPath certPath;
    protected List certs;
    protected Date currentDate;
    protected List[] errors;
    private boolean initialized;
    protected int n;
    protected List[] notifications;
    protected PKIXParameters pkixParams;
    protected PolicyNode policyTree;
    protected PublicKey subjectPublicKey;
    protected TrustAnchor trustAnchor;
    protected Date validDate;
    private static final String QC_STATEMENT = Extension.qCStatements.getId();
    private static final String CRL_DIST_POINTS = Extension.cRLDistributionPoints.getId();
    private static final String AUTH_INFO_ACCESS = Extension.authorityInfoAccess.getId();

    public PKIXCertPathReviewer(CertPath certPath, PKIXParameters pKIXParameters) {
        init(certPath, pKIXParameters);
    }

    private String IPtoString(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i != bArr.length; i++) {
                stringBuffer.append(Integer.toHexString(bArr[i] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private void checkCriticalExtensions() {
        List<PKIXCertPathChecker> certPathCheckers = this.pkixParams.getCertPathCheckers();
        Iterator<PKIXCertPathChecker> it = certPathCheckers.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().init(false);
                } catch (CertPathValidatorException e) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
                }
            } catch (CertPathReviewerException e2) {
                addError(e2.getErrorMessage(), e2.getIndex());
                return;
            }
        }
        for (int size = this.certs.size() - 1; size >= 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty()) {
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.KEY_USAGE);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_MAPPINGS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.BASIC_CONSTRAINTS);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                criticalExtensionOIDs.remove(CertPathValidatorUtilities.NAME_CONSTRAINTS);
                if (size == 0) {
                    criticalExtensionOIDs.remove(Extension.extendedKeyUsage.getId());
                }
                String str = QC_STATEMENT;
                if (criticalExtensionOIDs.contains(str) && processQcStatements(x509Certificate, size)) {
                    criticalExtensionOIDs.remove(str);
                }
                Iterator<PKIXCertPathChecker> it2 = certPathCheckers.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().check(x509Certificate, criticalExtensionOIDs);
                    } catch (CertPathValidatorException e3) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.criticalExtensionError", new Object[]{e3.getMessage(), e3, e3.getClass().getName()}), e3.getCause(), this.certPath, size);
                    }
                }
                if (!criticalExtensionOIDs.isEmpty()) {
                    Iterator<String> it3 = criticalExtensionOIDs.iterator();
                    while (it3.hasNext()) {
                        addError(createErrorBundle("CertPathReviewer.unknownCriticalExt", new Object[]{new ASN1ObjectIdentifier(it3.next())}), size);
                    }
                }
            }
        }
    }

    private void checkNameConstraints() {
        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
        try {
            for (int size = this.certs.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
                if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                    X500Principal subjectPrincipal = CertPathValidatorUtilities.getSubjectPrincipal(x509Certificate);
                    try {
                        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(new ByteArrayInputStream(subjectPrincipal.getEncoded())).readObject();
                        try {
                            pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                            try {
                                pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                                try {
                                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    if (aSN1Sequence2 != null) {
                                        if (aSN1Sequence2.size() > 1024) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.subjAltNameExtError"), this.certPath, size);
                                        }
                                        for (int i = 0; i < aSN1Sequence2.size(); i++) {
                                            GeneralName generalName = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i));
                                            try {
                                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                                pKIXNameConstraintValidator.checkExcluded(generalName);
                                            } catch (PKIXNameConstraintValidatorException e) {
                                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.notPermittedEmail", new Object[]{new UntrustedInput(generalName)}), e, this.certPath, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.subjAltNameExtError"), e2, this.certPath, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e3) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.excludedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e3, this.certPath, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e4) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.notPermittedDN", new Object[]{new UntrustedInput(subjectPrincipal.getName())}), e4, this.certPath, size);
                        }
                    } catch (IOException e5) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.ncSubjectNameError", new Object[]{new UntrustedInput(subjectPrincipal)}), e5, this.certPath, size);
                    }
                }
                try {
                    ASN1Sequence aSN1Sequence3 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.NAME_CONSTRAINTS);
                    if (aSN1Sequence3 != null) {
                        NameConstraints nameConstraints = NameConstraints.getInstance(aSN1Sequence3);
                        GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                        if (permittedSubtrees != null) {
                            pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                        }
                        GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                        if (excludedSubtrees != null) {
                            for (int i2 = 0; i2 != excludedSubtrees.length; i2++) {
                                pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i2]);
                            }
                        }
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.ncExtError"), e6, this.certPath, size);
                }
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    private void checkPathLength() {
        BasicConstraints basicConstraints;
        ASN1Integer pathLenConstraintInteger;
        int i = this.n;
        int i2 = 0;
        for (int size = this.certs.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.certs.get(size);
            if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate)) {
                if (i <= 0) {
                    addError(createErrorBundle("CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i2++;
            }
            try {
                basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
            } catch (AnnotatedException unused) {
                addError(createErrorBundle("CertPathReviewer.processLengthConstError"), size);
                basicConstraints = null;
            }
            if (basicConstraints != null && basicConstraints.isCA() && (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) != null) {
                i = Math.min(i, pathLenConstraintInteger.intPositiveValueExact());
            }
        }
        addNotification(createErrorBundle("CertPathReviewer.totalPathLength", new Object[]{Integers.valueOf(i2)}));
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x013e, code lost:
    
        r22 = org.bouncycastle.pkix.jcajce.CertPathValidatorUtilities.getQualifierSet(r4.getPolicyQualifiers());
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0148, code lost:
    
        r2 = r5[r14 - 1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x014f, code lost:
    
        if (r4 >= r2.size()) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0151, code lost:
    
        r21 = (org.bouncycastle.pkix.jcajce.PKIXPolicyNode) r2.get(r4);
        r6 = r21.getExpectedPolicies().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0165, code lost:
    
        if (r6.hasNext() == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0167, code lost:
    
        r29 = r2;
        r2 = r6.next();
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0171, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0173, code lost:
    
        r2 = (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0180, code lost:
    
        r4 = r21.getChildren();
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x018a, code lost:
    
        if (r4.hasNext() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x018c, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x019c, code lost:
    
        if (r2.equals(((org.bouncycastle.pkix.jcajce.PKIXPolicyNode) r4.next()).getValidPolicy()) == false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x019e, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01a0, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01a3, code lost:
    
        if (r17 != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01a5, code lost:
    
        r4 = new java.util.HashSet();
        r4.add(r2);
        r17 = new org.bouncycastle.pkix.jcajce.PKIXPolicyNode(new java.util.ArrayList(), r14, r4, r21, r22, r2, false);
        r2 = r21;
        r2.addChild(r17);
        r21 = r2;
        r5[r14].add(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01cd, code lost:
    
        r2 = r29;
        r4 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0178, code lost:
    
        if ((r2 instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x017a, code lost:
    
        r2 = ((org.bouncycastle.asn1.ASN1ObjectIdentifier) r2).getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01d2, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0128 A[Catch: CertPathReviewerException -> 0x00d0, TRY_LEAVE, TryCatch #3 {CertPathReviewerException -> 0x00d0, blocks: (B:15:0x0068, B:19:0x0075, B:21:0x0080, B:25:0x008e, B:26:0x0097, B:28:0x009d, B:31:0x00be, B:32:0x00c6, B:34:0x00cc, B:40:0x00d4, B:41:0x00df, B:47:0x00eb, B:50:0x00f2, B:51:0x00fb, B:53:0x0101, B:56:0x010b, B:63:0x0114, B:65:0x0118, B:67:0x01e7, B:69:0x01eb, B:70:0x01f0, B:72:0x01f6, B:74:0x0202, B:81:0x020a, B:79:0x020d, B:85:0x0210, B:87:0x0216, B:88:0x0221, B:90:0x0227, B:99:0x0244, B:100:0x024f, B:101:0x0250, B:107:0x0254, B:109:0x025c, B:110:0x0262, B:112:0x0268, B:115:0x028a, B:117:0x0294, B:119:0x0299, B:120:0x02a4, B:122:0x02a5, B:123:0x02b0, B:126:0x02b5, B:127:0x02c8, B:129:0x02ce, B:131:0x02f4, B:133:0x030c, B:134:0x0303, B:137:0x0311, B:138:0x0317, B:140:0x031d, B:143:0x0325, B:156:0x0345, B:148:0x032a, B:149:0x0335, B:151:0x0337, B:152:0x0342, B:160:0x034f, B:169:0x0367, B:171:0x0371, B:172:0x0375, B:174:0x037b, B:188:0x038b, B:177:0x0398, B:198:0x03a5, B:200:0x03af, B:105:0x03e4, B:207:0x03b7, B:208:0x03c4, B:210:0x03c5, B:211:0x03d0, B:218:0x03d2, B:219:0x03df, B:221:0x011e, B:222:0x0122, B:224:0x0128, B:227:0x013e, B:229:0x0148, B:230:0x014b, B:232:0x0151, B:233:0x0161, B:235:0x0167, B:237:0x0173, B:238:0x0180, B:239:0x0186, B:241:0x018c, B:249:0x01a5, B:253:0x0176, B:255:0x017a, B:258:0x01d2, B:262:0x01db, B:263:0x01e6, B:270:0x03ee, B:271:0x03fb, B:273:0x03fc, B:278:0x040b, B:280:0x0415, B:281:0x041a, B:283:0x0420, B:286:0x042e, B:301:0x0441, B:308:0x0586, B:309:0x0591, B:311:0x044c, B:312:0x0457, B:313:0x0458, B:315:0x045e, B:317:0x0466, B:319:0x046c, B:321:0x0474, B:322:0x0477, B:324:0x047d, B:326:0x048d, B:327:0x0491, B:329:0x0497, B:331:0x049f, B:334:0x04a2, B:336:0x04a5, B:337:0x04a9, B:339:0x04af, B:341:0x04bd, B:343:0x04c5, B:344:0x04c8, B:346:0x04ce, B:348:0x04da, B:350:0x04de, B:353:0x04e1, B:355:0x04e7, B:356:0x04f2, B:358:0x04f3, B:360:0x04fb, B:361:0x04fe, B:363:0x0504, B:365:0x0514, B:366:0x0518, B:368:0x051e, B:371:0x052e, B:376:0x0532, B:379:0x0535, B:381:0x0538, B:382:0x053c, B:384:0x0542, B:387:0x0552, B:393:0x055a, B:395:0x0562, B:396:0x0565, B:398:0x056b, B:400:0x0577, B:402:0x057b, B:405:0x057e, B:407:0x0593, B:408:0x059e), top: B:14:0x0068, inners: #0, #2, #4, #5, #6, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01e7 A[EDGE_INSN: B:265:0x01e7->B:67:0x01e7 BREAK  A[LOOP:11: B:222:0x0122->B:264:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01eb A[Catch: CertPathReviewerException -> 0x00d0, TryCatch #3 {CertPathReviewerException -> 0x00d0, blocks: (B:15:0x0068, B:19:0x0075, B:21:0x0080, B:25:0x008e, B:26:0x0097, B:28:0x009d, B:31:0x00be, B:32:0x00c6, B:34:0x00cc, B:40:0x00d4, B:41:0x00df, B:47:0x00eb, B:50:0x00f2, B:51:0x00fb, B:53:0x0101, B:56:0x010b, B:63:0x0114, B:65:0x0118, B:67:0x01e7, B:69:0x01eb, B:70:0x01f0, B:72:0x01f6, B:74:0x0202, B:81:0x020a, B:79:0x020d, B:85:0x0210, B:87:0x0216, B:88:0x0221, B:90:0x0227, B:99:0x0244, B:100:0x024f, B:101:0x0250, B:107:0x0254, B:109:0x025c, B:110:0x0262, B:112:0x0268, B:115:0x028a, B:117:0x0294, B:119:0x0299, B:120:0x02a4, B:122:0x02a5, B:123:0x02b0, B:126:0x02b5, B:127:0x02c8, B:129:0x02ce, B:131:0x02f4, B:133:0x030c, B:134:0x0303, B:137:0x0311, B:138:0x0317, B:140:0x031d, B:143:0x0325, B:156:0x0345, B:148:0x032a, B:149:0x0335, B:151:0x0337, B:152:0x0342, B:160:0x034f, B:169:0x0367, B:171:0x0371, B:172:0x0375, B:174:0x037b, B:188:0x038b, B:177:0x0398, B:198:0x03a5, B:200:0x03af, B:105:0x03e4, B:207:0x03b7, B:208:0x03c4, B:210:0x03c5, B:211:0x03d0, B:218:0x03d2, B:219:0x03df, B:221:0x011e, B:222:0x0122, B:224:0x0128, B:227:0x013e, B:229:0x0148, B:230:0x014b, B:232:0x0151, B:233:0x0161, B:235:0x0167, B:237:0x0173, B:238:0x0180, B:239:0x0186, B:241:0x018c, B:249:0x01a5, B:253:0x0176, B:255:0x017a, B:258:0x01d2, B:262:0x01db, B:263:0x01e6, B:270:0x03ee, B:271:0x03fb, B:273:0x03fc, B:278:0x040b, B:280:0x0415, B:281:0x041a, B:283:0x0420, B:286:0x042e, B:301:0x0441, B:308:0x0586, B:309:0x0591, B:311:0x044c, B:312:0x0457, B:313:0x0458, B:315:0x045e, B:317:0x0466, B:319:0x046c, B:321:0x0474, B:322:0x0477, B:324:0x047d, B:326:0x048d, B:327:0x0491, B:329:0x0497, B:331:0x049f, B:334:0x04a2, B:336:0x04a5, B:337:0x04a9, B:339:0x04af, B:341:0x04bd, B:343:0x04c5, B:344:0x04c8, B:346:0x04ce, B:348:0x04da, B:350:0x04de, B:353:0x04e1, B:355:0x04e7, B:356:0x04f2, B:358:0x04f3, B:360:0x04fb, B:361:0x04fe, B:363:0x0504, B:365:0x0514, B:366:0x0518, B:368:0x051e, B:371:0x052e, B:376:0x0532, B:379:0x0535, B:381:0x0538, B:382:0x053c, B:384:0x0542, B:387:0x0552, B:393:0x055a, B:395:0x0562, B:396:0x0565, B:398:0x056b, B:400:0x0577, B:402:0x057b, B:405:0x057e, B:407:0x0593, B:408:0x059e), top: B:14:0x0068, inners: #0, #2, #4, #5, #6, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216 A[Catch: CertPathReviewerException -> 0x00d0, TryCatch #3 {CertPathReviewerException -> 0x00d0, blocks: (B:15:0x0068, B:19:0x0075, B:21:0x0080, B:25:0x008e, B:26:0x0097, B:28:0x009d, B:31:0x00be, B:32:0x00c6, B:34:0x00cc, B:40:0x00d4, B:41:0x00df, B:47:0x00eb, B:50:0x00f2, B:51:0x00fb, B:53:0x0101, B:56:0x010b, B:63:0x0114, B:65:0x0118, B:67:0x01e7, B:69:0x01eb, B:70:0x01f0, B:72:0x01f6, B:74:0x0202, B:81:0x020a, B:79:0x020d, B:85:0x0210, B:87:0x0216, B:88:0x0221, B:90:0x0227, B:99:0x0244, B:100:0x024f, B:101:0x0250, B:107:0x0254, B:109:0x025c, B:110:0x0262, B:112:0x0268, B:115:0x028a, B:117:0x0294, B:119:0x0299, B:120:0x02a4, B:122:0x02a5, B:123:0x02b0, B:126:0x02b5, B:127:0x02c8, B:129:0x02ce, B:131:0x02f4, B:133:0x030c, B:134:0x0303, B:137:0x0311, B:138:0x0317, B:140:0x031d, B:143:0x0325, B:156:0x0345, B:148:0x032a, B:149:0x0335, B:151:0x0337, B:152:0x0342, B:160:0x034f, B:169:0x0367, B:171:0x0371, B:172:0x0375, B:174:0x037b, B:188:0x038b, B:177:0x0398, B:198:0x03a5, B:200:0x03af, B:105:0x03e4, B:207:0x03b7, B:208:0x03c4, B:210:0x03c5, B:211:0x03d0, B:218:0x03d2, B:219:0x03df, B:221:0x011e, B:222:0x0122, B:224:0x0128, B:227:0x013e, B:229:0x0148, B:230:0x014b, B:232:0x0151, B:233:0x0161, B:235:0x0167, B:237:0x0173, B:238:0x0180, B:239:0x0186, B:241:0x018c, B:249:0x01a5, B:253:0x0176, B:255:0x017a, B:258:0x01d2, B:262:0x01db, B:263:0x01e6, B:270:0x03ee, B:271:0x03fb, B:273:0x03fc, B:278:0x040b, B:280:0x0415, B:281:0x041a, B:283:0x0420, B:286:0x042e, B:301:0x0441, B:308:0x0586, B:309:0x0591, B:311:0x044c, B:312:0x0457, B:313:0x0458, B:315:0x045e, B:317:0x0466, B:319:0x046c, B:321:0x0474, B:322:0x0477, B:324:0x047d, B:326:0x048d, B:327:0x0491, B:329:0x0497, B:331:0x049f, B:334:0x04a2, B:336:0x04a5, B:337:0x04a9, B:339:0x04af, B:341:0x04bd, B:343:0x04c5, B:344:0x04c8, B:346:0x04ce, B:348:0x04da, B:350:0x04de, B:353:0x04e1, B:355:0x04e7, B:356:0x04f2, B:358:0x04f3, B:360:0x04fb, B:361:0x04fe, B:363:0x0504, B:365:0x0514, B:366:0x0518, B:368:0x051e, B:371:0x052e, B:376:0x0532, B:379:0x0535, B:381:0x0538, B:382:0x053c, B:384:0x0542, B:387:0x0552, B:393:0x055a, B:395:0x0562, B:396:0x0565, B:398:0x056b, B:400:0x0577, B:402:0x057b, B:405:0x057e, B:407:0x0593, B:408:0x059e), top: B:14:0x0068, inners: #0, #2, #4, #5, #6, #8, #9, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkPolicy() {
        PKIXPolicyNode pKIXPolicyNode;
        String str;
        ASN1Sequence aSN1Sequence;
        ASN1Primitive aSN1Primitive;
        int i;
        int intValueExact;
        int intValueExact2;
        Enumeration objects;
        int i2;
        Set<String> criticalExtensionOIDs;
        PKIXPolicyNode pKIXPolicyNode2;
        String str2 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.pkixParams.getInitialPolicies();
        int i3 = this.n + 1;
        ArrayList[] arrayListArr = new ArrayList[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            arrayListArr[i4] = new ArrayList();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY);
        PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), 0, hashSet, null, new HashSet(), org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY, false);
        arrayListArr[0].add(pKIXPolicyNode3);
        int i5 = this.pkixParams.isExplicitPolicyRequired() ? 0 : this.n + 1;
        int i6 = this.pkixParams.isAnyPolicyInhibited() ? 0 : this.n + 1;
        int i7 = this.pkixParams.isPolicyMappingInhibited() ? 0 : this.n + 1;
        try {
            int size = this.certs.size() - 1;
            X509Certificate x509Certificate = null;
            HashSet hashSet2 = null;
            while (size >= 0) {
                int i8 = this.n - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.certs.get(size);
                try {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                    if (aSN1Sequence2 == null || pKIXPolicyNode3 == null) {
                        str = str2;
                        aSN1Sequence = aSN1Sequence2;
                    } else {
                        Enumeration objects2 = aSN1Sequence2.getObjects();
                        HashSet hashSet3 = new HashSet();
                        while (objects2.hasMoreElements()) {
                            PolicyInformation policyInformation = PolicyInformation.getInstance(objects2.nextElement());
                            String str3 = str2;
                            ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                            ASN1Sequence aSN1Sequence3 = aSN1Sequence2;
                            hashSet3.add(policyIdentifier.getId());
                            if (!org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(policyIdentifier.getId())) {
                                try {
                                    Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                                    if (!CertPathValidatorUtilities.processCertD1i(i8, arrayListArr, policyIdentifier, qualifierSet)) {
                                        CertPathValidatorUtilities.processCertD1ii(i8, arrayListArr, policyIdentifier, qualifierSet);
                                    }
                                } catch (CertPathValidatorException e) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e, this.certPath, size);
                                }
                            }
                            str2 = str3;
                            aSN1Sequence2 = aSN1Sequence3;
                        }
                        str = str2;
                        aSN1Sequence = aSN1Sequence2;
                        if (hashSet2 != null && !hashSet2.contains(org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY)) {
                            HashSet hashSet4 = new HashSet();
                            for (Object obj : hashSet2) {
                                if (hashSet3.contains(obj)) {
                                    hashSet4.add(obj);
                                }
                            }
                            hashSet2 = hashSet4;
                            if (i6 <= 0 || (i8 < this.n && CertPathValidatorUtilities.isSelfIssued(x509Certificate2))) {
                                objects = aSN1Sequence.getObjects();
                                while (true) {
                                    if (objects.hasMoreElements()) {
                                        break;
                                    }
                                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects.nextElement());
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                                        try {
                                            break;
                                        } catch (CertPathValidatorException e2) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e2, this.certPath, size);
                                        }
                                    }
                                }
                            }
                            i2 = i8 - 1;
                            while (i2 >= 0) {
                                ArrayList arrayList = arrayListArr[i2];
                                int i9 = i2;
                                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                    PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) arrayList.get(i10);
                                    if (!pKIXPolicyNode4.hasChildren()) {
                                        PKIXPolicyNode removePolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode4);
                                        pKIXPolicyNode3 = removePolicyNode;
                                        if (removePolicyNode == null) {
                                            break;
                                        }
                                    }
                                }
                                i2 = i9 - 1;
                            }
                            criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs == null) {
                                boolean contains = criticalExtensionOIDs.contains(CertPathValidatorUtilities.CERTIFICATE_POLICIES);
                                ArrayList arrayList2 = arrayListArr[i8];
                                pKIXPolicyNode2 = pKIXPolicyNode3;
                                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                    ((PKIXPolicyNode) arrayList2.get(i11)).setCritical(contains);
                                }
                            } else {
                                pKIXPolicyNode2 = pKIXPolicyNode3;
                            }
                            pKIXPolicyNode3 = pKIXPolicyNode2;
                        }
                        hashSet2 = hashSet3;
                        if (i6 <= 0) {
                        }
                        objects = aSN1Sequence.getObjects();
                        while (true) {
                            if (objects.hasMoreElements()) {
                            }
                        }
                        i2 = i8 - 1;
                        while (i2 >= 0) {
                        }
                        criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs == null) {
                        }
                        pKIXPolicyNode3 = pKIXPolicyNode2;
                    }
                    if (aSN1Sequence == null) {
                        pKIXPolicyNode3 = null;
                    }
                    if (i5 <= 0 && pKIXPolicyNode3 == null) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noValidPolicyTree"));
                    }
                    if (i8 != this.n) {
                        try {
                            ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_MAPPINGS);
                            if (extensionValue != null) {
                                ASN1Sequence aSN1Sequence4 = (ASN1Sequence) extensionValue;
                                aSN1Primitive = extensionValue;
                                int i12 = 0;
                                while (i12 < aSN1Sequence4.size()) {
                                    ASN1Sequence aSN1Sequence5 = (ASN1Sequence) aSN1Sequence4.getObjectAt(i12);
                                    ASN1Sequence aSN1Sequence6 = aSN1Sequence4;
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(0);
                                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) aSN1Sequence5.getObjectAt(1);
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicyMapping"), this.certPath, size);
                                    }
                                    i12++;
                                    aSN1Sequence4 = aSN1Sequence6;
                                }
                            } else {
                                aSN1Primitive = extensionValue;
                            }
                            if (aSN1Primitive != null) {
                                ASN1Sequence aSN1Sequence7 = (ASN1Sequence) aSN1Primitive;
                                HashMap hashMap = new HashMap();
                                HashSet hashSet5 = new HashSet();
                                PKIXPolicyNode pKIXPolicyNode5 = pKIXPolicyNode3;
                                i = i5;
                                int i13 = 0;
                                while (i13 < aSN1Sequence7.size()) {
                                    ASN1Sequence aSN1Sequence8 = (ASN1Sequence) aSN1Sequence7.getObjectAt(i13);
                                    ASN1Sequence aSN1Sequence9 = aSN1Sequence7;
                                    String id = ((ASN1ObjectIdentifier) aSN1Sequence8.getObjectAt(0)).getId();
                                    int i14 = i13;
                                    String id2 = ((ASN1ObjectIdentifier) aSN1Sequence8.getObjectAt(1)).getId();
                                    if (hashMap.containsKey(id)) {
                                        ((Set) hashMap.get(id)).add(id2);
                                    } else {
                                        HashSet hashSet6 = new HashSet();
                                        hashSet6.add(id2);
                                        hashMap.put(id, hashSet6);
                                        hashSet5.add(id);
                                    }
                                    i13 = i14 + 1;
                                    aSN1Sequence7 = aSN1Sequence9;
                                }
                                Iterator it = hashSet5.iterator();
                                pKIXPolicyNode3 = pKIXPolicyNode5;
                                while (it.hasNext()) {
                                    String str4 = (String) it.next();
                                    if (i7 > 0) {
                                        try {
                                            CertPathValidatorUtilities.prepareNextCertB1(i8, arrayListArr, str4, hashMap, x509Certificate2);
                                        } catch (CertPathValidatorException e3) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyQualifierError"), e3, this.certPath, size);
                                        } catch (AnnotatedException e4) {
                                            throw new CertPathReviewerException(createErrorBundle(str), e4, this.certPath, size);
                                        }
                                    } else if (i7 <= 0) {
                                        pKIXPolicyNode3 = CertPathValidatorUtilities.prepareNextCertB2(i8, arrayListArr, str4, pKIXPolicyNode3);
                                    }
                                }
                            } else {
                                i = i5;
                            }
                            if (CertPathValidatorUtilities.isSelfIssued(x509Certificate2)) {
                                i5 = i;
                            } else {
                                i5 = i != 0 ? i - 1 : i;
                                if (i7 != 0) {
                                    i7--;
                                }
                                if (i6 != 0) {
                                    i6--;
                                }
                            }
                            try {
                                ASN1Sequence aSN1Sequence10 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                                if (aSN1Sequence10 != null) {
                                    Enumeration objects3 = aSN1Sequence10.getObjects();
                                    while (objects3.hasMoreElements()) {
                                        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects3.nextElement();
                                        int tagNo = aSN1TaggedObject.getTagNo();
                                        if (tagNo == 0) {
                                            int intValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                            if (intValueExact3 < i5) {
                                                i5 = intValueExact3;
                                            }
                                        } else if (tagNo == 1 && (intValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact()) < i7) {
                                            i7 = intValueExact2;
                                        }
                                    }
                                }
                                try {
                                    ASN1Integer aSN1Integer = (ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509Certificate2, CertPathValidatorUtilities.INHIBIT_ANY_POLICY);
                                    if (aSN1Integer != null && (intValueExact = aSN1Integer.intValueExact()) < i6) {
                                        i6 = intValueExact;
                                    }
                                } catch (AnnotatedException unused) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyInhibitExtError"), this.certPath, size);
                                }
                            } catch (AnnotatedException unused2) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyConstExtError"), this.certPath, size);
                            }
                        } catch (AnnotatedException e5) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyMapExtError"), e5, this.certPath, size);
                        }
                    }
                    size--;
                    x509Certificate = x509Certificate2;
                    str2 = str;
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(createErrorBundle(str2), e6, this.certPath, size);
                }
            }
            int i15 = i5;
            int i16 = (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i15 <= 0) ? i15 : i15 - 1;
            try {
                ASN1Sequence aSN1Sequence11 = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.POLICY_CONSTRAINTS);
                if (aSN1Sequence11 != null) {
                    Enumeration objects4 = aSN1Sequence11.getObjects();
                    int i17 = i16;
                    while (objects4.hasMoreElements()) {
                        ASN1TaggedObject aSN1TaggedObject2 = (ASN1TaggedObject) objects4.nextElement();
                        if (aSN1TaggedObject2.getTagNo() == 0 && ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact() == 0) {
                            i17 = 0;
                        }
                    }
                    i16 = i17;
                }
                if (pKIXPolicyNode3 != null) {
                    if (!CertPathValidatorUtilities.isAnyPolicy(initialPolicies)) {
                        HashSet hashSet7 = new HashSet();
                        for (int i18 = 0; i18 < i3; i18++) {
                            ArrayList arrayList3 = arrayListArr[i18];
                            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) arrayList3.get(i19);
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode6.getValidPolicy())) {
                                    Iterator children = pKIXPolicyNode6.getChildren();
                                    while (children.hasNext()) {
                                        PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) children.next();
                                        if (!org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode7.getValidPolicy())) {
                                            hashSet7.add(pKIXPolicyNode7);
                                        }
                                    }
                                }
                            }
                        }
                        Iterator it2 = hashSet7.iterator();
                        while (it2.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) it2.next();
                            if (!initialPolicies.contains(pKIXPolicyNode8.getValidPolicy())) {
                                pKIXPolicyNode3 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode8);
                            }
                        }
                        if (pKIXPolicyNode3 != null) {
                            for (int i20 = this.n - 1; i20 >= 0; i20--) {
                                ArrayList arrayList4 = arrayListArr[i20];
                                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                                    PKIXPolicyNode pKIXPolicyNode9 = (PKIXPolicyNode) arrayList4.get(i21);
                                    if (!pKIXPolicyNode9.hasChildren()) {
                                        pKIXPolicyNode3 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode9);
                                    }
                                }
                            }
                        }
                    } else if (this.pkixParams.isExplicitPolicyRequired()) {
                        if (hashSet2.isEmpty()) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.explicitPolicy"), this.certPath, size);
                        }
                        HashSet hashSet8 = new HashSet();
                        for (int i22 = 0; i22 < i3; i22++) {
                            ArrayList arrayList5 = arrayListArr[i22];
                            for (int i23 = 0; i23 < arrayList5.size(); i23++) {
                                PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) arrayList5.get(i23);
                                if (org.bouncycastle.jce.provider.RFC3280CertPathUtilities.ANY_POLICY.equals(pKIXPolicyNode10.getValidPolicy())) {
                                    Iterator children2 = pKIXPolicyNode10.getChildren();
                                    while (children2.hasNext()) {
                                        hashSet8.add(children2.next());
                                    }
                                }
                            }
                        }
                        Iterator it3 = hashSet8.iterator();
                        while (it3.hasNext()) {
                            hashSet2.contains(((PKIXPolicyNode) it3.next()).getValidPolicy());
                        }
                        for (int i24 = this.n - 1; i24 >= 0; i24--) {
                            ArrayList arrayList6 = arrayListArr[i24];
                            for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                                PKIXPolicyNode pKIXPolicyNode11 = (PKIXPolicyNode) arrayList6.get(i25);
                                if (!pKIXPolicyNode11.hasChildren()) {
                                    pKIXPolicyNode3 = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode3, arrayListArr, pKIXPolicyNode11);
                                }
                            }
                        }
                    }
                    pKIXPolicyNode = pKIXPolicyNode3;
                } else {
                    if (this.pkixParams.isExplicitPolicyRequired()) {
                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.explicitPolicy"), this.certPath, size);
                    }
                    pKIXPolicyNode = null;
                }
                if (i16 <= 0 && pKIXPolicyNode == null) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.policyConstExtError"), this.certPath, size);
            }
        } catch (CertPathReviewerException e7) {
            addError(e7.getErrorMessage(), e7.getIndex());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:32|(2:120|121)(3:34|(2:115|116)(2:36|(2:112|(1:114)))|38)|(2:39|40)|41|(15:78|79|(12:81|82|83|(8:85|86|(2:89|87)|90|91|(2:94|92)|95|96)|100|86|(1:87)|90|91|(1:92)|95|96)|103|82|83|(0)|100|86|(1:87)|90|91|(1:92)|95|96)|(1:46)|47|(8:49|(1:53)|54|55|(1:57)(1:67)|59|60|(1:66))|70|71|72|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:78|79|(12:81|82|83|(8:85|86|(2:89|87)|90|91|(2:94|92)|95|96)|100|86|(1:87)|90|91|(1:92)|95|96)|103|82|83|(0)|100|86|(1:87)|90|91|(1:92)|95|96) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x027b, code lost:
    
        addError(createErrorBundle("CertPathReviewer.crlAuthInfoAccError"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0329, code lost:
    
        if (r2.isCA() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x036a, code lost:
    
        addError(createErrorBundle("CertPathReviewer.pubKeyError"), r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276 A[Catch: AnnotatedException -> 0x027b, TRY_LEAVE, TryCatch #9 {AnnotatedException -> 0x027b, blocks: (B:83:0x026e, B:85:0x0276), top: B:82:0x026e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297 A[LOOP:1: B:87:0x0291->B:89:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b8 A[LOOP:2: B:92:0x02b2->B:94:0x02b8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void checkSignatures() {
        TrustAnchor trustAnchor;
        ErrorBundle errorMessage;
        TrustAnchor trustAnchor2;
        X500Principal x500Principal;
        X509Certificate x509Certificate;
        PublicKey publicKey;
        int size;
        ErrorBundle createErrorBundle;
        ErrorBundle createErrorBundle2;
        CRLDistPoint cRLDistPoint;
        AuthorityInformationAccess authorityInformationAccess;
        Iterator it;
        Iterator it2;
        ASN1Primitive extensionValue;
        ASN1Primitive extensionValue2;
        AuthorityKeyIdentifier authorityKeyIdentifier;
        GeneralNames authorityCertIssuer;
        boolean[] keyUsage;
        X509Certificate x509Certificate2;
        Collection trustAnchors;
        ErrorBundle createErrorBundle3;
        addNotification(createErrorBundle("CertPathReviewer.certPathValidDate", new Object[]{new TrustedInput(this.validDate), new TrustedInput(this.currentDate)}));
        try {
            List list = this.certs;
            x509Certificate2 = (X509Certificate) list.get(list.size() - 1);
            trustAnchors = getTrustAnchors(x509Certificate2, this.pkixParams.getTrustAnchors());
        } catch (CertPathReviewerException e) {
            e = e;
            trustAnchor = null;
        } catch (Throwable th) {
            th = th;
            trustAnchor = null;
        }
        if (trustAnchors.size() > 1) {
            createErrorBundle3 = createErrorBundle("CertPathReviewer.conflictingTrustAnchors", new Object[]{Integers.valueOf(trustAnchors.size()), new UntrustedInput(x509Certificate2.getIssuerX500Principal())});
        } else {
            if (!trustAnchors.isEmpty()) {
                trustAnchor = (TrustAnchor) trustAnchors.iterator().next();
                try {
                    try {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate2, trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey(), this.pkixParams.getSigProvider());
                        } catch (SignatureException unused) {
                            addError(createErrorBundle("CertPathReviewer.trustButInvalidCert"));
                        } catch (Exception unused2) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        errorMessage = createErrorBundle("CertPathReviewer.unknown", new Object[]{new UntrustedInput(th.getMessage()), new UntrustedInput(th)});
                        addError(errorMessage);
                        trustAnchor2 = trustAnchor;
                        if (trustAnchor2 == null) {
                        }
                        if (trustAnchor2 == null) {
                        }
                        X509Certificate x509Certificate3 = x509Certificate;
                        X500Principal x500Principal2 = x500Principal;
                        PublicKey publicKey2 = publicKey;
                        size = this.certs.size() - 1;
                        while (size >= 0) {
                        }
                        this.trustAnchor = trustAnchor2;
                        this.subjectPublicKey = publicKey2;
                    }
                } catch (CertPathReviewerException e2) {
                    e = e2;
                    errorMessage = e.getErrorMessage();
                    addError(errorMessage);
                    trustAnchor2 = trustAnchor;
                    if (trustAnchor2 == null) {
                    }
                    if (trustAnchor2 == null) {
                    }
                    X509Certificate x509Certificate32 = x509Certificate;
                    X500Principal x500Principal22 = x500Principal;
                    PublicKey publicKey22 = publicKey;
                    size = this.certs.size() - 1;
                    while (size >= 0) {
                    }
                    this.trustAnchor = trustAnchor2;
                    this.subjectPublicKey = publicKey22;
                }
                trustAnchor2 = trustAnchor;
                if (trustAnchor2 == null) {
                    X509Certificate trustedCert = trustAnchor2.getTrustedCert();
                    try {
                        x500Principal = trustedCert != null ? CertPathValidatorUtilities.getSubjectPrincipal(trustedCert) : new X500Principal(trustAnchor2.getCAName());
                    } catch (IllegalArgumentException unused3) {
                        addError(createErrorBundle("CertPathReviewer.trustDNInvalid", new Object[]{new UntrustedInput(trustAnchor2.getCAName())}));
                        x500Principal = null;
                    }
                    if (trustedCert != null && (keyUsage = trustedCert.getKeyUsage()) != null && (keyUsage.length <= 5 || !keyUsage[5])) {
                        addNotification(createErrorBundle("CertPathReviewer.trustKeyUsage"));
                    }
                } else {
                    x500Principal = null;
                }
                if (trustAnchor2 == null) {
                    x509Certificate = trustAnchor2.getTrustedCert();
                    publicKey = x509Certificate != null ? x509Certificate.getPublicKey() : trustAnchor2.getCAPublicKey();
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                    } catch (CertPathValidatorException unused4) {
                        addError(createErrorBundle("CertPathReviewer.trustPubKeyError"));
                    }
                } else {
                    x509Certificate = null;
                    publicKey = null;
                }
                X509Certificate x509Certificate322 = x509Certificate;
                X500Principal x500Principal222 = x500Principal;
                PublicKey publicKey222 = publicKey;
                size = this.certs.size() - 1;
                while (size >= 0) {
                    int i = this.n - size;
                    X509Certificate x509Certificate4 = (X509Certificate) this.certs.get(size);
                    if (publicKey222 != null) {
                        try {
                            CertPathValidatorUtilities.verifyX509Certificate(x509Certificate4, publicKey222, this.pkixParams.getSigProvider());
                        } catch (GeneralSecurityException e3) {
                            createErrorBundle = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[]{e3.getMessage(), e3, e3.getClass().getName()});
                        }
                    } else {
                        if (CertPathValidatorUtilities.isSelfIssued(x509Certificate4)) {
                            try {
                                CertPathValidatorUtilities.verifyX509Certificate(x509Certificate4, x509Certificate4.getPublicKey(), this.pkixParams.getSigProvider());
                                addError(createErrorBundle("CertPathReviewer.rootKeyIsValidButNotATrustAnchor"), size);
                            } catch (GeneralSecurityException e4) {
                                createErrorBundle = createErrorBundle("CertPathReviewer.signatureNotVerified", new Object[]{e4.getMessage(), e4, e4.getClass().getName()});
                            }
                        } else {
                            createErrorBundle = createErrorBundle("CertPathReviewer.NoIssuerPublicKey");
                            byte[] extensionValue3 = x509Certificate4.getExtensionValue(Extension.authorityKeyIdentifier.getId());
                            if (extensionValue3 != null && (authorityCertIssuer = (authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue3).getOctets())).getAuthorityCertIssuer()) != null) {
                                GeneralName generalName = authorityCertIssuer.getNames()[0];
                                BigInteger authorityCertSerialNumber = authorityKeyIdentifier.getAuthorityCertSerialNumber();
                                if (authorityCertSerialNumber != null) {
                                    createErrorBundle.setExtraArguments(new Object[]{new LocaleString(RESOURCE_NAME, "missingIssuer"), " \"", generalName, "\" ", new LocaleString(RESOURCE_NAME, "missingSerial"), " ", authorityCertSerialNumber});
                                }
                            }
                        }
                        addError(createErrorBundle, size);
                    }
                    try {
                        x509Certificate4.checkValidity(this.validDate);
                    } catch (CertificateExpiredException unused5) {
                        createErrorBundle2 = createErrorBundle("CertPathReviewer.certificateExpired", new Object[]{new TrustedInput(x509Certificate4.getNotAfter())});
                        addError(createErrorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal222 != null) {
                            addError(createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[]{x500Principal222.getName(), x509Certificate4.getIssuerX500Principal().getName()}), size);
                        }
                        if (i != this.n) {
                        }
                        x500Principal222 = x509Certificate4.getSubjectX500Principal();
                        publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                        algorithmIdentifier2.getAlgorithm();
                        algorithmIdentifier2.getParameters();
                        size--;
                        x509Certificate322 = x509Certificate4;
                    } catch (CertificateNotYetValidException unused6) {
                        createErrorBundle2 = createErrorBundle("CertPathReviewer.certificateNotYetValid", new Object[]{new TrustedInput(x509Certificate4.getNotBefore())});
                        addError(createErrorBundle2, size);
                        if (this.pkixParams.isRevocationEnabled()) {
                        }
                        if (x500Principal222 != null) {
                        }
                        if (i != this.n) {
                        }
                        x500Principal222 = x509Certificate4.getSubjectX500Principal();
                        publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                        AlgorithmIdentifier algorithmIdentifier22 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                        algorithmIdentifier22.getAlgorithm();
                        algorithmIdentifier22.getParameters();
                        size--;
                        x509Certificate322 = x509Certificate4;
                    }
                    if (this.pkixParams.isRevocationEnabled()) {
                        try {
                            extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509Certificate4, CRL_DIST_POINTS);
                        } catch (AnnotatedException unused7) {
                            addError(createErrorBundle("CertPathReviewer.crlDistPtExtError"), size);
                        }
                        try {
                            if (extensionValue2 != null) {
                                cRLDistPoint = CRLDistPoint.getInstance(extensionValue2);
                                extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate4, AUTH_INFO_ACCESS);
                                if (extensionValue != null) {
                                    authorityInformationAccess = AuthorityInformationAccess.getInstance(extensionValue);
                                    Vector cRLDistUrls = getCRLDistUrls(cRLDistPoint);
                                    Vector oCSPUrls = getOCSPUrls(authorityInformationAccess);
                                    it = cRLDistUrls.iterator();
                                    while (it.hasNext()) {
                                        addNotification(createErrorBundle("CertPathReviewer.crlDistPoint", new Object[]{new UntrustedUrlInput(it.next())}), size);
                                    }
                                    it2 = oCSPUrls.iterator();
                                    while (it2.hasNext()) {
                                        addNotification(createErrorBundle("CertPathReviewer.ocspLocation", new Object[]{new UntrustedUrlInput(it2.next())}), size);
                                    }
                                    checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls, oCSPUrls, size);
                                }
                                authorityInformationAccess = null;
                                Vector cRLDistUrls2 = getCRLDistUrls(cRLDistPoint);
                                Vector oCSPUrls2 = getOCSPUrls(authorityInformationAccess);
                                it = cRLDistUrls2.iterator();
                                while (it.hasNext()) {
                                }
                                it2 = oCSPUrls2.iterator();
                                while (it2.hasNext()) {
                                }
                                checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls2, oCSPUrls2, size);
                            }
                            checkRevocation(this.pkixParams, x509Certificate4, this.validDate, x509Certificate322, publicKey222, cRLDistUrls2, oCSPUrls2, size);
                        } catch (CertPathReviewerException e5) {
                            addError(e5.getErrorMessage(), size);
                        }
                        cRLDistPoint = null;
                        extensionValue = CertPathValidatorUtilities.getExtensionValue(x509Certificate4, AUTH_INFO_ACCESS);
                        if (extensionValue != null) {
                        }
                        authorityInformationAccess = null;
                        Vector cRLDistUrls22 = getCRLDistUrls(cRLDistPoint);
                        Vector oCSPUrls22 = getOCSPUrls(authorityInformationAccess);
                        it = cRLDistUrls22.iterator();
                        while (it.hasNext()) {
                        }
                        it2 = oCSPUrls22.iterator();
                        while (it2.hasNext()) {
                        }
                    }
                    if (x500Principal222 != null && !x509Certificate4.getIssuerX500Principal().equals(x500Principal222)) {
                        addError(createErrorBundle("CertPathReviewer.certWrongIssuer", new Object[]{x500Principal222.getName(), x509Certificate4.getIssuerX500Principal().getName()}), size);
                    }
                    if (i != this.n) {
                        String str = "CertPathReviewer.noCACert";
                        if (x509Certificate4 != null && x509Certificate4.getVersion() == 1) {
                            addError(createErrorBundle("CertPathReviewer.noCACert"), size);
                        }
                        try {
                            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate4, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                            if (basicConstraints == null) {
                                str = "CertPathReviewer.noBasicConstraints";
                            }
                            addError(createErrorBundle(str), size);
                        } catch (AnnotatedException unused8) {
                            addError(createErrorBundle("CertPathReviewer.errorProcesingBC"), size);
                        }
                        boolean[] keyUsage2 = x509Certificate4.getKeyUsage();
                        if (keyUsage2 != null && (keyUsage2.length <= 5 || !keyUsage2[5])) {
                            addError(createErrorBundle("CertPathReviewer.noCertSign"), size);
                        }
                    }
                    x500Principal222 = x509Certificate4.getSubjectX500Principal();
                    publicKey222 = CertPathValidatorUtilities.getNextWorkingKey(this.certs, size);
                    AlgorithmIdentifier algorithmIdentifier222 = CertPathValidatorUtilities.getAlgorithmIdentifier(publicKey222);
                    algorithmIdentifier222.getAlgorithm();
                    algorithmIdentifier222.getParameters();
                    size--;
                    x509Certificate322 = x509Certificate4;
                }
                this.trustAnchor = trustAnchor2;
                this.subjectPublicKey = publicKey222;
            }
            createErrorBundle3 = createErrorBundle("CertPathReviewer.noTrustAnchorFound", new Object[]{new UntrustedInput(x509Certificate2.getIssuerX500Principal()), Integers.valueOf(this.pkixParams.getTrustAnchors().size())});
        }
        addError(createErrorBundle3);
        trustAnchor = null;
        trustAnchor2 = trustAnchor;
        if (trustAnchor2 == null) {
        }
        if (trustAnchor2 == null) {
        }
        X509Certificate x509Certificate3222 = x509Certificate;
        X500Principal x500Principal2222 = x500Principal;
        PublicKey publicKey2222 = publicKey;
        size = this.certs.size() - 1;
        while (size >= 0) {
        }
        this.trustAnchor = trustAnchor2;
        this.subjectPublicKey = publicKey2222;
    }

    private static ErrorBundle createErrorBundle(String str) {
        ErrorBundle errorBundle = new ErrorBundle(RESOURCE_NAME, str);
        errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
        return errorBundle;
    }

    private X509CRL getCRL(String str) {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) {
                return null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.loadCrlDistPointError", new Object[]{new UntrustedInput(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean processQcStatements(X509Certificate x509Certificate, int i) {
        ErrorBundle createErrorBundle;
        String str;
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) CertPathValidatorUtilities.getExtensionValue(x509Certificate, QC_STATEMENT);
            boolean z = false;
            for (int i2 = 0; i2 < aSN1Sequence.size(); i2++) {
                QCStatement qCStatement = QCStatement.getInstance(aSN1Sequence.getObjectAt(i2));
                if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcCompliance.equals((ASN1Primitive) qCStatement.getStatementId())) {
                    str = "CertPathReviewer.QcEuCompliance";
                } else {
                    if (!RFC3739QCObjectIdentifiers.id_qcs_pkixQCSyntax_v1.equals((ASN1Primitive) qCStatement.getStatementId())) {
                        if (ETSIQCObjectIdentifiers.id_etsi_qcs_QcSSCD.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            str = "CertPathReviewer.QcSSCD";
                        } else if (ETSIQCObjectIdentifiers.id_etsi_qcs_LimiteValue.equals((ASN1Primitive) qCStatement.getStatementId())) {
                            MonetaryValue monetaryValue = MonetaryValue.getInstance(qCStatement.getStatementInfo());
                            monetaryValue.getCurrency();
                            double doubleValue = monetaryValue.getAmount().doubleValue() * Math.pow(10.0d, monetaryValue.getExponent().doubleValue());
                            createErrorBundle = monetaryValue.getCurrency().isAlphabetic() ? createErrorBundle("CertPathReviewer.QcLimitValueAlpha", new Object[]{monetaryValue.getCurrency().getAlphabetic(), new TrustedInput(new Double(doubleValue)), monetaryValue}) : createErrorBundle("CertPathReviewer.QcLimitValueNum", new Object[]{Integers.valueOf(monetaryValue.getCurrency().getNumeric()), new TrustedInput(new Double(doubleValue)), monetaryValue});
                            addNotification(createErrorBundle, i);
                        } else {
                            addNotification(createErrorBundle("CertPathReviewer.QcUnknownStatement", new Object[]{qCStatement.getStatementId(), new UntrustedInput(qCStatement)}), i);
                            z = true;
                        }
                    }
                }
                createErrorBundle = createErrorBundle(str);
                addNotification(createErrorBundle, i);
            }
            return !z;
        } catch (AnnotatedException unused) {
            addError(createErrorBundle("CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
    }

    public void addError(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
        } else {
            this.errors[i + 1].add(errorBundle);
        }
    }

    public void addNotification(ErrorBundle errorBundle, int i) {
        if (i < -1 || i >= this.n) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
        } else {
            this.notifications[i + 1].add(errorBundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkCRLs(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, int i) {
        Iterator it;
        X509CRL x509crl;
        boolean z;
        String str;
        String str2;
        boolean z2;
        ErrorBundle createErrorBundle;
        String str3;
        boolean[] keyUsage;
        ErrorBundle createErrorBundle2;
        String str4 = "CertPathReviewer.crlIssuerException";
        String str5 = "CertPathReviewer.distrPtExtError";
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        try {
            x509CRLStoreSelector.addIssuerName(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            x509CRLStoreSelector.setCertificateChecking(x509Certificate);
            try {
                Set findCRLs = PKIXCRLUtil.findCRLs(x509CRLStoreSelector, pKIXParameters);
                it = findCRLs.iterator();
                if (findCRLs.isEmpty()) {
                    Iterator it2 = PKIXCRLUtil.findCRLs(new X509CRLStoreSelector(), pKIXParameters).iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it2.hasNext()) {
                        arrayList.add(((X509CRL) it2.next()).getIssuerX500Principal());
                    }
                    addNotification(createErrorBundle("CertPathReviewer.noCrlInCertstore", new Object[]{new UntrustedInput(x509CRLStoreSelector.getIssuerNames()), new UntrustedInput(arrayList), Integers.valueOf(arrayList.size())}), i);
                }
            } catch (AnnotatedException e) {
                addError(createErrorBundle("CertPathReviewer.crlExtractionError", new Object[]{e.getCause().getMessage(), e.getCause(), e.getCause().getClass().getName()}), i);
                it = new ArrayList().iterator();
            }
            X509CRL x509crl2 = null;
            while (it.hasNext()) {
                x509crl2 = (X509CRL) it.next();
                Date thisUpdate = x509crl2.getThisUpdate();
                Date nextUpdate = x509crl2.getNextUpdate();
                Object[] objArr = {new TrustedInput(thisUpdate), new TrustedInput(nextUpdate)};
                if (nextUpdate == null || date.before(nextUpdate)) {
                    addNotification(createErrorBundle("CertPathReviewer.localValidCRL", objArr), i);
                    x509crl = x509crl2;
                    z = true;
                    break;
                }
                addNotification(createErrorBundle("CertPathReviewer.localInvalidCRL", objArr), i);
            }
            x509crl = x509crl2;
            z = false;
            if (!z) {
                X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                Iterator it3 = vector.iterator();
                boolean z3 = z;
                while (true) {
                    if (!it3.hasNext()) {
                        str = str4;
                        str2 = str5;
                        z2 = z3;
                        break;
                    }
                    try {
                        String str6 = (String) it3.next();
                        X509CRL crl = getCRL(str6);
                        if (crl != null) {
                            X500Principal issuerX500Principal2 = crl.getIssuerX500Principal();
                            if (issuerX500Principal.equals(issuerX500Principal2)) {
                                str = str4;
                                str2 = str5;
                                Date thisUpdate2 = crl.getThisUpdate();
                                Date nextUpdate2 = crl.getNextUpdate();
                                Object[] objArr2 = {new TrustedInput(thisUpdate2), new TrustedInput(nextUpdate2), new UntrustedUrlInput(str6)};
                                if (nextUpdate2 != null && !date.before(nextUpdate2)) {
                                    createErrorBundle2 = createErrorBundle("CertPathReviewer.onlineInvalidCRL", objArr2);
                                }
                                try {
                                    addNotification(createErrorBundle("CertPathReviewer.onlineValidCRL", objArr2), i);
                                    x509crl = crl;
                                    z2 = true;
                                    break;
                                } catch (CertPathReviewerException e2) {
                                    e = e2;
                                    z3 = true;
                                    addNotification(e.getErrorMessage(), i);
                                    str4 = str;
                                    str5 = str2;
                                }
                            } else {
                                str = str4;
                                try {
                                    str2 = str5;
                                    try {
                                        createErrorBundle2 = createErrorBundle("CertPathReviewer.onlineCRLWrongCA", new Object[]{new UntrustedInput(issuerX500Principal2.getName()), new UntrustedInput(issuerX500Principal.getName()), new UntrustedUrlInput(str6)});
                                    } catch (CertPathReviewerException e3) {
                                        e = e3;
                                        addNotification(e.getErrorMessage(), i);
                                        str4 = str;
                                        str5 = str2;
                                    }
                                } catch (CertPathReviewerException e4) {
                                    e = e4;
                                    str2 = str5;
                                    addNotification(e.getErrorMessage(), i);
                                    str4 = str;
                                    str5 = str2;
                                }
                            }
                            addNotification(createErrorBundle2, i);
                        } else {
                            str = str4;
                            str2 = str5;
                        }
                    } catch (CertPathReviewerException e5) {
                        e = e5;
                        str = str4;
                    }
                    str4 = str;
                    str5 = str2;
                }
            } else {
                str = "CertPathReviewer.crlIssuerException";
                str2 = "CertPathReviewer.distrPtExtError";
                z2 = z;
            }
            if (x509crl != null) {
                if (x509Certificate2 != null && (keyUsage = x509Certificate2.getKeyUsage()) != null && (keyUsage.length <= 6 || !keyUsage[6])) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noCrlSigningPermited"));
                }
                if (publicKey == null) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlNoIssuerPublicKey"));
                }
                try {
                    x509crl.verify(publicKey, BouncyCastleProvider.PROVIDER_NAME);
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate.getSerialNumber());
                    if (revokedCertificate != null) {
                        if (revokedCertificate.hasExtensions()) {
                            try {
                                ASN1Enumerated aSN1Enumerated = ASN1Enumerated.getInstance(CertPathValidatorUtilities.getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                                if (aSN1Enumerated != null) {
                                    str3 = CertPathValidatorUtilities.crlReasons[aSN1Enumerated.intValueExact()];
                                    if (str3 == null) {
                                        str3 = CertPathValidatorUtilities.crlReasons[7];
                                    }
                                    LocaleString localeString = new LocaleString(RESOURCE_NAME, str3);
                                    if (date.before(revokedCertificate.getRevocationDate())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.certRevoked", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString}));
                                    }
                                    createErrorBundle = createErrorBundle("CertPathReviewer.revokedAfterValidation", new Object[]{new TrustedInput(revokedCertificate.getRevocationDate()), localeString});
                                }
                            } catch (AnnotatedException e6) {
                                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlReasonExtError"), e6);
                            }
                        }
                        str3 = null;
                        if (str3 == null) {
                        }
                        LocaleString localeString2 = new LocaleString(RESOURCE_NAME, str3);
                        if (date.before(revokedCertificate.getRevocationDate())) {
                        }
                    } else {
                        createErrorBundle = createErrorBundle("CertPathReviewer.notRevoked");
                    }
                    addNotification(createErrorBundle, i);
                    Date nextUpdate3 = x509crl.getNextUpdate();
                    if (nextUpdate3 != null && !date.before(nextUpdate3)) {
                        addNotification(createErrorBundle("CertPathReviewer.crlUpdateAvailable", new Object[]{new TrustedInput(nextUpdate3)}), i);
                    }
                    try {
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.DELTA_CRL_INDICATOR);
                            if (extensionValue2 != null) {
                                X509CRLStoreSelector x509CRLStoreSelector2 = new X509CRLStoreSelector();
                                try {
                                    x509CRLStoreSelector2.addIssuerName(CertPathValidatorUtilities.getIssuerPrincipal(x509crl).getEncoded());
                                    x509CRLStoreSelector2.setMinCRLNumber(((ASN1Integer) extensionValue2).getPositiveValue());
                                    try {
                                        x509CRLStoreSelector2.setMaxCRLNumber(((ASN1Integer) CertPathValidatorUtilities.getExtensionValue(x509crl, CertPathValidatorUtilities.CRL_NUMBER)).getPositiveValue().subtract(BigInteger.valueOf(1L)));
                                        try {
                                            Iterator it4 = PKIXCRLUtil.findCRLs(x509CRLStoreSelector2, pKIXParameters).iterator();
                                            while (it4.hasNext()) {
                                                try {
                                                    if (Objects.areEqual(extensionValue, CertPathValidatorUtilities.getExtensionValue((X509CRL) it4.next(), CertPathValidatorUtilities.ISSUING_DISTRIBUTION_POINT))) {
                                                    }
                                                } catch (AnnotatedException e7) {
                                                    throw new CertPathReviewerException(createErrorBundle(str2), e7);
                                                }
                                            }
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noBaseCRL"));
                                        } catch (AnnotatedException e8) {
                                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlExtractionError"), e8);
                                        }
                                    } catch (AnnotatedException e9) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlNbrExtError"), e9);
                                    }
                                } catch (IOException e10) {
                                    throw new CertPathReviewerException(createErrorBundle(str), e10);
                                }
                            }
                            if (extensionValue != null) {
                                IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(extensionValue);
                                try {
                                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CertPathValidatorUtilities.BASIC_CONSTRAINTS));
                                    if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyUserCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyCaCert"));
                                    }
                                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                                        throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlOnlyAttrCert"));
                                    }
                                } catch (AnnotatedException e11) {
                                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlBCExtError"), e11);
                                }
                            }
                        } catch (AnnotatedException unused) {
                            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.deltaCrlExtError"));
                        }
                    } catch (AnnotatedException unused2) {
                        throw new CertPathReviewerException(createErrorBundle(str2));
                    }
                } catch (Exception e12) {
                    throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlVerifyFailed"), e12);
                }
            }
            if (!z2) {
                throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.noValidCrlFound"));
            }
        } catch (IOException e13) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.crlIssuerException"), e13);
        }
    }

    public void checkRevocation(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) {
        checkCRLs(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    public void doChecks() {
        if (!this.initialized) {
            a$$ExternalSyntheticBUOutline0.m$1("Object not initialized. Call init() first.");
            return;
        }
        if (this.notifications != null) {
            return;
        }
        int i = this.n;
        this.notifications = new List[i + 1];
        this.errors = new List[i + 1];
        int i2 = 0;
        while (true) {
            List[] listArr = this.notifications;
            if (i2 >= listArr.length) {
                checkSignatures();
                checkNameConstraints();
                checkPathLength();
                checkPolicy();
                checkCriticalExtensions();
                return;
            }
            listArr[i2] = new ArrayList();
            this.errors[i2] = new ArrayList();
            i2++;
        }
    }

    public Vector getCRLDistUrls(CRLDistPoint cRLDistPoint) {
        Vector vector = new Vector();
        if (cRLDistPoint != null) {
            for (DistributionPoint distributionPoint : cRLDistPoint.getDistributionPoints()) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2.getType() == 0) {
                    GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i].getTagNo() == 6) {
                            vector.add(((ASN1IA5String) names[i].getName()).getString());
                        }
                    }
                }
            }
        }
        return vector;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getCertPathSize() {
        return this.n;
    }

    public List getErrors(int i) {
        doChecks();
        return this.errors[i + 1];
    }

    public List getNotifications(int i) {
        doChecks();
        return this.notifications[i + 1];
    }

    public Vector getOCSPUrls(AuthorityInformationAccess authorityInformationAccess) {
        Vector vector = new Vector();
        if (authorityInformationAccess != null) {
            AccessDescription[] accessDescriptions = authorityInformationAccess.getAccessDescriptions();
            for (int i = 0; i < accessDescriptions.length; i++) {
                if (accessDescriptions[i].getAccessMethod().equals((ASN1Primitive) AccessDescription.id_ad_ocsp)) {
                    GeneralName accessLocation = accessDescriptions[i].getAccessLocation();
                    if (accessLocation.getTagNo() == 6) {
                        vector.add(((ASN1IA5String) accessLocation.getName()).getString());
                    }
                }
            }
        }
        return vector;
    }

    public PolicyNode getPolicyTree() {
        doChecks();
        return this.policyTree;
    }

    public PublicKey getSubjectPublicKey() {
        doChecks();
        return this.subjectPublicKey;
    }

    public TrustAnchor getTrustAnchor() {
        doChecks();
        return this.trustAnchor;
    }

    public Collection getTrustAnchors(X509Certificate x509Certificate, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            if (extensionValue != null) {
                AuthorityKeyIdentifier authorityKeyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()));
                if (authorityKeyIdentifier.getAuthorityCertSerialNumber() != null) {
                    x509CertSelector.setSerialNumber(authorityKeyIdentifier.getAuthorityCertSerialNumber());
                } else {
                    byte[] keyIdentifier = authorityKeyIdentifier.getKeyIdentifier();
                    if (keyIdentifier != null) {
                        x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                    }
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                        arrayList.add(trustAnchor);
                    }
                } else if (trustAnchor.getCAName() != null && trustAnchor.getCAPublicKey() != null && CertPathValidatorUtilities.getEncodedIssuerPrincipal(x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                    arrayList.add(trustAnchor);
                }
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public void init(CertPath certPath, PKIXParameters pKIXParameters) {
        if (this.initialized) {
            a$$ExternalSyntheticBUOutline0.m$1("object is already initialized!");
            return;
        }
        this.initialized = true;
        if (certPath == null) {
            a$$ExternalSyntheticBUOutline0.m$2("certPath was null");
            return;
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates.size() != 1) {
            HashSet hashSet = new HashSet();
            Iterator<TrustAnchor> it = pKIXParameters.getTrustAnchors().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getTrustedCert());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != certificates.size(); i++) {
                if (!hashSet.contains(certificates.get(i))) {
                    arrayList.add(certificates.get(i));
                }
            }
            try {
                this.certPath = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCertPath(arrayList);
                this.certs = arrayList;
            } catch (GeneralSecurityException unused) {
                a$$ExternalSyntheticBUOutline0.m$1("unable to rebuild certpath");
                return;
            }
        } else {
            this.certPath = certPath;
            this.certs = certPath.getCertificates();
        }
        this.n = this.certs.size();
        if (this.certs.isEmpty()) {
            throw new CertPathReviewerException(createErrorBundle("CertPathReviewer.emptyCertPath"));
        }
        this.pkixParams = (PKIXParameters) pKIXParameters.clone();
        Date date = new Date();
        this.currentDate = date;
        this.validDate = CertPathValidatorUtilities.getValidityDate(this.pkixParams, date);
        this.notifications = null;
        this.errors = null;
        this.trustAnchor = null;
        this.subjectPublicKey = null;
        this.policyTree = null;
    }

    public boolean isValidCertPath() {
        doChecks();
        int i = 0;
        while (true) {
            List[] listArr = this.errors;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }

    public PKIXCertPathReviewer() {
    }

    public List[] getErrors() {
        doChecks();
        return this.errors;
    }

    public List[] getNotifications() {
        doChecks();
        return this.notifications;
    }

    private static ErrorBundle createErrorBundle(String str, Object[] objArr) {
        ErrorBundle errorBundle = new ErrorBundle(RESOURCE_NAME, str, objArr);
        errorBundle.setClassLoader(PKIXCertPathReviewer.class.getClassLoader());
        return errorBundle;
    }

    public void addError(ErrorBundle errorBundle) {
        this.errors[0].add(errorBundle);
    }

    public void addNotification(ErrorBundle errorBundle) {
        this.notifications[0].add(errorBundle);
    }
}
