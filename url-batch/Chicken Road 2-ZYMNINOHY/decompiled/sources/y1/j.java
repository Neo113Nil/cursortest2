package y1;

import android.app.Activity;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import j1.ExecutorC1174c;
import o3.p;
import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class j extends h3.g implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f16251a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f16253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f16254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, Activity activity, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f16253c = bVar;
        this.f16254d = activity;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        j jVar = new j(this.f16253c, this.f16254d, interfaceC0425c);
        jVar.f16252b = obj;
        return jVar;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((z3.p) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f16251a;
        if (i4 == 0) {
            O3.l.w(obj);
            z3.p pVar = (z3.p) this.f16252b;
            i iVar = new i(pVar);
            b bVar = this.f16253c;
            ((InterfaceC1581a) bVar.f16236c).a(this.f16254d, new ExecutorC1174c(0), iVar);
            M.b bVar2 = new M.b(bVar, 1, iVar);
            this.f16251a = 1;
            if (z3.j.b(pVar, bVar2, this) == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
        }
        return C0297i.f5732a;
    }
}
