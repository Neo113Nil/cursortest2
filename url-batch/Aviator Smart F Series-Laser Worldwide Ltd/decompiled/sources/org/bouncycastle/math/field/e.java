package org.bouncycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
class e implements g {
    protected final f minimalPolynomial;
    protected final b subfield;

    e(b bVar, f fVar) {
        this.subfield = bVar;
        this.minimalPolynomial = fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.subfield.equals(eVar.subfield) && this.minimalPolynomial.equals(eVar.minimalPolynomial);
    }

    @Override // org.bouncycastle.math.field.g, org.bouncycastle.math.field.a, org.bouncycastle.math.field.b
    public BigInteger getCharacteristic() {
        return this.subfield.getCharacteristic();
    }

    @Override // org.bouncycastle.math.field.g, org.bouncycastle.math.field.a
    public int getDegree() {
        return this.minimalPolynomial.getDegree();
    }

    @Override // org.bouncycastle.math.field.g, org.bouncycastle.math.field.a, org.bouncycastle.math.field.b
    public int getDimension() {
        return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
    }

    @Override // org.bouncycastle.math.field.g
    public f getMinimalPolynomial() {
        return this.minimalPolynomial;
    }

    @Override // org.bouncycastle.math.field.g, org.bouncycastle.math.field.a
    public b getSubfield() {
        return this.subfield;
    }

    public int hashCode() {
        return this.subfield.hashCode() ^ org.bouncycastle.util.e.rotateLeft(this.minimalPolynomial.hashCode(), 16);
    }
}
