package org.bouncycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes5.dex */
class h implements b {
    protected final BigInteger characteristic;

    h(BigInteger bigInteger) {
        this.characteristic = bigInteger;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.characteristic.equals(((h) obj).characteristic);
        }
        return false;
    }

    @Override // org.bouncycastle.math.field.b
    public BigInteger getCharacteristic() {
        return this.characteristic;
    }

    @Override // org.bouncycastle.math.field.b
    public int getDimension() {
        return 1;
    }

    public int hashCode() {
        return this.characteristic.hashCode();
    }
}
