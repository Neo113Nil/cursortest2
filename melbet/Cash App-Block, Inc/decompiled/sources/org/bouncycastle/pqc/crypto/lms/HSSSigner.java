package org.bouncycastle.pqc.crypto.lms;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: classes10.dex */
public class HSSSigner implements MessageSigner {
    private HSSPrivateKeyParameters privKey;
    private HSSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return HSS.generateSignature(this.privKey, bArr).getEncoded();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to encode signature: ")));
            return null;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        if (z) {
            this.privKey = (HSSPrivateKeyParameters) cipherParameters;
        } else {
            this.pubKey = (HSSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            HSSPublicKeyParameters hSSPublicKeyParameters = this.pubKey;
            return HSS.verifySignature(hSSPublicKeyParameters, HSSSignature.getInstance(bArr2, hSSPublicKeyParameters.getL()), bArr);
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("unable to decode signature: ")));
            return false;
        }
    }
}
