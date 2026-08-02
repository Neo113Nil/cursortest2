package S0;

import A0.d;
import A0.f;
import B0.p;
import C0.n;
import V0.e;
import a2.InterfaceC0133a;
import android.content.Context;
import b0.r;
import f0.C0322a;
import l.t0;
import v0.j;
import v0.l;
import x0.C1238a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Context f1334a;

    public j a() {
        Context context = this.f1334a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        j jVar = new j();
        jVar.f10557a = C1238a.a(l.f10564a);
        r rVar = new r(context);
        jVar.f10558b = rVar;
        jVar.f10559c = C1238a.a(new C0322a(rVar, 16, new n(rVar, 1)));
        r rVar2 = jVar.f10558b;
        jVar.f10560d = new n(rVar2, 0);
        InterfaceC0133a a3 = C1238a.a(new e(jVar.f10560d, 2, C1238a.a(new C0.e(0, rVar2))));
        jVar.f10561e = a3;
        K0.j jVar2 = new K0.j(1);
        r rVar3 = jVar.f10558b;
        f fVar = new f(rVar3, a3, jVar2, 0);
        InterfaceC0133a interfaceC0133a = jVar.f10557a;
        InterfaceC0133a interfaceC0133a2 = jVar.f10559c;
        d dVar = new d(interfaceC0133a, interfaceC0133a2, fVar, a3, a3);
        t0 t0Var = new t0();
        t0Var.f9909a = rVar3;
        t0Var.f9910b = interfaceC0133a2;
        t0Var.f9911c = a3;
        t0Var.f9912d = fVar;
        t0Var.f9913e = interfaceC0133a;
        t0Var.f = a3;
        t0Var.f9914g = a3;
        jVar.f = C1238a.a(new f(dVar, t0Var, new p(interfaceC0133a, a3, fVar, a3), 26));
        return jVar;
    }
}
