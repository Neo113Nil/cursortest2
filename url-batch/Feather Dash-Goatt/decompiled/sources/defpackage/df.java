package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class df extends ff {
    public final int i;
    public final int j;

    public df(byte[] bArr, int i, int i2) {
        super(bArr);
        ff.b(i, i + i2, bArr.length);
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.ff
    public final byte a(int i) {
        int i2 = this.j;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.e[this.i + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(qy0.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    @Override // defpackage.ff
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.e, this.i, bArr, 0, i);
    }

    @Override // defpackage.ff
    public final int f() {
        return this.i;
    }

    @Override // defpackage.ff
    public final byte g(int i) {
        return this.e[this.i + i];
    }

    @Override // defpackage.ff
    public final int size() {
        return this.j;
    }
}
