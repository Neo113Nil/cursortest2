package C0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f452b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f453c;

    public o(int i3, int i4, boolean z3) {
        this.f451a = i3;
        this.f452b = i4;
        this.f453c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f451a == oVar.f451a && this.f452b == oVar.f452b && this.f453c == oVar.f453c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f453c) + AbstractC0080b.b(this.f452b, Integer.hashCode(this.f451a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f451a + ", end=" + this.f452b + ", isRtl=" + this.f453c + ')';
    }
}
