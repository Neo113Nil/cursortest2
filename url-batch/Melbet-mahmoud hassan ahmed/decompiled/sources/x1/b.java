package x1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f23087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23088b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23089c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23090d;

    public b(String str, String str2, int i7, int i8) {
        this.f23087a = str;
        this.f23088b = str2;
        this.f23089c = i7;
        this.f23090d = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23089c == bVar.f23089c && this.f23090d == bVar.f23090d && l4.i.a(this.f23087a, bVar.f23087a) && l4.i.a(this.f23088b, bVar.f23088b);
    }

    public int hashCode() {
        return l4.i.b(this.f23087a, this.f23088b, Integer.valueOf(this.f23089c), Integer.valueOf(this.f23090d));
    }
}
