package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190f extends C0191g {

    /* renamed from: m, reason: collision with root package name */
    public final int f3495m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3496n;

    public C0190f(byte[] bArr, int i2, int i5) {
        super(bArr);
        C0191g.b(i2, i2 + i5, bArr.length);
        this.f3495m = i2;
        this.f3496n = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C0191g
    public final byte a(int i2) {
        int i5 = this.f3496n;
        if (((i5 - (i2 + 1)) | i2) >= 0) {
            return this.f3501e[this.f3495m + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C4.p.g(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(C4.p.j("Index > length: ", ", ", i2, i5));
    }

    @Override // androidx.datastore.preferences.protobuf.C0191g
    public final void d(byte[] bArr, int i2) {
        System.arraycopy(this.f3501e, this.f3495m, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0191g
    public final int e() {
        return this.f3495m;
    }

    @Override // androidx.datastore.preferences.protobuf.C0191g
    public final byte f(int i2) {
        return this.f3501e[this.f3495m + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0191g
    public final int size() {
        return this.f3496n;
    }
}
