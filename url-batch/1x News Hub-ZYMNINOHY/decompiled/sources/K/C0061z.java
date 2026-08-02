package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.C1202l;
import t2.InterfaceC1210u;

/* renamed from: K.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061z extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f831e;
    public final /* synthetic */ N f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061z(N n3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = n3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new C0061z(this.f, interfaceC0300c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r9 == r0) goto L23;
     */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f831e;
        C0195i c0195i = C0195i.f2555a;
        N n3 = this.f;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            this.f831e = 1;
            Object q3 = ((C1202l) n3.f702i.f163b).q(this);
            if (q3 != enumC0317a) {
                q3 = c0195i;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.a.T(obj);
                return c0195i;
            }
            android.support.v4.media.session.a.T(obj);
        }
        w2.d dVar = n3.g().f773c;
        v2.a aVar = v2.a.f10572b;
        w2.d a3 = dVar instanceof x2.i ? x2.k.a((x2.i) dVar, null, 0, aVar, 1) : new x2.g(dVar, d2.i.f4951a, 0, aVar);
        C0060y c0060y = new C0060y(0, n3);
        this.f831e = 2;
        return a3.n(c0060y, this) == enumC0317a ? enumC0317a : c0195i;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0061z) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
