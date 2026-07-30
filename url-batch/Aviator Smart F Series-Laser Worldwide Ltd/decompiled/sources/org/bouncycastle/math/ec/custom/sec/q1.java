package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class q1 extends e.b {
    private static final org.bouncycastle.math.ec.f[] SECT193R1_AFFINE_ZS = {new p1(org.bouncycastle.math.ec.d.ONE)};
    private static final int SECT193R1_DEFAULT_COORDS = 6;
    protected r1 infinity;

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ long[] val$table;

        a(int i8, long[] jArr) {
            this.val$len = i8;
            this.val$table = jArr;
        }

        private org.bouncycastle.math.ec.i createPoint(long[] jArr, long[] jArr2) {
            return q1.this.createRawPoint(new p1(jArr), new p1(jArr2), q1.SECT193R1_AFFINE_ZS);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookup(int i8) {
            long[] create64 = b7.h.create64();
            long[] create642 = b7.h.create64();
            int i9 = 0;
            for (int i10 = 0; i10 < this.val$len; i10++) {
                long j8 = ((i10 ^ i8) - 1) >> 31;
                for (int i11 = 0; i11 < 4; i11++) {
                    long j9 = create64[i11];
                    long[] jArr = this.val$table;
                    create64[i11] = j9 ^ (jArr[i9 + i11] & j8);
                    create642[i11] = create642[i11] ^ (jArr[(i9 + 4) + i11] & j8);
                }
                i9 += 8;
            }
            return createPoint(create64, create642);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookupVar(int i8) {
            long[] create64 = b7.h.create64();
            long[] create642 = b7.h.create64();
            int i9 = i8 * 8;
            for (int i10 = 0; i10 < 4; i10++) {
                long[] jArr = this.val$table;
                create64[i10] = jArr[i9 + i10];
                create642[i10] = jArr[4 + i9 + i10];
            }
            return createPoint(create64, create642);
        }
    }

    public q1() {
        super(193, 15, 0, 0);
        this.infinity = new r1(this, null, null);
        this.f17177a = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f17178b = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.e cloneCurve() {
        return new q1();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.g createCacheSafeLookupTable(org.bouncycastle.math.ec.i[] iVarArr, int i8, int i9) {
        long[] jArr = new long[i9 * 8];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            org.bouncycastle.math.ec.i iVar = iVarArr[i8 + i11];
            b7.h.copy64(((p1) iVar.getRawXCoord()).f17166x, 0, jArr, i10);
            b7.h.copy64(((p1) iVar.getRawYCoord()).f17166x, 0, jArr, i10 + 4);
            i10 += 8;
        }
        return new a(i9, jArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return new r1(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
        return new p1(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return 193;
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.i getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 193;
    }

    @Override // org.bouncycastle.math.ec.e.b
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.e
    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 6;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        return new r1(this, fVar, fVar2, fVarArr);
    }
}
