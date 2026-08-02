package org.bouncycastle.cms.jcajce;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSORIforKEMOtherInfo;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.JceGenericKey;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
class JceCMSKEMKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private JcaJceExtHelper helper;
    private final int kekLength;
    private PrivateKey privateKey;
    private final AlgorithmIdentifier symWrapAlgorithm;

    public JceCMSKEMKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(PrivateKeyInfo.getInstance(privateKey.getEncoded()).getPrivateKeyAlgorithm());
        this.helper = new DefaultJcaJceExtHelper();
        this.extraMappings = new HashMap();
        KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(algorithmIdentifier.getParameters());
        this.privateKey = privateKey;
        this.symWrapAlgorithm = algorithmIdentifier;
        this.kekLength = CMSUtils.getKekSize(kEMRecipientInfo.getWrap().getAlgorithm());
    }

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public GenericKey generateUnwrappedKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        KEMRecipientInfo kEMRecipientInfo = KEMRecipientInfo.getInstance(this.symWrapAlgorithm.getParameters());
        AlgorithmIdentifier wrap = kEMRecipientInfo.getWrap();
        try {
            byte[] encoded = new CMSORIforKEMOtherInfo(wrap, this.kekLength, kEMRecipientInfo.getUkm()).getEncoded();
            boolean z = this.privateKey instanceof RSAPrivateKey;
            JcaJceExtHelper jcaJceExtHelper = this.helper;
            if (!z) {
                Cipher createAsymmetricWrapper = CMSUtils.createAsymmetricWrapper(jcaJceExtHelper, kEMRecipientInfo.getKem().getAlgorithm(), new HashMap());
                String wrapAlgorithmName = CMSUtils.getWrapAlgorithmName(wrap.getAlgorithm());
                createAsymmetricWrapper.init(4, this.privateKey, new KTSParameterSpec.Builder(wrapAlgorithmName, this.kekLength * 8, encoded).withKdfAlgorithm(kEMRecipientInfo.getKdf()).build());
                return new JceGenericKey(algorithmIdentifier, createAsymmetricWrapper.unwrap(Arrays.concatenate(kEMRecipientInfo.getKemct().getOctets(), kEMRecipientInfo.getEncryptedKey().getOctets()), wrapAlgorithmName, 3));
            }
            Cipher createAsymmetricWrapper2 = CMSUtils.createAsymmetricWrapper(jcaJceExtHelper, kEMRecipientInfo.getKem().getAlgorithm(), new HashMap());
            try {
                String wrapAlgorithmName2 = CMSUtils.getWrapAlgorithmName(wrap.getAlgorithm());
                createAsymmetricWrapper2.init(4, this.privateKey, new KTSParameterSpec.Builder(wrapAlgorithmName2, this.kekLength * 8, encoded).withKdfAlgorithm(kEMRecipientInfo.getKdf()).build());
                return new JceGenericKey(algorithmIdentifier, createAsymmetricWrapper2.unwrap(Arrays.concatenate(kEMRecipientInfo.getKemct().getOctets(), kEMRecipientInfo.getEncryptedKey().getOctets()), wrapAlgorithmName2, 3));
            } catch (Exception e) {
                throw new OperatorException("Unable to wrap contents key: " + e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new OperatorException(Fragment$5$$ExternalSyntheticOutline0.m(e2, new StringBuilder("exception encrypting key: ")), e2);
        }
    }

    public int getKekLength() {
        return this.kekLength;
    }

    public JceCMSKEMKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceCMSKEMKeyUnwrapper setProvider(String str) {
        this.helper = new NamedJcaJceExtHelper(str);
        return this;
    }

    public JceCMSKEMKeyUnwrapper setProvider(Provider provider) {
        this.helper = new ProviderJcaJceExtHelper(provider);
        return this;
    }
}
