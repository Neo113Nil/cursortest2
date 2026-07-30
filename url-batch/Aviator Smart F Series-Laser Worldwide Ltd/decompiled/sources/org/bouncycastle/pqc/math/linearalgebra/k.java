package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public abstract class k {
    public static final char MATRIX_TYPE_RANDOM_LT = 'L';
    public static final char MATRIX_TYPE_RANDOM_REGULAR = 'R';
    public static final char MATRIX_TYPE_RANDOM_UT = 'U';
    public static final char MATRIX_TYPE_UNIT = 'I';
    public static final char MATRIX_TYPE_ZERO = 'Z';
    protected int numColumns;
    protected int numRows;

    public abstract k computeInverse();

    public abstract byte[] getEncoded();

    public int getNumColumns() {
        return this.numColumns;
    }

    public int getNumRows() {
        return this.numRows;
    }

    public abstract boolean isZero();

    public abstract q leftMultiply(q qVar);

    public abstract k rightMultiply(k kVar);

    public abstract k rightMultiply(l lVar);

    public abstract q rightMultiply(q qVar);

    public abstract String toString();
}
