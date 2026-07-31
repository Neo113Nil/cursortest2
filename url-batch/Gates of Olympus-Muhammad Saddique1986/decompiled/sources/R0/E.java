package R0;

import I.C0186z;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final int f4055a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4056b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4057c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4058d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4059e;

    public E(int i3, boolean z3) {
        this((i3 & 1) != 0 ? false : z3, true, true, 1, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return this.f4055a == e3.f4055a && this.f4056b == e3.f4056b && this.f4057c == e3.f4057c && this.f4058d == e3.f4058d && this.f4059e == e3.f4059e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + A.k.e(A.k.e(A.k.e(A.k.e(this.f4055a * 31, 31, this.f4056b), 31, this.f4057c), 31, this.f4058d), 31, this.f4059e);
    }

    public E(boolean z3, boolean z4, boolean z5, int i3, boolean z6, boolean z7) {
        C0186z c0186z = n.f4107a;
        int i4 = !z3 ? 262152 : 262144;
        i4 = i3 == 2 ? i4 | 8192 : i4;
        i4 = z7 ? i4 : i4 | 512;
        boolean z8 = i3 == 1;
        this.f4055a = i4;
        this.f4056b = z8;
        this.f4057c = z4;
        this.f4058d = z5;
        this.f4059e = z6;
    }
}
