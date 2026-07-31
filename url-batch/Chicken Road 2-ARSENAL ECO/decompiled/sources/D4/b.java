package D4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f512c;

    /* renamed from: d, reason: collision with root package name */
    public final String f513d;

    public b(int i7, int i8, int i9, String str) {
        this.f510a = i7;
        this.f511b = i8;
        this.f512c = i9;
        this.f513d = str;
    }

    public static b a(String str, int i7, int i8) {
        return new b(i7, i8, d.b(i7 << 3), str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f510a == bVar.f510a && this.f511b == bVar.f511b && this.f512c == bVar.f512c && this.f513d.equals(bVar.f513d);
    }

    public final int hashCode() {
        return ((((((this.f510a ^ 1000003) * 1000003) ^ this.f511b) * 1000003) ^ this.f512c) * 1000003) ^ this.f513d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f510a);
        sb.append(", tag=");
        sb.append(this.f511b);
        sb.append(", tagSize=");
        sb.append(this.f512c);
        sb.append(", jsonName=");
        return N.p.b(sb, this.f513d, "}");
    }
}
