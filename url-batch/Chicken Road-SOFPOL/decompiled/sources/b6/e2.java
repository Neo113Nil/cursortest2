package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1309a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1310b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1311c;

    public e2(String str, String str2, List list) {
        this.f1309a = str;
        this.f1310b = str2;
        this.f1311c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return q6.i.a(this.f1309a, e2Var.f1309a) && q6.i.a(this.f1310b, e2Var.f1310b) && q6.i.a(this.f1311c, e2Var.f1311c);
    }

    public final int hashCode() {
        return this.f1311c.hashCode() + ((this.f1310b.hashCode() + (this.f1309a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WinterFact(category=" + this.f1309a + ", emoji=" + this.f1310b + ", facts=" + this.f1311c + ")";
    }
}
