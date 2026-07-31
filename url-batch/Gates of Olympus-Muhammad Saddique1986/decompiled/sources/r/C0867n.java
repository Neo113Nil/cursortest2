package r;

import java.util.List;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* renamed from: r.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0867n implements InterfaceC0885G {

    /* renamed from: b, reason: collision with root package name */
    public static final C0867n f8063b = new C0867n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0867n f8064c = new C0867n(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8065a;

    public /* synthetic */ C0867n(int i3) {
        this.f8065a = i3;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        switch (this.f8065a) {
            case 0:
                return interfaceC0887I.i0(O0.a.j(j3), O0.a.i(j3), S1.v.f4321d, C0866m.f8059f);
            default:
                return interfaceC0887I.i0(O0.a.f(j3) ? O0.a.h(j3) : 0, O0.a.e(j3) ? O0.a.g(j3) : 0, S1.v.f4321d, C0866m.f8061h);
        }
    }
}
