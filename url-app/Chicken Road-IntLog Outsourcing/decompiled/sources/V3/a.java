package V3;

import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f3243a;

    public a(List list) {
        this.f3243a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        List list = this.f3243a;
        if (list != null ? !list.equals(aVar.f3243a) : aVar.f3243a != null) {
            return false;
        }
        aVar.getClass();
        return true;
    }

    public final int hashCode() {
        List list = this.f3243a;
        return ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "Advice{explicitBucketBoundaries=" + this.f3243a + ", attributes=null}";
    }
}
