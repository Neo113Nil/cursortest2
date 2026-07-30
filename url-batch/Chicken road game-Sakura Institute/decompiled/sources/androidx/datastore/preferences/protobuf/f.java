package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: j, reason: collision with root package name */
    public final int f808j;

    /* renamed from: k, reason: collision with root package name */
    public final int f809k;

    public f(byte[] bArr, int i7, int i8) {
        super(bArr);
        g.g(i7, i7 + i8, bArr.length);
        this.f808j = i7;
        this.f809k = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte a(int i7) {
        int i8 = this.f809k;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f819g[this.f808j + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(a0.m.i("Index < 0: ", i7));
        }
        throw new ArrayIndexOutOfBoundsException(r6.i.b(i7, i8, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int size() {
        return this.f809k;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final void w(int i7, byte[] bArr) {
        System.arraycopy(this.f819g, this.f808j, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final int x() {
        return this.f808j;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte y(int i7) {
        return this.f819g[this.f808j + i7];
    }
}
