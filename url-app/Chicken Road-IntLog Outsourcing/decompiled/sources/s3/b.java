package s3;

import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class b extends AbstractC1283f {

    /* renamed from: j, reason: collision with root package name */
    public static final C1420a f11812j;

    /* renamed from: c, reason: collision with root package name */
    public final String f11813c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f11814d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f11815e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f11816f;

    /* renamed from: g, reason: collision with root package name */
    public final d f11817g;

    /* renamed from: h, reason: collision with root package name */
    public final l f11818h;

    /* renamed from: i, reason: collision with root package name */
    public final j5.i f11819i;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11812j = new C1420a(b.class);
        j5.i iVar = j5.i.f10496d;
    }

    public b(String str, Boolean bool, Long l2, Double d6, d dVar, l lVar, j5.i iVar, j5.i iVar2) {
        super(f11812j, iVar2);
        Object[] objArr = {dVar, lVar, iVar};
        int i2 = str != null ? 1 : 0;
        i2 = bool != null ? i2 + 1 : i2;
        i2 = l2 != null ? i2 + 1 : i2;
        i2 = d6 != null ? i2 + 1 : i2;
        for (int i3 = 0; i3 < 3; i3++) {
            if (objArr[i3] != null) {
                i2++;
            }
        }
        if (i2 > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.f11813c = str;
        this.f11814d = bool;
        this.f11815e = l2;
        this.f11816f = d6;
        this.f11817g = dVar;
        this.f11818h = lVar;
        this.f11819i = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && AbstractC1341c.i(this.f11813c, bVar.f11813c) && AbstractC1341c.i(this.f11814d, bVar.f11814d) && AbstractC1341c.i(this.f11815e, bVar.f11815e) && AbstractC1341c.i(this.f11816f, bVar.f11816f) && AbstractC1341c.i(this.f11817g, bVar.f11817g) && AbstractC1341c.i(this.f11818h, bVar.f11818h) && AbstractC1341c.i(this.f11819i, bVar.f11819i);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f11813c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.f11814d;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l2 = this.f11815e;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Double d6 = this.f11816f;
        int hashCode5 = (hashCode4 + (d6 != null ? d6.hashCode() : 0)) * 37;
        d dVar = this.f11817g;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        l lVar = this.f11818h;
        int hashCode7 = (hashCode6 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        j5.i iVar = this.f11819i;
        int hashCode8 = hashCode7 + (iVar != null ? iVar.hashCode() : 0);
        this.f11160b = hashCode8;
        return hashCode8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f11813c;
        if (str != null) {
            sb.append(", string_value=");
            sb.append(AbstractC1341c.C(str));
        }
        Boolean bool = this.f11814d;
        if (bool != null) {
            sb.append(", bool_value=");
            sb.append(bool);
        }
        Long l2 = this.f11815e;
        if (l2 != null) {
            sb.append(", int_value=");
            sb.append(l2);
        }
        Double d6 = this.f11816f;
        if (d6 != null) {
            sb.append(", double_value=");
            sb.append(d6);
        }
        d dVar = this.f11817g;
        if (dVar != null) {
            sb.append(", array_value=");
            sb.append(dVar);
        }
        l lVar = this.f11818h;
        if (lVar != null) {
            sb.append(", kvlist_value=");
            sb.append(lVar);
        }
        j5.i iVar = this.f11819i;
        if (iVar != null) {
            sb.append(", bytes_value=");
            sb.append(iVar);
        }
        StringBuilder replace = sb.replace(0, 2, "AnyValue{");
        replace.append('}');
        return replace.toString();
    }
}
