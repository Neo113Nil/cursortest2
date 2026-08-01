package u0;

/* renamed from: u0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384w {

    /* renamed from: a, reason: collision with root package name */
    public final long f4227a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4229c;
    public final boolean d;

    public C0384w(long j2, String str, int i, boolean z2) {
        k1.e.e(str, "title");
        this.f4227a = j2;
        this.f4228b = str;
        this.f4229c = i;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0384w)) {
            return false;
        }
        C0384w c0384w = (C0384w) obj;
        return this.f4227a == c0384w.f4227a && k1.e.a(this.f4228b, c0384w.f4228b) && this.f4229c == c0384w.f4229c && this.d == c0384w.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((Integer.hashCode(this.f4229c) + ((this.f4228b.hashCode() + (Long.hashCode(this.f4227a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HabitUiModel(id=" + this.f4227a + ", title=" + this.f4228b + ", symbolIndex=" + this.f4229c + ", completed=" + this.d + ")";
    }
}
