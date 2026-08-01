package j2;

import c2.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lj2/b;", "Lc2/x0;", "Lj2/c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4930a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f4931b;

    public b(Function1 function1, boolean z10) {
        this.f4930a = z10;
        this.f4931b = function1;
    }

    @Override // c2.x0
    public final d1.k d() {
        c cVar = new c();
        cVar.C = this.f4930a;
        cVar.D = this.f4931b;
        return cVar;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        c cVar = (c) kVar;
        cVar.C = this.f4930a;
        cVar.D = this.f4931b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4930a == bVar.f4930a && this.f4931b == bVar.f4931b;
    }

    public final int hashCode() {
        return this.f4931b.hashCode() + (Boolean.hashCode(this.f4930a) * 31);
    }
}
