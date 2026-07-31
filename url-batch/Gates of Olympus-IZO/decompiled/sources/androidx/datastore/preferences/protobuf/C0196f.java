package androidx.datastore.preferences.protobuf;

import H2.AbstractC0080b;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196f extends C0197g {

    /* renamed from: h, reason: collision with root package name */
    public final int f3858h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3859i;

    public C0196f(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0197g.c(i3, i3 + i4, bArr.length);
        this.f3858h = i3;
        this.f3859i = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0197g
    public final byte b(int i3) {
        int i4 = this.f3859i;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f3866e[this.f3858h + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0080b.h("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0080b.g(i3, i4, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0197g
    public final void i(int i3, byte[] bArr) {
        System.arraycopy(this.f3866e, this.f3858h, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0197g
    public final int j() {
        return this.f3858h;
    }

    @Override // androidx.datastore.preferences.protobuf.C0197g
    public final byte k(int i3) {
        return this.f3866e[this.f3858h + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0197g
    public final int size() {
        return this.f3859i;
    }
}
