package G1;

import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.b f1544a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1545b;

    public g(com.gates.olympus.miruv.data.b bVar, List list) {
        Z1.i.f(bVar, "answer");
        this.f1544a = bVar;
        this.f1545b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Z1.i.a(this.f1544a, gVar.f1544a) && Z1.i.a(this.f1545b, gVar.f1545b);
    }

    public final int hashCode() {
        return this.f1545b.hashCode() + (this.f1544a.hashCode() * 31);
    }

    public final String toString() {
        return "GuessQuestion(answer=" + this.f1544a + ", options=" + this.f1545b + ")";
    }
}
