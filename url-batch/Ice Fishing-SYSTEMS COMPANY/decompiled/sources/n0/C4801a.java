package n0;

import E7.p;
import O7.InterfaceC0397w;
import com.bumptech.glide.f;
import p0.C4854c;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4801a extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39619n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4804d f39620u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4801a(C4804d c4804d, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f39620u = c4804d;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new C4801a(this.f39620u, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4801a) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f39619n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
            return obj;
        }
        f.r(obj);
        C4854c c4854c = this.f39620u.f39628a;
        this.f39619n = 1;
        Object b9 = c4854c.b(this);
        return b9 == enumC5179a ? enumC5179a : b9;
    }
}
