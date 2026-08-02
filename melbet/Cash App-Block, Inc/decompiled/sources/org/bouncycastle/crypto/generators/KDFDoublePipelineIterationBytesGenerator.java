package org.bouncycastle.crypto.generators;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.BigInteger;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes9.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] a;
    private byte[] fixedInputData;
    private int generatedBytes;
    private final int h;
    private byte[] ios;
    private byte[] k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.h = macSize;
        this.a = new byte[macSize];
        this.k = new byte[macSize];
    }

    private void generateNext() {
        int i = this.generatedBytes;
        Mac mac = this.prf;
        if (i == 0) {
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.a, 0);
        } else {
            byte[] bArr2 = this.a;
            mac.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.a, 0);
        }
        Mac mac2 = this.prf;
        byte[] bArr3 = this.a;
        mac2.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i2 = (this.generatedBytes / this.h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unsupported size of counter i");
                            return;
                        }
                        bArr4[0] = (byte) (i2 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i2 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i2 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i2;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac3 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac3.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            f$$ExternalSyntheticLambda0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxSizeExcl, " bytes", new StringBuilder("Current KDFCTR may only be used for ")));
            return 0;
        }
        if (i3 % this.h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.h;
        int i7 = i5 % i6;
        int min = Math.min(i6 - (i5 % i6), i2);
        System.arraycopy(this.k, i7, bArr, i, min);
        this.generatedBytes += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            min = Math.min(this.h, i8);
            System.arraycopy(this.k, 0, bArr, i, min);
            this.generatedBytes += min;
            i8 -= min;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            a$$ExternalSyntheticBUOutline0.m$3("Wrong type of arguments given");
            return;
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r / 8];
        int i = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            BigInteger multiply = TWO.pow(r).multiply(BigInteger.valueOf(this.h));
            if (multiply.compareTo(INTEGER_MAX) != 1) {
                i = multiply.intValue();
            }
        }
        this.maxSizeExcl = i;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
