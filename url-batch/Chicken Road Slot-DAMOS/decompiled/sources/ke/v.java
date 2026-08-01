package ke;

import je.a0;
import je.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends a0 implements j0 {
    @Override // je.j0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f5133v;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f5134w + ((int) ((o() + this.f5136y) - this.f5134w))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i3) {
        synchronized (this) {
            Object[] objArr = this.f5133v;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.f5134w + ((int) ((o() + this.f5136y) - this.f5134w))) - 1)) & (objArr.length - 1)]).intValue() + i3));
        }
    }
}
