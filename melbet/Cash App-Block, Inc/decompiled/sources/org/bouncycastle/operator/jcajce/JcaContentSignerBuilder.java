package org.bouncycastle.operator.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.TeeOutputStream;

/* loaded from: classes9.dex */
public class JcaContentSignerBuilder {
    private static final DefaultSignatureAlgorithmIdentifierFinder SIGNATURE_ALGORITHM_IDENTIFIER_FINDER;
    private static final Set isAlgIdFromPrivate;
    private OperatorHelper helper = new OperatorHelper(new DefaultJcaJceHelper());
    private SecureRandom random;
    private AlgorithmIdentifier sigAlgId;
    private AlgorithmParameterSpec sigAlgSpec;
    private final String signatureAlgorithm;

    static {
        HashSet hashSet = new HashSet();
        isAlgIdFromPrivate = hashSet;
        SIGNATURE_ALGORITHM_IDENTIFIER_FINDER = new DefaultSignatureAlgorithmIdentifierFinder();
        hashSet.add("DILITHIUM");
        hashSet.add("SPHINCS+");
        hashSet.add("SPHINCSPlus");
        hashSet.add("ML-DSA");
        hashSet.add("SLH-DSA");
        hashSet.add("HASH-ML-DSA");
        hashSet.add("HASH-SLH-DSA");
    }

    public JcaContentSignerBuilder(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        AlgorithmIdentifier algorithmIdentifier;
        this.signatureAlgorithm = str;
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
            this.sigAlgSpec = pSSParameterSpec;
            algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams(pSSParameterSpec));
        } else {
            if (!(algorithmParameterSpec instanceof CompositeAlgorithmSpec)) {
                throw new IllegalArgumentException("unknown sigParamSpec: ".concat(algorithmParameterSpec == null ? "null" : algorithmParameterSpec.getClass().getName()));
            }
            CompositeAlgorithmSpec compositeAlgorithmSpec = (CompositeAlgorithmSpec) algorithmParameterSpec;
            this.sigAlgSpec = compositeAlgorithmSpec;
            algorithmIdentifier = new AlgorithmIdentifier(MiscObjectIdentifiers.id_alg_composite, createCompParams(compositeAlgorithmSpec));
        }
        this.sigAlgId = algorithmIdentifier;
    }

    private ContentSigner buildComposite(CompositePrivateKey compositePrivateKey) {
        try {
            List<PrivateKey> privateKeys = compositePrivateKey.getPrivateKeys();
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.sigAlgId.getParameters());
            int size = aSN1Sequence.size();
            Signature[] signatureArr = new Signature[size];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                Signature createSignature = this.helper.createSignature(AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i)));
                signatureArr[i] = createSignature;
                if (this.random != null) {
                    createSignature.initSign(privateKeys.get(i), this.random);
                } else {
                    createSignature.initSign(privateKeys.get(i));
                }
            }
            OutputStream createStream = OutputStreamFactory.createStream(signatureArr[0]);
            int i2 = 1;
            while (i2 != size) {
                TeeOutputStream teeOutputStream = new TeeOutputStream(createStream, OutputStreamFactory.createStream(signatureArr[i2]));
                i2++;
                createStream = teeOutputStream;
            }
            return new ContentSigner(createStream, signatureArr) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.2
                OutputStream stream;
                final /* synthetic */ OutputStream val$sigStream;
                final /* synthetic */ Signature[] val$sigs;

                {
                    this.val$sigStream = createStream;
                    this.val$sigs = signatureArr;
                    this.stream = createStream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return JcaContentSignerBuilder.this.sigAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        for (int i3 = 0; i3 != this.val$sigs.length; i3++) {
                            aSN1EncodableVector.add(new DERBitString(this.val$sigs[i3].sign()));
                        }
                        return new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                    } catch (IOException e) {
                        throw new RuntimeOperatorException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("exception encoding signature: ")), e);
                    } catch (SignatureException e2) {
                        f$$ExternalSyntheticLambda0.m("exception obtaining signature: ", (Object) e2.getMessage(), (Throwable) e2);
                        return null;
                    }
                }
            };
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("cannot create signer: ")), e);
        }
    }

    private static ASN1Sequence createCompParams(CompositeAlgorithmSpec compositeAlgorithmSpec) {
        DefaultSignatureAlgorithmIdentifierFinder defaultSignatureAlgorithmIdentifierFinder = new DefaultSignatureAlgorithmIdentifierFinder();
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        List<String> algorithmNames = compositeAlgorithmSpec.getAlgorithmNames();
        List<AlgorithmParameterSpec> parameterSpecs = compositeAlgorithmSpec.getParameterSpecs();
        for (int i = 0; i != algorithmNames.size(); i++) {
            AlgorithmParameterSpec algorithmParameterSpec = parameterSpecs.get(i);
            if (algorithmParameterSpec == null) {
                aSN1EncodableVector.add(defaultSignatureAlgorithmIdentifierFinder.find(algorithmNames.get(i)));
            } else {
                if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                    a$$ExternalSyntheticBUOutline0.m$3("unrecognized parameterSpec");
                    return null;
                }
                aSN1EncodableVector.add(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSASSA_PSS, createPSSParams((PSSParameterSpec) algorithmParameterSpec)));
            }
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private static RSASSAPSSparams createPSSParams(PSSParameterSpec pSSParameterSpec) {
        DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        AlgorithmIdentifier find = defaultDigestAlgorithmIdentifierFinder.find(pSSParameterSpec.getDigestAlgorithm());
        if (find.getParameters() == null) {
            find = new AlgorithmIdentifier(find.getAlgorithm(), DERNull.INSTANCE);
        }
        AlgorithmIdentifier find2 = defaultDigestAlgorithmIdentifierFinder.find(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm());
        if (find2.getParameters() == null) {
            find2 = new AlgorithmIdentifier(find2.getAlgorithm(), DERNull.INSTANCE);
        }
        return new RSASSAPSSparams(find, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, find2), new ASN1Integer(pSSParameterSpec.getSaltLength()), new ASN1Integer(pSSParameterSpec.getTrailerField()));
    }

    public ContentSigner build(PrivateKey privateKey) {
        AlgorithmIdentifier find;
        if (privateKey instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) privateKey;
            if (compositePrivateKey.getAlgorithmIdentifier().equals((ASN1Primitive) MiscObjectIdentifiers.id_composite_key)) {
                return buildComposite(compositePrivateKey);
            }
        }
        try {
            if (this.sigAlgSpec == null) {
                if (isAlgIdFromPrivate.contains(Strings.toUpperCase(this.signatureAlgorithm))) {
                    AlgorithmIdentifier find2 = SIGNATURE_ALGORITHM_IDENTIFIER_FINDER.find(privateKey.getAlgorithm());
                    this.sigAlgId = find2;
                    if (find2 == null) {
                        find = PrivateKeyInfo.getInstance(privateKey.getEncoded()).getPrivateKeyAlgorithm();
                    }
                    this.sigAlgSpec = null;
                } else {
                    find = SIGNATURE_ALGORITHM_IDENTIFIER_FINDER.find(this.signatureAlgorithm);
                }
                this.sigAlgId = find;
                this.sigAlgSpec = null;
            }
            AlgorithmIdentifier algorithmIdentifier = this.sigAlgId;
            Signature createSignature = this.helper.createSignature(algorithmIdentifier);
            SecureRandom secureRandom = this.random;
            if (secureRandom != null) {
                createSignature.initSign(privateKey, secureRandom);
            } else {
                createSignature.initSign(privateKey);
            }
            return new ContentSigner(createSignature, algorithmIdentifier) { // from class: org.bouncycastle.operator.jcajce.JcaContentSignerBuilder.1
                private OutputStream stream;
                final /* synthetic */ Signature val$sig;
                final /* synthetic */ AlgorithmIdentifier val$signatureAlgId;

                {
                    this.val$sig = createSignature;
                    this.val$signatureAlgId = algorithmIdentifier;
                    this.stream = OutputStreamFactory.createStream(createSignature);
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return this.val$signatureAlgId;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public OutputStream getOutputStream() {
                    return this.stream;
                }

                @Override // org.bouncycastle.operator.ContentSigner
                public byte[] getSignature() {
                    try {
                        return this.val$sig.sign();
                    } catch (SignatureException e) {
                        f$$ExternalSyntheticLambda0.m("exception obtaining signature: ", (Object) e.getMessage(), (Throwable) e);
                        return null;
                    }
                }
            };
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("cannot create signer: ")), e);
        }
    }

    public JcaContentSignerBuilder setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JcaContentSignerBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JcaContentSignerBuilder setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JcaContentSignerBuilder(String str) {
        this.signatureAlgorithm = str;
    }
}
