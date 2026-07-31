package r0;

import e2.InterfaceC0426e;
import java.util.List;

/* renamed from: r0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928y extends t0.B {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0881C f8196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f8197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928y(C0881C c0881c, InterfaceC0426e interfaceC0426e, String str) {
        super(str);
        this.f8196b = c0881c;
        this.f8197c = interfaceC0426e;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        C0881C c0881c = this.f8196b;
        O0.k layoutDirection = interfaceC0887I.getLayoutDirection();
        C0926w c0926w = c0881c.f8107k;
        c0926w.f8187d = layoutDirection;
        c0926w.f8188e = interfaceC0887I.a();
        c0926w.f8189f = interfaceC0887I.r();
        boolean D = interfaceC0887I.D();
        InterfaceC0426e interfaceC0426e = this.f8197c;
        if (D || c0881c.f8100d.f8542f == null) {
            c0881c.f8103g = 0;
            InterfaceC0886H interfaceC0886H = (InterfaceC0886H) interfaceC0426e.h(c0926w, new O0.a(j3));
            return new C0927x(interfaceC0886H, c0881c, c0881c.f8103g, interfaceC0886H, 1);
        }
        c0881c.f8104h = 0;
        InterfaceC0886H interfaceC0886H2 = (InterfaceC0886H) interfaceC0426e.h(c0881c.f8108l, new O0.a(j3));
        return new C0927x(interfaceC0886H2, c0881c, c0881c.f8104h, interfaceC0886H2, 0);
    }
}
