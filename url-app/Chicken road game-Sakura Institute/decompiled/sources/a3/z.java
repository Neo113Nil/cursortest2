package a3;

import Z2.G;
import Z2.P;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends G implements P {
    @Override // Z2.P
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f4627n;
            Intrinsics.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f4628o + ((int) ((q() + this.f4630q) - this.f4628o))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i2) {
        synchronized (this) {
            Object[] objArr = this.f4627n;
            Intrinsics.c(objArr);
            b(Integer.valueOf(((Number) objArr[((int) ((this.f4628o + ((int) ((q() + this.f4630q) - this.f4628o))) - 1)) & (objArr.length - 1)]).intValue() + i2));
        }
    }
}
