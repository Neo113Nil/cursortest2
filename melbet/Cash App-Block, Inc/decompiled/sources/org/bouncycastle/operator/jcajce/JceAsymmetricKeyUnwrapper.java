package org.bouncycastle.operator.jcajce;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;

/* loaded from: classes9.dex */
public class JceAsymmetricKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private OperatorHelper helper;
    private PrivateKey privKey;
    private boolean unwrappedKeyMustBeEncodable;

    public JceAsymmetricKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.privKey = privateKey;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|2|3|(3:29|30|(9:32|6|7|8|(5:10|(1:12)|(3:15|(1:17)(1:19)|18)|20|21)|24|(0)|20|21))|5|6|7|8|(0)|24|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r4.length == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    @Override // org.bouncycastle.operator.KeyUnwrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenericKey generateUnwrappedKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        try {
            Cipher createAsymmetricWrapper = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(getAlgorithmIdentifier());
            Key key = null;
            if (createAlgorithmParameters != null) {
                if (!getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
                    createAsymmetricWrapper.init(4, this.privKey, createAlgorithmParameters);
                    Key unwrap2 = createAsymmetricWrapper.unwrap(bArr, this.helper.getKeyAlgorithmName(algorithmIdentifier.getAlgorithm()), 3);
                    if (this.unwrappedKeyMustBeEncodable) {
                        byte[] encoded = unwrap2.getEncoded();
                        if (encoded == null) {
                        }
                        if (key == null) {
                            PrivateKey privateKey = this.privKey;
                            if (createAlgorithmParameters != null) {
                                createAsymmetricWrapper.init(2, privateKey, createAlgorithmParameters);
                            } else {
                                createAsymmetricWrapper.init(2, privateKey);
                            }
                            key = new SecretKeySpec(createAsymmetricWrapper.doFinal(bArr), algorithmIdentifier.getAlgorithm().getId());
                        }
                        return new JceGenericKey(algorithmIdentifier, key);
                    }
                    key = unwrap2;
                    if (key == null) {
                    }
                    return new JceGenericKey(algorithmIdentifier, key);
                }
            }
            createAsymmetricWrapper.init(4, this.privKey);
            Key unwrap22 = createAsymmetricWrapper.unwrap(bArr, this.helper.getKeyAlgorithmName(algorithmIdentifier.getAlgorithm()), 3);
            if (this.unwrappedKeyMustBeEncodable) {
            }
            key = unwrap22;
            if (key == null) {
            }
            return new JceGenericKey(algorithmIdentifier, key);
        } catch (InvalidAlgorithmParameterException e) {
            throw new OperatorException("invalid algorithm parameters: " + e.getMessage(), e);
        } catch (InvalidKeyException e2) {
            throw new OperatorException("key invalid: " + e2.getMessage(), e2);
        } catch (BadPaddingException e3) {
            throw new OperatorException("bad padding: " + e3.getMessage(), e3);
        } catch (IllegalBlockSizeException e4) {
            throw new OperatorException("illegal blocksize: " + e4.getMessage(), e4);
        }
    }

    public JceAsymmetricKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceAsymmetricKeyUnwrapper setMustProduceEncodableUnwrappedKey(boolean z) {
        this.unwrappedKeyMustBeEncodable = z;
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
