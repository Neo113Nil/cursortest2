package S0;

import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f785a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f786b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f787c;

    public a(boolean z2, Set set, Set set2) {
        this.f785a = z2;
        this.f786b = set;
        this.f787c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f785a == aVar.f785a && this.f786b.equals(aVar.f786b) && this.f787c.equals(aVar.f787c);
    }

    public final int hashCode() {
        return this.f787c.hashCode() + ((this.f786b.hashCode() + (Boolean.hashCode(this.f785a) * 31)) * 31);
    }

    public final String toString() {
        return "SolveResult(connected=" + this.f785a + ", poweredIds=" + this.f786b + ", pathEdges=" + this.f787c + ")";
    }
}
