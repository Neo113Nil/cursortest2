package g0;

import g1.f;
import java.util.AbstractSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2556a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractSet f2557b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f2558c;

    public e(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        f.e(abstractSet, "foreignKeys");
        this.f2556a = map;
        this.f2557b = abstractSet;
        this.f2558c = abstractSet2;
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        if (!this.f2556a.equals(eVar.f2556a) || !f.a(this.f2557b, eVar.f2557b)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f2558c;
        if (abstractSet2 == null || (abstractSet = eVar.f2558c) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f2557b.hashCode() + ((this.f2556a.hashCode() + 272286454) * 31);
    }

    public final String toString() {
        return "TableInfo{name='game_sessions', columns=" + this.f2556a + ", foreignKeys=" + this.f2557b + ", indices=" + this.f2558c + '}';
    }
}
