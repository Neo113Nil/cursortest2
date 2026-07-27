package o2;

import j2.AbstractC0720j;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: i, reason: collision with root package name */
    public final Map f8937i;

    public i(Map map, s sVar) {
        super(sVar);
        this.f8937i = map;
    }

    @Override // o2.o
    public final /* bridge */ /* synthetic */ int e(o oVar) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8937i.equals(iVar.f8937i) && this.f8945d.equals(iVar.f8945d);
    }

    @Override // o2.s
    public final s f(s sVar) {
        AbstractC0720j.c(m3.s.n(sVar));
        return new i(this.f8937i, sVar);
    }

    @Override // o2.s
    public final Object getValue() {
        return this.f8937i;
    }

    @Override // o2.o
    public final int h() {
        return 1;
    }

    public final int hashCode() {
        return this.f8945d.hashCode() + this.f8937i.hashCode();
    }

    @Override // o2.s
    public final String u(int i2) {
        return j(i2) + "deferredValue:" + this.f8937i;
    }
}
