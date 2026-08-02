package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694ih extends M5 {

    /* renamed from: b, reason: collision with root package name */
    public final X4 f12045b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0669hh f12046c;

    /* renamed from: d, reason: collision with root package name */
    public final C3 f12047d;

    public C0694ih(X4 x4, InterfaceC0669hh interfaceC0669hh) {
        this(x4, interfaceC0669hh, new C3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0746kh load(L5 l5) {
        C0746kh c0746kh = (C0746kh) super.load(l5);
        c0746kh.f12231m = ((C0617fh) l5.componentArguments).f11841a;
        c0746kh.f12234r = this.f12045b.f11239t.a();
        c0746kh.f12238w = this.f12045b.f11236q.a();
        C0617fh c0617fh = (C0617fh) l5.componentArguments;
        c0746kh.f12222d = c0617fh.f11842b;
        c0746kh.f12223e = c0617fh.f11843c;
        c0746kh.f12224f = c0617fh.f11844d;
        c0746kh.f12227i = c0617fh.f11845e;
        c0746kh.f12225g = c0617fh.f11846f;
        c0746kh.f12226h = c0617fh.f11847g;
        Boolean valueOf = Boolean.valueOf(c0617fh.f11848h);
        InterfaceC0669hh interfaceC0669hh = this.f12046c;
        c0746kh.f12228j = valueOf;
        c0746kh.f12229k = interfaceC0669hh;
        C0617fh c0617fh2 = (C0617fh) l5.componentArguments;
        c0746kh.v = c0617fh2.f11850j;
        C0622fm c0622fm = l5.f10564a;
        C0759l4 c0759l4 = c0622fm.n;
        c0746kh.n = c0759l4.f12259a;
        C1080xe c1080xe = c0622fm.f11876s;
        if (c1080xe != null) {
            c0746kh.f12235s = c1080xe.f13024a;
            c0746kh.f12236t = c1080xe.f13025b;
        }
        c0746kh.o = c0759l4.f12260b;
        c0746kh.f12233q = c0622fm.f11864e;
        c0746kh.f12232p = c0622fm.f11870k;
        C3 c32 = this.f12047d;
        Map<String, String> map = c0617fh2.f11849i;
        C1121z3 f4 = C0817na.f12417I.f();
        c32.getClass();
        c0746kh.f12237u = C3.a(map, c0622fm, f4);
        c0746kh.f12239x = this.f12045b.v.f12557e.keySet();
        return c0746kh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0746kh(this.f12045b);
    }

    public C0694ih(X4 x4, InterfaceC0669hh interfaceC0669hh, C3 c32) {
        super(x4.getContext(), x4.b().c());
        this.f12045b = x4;
        this.f12046c = interfaceC0669hh;
        this.f12047d = c32;
    }

    public final C0746kh a() {
        return new C0746kh(this.f12045b);
    }
}
