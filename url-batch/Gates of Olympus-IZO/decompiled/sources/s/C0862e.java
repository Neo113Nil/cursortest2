package s;

import t0.D;
import u.InterfaceC0945m;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862e implements InterfaceC0945m {

    /* renamed from: a, reason: collision with root package name */
    public final C0880w f7360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7361b;

    public C0862e(C0880w c0880w, int i3) {
        this.f7360a = c0880w;
        this.f7361b = i3;
    }

    @Override // u.InterfaceC0945m
    public final int a() {
        return this.f7360a.g().f7430m;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // u.InterfaceC0945m
    public final int b() {
        return Math.min(a() - 1, ((C0872o) M1.l.s0(this.f7360a.g().f7427j)).f7434a + this.f7361b);
    }

    @Override // u.InterfaceC0945m
    public final int c() {
        return Math.max(0, this.f7360a.f7477d.f7452b.g() - this.f7361b);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // u.InterfaceC0945m
    public final boolean d() {
        return !this.f7360a.g().f7427j.isEmpty();
    }

    @Override // u.InterfaceC0945m
    public final void e() {
        D d3 = this.f7360a.f7483j;
        if (d3 != null) {
            d3.k();
        }
    }
}
