package org.bouncycastle.cms;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Store;

/* loaded from: classes9.dex */
public class CMSSignedData implements Encodable {
    ContentInfo contentInfo;
    private Map hashes;
    CMSTypedData signedContent;
    SignedData signedData;
    SignerInformationStore signerInfoStore;
    private static final CMSSignedHelper HELPER = CMSSignedHelper.INSTANCE;
    private static final DefaultDigestAlgorithmIdentifierFinder DIGEST_ALG_ID_FINDER = new DefaultDigestAlgorithmIdentifierFinder();

    public CMSSignedData(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        SignedData signedData = getSignedData();
        this.signedData = signedData;
        ASN1Encodable content = signedData.getEncapContentInfo().getContent();
        if (content == null) {
            this.signedContent = null;
            return;
        }
        boolean z = content instanceof ASN1OctetString;
        SignedData signedData2 = this.signedData;
        if (z) {
            this.signedContent = new CMSProcessableByteArray(signedData2.getEncapContentInfo().getContentType(), ((ASN1OctetString) content).getOctets());
        } else {
            this.signedContent = new PKCS7ProcessableObject(signedData2.getEncapContentInfo().getContentType(), content);
        }
    }

    public static CMSSignedData addDigestAlgorithm(CMSSignedData cMSSignedData, AlgorithmIdentifier algorithmIdentifier, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        Set<AlgorithmIdentifier> digestAlgorithmIDs = cMSSignedData.getDigestAlgorithmIDs();
        AlgorithmIdentifier fixDigestAlgID = HELPER.fixDigestAlgID(algorithmIdentifier, digestAlgorithmIdentifierFinder);
        if (digestAlgorithmIDs.contains(fixDigestAlgID)) {
            return cMSSignedData;
        }
        CMSSignedData cMSSignedData2 = new CMSSignedData(cMSSignedData);
        HashSet hashSet = new HashSet();
        Iterator<AlgorithmIdentifier> it = digestAlgorithmIDs.iterator();
        while (it.hasNext()) {
            hashSet.add(HELPER.fixDigestAlgID(it.next(), digestAlgorithmIdentifierFinder));
        }
        hashSet.add(fixDigestAlgID);
        ASN1Set convertToDlSet = CMSUtils.convertToDlSet(hashSet);
        ASN1Sequence aSN1Sequence = (ASN1Sequence) cMSSignedData.signedData.toASN1Primitive();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(aSN1Sequence.size());
        aSN1EncodableVector.add(aSN1Sequence.getObjectAt(0));
        aSN1EncodableVector.add(convertToDlSet);
        for (int i = 2; i != aSN1Sequence.size(); i++) {
            aSN1EncodableVector.add(aSN1Sequence.getObjectAt(i));
        }
        cMSSignedData2.signedData = SignedData.getInstance(new BERSequence(aSN1EncodableVector));
        cMSSignedData2.contentInfo = new ContentInfo(cMSSignedData2.contentInfo.getContentType(), cMSSignedData2.signedData);
        return cMSSignedData2;
    }

    private static void compareAndReplaceAlgIds(AlgorithmIdentifier[] algorithmIdentifierArr, AlgorithmIdentifier[] algorithmIdentifierArr2) {
        for (int i = 0; i != algorithmIdentifierArr2.length; i++) {
            AlgorithmIdentifier algorithmIdentifier = algorithmIdentifierArr2[i];
            for (int i2 = 0; i2 != algorithmIdentifierArr.length; i2++) {
                AlgorithmIdentifier algorithmIdentifier2 = algorithmIdentifierArr[i2];
                if (algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) algorithmIdentifier2.getAlgorithm()) && (algorithmIdentifier.getParameters() == null || DERNull.INSTANCE.equals(algorithmIdentifier.getParameters()))) {
                    algorithmIdentifierArr2[i] = algorithmIdentifier2;
                    break;
                }
            }
        }
    }

    private SignedData getSignedData() {
        try {
            return SignedData.getInstance(this.contentInfo.getContent());
        } catch (ClassCastException | IllegalArgumentException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "Malformed content.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CMSSignedData replaceCertificatesAndCRLs(CMSSignedData cMSSignedData, Store store, Store store2, Store store3) {
        ASN1Set aSN1Set;
        ASN1Set aSN1Set2;
        CMSSignedData cMSSignedData2 = new CMSSignedData(cMSSignedData);
        if (store != null || store2 != null) {
            ArrayList arrayList = new ArrayList();
            if (store != null) {
                arrayList.addAll(CMSUtils.getCertificatesFromStore(store));
            }
            if (store2 != null) {
                arrayList.addAll(CMSUtils.getAttributeCertificatesFromStore(store2));
            }
            ASN1Set createBerSetFromList = CMSUtils.createBerSetFromList(arrayList);
            if (createBerSetFromList.size() != 0) {
                aSN1Set = createBerSetFromList;
                if (store3 != null) {
                    ASN1Set createBerSetFromList2 = CMSUtils.createBerSetFromList(CMSUtils.getCRLsFromStore(store3));
                    if (createBerSetFromList2.size() != 0) {
                        aSN1Set2 = createBerSetFromList2;
                        cMSSignedData2.signedData = new SignedData(cMSSignedData.signedData.getDigestAlgorithms(), cMSSignedData.signedData.getEncapContentInfo(), aSN1Set, aSN1Set2, cMSSignedData.signedData.getSignerInfos());
                        cMSSignedData2.contentInfo = new ContentInfo(cMSSignedData2.contentInfo.getContentType(), cMSSignedData2.signedData);
                        return cMSSignedData2;
                    }
                }
                aSN1Set2 = null;
                cMSSignedData2.signedData = new SignedData(cMSSignedData.signedData.getDigestAlgorithms(), cMSSignedData.signedData.getEncapContentInfo(), aSN1Set, aSN1Set2, cMSSignedData.signedData.getSignerInfos());
                cMSSignedData2.contentInfo = new ContentInfo(cMSSignedData2.contentInfo.getContentType(), cMSSignedData2.signedData);
                return cMSSignedData2;
            }
        }
        aSN1Set = null;
        if (store3 != null) {
        }
        aSN1Set2 = null;
        cMSSignedData2.signedData = new SignedData(cMSSignedData.signedData.getDigestAlgorithms(), cMSSignedData.signedData.getEncapContentInfo(), aSN1Set, aSN1Set2, cMSSignedData.signedData.getSignerInfos());
        cMSSignedData2.contentInfo = new ContentInfo(cMSSignedData2.contentInfo.getContentType(), cMSSignedData2.signedData);
        return cMSSignedData2;
    }

    public static CMSSignedData replaceSigners(CMSSignedData cMSSignedData, SignerInformationStore signerInformationStore, DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        CMSSignedData cMSSignedData2 = new CMSSignedData(cMSSignedData);
        cMSSignedData2.signerInfoStore = signerInformationStore;
        HashSet hashSet = new HashSet();
        Collection<SignerInformation> signers = signerInformationStore.getSigners();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(signers.size());
        for (SignerInformation signerInformation : signers) {
            CMSUtils.addDigestAlgs(hashSet, signerInformation, digestAlgorithmIdentifierFinder);
            aSN1EncodableVector.add(signerInformation.toASN1Structure());
        }
        Set<AlgorithmIdentifier> digestAlgorithmIDs = cMSSignedData.getDigestAlgorithmIDs();
        AlgorithmIdentifier[] algorithmIdentifierArr = (AlgorithmIdentifier[]) digestAlgorithmIDs.toArray(new AlgorithmIdentifier[digestAlgorithmIDs.size()]);
        AlgorithmIdentifier[] algorithmIdentifierArr2 = (AlgorithmIdentifier[]) hashSet.toArray(new AlgorithmIdentifier[hashSet.size()]);
        compareAndReplaceAlgIds(algorithmIdentifierArr, algorithmIdentifierArr2);
        DLSet dLSet = new DLSet(algorithmIdentifierArr2);
        DLSet dLSet2 = new DLSet(aSN1EncodableVector);
        ASN1Sequence aSN1Sequence = (ASN1Sequence) cMSSignedData.signedData.toASN1Primitive();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(aSN1Sequence.size());
        aSN1EncodableVector2.add(aSN1Sequence.getObjectAt(0));
        aSN1EncodableVector2.add(dLSet);
        for (int i = 2; i != aSN1Sequence.size() - 1; i++) {
            aSN1EncodableVector2.add(aSN1Sequence.getObjectAt(i));
        }
        aSN1EncodableVector2.add(dLSet2);
        cMSSignedData2.signedData = SignedData.getInstance(new BERSequence(aSN1EncodableVector2));
        cMSSignedData2.contentInfo = new ContentInfo(cMSSignedData2.contentInfo.getContentType(), cMSSignedData2.signedData);
        return cMSSignedData2;
    }

    private boolean verifyCounterSignature(SignerInformation signerInformation, SignerInformationVerifierProvider signerInformationVerifierProvider) {
        if (!signerInformation.verify(signerInformationVerifierProvider.get(signerInformation.getSID()))) {
            return false;
        }
        Iterator<SignerInformation> it = signerInformation.getCounterSignatures().getSigners().iterator();
        while (it.hasNext()) {
            if (!verifyCounterSignature(it.next(), signerInformationVerifierProvider)) {
                return false;
            }
        }
        return true;
    }

    public Store<X509AttributeCertificateHolder> getAttributeCertificates() {
        return HELPER.getAttributeCertificates(this.signedData.getCertificates());
    }

    public Store<X509CRLHolder> getCRLs() {
        return HELPER.getCRLs(this.signedData.getCRLs());
    }

    public Store<X509CertificateHolder> getCertificates() {
        return HELPER.getCertificates(this.signedData.getCertificates());
    }

    public Set<AlgorithmIdentifier> getDigestAlgorithmIDs() {
        HashSet hashSet = new HashSet();
        Enumeration objects = this.signedData.getDigestAlgorithms().getObjects();
        while (objects.hasMoreElements()) {
            hashSet.add(AlgorithmIdentifier.getInstance(objects.nextElement()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public Store getOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return HELPER.getOtherRevocationInfo(aSN1ObjectIdentifier, this.signedData.getCRLs());
    }

    public CMSTypedData getSignedContent() {
        return this.signedContent;
    }

    public String getSignedContentTypeOID() {
        return this.signedData.getEncapContentInfo().getContentType().getId();
    }

    public SignerInformationStore getSignerInfos() {
        if (this.signerInfoStore == null) {
            ASN1Set signerInfos = this.signedData.getSignerInfos();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != signerInfos.size(); i++) {
                SignerInfo signerInfo = SignerInfo.getInstance(signerInfos.getObjectAt(i));
                ASN1ObjectIdentifier contentType = this.signedData.getEncapContentInfo().getContentType();
                Map map = this.hashes;
                if (map == null) {
                    arrayList.add(new SignerInformation(signerInfo, contentType, this.signedContent, null));
                } else {
                    arrayList.add(new SignerInformation(signerInfo, contentType, null, (byte[]) this.hashes.get(map.keySet().iterator().next() instanceof String ? signerInfo.getDigestAlgorithm().getAlgorithm().getId() : signerInfo.getDigestAlgorithm().getAlgorithm())));
                }
            }
            this.signerInfoStore = new SignerInformationStore(arrayList);
        }
        return this.signerInfoStore;
    }

    public int getVersion() {
        return this.signedData.getVersion().intValueExact();
    }

    public boolean isCertificateManagementMessage() {
        return this.signedData.getEncapContentInfo().getContent() == null && this.signedData.getSignerInfos().size() == 0;
    }

    public boolean isDetachedSignature() {
        return this.signedData.getEncapContentInfo().getContent() == null && this.signedData.getSignerInfos().size() > 0;
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public boolean verifySignatures(SignerInformationVerifierProvider signerInformationVerifierProvider, boolean z) {
        for (SignerInformation signerInformation : getSignerInfos().getSigners()) {
            try {
                if (!signerInformation.verify(signerInformationVerifierProvider.get(signerInformation.getSID()))) {
                    return false;
                }
                if (!z) {
                    Iterator<SignerInformation> it = signerInformation.getCounterSignatures().getSigners().iterator();
                    while (it.hasNext()) {
                        if (!verifyCounterSignature(it.next(), signerInformationVerifierProvider)) {
                            return false;
                        }
                    }
                }
            } catch (OperatorCreationException e) {
                throw new CMSException("failure in verifier provider: " + e.getMessage(), e);
            }
        }
        return true;
    }

    public byte[] getEncoded(String str) {
        return this.contentInfo.getEncoded(str);
    }

    public CMSSignedData(Map map, ContentInfo contentInfo) {
        this.hashes = map;
        this.contentInfo = contentInfo;
        this.signedData = getSignedData();
    }

    public CMSSignedData(Map map, byte[] bArr) {
        this(map, CMSUtils.readContentInfo(bArr));
    }

    public CMSSignedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public CMSSignedData(CMSProcessable cMSProcessable, InputStream inputStream) {
        this(cMSProcessable, CMSUtils.readContentInfo((InputStream) new ASN1InputStream(inputStream)));
    }

    public CMSSignedData(final CMSProcessable cMSProcessable, ContentInfo contentInfo) {
        if (cMSProcessable instanceof CMSTypedData) {
            this.signedContent = (CMSTypedData) cMSProcessable;
        } else {
            this.signedContent = new CMSTypedData() { // from class: org.bouncycastle.cms.CMSSignedData.1
                @Override // org.bouncycastle.cms.CMSProcessable
                public Object getContent() {
                    return cMSProcessable.getContent();
                }

                @Override // org.bouncycastle.cms.CMSTypedData
                public ASN1ObjectIdentifier getContentType() {
                    return CMSSignedData.this.signedData.getEncapContentInfo().getContentType();
                }

                @Override // org.bouncycastle.cms.CMSProcessable
                public void write(OutputStream outputStream) {
                    cMSProcessable.write(outputStream);
                }
            };
        }
        this.contentInfo = contentInfo;
        this.signedData = getSignedData();
    }

    public CMSSignedData(CMSProcessable cMSProcessable, byte[] bArr) {
        this(cMSProcessable, CMSUtils.readContentInfo(bArr));
    }

    private CMSSignedData(CMSSignedData cMSSignedData) {
        this.signedData = cMSSignedData.signedData;
        this.contentInfo = cMSSignedData.contentInfo;
        this.signedContent = cMSSignedData.signedContent;
        this.signerInfoStore = cMSSignedData.signerInfoStore;
    }

    public CMSSignedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }

    public boolean verifySignatures(SignerInformationVerifierProvider signerInformationVerifierProvider) {
        return verifySignatures(signerInformationVerifierProvider, false);
    }

    public static CMSSignedData addDigestAlgorithm(CMSSignedData cMSSignedData, AlgorithmIdentifier algorithmIdentifier) {
        return addDigestAlgorithm(cMSSignedData, algorithmIdentifier, DIGEST_ALG_ID_FINDER);
    }

    public static CMSSignedData replaceSigners(CMSSignedData cMSSignedData, SignerInformationStore signerInformationStore) {
        return replaceSigners(cMSSignedData, signerInformationStore, DIGEST_ALG_ID_FINDER);
    }
}
