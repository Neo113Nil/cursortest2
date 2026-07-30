package k5;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601a {

    /* renamed from: a, reason: collision with root package name */
    public final int f6054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6055b;

    public C0601a(int i2, String str) {
        this.f6054a = i2;
        this.f6055b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0601a)) {
            return false;
        }
        C0601a c0601a = (C0601a) obj;
        return this.f6054a == c0601a.f6054a && this.f6055b.equals(c0601a.f6055b);
    }

    public final int hashCode() {
        return ((this.f6054a ^ 1000003) * 1000003) ^ this.f6055b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoEnumInfo{enumNumber=");
        sb.append(this.f6054a);
        sb.append(", jsonName=");
        return r4.f.f(sb, this.f6055b, "}");
    }
}
