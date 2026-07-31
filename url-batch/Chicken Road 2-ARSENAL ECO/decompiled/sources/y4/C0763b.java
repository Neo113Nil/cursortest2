package y4;

import java.util.List;
import n6.i;
import z3.m;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763b extends z3.f {

    /* renamed from: s, reason: collision with root package name */
    public static final C0762a f6236s;

    /* renamed from: h, reason: collision with root package name */
    public final long f6237h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6238i;

    /* renamed from: j, reason: collision with root package name */
    public final h f6239j;

    /* renamed from: k, reason: collision with root package name */
    public final String f6240k;

    /* renamed from: l, reason: collision with root package name */
    public final x4.b f6241l;

    /* renamed from: m, reason: collision with root package name */
    public final List f6242m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6243n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6244o;

    /* renamed from: p, reason: collision with root package name */
    public final i f6245p;

    /* renamed from: q, reason: collision with root package name */
    public final i f6246q;

    /* renamed from: r, reason: collision with root package name */
    public final String f6247r;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6236s = new C0762a(C0763b.class);
    }

    public C0763b(long j4, long j7, h hVar, String str, x4.b bVar, List list, int i7, int i8, i iVar, i iVar2, String str2, i iVar3) {
        super(f6236s, iVar3);
        this.f6237h = j4;
        this.f6238i = j7;
        if (hVar == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.f6239j = hVar;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.f6240k = str;
        this.f6241l = bVar;
        this.f6242m = A3.c.R(list, "attributes");
        this.f6243n = i7;
        this.f6244o = i8;
        if (iVar == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.f6245p = iVar;
        if (iVar2 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.f6246q = iVar2;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.f6247r = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0763b)) {
            return false;
        }
        C0763b c0763b = (C0763b) obj;
        return a().equals(c0763b.a()) && A3.c.O(Long.valueOf(this.f6237h), Long.valueOf(c0763b.f6237h)) && A3.c.O(Long.valueOf(this.f6238i), Long.valueOf(c0763b.f6238i)) && A3.c.O(this.f6239j, c0763b.f6239j) && A3.c.O(this.f6240k, c0763b.f6240k) && A3.c.O(this.f6241l, c0763b.f6241l) && this.f6242m.equals(c0763b.f6242m) && A3.c.O(Integer.valueOf(this.f6243n), Integer.valueOf(c0763b.f6243n)) && A3.c.O(Integer.valueOf(this.f6244o), Integer.valueOf(c0763b.f6244o)) && A3.c.O(this.f6245p, c0763b.f6245p) && A3.c.O(this.f6246q, c0763b.f6246q) && A3.c.O(this.f6247r, c0763b.f6247r);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = (Long.hashCode(this.f6238i) + ((Long.hashCode(this.f6237h) + (a().hashCode() * 37)) * 37)) * 37;
        h hVar = this.f6239j;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str = this.f6240k;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        x4.b bVar = this.f6241l;
        int hashCode4 = (Integer.hashCode(this.f6244o) + ((Integer.hashCode(this.f6243n) + ((this.f6242m.hashCode() + ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37)) * 37)) * 37;
        i iVar = this.f6245p;
        int hashCode5 = (hashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        i iVar2 = this.f6246q;
        int hashCode6 = (hashCode5 + (iVar2 != null ? iVar2.hashCode() : 0)) * 37;
        String str2 = this.f6247r;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.f6306g = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", time_unix_nano=");
        sb.append(this.f6237h);
        sb.append(", observed_time_unix_nano=");
        sb.append(this.f6238i);
        h hVar = this.f6239j;
        if (hVar != null) {
            sb.append(", severity_number=");
            sb.append(hVar);
        }
        String str = this.f6240k;
        if (str != null) {
            sb.append(", severity_text=");
            sb.append(A3.c.b0(str));
        }
        x4.b bVar = this.f6241l;
        if (bVar != null) {
            sb.append(", body=");
            sb.append(bVar);
        }
        List list = this.f6242m;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f6243n);
        sb.append(", flags=");
        sb.append(this.f6244o);
        i iVar = this.f6245p;
        if (iVar != null) {
            sb.append(", trace_id=");
            sb.append(iVar);
        }
        i iVar2 = this.f6246q;
        if (iVar2 != null) {
            sb.append(", span_id=");
            sb.append(iVar2);
        }
        String str2 = this.f6247r;
        if (str2 != null) {
            sb.append(", event_name=");
            sb.append(A3.c.b0(str2));
        }
        StringBuilder replace = sb.replace(0, 2, "LogRecord{");
        replace.append('}');
        return replace.toString();
    }
}
