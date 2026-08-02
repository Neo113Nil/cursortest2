package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import o3.InterfaceC1339l;

/* renamed from: K.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057f extends h3.g implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public int f1355a;

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(InterfaceC0425c interfaceC0425c) {
        return new C0057f(1, interfaceC0425c);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        C0057f c0057f = (C0057f) create((InterfaceC0425c) obj);
        C0297i c0297i = C0297i.f5732a;
        c0057f.invokeSuspend(c0297i);
        return c0297i;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1355a;
        if (i4 == 0) {
            O3.l.w(obj);
            this.f1355a = 1;
            throw null;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        O3.l.w(obj);
        return C0297i.f5732a;
    }
}
