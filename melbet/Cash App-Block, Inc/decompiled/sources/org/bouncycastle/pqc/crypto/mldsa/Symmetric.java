package org.bouncycastle.pqc.crypto.mldsa;

import com.plaid.internal.EnumC0170g;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes10.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    public static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        public ShakeSymmetric() {
            super(EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(256);
        }

        private void streamInit(SHAKEDigest sHAKEDigest, byte[] bArr, short s) {
            sHAKEDigest.reset();
            sHAKEDigest.update(bArr, 0, bArr.length);
            sHAKEDigest.update(new byte[]{(byte) s, (byte) (s >> 8)}, 0, 2);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream128init(byte[] bArr, short s) {
            streamInit(this.digest128, bArr, s);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream128squeezeBlocks(byte[] bArr, int i, int i2) {
            this.digest128.doOutput(bArr, i, i2);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream256init(byte[] bArr, short s) {
            streamInit(this.digest256, bArr, s);
        }

        @Override // org.bouncycastle.pqc.crypto.mldsa.Symmetric
        public void stream256squeezeBlocks(byte[] bArr, int i, int i2) {
            this.digest256.doOutput(bArr, i, i2);
        }
    }

    public Symmetric(int i, int i2) {
        this.stream128BlockBytes = i;
        this.stream256BlockBytes = i2;
    }

    public abstract void stream128init(byte[] bArr, short s);

    public abstract void stream128squeezeBlocks(byte[] bArr, int i, int i2);

    public abstract void stream256init(byte[] bArr, short s);

    public abstract void stream256squeezeBlocks(byte[] bArr, int i, int i2);
}
