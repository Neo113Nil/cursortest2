package t0;

import e2.InterfaceC0424c;
import java.util.Map;
import r0.InterfaceC0886H;

/* loaded from: classes.dex */
public final class N implements InterfaceC0886H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f8648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f8649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f8650e;

    public N(int i3, int i4, Map map, InterfaceC0424c interfaceC0424c, P p3) {
        this.f8646a = i3;
        this.f8647b = i4;
        this.f8648c = map;
        this.f8649d = interfaceC0424c;
        this.f8650e = p3;
    }

    @Override // r0.InterfaceC0886H
    public final int f() {
        return this.f8646a;
    }

    @Override // r0.InterfaceC0886H
    public final int h() {
        return this.f8647b;
    }

    @Override // r0.InterfaceC0886H
    public final Map i() {
        return this.f8648c;
    }

    @Override // r0.InterfaceC0886H
    public final void j() {
        this.f8649d.n(this.f8650e.f8655l);
    }

    @Override // r0.InterfaceC0886H
    public final InterfaceC0424c k() {
        return null;
    }
}
