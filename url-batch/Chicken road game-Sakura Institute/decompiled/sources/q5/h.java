package q5;

import java.util.HashMap;
import t5.l;
import t5.s;
import t5.t;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final h f7529f = new h();

    /* renamed from: a, reason: collision with root package name */
    public final s f7530a = null;

    /* renamed from: b, reason: collision with root package name */
    public final t5.c f7531b = null;

    /* renamed from: c, reason: collision with root package name */
    public final s f7532c = null;

    /* renamed from: d, reason: collision with root package name */
    public final t5.c f7533d = null;

    /* renamed from: e, reason: collision with root package name */
    public final l f7534e = t.f8922a;

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        if (b()) {
            hashMap.put("sp", this.f7530a.getValue());
            t5.c cVar = this.f7531b;
            if (cVar != null) {
                hashMap.put("sn", cVar.f8889f);
            }
        }
        s sVar = this.f7532c;
        if (sVar != null) {
            hashMap.put("ep", sVar.getValue());
            t5.c cVar2 = this.f7533d;
            if (cVar2 != null) {
                hashMap.put("en", cVar2.f8889f);
            }
        }
        if (!this.f7534e.equals(t.f8922a)) {
            hashMap.put("i", this.f7534e.a());
        }
        return hashMap;
    }

    public final boolean b() {
        return this.f7530a != null;
    }

    public final boolean c() {
        return b();
    }

    public final boolean d() {
        return !b() && this.f7532c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f7534e.equals(hVar.f7534e)) {
            return false;
        }
        t5.c cVar = this.f7533d;
        if (cVar == null ? hVar.f7533d != null : !cVar.equals(hVar.f7533d)) {
            return false;
        }
        s sVar = this.f7532c;
        if (sVar == null ? hVar.f7532c != null : !sVar.equals(hVar.f7532c)) {
            return false;
        }
        t5.c cVar2 = this.f7531b;
        if (cVar2 == null ? hVar.f7531b != null : !cVar2.equals(hVar.f7531b)) {
            return false;
        }
        s sVar2 = this.f7530a;
        if (sVar2 == null ? hVar.f7530a == null : sVar2.equals(hVar.f7530a)) {
            return c() == hVar.c();
        }
        return false;
    }

    public final int hashCode() {
        int i7 = ((0 * 31) + (c() ? 1231 : 1237)) * 31;
        s sVar = this.f7530a;
        int hashCode = (i7 + (sVar != null ? sVar.hashCode() : 0)) * 31;
        t5.c cVar = this.f7531b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.f8889f.hashCode() : 0)) * 31;
        s sVar2 = this.f7532c;
        int hashCode3 = (hashCode2 + (sVar2 != null ? sVar2.hashCode() : 0)) * 31;
        t5.c cVar2 = this.f7533d;
        return ((hashCode3 + (cVar2 != null ? cVar2.f8889f.hashCode() : 0)) * 31) + this.f7534e.hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
