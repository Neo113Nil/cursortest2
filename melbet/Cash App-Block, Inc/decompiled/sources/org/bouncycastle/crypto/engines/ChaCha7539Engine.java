package org.bouncycastle.crypto.engines;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class ChaCha7539Engine extends Salsa20Engine {
    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            a$$ExternalSyntheticBUOutline0.m$1("attempt to increase counter past 2^32.");
            return;
        }
        int[] iArr = this.engineState;
        int i3 = iArr[12];
        int i4 = i2 + i3;
        iArr[12] = i4;
        if (i3 == 0 || i4 >= i3) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("attempt to increase counter past 2^32.");
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        ChaChaEngine.chachaCore(this.rounds, this.engineState, this.x);
        Pack.intToLittleEndian(this.x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        return this.engineState[12] & BodyPartID.bodyIdMax;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public int getNonceSize() {
        return 12;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        this.engineState[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            a$$ExternalSyntheticBUOutline0.m$1("attempt to reduce counter past zero.");
            return;
        }
        int[] iArr = this.engineState;
        int i3 = iArr[12];
        if ((i3 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i2)) {
            iArr[12] = i3 - i2;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("attempt to reduce counter past zero.");
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) getAlgorithmName(), (Object) " requires 256 bit key");
                return;
            } else {
                packTauOrSigma(bArr.length, this.engineState, 0);
                Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 8);
            }
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 13, 3);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i != 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("attempt to increase counter past 2^32.");
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12];
        if (i != 0) {
            iArr[12] = i - 1;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("attempt to reduce counter past zero.");
        }
    }
}
