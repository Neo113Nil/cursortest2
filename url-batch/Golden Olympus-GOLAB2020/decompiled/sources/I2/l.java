package I2;

/* loaded from: classes3.dex */
public class l extends a {
    public l(byte[] bArr, int i4) {
        super(bArr, i4);
    }

    @Override // I2.j
    void e(h hVar) {
        byte[] h4 = a.h(this.f777b, this.f778c);
        int length = h4.length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) j();
        System.arraycopy(h4, 0, bArr, 1, length);
        hVar.d(3, bArr);
    }

    @Override // I2.j
    int f() {
        return q.a(this.f777b.length + 1) + 1 + this.f777b.length + 1;
    }

    public l(byte[] bArr) {
        this(bArr, 0);
    }
}
