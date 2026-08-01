package nd;

import wd.c0;
import wd.d0;
import wd.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h extends g implements l {

    /* renamed from: d, reason: collision with root package name */
    private final int f7248d;

    public h(ld.a aVar) {
        super(aVar);
        this.f7248d = 2;
    }

    @Override // wd.l
    public final int getArity() {
        return this.f7248d;
    }

    @Override // nd.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        c0.f10143a.getClass();
        return d0.a(this);
    }
}
