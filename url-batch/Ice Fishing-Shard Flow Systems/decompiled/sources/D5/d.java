package D5;

import java.util.StringJoiner;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f358a;

    /* renamed from: b, reason: collision with root package name */
    public final L5.g f359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360c;

    public d(b bVar, L5.g gVar, int i2) {
        if (bVar == null) {
            throw new NullPointerException("Null aggregation");
        }
        this.f358a = bVar;
        if (gVar == null) {
            throw new NullPointerException("Null attributesProcessor");
        }
        this.f359b = gVar;
        this.f360c = i2;
    }

    public static B6.o a() {
        B6.o oVar = new B6.o(1, (byte) 0);
        oVar.f230c = L5.c.f1690a;
        oVar.f231d = L5.g.f1696a;
        oVar.f229b = 2000;
        return oVar;
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
        return this.f358a.equals(dVar.f358a) && this.f359b.equals(dVar.f359b) && this.f360c == dVar.f360c;
    }

    public final int hashCode() {
        return this.f360c ^ ((((((1000003 * 1000003) * 1000003) ^ this.f358a.hashCode()) * 1000003) ^ this.f359b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "View{", "}");
        stringJoiner.add("aggregation=" + this.f358a);
        stringJoiner.add("attributesProcessor=" + this.f359b);
        stringJoiner.add("cardinalityLimit=" + this.f360c);
        return stringJoiner.toString();
    }
}
