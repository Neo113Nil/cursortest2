package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252f extends C0253g {

    /* renamed from: h, reason: collision with root package name */
    public final int f5059h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5060i;

    public C0252f(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0253g.c(i3, i3 + i4, bArr.length);
        this.f5059h = i3;
        this.f5060i = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0253g
    public final byte b(int i3) {
        int i4 = this.f5060i;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f5067e[this.f5059h + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(A.k.h("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(A.k.f(i3, i4, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0253g
    public final void i(int i3, byte[] bArr) {
        System.arraycopy(this.f5067e, this.f5059h, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0253g
    public final int j() {
        return this.f5059h;
    }

    @Override // androidx.datastore.preferences.protobuf.C0253g
    public final byte k(int i3) {
        return this.f5067e[this.f5059h + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0253g
    public final int size() {
        return this.f5060i;
    }
}
