package s1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements InterfaceC4992e {

    /* renamed from: b, reason: collision with root package name */
    public final N1.c f40426b = new N1.c();

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            N1.c cVar = this.f40426b;
            if (i >= cVar.f40409v) {
                return;
            }
            g gVar = (g) cVar.h(i);
            Object l9 = this.f40426b.l(i);
            f fVar = gVar.f40423b;
            if (gVar.f40425d == null) {
                gVar.f40425d = gVar.f40424c.getBytes(InterfaceC4992e.f40420a);
            }
            fVar.h(gVar.f40425d, l9, messageDigest);
            i++;
        }
    }

    public final Object c(g gVar) {
        N1.c cVar = this.f40426b;
        return cVar.containsKey(gVar) ? cVar.getOrDefault(gVar, null) : gVar.f40422a;
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f40426b.equals(((h) obj).f40426b);
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return this.f40426b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f40426b + '}';
    }
}
