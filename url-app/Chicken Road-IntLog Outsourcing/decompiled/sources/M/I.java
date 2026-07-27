package M;

import D4.InterfaceC0022w;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class I extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f1586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.h f1587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0075d f1588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(InterfaceC1445p interfaceC1445p, C0075d c0075d, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1587b = (m4.h) interfaceC1445p;
        this.f1588c = c0075d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new I(this.f1587b, this.f1588c, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1586a;
        if (i2 == 0) {
            e5.g.y(obj);
            Object obj2 = this.f1588c.f1667b;
            this.f1586a = 1;
            obj = this.f1587b.invoke(obj2, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return obj;
    }
}
