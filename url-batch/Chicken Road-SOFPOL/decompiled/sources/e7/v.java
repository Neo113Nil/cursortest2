package e7;

import d7.d0;
import d7.l0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v extends d0 implements l0 {
    @Override // d7.l0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f2349j;
            q6.i.b(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f2350k + ((int) ((n() + this.f2352m) - this.f2350k))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.f2349j;
            q6.i.b(objArr);
            p(Integer.valueOf(((Number) objArr[((int) ((this.f2350k + ((int) ((n() + this.f2352m) - this.f2350k))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
