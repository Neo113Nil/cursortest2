package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3043vh extends AbstractC2696i6 {

    /* renamed from: b, reason: collision with root package name */
    public final C2953s5 f39979b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3017uh f39980c;

    /* renamed from: d, reason: collision with root package name */
    public final Y3 f39981d;

    public C3043vh(@NonNull C2953s5 c2953s5, @NonNull InterfaceC3017uh interfaceC3017uh) {
        this(c2953s5, interfaceC3017uh, new Y3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC2696i6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C3095xh load(@NonNull C2670h6 c2670h6) {
        C3095xh c3095xh = (C3095xh) super.load(c2670h6);
        c3095xh.f40186m = ((C2965sh) c2670h6.componentArguments).f39797a;
        c3095xh.f40191r = this.f39979b.f39784t.a();
        c3095xh.f40196w = this.f39979b.f39781q.a();
        C2965sh c2965sh = (C2965sh) c2670h6.componentArguments;
        c3095xh.f40177d = c2965sh.f39798b;
        c3095xh.f40178e = c2965sh.f39799c;
        c3095xh.f40179f = c2965sh.f39800d;
        c3095xh.f40182i = c2965sh.f39801e;
        c3095xh.f40180g = c2965sh.f39802f;
        c3095xh.f40181h = c2965sh.f39803g;
        Boolean valueOf = Boolean.valueOf(c2965sh.f39804h);
        InterfaceC3017uh interfaceC3017uh = this.f39980c;
        c3095xh.f40183j = valueOf;
        c3095xh.f40184k = interfaceC3017uh;
        C2965sh c2965sh2 = (C2965sh) c2670h6.componentArguments;
        c3095xh.f40195v = c2965sh2.f39806j;
        C2633fm c2633fm = c2670h6.f39126a;
        G4 g4 = c2633fm.f38992n;
        c3095xh.f40187n = g4.f37558a;
        Le le = c2633fm.f38997s;
        if (le != null) {
            c3095xh.f40192s = le.f37920a;
            c3095xh.f40193t = le.f37921b;
        }
        c3095xh.f40188o = g4.f37559b;
        c3095xh.f40190q = c2633fm.f38983e;
        c3095xh.f40189p = c2633fm.f38989k;
        Y3 y32 = this.f39981d;
        Map<String, String> map = c2965sh2.f39805i;
        V3 e4 = Ia.f37730F.e();
        y32.getClass();
        c3095xh.f40194u = Y3.a(map, c2633fm, e4);
        return c3095xh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C3095xh(this.f39979b);
    }

    public C3043vh(C2953s5 c2953s5, InterfaceC3017uh interfaceC3017uh, Y3 y32) {
        super(c2953s5.getContext(), c2953s5.b().c());
        this.f39979b = c2953s5;
        this.f39980c = interfaceC3017uh;
        this.f39981d = y32;
    }

    @NonNull
    public final C3095xh a() {
        return new C3095xh(this.f39979b);
    }
}
