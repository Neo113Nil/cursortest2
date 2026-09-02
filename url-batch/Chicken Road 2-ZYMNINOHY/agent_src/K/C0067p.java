package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* renamed from: K.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067p extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f1402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067p(h0 h0Var, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1402b = h0Var;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        C0067p c0067p = new C0067p(this.f1402b, interfaceC0425c);
        c0067p.f1401a = obj;
        return c0067p;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0067p) create((h0) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        O3.l.w(obj);
        h0 h0Var = (h0) this.f1401a;
        return Boolean.valueOf((h0Var instanceof C0054c) && h0Var.f1365a <= this.f1402b.f1365a);
    }
}
