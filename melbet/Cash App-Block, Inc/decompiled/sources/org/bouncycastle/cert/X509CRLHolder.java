package org.bouncycastle.cert;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AltSignatureAlgorithm;
import org.bouncycastle.asn1.x509.AltSignatureValue;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Encodable;

/* loaded from: classes9.dex */
public class X509CRLHolder implements Encodable, Serializable {
    private static final long serialVersionUID = 20170722001L;
    private transient Extensions extensions;
    private transient boolean isIndirect;
    private transient GeneralNames issuerName;
    private transient CertificateList x509CRL;

    public X509CRLHolder(byte[] bArr) {
        this(parseStream(new ByteArrayInputStream(bArr)));
    }

    private void init(CertificateList certificateList) {
        this.x509CRL = certificateList;
        Extensions extensions = certificateList.getTBSCertList().getExtensions();
        this.extensions = extensions;
        this.isIndirect = isIndirectCRL(extensions);
        this.issuerName = new GeneralNames(new GeneralName(certificateList.getIssuer()));
    }

    private static boolean isIndirectCRL(Extensions extensions) {
        Extension extension;
        return (extensions == null || (extension = extensions.getExtension(Extension.issuingDistributionPoint)) == null || !IssuingDistributionPoint.getInstance(extension.getParsedValue()).isIndirectCRL()) ? false : true;
    }

    private static CertificateList parseStream(InputStream inputStream) {
        try {
            ASN1Primitive readObject = new ASN1InputStream(inputStream, true).readObject();
            if (readObject != null) {
                return CertificateList.getInstance(readObject);
            }
            throw new IOException("no content found");
        } catch (ClassCastException e) {
            f$$ExternalSyntheticLambda0.m$1("malformed data: ", (Object) e.getMessage(), (Throwable) e);
            return null;
        } catch (IllegalArgumentException e2) {
            throw new CertIOException(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("malformed data: ")), e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(CertificateList.getInstance(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CRLHolder) {
            return this.x509CRL.equals(((X509CRLHolder) obj).x509CRL);
        }
        return false;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.extensions);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.x509CRL.getEncoded();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return CertUtils.getExtensionOIDs(this.extensions);
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public X500Name getIssuer() {
        return X500Name.getInstance(this.x509CRL.getIssuer());
    }

    public Date getNextUpdate() {
        Time nextUpdate = this.x509CRL.getNextUpdate();
        if (nextUpdate != null) {
            return nextUpdate.getDate();
        }
        return null;
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public X509CRLEntryHolder getRevokedCertificate(BigInteger bigInteger) {
        Extension extension;
        GeneralNames generalNames = this.issuerName;
        Enumeration revokedCertificateEnumeration = this.x509CRL.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            TBSCertList.CRLEntry cRLEntry = (TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            boolean hasValue = cRLEntry.getUserCertificate().hasValue(bigInteger);
            boolean z = this.isIndirect;
            if (hasValue) {
                return new X509CRLEntryHolder(cRLEntry, z, generalNames);
            }
            if (z && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
                generalNames = GeneralNames.getInstance(extension.getParsedValue());
            }
        }
        return null;
    }

    public Collection getRevokedCertificates() {
        ArrayList arrayList = new ArrayList(this.x509CRL.getRevokedCertificates().length);
        GeneralNames generalNames = this.issuerName;
        Enumeration revokedCertificateEnumeration = this.x509CRL.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            X509CRLEntryHolder x509CRLEntryHolder = new X509CRLEntryHolder((TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement(), this.isIndirect, generalNames);
            arrayList.add(x509CRLEntryHolder);
            generalNames = x509CRLEntryHolder.getCertificateIssuer();
        }
        return arrayList;
    }

    public Date getThisUpdate() {
        return this.x509CRL.getThisUpdate().getDate();
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public int hashCode() {
        return this.x509CRL.hashCode();
    }

    public boolean isAlternativeSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        int i;
        TBSCertList tBSCertList = this.x509CRL.getTBSCertList();
        AltSignatureAlgorithm fromExtensions = AltSignatureAlgorithm.fromExtensions(tBSCertList.getExtensions());
        AltSignatureValue fromExtensions2 = AltSignatureValue.fromExtensions(tBSCertList.getExtensions());
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(AlgorithmIdentifier.getInstance(fromExtensions.toASN1Primitive()));
            OutputStream outputStream = contentVerifier.getOutputStream();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(tBSCertList.toASN1Primitive());
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
                aSN1EncodableVector.add(aSN1Sequence.getObjectAt(0));
                i = 2;
            } else {
                i = 1;
            }
            while (i != aSN1Sequence.size() - 1) {
                aSN1EncodableVector.add(aSN1Sequence.getObjectAt(i));
                i++;
            }
            aSN1EncodableVector.add(CertUtils.trimExtensions(0, tBSCertList.getExtensions()));
            new DERSequence(aSN1EncodableVector).encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(fromExtensions2.getSignature().getOctets());
        } catch (Exception e) {
            throw new CertException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to process signature: ")), e);
        }
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        TBSCertList tBSCertList = this.x509CRL.getTBSCertList();
        if (!CertUtils.isAlgIdEqual(tBSCertList.getSignature(), this.x509CRL.getSignatureAlgorithm())) {
            throw new CertException("signature invalid - algorithm identifier mismatch");
        }
        try {
            ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertList.getSignature());
            OutputStream outputStream = contentVerifier.getOutputStream();
            tBSCertList.encodeTo(outputStream, ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(this.x509CRL.getSignature().getOctets());
        } catch (Exception e) {
            throw new CertException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to process signature: ")), e);
        }
    }

    public CertificateList toASN1Structure() {
        return this.x509CRL;
    }

    public X509CRLHolder(CertificateList certificateList) {
        init(certificateList);
    }

    public X509CRLHolder(InputStream inputStream) {
        this(parseStream(inputStream));
    }
}
