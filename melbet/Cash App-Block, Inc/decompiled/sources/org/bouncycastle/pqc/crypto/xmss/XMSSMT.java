package org.bouncycastle.pqc.crypto.xmss;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public final class XMSSMT {
    private XMSSMTParameters params;
    private XMSSMTPrivateKeyParameters privateKey;
    private SecureRandom prng;
    private XMSSMTPublicKeyParameters publicKey;
    private XMSSParameters xmssParams;

    public XMSSMT(XMSSMTParameters xMSSMTParameters, SecureRandom secureRandom) {
        if (xMSSMTParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("params == null");
            throw null;
        }
        this.params = xMSSMTParameters;
        this.xmssParams = xMSSMTParameters.getXMSSParameters();
        this.prng = secureRandom;
        this.privateKey = new XMSSMTPrivateKeyParameters.Builder(xMSSMTParameters).build();
        this.publicKey = new XMSSMTPublicKeyParameters.Builder(xMSSMTParameters).build();
    }

    public byte[] exportPrivateKey() {
        return this.privateKey.toByteArray();
    }

    public byte[] exportPublicKey() {
        return this.publicKey.toByteArray();
    }

    public void generateKeys() {
        XMSSMTKeyPairGenerator xMSSMTKeyPairGenerator = new XMSSMTKeyPairGenerator();
        xMSSMTKeyPairGenerator.init(new XMSSMTKeyGenerationParameters(getParams(), this.prng));
        AsymmetricCipherKeyPair generateKeyPair = xMSSMTKeyPairGenerator.generateKeyPair();
        this.privateKey = (XMSSMTPrivateKeyParameters) generateKeyPair.getPrivate();
        XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) generateKeyPair.getPublic();
        this.publicKey = xMSSMTPublicKeyParameters;
        importState(this.privateKey, xMSSMTPublicKeyParameters);
    }

    public XMSSMTParameters getParams() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return this.privateKey.getPublicSeed();
    }

    public XMSSParameters getXMSS() {
        return this.xmssParams;
    }

    public void importState(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("privateKey == null");
            return;
        }
        if (bArr2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("publicKey == null");
            return;
        }
        XMSSMTPrivateKeyParameters build = new XMSSMTPrivateKeyParameters.Builder(this.params).withPrivateKey(bArr).build();
        XMSSMTPublicKeyParameters build2 = new XMSSMTPublicKeyParameters.Builder(this.params).withPublicKey(bArr2).build();
        if (!Arrays.areEqual(build.getRoot(), build2.getRoot())) {
            a$$ExternalSyntheticBUOutline0.m$1("root of private key and public key do not match");
        } else {
            if (!Arrays.areEqual(build.getPublicSeed(), build2.getPublicSeed())) {
                a$$ExternalSyntheticBUOutline0.m$1("public seed of private key and public key do not match");
                return;
            }
            this.xmssParams.getWOTSPlus().importKeys(new byte[this.params.getTreeDigestSize()], build.getPublicSeed());
            this.privateKey = build;
            this.publicKey = build2;
        }
    }

    public byte[] sign(byte[] bArr) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("message == null");
            return null;
        }
        XMSSMTSigner xMSSMTSigner = new XMSSMTSigner();
        xMSSMTSigner.init(true, this.privateKey);
        byte[] generateSignature = xMSSMTSigner.generateSignature(bArr);
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) xMSSMTSigner.getUpdatedPrivateKey();
        this.privateKey = xMSSMTPrivateKeyParameters;
        importState(xMSSMTPrivateKeyParameters, this.publicKey);
        return generateSignature;
    }

    public boolean verifySignature(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        if (bArr == null) {
            str = "message == null";
        } else if (bArr2 == null) {
            str = "signature == null";
        } else {
            if (bArr3 != null) {
                XMSSMTSigner xMSSMTSigner = new XMSSMTSigner();
                xMSSMTSigner.init(false, new XMSSMTPublicKeyParameters.Builder(getParams()).withPublicKey(bArr3).build());
                return xMSSMTSigner.verifySignature(bArr, bArr2);
            }
            str = "publicKey == null";
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
        return false;
    }

    private void importState(XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters, XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters) {
        this.xmssParams.getWOTSPlus().importKeys(new byte[this.params.getTreeDigestSize()], this.privateKey.getPublicSeed());
        this.privateKey = xMSSMTPrivateKeyParameters;
        this.publicKey = xMSSMTPublicKeyParameters;
    }
}
