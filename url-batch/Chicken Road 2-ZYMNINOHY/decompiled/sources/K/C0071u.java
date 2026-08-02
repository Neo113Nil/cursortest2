package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import o3.InterfaceC1339l;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071u extends h3.g implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public int f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f1419b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0071u(E e4, InterfaceC0425c interfaceC0425c) {
        super(1, interfaceC0425c);
        this.f1419b = e4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(InterfaceC0425c interfaceC0425c) {
        return new C0071u(this.f1419b, interfaceC0425c);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        return ((C0071u) create((InterfaceC0425c) obj)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1418a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
            return obj;
        }
        O3.l.w(obj);
        this.f1418a = 1;
        Object invoke = this.f1419b.invoke(this);
        return invoke == enumC0441a ? enumC0441a : invoke;
    }
}
