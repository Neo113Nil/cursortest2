package t1;

import D.C0120c;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s1.C1193i;

/* loaded from: classes.dex */
public final class k extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1193i f10663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f10664e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P.i f10665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.v f10666j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f10667k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C1193i c1193i, p pVar, P.i iVar, Q.v vVar, o oVar) {
        super(2);
        this.f10663d = c1193i;
        this.f10664e = pVar;
        this.f10665i = iVar;
        this.f10666j = vVar;
        this.f10667k = oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            C1193i c1193i = this.f10663d;
            boolean h4 = c0216p.h(c1193i);
            p pVar = this.f10664e;
            boolean f4 = h4 | c0216p.f(pVar);
            Object I3 = c0216p.I();
            if (f4 || I3 == C0208l.f2826a) {
                I3 = new P.h(this.f10666j, c1193i, pVar, 12);
                c0216p.c0(I3);
            }
            C0192d.d(c1193i, (Function1) I3, c0216p);
            m3.o.b(c1193i, this.f10665i, O.f.b(-497631156, new C0120c(this.f10667k, 13, c1193i), c0216p), c0216p, 384);
        }
        return Unit.f7487a;
    }
}
