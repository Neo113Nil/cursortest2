package androidx.datastore.preferences.protobuf;

import E.AbstractC0005f;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173f extends C0174g {

    /* renamed from: e, reason: collision with root package name */
    public final int f4633e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4634f;

    public C0173f(byte[] bArr, int i4, int i5) {
        super(bArr);
        C0174g.c(i4, i4 + i5, bArr.length);
        this.f4633e = i4;
        this.f4634f = i5;
    }

    @Override // androidx.datastore.preferences.protobuf.C0174g
    public final byte b(int i4) {
        int i5 = this.f4634f;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f4638b[this.f4633e + i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0005f.j(i4, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0174g
    public final void e(int i4, byte[] bArr) {
        System.arraycopy(this.f4638b, this.f4633e, bArr, 0, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.C0174g
    public final int f() {
        return this.f4633e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0174g
    public final byte g(int i4) {
        return this.f4638b[this.f4633e + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C0174g
    public final int size() {
        return this.f4634f;
    }
}
