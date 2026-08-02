package G3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f886c = new e(d3.i.p0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f887a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.l f888b;

    public e(Set set, O3.l lVar) {
        this.f887a = set;
        this.f888b = lVar;
    }

    public final void a(String hostname, InterfaceC1328a interfaceC1328a) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        Iterator it = this.f887a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.i.a(eVar.f887a, this.f887a) && kotlin.jvm.internal.i.a(eVar.f888b, this.f888b);
    }

    public final int hashCode() {
        int hashCode = (this.f887a.hashCode() + 1517) * 41;
        O3.l lVar = this.f888b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
