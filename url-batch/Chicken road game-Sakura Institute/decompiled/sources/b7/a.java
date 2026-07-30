package b7;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final a f1398h = new a(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public final long f1399f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1400g;

    public a(long j8, long j9) {
        this.f1399f = j8;
        this.f1400g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1399f == aVar.f1399f && this.f1400g == aVar.f1400g;
    }

    public final int hashCode() {
        long j8 = this.f1399f ^ this.f1400g;
        return ((int) j8) ^ ((int) (j8 >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j8 = this.f1400g;
        r4.a.k(24, 6, j8, bArr);
        bArr[23] = 45;
        r4.a.k(19, 2, j8 >>> 48, bArr);
        bArr[18] = 45;
        long j9 = this.f1399f;
        r4.a.k(14, 2, j9, bArr);
        bArr[13] = 45;
        r4.a.k(9, 2, j9 >>> 16, bArr);
        bArr[8] = 45;
        r4.a.k(0, 4, j9 >>> 32, bArr);
        return new String(bArr, z6.a.f10114a);
    }
}
