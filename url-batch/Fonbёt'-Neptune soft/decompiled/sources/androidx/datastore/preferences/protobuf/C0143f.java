package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143f extends C0144g {

    /* renamed from: i, reason: collision with root package name */
    public final int f1683i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1684j;

    public C0143f(byte[] bArr, int i2, int i3) {
        super(bArr);
        C0144g.b(i2, i2 + i3, bArr.length);
        this.f1683i = i2;
        this.f1684j = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0144g
    public final byte a(int i2) {
        int i3 = this.f1684j;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f1688f[this.f1683i + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0144g
    public final void d(byte[] bArr, int i2) {
        System.arraycopy(this.f1688f, this.f1683i, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0144g
    public final int e() {
        return this.f1683i;
    }

    @Override // androidx.datastore.preferences.protobuf.C0144g
    public final byte f(int i2) {
        return this.f1688f[this.f1683i + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0144g
    public final int size() {
        return this.f1684j;
    }
}
