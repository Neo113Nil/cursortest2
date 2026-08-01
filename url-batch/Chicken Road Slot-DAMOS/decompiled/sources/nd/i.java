package nd;

import wd.c0;
import wd.d0;
import wd.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i extends c implements l {
    private final int arity;

    public i(int i3, ld.a aVar) {
        super(aVar);
        this.arity = i3;
    }

    @Override // wd.l
    public int getArity() {
        return this.arity;
    }

    @Override // nd.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        c0.f10143a.getClass();
        return d0.a(this);
    }
}
