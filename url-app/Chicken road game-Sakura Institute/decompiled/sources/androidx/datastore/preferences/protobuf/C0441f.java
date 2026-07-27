package androidx.datastore.preferences.protobuf;

import A.AbstractC0017m;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441f extends C0442g {

    /* renamed from: k, reason: collision with root package name */
    public final int f5333k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5334l;

    public C0441f(byte[] bArr, int i2, int i4) {
        super(bArr);
        C0442g.h(i2, i2 + i4, bArr.length);
        this.f5333k = i2;
        this.f5334l = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0442g
    public final byte B(int i2) {
        return this.f5341e[this.f5333k + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0442g
    public final byte e(int i2) {
        int i4 = this.f5334l;
        if (((i4 - (i2 + 1)) | i2) >= 0) {
            return this.f5341e[this.f5333k + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0017m.g(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(r0.B.b(i2, i4, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0442g
    public final void s(byte[] bArr, int i2) {
        System.arraycopy(this.f5341e, this.f5333k, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0442g
    public final int size() {
        return this.f5334l;
    }

    @Override // androidx.datastore.preferences.protobuf.C0442g
    public final int w() {
        return this.f5333k;
    }
}
