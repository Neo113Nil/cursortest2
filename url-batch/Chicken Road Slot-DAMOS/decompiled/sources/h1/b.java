package h1;

import c2.x0;
import d1.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh1/b;", "Lc2/x0;", "Lh1/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f4429a;

    public b(Function1 function1) {
        this.f4429a = function1;
    }

    @Override // c2.x0
    public final k d() {
        a aVar = new a();
        aVar.C = this.f4429a;
        return aVar;
    }

    @Override // c2.x0
    public final void e(k kVar) {
        ((a) kVar).C = this.f4429a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4429a == ((b) obj).f4429a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4429a.hashCode();
    }
}
