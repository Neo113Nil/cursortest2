package Z2;

import D.C0127e0;
import a3.AbstractC0425c;
import kotlin.Unit;

/* renamed from: Z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329e implements InterfaceC0330f {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0330f f4674d;

    public C0329e(InterfaceC0330f interfaceC0330f) {
        this.f4674d = interfaceC0330f;
    }

    @Override // Z2.InterfaceC0330f
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        M2.E e4 = new M2.E();
        e4.f3580d = AbstractC0425c.f4947b;
        Object e5 = this.f4674d.e(new C0127e0(this, e4, interfaceC0331g, 1), aVar);
        return e5 == D2.a.f2163d ? e5 : Unit.f7487a;
    }
}
