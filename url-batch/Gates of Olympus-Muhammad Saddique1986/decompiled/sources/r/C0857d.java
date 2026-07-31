package r;

import r0.InterfaceC0887I;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857d implements InterfaceC0862i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8045a;

    @Override // r.InterfaceC0862i
    public final void c(int i3, InterfaceC0887I interfaceC0887I, int[] iArr, int[] iArr2) {
        switch (this.f8045a) {
            case 0:
                AbstractC0864k.c(i3, iArr, iArr2, false);
                break;
            default:
                AbstractC0864k.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f8045a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
