package d9;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3696b;

    public a(String str, String str2) {
        this.f3695a = str;
        if (str2 != null) {
            this.f3696b = str2;
        } else {
            r.j("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3695a.equals(aVar.f3695a) && this.f3696b.equals(aVar.f3696b);
    }

    public final int hashCode() {
        return ((this.f3695a.hashCode() ^ 1000003) * 1000003) ^ this.f3696b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f3695a);
        sb2.append(", version=");
        return v4.a.o(sb2, this.f3696b, "}");
    }
}
