package P0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f642a;

    /* renamed from: b, reason: collision with root package name */
    public final int f643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f644c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f645e;

    public c(int i, int i2, int i3, int i4, int i5) {
        this.f642a = i;
        this.f643b = i2;
        this.f644c = i3;
        this.d = i4;
        this.f645e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f642a == cVar.f642a && this.f643b == cVar.f643b && this.f644c == cVar.f644c && this.d == cVar.d && this.f645e == cVar.f645e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f645e) + ((Integer.hashCode(this.d) + ((Integer.hashCode(this.f644c) + ((Integer.hashCode(this.f643b) + (Integer.hashCode(this.f642a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TypeTheme(bgColor=" + this.f642a + ", accentColor=" + this.f643b + ", gridColor=" + this.f644c + ", scanColor=" + this.d + ", buttonFillColor=" + this.f645e + ")";
    }
}
