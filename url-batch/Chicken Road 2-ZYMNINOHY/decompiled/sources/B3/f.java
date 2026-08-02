package B3;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class f extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f232a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f234c = gVar;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        f fVar = new f(this.f234c, interfaceC0425c);
        fVar.f233b = obj;
        return fVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((A3.e) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f232a;
        C0297i c0297i = C0297i.f5732a;
        if (i4 == 0) {
            O3.l.w(obj);
            A3.e eVar = (A3.e) this.f233b;
            this.f232a = 1;
            Object collect = this.f234c.f235d.collect(eVar, this);
            if (collect != enumC0441a) {
                collect = c0297i;
            }
            if (collect == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
        }
        return c0297i;
    }
}
