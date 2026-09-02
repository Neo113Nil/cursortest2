package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import x3.InterfaceC1560u;

/* loaded from: classes.dex */
public final class G extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3.g f1248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0054c f1249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(o3.p pVar, C0054c c0054c, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1248b = (h3.g) pVar;
        this.f1249c = c0054c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        return new G(this.f1248b, this.f1249c, interfaceC0425c);
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC1560u) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h3.g, o3.p] */
    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1247a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
            return obj;
        }
        O3.l.w(obj);
        Object obj2 = this.f1249c.f1333b;
        this.f1247a = 1;
        Object invoke = this.f1248b.invoke(obj2, this);
        return invoke == enumC0441a ? enumC0441a : invoke;
    }
}
