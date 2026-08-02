package org.bouncycastle.crypto.macs;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.SkeinParameters;

/* loaded from: classes9.dex */
public class SkeinMac implements Mac {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private SkeinEngine engine;

    public SkeinMac(SkeinMac skeinMac) {
        this.engine = new SkeinEngine(skeinMac.engine);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        return this.engine.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "Skein-MAC-" + (this.engine.getBlockSize() * 8) + "-" + (this.engine.getOutputSize() * 8);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.engine.getOutputSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        SkeinParameters build;
        if (cipherParameters instanceof SkeinParameters) {
            build = (SkeinParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m("Invalid parameter passed to Skein MAC init - ", cipherParameters));
                return;
            }
            build = new SkeinParameters.Builder().setKey(((KeyParameter) cipherParameters).getKey()).build();
        }
        if (build.getKey() != null) {
            this.engine.init(build);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Skein MAC requires a key parameter.");
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.engine.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        this.engine.update(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.engine.update(bArr, i, i2);
    }

    public SkeinMac(int i, int i2) {
        this.engine = new SkeinEngine(i, i2);
    }
}
