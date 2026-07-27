package q;

import p0.InterfaceC0947H;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025d implements InterfaceC1029h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9247a = 1;

    @Override // q.InterfaceC1029h
    public final void c(int i2, InterfaceC0947H interfaceC0947H, int[] iArr, int[] iArr2) {
        switch (this.f9247a) {
            case 0:
                AbstractC1031j.c(i2, iArr, iArr2, false);
                break;
            default:
                AbstractC1031j.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f9247a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
