package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* renamed from: K.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068q extends h3.g implements o3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1403a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1404b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1405c;

    public /* synthetic */ C0068q(int i4, InterfaceC0425c interfaceC0425c) {
        super(i4, interfaceC0425c);
    }

    @Override // o3.q
    public final Object a(Object obj, Object obj2, h3.c cVar) {
        switch (this.f1403a) {
            case 0:
                return new C0068q((M) this.f1405c, cVar).invokeSuspend(C0297i.f5732a);
            default:
                ((Boolean) obj2).getClass();
                C0068q c0068q = new C0068q(3, cVar);
                c0068q.f1405c = (O) obj;
                return c0068q.invokeSuspend(C0297i.f5732a);
        }
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1403a) {
            case 0:
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                int i4 = this.f1404b;
                if (i4 == 0) {
                    O3.l.w(obj);
                    M m4 = (M) this.f1405c;
                    this.f1404b = 1;
                    if (M.b(m4, this) == enumC0441a) {
                        return enumC0441a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    O3.l.w(obj);
                }
                return C0297i.f5732a;
            default:
                EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                int i5 = this.f1404b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    O3.l.w(obj);
                    return obj;
                }
                O3.l.w(obj);
                O o = (O) this.f1405c;
                this.f1404b = 1;
                o.getClass();
                Object a3 = O.a(o, this);
                return a3 == enumC0441a2 ? enumC0441a2 : a3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068q(M m4, h3.c cVar) {
        super(3, cVar);
        this.f1405c = m4;
    }
}
