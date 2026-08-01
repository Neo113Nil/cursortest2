package i0;

import j1.h;
import java.util.AbstractSet;
import java.util.Map;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3156a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractSet f3157b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f3158c;

    public C0180e(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        h.e(abstractSet, "foreignKeys");
        this.f3156a = map;
        this.f3157b = abstractSet;
        this.f3158c = abstractSet2;
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0180e)) {
            return false;
        }
        C0180e c0180e = (C0180e) obj;
        c0180e.getClass();
        if (!this.f3156a.equals(c0180e.f3156a) || !h.a(this.f3157b, c0180e.f3157b)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f3158c;
        if (abstractSet2 == null || (abstractSet = c0180e.f3158c) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f3157b.hashCode() + ((this.f3156a.hashCode() - 492291023) * 31);
    }

    public final String toString() {
        return "TableInfo{name='food_entries', columns=" + this.f3156a + ", foreignKeys=" + this.f3157b + ", indices=" + this.f3158c + '}';
    }
}
