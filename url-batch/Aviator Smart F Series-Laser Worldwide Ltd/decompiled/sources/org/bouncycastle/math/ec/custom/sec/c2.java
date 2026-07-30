package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class c2 extends e.b {
    private static final org.bouncycastle.math.ec.f[] SECT239K1_AFFINE_ZS = {new b2(org.bouncycastle.math.ec.d.ONE)};
    private static final int SECT239K1_DEFAULT_COORDS = 6;
    protected d2 infinity;

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ long[] val$table;

        a(int i8, long[] jArr) {
            this.val$len = i8;
            this.val$table = jArr;
        }

        private org.bouncycastle.math.ec.i createPoint(long[] jArr, long[] jArr2) {
            return c2.this.createRawPoint(new b2(jArr), new b2(jArr2), c2.SECT239K1_AFFINE_ZS);
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

    public c2() {
        super(239, 158, 0, 0);
        this.infinity = new d2(this, null, null);
        this.f17177a = fromBigInteger(BigInteger.valueOf(0L));
        this.f17178b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.e cloneCurve() {
        return new c2();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.g createCacheSafeLookupTable(org.bouncycastle.math.ec.i[] iVarArr, int i8, int i9) {
        long[] jArr = new long[i9 * 8];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            org.bouncycastle.math.ec.i iVar = iVarArr[i8 + i11];
            b7.h.copy64(((b2) iVar.getRawXCoord()).f17148x, 0, jArr, i10);
            b7.h.copy64(((b2) iVar.getRawYCoord()).f17148x, 0, jArr, i10 + 4);
            i10 += 8;
        }
        return new a(i9, jArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.h createDefaultMultiplier() {
        return new org.bouncycastle.math.ec.y();
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return new d2(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
        return new b2(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.i getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.e.b
    public boolean isKoblitz() {
        return true;
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
        return new d2(this, fVar, fVar2, fVarArr);
    }
}
