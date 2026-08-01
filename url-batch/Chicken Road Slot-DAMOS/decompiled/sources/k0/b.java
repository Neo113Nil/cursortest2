package k0;

import a1.f;
import c2.x0;
import d1.k;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk0/b;", "Lc2/x0;", "Lk0/a;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f5292a;

    public b(f fVar) {
        this.f5292a = fVar;
    }

    @Override // c2.x0
    public final k d() {
        a aVar = new a();
        aVar.C = this.f5292a;
        return aVar;
    }

    @Override // c2.x0
    public final void e(k kVar) {
        a aVar = (a) kVar;
        aVar.C = this.f5292a;
        c2.k.n(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f5292a == ((b) obj).f5292a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5292a.hashCode();
    }
}
