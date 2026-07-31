package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094f extends C0095g {

    /* renamed from: i, reason: collision with root package name */
    public final int f1523i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1524j;

    public C0094f(byte[] bArr, int i2, int i3) {
        super(bArr);
        C0095g.b(i2, i2 + i3, bArr.length);
        this.f1523i = i2;
        this.f1524j = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0095g
    public final byte a(int i2) {
        int i3 = this.f1524j;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f1528f[this.f1523i + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(L.d.e("Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(L.d.f("Index > length: ", i2, ", ", i3));
    }

    @Override // androidx.datastore.preferences.protobuf.C0095g
    public final void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1528f, this.f1523i, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0095g
    public final int e() {
        return this.f1523i;
    }

    @Override // androidx.datastore.preferences.protobuf.C0095g
    public final byte f(int i2) {
        return this.f1528f[this.f1523i + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0095g
    public final int size() {
        return this.f1524j;
    }
}
