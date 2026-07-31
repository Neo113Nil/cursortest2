package I2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class d extends j {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f780b;

    public d(long j4) {
        this.f780b = BigInteger.valueOf(j4).toByteArray();
    }

    @Override // I2.j
    boolean d(j jVar) {
        if (jVar instanceof d) {
            return Z2.a.a(this.f780b, ((d) jVar).f780b);
        }
        return false;
    }

    @Override // I2.j
    void e(h hVar) {
        hVar.d(2, this.f780b);
    }

    @Override // I2.j
    int f() {
        return q.a(this.f780b.length) + 1 + this.f780b.length;
    }

    public BigInteger h() {
        return new BigInteger(this.f780b);
    }

    @Override // I2.j, I2.e
    public int hashCode() {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            byte[] bArr = this.f780b;
            if (i4 == bArr.length) {
                return i5;
            }
            i5 ^= (bArr[i4] & 255) << (i4 % 4);
            i4++;
        }
    }

    public String toString() {
        return h().toString();
    }

    public d(BigInteger bigInteger) {
        this.f780b = bigInteger.toByteArray();
    }
}
