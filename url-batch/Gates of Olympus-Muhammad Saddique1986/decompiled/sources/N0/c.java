package N0;

import b0.AbstractC0347p;
import b0.C0352v;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f3534a;

    public c(long j3) {
        this.f3534a = j3;
        if (j3 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // N0.m
    public final float a() {
        return C0352v.d(this.f3534a);
    }

    @Override // N0.m
    public final long b() {
        return this.f3534a;
    }

    @Override // N0.m
    public final AbstractC0347p c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C0352v.c(this.f3534a, ((c) obj).f3534a);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f3534a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C0352v.i(this.f3534a)) + ')';
    }
}
