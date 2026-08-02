package g0;

import android.app.Activity;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import h0.InterfaceC0338a;
import l2.p;
import t2.InterfaceC1210u;

/* loaded from: classes.dex */
public final class i extends f2.i implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f5029e;
    public /* synthetic */ InterfaceC1210u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0330b f5030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f5031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0330b c0330b, Activity activity, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f5030g = c0330b;
        this.f5031h = activity;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        i iVar = new i(this.f5030g, this.f5031h, interfaceC0300c);
        iVar.f = (InterfaceC1210u) obj;
        return iVar;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i3 = this.f5029e;
        if (i3 == 0) {
            android.support.v4.media.session.a.T(obj);
            v2.p pVar = (v2.p) this.f;
            E1.p pVar2 = new E1.p(1, pVar);
            C0330b c0330b = this.f5030g;
            ((InterfaceC0338a) c0330b.f5016b).b(this.f5031h, new S.c(), pVar2);
            M.b bVar = new M.b(c0330b, 1, pVar2);
            this.f5029e = 1;
            if (v2.j.b(pVar, bVar, this) == enumC0317a) {
                return enumC0317a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.a.T(obj);
        }
        return C0195i.f2555a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) b((InterfaceC0300c) obj2, (v2.p) obj)).g(C0195i.f2555a);
    }
}
