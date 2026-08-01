package d1;

import c2.x0;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld1/o;", "Lc2/x0;", "Ld1/p;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class o extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f3318a;

    public o(float f3) {
        this.f3318a = f3;
    }

    @Override // c2.x0
    public final k d() {
        p pVar = new p();
        pVar.C = this.f3318a;
        return pVar;
    }

    @Override // c2.x0
    public final void e(k kVar) {
        ((p) kVar).C = this.f3318a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Float.compare(this.f3318a, ((o) obj).f3318a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3318a);
    }

    public final String toString() {
        return v4.a.l(new StringBuilder("ZIndexElement(zIndex="), this.f3318a, ')');
    }
}
