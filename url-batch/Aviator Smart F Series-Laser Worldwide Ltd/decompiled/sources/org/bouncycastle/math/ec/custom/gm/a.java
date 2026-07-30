package org.bouncycastle.math.ec.custom.gm;

import b7.h;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.g;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class a extends e.c {
    private static final int SM2P256V1_DEFAULT_COORDS = 2;
    protected d infinity;

    /* renamed from: q, reason: collision with root package name */
    public static final BigInteger f17143q = c.Q;
    private static final f[] SM2P256V1_AFFINE_ZS = {new c(org.bouncycastle.math.ec.d.ONE)};

    /* renamed from: org.bouncycastle.math.ec.custom.gm.a$a, reason: collision with other inner class name */
    class C0392a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$len;
        final /* synthetic */ int[] val$table;

        C0392a(int i8, int[] iArr) {
            this.val$len = i8;
            this.val$table = iArr;
        }

        private i createPoint(int[] iArr, int[] iArr2) {
            return a.this.createRawPoint(new c(iArr), new c(iArr2), a.SM2P256V1_AFFINE_ZS);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public i lookup(int i8) {
            int[] create = h.create();
            int[] create2 = h.create();
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
        public i lookupVar(int i8) {
            int[] create = h.create();
            int[] create2 = h.create();
            int i9 = i8 * 16;
            for (int i10 = 0; i10 < 8; i10++) {
                int[] iArr = this.val$table;
                create[i10] = iArr[i9 + i10];
                create2[i10] = iArr[8 + i9 + i10];
            }
            return createPoint(create, create2);
        }
    }

    public a() {
        super(f17143q);
        this.infinity = new d(this, null, null);
        this.f17177a = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f17178b = fromBigInteger(new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.order = new BigInteger(1, org.bouncycastle.util.encoders.d.decodeStrict("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected e cloneCurve() {
        return new a();
    }

    @Override // org.bouncycastle.math.ec.e
    public g createCacheSafeLookupTable(i[] iVarArr, int i8, int i9) {
        int[] iArr = new int[i9 * 16];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i iVar = iVarArr[i8 + i11];
            h.copy(((c) iVar.getRawXCoord()).f17144x, 0, iArr, i10);
            h.copy(((c) iVar.getRawYCoord()).f17144x, 0, iArr, i10 + 8);
            i10 += 16;
        }
        return new C0392a(i9, iArr);
    }

    @Override // org.bouncycastle.math.ec.e
    protected i createRawPoint(f fVar, f fVar2) {
        return new d(this, fVar, fVar2);
    }

    @Override // org.bouncycastle.math.ec.e
    public f fromBigInteger(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.e
    public int getFieldSize() {
        return f17143q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.e
    public i getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f17143q;
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public f randomFieldElement(SecureRandom secureRandom) {
        int[] create = h.create();
        b.random(secureRandom, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.e.c, org.bouncycastle.math.ec.e
    public f randomFieldElementMult(SecureRandom secureRandom) {
        int[] create = h.create();
        b.randomMult(secureRandom, create);
        return new c(create);
    }

    @Override // org.bouncycastle.math.ec.e
    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 2;
    }

    @Override // org.bouncycastle.math.ec.e
    protected i createRawPoint(f fVar, f fVar2, f[] fVarArr) {
        return new d(this, fVar, fVar2, fVarArr);
    }
}
