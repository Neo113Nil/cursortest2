package androidx.datastore.preferences.protobuf;

import E1.AbstractC0033i;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139f extends C0140g {

    /* renamed from: e, reason: collision with root package name */
    public final int f2293e;
    public final int f;

    public C0139f(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0140g.c(i3, i3 + i4, bArr.length);
        this.f2293e = i3;
        this.f = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0140g
    public final byte b(int i3) {
        int i4 = this.f;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2297b[this.f2293e + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0033i.h(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0033i.g(i3, i4, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0140g
    public final void e(int i3, byte[] bArr) {
        System.arraycopy(this.f2297b, this.f2293e, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0140g
    public final int f() {
        return this.f2293e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0140g
    public final byte g(int i3) {
        return this.f2297b[this.f2293e + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0140g
    public final int size() {
        return this.f;
    }
}
