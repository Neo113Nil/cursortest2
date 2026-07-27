package g2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f6760a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6761b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.s f6762c;

    /* renamed from: d, reason: collision with root package name */
    public final C0639b f6763d;

    public v(long j4, e eVar, o2.s sVar) {
        this.f6760a = j4;
        this.f6761b = eVar;
        this.f6762c = sVar;
        this.f6763d = null;
    }

    public final C0639b a() {
        C0639b c0639b = this.f6763d;
        if (c0639b != null) {
            return c0639b;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final o2.s b() {
        o2.s sVar = this.f6762c;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f6762c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f6760a != vVar.f6760a || !this.f6761b.equals(vVar.f6761b)) {
            return false;
        }
        o2.s sVar = vVar.f6762c;
        o2.s sVar2 = this.f6762c;
        if (sVar2 == null ? sVar != null : !sVar2.equals(sVar)) {
            return false;
        }
        C0639b c0639b = vVar.f6763d;
        C0639b c0639b2 = this.f6763d;
        return c0639b2 == null ? c0639b == null : c0639b2.equals(c0639b);
    }

    public final int hashCode() {
        int hashCode = (this.f6761b.hashCode() + ((Boolean.TRUE.hashCode() + (Long.valueOf(this.f6760a).hashCode() * 31)) * 31)) * 31;
        o2.s sVar = this.f6762c;
        int hashCode2 = (hashCode + (sVar != null ? sVar.hashCode() : 0)) * 31;
        C0639b c0639b = this.f6763d;
        return hashCode2 + (c0639b != null ? c0639b.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f6760a + " path=" + this.f6761b + " visible=true overwrite=" + this.f6762c + " merge=" + this.f6763d + "}";
    }

    public v(long j4, e eVar, C0639b c0639b) {
        this.f6760a = j4;
        this.f6761b = eVar;
        this.f6762c = null;
        this.f6763d = c0639b;
    }
}
