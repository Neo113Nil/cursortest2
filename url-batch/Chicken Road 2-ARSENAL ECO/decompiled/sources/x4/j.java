package x4;

import z3.m;

/* loaded from: classes.dex */
public final class j extends z3.f {

    /* renamed from: j, reason: collision with root package name */
    public static final i f6218j;

    /* renamed from: h, reason: collision with root package name */
    public final String f6219h;

    /* renamed from: i, reason: collision with root package name */
    public final b f6220i;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6218j = new i(j.class);
    }

    public j(String str, b bVar, n6.i iVar) {
        super(f6218j, iVar);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.f6219h = str;
        this.f6220i = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return a().equals(jVar.a()) && A3.c.O(this.f6219h, jVar.f6219h) && A3.c.O(this.f6220i, jVar.f6220i);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f6219h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        b bVar = this.f6220i;
        int hashCode3 = hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        this.f6306g = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f6219h;
        if (str != null) {
            sb.append(", key=");
            sb.append(A3.c.b0(str));
        }
        b bVar = this.f6220i;
        if (bVar != null) {
            sb.append(", value=");
            sb.append(bVar);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValue{");
        replace.append('}');
        return replace.toString();
    }
}
