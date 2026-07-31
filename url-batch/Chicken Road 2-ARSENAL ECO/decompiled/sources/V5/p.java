package V5;

import k5.C0472b;
import o5.C0570j;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0605a;
import u0.AbstractC0676f;
import x5.InterfaceC0748q;

/* loaded from: classes.dex */
public final class p extends AbstractC0605a implements InterfaceC0748q, kotlin.jvm.internal.f {

    /* renamed from: f, reason: collision with root package name */
    public final int f2743f;

    /* renamed from: g, reason: collision with root package name */
    public int f2744g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ C0472b f2745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.j f2746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(A.j jVar, InterfaceC0564d interfaceC0564d) {
        super(interfaceC0564d);
        this.f2746i = jVar;
        if (interfaceC0564d != null && interfaceC0564d.getContext() != C0570j.f5620f) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f2743f = 3;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f2743f;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return C0570j.f5620f;
    }

    @Override // x5.InterfaceC0748q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.f2746i, (InterfaceC0564d) obj3);
        pVar.f2745h = (C0472b) obj;
        return pVar.invokeSuspend(k5.v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        A.j jVar = this.f2746i;
        u uVar = (u) jVar.f27c;
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f2744g;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            C0472b c0472b = this.f2745h;
            byte p4 = uVar.p();
            if (p4 == 1) {
                return jVar.f(true);
            }
            if (p4 == 0) {
                return jVar.f(false);
            }
            if (p4 != 6) {
                if (p4 == 8) {
                    return jVar.e();
                }
                u.m(uVar, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f2744g = 1;
            obj = A.j.a(jVar, c0472b, this);
            if (obj == enumC0580a) {
                return enumC0580a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
        }
        return (U5.k) obj;
    }

    @Override // q5.AbstractC0605a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kotlin.jvm.internal.t.f5234a.getClass();
        String a7 = kotlin.jvm.internal.u.a(this);
        kotlin.jvm.internal.i.d(a7, "renderLambdaToString(...)");
        return a7;
    }
}
