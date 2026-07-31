package D0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f856b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f857c;

    public s(int i3, int i4, boolean z3) {
        this.f855a = i3;
        this.f856b = i4;
        this.f857c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f855a == sVar.f855a && this.f856b == sVar.f856b && this.f857c == sVar.f857c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f857c) + AbstractC0625j.a(this.f856b, Integer.hashCode(this.f855a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f855a + ", end=" + this.f856b + ", isRtl=" + this.f857c + ')';
    }
}
