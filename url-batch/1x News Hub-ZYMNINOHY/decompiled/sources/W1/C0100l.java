package W1;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.List;
import t2.InterfaceC1210u;

/* renamed from: W1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100l extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1680e;
    public final /* synthetic */ K f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f1681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0100l(K k3, List list, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = k3;
        this.f1681g = list;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new C0100l(this.f, this.f1681g, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f1680e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        android.support.v4.media.session.a.T(obj);
        this.f1680e = 1;
        Object i4 = K.i(this.f, this.f1681g, this);
        return i4 == enumC0317a ? enumC0317a : i4;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0100l) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
