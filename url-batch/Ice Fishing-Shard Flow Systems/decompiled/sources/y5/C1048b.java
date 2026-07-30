package y5;

/* renamed from: y5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048b {

    /* renamed from: b, reason: collision with root package name */
    public static final C1048b f8665b = new C1048b(Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final int f8666a;

    public C1048b(int i2) {
        this.f8666a = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1048b)) {
            return false;
        }
        C1048b c1048b = (C1048b) obj;
        c1048b.getClass();
        return this.f8666a == c1048b.f8666a;
    }

    public final int hashCode() {
        return (-593379575) ^ this.f8666a;
    }

    public final String toString() {
        return "LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength=" + this.f8666a + "}";
    }
}
