package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.e;

/* loaded from: classes5.dex */
public class i0 extends e.c {
    private static final int SECP256R1_DEFAULT_COORDS = 2;
    protected l0 infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f17158q = k0.Q;
    private static final org.bouncycastle.math.ec.f[] SECP256R1_AFFINE_ZS = {new k0(org.bouncycastle.math.ec.d.ONE)};

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ int[] val$table;

        a(int i8, int[] iArr) {
            this.val$len = i8;
            this.val$table = iArr;
        }

        private org.bouncycastle.math.ec.i createPoint(int[] iArr, int[] iArr2) {
            return i0.this.createRawPoint(new k0(iArr), new k0(iArr2), i0.SECP256R1_AFFINE_ZS);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookup(int i8) {
            int[] create = b7.h.create();
            int[] create2 = b7.h.create();
            int i9 = 0;
            for (int i10 = 0; i10 < this.val$len; i10++) {
                int i11 = ((i10 ^ i8) - 1) >> 31;
                for (int i12 = 0; i12 < 8; i12++) {
                    int i13 = create[i12];
                    int[] iArr = this.val$table;
                    create[i12] = i13 ^ (iArr[i9 + i12] & i11);
                    create2[i12] = create2[i12] ^ (iArr[(i9 + 8) + i12] & i11);
                }
                i9 += 16;
            }
            return createPoint(create, create2);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public org.bouncycastle.math.ec.i lookupVar(int i8) {
            int[] create = b7.h.create();
            int[] create2 = b7.h.create();
            int i9 = i8 * 16;
            for (int i10 = 0; i10 < 8; i10++) {
                int[] iArr = this.val$table;
                create[i10] = iArr[i9 + i10];
                create2[i10] = iArr[8 + i9 + i10];
            }
            return createPoint(create, create2);
        }
    }

    public i0() {
        super(f17158q);
        this.infinity = new l0(this, null, null);
        this.f17177a = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f17178b = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.e cloneCurve() {
        return new i0();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.g createCacheSafeLookupTable(org.bouncycastle.math.ec.i[] iVarArr, int i8, int i9) {
        int[] iArr = new int[i9 * 16];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            org.bouncycastle.math.ec.i iVar = iVarArr[i8 + i11];
            b7.h.copy(((k0) iVar.getRawXCoord()).f17160x, 0, iArr, i10);
            b7.h.copy(((k0) iVar.getRawYCoord()).f17160x, 0, iArr, i10 + 8);
            i10 += 16;
        }
        return new a(i9, iArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
        return new l0(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
        return new k0(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return f17158q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.i getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f17158q;
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f randomFieldElement(SecureRandom secureRandom) {
        int[] create = b7.h.create();
        j0.random(secureRandom, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public org.bouncycastle.math.ec.f randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = b7.h.create();
        j0.randomMult(secureRandom, create);
        return new k0(create);
    }

    @Override // org.bouncycastle.math.ec.e
    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected org.bouncycastle.math.ec.i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
        return new l0(this, fVar, fVar2, fVarArr);
    }
}
