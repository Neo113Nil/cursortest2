package org.bouncycastle.cms;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;

/* loaded from: classes9.dex */
public class CMSSignedDataGenerator extends CMSSignedGenerator {
    private boolean isDefiniteLength;
    private List signerInfs;

    public CMSSignedDataGenerator() {
        this.signerInfs = new ArrayList();
        this.isDefiniteLength = false;
    }

    private static ASN1Set createSetFromList(List list, boolean z) {
        if (list.size() != 0) {
            return z ? CMSUtils.createDlSetFromList(list) : CMSUtils.createBerSetFromList(list);
        }
        return null;
    }

    public CMSSignedData generate(CMSTypedData cMSTypedData, boolean z) {
        ASN1Encodable aSN1Encodable = null;
        if (!this.signerInfs.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$1("this method can only be used with SignerInfoGenerator");
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        this.digests.clear();
        for (SignerInformation signerInformation : this._signers) {
            CMSUtils.addDigestAlgs(linkedHashSet, signerInformation, this.digestAlgIdFinder);
            aSN1EncodableVector.add(signerInformation.toASN1Structure());
        }
        ASN1ObjectIdentifier contentType = cMSTypedData.getContentType();
        if (cMSTypedData.getContent() != null) {
            ByteArrayOutputStream byteArrayOutputStream = z ? new ByteArrayOutputStream() : null;
            OutputStream safeOutputStream = CMSUtils.getSafeOutputStream(CMSUtils.attachSignersToOutputStream(this.signerGens, byteArrayOutputStream));
            try {
                cMSTypedData.write(safeOutputStream);
                safeOutputStream.close();
                if (z) {
                    aSN1Encodable = this.isDefiniteLength ? new DEROctetString(byteArrayOutputStream.toByteArray()) : new BEROctetString(byteArrayOutputStream.toByteArray());
                }
            } catch (IOException e) {
                throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("data processing exception: ")), e);
            }
        }
        for (SignerInfoGenerator signerInfoGenerator : this.signerGens) {
            SignerInfo generate = signerInfoGenerator.generate(contentType);
            linkedHashSet.add(generate.getDigestAlgorithm());
            aSN1EncodableVector.add(generate);
            byte[] calculatedDigest = signerInfoGenerator.getCalculatedDigest();
            if (calculatedDigest != null) {
                this.digests.put(generate.getDigestAlgorithm().getAlgorithm().getId(), calculatedDigest);
            }
        }
        return new CMSSignedData(cMSTypedData, new ContentInfo(CMSObjectIdentifiers.signedData, new SignedData(CMSUtils.convertToDlSet(linkedHashSet), new ContentInfo(contentType, aSN1Encodable), createSetFromList(this.certs, this.isDefiniteLength), createSetFromList(this.crls, this.isDefiniteLength), new DERSet(aSN1EncodableVector))));
    }

    public SignerInformationStore generateCounterSigners(SignerInformation signerInformation) {
        return generate(new CMSProcessableByteArray(null, signerInformation.getSignature()), false).getSignerInfos();
    }

    public void setDefiniteLengthEncoding(boolean z) {
        this.isDefiniteLength = z;
    }

    public CMSSignedDataGenerator(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        super(digestAlgorithmIdentifierFinder);
        this.signerInfs = new ArrayList();
        this.isDefiniteLength = false;
    }

    public CMSSignedData generate(CMSTypedData cMSTypedData) {
        return generate(cMSTypedData, false);
    }
}
