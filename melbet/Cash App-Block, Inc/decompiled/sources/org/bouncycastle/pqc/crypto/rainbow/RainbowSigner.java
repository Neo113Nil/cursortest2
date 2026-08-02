package org.bouncycastle.pqc.crypto.rainbow;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;
    private ComputeInField cf = new ComputeInField();
    private Digest hashAlgo;
    private RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;
    private Version version;

    /* renamed from: org.bouncycastle.pqc.crypto.rainbow.RainbowSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version;

        static {
            int[] iArr = new int[Version.values().length];
            $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version = iArr;
            try {
                iArr[Version.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.CIRCUMZENITHAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private byte[] genSignature(byte[] bArr) {
        short[] sArr;
        ComputeInField computeInField;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr2 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr2, 0);
        int v1 = this.key.getParameters().getV1();
        int o1 = this.key.getParameters().getO1();
        int o2 = this.key.getParameters().getO2();
        int m = this.key.getParameters().getM();
        int n = this.key.getParameters().getN();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters) this.key;
        Digest digest = this.hashAlgo;
        this.random = new RainbowDRBG(RainbowUtil.hash(digest, rainbowPrivateKeyParameters.sk_seed, bArr2, new byte[digest.getDigestSize()]), rainbowPrivateKeyParameters.getParameters().getHash_algo());
        short[] sArr2 = new short[v1];
        short[] sArr3 = new short[o1];
        short[] sArr4 = new short[o2];
        Class cls = Short.TYPE;
        short[][] sArr5 = (short[][]) Array.newInstance((Class<?>) cls, o2, o1);
        int i5 = 0;
        short[][] sArr6 = (short[][]) Array.newInstance((Class<?>) cls, o2, o2);
        byte[] bArr3 = new byte[rainbowPrivateKeyParameters.getParameters().getLen_salt()];
        short[] sArr7 = new short[m];
        short[] sArr8 = new short[o1];
        short[] sArr9 = new short[o2];
        int i6 = 0;
        short[][] sArr10 = null;
        while (sArr10 == null && i6 < 65536) {
            byte[] bArr4 = new byte[v1];
            this.random.nextBytes(bArr4);
            int i7 = 0;
            while (true) {
                i3 = i6;
                if (i7 >= v1) {
                    break;
                }
                sArr2[i7] = (short) (bArr4[i7] & 255);
                i7++;
                i6 = i3;
            }
            short[][] sArr11 = (short[][]) Array.newInstance((Class<?>) cls, o1, o1);
            int i8 = 0;
            while (i8 < v1) {
                int i9 = 0;
                while (true) {
                    i4 = i8;
                    if (i9 < o1) {
                        int i10 = 0;
                        while (i10 < o1) {
                            int i11 = i10;
                            int i12 = i9;
                            short multElem = GF2Field.multElem(rainbowPrivateKeyParameters.l1_F2[i9][i4][i11], sArr2[i4]);
                            short[] sArr12 = sArr11[i12];
                            sArr12[i11] = GF2Field.addElem(sArr12[i11], multElem);
                            i10 = i11 + 1;
                            i9 = i12;
                        }
                        i9++;
                        i8 = i4;
                    }
                }
                i8 = i4 + 1;
            }
            sArr10 = this.cf.inverse(sArr11);
            i6 = i3 + 1;
        }
        int i13 = i6;
        int i14 = 0;
        while (i14 < o1) {
            int i15 = i14;
            sArr3[i15] = this.cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l1_F1[i15], sArr2);
            i14 = i15 + 1;
        }
        int i16 = 0;
        while (i16 < v1) {
            int i17 = 0;
            while (true) {
                i2 = i16;
                if (i17 < o2) {
                    int i18 = i17;
                    sArr4[i18] = this.cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F1[i18], sArr2);
                    int i19 = 0;
                    while (i19 < o1) {
                        int i20 = i19;
                        short multElem2 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F2[i18][i2][i19], sArr2[i2]);
                        short[] sArr13 = sArr5[i18];
                        sArr13[i20] = GF2Field.addElem(sArr13[i20], multElem2);
                        i19 = i20 + 1;
                    }
                    int i21 = 0;
                    while (i21 < o2) {
                        int i22 = i21;
                        short multElem3 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F3[i18][i2][i21], sArr2[i2]);
                        short[] sArr14 = sArr6[i18];
                        sArr14[i22] = GF2Field.addElem(sArr14[i22], multElem3);
                        i21 = i22 + 1;
                    }
                    i17 = i18 + 1;
                    i16 = i2;
                }
            }
            i16 = i2 + 1;
        }
        byte[] bArr5 = new byte[m];
        short[] sArr15 = sArr8;
        int i23 = i13;
        short[] sArr16 = null;
        while (true) {
            sArr = sArr2;
            if (sArr16 != null || i23 >= 65536) {
                break;
            }
            int[] iArr = new int[2];
            iArr[1] = o2;
            iArr[i5] = o2;
            short[][] sArr17 = (short[][]) Array.newInstance((Class<?>) cls, iArr);
            this.random.nextBytes(bArr3);
            short[] makeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr2, bArr3, bArr5));
            byte[] bArr6 = bArr2;
            byte[] bArr7 = bArr5;
            Class cls2 = cls;
            int i24 = i5;
            System.arraycopy(this.cf.addVect(Arrays.copyOf(makeMessageRepresentative, o1), this.cf.multiplyMatrix(rainbowPrivateKeyParameters.s1, Arrays.copyOfRange(makeMessageRepresentative, o1, m))), i24, sArr7, i24, o1);
            System.arraycopy(makeMessageRepresentative, o1, sArr7, o1, o2);
            short[] multiplyMatrix = this.cf.multiplyMatrix(sArr10, this.cf.addVect(sArr3, Arrays.copyOf(sArr7, o1)));
            short[] multiplyMatrix2 = this.cf.multiplyMatrix(sArr5, multiplyMatrix);
            int i25 = 0;
            while (true) {
                computeInField = this.cf;
                if (i25 >= o2) {
                    break;
                }
                int i26 = i25;
                sArr9[i26] = computeInField.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F5[i26], multiplyMatrix);
                i25 = i26 + 1;
            }
            short[] sArr18 = sArr9;
            short[] addVect = this.cf.addVect(this.cf.addVect(computeInField.addVect(multiplyMatrix2, sArr18), sArr4), Arrays.copyOfRange(sArr7, o1, m));
            int i27 = 0;
            while (i27 < o1) {
                int i28 = 0;
                while (true) {
                    i = i27;
                    if (i28 < o2) {
                        int i29 = 0;
                        while (i29 < o2) {
                            int i30 = i29;
                            int i31 = m;
                            short multElem4 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F6[i28][i][i30], multiplyMatrix[i]);
                            short[] sArr19 = sArr17[i28];
                            sArr19[i30] = GF2Field.addElem(sArr19[i30], multElem4);
                            i29 = i30 + 1;
                            m = i31;
                        }
                        i28++;
                        i27 = i;
                    }
                }
                i27 = i + 1;
            }
            sArr16 = this.cf.solveEquation(this.cf.addMatrix(sArr17, sArr6), addVect);
            i23++;
            sArr15 = multiplyMatrix;
            bArr2 = bArr6;
            bArr5 = bArr7;
            cls = cls2;
            m = m;
            i5 = 0;
            sArr9 = sArr18;
            sArr2 = sArr;
        }
        short[] sArr20 = sArr16 == null ? new short[o2] : sArr16;
        short[] addVect2 = this.cf.addVect(this.cf.addVect(sArr, this.cf.multiplyMatrix(rainbowPrivateKeyParameters.t1, sArr15)), this.cf.multiplyMatrix(rainbowPrivateKeyParameters.t4, sArr20));
        short[] addVect3 = this.cf.addVect(sArr15, this.cf.multiplyMatrix(rainbowPrivateKeyParameters.t3, sArr20));
        short[] copyOf = Arrays.copyOf(addVect2, n);
        System.arraycopy(addVect3, 0, copyOf, v1, o1);
        System.arraycopy(sArr20, 0, copyOf, o1 + v1, o2);
        if (i23 != 65536) {
            return Arrays.concatenate(RainbowUtil.convertArray(copyOf), bArr3);
        }
        a$$ExternalSyntheticBUOutline0.m$1("unable to generate signature - LES not solvable");
        return null;
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i = this.signableDocumentLength;
        short[] sArr = new short[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            sArr[i2] = (short) (bArr[i3] & 255);
            i3++;
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return sArr;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return genSignature(bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                rainbowKeyParameters = (RainbowKeyParameters) parametersWithRandom.getParameters();
            } else {
                rainbowKeyParameters = (RainbowKeyParameters) cipherParameters;
                SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
                byte[] bArr = new byte[rainbowKeyParameters.getParameters().getLen_skseed()];
                secureRandom.nextBytes(bArr);
                this.random = new RainbowDRBG(bArr, rainbowKeyParameters.getParameters().getHash_algo());
            }
            this.version = rainbowKeyParameters.getParameters().getVersion();
            this.key = rainbowKeyParameters;
        } else {
            RainbowKeyParameters rainbowKeyParameters2 = (RainbowKeyParameters) cipherParameters;
            this.key = rainbowKeyParameters2;
            this.version = rainbowKeyParameters2.getParameters().getVersion();
        }
        this.signableDocumentLength = this.key.getDocLength();
        this.hashAlgo = this.key.getParameters().getHash_algo();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] publicMap;
        byte[] bArr3 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr3, 0);
        int m = this.key.getParameters().getM();
        int n = this.key.getParameters().getN();
        RainbowPublicMap rainbowPublicMap = new RainbowPublicMap(this.key.getParameters());
        short[] makeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr3, Arrays.copyOfRange(bArr2, n, bArr2.length), new byte[m]));
        short[] convertArray = RainbowUtil.convertArray(Arrays.copyOfRange(bArr2, 0, n));
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[this.version.ordinal()];
        if (i == 1) {
            publicMap = rainbowPublicMap.publicMap((RainbowPublicKeyParameters) this.key, convertArray);
        } else {
            if (i != 2 && i != 3) {
                a$$ExternalSyntheticBUOutline0.m$3("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
                return false;
            }
            publicMap = rainbowPublicMap.publicMap_cyclic((RainbowPublicKeyParameters) this.key, convertArray);
        }
        return RainbowUtil.equals(makeMessageRepresentative, publicMap);
    }
}
