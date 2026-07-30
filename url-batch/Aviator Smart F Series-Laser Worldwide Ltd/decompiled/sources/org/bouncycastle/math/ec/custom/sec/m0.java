package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class m0 extends e.c {
    private static final int SECP384R1_DEFAULT_COORDS = 2;
    protected p0 infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f17163q = o0.Q;
    private static final org.bouncycastle.math.ec.f[] SECP384R1_AFFINE_ZS = {new o0(org.bouncycastle.math.ec.d.ONE)};

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ int[] val$table;

        a(int i8, int[] iArr) {
            this.val$len = i8;
            this.val$table = iArr;
        }

        private org.bouncycastle.math.ec.i createPoint(int[] iArr, int[] iArr2) {
            return m0.this.createRawPoint(new o0(iArr), new o0(iArr2), m0.SECP384R1_AFFINE_ZS);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookup(int i8) {
            int[] create = b7.n.create(12);
            int[] create2 = b7.n.create(12);
            int i9 = 0;
            for (int i10 = 0; i10 < this.val$len; i10++) {
                int i11 = ((i10 ^ i8) - 1) >> 31;
                for (int i12 = 0; i12 < 12; i12++) {
                    int i13 = create[i12];
                    int[] iArr = this.val$table;
                    create[i12] = i13 ^ (iArr[i9 + i12] & i11);
                    create2[i12] = create2[i12] ^ (iArr[(i9 + 12) + i12] & i11);
                }
                i9 += 24;
            }
            return createPoint(create, create2);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookupVar(int i8) {
            int[] create = b7.n.create(12);
            int[] create2 = b7.n.create(12);
            int i9 = i8 * 24;
            for (int i10 = 0; i10 < 12; i10++) {
                int[] iArr = this.val$table;
                create[i10] = iArr[i9 + i10];
                create2[i10] = iArr[i9 + 12 + i10];
            }
            return createPoint(create, create2);
        }
    }

    public m0() {
        super(f17163q);
        this.infinity = new p0(this, null, null);
        this.f17177a = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f17178b = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.e cloneCurve() {
        return new m0();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.g createCacheSafeLookupTable(org.bouncycastle.math.ec.i[] iVarArr, int i8, int i9) {
        int[] iArr = new int[i9 * 24];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            org.bouncycastle.math.ec.i iVar = iVarArr[i8 + i11];
            b7.n.copy(12, ((o0) iVar.getRawXCoord()).f17165x, 0, iArr, i10);
            b7.n.copy(12, ((o0) iVar.getRawYCoord()).f17165x, 0, iArr, i10 + 12);
            i10 += 24;
        }
        return new a(i9, iArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return new p0(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
        return new o0(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return f17163q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.i getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f17163q;
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f randomFieldElement(SecureRandom secureRandom) {
        int[] create = b7.n.create(12);
        n0.random(secureRandom, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = b7.n.create(12);
        n0.randomMult(secureRandom, create);
        return new o0(create);
    }

    @Override // org.bouncycastle.math.ec.e
    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        return new p0(this, fVar, fVar2, fVarArr);
    }
}
