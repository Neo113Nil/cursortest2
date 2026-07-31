package m;

import I.InterfaceC0088c0;
import k2.InterfaceC0550w;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596f extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0593d f5730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f5731h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f5732i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0596f(Object obj, C0593d c0593d, InterfaceC0088c0 interfaceC0088c0, InterfaceC0088c0 interfaceC0088c02, P1.d dVar) {
        super(2, dVar);
        this.f5729f = obj;
        this.f5730g = c0593d;
        this.f5731h = interfaceC0088c0;
        this.f5732i = interfaceC0088c02;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0596f(this.f5729f, this.f5730g, this.f5731h, this.f5732i, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0596f) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5728e;
        C0593d c0593d = this.f5730g;
        if (i3 == 0) {
            I2.l.Q(obj);
            Object value = c0593d.f5706e.getValue();
            Object obj2 = this.f5729f;
            if (!Z1.i.a(obj2, value)) {
                C0590b0 c0590b0 = AbstractC0598h.f5749a;
                InterfaceC0602l interfaceC0602l = (InterfaceC0602l) this.f5731h.getValue();
                this.f5728e = 1;
                if (C0593d.c(c0593d, obj2, interfaceC0602l, this) == aVar) {
                    return aVar;
                }
            }
            return L1.z.f2729a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        I2.l.Q(obj);
        C0590b0 c0590b02 = AbstractC0598h.f5749a;
        Y1.c cVar = (Y1.c) this.f5732i.getValue();
        if (cVar != null) {
            cVar.j(c0593d.d());
        }
        return L1.z.f2729a;
    }
}
