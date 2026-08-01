package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f851b;

    /* renamed from: c, reason: collision with root package name */
    public final int f852c;

    /* renamed from: d, reason: collision with root package name */
    public final int f853d;

    public h0(int i3, int i10, int i11, int i12) {
        this.f850a = i3;
        this.f851b = i10;
        this.f852c = i11;
        this.f853d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f850a == h0Var.f850a && this.f851b == h0Var.f851b && this.f852c == h0Var.f852c && this.f853d == h0Var.f853d;
    }

    public final int hashCode() {
        return (((((this.f850a * 31) + this.f851b) * 31) + this.f852c) * 31) + this.f853d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f850a);
        sb2.append(", top=");
        sb2.append(this.f851b);
        sb2.append(", right=");
        sb2.append(this.f852c);
        sb2.append(", bottom=");
        return v4.a.m(sb2, this.f853d, ')');
    }
}
