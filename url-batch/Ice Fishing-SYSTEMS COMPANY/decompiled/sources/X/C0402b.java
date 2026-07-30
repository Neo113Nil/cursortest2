package X;

import java.util.List;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402b extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3547n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3548u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f3549v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402b(List list, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3549v = list;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        C0402b c0402b = new C0402b(this.f3549v, interfaceC5133d);
        c0402b.f3548u = obj;
        return c0402b;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0402b) create((v) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3547n;
        if (i == 0) {
            com.bumptech.glide.f.r(obj);
            v vVar = (v) this.f3548u;
            this.f3547n = 1;
            if (S0.f.a(this.f3549v, vVar, this) == enumC5179a) {
                return enumC5179a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
        }
        return q7.v.f40183a;
    }
}
