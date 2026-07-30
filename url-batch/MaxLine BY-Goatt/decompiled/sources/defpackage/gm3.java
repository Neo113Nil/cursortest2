package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gm3 extends im3 {
    public final int p;

    public gm3(int i, byte[] bArr) {
        super(bArr);
        im3.e(0, i, bArr.length);
        this.p = i;
    }

    @Override // defpackage.im3
    public final byte a(int i) {
        int i2 = this.p;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.n[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // defpackage.im3
    public final byte b(int i) {
        return this.n[i];
    }

    @Override // defpackage.im3
    public final int c() {
        return this.p;
    }
}
