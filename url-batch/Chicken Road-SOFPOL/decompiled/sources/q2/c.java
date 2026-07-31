package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f6040a;

    public c(long j7) {
        this.f6040a = j7;
        if (j7 != 16) {
            return;
        }
        l2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // q2.o
    public final float a() {
        return f1.s.d(this.f6040a);
    }

    @Override // q2.o
    public final long b() {
        return this.f6040a;
    }

    @Override // q2.o
    public final f1.p c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f1.s.c(this.f6040a, ((c) obj).f6040a);
    }

    public final int hashCode() {
        int i = f1.s.i;
        return Long.hashCode(this.f6040a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) f1.s.i(this.f6040a)) + ')';
    }
}
