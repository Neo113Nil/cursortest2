package x4;

import z3.m;

/* loaded from: classes.dex */
public final class b extends z3.f {

    /* renamed from: o, reason: collision with root package name */
    public static final C0731a f6198o;

    /* renamed from: h, reason: collision with root package name */
    public final String f6199h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f6200i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f6201j;

    /* renamed from: k, reason: collision with root package name */
    public final Double f6202k;

    /* renamed from: l, reason: collision with root package name */
    public final d f6203l;

    /* renamed from: m, reason: collision with root package name */
    public final l f6204m;

    /* renamed from: n, reason: collision with root package name */
    public final n6.i f6205n;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6198o = new C0731a(b.class);
        n6.i iVar = n6.i.f5525i;
    }

    public b(String str, Boolean bool, Long l7, Double d7, d dVar, l lVar, n6.i iVar, n6.i iVar2) {
        super(f6198o, iVar2);
        Object[] objArr = {dVar, lVar, iVar};
        int i7 = str != null ? 1 : 0;
        i7 = bool != null ? i7 + 1 : i7;
        i7 = l7 != null ? i7 + 1 : i7;
        i7 = d7 != null ? i7 + 1 : i7;
        for (int i8 = 0; i8 < 3; i8++) {
            if (objArr[i8] != null) {
                i7++;
            }
        }
        if (i7 > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.f6199h = str;
        this.f6200i = bool;
        this.f6201j = l7;
        this.f6202k = d7;
        this.f6203l = dVar;
        this.f6204m = lVar;
        this.f6205n = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && A3.c.O(this.f6199h, bVar.f6199h) && A3.c.O(this.f6200i, bVar.f6200i) && A3.c.O(this.f6201j, bVar.f6201j) && A3.c.O(this.f6202k, bVar.f6202k) && A3.c.O(this.f6203l, bVar.f6203l) && A3.c.O(this.f6204m, bVar.f6204m) && A3.c.O(this.f6205n, bVar.f6205n);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f6199h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.f6200i;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l7 = this.f6201j;
        int hashCode4 = (hashCode3 + (l7 != null ? l7.hashCode() : 0)) * 37;
        Double d7 = this.f6202k;
        int hashCode5 = (hashCode4 + (d7 != null ? d7.hashCode() : 0)) * 37;
        d dVar = this.f6203l;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        l lVar = this.f6204m;
        int hashCode7 = (hashCode6 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        n6.i iVar = this.f6205n;
        int hashCode8 = hashCode7 + (iVar != null ? iVar.hashCode() : 0);
        this.f6306g = hashCode8;
        return hashCode8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f6199h;
        if (str != null) {
            sb.append(", string_value=");
            sb.append(A3.c.b0(str));
        }
        Boolean bool = this.f6200i;
        if (bool != null) {
            sb.append(", bool_value=");
            sb.append(bool);
        }
        Long l7 = this.f6201j;
        if (l7 != null) {
            sb.append(", int_value=");
            sb.append(l7);
        }
        Double d7 = this.f6202k;
        if (d7 != null) {
            sb.append(", double_value=");
            sb.append(d7);
        }
        d dVar = this.f6203l;
        if (dVar != null) {
            sb.append(", array_value=");
            sb.append(dVar);
        }
        l lVar = this.f6204m;
        if (lVar != null) {
            sb.append(", kvlist_value=");
            sb.append(lVar);
        }
        n6.i iVar = this.f6205n;
        if (iVar != null) {
            sb.append(", bytes_value=");
            sb.append(iVar);
        }
        StringBuilder replace = sb.replace(0, 2, "AnyValue{");
        replace.append('}');
        return replace.toString();
    }
}
