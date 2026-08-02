package org.bouncycastle.its.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class JcaITSContentSigner implements ITSContentSigner {
    private final ASN1ObjectIdentifier curveID;
    private final DigestCalculator digest;
    private final AlgorithmIdentifier digestAlgo;
    private final JcaJceHelper helper;
    private final byte[] parentData;
    private final byte[] parentDigest;
    private final ECPrivateKey privateKey;
    private final String signer;
    private final ITSCertificate signerCert;

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JcaITSContentSigner(ECPrivateKey eCPrivateKey, ITSCertificate iTSCertificate, JcaJceHelper jcaJceHelper) {
        AlgorithmIdentifier algorithmIdentifier;
        this.privateKey = eCPrivateKey;
        this.signerCert = iTSCertificate;
        this.helper = jcaJceHelper;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(PrivateKeyInfo.getInstance(eCPrivateKey.getEncoded()).getPrivateKeyAlgorithm().getParameters());
        this.curveID = aSN1ObjectIdentifier;
        try {
            try {
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) SECObjectIdentifiers.secp256r1)) {
                    algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
                } else {
                    if (!aSN1ObjectIdentifier.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
                        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
                            a$$ExternalSyntheticBUOutline0.m$3("unknown key type");
                            throw null;
                        }
                        this.digestAlgo = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
                        this.signer = "SHA384withECDSA";
                        DigestCalculator digestCalculator = new JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.digestAlgo);
                        this.digest = digestCalculator;
                        if (iTSCertificate != null) {
                            this.parentData = null;
                            this.parentDigest = digestCalculator.getDigest();
                            return;
                        }
                        try {
                            byte[] encoded = iTSCertificate.getEncoded();
                            this.parentData = encoded;
                            OutputStream outputStream = digestCalculator.getOutputStream();
                            outputStream.write(encoded, 0, encoded.length);
                            outputStream.close();
                            this.parentDigest = digestCalculator.getDigest();
                            return;
                        } catch (IOException e) {
                            a$$ExternalSyntheticBUOutline0.m$1(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("signer certificate encoding failed: ")));
                            throw null;
                        }
                    }
                    algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
                }
                DigestCalculator digestCalculator2 = new JcaDigestCalculatorProviderBuilder().setHelper(jcaJceHelper).build().get(this.digestAlgo);
                this.digest = digestCalculator2;
                if (iTSCertificate != null) {
                }
            } catch (OperatorCreationException e2) {
                throw new IllegalStateException("cannot recognise digest type: " + this.digestAlgo.getAlgorithm(), e2);
            }
        } catch (Exception e3) {
            a$$ExternalSyntheticBUOutline0.m(e3.getMessage(), e3);
            throw null;
        }
        this.digestAlgo = algorithmIdentifier;
        this.signer = "SHA256withECDSA";
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public ITSCertificate getAssociatedCertificate() {
        return this.signerCert;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getAssociatedCertificateDigest() {
        return Arrays.clone(this.parentDigest);
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public ASN1ObjectIdentifier getCurveID() {
        return this.curveID;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public AlgorithmIdentifier getDigestAlgorithm() {
        return this.digestAlgo;
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public OutputStream getOutputStream() {
        return this.digest.getOutputStream();
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public byte[] getSignature() {
        byte[] digest = this.digest.getDigest();
        try {
            Signature createSignature = this.helper.createSignature(this.signer);
            createSignature.initSign(this.privateKey);
            createSignature.update(digest, 0, digest.length);
            byte[] bArr = this.parentDigest;
            createSignature.update(bArr, 0, bArr.length);
            return createSignature.sign();
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e.getMessage(), (Throwable) e);
            return null;
        }
    }

    @Override // org.bouncycastle.its.operator.ITSContentSigner
    public boolean isForSelfSigning() {
        return this.parentData == null;
    }

    public static class Builder {
        private JcaJceHelper helper = new DefaultJcaJceHelper();

        /* JADX WARN: Multi-variable type inference failed */
        public JcaITSContentSigner build(PrivateKey privateKey) {
            return new JcaITSContentSigner((ECPrivateKey) privateKey, null, this.helper);
        }

        public Builder setProvider(String str) {
            this.helper = new NamedJcaJceHelper(str);
            return this;
        }

        public Builder setProvider(Provider provider) {
            this.helper = new ProviderJcaJceHelper(provider);
            return this;
        }

        public JcaITSContentSigner build(PrivateKey privateKey, ITSCertificate iTSCertificate) {
            return new JcaITSContentSigner((ECPrivateKey) privateKey, iTSCertificate, this.helper);
        }
    }
}
