package l5;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f5306a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5307b;

    public s(int i7, Object obj) {
        this.f5306a = i7;
        this.f5307b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5306a == sVar.f5306a && kotlin.jvm.internal.i.a(this.f5307b, sVar.f5307b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f5306a) * 31;
        Object obj = this.f5307b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5306a + ", value=" + this.f5307b + ')';
    }
}
