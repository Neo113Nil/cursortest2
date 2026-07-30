package S0;

import D.y;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2906b;

    public j(String workSpecId, int i) {
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        this.f2905a = workSpecId;
        this.f2906b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.h.a(this.f2905a, jVar.f2905a) && this.f2906b == jVar.f2906b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2906b) + (this.f2905a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f2905a);
        sb.append(", generation=");
        return y.m(sb, this.f2906b, ')');
    }
}
