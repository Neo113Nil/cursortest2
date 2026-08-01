package hd;

import java.io.Serializable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4520d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4521e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4522i;

    public r(Object obj, Object obj2, Object obj3) {
        this.f4520d = obj;
        this.f4521e = obj2;
        this.f4522i = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f4520d.equals(rVar.f4520d) && this.f4521e.equals(rVar.f4521e) && this.f4522i.equals(rVar.f4522i);
    }

    public final int hashCode() {
        return this.f4522i.hashCode() + ((this.f4521e.hashCode() + (this.f4520d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.f4520d + ", " + this.f4521e + ", " + this.f4522i + ')';
    }
}
