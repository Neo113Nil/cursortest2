package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.List;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040d extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f750e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040d(List list, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f751g = list;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        C0040d c0040d = new C0040d(this.f751g, interfaceC0300c);
        c0040d.f = obj;
        return c0040d;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f750e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            C0047k c0047k = (C0047k) this.f;
            this.f750e = 1;
            if (android.support.v4.media.session.a.c(this.f751g, c0047k, this) == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
        }
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0040d) b((InterfaceC0300c) obj2, (C0047k) obj)).g(C0195i.f2555a);
    }
}
