package s;

import k2.InterfaceC0550w;
import m.AbstractC0595e;
import m.C0590b0;
import m.C0603m;

/* renamed from: s.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879v extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f7471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0880w f7472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0879v(C0880w c0880w, P1.d dVar) {
        super(2, dVar);
        this.f7472f = c0880w;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0879v(this.f7472f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0879v) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f7471e;
        if (i3 == 0) {
            I2.l.Q(obj);
            C0603m c0603m = this.f7472f.f7494v;
            Float f3 = new Float(0.0f);
            C0590b0 h3 = AbstractC0595e.h(400.0f, new Float(0.5f), 1);
            this.f7471e = 1;
            if (AbstractC0595e.d(c0603m, f3, h3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
