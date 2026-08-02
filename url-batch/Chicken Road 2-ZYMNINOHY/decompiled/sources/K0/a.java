package K0;

import E.AbstractC0005f;
import T.B;
import T.D;
import T.F;
import W.u;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f1444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1446c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1447d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1448e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1449f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1450g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f1451h;

    public a(int i4, String str, String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f1444a = i4;
        this.f1445b = str;
        this.f1446c = str2;
        this.f1447d = i5;
        this.f1448e = i6;
        this.f1449f = i7;
        this.f1450g = i8;
        this.f1451h = bArr;
    }

    public static a d(u uVar) {
        int m4 = uVar.m();
        String n = F.n(uVar.x(uVar.m(), StandardCharsets.US_ASCII));
        String x4 = uVar.x(uVar.m(), StandardCharsets.UTF_8);
        int m5 = uVar.m();
        int m6 = uVar.m();
        int m7 = uVar.m();
        int m8 = uVar.m();
        int m9 = uVar.m();
        byte[] bArr = new byte[m9];
        uVar.k(bArr, 0, m9);
        return new a(m4, n, x4, m5, m6, m7, m8, bArr);
    }

    @Override // T.D
    public final void c(B b4) {
        b4.a(this.f1444a, this.f1451h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1444a == aVar.f1444a && this.f1445b.equals(aVar.f1445b) && this.f1446c.equals(aVar.f1446c) && this.f1447d == aVar.f1447d && this.f1448e == aVar.f1448e && this.f1449f == aVar.f1449f && this.f1450g == aVar.f1450g && Arrays.equals(this.f1451h, aVar.f1451h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1451h) + ((((((((AbstractC0005f.f(AbstractC0005f.f((527 + this.f1444a) * 31, 31, this.f1445b), 31, this.f1446c) + this.f1447d) * 31) + this.f1448e) * 31) + this.f1449f) * 31) + this.f1450g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f1445b + ", description=" + this.f1446c;
    }
}
