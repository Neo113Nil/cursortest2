package org.bouncycastle.math.field;

/* loaded from: classes5.dex */
class d implements f {
    protected final int[] exponents;

    d(int[] iArr) {
        this.exponents = org.bouncycastle.util.a.clone(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return org.bouncycastle.util.a.areEqual(this.exponents, ((d) obj).exponents);
        }
        return false;
    }

    @Override // org.bouncycastle.math.field.f
    public int getDegree() {
        return this.exponents[r0.length - 1];
    }

    @Override // org.bouncycastle.math.field.f
    public int[] getExponentsPresent() {
        return org.bouncycastle.util.a.clone(this.exponents);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.exponents);
    }
}
