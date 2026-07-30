package R5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final String f2429d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2430e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2431i;

    public r(String str, String str2, String str3) {
        this.f2429d = str;
        this.f2430e = str2;
        this.f2431i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2429d.equals(rVar.f2429d) && Intrinsics.a(this.f2430e, rVar.f2430e) && Intrinsics.a(this.f2431i, rVar.f2431i);
    }

    public final int hashCode() {
        int hashCode = this.f2429d.hashCode() * 31;
        Object obj = this.f2430e;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f2431i;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + ((Object) this.f2429d) + ", " + this.f2430e + ", " + this.f2431i + ')';
    }
}
