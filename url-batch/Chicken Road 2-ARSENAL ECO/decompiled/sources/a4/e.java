package a4;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final V3.b f3139a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3141c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f3142d;

    public e(V3.b bVar, String str) {
        this.f3139a = bVar;
        this.f3140b = str;
        this.f3141c = ((bVar.hashCode() ^ 1000003) * 1000003) ^ str.hashCode();
    }

    public static e a(V3.b bVar, String str) {
        if (str == null) {
            str = "";
        }
        return new e(bVar, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f3139a.equals(eVar.f3139a) && this.f3140b.equals(eVar.f3140b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3141c;
    }

    public final String toString() {
        return this.f3140b;
    }
}
