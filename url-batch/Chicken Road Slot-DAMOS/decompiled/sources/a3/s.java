package a3;

import c2.x0;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La3/s;", "Lc2/x0;", "La3/u;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class s extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f264a;

    public s(g gVar) {
        this.f264a = gVar;
    }

    @Override // c2.x0
    public final d1.k d() {
        return new u(this.f264a);
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        u uVar = (u) kVar;
        g gVar = this.f264a;
        uVar.C = gVar;
        if (uVar.B) {
            gVar.invoke(uVar.D);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f264a == ((s) obj).f264a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f264a.hashCode();
    }
}
