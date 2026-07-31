package O1;

import I.InterfaceC0142c0;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0422a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ J1.b f3804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f3806f;

    public k(J1.b bVar, InterfaceC0142c0 interfaceC0142c0, InterfaceC0142c0 interfaceC0142c02) {
        this.f3804d = bVar;
        this.f3805e = interfaceC0142c0;
        this.f3806f = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        this.f3805e.setValue(this.f3804d.f3164a);
        this.f3806f.setValue(Boolean.TRUE);
        return R1.y.f4171a;
    }
}
