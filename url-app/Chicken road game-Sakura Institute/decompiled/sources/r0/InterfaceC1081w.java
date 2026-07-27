package r0;

import p0.C0974j;
import p0.C0979o;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;

/* renamed from: r0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1081w extends InterfaceC1072m {
    default int b(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return i(new C0979o(o4, o4.getLayoutDirection()), new C0974j(interfaceC0944E, 2, 1, 2), u3.d.b(0, i2, 7)).g();
    }

    default int c(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        int i4 = 1;
        return i(new C0979o(o4, o4.getLayoutDirection()), new C0974j(interfaceC0944E, i4, i4, 2), u3.d.b(0, i2, 7)).g();
    }

    default int d(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return i(new C0979o(o4, o4.getLayoutDirection()), new C0974j(interfaceC0944E, 1, 2, 2), u3.d.b(i2, 0, 13)).j();
    }

    default int f(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        int i4 = 2;
        return i(new C0979o(o4, o4.getLayoutDirection()), new C0974j(interfaceC0944E, i4, i4, 2), u3.d.b(i2, 0, 13)).j();
    }

    InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4);
}
