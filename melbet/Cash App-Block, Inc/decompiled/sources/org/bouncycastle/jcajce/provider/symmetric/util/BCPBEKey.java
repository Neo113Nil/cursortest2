package org.bouncycastle.jcajce.provider.symmetric.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class BCPBEKey implements PBEKey, Destroyable {
    String algorithm;
    int digest;
    private final AtomicBoolean hasBeenDestroyed;
    private final int iterationCount;
    int ivSize;
    int keySize;
    ASN1ObjectIdentifier oid;
    private final CipherParameters param;
    private final char[] password;
    private final byte[] salt;
    boolean tryWrong;

    /* renamed from: type, reason: collision with root package name */
    int f1596type;

    public BCPBEKey(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.oid = aSN1ObjectIdentifier;
        this.f1596type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = cipherParameters;
    }

    public static void checkDestroyed(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            a$$ExternalSyntheticBUOutline0.m$1("key has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        char[] cArr = this.password;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        String str = this.algorithm;
        checkDestroyed(this);
        return str;
    }

    public int getDigest() {
        int i = this.digest;
        checkDestroyed(this);
        return i;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] PKCS5PasswordToUTF8Bytes;
        CipherParameters cipherParameters = this.param;
        if (cipherParameters != null) {
            if (cipherParameters instanceof ParametersWithIV) {
                cipherParameters = ((ParametersWithIV) cipherParameters).getParameters();
            }
            PKCS5PasswordToUTF8Bytes = ((KeyParameter) cipherParameters).getKey();
        } else {
            int i = this.f1596type;
            if (i == 2) {
                PKCS5PasswordToUTF8Bytes = PBEParametersGenerator.PKCS12PasswordToBytes(this.password);
            } else {
                char[] cArr = this.password;
                PKCS5PasswordToUTF8Bytes = i == 5 ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(cArr) : PBEParametersGenerator.PKCS5PasswordToBytes(cArr);
            }
        }
        checkDestroyed(this);
        return PKCS5PasswordToUTF8Bytes;
    }

    @Override // java.security.Key
    public String getFormat() {
        checkDestroyed(this);
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        int i = this.iterationCount;
        checkDestroyed(this);
        return i;
    }

    public int getIvSize() {
        int i = this.ivSize;
        checkDestroyed(this);
        return i;
    }

    public int getKeySize() {
        int i = this.keySize;
        checkDestroyed(this);
        return i;
    }

    public ASN1ObjectIdentifier getOID() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.oid;
        checkDestroyed(this);
        return aSN1ObjectIdentifier;
    }

    public CipherParameters getParam() {
        CipherParameters cipherParameters = this.param;
        checkDestroyed(this);
        return cipherParameters;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        char[] clone = Arrays.clone(this.password);
        checkDestroyed(this);
        if (clone != null) {
            return clone;
        }
        a$$ExternalSyntheticBUOutline0.m$1("no password available");
        return null;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        byte[] clone = Arrays.clone(this.salt);
        checkDestroyed(this);
        return clone;
    }

    public int getType() {
        int i = this.f1596type;
        checkDestroyed(this);
        return i;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }

    public BCPBEKey(String str, CipherParameters cipherParameters) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.param = cipherParameters;
        this.password = null;
        this.iterationCount = -1;
        this.salt = null;
    }
}
