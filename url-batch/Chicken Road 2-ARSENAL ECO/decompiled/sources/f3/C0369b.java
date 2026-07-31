package f3;

import H5.InterfaceC0163x;
import b4.i;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import u0.AbstractC0676f;
import u0.C0675e;
import x5.InterfaceC0747p;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369b extends g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public int f4199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0370c f4200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Thread f4201h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Throwable f4202i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0369b(C0370c c0370c, Thread thread, Throwable th, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f4200g = c0370c;
        this.f4201h = thread;
        this.f4202i = th;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        return new C0369b(this.f4200g, this.f4201h, this.f4202i, interfaceC0564d);
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0369b) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2)).invokeSuspend(v.f5219a);
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f4199f;
        v vVar = v.f5219a;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            C0675e c0675e = this.f4200g.f4203a;
            this.f4199f = 1;
            Object i8 = c0675e.i(this.f4201h, this.f4202i, i.FATAL, true, this);
            if (i8 != enumC0580a) {
                i8 = vVar;
            }
            if (i8 == enumC0580a) {
                return enumC0580a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0676f.w(obj);
        }
        return vVar;
    }
}
