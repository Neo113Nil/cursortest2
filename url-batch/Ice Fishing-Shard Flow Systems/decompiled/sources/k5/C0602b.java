package k5;

/* renamed from: k5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6057b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6058c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6059d;

    public C0602b(int i2, int i5, int i7, String str) {
        this.f6056a = i2;
        this.f6057b = i5;
        this.f6058c = i7;
        this.f6059d = str;
    }

    public static C0602b a(String str, int i2, int i5) {
        return new C0602b(i2, i5, C0603c.b(i2 << 3), str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0602b)) {
            return false;
        }
        C0602b c0602b = (C0602b) obj;
        return this.f6056a == c0602b.f6056a && this.f6057b == c0602b.f6057b && this.f6058c == c0602b.f6058c && this.f6059d.equals(c0602b.f6059d);
    }

    public final int hashCode() {
        return ((((((this.f6056a ^ 1000003) * 1000003) ^ this.f6057b) * 1000003) ^ this.f6058c) * 1000003) ^ this.f6059d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f6056a);
        sb.append(", tag=");
        sb.append(this.f6057b);
        sb.append(", tagSize=");
        sb.append(this.f6058c);
        sb.append(", jsonName=");
        return r4.f.f(sb, this.f6059d, "}");
    }
}
