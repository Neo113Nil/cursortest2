package m;

import e2.InterfaceC0424c;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618c extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0619d f6733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6734i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0618c(C0619d c0619d, Object obj, V1.d dVar) {
        super(1, dVar);
        this.f6733h = c0619d;
        this.f6734i = obj;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        C0618c c0618c = new C0618c(this.f6733h, this.f6734i, (V1.d) obj);
        R1.y yVar = R1.y.f4171a;
        c0618c.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        C0619d c0619d = this.f6733h;
        C0619d.b(c0619d);
        Object a3 = C0619d.a(c0619d, this.f6734i);
        c0619d.f6759c.f6849e.setValue(a3);
        c0619d.f6761e.setValue(a3);
        return R1.y.f4171a;
    }
}
