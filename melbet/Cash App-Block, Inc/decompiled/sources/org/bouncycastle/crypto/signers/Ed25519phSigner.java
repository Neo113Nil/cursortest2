package org.bouncycastle.crypto.signers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class Ed25519phSigner implements Signer {
    private final byte[] context;
    private boolean forSigning;
    private final Digest prehash = Ed25519.createPrehash();
    private Ed25519PrivateKeyParameters privateKey;
    private Ed25519PublicKeyParameters publicKey;

    public Ed25519phSigner(byte[] bArr) {
        if (bArr != null) {
            this.context = Arrays.clone(bArr);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("'context' cannot be null");
            throw null;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        String str;
        if (!this.forSigning || this.privateKey == null) {
            str = "Ed25519phSigner not initialised for signature generation.";
        } else {
            byte[] bArr = new byte[64];
            if (64 == this.prehash.doFinal(bArr, 0)) {
                byte[] bArr2 = new byte[64];
                this.privateKey.sign(2, this.context, bArr, 0, 64, bArr2, 0);
                return bArr2;
            }
            str = "Prehash digest failed";
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        Ed25519PublicKeyParameters ed25519PublicKeyParameters = null;
        if (z) {
            this.privateKey = (Ed25519PrivateKeyParameters) cipherParameters;
        } else {
            this.privateKey = null;
            ed25519PublicKeyParameters = (Ed25519PublicKeyParameters) cipherParameters;
        }
        this.publicKey = ed25519PublicKeyParameters;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(EdDSAParameterSpec.Ed25519, 128, cipherParameters, z));
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.prehash.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.prehash.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        String str;
        if (this.forSigning || this.publicKey == null) {
            str = "Ed25519phSigner not initialised for verification";
        } else {
            int length = bArr.length;
            Digest digest = this.prehash;
            if (64 != length) {
                digest.reset();
                return false;
            }
            byte[] bArr2 = new byte[64];
            if (64 == digest.doFinal(bArr2, 0)) {
                return this.publicKey.verify(2, this.context, bArr2, 0, 64, bArr, 0);
            }
            str = "Prehash digest failed";
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return false;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.prehash.update(bArr, i, i2);
    }
}
