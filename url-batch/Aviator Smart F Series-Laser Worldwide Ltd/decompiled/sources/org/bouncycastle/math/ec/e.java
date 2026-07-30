package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;
import org.bouncycastle.math.ec.f;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public abstract class e {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* renamed from: a, reason: collision with root package name */
    protected org.bouncycastle.math.ec.f f17177a;

    /* renamed from: b, reason: collision with root package name */
    protected org.bouncycastle.math.ec.f f17178b;
    protected BigInteger cofactor;
    protected org.bouncycastle.math.field.b field;
    protected BigInteger order;
    protected int coord = 0;
    protected org.bouncycastle.math.ec.endo.a endomorphism = null;
    protected h multiplier = null;

    class a extends org.bouncycastle.math.ec.a {
        final /* synthetic */ int val$FE_BYTES;
        final /* synthetic */ int val$len;
        final /* synthetic */ byte[] val$table;

        a(int i8, int i9, byte[] bArr) {
            this.val$len = i8;
            this.val$FE_BYTES = i9;
            this.val$table = bArr;
        }

        private i createPoint(byte[] bArr, byte[] bArr2) {
            e eVar = e.this;
            return eVar.createRawPoint(eVar.fromBigInteger(new BigInteger(1, bArr)), e.this.fromBigInteger(new BigInteger(1, bArr2)));
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public int getSize() {
            return this.val$len;
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public i lookup(int i8) {
            int i9;
            int i10 = this.val$FE_BYTES;
            byte[] bArr = new byte[i10];
            byte[] bArr2 = new byte[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < this.val$len; i12++) {
                int i13 = ((i12 ^ i8) - 1) >> 31;
                int i14 = 0;
                while (true) {
                    i9 = this.val$FE_BYTES;
                    if (i14 < i9) {
                        byte b8 = bArr[i14];
                        byte[] bArr3 = this.val$table;
                        bArr[i14] = (byte) (b8 ^ (bArr3[i11 + i14] & i13));
                        bArr2[i14] = (byte) ((bArr3[(i9 + i11) + i14] & i13) ^ bArr2[i14]);
                        i14++;
                    }
                }
                i11 += i9 * 2;
            }
            return createPoint(bArr, bArr2);
        }

        @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
        public i lookupVar(int i8) {
            int i9 = this.val$FE_BYTES;
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[i9];
            int i10 = i8 * i9 * 2;
            int i11 = 0;
            while (true) {
                int i12 = this.val$FE_BYTES;
                if (i11 >= i12) {
                    return createPoint(bArr, bArr2);
                }
                byte[] bArr3 = this.val$table;
                bArr[i11] = bArr3[i10 + i11];
                bArr2[i11] = bArr3[i12 + i10 + i11];
                i11++;
            }
        }
    }

    public static abstract class b extends e {
        private BigInteger[] si;

        protected b(int i8, int i9, int i10, int i11) {
            super(buildField(i8, i9, i10, i11));
            this.si = null;
        }

        private static org.bouncycastle.math.field.b buildField(int i8, int i9, int i10, int i11) {
            if (i9 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i10 == 0) {
                if (i11 == 0) {
                    return org.bouncycastle.math.field.c.getBinaryExtensionField(new int[]{0, i9, i8});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            }
            if (i10 <= i9) {
                throw new IllegalArgumentException("k2 must be > k1");
            }
            if (i11 > i10) {
                return org.bouncycastle.math.field.c.getBinaryExtensionField(new int[]{0, i9, i10, i11, i8});
            }
            throw new IllegalArgumentException("k3 must be > k2");
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, int i8) {
            BigInteger createRandomBigInteger;
            do {
                createRandomBigInteger = org.bouncycastle.util.b.createRandomBigInteger(i8, secureRandom);
            } while (createRandomBigInteger.signum() <= 0);
            return createRandomBigInteger;
        }

        public static BigInteger inverse(int i8, int[] iArr, BigInteger bigInteger) {
            return new o(bigInteger).modInverse(i8, iArr).toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.e
        public i createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            org.bouncycastle.math.ec.f fromBigInteger = fromBigInteger(bigInteger);
            org.bouncycastle.math.ec.f fromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!fromBigInteger.isZero()) {
                    fromBigInteger2 = fromBigInteger2.divide(fromBigInteger).add(fromBigInteger);
                } else if (!fromBigInteger2.square().equals(getB())) {
                    throw new IllegalArgumentException();
                }
            }
            return createRawPoint(fromBigInteger, fromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.e
        protected i decompressPoint(int i8, BigInteger bigInteger) {
            org.bouncycastle.math.ec.f fVar;
            org.bouncycastle.math.ec.f fromBigInteger = fromBigInteger(bigInteger);
            if (fromBigInteger.isZero()) {
                fVar = getB().sqrt();
            } else {
                org.bouncycastle.math.ec.f solveQuadraticEquation = solveQuadraticEquation(fromBigInteger.square().invert().multiply(getB()).add(getA()).add(fromBigInteger));
                if (solveQuadraticEquation != null) {
                    if (solveQuadraticEquation.testBitZero() != (i8 == 1)) {
                        solveQuadraticEquation = solveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    fVar = (coordinateSystem == 5 || coordinateSystem == 6) ? solveQuadraticEquation.add(fromBigInteger) : solveQuadraticEquation.multiply(fromBigInteger);
                } else {
                    fVar = null;
                }
            }
            if (fVar != null) {
                return createRawPoint(fromBigInteger, fVar);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        synchronized BigInteger[] getSi() {
            try {
                if (this.si == null) {
                    this.si = t.getSi(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.si;
        }

        public boolean isKoblitz() {
            return this.order != null && this.cofactor != null && this.f17178b.isOne() && (this.f17177a.isZero() || this.f17177a.isOne());
        }

        @Override // org.bouncycastle.math.ec.e
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        @Override // org.bouncycastle.math.ec.e
        public org.bouncycastle.math.ec.f randomFieldElement(SecureRandom secureRandom) {
            return fromBigInteger(org.bouncycastle.util.b.createRandomBigInteger(getFieldSize(), secureRandom));
        }

        @Override // org.bouncycastle.math.ec.e
        public org.bouncycastle.math.ec.f randomFieldElementMult(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)));
        }

        protected org.bouncycastle.math.ec.f solveQuadraticEquation(org.bouncycastle.math.ec.f fVar) {
            org.bouncycastle.math.ec.f fVar2;
            f.a aVar = (f.a) fVar;
            boolean hasFastTrace = aVar.hasFastTrace();
            if (hasFastTrace && aVar.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                org.bouncycastle.math.ec.f halfTrace = aVar.halfTrace();
                if (hasFastTrace || halfTrace.square().add(halfTrace).add(fVar).isZero()) {
                    return halfTrace;
                }
                return null;
            }
            if (fVar.isZero()) {
                return fVar;
            }
            org.bouncycastle.math.ec.f fromBigInteger = fromBigInteger(org.bouncycastle.math.ec.d.ZERO);
            Random random = new Random();
            do {
                org.bouncycastle.math.ec.f fromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                org.bouncycastle.math.ec.f fVar3 = fVar;
                fVar2 = fromBigInteger;
                for (int i8 = 1; i8 < fieldSize; i8++) {
                    org.bouncycastle.math.ec.f square = fVar3.square();
                    fVar2 = fVar2.square().add(square.multiply(fromBigInteger2));
                    fVar3 = square.add(fVar);
                }
                if (!fVar3.isZero()) {
                    return null;
                }
            } while (fVar2.square().add(fVar2).isZero());
            return fVar2;
        }
    }

    public static abstract class c extends e {
        protected c(BigInteger bigInteger) {
            super(org.bouncycastle.math.field.c.getPrimeField(bigInteger));
        }

        private static BigInteger implRandomFieldElement(SecureRandom secureRandom, BigInteger bigInteger) {
            BigInteger createRandomBigInteger;
            do {
                createRandomBigInteger = org.bouncycastle.util.b.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
            } while (createRandomBigInteger.compareTo(bigInteger) >= 0);
            return createRandomBigInteger;
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger createRandomBigInteger = org.bouncycastle.util.b.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
                if (createRandomBigInteger.signum() > 0 && createRandomBigInteger.compareTo(bigInteger) < 0) {
                    return createRandomBigInteger;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.e
        protected i decompressPoint(int i8, BigInteger bigInteger) {
            org.bouncycastle.math.ec.f fromBigInteger = fromBigInteger(bigInteger);
            org.bouncycastle.math.ec.f sqrt = fromBigInteger.square().add(this.f17177a).multiply(fromBigInteger).add(this.f17178b).sqrt();
            if (sqrt == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (sqrt.testBitZero() != (i8 == 1)) {
                sqrt = sqrt.negate();
            }
            return createRawPoint(fromBigInteger, sqrt);
        }

        @Override // org.bouncycastle.math.ec.e
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }

        @Override // org.bouncycastle.math.ec.e
        public org.bouncycastle.math.ec.f randomFieldElement(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElement(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElement(secureRandom, characteristic)));
        }

        @Override // org.bouncycastle.math.ec.e
        public org.bouncycastle.math.ec.f randomFieldElementMult(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)));
        }
    }

    public class d {
        protected int coord;
        protected org.bouncycastle.math.ec.endo.a endomorphism;
        protected h multiplier;

        d(int i8, org.bouncycastle.math.ec.endo.a aVar, h hVar) {
            this.coord = i8;
            this.endomorphism = aVar;
            this.multiplier = hVar;
        }

        public e create() {
            if (!e.this.supportsCoordinateSystem(this.coord)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            e cloneCurve = e.this.cloneCurve();
            if (cloneCurve == e.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (cloneCurve) {
                cloneCurve.coord = this.coord;
                cloneCurve.endomorphism = this.endomorphism;
                cloneCurve.multiplier = this.multiplier;
            }
            return cloneCurve;
        }

        public d setCoordinateSystem(int i8) {
            this.coord = i8;
            return this;
        }

        public d setEndomorphism(org.bouncycastle.math.ec.endo.a aVar) {
            this.endomorphism = aVar;
            return this;
        }

        public d setMultiplier(h hVar) {
            this.multiplier = hVar;
            return this;
        }
    }

    /* renamed from: org.bouncycastle.math.ec.e$e, reason: collision with other inner class name */
    public static class C0394e extends b {
        private static final int F2M_DEFAULT_COORDS = 6;
        private i.d infinity;

        /* renamed from: k1, reason: collision with root package name */
        private int f17179k1;

        /* renamed from: k2, reason: collision with root package name */
        private int f17180k2;

        /* renamed from: k3, reason: collision with root package name */
        private int f17181k3;

        /* renamed from: m, reason: collision with root package name */
        private int f17182m;

        /* renamed from: org.bouncycastle.math.ec.e$e$a */
        class a extends org.bouncycastle.math.ec.a {
            final /* synthetic */ int val$FE_LONGS;
            final /* synthetic */ int[] val$ks;
            final /* synthetic */ int val$len;
            final /* synthetic */ long[] val$table;

            a(int i8, int i9, long[] jArr, int[] iArr) {
                this.val$len = i8;
                this.val$FE_LONGS = i9;
                this.val$table = jArr;
                this.val$ks = iArr;
            }

            private i createPoint(long[] jArr, long[] jArr2) {
                return C0394e.this.createRawPoint(new f.c(C0394e.this.f17182m, this.val$ks, new o(jArr)), new f.c(C0394e.this.f17182m, this.val$ks, new o(jArr2)));
            }

            @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
            public int getSize() {
                return this.val$len;
            }

            @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
            public i lookup(int i8) {
                int i9;
                long[] create64 = b7.n.create64(this.val$FE_LONGS);
                long[] create642 = b7.n.create64(this.val$FE_LONGS);
                int i10 = 0;
                for (int i11 = 0; i11 < this.val$len; i11++) {
                    long j8 = ((i11 ^ i8) - 1) >> 31;
                    int i12 = 0;
                    while (true) {
                        i9 = this.val$FE_LONGS;
                        if (i12 < i9) {
                            long j9 = create64[i12];
                            long[] jArr = this.val$table;
                            create64[i12] = j9 ^ (jArr[i10 + i12] & j8);
                            create642[i12] = create642[i12] ^ (jArr[(i9 + i10) + i12] & j8);
                            i12++;
                        }
                    }
                    i10 += i9 * 2;
                }
                return createPoint(create64, create642);
            }

            @Override // org.bouncycastle.math.ec.a, org.bouncycastle.math.ec.g
            public i lookupVar(int i8) {
                long[] create64 = b7.n.create64(this.val$FE_LONGS);
                long[] create642 = b7.n.create64(this.val$FE_LONGS);
                int i9 = i8 * this.val$FE_LONGS * 2;
                int i10 = 0;
                while (true) {
                    int i11 = this.val$FE_LONGS;
                    if (i10 >= i11) {
                        return createPoint(create64, create642);
                    }
                    long[] jArr = this.val$table;
                    create64[i10] = jArr[i9 + i10];
                    create642[i10] = jArr[i11 + i9 + i10];
                    i10++;
                }
            }
        }

        public C0394e(int i8, int i9, int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i8, i9, i10, i11, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // org.bouncycastle.math.ec.e
        protected e cloneCurve() {
            return new C0394e(this.f17182m, this.f17179k1, this.f17180k2, this.f17181k3, this.f17177a, this.f17178b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.e
        public g createCacheSafeLookupTable(i[] iVarArr, int i8, int i9) {
            int i10 = (this.f17182m + 63) >>> 6;
            int[] iArr = isTrinomial() ? new int[]{this.f17179k1} : new int[]{this.f17179k1, this.f17180k2, this.f17181k3};
            long[] jArr = new long[i9 * i10 * 2];
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                i iVar = iVarArr[i8 + i12];
                ((f.c) iVar.getRawXCoord()).f17188x.copyTo(jArr, i11);
                int i13 = i11 + i10;
                ((f.c) iVar.getRawYCoord()).f17188x.copyTo(jArr, i13);
                i11 = i13 + i10;
            }
            return new a(i9, i10, jArr, iArr);
        }

        @Override // org.bouncycastle.math.ec.e
        protected h createDefaultMultiplier() {
            return isKoblitz() ? new y() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.e
        protected i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
            return new i.d(this, fVar, fVar2);
        }

        @Override // org.bouncycastle.math.ec.e
        public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
            return new f.c(this.f17182m, this.f17179k1, this.f17180k2, this.f17181k3, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.e
        public int getFieldSize() {
            return this.f17182m;
        }

        @Override // org.bouncycastle.math.ec.e
        public i getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f17179k1;
        }

        public int getK2() {
            return this.f17180k2;
        }

        public int getK3() {
            return this.f17181k3;
        }

        public int getM() {
            return this.f17182m;
        }

        public boolean isTrinomial() {
            return this.f17180k2 == 0 && this.f17181k3 == 0;
        }

        @Override // org.bouncycastle.math.ec.e
        public boolean supportsCoordinateSystem(int i8) {
            return i8 == 0 || i8 == 1 || i8 == 6;
        }

        public C0394e(int i8, int i9, int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i8, i9, i10, i11);
            this.f17182m = i8;
            this.f17179k1 = i9;
            this.f17180k2 = i10;
            this.f17181k3 = i11;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new i.d(this, null, null);
            this.f17177a = fromBigInteger(bigInteger);
            this.f17178b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.bouncycastle.math.ec.e
        protected i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
            return new i.d(this, fVar, fVar2, fVarArr);
        }

        protected C0394e(int i8, int i9, int i10, int i11, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i8, i9, i10, i11);
            this.f17182m = i8;
            this.f17179k1 = i9;
            this.f17180k2 = i10;
            this.f17181k3 = i11;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new i.d(this, null, null);
            this.f17177a = fVar;
            this.f17178b = fVar2;
            this.coord = 6;
        }

        public C0394e(int i8, int i9, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i8, i9, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C0394e(int i8, int i9, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i8, i9, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class f extends c {
        private static final int FP_DEFAULT_COORDS = 4;
        i.e infinity;

        /* renamed from: q, reason: collision with root package name */
        BigInteger f17183q;

        /* renamed from: r, reason: collision with root package name */
        BigInteger f17184r;

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.bouncycastle.math.ec.e
        protected e cloneCurve() {
            return new f(this.f17183q, this.f17184r, this.f17177a, this.f17178b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.e
        protected i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2) {
            return new i.e(this, fVar, fVar2);
        }

        @Override // org.bouncycastle.math.ec.e
        public org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger) {
            return new f.d(this.f17183q, this.f17184r, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.e
        public int getFieldSize() {
            return this.f17183q.bitLength();
        }

        @Override // org.bouncycastle.math.ec.e
        public i getInfinity() {
            return this.infinity;
        }

        public BigInteger getQ() {
            return this.f17183q;
        }

        @Override // org.bouncycastle.math.ec.e
        public i importPoint(i iVar) {
            int coordinateSystem;
            return (this == iVar.getCurve() || getCoordinateSystem() != 2 || iVar.isInfinity() || !((coordinateSystem = iVar.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(iVar) : new i.e(this, fromBigInteger(iVar.f17192x.toBigInteger()), fromBigInteger(iVar.f17193y.toBigInteger()), new org.bouncycastle.math.ec.f[]{fromBigInteger(iVar.zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.e
        public boolean supportsCoordinateSystem(int i8) {
            return i8 == 0 || i8 == 1 || i8 == 2 || i8 == 4;
        }

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f17183q = bigInteger;
            this.f17184r = f.d.calculateResidue(bigInteger);
            this.infinity = new i.e(this, null, null);
            this.f17177a = fromBigInteger(bigInteger2);
            this.f17178b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        @Override // org.bouncycastle.math.ec.e
        protected i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr) {
            return new i.e(this, fVar, fVar2, fVarArr);
        }

        protected f(BigInteger bigInteger, BigInteger bigInteger2, org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f17183q = bigInteger;
            this.f17184r = bigInteger2;
            this.infinity = new i.e(this, null, null);
            this.f17177a = fVar;
            this.f17178b = fVar2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    protected e(org.bouncycastle.math.field.b bVar) {
        this.field = bVar;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    protected void checkPoint(i iVar) {
        if (iVar == null || this != iVar.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    protected void checkPoints(i[] iVarArr) {
        checkPoints(iVarArr, 0, iVarArr.length);
    }

    protected abstract e cloneCurve();

    public synchronized d configure() {
        return new d(this.coord, this.endomorphism, this.multiplier);
    }

    public g createCacheSafeLookupTable(i[] iVarArr, int i8, int i9) {
        int fieldSize = (getFieldSize() + 7) >>> 3;
        byte[] bArr = new byte[i9 * fieldSize * 2];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i iVar = iVarArr[i8 + i11];
            byte[] byteArray = iVar.getRawXCoord().toBigInteger().toByteArray();
            byte[] byteArray2 = iVar.getRawYCoord().toBigInteger().toByteArray();
            int i12 = 1;
            int i13 = byteArray.length > fieldSize ? 1 : 0;
            int length = byteArray.length - i13;
            if (byteArray2.length <= fieldSize) {
                i12 = 0;
            }
            int length2 = byteArray2.length - i12;
            int i14 = i10 + fieldSize;
            System.arraycopy(byteArray, i13, bArr, i14 - length, length);
            i10 = i14 + fieldSize;
            System.arraycopy(byteArray2, i12, bArr, i10 - length2, length2);
        }
        return new a(i9, fieldSize, bArr);
    }

    protected h createDefaultMultiplier() {
        org.bouncycastle.math.ec.endo.a aVar = this.endomorphism;
        return aVar instanceof org.bouncycastle.math.ec.endo.d ? new n(this, (org.bouncycastle.math.ec.endo.d) aVar) : new v();
    }

    public i createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    protected abstract i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2);

    protected abstract i createRawPoint(org.bouncycastle.math.ec.f fVar, org.bouncycastle.math.ec.f fVar2, org.bouncycastle.math.ec.f[] fVarArr);

    public i decodePoint(byte[] bArr) {
        i infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b8 = bArr[0];
        if (b8 != 0) {
            if (b8 == 2 || b8 == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = decompressPoint(b8 & 1, org.bouncycastle.util.b.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.implIsValid(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b8 != 4) {
                if (b8 != 6 && b8 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b8, 16));
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger fromUnsignedByteArray = org.bouncycastle.util.b.fromUnsignedByteArray(bArr, 1, fieldSize);
                BigInteger fromUnsignedByteArray2 = org.bouncycastle.util.b.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                if (fromUnsignedByteArray2.testBit(0) != (b8 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                infinity = validatePoint(fromUnsignedByteArray, fromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                infinity = validatePoint(org.bouncycastle.util.b.fromUnsignedByteArray(bArr, 1, fieldSize), org.bouncycastle.util.b.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            infinity = getInfinity();
        }
        if (b8 == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    protected abstract i decompressPoint(int i8, BigInteger bigInteger);

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof e) && equals((e) obj));
    }

    public abstract org.bouncycastle.math.ec.f fromBigInteger(BigInteger bigInteger);

    public org.bouncycastle.math.ec.f getA() {
        return this.f17177a;
    }

    public org.bouncycastle.math.ec.f getB() {
        return this.f17178b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public org.bouncycastle.math.ec.endo.a getEndomorphism() {
        return this.endomorphism;
    }

    public org.bouncycastle.math.field.b getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract i getInfinity();

    public h getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public q getPreCompInfo(i iVar, String str) {
        Hashtable hashtable;
        q qVar;
        checkPoint(iVar);
        synchronized (iVar) {
            hashtable = iVar.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            qVar = (q) hashtable.get(str);
        }
        return qVar;
    }

    public int hashCode() {
        return (getField().hashCode() ^ org.bouncycastle.util.e.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ org.bouncycastle.util.e.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public i importPoint(i iVar) {
        if (this == iVar.getCurve()) {
            return iVar;
        }
        if (iVar.isInfinity()) {
            return getInfinity();
        }
        i normalize = iVar.normalize();
        return createPoint(normalize.getXCoord().toBigInteger(), normalize.getYCoord().toBigInteger());
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(i[] iVarArr) {
        normalizeAll(iVarArr, 0, iVarArr.length, null);
    }

    public q precompute(i iVar, String str, p pVar) {
        Hashtable hashtable;
        q precompute;
        checkPoint(iVar);
        synchronized (iVar) {
            try {
                hashtable = iVar.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    iVar.preCompTable = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                q qVar = (q) hashtable.get(str);
                precompute = pVar.precompute(qVar);
                if (precompute != qVar) {
                    hashtable.put(str, precompute);
                }
            } finally {
            }
        }
        return precompute;
    }

    public abstract org.bouncycastle.math.ec.f randomFieldElement(SecureRandom secureRandom);

    public abstract org.bouncycastle.math.ec.f randomFieldElementMult(SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i8) {
        return i8 == 0;
    }

    public i validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        i createPoint = createPoint(bigInteger, bigInteger2);
        if (createPoint.isValid()) {
            return createPoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    protected void checkPoints(i[] iVarArr, int i8, int i9) {
        if (iVarArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i8 < 0 || i9 < 0 || i8 > iVarArr.length - i9) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i10 = 0; i10 < i9; i10++) {
            i iVar = iVarArr[i8 + i10];
            if (iVar != null && this != iVar.getCurve()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public boolean equals(e eVar) {
        return this == eVar || (eVar != null && getField().equals(eVar.getField()) && getA().toBigInteger().equals(eVar.getA().toBigInteger()) && getB().toBigInteger().equals(eVar.getB().toBigInteger()));
    }

    public void normalizeAll(i[] iVarArr, int i8, int i9, org.bouncycastle.math.ec.f fVar) {
        checkPoints(iVarArr, i8, i9);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (fVar != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        org.bouncycastle.math.ec.f[] fVarArr = new org.bouncycastle.math.ec.f[i9];
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i8 + i11;
            i iVar = iVarArr[i12];
            if (iVar != null && (fVar != null || !iVar.isNormalized())) {
                fVarArr[i10] = iVar.getZCoord(0);
                iArr[i10] = i12;
                i10++;
            }
        }
        if (i10 == 0) {
            return;
        }
        org.bouncycastle.math.ec.c.montgomeryTrick(fVarArr, 0, i10, fVar);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = iArr[i13];
            iVarArr[i14] = iVarArr[i14].normalize(fVarArr[i13]);
        }
    }
}
