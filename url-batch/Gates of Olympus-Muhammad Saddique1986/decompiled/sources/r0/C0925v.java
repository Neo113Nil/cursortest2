package r0;

import e2.InterfaceC0424c;
import java.util.Map;
import t0.C1005s;
import t0.C1006t;

/* renamed from: r0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925v implements InterfaceC0886H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f8183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0926w f8184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0881C f8185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f8186f;

    public C0925v(int i3, int i4, Map map, C0926w c0926w, C0881C c0881c, InterfaceC0424c interfaceC0424c) {
        this.f8181a = i3;
        this.f8182b = i4;
        this.f8183c = map;
        this.f8184d = c0926w;
        this.f8185e = c0881c;
        this.f8186f = interfaceC0424c;
    }

    @Override // r0.InterfaceC0886H
    public final int f() {
        return this.f8181a;
    }

    @Override // r0.InterfaceC0886H
    public final int h() {
        return this.f8182b;
    }

    @Override // r0.InterfaceC0886H
    public final Map i() {
        return this.f8183c;
    }

    @Override // r0.InterfaceC0886H
    public final void j() {
        C1005s c1005s;
        boolean D = this.f8184d.D();
        InterfaceC0424c interfaceC0424c = this.f8186f;
        C0881C c0881c = this.f8185e;
        if (!D || (c1005s = ((C1006t) c0881c.f8100d.f8561y.f2912c).f8790N) == null) {
            interfaceC0424c.n(((C1006t) c0881c.f8100d.f8561y.f2912c).f8655l);
        } else {
            interfaceC0424c.n(c1005s.f8655l);
        }
    }

    @Override // r0.InterfaceC0886H
    public final InterfaceC0424c k() {
        return null;
    }
}
