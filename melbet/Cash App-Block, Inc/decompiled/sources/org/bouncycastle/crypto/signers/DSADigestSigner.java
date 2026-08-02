package org.bouncycastle.crypto.signers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.DSAExt;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes9.dex */
public class DSADigestSigner implements Signer {
    private final Digest digest;
    private final DSA dsa;

    /* renamed from: encoding, reason: collision with root package name */
    private final DSAEncoding f1584encoding;
    private boolean forSigning;

    public DSADigestSigner(DSA dsa, Digest digest) {
        this.dsa = dsa;
        this.digest = digest;
        this.f1584encoding = StandardDSAEncoding.INSTANCE;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        String str;
        if (this.forSigning) {
            byte[] bArr = new byte[this.digest.getDigestSize()];
            this.digest.doFinal(bArr, 0);
            BigInteger[] generateSignature = this.dsa.generateSignature(bArr);
            try {
                return this.f1584encoding.encode(getOrder(), generateSignature[0], generateSignature[1]);
            } catch (Exception unused) {
                str = "unable to encode signature";
            }
        } else {
            str = "DSADigestSigner not initialised for signature generation.";
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    public BigInteger getOrder() {
        DSA dsa = this.dsa;
        if (dsa instanceof DSAExt) {
            return ((DSAExt) dsa).getOrder();
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forSigning = z;
        AsymmetricKeyParameter asymmetricKeyParameter = cipherParameters instanceof ParametersWithRandom ? (AsymmetricKeyParameter) ((ParametersWithRandom) cipherParameters).getParameters() : (AsymmetricKeyParameter) cipherParameters;
        if (z && !asymmetricKeyParameter.isPrivate()) {
            a$$ExternalSyntheticBUOutline0.m$3("Signing Requires Private Key.");
        } else if (!z && asymmetricKeyParameter.isPrivate()) {
            a$$ExternalSyntheticBUOutline0.m$3("Verification Requires Public Key.");
        } else {
            reset();
            this.dsa.init(z, cipherParameters);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        if (this.forSigning) {
            a$$ExternalSyntheticBUOutline0.m$1("DSADigestSigner not initialised for verification");
            return false;
        }
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] decode = this.f1584encoding.decode(getOrder(), bArr);
            return this.dsa.verifySignature(bArr2, decode[0], decode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    public DSADigestSigner(DSAExt dSAExt, Digest digest, DSAEncoding dSAEncoding) {
        this.dsa = dSAExt;
        this.digest = digest;
        this.f1584encoding = dSAEncoding;
    }
}
