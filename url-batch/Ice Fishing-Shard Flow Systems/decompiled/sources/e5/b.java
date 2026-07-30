package e5;

import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends AbstractC0300f {

    /* renamed from: r, reason: collision with root package name */
    public static final C0376a f4712r;

    /* renamed from: i, reason: collision with root package name */
    public final String f4713i;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f4714l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f4715m;

    /* renamed from: n, reason: collision with root package name */
    public final Double f4716n;

    /* renamed from: o, reason: collision with root package name */
    public final d f4717o;

    /* renamed from: p, reason: collision with root package name */
    public final l f4718p;

    /* renamed from: q, reason: collision with root package name */
    public final T6.i f4719q;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4712r = new C0376a(b.class);
        T6.i iVar = T6.i.f2618l;
    }

    public b(String str, Boolean bool, Long l7, Double d7, d dVar, l lVar, T6.i iVar, T6.i iVar2) {
        super(f4712r, iVar2);
        Object[] rest = {dVar, lVar, iVar};
        Intrinsics.checkNotNullParameter(rest, "rest");
        int i2 = str != null ? 1 : 0;
        i2 = bool != null ? i2 + 1 : i2;
        i2 = l7 != null ? i2 + 1 : i2;
        i2 = d7 != null ? i2 + 1 : i2;
        for (int i5 = 0; i5 < 3; i5++) {
            if (rest[i5] != null) {
                i2++;
            }
        }
        if (i2 > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.f4713i = str;
        this.f4714l = bool;
        this.f4715m = l7;
        this.f4716n = d7;
        this.f4717o = dVar;
        this.f4718p = lVar;
        this.f4719q = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && V6.b.z(this.f4713i, bVar.f4713i) && V6.b.z(this.f4714l, bVar.f4714l) && V6.b.z(this.f4715m, bVar.f4715m) && V6.b.z(this.f4716n, bVar.f4716n) && V6.b.z(this.f4717o, bVar.f4717o) && V6.b.z(this.f4718p, bVar.f4718p) && V6.b.z(this.f4719q, bVar.f4719q);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f4713i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.f4714l;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l7 = this.f4715m;
        int hashCode4 = (hashCode3 + (l7 != null ? l7.hashCode() : 0)) * 37;
        Double d7 = this.f4716n;
        int hashCode5 = (hashCode4 + (d7 != null ? d7.hashCode() : 0)) * 37;
        d dVar = this.f4717o;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        l lVar = this.f4718p;
        int hashCode7 = (hashCode6 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        T6.i iVar = this.f4719q;
        int hashCode8 = hashCode7 + (iVar != null ? iVar.hashCode() : 0);
        this.f4221e = hashCode8;
        return hashCode8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4713i;
        if (str != null) {
            sb.append(", string_value=");
            sb.append(V6.b.M(str));
        }
        Boolean bool = this.f4714l;
        if (bool != null) {
            sb.append(", bool_value=");
            sb.append(bool);
        }
        Long l7 = this.f4715m;
        if (l7 != null) {
            sb.append(", int_value=");
            sb.append(l7);
        }
        Double d7 = this.f4716n;
        if (d7 != null) {
            sb.append(", double_value=");
            sb.append(d7);
        }
        d dVar = this.f4717o;
        if (dVar != null) {
            sb.append(", array_value=");
            sb.append(dVar);
        }
        l lVar = this.f4718p;
        if (lVar != null) {
            sb.append(", kvlist_value=");
            sb.append(lVar);
        }
        T6.i iVar = this.f4719q;
        if (iVar != null) {
            sb.append(", bytes_value=");
            sb.append(iVar);
        }
        StringBuilder replace = sb.replace(0, 2, "AnyValue{");
        replace.append('}');
        return replace.toString();
    }
}
