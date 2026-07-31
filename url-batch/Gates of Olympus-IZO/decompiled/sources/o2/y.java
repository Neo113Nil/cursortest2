package o2;

import n2.C0681F;
import n2.InterfaceC0690O;

/* loaded from: classes.dex */
public final class y extends C0681F implements InterfaceC0690O {
    @Override // n2.InterfaceC0690O
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f6288k;
            Z1.i.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f6289l + ((int) ((o() + this.f6291n) - this.f6289l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void v(int i3) {
        synchronized (this) {
            Object[] objArr = this.f6288k;
            Z1.i.c(objArr);
            c(Integer.valueOf(((Number) objArr[((int) ((this.f6289l + ((int) ((o() + this.f6291n) - this.f6289l))) - 1)) & (objArr.length - 1)]).intValue() + i3));
        }
    }
}
