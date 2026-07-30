package l5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f6081a;

    /* renamed from: b, reason: collision with root package name */
    public final f f6082b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.s f6083c;

    /* renamed from: d, reason: collision with root package name */
    public final b f6084d;

    public v(long j8, f fVar, t5.s sVar) {
        this.f6081a = j8;
        this.f6082b = fVar;
        this.f6083c = sVar;
        this.f6084d = null;
    }

    public final b a() {
        b bVar = this.f6084d;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final t5.s b() {
        t5.s sVar = this.f6083c;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f6083c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        b bVar = vVar.f6084d;
        t5.s sVar = vVar.f6083c;
        if (this.f6081a != vVar.f6081a || !this.f6082b.equals(vVar.f6082b)) {
            return false;
        }
        t5.s sVar2 = this.f6083c;
        if (sVar2 != null) {
            if (!sVar2.equals(sVar)) {
                return false;
            }
        } else if (sVar != null) {
            return false;
        }
        b bVar2 = this.f6084d;
        return bVar2 != null ? bVar2.equals(bVar) : bVar == null;
    }

    public final int hashCode() {
        int hashCode = (this.f6082b.hashCode() + ((Boolean.TRUE.hashCode() + (Long.valueOf(this.f6081a).hashCode() * 31)) * 31)) * 31;
        t5.s sVar = this.f6083c;
        int hashCode2 = (hashCode + (sVar != null ? sVar.hashCode() : 0)) * 31;
        b bVar = this.f6084d;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f6081a + " path=" + this.f6082b + " visible=true overwrite=" + this.f6083c + " merge=" + this.f6084d + "}";
    }

    public v(long j8, f fVar, b bVar) {
        this.f6081a = j8;
        this.f6082b = fVar;
        this.f6083c = null;
        this.f6084d = bVar;
    }
}
