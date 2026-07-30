package t5;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: h, reason: collision with root package name */
    public final Map f8906h;

    public i(Map map, s sVar) {
        super(sVar);
        this.f8906h = map;
    }

    @Override // t5.o
    public final /* bridge */ /* synthetic */ int a(o oVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8906h.equals(iVar.f8906h) && this.f8914f.equals(iVar.f8914f);
    }

    @Override // t5.s
    public final String f(int i7) {
        return m(i7) + "deferredValue:" + this.f8906h;
    }

    @Override // t5.o
    public final int g() {
        return 1;
    }

    @Override // t5.s
    public final Object getValue() {
        return this.f8906h;
    }

    public final int hashCode() {
        return this.f8914f.hashCode() + this.f8906h.hashCode();
    }

    @Override // t5.s
    public final s n(s sVar) {
        o5.j.c(j1.c.h0(sVar));
        return new i(this.f8906h, sVar);
    }
}
