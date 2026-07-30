package x;

/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: c, reason: collision with root package name */
    public int f17314c;

    public i(byte[] bArr, int i8) {
        this.f17282a = bArr;
        this.f17283b = 0;
        this.f17314c = i8;
    }

    public boolean a(int i8) {
        return i8 <= this.f17314c - this.f17283b;
    }

    public byte b() {
        if (!a(1)) {
            return (byte) -1;
        }
        byte a8 = d.a(this.f17282a, this.f17283b);
        this.f17283b++;
        return a8;
    }

    @Override // x.e
    public /* bridge */ /* synthetic */ byte[] a() {
        return super.a();
    }

    public boolean a(byte[] bArr, int i8) {
        if (bArr != null && i8 > 0) {
            try {
                System.arraycopy(this.f17282a, this.f17283b, bArr, 0, i8);
                this.f17283b += i8;
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    public boolean b(int i8) {
        if (i8 <= 0) {
            return false;
        }
        try {
            System.arraycopy(this.f17282a, this.f17283b, new byte[i8], 0, i8);
            this.f17283b += i8;
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
