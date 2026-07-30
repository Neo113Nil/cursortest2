package H4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C4.e f990a;

    /* renamed from: b, reason: collision with root package name */
    public final String f991b;

    /* renamed from: c, reason: collision with root package name */
    public final int f992c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f993d;

    public e(C4.e eVar, String str) {
        this.f990a = eVar;
        this.f991b = str;
        this.f992c = ((eVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static e a(C4.e eVar, String str) {
        if (str == null) {
            str = "";
        }
        return new e(eVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f990a.equals(eVar.f990a) && this.f991b.equals(eVar.f991b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f992c;
    }

    public final String toString() {
        return this.f991b;
    }
}
