package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public abstract class q {
    protected int length;

    public abstract q add(q qVar);

    public abstract boolean equals(Object obj);

    public abstract byte[] getEncoded();

    public final int getLength() {
        return this.length;
    }

    public abstract int hashCode();

    public abstract boolean isZero();

    public abstract q multiply(l lVar);

    public abstract String toString();
}
