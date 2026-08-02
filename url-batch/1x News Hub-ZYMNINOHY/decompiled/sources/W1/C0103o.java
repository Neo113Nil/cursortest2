package W1;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* renamed from: W1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103o implements w2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.d f1688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.d f1689c;

    public /* synthetic */ C0103o(w2.d dVar, N.d dVar2, int i3) {
        this.f1687a = i3;
        this.f1688b = dVar;
        this.f1689c = dVar2;
    }

    @Override // w2.d
    public final Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        switch (this.f1687a) {
            case 0:
                Object n3 = this.f1688b.n(new C0102n(eVar, this.f1689c, 0), interfaceC0300c);
                if (n3 != EnumC0317a.f4969a) {
                    break;
                }
                break;
            case 1:
                Object n4 = this.f1688b.n(new C0102n(eVar, this.f1689c, 1), interfaceC0300c);
                if (n4 != EnumC0317a.f4969a) {
                    break;
                }
                break;
            case 2:
                Object n5 = this.f1688b.n(new C0102n(eVar, this.f1689c, 2), interfaceC0300c);
                if (n5 != EnumC0317a.f4969a) {
                    break;
                }
                break;
            default:
                Object n6 = this.f1688b.n(new C0102n(eVar, this.f1689c, 3), interfaceC0300c);
                if (n6 != EnumC0317a.f4969a) {
                    break;
                }
                break;
        }
        return C0195i.f2555a;
    }
}
