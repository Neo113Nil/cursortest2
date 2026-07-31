package L5;

import H5.InterfaceC0163x;
import k5.v;
import kotlin.jvm.internal.s;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class i extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f1510f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ K5.b f1512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ K5.d f1513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(K5.b bVar, K5.d dVar, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f1512h = bVar;
        this.f1513i = dVar;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        i iVar = new i(this.f1512h, this.f1513i, interfaceC0564d);
        iVar.f1511g = obj;
        return iVar;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1510f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            InterfaceC0163x interfaceC0163x = (InterfaceC0163x) this.f1511g;
            s sVar = new s();
            K5.b bVar = this.f1512h;
            K5.c cVar = (K5.c) bVar.f1390k;
            h hVar = new h(sVar, interfaceC0163x, bVar, this.f1513i);
            this.f1510f = 1;
            if (cVar.c(hVar, this) == enumC0580a) {
                return enumC0580a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
        }
        return v.f5219a;
    }
}
