package b6;

import a0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1388a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1389b;

    public a(String str, String str2) {
        this.f1388a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1389b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1388a.equals(aVar.f1388a) && this.f1389b.equals(aVar.f1389b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1388a.hashCode() ^ 1000003) * 1000003) ^ this.f1389b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f1388a);
        sb.append(", version=");
        return m.m(sb, this.f1389b, "}");
    }
}
