package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: s, reason: collision with root package name */
    public final int f530s;

    /* renamed from: t, reason: collision with root package name */
    public final int f531t;

    public e(byte[] bArr, int i3, int i10) {
        super(bArr);
        f.c(i3, i3 + i10, bArr.length);
        this.f530s = i3;
        this.f531t = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final byte b(int i3) {
        int i10 = this.f531t;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.f536e[this.f530s + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(v4.a.j(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i10);
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final void f(int i3, byte[] bArr) {
        System.arraycopy(this.f536e, this.f530s, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final int g() {
        return this.f530s;
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final byte h(int i3) {
        return this.f536e[this.f530s + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final int size() {
        return this.f531t;
    }
}
