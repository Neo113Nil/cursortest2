package org.bouncycastle.pqc.jcajce.provider.mceliece;

import c7.e;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.s;

/* loaded from: classes5.dex */
public class a extends KeyFactorySpi implements x6.b {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";

    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            t6.b bVar = t6.b.getInstance(s.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!e.mcElieceCca2.equals((s) bVar.getPrivateKeyAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                c7.a aVar = c7.a.getInstance(bVar.parsePrivateKey());
                return new BCMcElieceCCA2PrivateKey(new d7.b(aVar.getN(), aVar.getK(), aVar.getField(), aVar.getGoppaPoly(), aVar.getP(), c.getDigest(aVar.getDigest()).getAlgorithmName()));
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e8) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e8);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            v6.b bVar = v6.b.getInstance(s.fromByteArray(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!e.mcElieceCca2.equals((s) bVar.getAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                c7.b bVar2 = c7.b.getInstance(bVar.parsePublicKey());
                return new BCMcElieceCCA2PublicKey(new d7.c(bVar2.getN(), bVar2.getT(), bVar2.getG(), c.getDigest(bVar2.getDigest()).getAlgorithmName()));
            } catch (IOException e8) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e8.getMessage());
            }
        } catch (IOException e9) {
            throw new InvalidKeySpecException(e9.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        return null;
    }

    @Override // x6.b
    public PrivateKey generatePrivate(t6.b bVar) {
        c7.a aVar = c7.a.getInstance(bVar.parsePrivateKey().toASN1Primitive());
        return new BCMcElieceCCA2PrivateKey(new d7.b(aVar.getN(), aVar.getK(), aVar.getField(), aVar.getGoppaPoly(), aVar.getP(), null));
    }

    @Override // x6.b
    public PublicKey generatePublic(v6.b bVar) {
        c7.b bVar2 = c7.b.getInstance(bVar.parsePublicKey());
        return new BCMcElieceCCA2PublicKey(new d7.c(bVar2.getN(), bVar2.getT(), bVar2.getG(), c.getDigest(bVar2.getDigest()).getAlgorithmName()));
    }

    public KeySpec getKeySpec(Key key, Class cls) {
        if (key instanceof BCMcElieceCCA2PrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMcElieceCCA2PublicKey)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public Key translateKey(Key key) {
        if ((key instanceof BCMcElieceCCA2PrivateKey) || (key instanceof BCMcElieceCCA2PublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type.");
    }
}
