package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ar extends cr {
    private static final long serialVersionUID = 1;
    public final int q;
    public final int r;

    public ar(byte[] bArr, int i, int i2) {
        super(bArr);
        er.b(i, i + i2, bArr.length);
        this.q = i;
        this.r = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.cr, defpackage.er
    public final byte a(int i) {
        int i2 = this.r;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.p[this.q + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(in1.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(q40.j("Index > length: ", i, i2, ", "));
    }

    @Override // defpackage.cr, defpackage.er
    public final void d(int i, byte[] bArr) {
        System.arraycopy(this.p, this.q, bArr, 0, i);
    }

    @Override // defpackage.cr, defpackage.er
    public final byte e(int i) {
        return this.p[this.q + i];
    }

    @Override // defpackage.cr
    public final int f() {
        return this.q;
    }

    @Override // defpackage.cr, defpackage.er
    public final int size() {
        return this.r;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = f41.b;
        } else {
            byte[] bArr2 = new byte[size];
            d(size, bArr2);
            bArr = bArr2;
        }
        return new cr(bArr);
    }
}
