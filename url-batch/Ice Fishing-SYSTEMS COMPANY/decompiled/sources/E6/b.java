package E6;

import Y5.n;
import java.util.List;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class b extends Y5.f {

    /* renamed from: G, reason: collision with root package name */
    public static final a f846G;

    /* renamed from: A, reason: collision with root package name */
    public final List f847A;

    /* renamed from: B, reason: collision with root package name */
    public final int f848B;

    /* renamed from: C, reason: collision with root package name */
    public final int f849C;

    /* renamed from: D, reason: collision with root package name */
    public final u8.h f850D;

    /* renamed from: E, reason: collision with root package name */
    public final u8.h f851E;

    /* renamed from: F, reason: collision with root package name */
    public final String f852F;

    /* renamed from: v, reason: collision with root package name */
    public final long f853v;

    /* renamed from: w, reason: collision with root package name */
    public final long f854w;

    /* renamed from: x, reason: collision with root package name */
    public final h f855x;

    /* renamed from: y, reason: collision with root package name */
    public final String f856y;

    /* renamed from: z, reason: collision with root package name */
    public final D6.b f857z;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f846G = new a(b.class);
    }

    public b(long j9, long j10, h hVar, String str, D6.b bVar, Z5.d dVar, int i, int i4, u8.h hVar2, u8.h hVar3, String str2, u8.h hVar4) {
        super(f846G, hVar4);
        this.f853v = j9;
        this.f854w = j10;
        if (hVar == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.f855x = hVar;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.f856y = str;
        this.f857z = bVar;
        this.f847A = com.bumptech.glide.f.k("attributes", dVar);
        this.f848B = i;
        this.f849C = i4;
        if (hVar2 == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.f850D = hVar2;
        if (hVar3 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.f851E = hVar3;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.f852F = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && com.bumptech.glide.f.f(Long.valueOf(this.f853v), Long.valueOf(bVar.f853v)) && com.bumptech.glide.f.f(Long.valueOf(this.f854w), Long.valueOf(bVar.f854w)) && com.bumptech.glide.f.f(this.f855x, bVar.f855x) && com.bumptech.glide.f.f(this.f856y, bVar.f856y) && com.bumptech.glide.f.f(this.f857z, bVar.f857z) && this.f847A.equals(bVar.f847A) && com.bumptech.glide.f.f(Integer.valueOf(this.f848B), Integer.valueOf(bVar.f848B)) && com.bumptech.glide.f.f(Integer.valueOf(this.f849C), Integer.valueOf(bVar.f849C)) && com.bumptech.glide.f.f(this.f850D, bVar.f850D) && com.bumptech.glide.f.f(this.f851E, bVar.f851E) && com.bumptech.glide.f.f(this.f852F, bVar.f852F);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = (Long.hashCode(this.f854w) + ((Long.hashCode(this.f853v) + (a().hashCode() * 37)) * 37)) * 37;
        h hVar = this.f855x;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37;
        String str = this.f856y;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        D6.b bVar = this.f857z;
        int hashCode4 = (Integer.hashCode(this.f849C) + ((Integer.hashCode(this.f848B) + ((this.f847A.hashCode() + ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 37)) * 37)) * 37)) * 37;
        u8.h hVar2 = this.f850D;
        int hashCode5 = (hashCode4 + (hVar2 != null ? hVar2.hashCode() : 0)) * 37;
        u8.h hVar3 = this.f851E;
        int hashCode6 = (hashCode5 + (hVar3 != null ? hVar3.hashCode() : 0)) * 37;
        String str2 = this.f852F;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.f3992u = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        StringBuilder b9 = AbstractC5088e.b(", time_unix_nano=");
        b9.append(this.f853v);
        b9.append(", observed_time_unix_nano=");
        b9.append(this.f854w);
        h hVar = this.f855x;
        if (hVar != null) {
            b9.append(", severity_number=");
            b9.append(hVar);
        }
        String str = this.f856y;
        if (str != null) {
            b9.append(", severity_text=");
            b9.append(com.bumptech.glide.f.n(str));
        }
        D6.b bVar = this.f857z;
        if (bVar != null) {
            b9.append(", body=");
            b9.append(bVar);
        }
        List list = this.f847A;
        if (!list.isEmpty()) {
            b9.append(", attributes=");
            b9.append(list);
        }
        b9.append(", dropped_attributes_count=");
        b9.append(this.f848B);
        b9.append(", flags=");
        b9.append(this.f849C);
        u8.h hVar2 = this.f850D;
        if (hVar2 != null) {
            b9.append(", trace_id=");
            b9.append(hVar2);
        }
        u8.h hVar3 = this.f851E;
        if (hVar3 != null) {
            b9.append(", span_id=");
            b9.append(hVar3);
        }
        String str2 = this.f852F;
        if (str2 != null) {
            b9.append(", event_name=");
            b9.append(com.bumptech.glide.f.n(str2));
        }
        StringBuilder replace = b9.replace(0, 2, "LogRecord{");
        replace.append('}');
        return replace.toString();
    }
}
