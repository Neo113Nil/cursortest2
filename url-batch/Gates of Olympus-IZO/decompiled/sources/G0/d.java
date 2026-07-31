package G0;

import B0.B;
import B0.C0007d;
import H2.AbstractC0080b;
import R.o;
import Z1.i;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C0007d f1533a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1534b;

    /* renamed from: c, reason: collision with root package name */
    public final B f1535c;

    static {
        C2.c cVar = o.f3164a;
    }

    public d(C0007d c0007d, long j3, B b2) {
        B b3;
        this.f1533a = c0007d;
        String str = c0007d.f251a;
        int length = str.length();
        int i3 = B.f232c;
        int i4 = (int) (j3 >> 32);
        int r3 = AbstractC0381e.r(i4, 0, length);
        int i5 = (int) (j3 & 4294967295L);
        int r4 = AbstractC0381e.r(i5, 0, length);
        this.f1534b = (r3 == i4 && r4 == i5) ? j3 : I2.d.i(r3, r4);
        if (b2 != null) {
            int length2 = str.length();
            long j4 = b2.f233a;
            int i6 = (int) (j4 >> 32);
            int r5 = AbstractC0381e.r(i6, 0, length2);
            int i7 = (int) (j4 & 4294967295L);
            int r6 = AbstractC0381e.r(i7, 0, length2);
            b3 = new B((r5 == i6 && r6 == i7) ? j4 : I2.d.i(r5, r6));
        } else {
            b3 = null;
        }
        this.f1535c = b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        long j3 = dVar.f1534b;
        int i3 = B.f232c;
        return this.f1534b == j3 && i.a(this.f1535c, dVar.f1535c) && i.a(this.f1533a, dVar.f1533a);
    }

    public final int hashCode() {
        int hashCode = this.f1533a.hashCode() * 31;
        int i3 = B.f232c;
        int d3 = AbstractC0080b.d(hashCode, 31, this.f1534b);
        B b2 = this.f1535c;
        return d3 + (b2 != null ? Long.hashCode(b2.f233a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f1533a) + "', selection=" + ((Object) B.a(this.f1534b)) + ", composition=" + this.f1535c + ')';
    }
}
