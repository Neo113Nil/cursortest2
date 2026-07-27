package R4;

import f4.C0425b;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1446q;

/* loaded from: classes.dex */
public final class o extends m4.g implements InterfaceC1446q, kotlin.jvm.internal.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f2690a;

    /* renamed from: b, reason: collision with root package name */
    public int f2691b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ C0425b f2692c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f2693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.f2693d = qVar;
        this.f2690a = 3;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f2690a;
    }

    @Override // t4.InterfaceC1446q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar = new o(this.f2693d, (InterfaceC1218d) obj3);
        oVar.f2692c = (C0425b) obj;
        return oVar.invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2691b;
        if (i2 == 0) {
            e5.g.y(obj);
            C0425b c0425b = this.f2692c;
            q qVar = this.f2693d;
            byte q5 = qVar.f2701a.q();
            if (q5 == 1) {
                return qVar.d(true);
            }
            if (q5 == 0) {
                return qVar.d(false);
            }
            if (q5 != 6) {
                if (q5 == 8) {
                    return qVar.c();
                }
                u.n(qVar.f2701a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f2691b = 1;
            obj = q.a(qVar, c0425b, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return (Q4.l) obj;
    }

    @Override // m4.AbstractC1293a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kotlin.jvm.internal.t.f10742a.getClass();
        String a6 = kotlin.jvm.internal.u.a(this);
        kotlin.jvm.internal.i.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
