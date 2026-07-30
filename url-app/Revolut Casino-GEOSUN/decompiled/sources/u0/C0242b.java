package u0;

import F0.i;
import java.io.Serializable;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242b implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Object f2998e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2999f;

    public C0242b(Object obj, Object obj2) {
        this.f2998e = obj;
        this.f2999f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0242b)) {
            return false;
        }
        C0242b c0242b = (C0242b) obj;
        return i.a(this.f2998e, c0242b.f2998e) && i.a(this.f2999f, c0242b.f2999f);
    }

    public final int hashCode() {
        Object obj = this.f2998e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2999f;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2998e + ", " + this.f2999f + ')';
    }
}
