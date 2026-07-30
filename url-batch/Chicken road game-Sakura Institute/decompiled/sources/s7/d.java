package s7;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f8556c = new d(e6.l.z0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f8557a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.a f8558b;

    public d(Set set, t6.a aVar) {
        this.f8557a = set;
        this.f8558b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return r6.k.a(dVar.f8557a, this.f8557a) && r6.k.a(dVar.f8558b, this.f8558b);
    }

    public final int hashCode() {
        int hashCode = (this.f8557a.hashCode() + 1517) * 41;
        t6.a aVar = this.f8558b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
