package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* renamed from: K.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057v extends f2.i implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public int f819e;
    public final /* synthetic */ G f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0057v(G g3, InterfaceC0300c interfaceC0300c) {
        super(1, interfaceC0300c);
        this.f = g3;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f819e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
            return obj;
        }
        android.support.v4.media.session.a.T(obj);
        this.f819e = 1;
        Object invoke = this.f.invoke(this);
        return invoke == enumC0317a ? enumC0317a : invoke;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        return new C0057v(this.f, (InterfaceC0300c) obj).g(C0195i.f2555a);
    }
}
