package u2;

import t2.C1034E;
import t2.InterfaceC1043N;

/* renamed from: u2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147E extends C1034E implements InterfaceC1043N {
    @Override // t2.InterfaceC1043N
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f8971k;
            f2.j.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f8972l + ((int) ((q() + this.f8974n) - this.f8972l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i3) {
        synchronized (this) {
            Object[] objArr = this.f8971k;
            f2.j.c(objArr);
            c(Integer.valueOf(((Number) objArr[((int) ((this.f8972l + ((int) ((q() + this.f8974n) - this.f8972l))) - 1)) & (objArr.length - 1)]).intValue() + i3));
        }
    }
}
