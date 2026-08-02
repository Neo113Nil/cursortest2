package org.bouncycastle.pqc.jcajce.provider.util;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public abstract class BaseKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    private final ASN1ObjectIdentifier keyOid;
    private final Set<ASN1ObjectIdentifier> keyOids;

    public BaseKeyFactorySpi(Set<ASN1ObjectIdentifier> set) {
        this.keyOid = null;
        this.keyOids = set;
    }

    private void checkAlgorithm(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.keyOid;
        if (aSN1ObjectIdentifier2 != null) {
            if (!aSN1ObjectIdentifier2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                throw new InvalidKeySpecException(GetCert$$ExternalSyntheticOutline0.m("incorrect algorithm OID for key: ", aSN1ObjectIdentifier));
            }
        } else if (!this.keyOids.contains(aSN1ObjectIdentifier)) {
            throw new InvalidKeySpecException(GetCert$$ExternalSyntheticOutline0.m("incorrect algorithm OID for key: ", aSN1ObjectIdentifier));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(GMSSPrivateKey$$ExternalSyntheticOutline0.m(keySpec, new StringBuilder("Unsupported key specification: "), "."));
        }
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            checkAlgorithm(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            return generatePrivate(privateKeyInfo);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (Exception e2) {
            Mod$$ExternalSyntheticBUOutline0.m$2(e2);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            Mod$$ExternalSyntheticBUOutline0.m(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded());
            checkAlgorithm(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            return generatePublic(subjectPublicKeyInfo);
        } catch (InvalidKeySpecException e) {
            throw e;
        } catch (Exception e2) {
            Mod$$ExternalSyntheticBUOutline0.m$2(e2);
            return null;
        }
    }

    public BaseKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.keyOid = aSN1ObjectIdentifier;
        this.keyOids = null;
    }
}
