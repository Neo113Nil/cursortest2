package B0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f158b;

    public j(String workSpecId, int i2) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f157a = workSpecId;
        this.f158b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(this.f157a, jVar.f157a) && this.f158b == jVar.f158b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f158b) + (this.f157a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f157a);
        sb.append(", generation=");
        return o.k(sb, this.f158b, ')');
    }
}
