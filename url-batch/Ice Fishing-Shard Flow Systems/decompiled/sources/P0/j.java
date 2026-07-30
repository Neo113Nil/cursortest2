package P0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2204a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2205b;

    public j(String workSpecId, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f2204a = workSpecId;
        this.f2205b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.f2204a, jVar.f2204a) && this.f2205b == jVar.f2205b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2205b) + (this.f2204a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f2204a + ", generation=" + this.f2205b + ')';
    }
}
