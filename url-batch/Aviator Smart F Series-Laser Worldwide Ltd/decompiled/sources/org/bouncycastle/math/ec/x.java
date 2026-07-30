package org.bouncycastle.math.ec;

import com.baidu.ar.base.MsgField;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class x {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, MsgField.MSG_ON_DOWNLOAD_RES_ERROR};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final i[] EMPTY_POINTS = new i[0];
    private static final int MAX_WIDTH = 16;
    public static final String PRECOMP_NAME = "bc_wnaf";

    static class a implements p {
        final /* synthetic */ int val$confWidth;

        a(int i8) {
            this.val$confWidth = i8;
        }

        @Override // org.bouncycastle.math.ec.p
        public q precompute(q qVar) {
            w wVar = qVar instanceof w ? (w) qVar : null;
            if (wVar != null && wVar.getConfWidth() == this.val$confWidth) {
                wVar.setPromotionCountdown(0);
                return wVar;
            }
            w wVar2 = new w();
            wVar2.setPromotionCountdown(0);
            wVar2.setConfWidth(this.val$confWidth);
            if (wVar != null) {
                wVar2.setPreComp(wVar.getPreComp());
                wVar2.setPreCompNeg(wVar.getPreCompNeg());
                wVar2.setTwice(wVar.getTwice());
                wVar2.setWidth(wVar.getWidth());
            }
            return wVar2;
        }
    }

    static class b implements p {
        final /* synthetic */ e val$c;
        final /* synthetic */ boolean val$includeNegated;
        final /* synthetic */ int val$minWidth;
        final /* synthetic */ i val$p;

        b(int i8, boolean z7, i iVar, e eVar) {
            this.val$minWidth = i8;
            this.val$includeNegated = z7;
            this.val$p = iVar;
            this.val$c = eVar;
        }

        private boolean checkExisting(w wVar, int i8, int i9, boolean z7) {
            return wVar != null && wVar.getWidth() >= Math.max(wVar.getConfWidth(), i8) && checkTable(wVar.getPreComp(), i9) && (!z7 || checkTable(wVar.getPreCompNeg(), i9));
        }

        private boolean checkTable(i[] iVarArr, int i8) {
            return iVarArr != null && iVarArr.length >= i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[LOOP:0: B:42:0x00f0->B:43:0x00f2, LOOP_END] */
        @Override // org.bouncycastle.math.ec.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public q precompute(q qVar) {
            i iVar;
            i[] iVarArr;
            i[] iVarArr2;
            int length;
            int i8;
            i iVar2;
            int coordinateSystem;
            f fVar = null;
            w wVar = qVar instanceof w ? (w) qVar : null;
            int max = Math.max(2, Math.min(16, this.val$minWidth));
            if (checkExisting(wVar, max, 1 << (max - 2), this.val$includeNegated)) {
                wVar.decrementPromotionCountdown();
                return wVar;
            }
            w wVar2 = new w();
            if (wVar != null) {
                wVar2.setPromotionCountdown(wVar.decrementPromotionCountdown());
                wVar2.setConfWidth(wVar.getConfWidth());
                iVarArr = wVar.getPreComp();
                iVarArr2 = wVar.getPreCompNeg();
                iVar = wVar.getTwice();
            } else {
                iVar = null;
                iVarArr = null;
                iVarArr2 = null;
            }
            int min = Math.min(16, Math.max(wVar2.getConfWidth(), max));
            int i9 = 1 << (min - 2);
            int i10 = 0;
            if (iVarArr == null) {
                iVarArr = x.EMPTY_POINTS;
                length = 0;
            } else {
                length = iVarArr.length;
            }
            if (length < i9) {
                iVarArr = x.resizeTable(iVarArr, i9);
                if (i9 == 1) {
                    iVarArr[0] = this.val$p.normalize();
                } else {
                    if (length == 0) {
                        iVarArr[0] = this.val$p;
                        i8 = 1;
                    } else {
                        i8 = length;
                    }
                    if (i9 == 2) {
                        iVarArr[1] = this.val$p.threeTimes();
                    } else {
                        i iVar3 = iVarArr[i8 - 1];
                        if (iVar == null) {
                            iVar = iVarArr[0].twice();
                            if (!iVar.isInfinity() && org.bouncycastle.math.ec.c.isFpCurve(this.val$c) && this.val$c.getFieldSize() >= 64 && ((coordinateSystem = this.val$c.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                                fVar = iVar.getZCoord(0);
                                iVar2 = this.val$c.createPoint(iVar.getXCoord().toBigInteger(), iVar.getYCoord().toBigInteger());
                                f square = fVar.square();
                                iVar3 = iVar3.scaleX(square).scaleY(square.multiply(fVar));
                                if (length == 0) {
                                    iVarArr[0] = iVar3;
                                }
                                while (i8 < i9) {
                                    iVar3 = iVar3.add(iVar2);
                                    iVarArr[i8] = iVar3;
                                    i8++;
                                }
                            }
                        }
                        iVar2 = iVar;
                        while (i8 < i9) {
                        }
                    }
                    this.val$c.normalizeAll(iVarArr, length, i9 - length, fVar);
                }
            }
            if (this.val$includeNegated) {
                if (iVarArr2 == null) {
                    iVarArr2 = new i[i9];
                } else {
                    i10 = iVarArr2.length;
                    if (i10 < i9) {
                        iVarArr2 = x.resizeTable(iVarArr2, i9);
                    }
                }
                while (i10 < i9) {
                    iVarArr2[i10] = iVarArr[i10].negate();
                    i10++;
                }
            }
            wVar2.setPreComp(iVarArr);
            wVar2.setPreCompNeg(iVarArr2);
            wVar2.setTwice(iVar);
            wVar2.setWidth(min);
            return wVar2;
        }
    }

    static class c implements p {
        final /* synthetic */ w val$fromWNaf;
        final /* synthetic */ boolean val$includeNegated;
        final /* synthetic */ j val$pointMap;

        c(w wVar, boolean z7, j jVar) {
            this.val$fromWNaf = wVar;
            this.val$includeNegated = z7;
            this.val$pointMap = jVar;
        }

        private boolean checkExisting(w wVar, int i8, int i9, boolean z7) {
            return wVar != null && wVar.getWidth() >= i8 && checkTable(wVar.getPreComp(), i9) && (!z7 || checkTable(wVar.getPreCompNeg(), i9));
        }

        private boolean checkTable(i[] iVarArr, int i8) {
            return iVarArr != null && iVarArr.length >= i8;
        }

        @Override // org.bouncycastle.math.ec.p
        public q precompute(q qVar) {
            w wVar = qVar instanceof w ? (w) qVar : null;
            int width = this.val$fromWNaf.getWidth();
            if (checkExisting(wVar, width, this.val$fromWNaf.getPreComp().length, this.val$includeNegated)) {
                wVar.decrementPromotionCountdown();
                return wVar;
            }
            w wVar2 = new w();
            wVar2.setPromotionCountdown(this.val$fromWNaf.getPromotionCountdown());
            i twice = this.val$fromWNaf.getTwice();
            if (twice != null) {
                wVar2.setTwice(this.val$pointMap.map(twice));
            }
            i[] preComp = this.val$fromWNaf.getPreComp();
            int length = preComp.length;
            i[] iVarArr = new i[length];
            for (int i8 = 0; i8 < preComp.length; i8++) {
                iVarArr[i8] = this.val$pointMap.map(preComp[i8]);
            }
            wVar2.setPreComp(iVarArr);
            wVar2.setWidth(width);
            if (this.val$includeNegated) {
                i[] iVarArr2 = new i[length];
                for (int i9 = 0; i9 < length; i9++) {
                    iVarArr2[i9] = iVarArr[i9].negate();
                }
                wVar2.setPreCompNeg(iVarArr2);
            }
            return wVar2;
        }
    }

    public static void configureBasepoint(i iVar) {
        e curve = iVar.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        curve.precompute(iVar, PRECOMP_NAME, new a(Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3)));
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i8 = bitLength >> 1;
        int[] iArr = new int[i8];
        BigInteger xor = add.xor(bigInteger);
        int i9 = bitLength - 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i12 < i9) {
            if (xor.testBit(i12)) {
                iArr[i10] = i11 | ((bigInteger.testBit(i12) ? -1 : 1) << 16);
                i12++;
                i10++;
                i11 = 1;
            } else {
                i11++;
            }
            i12++;
        }
        int i13 = i10 + 1;
        iArr[i10] = 65536 | i11;
        return i8 > i13 ? trim(iArr, i13) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i8, BigInteger bigInteger) {
        if (i8 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i8 < 2 || i8 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int bitLength = (bigInteger.bitLength() / i8) + 1;
        int[] iArr = new int[bitLength];
        int i9 = 1 << i8;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        boolean z7 = false;
        while (i12 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i12) == z7) {
                i12++;
            } else {
                bigInteger = bigInteger.shiftRight(i12);
                int intValue = bigInteger.intValue() & i10;
                if (z7) {
                    intValue++;
                }
                z7 = (intValue & i11) != 0;
                if (z7) {
                    intValue -= i9;
                }
                if (i13 > 0) {
                    i12--;
                }
                iArr[i13] = i12 | (intValue << 16);
                i12 = i8;
                i13++;
            }
        }
        return bitLength > i13 ? trim(iArr, i13) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int max = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if ((i8 | i9) == 0 && bigInteger3.bitLength() <= i10 && bigInteger4.bitLength() <= i10) {
                break;
            }
            int intValue = (bigInteger3.intValue() >>> i10) + i8;
            int i12 = intValue & 7;
            int intValue2 = (bigInteger4.intValue() >>> i10) + i9;
            int i13 = intValue2 & 7;
            int i14 = intValue & 1;
            if (i14 != 0) {
                i14 -= intValue & 2;
                if (i12 + i14 == 4 && (intValue2 & 3) == 2) {
                    i14 = -i14;
                }
            }
            int i15 = intValue2 & 1;
            if (i15 != 0) {
                i15 -= intValue2 & 2;
                if (i13 + i15 == 4 && (intValue & 3) == 2) {
                    i15 = -i15;
                }
            }
            if ((i8 << 1) == i14 + 1) {
                i8 ^= 1;
            }
            if ((i9 << 1) == i15 + 1) {
                i9 ^= 1;
            }
            i10++;
            if (i10 == 30) {
                bigInteger3 = bigInteger3.shiftRight(30);
                bigInteger4 = bigInteger4.shiftRight(30);
                i10 = 0;
            }
            bArr[i11] = (byte) ((i15 & 15) | (i14 << 4));
            i11++;
        }
        return max > i11 ? trim(bArr, i11) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i8 = bitLength - 1;
        byte[] bArr = new byte[i8];
        BigInteger xor = add.xor(bigInteger);
        int i9 = 1;
        while (i9 < i8) {
            if (xor.testBit(i9)) {
                bArr[i9 - 1] = (byte) (bigInteger.testBit(i9) ? -1 : 1);
                i9++;
            }
            i9++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i8, BigInteger bigInteger) {
        if (i8 == 2) {
            return generateNaf(bigInteger);
        }
        if (i8 < 2 || i8 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i9 = 1 << i8;
        int i10 = i9 - 1;
        int i11 = i9 >>> 1;
        int i12 = 0;
        int i13 = 0;
        boolean z7 = false;
        while (i12 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i12) == z7) {
                i12++;
            } else {
                bigInteger = bigInteger.shiftRight(i12);
                int intValue = bigInteger.intValue() & i10;
                if (z7) {
                    intValue++;
                }
                z7 = (intValue & i11) != 0;
                if (z7) {
                    intValue -= i9;
                }
                if (i13 > 0) {
                    i12--;
                }
                int i14 = i13 + i12;
                bArr[i14] = (byte) intValue;
                i13 = i14 + 1;
                i12 = i8;
            }
        }
        return bitLength > i13 ? trim(bArr, i13) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static w getWNafPreCompInfo(i iVar) {
        return getWNafPreCompInfo(iVar.getCurve().getPreCompInfo(iVar, PRECOMP_NAME));
    }

    public static int getWindowSize(int i8) {
        return getWindowSize(i8, DEFAULT_WINDOW_SIZE_CUTOFFS, 16);
    }

    public static w precompute(i iVar, int i8, boolean z7) {
        e curve = iVar.getCurve();
        return (w) curve.precompute(iVar, PRECOMP_NAME, new b(i8, z7, iVar, curve));
    }

    public static w precomputeWithPointMap(i iVar, j jVar, w wVar, boolean z7) {
        return (w) iVar.getCurve().precompute(iVar, PRECOMP_NAME, new c(wVar, z7, jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i[] resizeTable(i[] iVarArr, int i8) {
        i[] iVarArr2 = new i[i8];
        System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
        return iVarArr2;
    }

    private static byte[] trim(byte[] bArr, int i8) {
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return bArr2;
    }

    public static w getWNafPreCompInfo(q qVar) {
        if (qVar instanceof w) {
            return (w) qVar;
        }
        return null;
    }

    public static int getWindowSize(int i8, int i9) {
        return getWindowSize(i8, DEFAULT_WINDOW_SIZE_CUTOFFS, i9);
    }

    private static int[] trim(int[] iArr, int i8) {
        int[] iArr2 = new int[i8];
        System.arraycopy(iArr, 0, iArr2, 0, i8);
        return iArr2;
    }

    public static int getWindowSize(int i8, int[] iArr) {
        return getWindowSize(i8, iArr, 16);
    }

    public static int getWindowSize(int i8, int[] iArr, int i9) {
        int i10 = 0;
        while (i10 < iArr.length && i8 >= iArr[i10]) {
            i10++;
        }
        return Math.max(2, Math.min(i9, i10 + 2));
    }
}
