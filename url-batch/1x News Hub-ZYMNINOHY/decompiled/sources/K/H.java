package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class H extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f678e;
    public final /* synthetic */ N f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(N n3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f = n3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        return new H(this.f, interfaceC0300c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r4.h(r5) == r0) goto L22;
     */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f678e;
        N n3 = this.f;
        try {
            if (i3 == 0) {
                android.support.v4.media.session.a.T(obj);
                if (n3.f701h.s() instanceof Z) {
                    return n3.f701h.s();
                }
                this.f678e = 1;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    android.support.v4.media.session.a.T(obj);
                    return (i0) obj;
                }
                android.support.v4.media.session.a.T(obj);
            }
            this.f678e = 2;
            obj = N.e(n3, false, this);
        } catch (Throwable th) {
            return new b0(th, -1);
        }
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) b((InterfaceC0300c) obj2, (InterfaceC1210u) obj)).g(C0195i.f2555a);
    }
}
