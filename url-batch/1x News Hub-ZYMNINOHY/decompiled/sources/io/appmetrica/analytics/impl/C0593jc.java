package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
import b2.C0193g;
import b2.InterfaceC0189c;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593jc {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f7635a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0978y9 f7636b;

    /* renamed from: c, reason: collision with root package name */
    public final C0896v4 f7637c;

    /* renamed from: d, reason: collision with root package name */
    public final C0390bf f7638d;

    /* renamed from: e, reason: collision with root package name */
    public final U4 f7639e;
    public final Cc f = new Cc();

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0189c f7640g = new C0193g(new C0568ic(this));

    public C0593jc(S6 s6, Vg vg, InterfaceC0978y9 interfaceC0978y9, C0896v4 c0896v4, C0390bf c0390bf) {
        this.f7635a = vg;
        this.f7636b = interfaceC0978y9;
        this.f7637c = c0896v4;
        this.f7638d = c0390bf;
        this.f7639e = new U4(s6, vg);
    }

    public final List<K8> a() {
        return this.f7639e.a();
    }

    public final List<K8> b() {
        return c2.e.V(AbstractC0129a.r(this.f7639e.f6754c), AbstractC0129a.r((K8) ((C0193g) this.f7640g).a()));
    }
}
