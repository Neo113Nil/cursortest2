package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* renamed from: K.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065n extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f1399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065n(M m4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1399b = m4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new C0065n(this.f1399b, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0065n) create((A3.e) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1398a;
        if (i4 == 0) {
            O3.l.w(obj);
            this.f1398a = 1;
            if (M.d(this.f1399b, this) == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
        }
        return C0297i.f5732a;
    }
}
