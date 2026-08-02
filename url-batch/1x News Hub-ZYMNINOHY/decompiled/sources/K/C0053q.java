package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0326c;

/* renamed from: K.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053q extends f2.i implements l2.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f806e = 1;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f807g;

    public /* synthetic */ C0053q(int i3, InterfaceC0300c interfaceC0300c) {
        super(i3, interfaceC0300c);
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        switch (this.f806e) {
            case 0:
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                int i3 = this.f;
                if (i3 == 0) {
                    android.support.v4.media.session.a.T(obj);
                    this.f = 1;
                    if (N.b((N) this.f807g, this) == enumC0317a) {
                        return enumC0317a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.a.T(obj);
                }
                return C0195i.f2555a;
            default:
                EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.a.T(obj);
                    return obj;
                }
                android.support.v4.media.session.a.T(obj);
                P p3 = (P) this.f807g;
                this.f = 1;
                p3.getClass();
                Object a3 = P.a(p3, this);
                return a3 == enumC0317a2 ? enumC0317a2 : a3;
        }
    }

    public final Object i(Object obj, Object obj2, AbstractC0326c abstractC0326c) {
        switch (this.f806e) {
            case 0:
                return new C0053q((N) this.f807g, abstractC0326c).g(C0195i.f2555a);
            default:
                ((Boolean) obj2).getClass();
                C0053q c0053q = new C0053q(3, abstractC0326c);
                c0053q.f807g = (P) obj;
                return c0053q.g(C0195i.f2555a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053q(N n3, InterfaceC0300c interfaceC0300c) {
        super(3, interfaceC0300c);
        this.f807g = n3;
    }
}
