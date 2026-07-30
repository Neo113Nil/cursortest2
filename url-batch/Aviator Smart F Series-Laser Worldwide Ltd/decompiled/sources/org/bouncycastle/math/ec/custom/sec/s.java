package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class s extends e.c {
    private static final int SECP192R1_DEFAULT_COORDS = 2;
    protected v infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f17170q = u.Q;
    private static final org.bouncycastle.math.ec.f[] SECP192R1_AFFINE_ZS = {new u(org.bouncycastle.math.ec.d.ONE)};

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ int[] val$table;

        a(int i8, int[] iArr) {
            this.val$len = i8;
            this.val$table = iArr;
        }

        private org.bouncycastle.math.ec.i createPoint(int[] iArr, int[] iArr2) {
            return s.this.createRawPoint(new u(iArr), new u(iArr2), s.SECP192R1_AFFINE_ZS);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookup(int i8) {
            int[] create = b7.f.create();
            int[] create2 = b7.f.create();
            int i9 = 0;
            for (int i10 = 0; i10 < this.val$len; i10++) {
                int i11 = ((i10 ^ i8) - 1) >> 31;
                for (int i12 = 0; i12 < 6; i12++) {
                    int i13 = create[i12];
                    int[] iArr = this.val$table;
                    create[i12] = i13 ^ (iArr[i9 + i12] & i11);
                    create2[i12] = create2[i12] ^ (iArr[(i9 + 6) + i12] & i11);
                }
                i9 += 12;
            }
            return createPoint(create, create2);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookupVar(int i8) {
            int[] create = b7.f.create();
            int[] create2 = b7.f.create();
            int i9 = i8 * 12;
            for (int i10 = 0; i10 < 6; i10++) {
                int[] iArr = this.val$table;
                create[i10] = iArr[i9 + i10];
                create2[i10] = iArr[6 + i9 + i10];
            }
            return createPoint(create, create2);
        }
    }

    public s() {
        super(f17170q);
        this.infinity = new v(this, null, null);
        this.f17177a = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f17178b = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.e cloneCurve() {
        return new s();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.g createCacheSafeLookupTable(org.bouncycastle.math.ec.i[] iVarArr, int i8, int i9) {
        int[] iArr = new int[i9 * 12];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            org.bouncycastle.math.ec.i iVar = iVarArr[i8 + i11];
            b7.f.copy(((u) iVar.getRawXCoord()).f17172x, 0, iArr, i10);
            b7.f.copy(((u) iVar.getRawYCoord()).f17172x, 0, iArr, i10 + 6);
            i10 += 12;
        }
        return new a(i9, iArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return new v(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
        return new u(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return f17170q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.i getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f17170q;
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f randomFieldElement(SecureRandom secureRandom) {
        int[] create = b7.f.create();
        t.random(secureRandom, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = b7.f.create();
        t.randomMult(secureRandom, create);
        return new u(create);
    }

    @Override // org.bouncycastle.math.ec.e
    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        return new v(this, fVar, fVar2, fVarArr);
    }
}
