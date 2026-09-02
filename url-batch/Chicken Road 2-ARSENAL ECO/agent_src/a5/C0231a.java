package a5;

import java.util.List;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231a {

    /* renamed from: a, reason: collision with root package name */
    public final List f3146a;

    public C0231a(List list) {
        this.f3146a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0231a)) {
            return false;
        }
        C0231a c0231a = (C0231a) obj;
        List list = this.f3146a;
        if (list == null) {
            if (c0231a.f3146a != null) {
                return false;
            }
        } else if (!list.equals(c0231a.f3146a)) {
            return false;
        }
        c0231a.getClass();
        return true;
    }

    public final int hashCode() {
        List list = this.f3146a;
        return ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "Advice{explicitBucketBoundaries=" + this.f3146a + ", attributes=null}";
    }
}
