package R4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2093b = new b(Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final int f2094a;

    public b(int i7) {
        this.f2094a = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f2094a == bVar.f2094a;
    }

    public final int hashCode() {
        return (-593379575) ^ this.f2094a;
    }

    public final String toString() {
        return "LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength=" + this.f2094a + "}";
    }
}
