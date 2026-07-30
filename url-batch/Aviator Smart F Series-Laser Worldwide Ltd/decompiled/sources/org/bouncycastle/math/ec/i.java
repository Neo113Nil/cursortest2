package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.f;

/* loaded from: classes5.dex */
public abstract class i {
    protected static final f[] EMPTY_ZS = new f[0];
    protected org.bouncycastle.math.ec.e curve;
    protected Hashtable preCompTable;

    /* renamed from: x, reason: collision with root package name */
    protected f f17192x;

    /* renamed from: y, reason: collision with root package name */
    protected f f17193y;
    protected f[] zs;

    class a implements p {
        final /* synthetic */ boolean val$checkOrder;
        final /* synthetic */ boolean val$decompressed;

        a(boolean z7, boolean z8) {
            this.val$decompressed = z7;
            this.val$checkOrder = z8;
        }

        @Override // org.bouncycastle.math.ec.p
        public q precompute(q qVar) {
            u uVar = qVar instanceof u ? (u) qVar : null;
            if (uVar == null) {
                uVar = new u();
            }
            if (uVar.hasFailed()) {
                return uVar;
            }
            if (!uVar.hasCurveEquationPassed()) {
                if (!this.val$decompressed && !i.this.satisfiesCurveEquation()) {
                    uVar.reportFailed();
                    return uVar;
                }
                uVar.reportCurveEquationPassed();
            }
            if (this.val$checkOrder && !uVar.hasOrderPassed()) {
                if (!i.this.satisfiesOrder()) {
                    uVar.reportFailed();
                    return uVar;
                }
                uVar.reportOrderPassed();
            }
            return uVar;
        }
    }

    public static abstract class b extends i {
        protected b(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        @Override // org.bouncycastle.math.ec.i
        protected boolean satisfiesCurveEquation() {
            f multiplyPlusProduct;
            f squarePlusProduct;
            org.bouncycastle.math.ec.e curve = getCurve();
            f fVar = this.f17192x;
            f a8 = curve.getA();
            f b8 = curve.getB();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 6) {
                f fVar2 = this.f17193y;
                f multiply = fVar2.add(fVar).multiply(fVar2);
                if (coordinateSystem != 0) {
                    if (coordinateSystem != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    f fVar3 = this.zs[0];
                    if (!fVar3.isOne()) {
                        f multiply2 = fVar3.multiply(fVar3.square());
                        multiply = multiply.multiply(fVar3);
                        a8 = a8.multiply(fVar3);
                        b8 = b8.multiply(multiply2);
                    }
                }
                return multiply.equals(fVar.add(a8).multiply(fVar.square()).add(b8));
            }
            f fVar4 = this.zs[0];
            boolean isOne = fVar4.isOne();
            if (fVar.isZero()) {
                f square = this.f17193y.square();
                if (!isOne) {
                    b8 = b8.multiply(fVar4.square());
                }
                return square.equals(b8);
            }
            f fVar5 = this.f17193y;
            f square2 = fVar.square();
            if (isOne) {
                multiplyPlusProduct = fVar5.square().add(fVar5).add(a8);
                squarePlusProduct = square2.square().add(b8);
            } else {
                f square3 = fVar4.square();
                f square4 = square3.square();
                multiplyPlusProduct = fVar5.add(fVar4).multiplyPlusProduct(fVar5, a8, square3);
                squarePlusProduct = square2.squarePlusProduct(b8, square4);
            }
            return multiplyPlusProduct.multiply(square2).equals(squarePlusProduct);
        }

        @Override // org.bouncycastle.math.ec.i
        protected boolean satisfiesOrder() {
            BigInteger cofactor = this.curve.getCofactor();
            if (org.bouncycastle.math.ec.d.TWO.equals(cofactor)) {
                return ((f.a) normalize().getAffineXCoord()).trace() != 0;
            }
            if (!org.bouncycastle.math.ec.d.FOUR.equals(cofactor)) {
                return super.satisfiesOrder();
            }
            i normalize = normalize();
            f affineXCoord = normalize.getAffineXCoord();
            org.bouncycastle.math.ec.e eVar = this.curve;
            f solveQuadraticEquation = ((e.b) eVar).solveQuadraticEquation(affineXCoord.add(eVar.getA()));
            if (solveQuadraticEquation == null) {
                return false;
            }
            return ((f.a) affineXCoord.multiply(solveQuadraticEquation).add(normalize.getAffineYCoord())).trace() == 0;
        }

        @Override // org.bouncycastle.math.ec.i
        public i scaleX(f fVar) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 5) {
                f rawXCoord = getRawXCoord();
                return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).divide(fVar).add(rawXCoord.multiply(fVar)), getRawZCoords());
            }
            if (curveCoordinateSystem != 6) {
                return super.scaleX(fVar);
            }
            f rawXCoord2 = getRawXCoord();
            f rawYCoord = getRawYCoord();
            f fVar2 = getRawZCoords()[0];
            f multiply = rawXCoord2.multiply(fVar.square());
            return getCurve().createRawPoint(multiply, rawYCoord.add(rawXCoord2).add(multiply), new f[]{fVar2.multiply(fVar)});
        }

        @Override // org.bouncycastle.math.ec.i
        public i scaleXNegateY(f fVar) {
            return scaleX(fVar);
        }

        @Override // org.bouncycastle.math.ec.i
        public i scaleY(f fVar) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return super.scaleY(fVar);
            }
            f rawXCoord = getRawXCoord();
            return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).multiply(fVar).add(rawXCoord), getRawZCoords());
        }

        @Override // org.bouncycastle.math.ec.i
        public i scaleYNegateX(f fVar) {
            return scaleY(fVar);
        }

        @Override // org.bouncycastle.math.ec.i
        public i subtract(i iVar) {
            return iVar.isInfinity() ? this : add(iVar.negate());
        }

        public b tau() {
            i createRawPoint;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            f fVar = this.f17192x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                createRawPoint = curve.createRawPoint(fVar.square(), this.f17193y.square(), new f[]{this.zs[0].square()});
                return (b) createRawPoint;
            }
            createRawPoint = curve.createRawPoint(fVar.square(), this.f17193y.square());
            return (b) createRawPoint;
        }

        public b tauPow(int i8) {
            i createRawPoint;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            f fVar = this.f17192x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                createRawPoint = curve.createRawPoint(fVar.squarePow(i8), this.f17193y.squarePow(i8), new f[]{this.zs[0].squarePow(i8)});
                return (b) createRawPoint;
            }
            createRawPoint = curve.createRawPoint(fVar.squarePow(i8), this.f17193y.squarePow(i8));
            return (b) createRawPoint;
        }

        protected b(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }
    }

    public static abstract class c extends i {
        protected c(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        @Override // org.bouncycastle.math.ec.i
        protected boolean getCompressionYTilde() {
            return getAffineYCoord().testBitZero();
        }

        @Override // org.bouncycastle.math.ec.i
        protected boolean satisfiesCurveEquation() {
            f fVar = this.f17192x;
            f fVar2 = this.f17193y;
            f a8 = this.curve.getA();
            f b8 = this.curve.getB();
            f square = fVar2.square();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 0) {
                if (curveCoordinateSystem == 1) {
                    f fVar3 = this.zs[0];
                    if (!fVar3.isOne()) {
                        f square2 = fVar3.square();
                        f multiply = fVar3.multiply(square2);
                        square = square.multiply(fVar3);
                        a8 = a8.multiply(square2);
                        b8 = b8.multiply(multiply);
                    }
                } else {
                    if (curveCoordinateSystem != 2 && curveCoordinateSystem != 3 && curveCoordinateSystem != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    f fVar4 = this.zs[0];
                    if (!fVar4.isOne()) {
                        f square3 = fVar4.square();
                        f square4 = square3.square();
                        f multiply2 = square3.multiply(square4);
                        a8 = a8.multiply(square4);
                        b8 = b8.multiply(multiply2);
                    }
                }
            }
            return square.equals(fVar.square().add(a8).multiply(fVar).add(b8));
        }

        @Override // org.bouncycastle.math.ec.i
        public i subtract(i iVar) {
            return iVar.isInfinity() ? this : add(iVar.negate());
        }

        protected c(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }
    }

    public static class d extends b {
        d(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        @Override // org.bouncycastle.math.ec.i
        public i add(i iVar) {
            f fVar;
            f fVar2;
            f fVar3;
            f fVar4;
            f fVar5;
            f fVar6;
            if (isInfinity()) {
                return iVar;
            }
            if (iVar.isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            f fVar7 = this.f17192x;
            f fVar8 = iVar.f17192x;
            if (coordinateSystem == 0) {
                f fVar9 = this.f17193y;
                f fVar10 = iVar.f17193y;
                f add = fVar7.add(fVar8);
                f add2 = fVar9.add(fVar10);
                if (add.isZero()) {
                    return add2.isZero() ? twice() : curve.getInfinity();
                }
                f divide = add2.divide(add);
                f add3 = divide.square().add(divide).add(add).add(curve.getA());
                return new d(curve, add3, divide.multiply(fVar7.add(add3)).add(add3).add(fVar9));
            }
            if (coordinateSystem == 1) {
                f fVar11 = this.f17193y;
                f fVar12 = this.zs[0];
                f fVar13 = iVar.f17193y;
                f fVar14 = iVar.zs[0];
                boolean isOne = fVar14.isOne();
                f add4 = fVar12.multiply(fVar13).add(isOne ? fVar11 : fVar11.multiply(fVar14));
                f add5 = fVar12.multiply(fVar8).add(isOne ? fVar7 : fVar7.multiply(fVar14));
                if (add5.isZero()) {
                    return add4.isZero() ? twice() : curve.getInfinity();
                }
                f square = add5.square();
                f multiply = square.multiply(add5);
                if (!isOne) {
                    fVar12 = fVar12.multiply(fVar14);
                }
                f add6 = add4.add(add5);
                f add7 = add6.multiplyPlusProduct(add4, square, curve.getA()).multiply(fVar12).add(multiply);
                f multiply2 = add5.multiply(add7);
                if (!isOne) {
                    square = square.multiply(fVar14);
                }
                return new d(curve, multiply2, add4.multiplyPlusProduct(fVar7, add5, fVar11).multiplyPlusProduct(square, add6, add7), new f[]{multiply.multiply(fVar12)});
            }
            if (coordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (fVar7.isZero()) {
                return fVar8.isZero() ? curve.getInfinity() : iVar.add(this);
            }
            f fVar15 = this.f17193y;
            f fVar16 = this.zs[0];
            f fVar17 = iVar.f17193y;
            f fVar18 = iVar.zs[0];
            boolean isOne2 = fVar16.isOne();
            if (isOne2) {
                fVar = fVar8;
                fVar2 = fVar17;
            } else {
                fVar = fVar8.multiply(fVar16);
                fVar2 = fVar17.multiply(fVar16);
            }
            boolean isOne3 = fVar18.isOne();
            if (isOne3) {
                fVar3 = fVar15;
            } else {
                fVar7 = fVar7.multiply(fVar18);
                fVar3 = fVar15.multiply(fVar18);
            }
            f add8 = fVar3.add(fVar2);
            f add9 = fVar7.add(fVar);
            if (add9.isZero()) {
                return add8.isZero() ? twice() : curve.getInfinity();
            }
            if (fVar8.isZero()) {
                i normalize = normalize();
                f xCoord = normalize.getXCoord();
                f yCoord = normalize.getYCoord();
                f divide2 = yCoord.add(fVar17).divide(xCoord);
                fVar4 = divide2.square().add(divide2).add(xCoord).add(curve.getA());
                if (fVar4.isZero()) {
                    return new d(curve, fVar4, curve.getB().sqrt());
                }
                fVar6 = divide2.multiply(xCoord.add(fVar4)).add(fVar4).add(yCoord).divide(fVar4).add(fVar4);
                fVar5 = curve.fromBigInteger(org.bouncycastle.math.ec.d.ONE);
            } else {
                f square2 = add9.square();
                f multiply3 = add8.multiply(fVar7);
                f multiply4 = add8.multiply(fVar);
                f multiply5 = multiply3.multiply(multiply4);
                if (multiply5.isZero()) {
                    return new d(curve, multiply5, curve.getB().sqrt());
                }
                f multiply6 = add8.multiply(square2);
                f multiply7 = !isOne3 ? multiply6.multiply(fVar18) : multiply6;
                f squarePlusProduct = multiply4.add(square2).squarePlusProduct(multiply7, fVar15.add(fVar16));
                if (!isOne2) {
                    multiply7 = multiply7.multiply(fVar16);
                }
                fVar4 = multiply5;
                fVar5 = multiply7;
                fVar6 = squarePlusProduct;
            }
            return new d(curve, fVar4, fVar6, new f[]{fVar5});
        }

        @Override // org.bouncycastle.math.ec.i
        protected i detach() {
            return new d(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // org.bouncycastle.math.ec.i
        protected boolean getCompressionYTilde() {
            f rawXCoord = getRawXCoord();
            if (rawXCoord.isZero()) {
                return false;
            }
            f rawYCoord = getRawYCoord();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            return (curveCoordinateSystem == 5 || curveCoordinateSystem == 6) ? rawYCoord.testBitZero() != rawXCoord.testBitZero() : rawYCoord.divide(rawXCoord).testBitZero();
        }

        @Override // org.bouncycastle.math.ec.i
        public f getYCoord() {
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return this.f17193y;
            }
            f fVar = this.f17192x;
            f fVar2 = this.f17193y;
            if (isInfinity() || fVar.isZero()) {
                return fVar2;
            }
            f multiply = fVar2.add(fVar).multiply(fVar);
            if (6 != curveCoordinateSystem) {
                return multiply;
            }
            f fVar3 = this.zs[0];
            return !fVar3.isOne() ? multiply.divide(fVar3) : multiply;
        }

        @Override // org.bouncycastle.math.ec.i
        public i negate() {
            if (isInfinity()) {
                return this;
            }
            f fVar = this.f17192x;
            if (fVar.isZero()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 0) {
                return new d(this.curve, fVar, this.f17193y.add(fVar));
            }
            if (curveCoordinateSystem == 1) {
                return new d(this.curve, fVar, this.f17193y.add(fVar), new f[]{this.zs[0]});
            }
            if (curveCoordinateSystem == 5) {
                return new d(this.curve, fVar, this.f17193y.addOne());
            }
            if (curveCoordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            f fVar2 = this.f17193y;
            f fVar3 = this.zs[0];
            return new d(this.curve, fVar, fVar2.add(fVar3), new f[]{fVar3});
        }

        @Override // org.bouncycastle.math.ec.i
        public i twice() {
            f add;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            f fVar = this.f17192x;
            if (fVar.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem == 0) {
                f add2 = this.f17193y.divide(fVar).add(fVar);
                f add3 = add2.square().add(add2).add(curve.getA());
                return new d(curve, add3, fVar.squarePlusProduct(add3, add2.addOne()));
            }
            if (coordinateSystem == 1) {
                f fVar2 = this.f17193y;
                f fVar3 = this.zs[0];
                boolean isOne = fVar3.isOne();
                f multiply = isOne ? fVar : fVar.multiply(fVar3);
                if (!isOne) {
                    fVar2 = fVar2.multiply(fVar3);
                }
                f square = fVar.square();
                f add4 = square.add(fVar2);
                f square2 = multiply.square();
                f add5 = add4.add(multiply);
                f multiplyPlusProduct = add5.multiplyPlusProduct(add4, square2, curve.getA());
                return new d(curve, multiply.multiply(multiplyPlusProduct), square.square().multiplyPlusProduct(multiply, multiplyPlusProduct, add5), new f[]{multiply.multiply(square2)});
            }
            if (coordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            f fVar4 = this.f17193y;
            f fVar5 = this.zs[0];
            boolean isOne2 = fVar5.isOne();
            f multiply2 = isOne2 ? fVar4 : fVar4.multiply(fVar5);
            f square3 = isOne2 ? fVar5 : fVar5.square();
            f a8 = curve.getA();
            f multiply3 = isOne2 ? a8 : a8.multiply(square3);
            f add6 = fVar4.square().add(multiply2).add(multiply3);
            if (add6.isZero()) {
                return new d(curve, add6, curve.getB().sqrt());
            }
            f square4 = add6.square();
            f multiply4 = isOne2 ? add6 : add6.multiply(square3);
            f b8 = curve.getB();
            if (b8.bitLength() < (curve.getFieldSize() >> 1)) {
                f square5 = fVar4.add(fVar).square();
                add = square5.add(add6).add(square3).multiply(square5).add(b8.isOne() ? multiply3.add(square3).square() : multiply3.squarePlusProduct(b8, square3.square())).add(square4);
                if (!a8.isZero()) {
                    if (!a8.isOne()) {
                        add = add.add(a8.addOne().multiply(multiply4));
                    }
                    return new d(curve, square4, add, new f[]{multiply4});
                }
            } else {
                if (!isOne2) {
                    fVar = fVar.multiply(fVar5);
                }
                add = fVar.squarePlusProduct(add6, multiply2).add(square4);
            }
            add = add.add(multiply4);
            return new d(curve, square4, add, new f[]{multiply4});
        }

        @Override // org.bouncycastle.math.ec.i
        public i twicePlus(i iVar) {
            if (isInfinity()) {
                return iVar;
            }
            if (iVar.isInfinity()) {
                return twice();
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            f fVar = this.f17192x;
            if (fVar.isZero()) {
                return iVar;
            }
            if (curve.getCoordinateSystem() != 6) {
                return twice().add(iVar);
            }
            f fVar2 = iVar.f17192x;
            f fVar3 = iVar.zs[0];
            if (fVar2.isZero() || !fVar3.isOne()) {
                return twice().add(iVar);
            }
            f fVar4 = this.f17193y;
            f fVar5 = this.zs[0];
            f fVar6 = iVar.f17193y;
            f square = fVar.square();
            f square2 = fVar4.square();
            f square3 = fVar5.square();
            f add = curve.getA().multiply(square3).add(square2).add(fVar4.multiply(fVar5));
            f addOne = fVar6.addOne();
            f multiplyPlusProduct = curve.getA().add(addOne).multiply(square3).add(square2).multiplyPlusProduct(add, square, square3);
            f multiply = fVar2.multiply(square3);
            f square4 = multiply.add(add).square();
            if (square4.isZero()) {
                return multiplyPlusProduct.isZero() ? iVar.twice() : curve.getInfinity();
            }
            if (multiplyPlusProduct.isZero()) {
                return new d(curve, multiplyPlusProduct, curve.getB().sqrt());
            }
            f multiply2 = multiplyPlusProduct.square().multiply(multiply);
            f multiply3 = multiplyPlusProduct.multiply(square4).multiply(square3);
            return new d(curve, multiply2, multiplyPlusProduct.add(square4).square().multiplyPlusProduct(add, addOne, multiply3), new f[]{multiply3});
        }

        d(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }
    }

    public static class e extends c {
        e(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2) {
            super(eVar, fVar, fVar2);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
        @Override // org.bouncycastle.math.ec.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i add(i iVar) {
            f square;
            f multiplyMinusProduct;
            f multiply;
            f fVar;
            if (isInfinity()) {
                return iVar;
            }
            if (iVar.isInfinity()) {
                return this;
            }
            if (this == iVar) {
                return twice();
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            f fVar2 = this.f17192x;
            f fVar3 = this.f17193y;
            f fVar4 = iVar.f17192x;
            f fVar5 = iVar.f17193y;
            if (coordinateSystem == 0) {
                f subtract = fVar4.subtract(fVar2);
                f subtract2 = fVar5.subtract(fVar3);
                if (subtract.isZero()) {
                    return subtract2.isZero() ? twice() : curve.getInfinity();
                }
                f divide = subtract2.divide(subtract);
                f subtract3 = divide.square().subtract(fVar2).subtract(fVar4);
                return new e(curve, subtract3, divide.multiply(fVar2.subtract(subtract3)).subtract(fVar3));
            }
            if (coordinateSystem == 1) {
                f fVar6 = this.zs[0];
                f fVar7 = iVar.zs[0];
                boolean isOne = fVar6.isOne();
                boolean isOne2 = fVar7.isOne();
                if (!isOne) {
                    fVar5 = fVar5.multiply(fVar6);
                }
                if (!isOne2) {
                    fVar3 = fVar3.multiply(fVar7);
                }
                f subtract4 = fVar5.subtract(fVar3);
                if (!isOne) {
                    fVar4 = fVar4.multiply(fVar6);
                }
                if (!isOne2) {
                    fVar2 = fVar2.multiply(fVar7);
                }
                f subtract5 = fVar4.subtract(fVar2);
                if (subtract5.isZero()) {
                    return subtract4.isZero() ? twice() : curve.getInfinity();
                }
                if (isOne) {
                    fVar6 = fVar7;
                } else if (!isOne2) {
                    fVar6 = fVar6.multiply(fVar7);
                }
                f square2 = subtract5.square();
                f multiply2 = square2.multiply(subtract5);
                f multiply3 = square2.multiply(fVar2);
                f subtract6 = subtract4.square().multiply(fVar6).subtract(multiply2).subtract(two(multiply3));
                return new e(curve, subtract5.multiply(subtract6), multiply3.subtract(subtract6).multiplyMinusProduct(subtract4, fVar3, multiply2), new f[]{multiply2.multiply(fVar6)});
            }
            if (coordinateSystem != 2 && coordinateSystem != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            f fVar8 = this.zs[0];
            f fVar9 = iVar.zs[0];
            boolean isOne3 = fVar8.isOne();
            if (isOne3 || !fVar8.equals(fVar9)) {
                if (!isOne3) {
                    f square3 = fVar8.square();
                    fVar4 = square3.multiply(fVar4);
                    fVar5 = square3.multiply(fVar8).multiply(fVar5);
                }
                boolean isOne4 = fVar9.isOne();
                if (!isOne4) {
                    f square4 = fVar9.square();
                    fVar2 = square4.multiply(fVar2);
                    fVar3 = square4.multiply(fVar9).multiply(fVar3);
                }
                f subtract7 = fVar2.subtract(fVar4);
                f subtract8 = fVar3.subtract(fVar5);
                if (subtract7.isZero()) {
                    return subtract8.isZero() ? twice() : curve.getInfinity();
                }
                square = subtract7.square();
                f multiply4 = square.multiply(subtract7);
                f multiply5 = square.multiply(fVar2);
                f subtract9 = subtract8.square().add(multiply4).subtract(two(multiply5));
                multiplyMinusProduct = multiply5.subtract(subtract9).multiplyMinusProduct(subtract8, multiply4, fVar3);
                f multiply6 = !isOne3 ? subtract7.multiply(fVar8) : subtract7;
                multiply = !isOne4 ? multiply6.multiply(fVar9) : multiply6;
                if (multiply == subtract7) {
                    fVar = subtract9;
                    return new e(curve, fVar, multiplyMinusProduct, coordinateSystem != 4 ? new f[]{multiply, calculateJacobianModifiedW(multiply, square)} : new f[]{multiply});
                }
                fVar = subtract9;
            } else {
                f subtract10 = fVar2.subtract(fVar4);
                f subtract11 = fVar3.subtract(fVar5);
                if (subtract10.isZero()) {
                    return subtract11.isZero() ? twice() : curve.getInfinity();
                }
                f square5 = subtract10.square();
                f multiply7 = fVar2.multiply(square5);
                f multiply8 = fVar4.multiply(square5);
                f multiply9 = multiply7.subtract(multiply8).multiply(fVar3);
                fVar = subtract11.square().subtract(multiply7).subtract(multiply8);
                multiplyMinusProduct = multiply7.subtract(fVar).multiply(subtract11).subtract(multiply9);
                multiply = subtract10.multiply(fVar8);
            }
            square = null;
            return new e(curve, fVar, multiplyMinusProduct, coordinateSystem != 4 ? new f[]{multiply, calculateJacobianModifiedW(multiply, square)} : new f[]{multiply});
        }

        protected f calculateJacobianModifiedW(f fVar, f fVar2) {
            f a8 = getCurve().getA();
            if (a8.isZero() || fVar.isOne()) {
                return a8;
            }
            if (fVar2 == null) {
                fVar2 = fVar.square();
            }
            f square = fVar2.square();
            f negate = a8.negate();
            return negate.bitLength() < a8.bitLength() ? square.multiply(negate).negate() : square.multiply(a8);
        }

        @Override // org.bouncycastle.math.ec.i
        protected i detach() {
            return new e(null, getAffineXCoord(), getAffineYCoord());
        }

        protected f doubleProductFromSquares(f fVar, f fVar2, f fVar3, f fVar4) {
            return fVar.add(fVar2).square().subtract(fVar3).subtract(fVar4);
        }

        protected f eight(f fVar) {
            return four(two(fVar));
        }

        protected f four(f fVar) {
            return two(two(fVar));
        }

        protected f getJacobianModifiedW() {
            f[] fVarArr = this.zs;
            f fVar = fVarArr[1];
            if (fVar != null) {
                return fVar;
            }
            f calculateJacobianModifiedW = calculateJacobianModifiedW(fVarArr[0], null);
            fVarArr[1] = calculateJacobianModifiedW;
            return calculateJacobianModifiedW;
        }

        @Override // org.bouncycastle.math.ec.i
        public f getZCoord(int i8) {
            return (i8 == 1 && 4 == getCurveCoordinateSystem()) ? getJacobianModifiedW() : super.getZCoord(i8);
        }

        @Override // org.bouncycastle.math.ec.i
        public i negate() {
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            return curve.getCoordinateSystem() != 0 ? new e(curve, this.f17192x, this.f17193y.negate(), this.zs) : new e(curve, this.f17192x, this.f17193y.negate());
        }

        protected f three(f fVar) {
            return two(fVar).add(fVar);
        }

        @Override // org.bouncycastle.math.ec.i
        public i threeTimes() {
            if (isInfinity()) {
                return this;
            }
            f fVar = this.f17193y;
            if (fVar.isZero()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                return coordinateSystem != 4 ? twice().add(this) : twiceJacobianModified(false).add(this);
            }
            f fVar2 = this.f17192x;
            f two = two(fVar);
            f square = two.square();
            f add = three(fVar2.square()).add(getCurve().getA());
            f subtract = three(fVar2).multiply(square).subtract(add.square());
            if (subtract.isZero()) {
                return getCurve().getInfinity();
            }
            f invert = subtract.multiply(two).invert();
            f multiply = subtract.multiply(invert).multiply(add);
            f subtract2 = square.square().multiply(invert).subtract(multiply);
            f add2 = subtract2.subtract(multiply).multiply(multiply.add(subtract2)).add(fVar2);
            return new e(curve, add2, fVar2.subtract(add2).multiply(subtract2).subtract(fVar));
        }

        @Override // org.bouncycastle.math.ec.i
        public i timesPow2(int i8) {
            f square;
            if (i8 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i8 == 0 || isInfinity()) {
                return this;
            }
            if (i8 == 1) {
                return twice();
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            f fVar = this.f17193y;
            if (fVar.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            f a8 = curve.getA();
            f fVar2 = this.f17192x;
            f[] fVarArr = this.zs;
            f fromBigInteger = fVarArr.length < 1 ? curve.fromBigInteger(org.bouncycastle.math.ec.d.ONE) : fVarArr[0];
            if (!fromBigInteger.isOne() && coordinateSystem != 0) {
                if (coordinateSystem == 1) {
                    square = fromBigInteger.square();
                    fVar2 = fVar2.multiply(fromBigInteger);
                    fVar = fVar.multiply(square);
                } else if (coordinateSystem == 2) {
                    square = null;
                } else {
                    if (coordinateSystem != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    a8 = getJacobianModifiedW();
                }
                a8 = calculateJacobianModifiedW(fromBigInteger, square);
            }
            int i9 = 0;
            while (i9 < i8) {
                if (fVar.isZero()) {
                    return curve.getInfinity();
                }
                f three = three(fVar2.square());
                f two = two(fVar);
                f multiply = two.multiply(fVar);
                f two2 = two(fVar2.multiply(multiply));
                f two3 = two(multiply.square());
                if (!a8.isZero()) {
                    three = three.add(a8);
                    a8 = two(two3.multiply(a8));
                }
                f subtract = three.square().subtract(two(two2));
                fVar = three.multiply(two2.subtract(subtract)).subtract(two3);
                fromBigInteger = fromBigInteger.isOne() ? two : two.multiply(fromBigInteger);
                i9++;
                fVar2 = subtract;
            }
            if (coordinateSystem == 0) {
                f invert = fromBigInteger.invert();
                f square2 = invert.square();
                return new e(curve, fVar2.multiply(square2), fVar.multiply(square2.multiply(invert)));
            }
            if (coordinateSystem == 1) {
                return new e(curve, fVar2.multiply(fromBigInteger), fVar, new f[]{fromBigInteger.multiply(fromBigInteger.square())});
            }
            if (coordinateSystem == 2) {
                return new e(curve, fVar2, fVar, new f[]{fromBigInteger});
            }
            if (coordinateSystem == 4) {
                return new e(curve, fVar2, fVar, new f[]{fromBigInteger, a8});
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        @Override // org.bouncycastle.math.ec.i
        public i twice() {
            f fVar;
            f multiply;
            if (isInfinity()) {
                return this;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            f fVar2 = this.f17193y;
            if (fVar2.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            f fVar3 = this.f17192x;
            if (coordinateSystem == 0) {
                f divide = three(fVar3.square()).add(getCurve().getA()).divide(two(fVar2));
                f subtract = divide.square().subtract(two(fVar3));
                return new e(curve, subtract, divide.multiply(fVar3.subtract(subtract)).subtract(fVar2));
            }
            if (coordinateSystem == 1) {
                f fVar4 = this.zs[0];
                boolean isOne = fVar4.isOne();
                f a8 = curve.getA();
                if (!a8.isZero() && !isOne) {
                    a8 = a8.multiply(fVar4.square());
                }
                f add = a8.add(three(fVar3.square()));
                f multiply2 = isOne ? fVar2 : fVar2.multiply(fVar4);
                f square = isOne ? fVar2.square() : multiply2.multiply(fVar2);
                f four = four(fVar3.multiply(square));
                f subtract2 = add.square().subtract(two(four));
                f two = two(multiply2);
                f multiply3 = subtract2.multiply(two);
                f two2 = two(square);
                return new e(curve, multiply3, four.subtract(subtract2).multiply(add).subtract(two(two2.square())), new f[]{two(isOne ? two(two2) : two.square()).multiply(multiply2)});
            }
            if (coordinateSystem != 2) {
                if (coordinateSystem == 4) {
                    return twiceJacobianModified(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            f fVar5 = this.zs[0];
            boolean isOne2 = fVar5.isOne();
            f square2 = fVar2.square();
            f square3 = square2.square();
            f a9 = curve.getA();
            f negate = a9.negate();
            if (negate.toBigInteger().equals(BigInteger.valueOf(3L))) {
                f square4 = isOne2 ? fVar5 : fVar5.square();
                fVar = three(fVar3.add(square4).multiply(fVar3.subtract(square4)));
                multiply = square2.multiply(fVar3);
            } else {
                f three = three(fVar3.square());
                if (!isOne2) {
                    if (a9.isZero()) {
                        fVar = three;
                    } else {
                        f square5 = fVar5.square().square();
                        if (negate.bitLength() < a9.bitLength()) {
                            fVar = three.subtract(square5.multiply(negate));
                        } else {
                            a9 = square5.multiply(a9);
                        }
                    }
                    multiply = fVar3.multiply(square2);
                }
                fVar = three.add(a9);
                multiply = fVar3.multiply(square2);
            }
            f four2 = four(multiply);
            f subtract3 = fVar.square().subtract(two(four2));
            f subtract4 = four2.subtract(subtract3).multiply(fVar).subtract(eight(square3));
            f two3 = two(fVar2);
            if (!isOne2) {
                two3 = two3.multiply(fVar5);
            }
            return new e(curve, subtract3, subtract4, new f[]{two3});
        }

        protected e twiceJacobianModified(boolean z7) {
            f fVar = this.f17192x;
            f fVar2 = this.f17193y;
            f fVar3 = this.zs[0];
            f jacobianModifiedW = getJacobianModifiedW();
            f add = three(fVar.square()).add(jacobianModifiedW);
            f two = two(fVar2);
            f multiply = two.multiply(fVar2);
            f two2 = two(fVar.multiply(multiply));
            f subtract = add.square().subtract(two(two2));
            f two3 = two(multiply.square());
            f subtract2 = add.multiply(two2.subtract(subtract)).subtract(two3);
            f two4 = z7 ? two(two3.multiply(jacobianModifiedW)) : null;
            if (!fVar3.isOne()) {
                two = two.multiply(fVar3);
            }
            return new e(getCurve(), subtract, subtract2, new f[]{two, two4});
        }

        @Override // org.bouncycastle.math.ec.i
        public i twicePlus(i iVar) {
            if (this == iVar) {
                return threeTimes();
            }
            if (isInfinity()) {
                return iVar;
            }
            if (iVar.isInfinity()) {
                return twice();
            }
            f fVar = this.f17193y;
            if (fVar.isZero()) {
                return iVar;
            }
            org.bouncycastle.math.ec.e curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                return coordinateSystem != 4 ? twice().add(iVar) : twiceJacobianModified(false).add(iVar);
            }
            f fVar2 = this.f17192x;
            f fVar3 = iVar.f17192x;
            f fVar4 = iVar.f17193y;
            f subtract = fVar3.subtract(fVar2);
            f subtract2 = fVar4.subtract(fVar);
            if (subtract.isZero()) {
                return subtract2.isZero() ? threeTimes() : this;
            }
            f square = subtract.square();
            f subtract3 = square.multiply(two(fVar2).add(fVar3)).subtract(subtract2.square());
            if (subtract3.isZero()) {
                return curve.getInfinity();
            }
            f invert = subtract3.multiply(subtract).invert();
            f multiply = subtract3.multiply(invert).multiply(subtract2);
            f subtract4 = two(fVar).multiply(square).multiply(subtract).multiply(invert).subtract(multiply);
            f add = subtract4.subtract(multiply).multiply(multiply.add(subtract4)).add(fVar3);
            return new e(curve, add, fVar2.subtract(add).multiply(subtract4).subtract(fVar));
        }

        protected f two(f fVar) {
            return fVar.add(fVar);
        }

        e(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2, f[] fVarArr) {
            super(eVar, fVar, fVar2, fVarArr);
        }
    }

    protected i(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2) {
        this(eVar, fVar, fVar2, getInitialZCoords(eVar));
    }

    protected static f[] getInitialZCoords(org.bouncycastle.math.ec.e eVar) {
        int coordinateSystem = eVar == null ? 0 : eVar.getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            return EMPTY_ZS;
        }
        f fromBigInteger = eVar.fromBigInteger(org.bouncycastle.math.ec.d.ONE);
        if (coordinateSystem != 1 && coordinateSystem != 2) {
            if (coordinateSystem == 3) {
                return new f[]{fromBigInteger, fromBigInteger, fromBigInteger};
            }
            if (coordinateSystem == 4) {
                return new f[]{fromBigInteger, eVar.getA()};
            }
            if (coordinateSystem != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new f[]{fromBigInteger};
    }

    public abstract i add(i iVar);

    protected void checkNormalized() {
        if (!isNormalized()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    protected i createScaledPoint(f fVar, f fVar2) {
        return getCurve().createRawPoint(getRawXCoord().multiply(fVar), getRawYCoord().multiply(fVar2));
    }

    protected abstract i detach();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return equals((i) obj);
        }
        return false;
    }

    public f getAffineXCoord() {
        checkNormalized();
        return getXCoord();
    }

    public f getAffineYCoord() {
        checkNormalized();
        return getYCoord();
    }

    protected abstract boolean getCompressionYTilde();

    public org.bouncycastle.math.ec.e getCurve() {
        return this.curve;
    }

    protected int getCurveCoordinateSystem() {
        org.bouncycastle.math.ec.e eVar = this.curve;
        if (eVar == null) {
            return 0;
        }
        return eVar.getCoordinateSystem();
    }

    public final i getDetachedPoint() {
        return normalize().detach();
    }

    public byte[] getEncoded(boolean z7) {
        if (isInfinity()) {
            return new byte[1];
        }
        i normalize = normalize();
        byte[] encoded = normalize.getXCoord().getEncoded();
        if (z7) {
            byte[] bArr = new byte[encoded.length + 1];
            bArr[0] = (byte) (normalize.getCompressionYTilde() ? 3 : 2);
            System.arraycopy(encoded, 0, bArr, 1, encoded.length);
            return bArr;
        }
        byte[] encoded2 = normalize.getYCoord().getEncoded();
        byte[] bArr2 = new byte[encoded.length + encoded2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(encoded, 0, bArr2, 1, encoded.length);
        System.arraycopy(encoded2, 0, bArr2, encoded.length + 1, encoded2.length);
        return bArr2;
    }

    public final f getRawXCoord() {
        return this.f17192x;
    }

    public final f getRawYCoord() {
        return this.f17193y;
    }

    protected final f[] getRawZCoords() {
        return this.zs;
    }

    public f getXCoord() {
        return this.f17192x;
    }

    public f getYCoord() {
        return this.f17193y;
    }

    public f getZCoord(int i8) {
        if (i8 >= 0) {
            f[] fVarArr = this.zs;
            if (i8 < fVarArr.length) {
                return fVarArr[i8];
            }
        }
        return null;
    }

    public f[] getZCoords() {
        f[] fVarArr = this.zs;
        int length = fVarArr.length;
        if (length == 0) {
            return EMPTY_ZS;
        }
        f[] fVarArr2 = new f[length];
        System.arraycopy(fVarArr, 0, fVarArr2, 0, length);
        return fVarArr2;
    }

    public int hashCode() {
        org.bouncycastle.math.ec.e curve = getCurve();
        int i8 = curve == null ? 0 : ~curve.hashCode();
        if (isInfinity()) {
            return i8;
        }
        i normalize = normalize();
        return (i8 ^ (normalize.getXCoord().hashCode() * 17)) ^ (normalize.getYCoord().hashCode() * 257);
    }

    boolean implIsValid(boolean z7, boolean z8) {
        if (isInfinity()) {
            return true;
        }
        return !((u) getCurve().precompute(this, "bc_validity", new a(z7, z8))).hasFailed();
    }

    public boolean isInfinity() {
        if (this.f17192x != null && this.f17193y != null) {
            f[] fVarArr = this.zs;
            if (fVarArr.length <= 0 || !fVarArr[0].isZero()) {
                return false;
            }
        }
        return true;
    }

    public boolean isNormalized() {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        return curveCoordinateSystem == 0 || curveCoordinateSystem == 5 || isInfinity() || this.zs[0].isOne();
    }

    public boolean isValid() {
        return implIsValid(false, true);
    }

    boolean isValidPartial() {
        return implIsValid(false, false);
    }

    public i multiply(BigInteger bigInteger) {
        return getCurve().getMultiplier().multiply(this, bigInteger);
    }

    public abstract i negate();

    public i normalize() {
        int curveCoordinateSystem;
        if (isInfinity() || (curveCoordinateSystem = getCurveCoordinateSystem()) == 0 || curveCoordinateSystem == 5) {
            return this;
        }
        f zCoord = getZCoord(0);
        if (zCoord.isOne()) {
            return this;
        }
        if (this.curve == null) {
            throw new IllegalStateException("Detached points must be in affine coordinates");
        }
        f randomFieldElementMult = this.curve.randomFieldElementMult(org.bouncycastle.crypto.d.getSecureRandom());
        return normalize(zCoord.multiply(randomFieldElementMult).invert().multiply(randomFieldElementMult));
    }

    protected abstract boolean satisfiesCurveEquation();

    protected boolean satisfiesOrder() {
        BigInteger order;
        return org.bouncycastle.math.ec.d.ONE.equals(this.curve.getCofactor()) || (order = this.curve.getOrder()) == null || org.bouncycastle.math.ec.c.referenceMultiply(this, order).isInfinity();
    }

    public i scaleX(f fVar) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(fVar), getRawYCoord(), getRawZCoords());
    }

    public i scaleXNegateY(f fVar) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(fVar), getRawYCoord().negate(), getRawZCoords());
    }

    public i scaleY(f fVar) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord(), getRawYCoord().multiply(fVar), getRawZCoords());
    }

    public i scaleYNegateX(f fVar) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().negate(), getRawYCoord().multiply(fVar), getRawZCoords());
    }

    public abstract i subtract(i iVar);

    public i threeTimes() {
        return twicePlus(this);
    }

    public i timesPow2(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        i iVar = this;
        while (true) {
            i8--;
            if (i8 < 0) {
                return iVar;
            }
            iVar = iVar.twice();
        }
    }

    public String toString() {
        if (isInfinity()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(getRawXCoord());
        stringBuffer.append(',');
        stringBuffer.append(getRawYCoord());
        for (int i8 = 0; i8 < this.zs.length; i8++) {
            stringBuffer.append(',');
            stringBuffer.append(this.zs[i8]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public abstract i twice();

    public i twicePlus(i iVar) {
        return twice().add(iVar);
    }

    protected i(org.bouncycastle.math.ec.e eVar, f fVar, f fVar2, f[] fVarArr) {
        this.preCompTable = null;
        this.curve = eVar;
        this.f17192x = fVar;
        this.f17193y = fVar2;
        this.zs = fVarArr;
    }

    public boolean equals(i iVar) {
        i iVar2;
        if (iVar == null) {
            return false;
        }
        org.bouncycastle.math.ec.e curve = getCurve();
        org.bouncycastle.math.ec.e curve2 = iVar.getCurve();
        boolean z7 = curve == null;
        boolean z8 = curve2 == null;
        boolean isInfinity = isInfinity();
        boolean isInfinity2 = iVar.isInfinity();
        if (isInfinity || isInfinity2) {
            if (isInfinity && isInfinity2) {
                return z7 || z8 || curve.equals(curve2);
            }
            return false;
        }
        if (!z7 || !z8) {
            if (!z7) {
                if (z8) {
                    iVar2 = normalize();
                } else {
                    if (!curve.equals(curve2)) {
                        return false;
                    }
                    i[] iVarArr = {this, curve.importPoint(iVar)};
                    curve.normalizeAll(iVarArr);
                    iVar2 = iVarArr[0];
                    iVar = iVarArr[1];
                }
                return iVar2.getXCoord().equals(iVar.getXCoord()) && iVar2.getYCoord().equals(iVar.getYCoord());
            }
            iVar = iVar.normalize();
        }
        iVar2 = this;
        if (iVar2.getXCoord().equals(iVar.getXCoord())) {
            return false;
        }
    }

    i normalize(f fVar) {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        if (curveCoordinateSystem != 1) {
            if (curveCoordinateSystem == 2 || curveCoordinateSystem == 3 || curveCoordinateSystem == 4) {
                f square = fVar.square();
                return createScaledPoint(square, square.multiply(fVar));
            }
            if (curveCoordinateSystem != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return createScaledPoint(fVar, fVar);
    }
}
