package g7;

import f7.e0;
import f7.o0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends e0 implements o0 {
    @Override // f7.o0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f3464m;
            r6.k.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f3465n + ((int) ((q() + this.f3467p) - this.f3465n))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i7) {
        synchronized (this) {
            Object[] objArr = this.f3464m;
            r6.k.c(objArr);
            i(Integer.valueOf(((Number) objArr[((int) ((this.f3465n + ((int) ((q() + this.f3467p) - this.f3465n))) - 1)) & (objArr.length - 1)]).intValue() + i7));
        }
    }
}
