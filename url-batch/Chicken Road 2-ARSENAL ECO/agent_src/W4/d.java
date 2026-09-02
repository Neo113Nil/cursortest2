package W4;

import e5.C0348c;
import e5.C0352g;
import java.util.StringJoiner;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f2803a;

    /* renamed from: b, reason: collision with root package name */
    public final C0352g f2804b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2805c;

    public d(b bVar, C0352g c0352g, int i7) {
        if (bVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f2803a = bVar;
        if (c0352g == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f2804b = c0352g;
        this.f2805c = i7;
    }

    public static D1.b a() {
        D1.b bVar = new D1.b(5, (byte) 0);
        bVar.f369c = C0348c.f4012a;
        bVar.f370d = C0352g.f4018a;
        bVar.f368b = 2000;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        dVar.getClass();
        return this.f2803a.equals(dVar.f2803a) && this.f2804b.equals(dVar.f2804b) && this.f2805c == dVar.f2805c;
    }

    public final int hashCode() {
        return this.f2805c ^ ((((((1000003 * 1000003) * 1000003) ^ this.f2803a.hashCode()) * 1000003) ^ this.f2804b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        stringJoiner.add("aggregation=" + this.f2803a);
        stringJoiner.add("attributesProcessor=" + this.f2804b);
        stringJoiner.add("cardinalityLimit=" + this.f2805c);
        return stringJoiner.toString();
    }
}
