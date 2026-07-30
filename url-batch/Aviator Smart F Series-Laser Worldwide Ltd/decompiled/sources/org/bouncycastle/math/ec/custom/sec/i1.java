package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class i1 extends e.b {
    private static final org.bouncycastle.math.ec.f[] SECT163K1_AFFINE_ZS = {new h1(org.bouncycastle.math.ec.d.ONE)};
    private static final int SECT163K1_DEFAULT_COORDS = 6;
    protected j1 infinity;

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ long[] val$table;

        a(int i8, long[] jArr) {
            this.val$len = i8;
            this.val$table = jArr;
        }

        private org.bouncycastle.math.ec.i createPoint(long[] jArr, long[] jArr2) {
            return i1.this.createRawPoint(new h1(jArr), new h1(jArr2), i1.SECT163K1_AFFINE_ZS);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookup(int i8) {
            long[] create64 = b7.f.create64();
            long[] create642 = b7.f.create64();
            int i9 = 0;
            for (int i10 = 0; i10 < this.val$len; i10++) {
                long j8 = ((i10 ^ i8) - 1) >> 31;
                for (int i11 = 0; i11 < 3; i11++) {
                    long j9 = create64[i11];
                    long[] jArr = this.val$table;
                    create64[i11] = j9 ^ (jArr[i9 + i11] & j8);
                    create642[i11] = create642[i11] ^ (jArr[(i9 + 3) + i11] & j8);
                }
                i9 += 6;
            }
            return createPoint(create64, create642);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookupVar(int i8) {
            long[] create64 = b7.f.create64();
            long[] create642 = b7.f.create64();
            int i9 = i8 * 6;
            for (int i10 = 0; i10 < 3; i10++) {
                long[] jArr = this.val$table;
                create64[i10] = jArr[i9 + i10];
                create642[i10] = jArr[3 + i9 + i10];
            }
            return createPoint(create64, create642);
        }
    }

    public i1() {
        super(163, 3, 6, 7);
        this.infinity = new j1(this, null, null);
        org.bouncycastle.math.ec.f fromBigInteger = fromBigInteger(BigInteger.valueOf(1L));
        this.f17177a = fromBigInteger;
        this.f17178b = fromBigInteger;
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.e cloneCurve() {
        return new i1();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.g createCacheSafeLookupTable(org.bouncycastle.math.ec.i[] iVarArr, int i8, int i9) {
        long[] jArr = new long[i9 * 6];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            org.bouncycastle.math.ec.i iVar = iVarArr[i8 + i11];
            b7.f.copy64(((h1) iVar.getRawXCoord()).f17156x, 0, jArr, i10);
            b7.f.copy64(((h1) iVar.getRawYCoord()).f17156x, 0, jArr, i10 + 3);
            i10 += 6;
        }
        return new a(i9, jArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.h createDefaultMultiplier() {
        return new org.bouncycastle.math.ec.y();
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return new j1(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
        return new h1(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return 163;
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.i getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return 163;
    }

    @Override // org.bouncycastle.math.ec.e.b
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.bouncycastle.math.ec.e
    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 6;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        return new j1(this, fVar, fVar2, fVarArr);
    }
}
