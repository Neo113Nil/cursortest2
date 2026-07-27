package L0;

import Z.AbstractC0319p;
import Z.C0323u;
import y2.y;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final long f3496a;

    public c(long j4) {
        this.f3496a = j4;
        if (j4 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // L0.n
    public final float a() {
        return C0323u.d(this.f3496a);
    }

    @Override // L0.n
    public final long b() {
        return this.f3496a;
    }

    @Override // L0.n
    public final AbstractC0319p c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C0323u.c(this.f3496a, ((c) obj).f3496a);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y.f11688e;
        return Long.hashCode(this.f3496a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0323u.i(this.f3496a)) + ')';
    }
}
