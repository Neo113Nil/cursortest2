package w1;

import A3.d;
import A3.q;
import O3.l;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import h3.g;
import o3.p;
import x3.InterfaceC1560u;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f15919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.a f15920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502a(d dVar, D.a aVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f15919b = dVar;
        this.f15920c = aVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new C1502a(this.f15919b, this.f15920c, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1502a) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f15918a;
        if (i4 == 0) {
            l.w(obj);
            q qVar = new q(3, this.f15920c);
            this.f15918a = 1;
            if (this.f15919b.collect(qVar, this) == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.w(obj);
        }
        return C0297i.f5732a;
    }
}
