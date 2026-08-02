package org.bouncycastle.crypto.digests;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.SparkleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public class SparkleDigest implements ExtendedDigest {
    private static final int RATE_BYTES = 16;
    private static final int RATE_WORDS = 4;
    private final int DIGEST_BYTES;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private String algorithmName;
    private final byte[] m_buf = new byte[16];
    private int m_bufPos = 0;
    private final int[] state;

    /* renamed from: org.bouncycastle.crypto.digests.SparkleDigest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters;

        static {
            int[] iArr = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters = iArr;
            try {
                iArr[SparkleParameters.ESCH256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters[SparkleParameters.ESCH384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public enum SparkleParameters {
        ESCH256,
        ESCH384
    }

    public SparkleDigest(SparkleParameters sparkleParameters) {
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$digests$SparkleDigest$SparkleParameters[sparkleParameters.ordinal()];
        if (i == 1) {
            this.algorithmName = "ESCH-256";
            this.DIGEST_BYTES = 32;
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 11;
            this.STATE_WORDS = 12;
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$3("Invalid definition of SCHWAEMM instance");
                throw null;
            }
            this.algorithmName = "ESCH-384";
            this.DIGEST_BYTES = 48;
            this.SPARKLE_STEPS_SLIM = 8;
            this.SPARKLE_STEPS_BIG = 12;
            this.STATE_WORDS = 16;
        }
        this.state = new int[this.STATE_WORDS];
    }

    private static int ELL(int i) {
        return (i & 65535) ^ Integers.rotateRight(i, 16);
    }

    private void processBlock(byte[] bArr, int i, int i2) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, i + 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, i + 12);
        int ELL = ELL(littleEndianToInt ^ littleEndianToInt3);
        int ELL2 = ELL(littleEndianToInt2 ^ littleEndianToInt4);
        int[] iArr = this.state;
        iArr[0] = (littleEndianToInt ^ ELL2) ^ iArr[0];
        iArr[1] = (littleEndianToInt2 ^ ELL) ^ iArr[1];
        iArr[2] = iArr[2] ^ (littleEndianToInt3 ^ ELL2);
        iArr[3] = (littleEndianToInt4 ^ ELL) ^ iArr[3];
        iArr[4] = iArr[4] ^ ELL2;
        iArr[5] = iArr[5] ^ ELL;
        if (this.STATE_WORDS != 16) {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, i2);
            return;
        }
        iArr[6] = iArr[6] ^ ELL2;
        iArr[7] = ELL ^ iArr[7];
        SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (i > bArr.length - this.DIGEST_BYTES) {
            f$$ExternalSyntheticLambda0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " input buffer too short"));
            return 0;
        }
        int i2 = this.m_bufPos;
        int[] iArr = this.state;
        if (i2 < 16) {
            int i3 = (this.STATE_WORDS >> 1) - 1;
            iArr[i3] = iArr[i3] ^ 16777216;
            this.m_buf[i2] = Byte.MIN_VALUE;
            while (true) {
                int i4 = this.m_bufPos + 1;
                this.m_bufPos = i4;
                if (i4 >= 16) {
                    break;
                }
                this.m_buf[i4] = 0;
            }
        } else {
            int i5 = (this.STATE_WORDS >> 1) - 1;
            iArr[i5] = iArr[i5] ^ 33554432;
        }
        processBlock(this.m_buf, 0, this.SPARKLE_STEPS_BIG);
        Pack.intToLittleEndian(this.state, 0, 4, bArr, i);
        if (this.STATE_WORDS == 16) {
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i + 16);
            SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i + 32);
        } else {
            SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
            Pack.intToLittleEndian(this.state, 0, 4, bArr, i + 16);
        }
        reset();
        return this.DIGEST_BYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.DIGEST_BYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0);
        Arrays.fill(this.m_buf, (byte) 0);
        this.m_bufPos = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        if (i > bArr.length - i2) {
            f$$ExternalSyntheticLambda0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " input buffer too short"));
            return;
        }
        if (i2 < 1) {
            return;
        }
        int i3 = this.m_bufPos;
        int i4 = 16 - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, this.m_buf, i3, i2);
            this.m_bufPos += i2;
            return;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, i, this.m_buf, i3, i4);
            processBlock(this.m_buf, 0, this.SPARKLE_STEPS_SLIM);
        } else {
            i4 = 0;
        }
        while (true) {
            int i5 = i2 - i4;
            if (i5 <= 16) {
                System.arraycopy(bArr, i + i4, this.m_buf, 0, i5);
                this.m_bufPos = i5;
                return;
            } else {
                processBlock(bArr, i + i4, this.SPARKLE_STEPS_SLIM);
                i4 += 16;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        if (this.m_bufPos == 16) {
            processBlock(this.m_buf, 0, this.SPARKLE_STEPS_SLIM);
            this.m_bufPos = 0;
        }
        byte[] bArr = this.m_buf;
        int i = this.m_bufPos;
        this.m_bufPos = i + 1;
        bArr[i] = b;
    }
}
