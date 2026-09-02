package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* renamed from: K.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066o extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1400a;

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        C0066o c0066o = new C0066o(2, interfaceC0425c);
        c0066o.f1400a = obj;
        return c0066o;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0066o) create((h0) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        O3.l.w(obj);
        return Boolean.valueOf(!(((h0) this.f1400a) instanceof X));
    }
}
