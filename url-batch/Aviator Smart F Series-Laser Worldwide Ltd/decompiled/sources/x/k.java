package x;

/* loaded from: classes.dex */
public class k extends e {

    /* renamed from: c, reason: collision with root package name */
    public int f17319c;

    /* renamed from: d, reason: collision with root package name */
    public int f17320d;

    public k(int i8) {
        this.f17319c = 0;
        this.f17320d = i8;
        this.f17282a = new byte[i8];
        this.f17283b = 0;
        this.f17319c = i8;
    }

    @Override // x.e
    public /* bridge */ /* synthetic */ byte[] a() {
        return super.a();
    }

    public boolean b(int i8) {
        if (!a(4) || !d.a(this.f17282a, this.f17283b, i8)) {
            return false;
        }
        this.f17283b += 4;
        return true;
    }

    public boolean a(int i8) {
        int i9 = this.f17319c;
        int i10 = this.f17283b;
        if (i8 <= i9 - i10) {
            return true;
        }
        int i11 = (i8 - i9) + i10;
        byte[] bArr = this.f17282a;
        int i12 = i9 + i11;
        this.f17319c = i12;
        byte[] bArr2 = new byte[i12];
        this.f17282a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return true;
    }

    public boolean a(byte b8) {
        if (!a(1) || !d.a(this.f17282a, this.f17283b, b8)) {
            return false;
        }
        this.f17283b++;
        return true;
    }

    public boolean a(byte[] bArr, int i8) {
        if (bArr == null || !a(i8)) {
            return false;
        }
        try {
            System.arraycopy(bArr, 0, this.f17282a, this.f17283b, i8);
            this.f17283b += i8;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean a(byte[] bArr) {
        if (!a(bArr.length)) {
            return false;
        }
        for (byte b8 : bArr) {
            a(b8);
        }
        return true;
    }
}
