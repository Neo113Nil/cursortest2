package org.bouncycastle.pqc.jcajce.provider.mceliece;

import c7.d;
import d7.f;
import d7.g;
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
import org.bouncycastle.crypto.digests.h;
import org.bouncycastle.crypto.e;

/* loaded from: classes5.dex */
public class b extends KeyFactorySpi implements x6.b {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";

    private static e getDigest(v6.a aVar) {
        return new h();
    }

    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            t6.b bVar = t6.b.getInstance(s.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!c7.e.mcEliece.equals((s) bVar.getPrivateKeyAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                c7.c cVar = c7.c.getInstance(bVar.parsePrivateKey());
                return new BCMcEliecePrivateKey(new f(cVar.getN(), cVar.getK(), cVar.getField(), cVar.getGoppaPoly(), cVar.getP1(), cVar.getP2(), cVar.getSInv()));
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
                if (!c7.e.mcEliece.equals((s) bVar.getAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                d dVar = d.getInstance(bVar.parsePublicKey());
                return new BCMcEliecePublicKey(new g(dVar.getN(), dVar.getT(), dVar.getG()));
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
        c7.c cVar = c7.c.getInstance(bVar.parsePrivateKey().toASN1Primitive());
        return new BCMcEliecePrivateKey(new f(cVar.getN(), cVar.getK(), cVar.getField(), cVar.getGoppaPoly(), cVar.getP1(), cVar.getP2(), cVar.getSInv()));
    }

    @Override // x6.b
    public PublicKey generatePublic(v6.b bVar) {
        d dVar = d.getInstance(bVar.parsePublicKey());
        return new BCMcEliecePublicKey(new g(dVar.getN(), dVar.getT(), dVar.getG()));
    }

    public KeySpec getKeySpec(Key key, Class cls) {
        if (key instanceof BCMcEliecePrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMcEliecePublicKey)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public Key translateKey(Key key) {
        if ((key instanceof BCMcEliecePrivateKey) || (key instanceof BCMcEliecePublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type.");
    }
}
