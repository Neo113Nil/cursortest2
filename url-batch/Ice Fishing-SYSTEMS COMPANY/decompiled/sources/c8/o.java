package c8;

import D.H;
import q7.C4933b;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class o extends x7.g implements E7.q, kotlin.jvm.internal.f {

    /* renamed from: n, reason: collision with root package name */
    public final int f5778n;

    /* renamed from: u, reason: collision with root package name */
    public int f5779u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ C4933b f5780v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G1.a f5781w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(G1.a aVar, InterfaceC5133d interfaceC5133d) {
        super(interfaceC5133d);
        this.f5781w = aVar;
        this.f5778n = 3;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f5778n;
    }

    @Override // E7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o oVar = new o(this.f5781w, (InterfaceC5133d) obj3);
        oVar.f5780v = (C4933b) obj;
        return oVar.invokeSuspend(v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f5779u;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            C4933b c4933b = this.f5780v;
            G1.a aVar = this.f5781w;
            H h9 = (H) aVar.f1195v;
            byte r9 = h9.r();
            if (r9 == 1) {
                return aVar.k(true);
            }
            if (r9 == 0) {
                return aVar.k(false);
            }
            if (r9 != 6) {
                if (r9 == 8) {
                    return aVar.j();
                }
                H.n(h9, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f5779u = 1;
            obj = G1.a.a(aVar, c4933b, this);
            if (obj == enumC5179a) {
                return enumC5179a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
        }
        return (b8.l) obj;
    }

    @Override // x7.AbstractC5217a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kotlin.jvm.internal.s.f38862a.getClass();
        String a9 = kotlin.jvm.internal.t.a(this);
        kotlin.jvm.internal.h.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
