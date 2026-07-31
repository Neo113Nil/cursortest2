package J1;

import N.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1282a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1283b;

    public a(String str, String str2) {
        this.f1282a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1283b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1282a.equals(aVar.f1282a) && this.f1283b.equals(aVar.f1283b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1282a.hashCode() ^ 1000003) * 1000003) ^ this.f1283b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f1282a);
        sb.append(", version=");
        return p.b(sb, this.f1283b, "}");
    }
}
