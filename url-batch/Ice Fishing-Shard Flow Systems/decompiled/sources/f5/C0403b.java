package f5;

import T6.i;
import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import java.util.List;

/* renamed from: f5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403b extends AbstractC0300f {

    /* renamed from: v, reason: collision with root package name */
    public static final C0402a f4806v;

    /* renamed from: i, reason: collision with root package name */
    public final long f4807i;

    /* renamed from: l, reason: collision with root package name */
    public final long f4808l;

    /* renamed from: m, reason: collision with root package name */
    public final h f4809m;

    /* renamed from: n, reason: collision with root package name */
    public final String f4810n;

    /* renamed from: o, reason: collision with root package name */
    public final e5.b f4811o;

    /* renamed from: p, reason: collision with root package name */
    public final List f4812p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4813q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4814r;

    /* renamed from: s, reason: collision with root package name */
    public final i f4815s;

    /* renamed from: t, reason: collision with root package name */
    public final i f4816t;

    /* renamed from: u, reason: collision with root package name */
    public final String f4817u;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4806v = new C0402a(C0403b.class);
    }

    public C0403b(long j, long j7, h hVar, String str, e5.b bVar, List list, int i2, int i5, i iVar, i iVar2, String str2, i iVar3) {
        super(f4806v, iVar3);
        this.f4807i = j;
        this.f4808l = j7;
        if (hVar == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.f4809m = hVar;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.f4810n = str;
        this.f4811o = bVar;
        this.f4812p = V6.b.E("attributes", list);
        this.f4813q = i2;
        this.f4814r = i5;
        if (iVar == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.f4815s = iVar;
        if (iVar2 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.f4816t = iVar2;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.f4817u = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0403b)) {
            return false;
        }
        C0403b c0403b = (C0403b) obj;
        return a().equals(c0403b.a()) && V6.b.z(Long.valueOf(this.f4807i), Long.valueOf(c0403b.f4807i)) && V6.b.z(Long.valueOf(this.f4808l), Long.valueOf(c0403b.f4808l)) && V6.b.z(this.f4809m, c0403b.f4809m) && V6.b.z(this.f4810n, c0403b.f4810n) && V6.b.z(this.f4811o, c0403b.f4811o) && this.f4812p.equals(c0403b.f4812p) && V6.b.z(Integer.valueOf(this.f4813q), Integer.valueOf(c0403b.f4813q)) && V6.b.z(Integer.valueOf(this.f4814r), Integer.valueOf(c0403b.f4814r)) && V6.b.z(this.f4815s, c0403b.f4815s) && V6.b.z(this.f4816t, c0403b.f4816t) && V6.b.z(this.f4817u, c0403b.f4817u);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (Long.hashCode(this.f4808l) + ((Long.hashCode(this.f4807i) + (a().hashCode() * 37)) * 37)) * 37;
        h hVar = this.f4809m;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str = this.f4810n;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        e5.b bVar = this.f4811o;
        int hashCode4 = (Integer.hashCode(this.f4814r) + ((Integer.hashCode(this.f4813q) + ((this.f4812p.hashCode() + ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37)) * 37)) * 37;
        i iVar = this.f4815s;
        int hashCode5 = (hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        i iVar2 = this.f4816t;
        int hashCode6 = (hashCode5 + (iVar2 != null ? iVar2.hashCode() : 0)) * 37;
        String str2 = this.f4817u;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.f4221e = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", time_unix_nano=");
        sb.append(this.f4807i);
        sb.append(", observed_time_unix_nano=");
        sb.append(this.f4808l);
        h hVar = this.f4809m;
        if (hVar != null) {
            sb.append(", severity_number=");
            sb.append(hVar);
        }
        String str = this.f4810n;
        if (str != null) {
            sb.append(", severity_text=");
            sb.append(V6.b.M(str));
        }
        e5.b bVar = this.f4811o;
        if (bVar != null) {
            sb.append(", body=");
            sb.append(bVar);
        }
        List list = this.f4812p;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f4813q);
        sb.append(", flags=");
        sb.append(this.f4814r);
        i iVar = this.f4815s;
        if (iVar != null) {
            sb.append(", trace_id=");
            sb.append(iVar);
        }
        i iVar2 = this.f4816t;
        if (iVar2 != null) {
            sb.append(", span_id=");
            sb.append(iVar2);
        }
        String str2 = this.f4817u;
        if (str2 != null) {
            sb.append(", event_name=");
            sb.append(V6.b.M(str2));
        }
        StringBuilder replace = sb.replace(0, 2, "LogRecord{");
        replace.append('}');
        return replace.toString();
    }
}
