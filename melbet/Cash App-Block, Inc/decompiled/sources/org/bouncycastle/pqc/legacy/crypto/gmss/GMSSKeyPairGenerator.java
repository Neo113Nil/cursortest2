package org.bouncycastle.pqc.legacy.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;

/* loaded from: classes10.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private int[] K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i;
        Class cls;
        int i2;
        int i3;
        if (!this.initialized) {
            initializeDefault();
        }
        int i4 = this.numLayer;
        byte[][][] bArr = new byte[i4][][];
        byte[][][] bArr2 = new byte[i4 - 1][][];
        Treehash[][] treehashArr = new Treehash[i4][];
        Treehash[][] treehashArr2 = new Treehash[i4 - 1][];
        Vector[] vectorArr = new Vector[i4];
        Vector[] vectorArr2 = new Vector[i4 - 1];
        Vector[][] vectorArr3 = new Vector[i4][];
        boolean z = true;
        Vector[][] vectorArr4 = new Vector[i4 - 1][];
        int i5 = 0;
        while (true) {
            i = this.numLayer;
            cls = Byte.TYPE;
            if (i5 >= i) {
                break;
            }
            int i6 = this.heightOfTrees[i5];
            boolean z2 = z;
            int[] iArr = new int[2];
            iArr[z2 ? 1 : 0] = this.mdLength;
            iArr[0] = i6;
            bArr[i5] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i7 = this.heightOfTrees[i5];
            treehashArr[i5] = new Treehash[i7 - this.K[i5]];
            if (i5 > 0) {
                int i8 = i5 - 1;
                int[] iArr2 = new int[2];
                iArr2[z2 ? 1 : 0] = this.mdLength;
                iArr2[0] = i7;
                bArr2[i8] = (byte[][]) Array.newInstance((Class<?>) cls, iArr2);
                treehashArr2[i8] = new Treehash[this.heightOfTrees[i5] - this.K[i5]];
            }
            vectorArr[i5] = new Vector();
            if (i5 > 0) {
                vectorArr2[i5 - 1] = new Vector();
            }
            i5++;
            z = z2 ? 1 : 0;
        }
        boolean z3 = z;
        int[] iArr3 = new int[2];
        iArr3[z3 ? 1 : 0] = this.mdLength;
        iArr3[0] = i;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr3);
        int i9 = this.numLayer - 1;
        int[] iArr4 = new int[2];
        iArr4[z3 ? 1 : 0] = this.mdLength;
        iArr4[0] = i9;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        int i10 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[z3 ? 1 : 0] = this.mdLength;
        iArr5[0] = i10;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls, iArr5);
        int i11 = 0;
        while (true) {
            i2 = this.numLayer;
            if (i11 >= i2) {
                break;
            }
            System.arraycopy(this.currentSeeds[i11], 0, bArr5[i11], 0, this.mdLength);
            i11++;
            bArr5 = bArr5;
            bArr3 = bArr3;
        }
        byte[][] bArr6 = bArr5;
        byte[][] bArr7 = bArr3;
        int[] iArr6 = new int[2];
        iArr6[z3 ? 1 : 0] = this.mdLength;
        iArr6[0] = i2 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) cls, iArr6);
        int i12 = this.numLayer - 1;
        while (true) {
            i3 = this.numLayer;
            if (i12 < 0) {
                break;
            }
            GMSSRootCalc generateCurrentAuthpathAndRoot = i12 == i3 + (-1) ? generateCurrentAuthpathAndRoot(null, vectorArr[i12], bArr6[i12], i12) : generateCurrentAuthpathAndRoot(bArr7[i12 + 1], vectorArr[i12], bArr6[i12], i12);
            int i13 = 0;
            while (i13 < this.heightOfTrees[i12]) {
                System.arraycopy(generateCurrentAuthpathAndRoot.getAuthPath()[i13], 0, bArr[i12][i13], 0, this.mdLength);
                i13++;
                i12 = i12;
            }
            int i14 = i12;
            vectorArr3[i14] = generateCurrentAuthpathAndRoot.getRetain();
            treehashArr[i14] = generateCurrentAuthpathAndRoot.getTreehash();
            System.arraycopy(generateCurrentAuthpathAndRoot.getRoot(), 0, bArr7[i14], 0, this.mdLength);
            i12 = i14 - 1;
        }
        int i15 = i3 - 2;
        while (i15 >= 0) {
            int i16 = i15 + 1;
            GMSSRootCalc generateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i15], bArr6[i16], i16);
            int i17 = 0;
            while (i17 < this.heightOfTrees[i16]) {
                System.arraycopy(generateNextAuthpathAndRoot.getAuthPath()[i17], 0, bArr2[i15][i17], 0, this.mdLength);
                i17++;
                generateNextAuthpathAndRoot = generateNextAuthpathAndRoot;
                i15 = i15;
            }
            GMSSRootCalc gMSSRootCalc = generateNextAuthpathAndRoot;
            int i18 = i15;
            vectorArr4[i18] = gMSSRootCalc.getRetain();
            treehashArr2[i18] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr4[i18], 0, this.mdLength);
            System.arraycopy(bArr6[i16], 0, this.nextNextSeeds[i18], 0, this.mdLength);
            i15 = i18 - 1;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr7[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i) {
        byte[] Verify;
        int i2 = this.mdLength;
        byte[] bArr3 = new byte[i2];
        byte[] bArr4 = new byte[i2];
        byte[] nextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i3 = this.numLayer - 1;
        GMSSDigestProvider gMSSDigestProvider = this.digestProvider;
        if (i == i3) {
            Verify = new WinternitzOTSignature(nextSeed, gMSSDigestProvider.get(), this.otsIndex[i]).getPublicKey();
        } else {
            this.currentRootSigs[i] = new WinternitzOTSignature(nextSeed, gMSSDigestProvider.get(), this.otsIndex[i]).getSignature(bArr);
            Verify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i]).Verify(bArr, this.currentRootSigs[i]);
        }
        gMSSRootCalc.update(Verify);
        int i4 = 3;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = this.heightOfTrees[i];
            if (i6 >= (1 << i7)) {
                break;
            }
            if (i6 == i4 && i5 < i7 - this.K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i5);
                i4 *= 2;
                i5++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i6++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i], this.K[i], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i2 = 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.heightOfTrees[i];
            if (i3 >= (1 << i5)) {
                break;
            }
            if (i3 == i2 && i4 < i5 - this.K[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i4);
                i2 *= 2;
                i4++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i]).getPublicKey());
            i3++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(null, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom random = keyGenerationParameters.getRandom();
        for (int i = 0; i < this.numLayer; i++) {
            random.nextBytes(this.currentSeeds[i]);
            this.gmssRandom.nextSeed(this.currentSeeds[i]);
        }
        this.initialized = true;
    }

    public void initialize(int i, SecureRandom secureRandom) {
        initialize(i <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }
}
