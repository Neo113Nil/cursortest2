package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: h, reason: collision with root package name */
    public final int f680h;
    public final int i;

    public f(byte[] bArr, int i, int i8) {
        super(bArr);
        g.b(i, i + i8, bArr.length);
        this.f680h = i;
        this.i = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte a(int i) {
        int i8 = this.i;
        if (((i8 - (i + 1)) | i) >= 0) {
            return this.f685e[this.f680h + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a0.q.h("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(a0.q.i("Index > length: ", i, ", ", i8));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.f685e, this.f680h, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int f() {
        return this.f680h;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte g(int i) {
        return this.f685e[this.f680h + i];
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.i;
    }
}
