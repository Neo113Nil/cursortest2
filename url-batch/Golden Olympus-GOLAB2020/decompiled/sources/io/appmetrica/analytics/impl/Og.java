package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Og implements Ql, InterfaceC2515bb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38081a;

    /* renamed from: b, reason: collision with root package name */
    public final C2772l5 f38082b;

    /* renamed from: c, reason: collision with root package name */
    public final C2798m5 f38083c;

    /* renamed from: d, reason: collision with root package name */
    public final Bm f38084d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2752kb f38085e;

    public Og(@NotNull Context context, @NotNull C2772l5 c2772l5, @NotNull K4 k4, @NotNull InterfaceC2979t5 interfaceC2979t5, @NotNull C2798m5 c2798m5, @NotNull Hl hl) {
        this.f38081a = context;
        this.f38082b = c2772l5;
        this.f38083c = c2798m5;
        Bm a4 = hl.a(context, c2772l5, k4.f37861a);
        this.f38084d = a4;
        this.f38085e = interfaceC2979t5.a(context, c2772l5, k4.f37862b, a4);
        hl.a(c2772l5, this);
    }

    @NotNull
    public final C2772l5 a() {
        return this.f38082b;
    }

    @NotNull
    public final Context b() {
        return this.f38081a;
    }

    public final void a(@NotNull A4 a4) {
        this.f38083c.f39439a.add(a4);
    }

    public final void b(@NotNull A4 a4) {
        this.f38083c.f39439a.remove(a4);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NotNull C2633fm c2633fm) {
        this.f38085e.a(c2633fm);
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(@NotNull Jl jl, @Nullable C2633fm c2633fm) {
        ((C2953s5) this.f38085e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2515bb
    public final void a(@NotNull K4 k4) {
        this.f38084d.a(k4.f37861a);
        this.f38085e.a(k4.f37862b);
    }

    public Og(@NotNull Context context, @NotNull C2772l5 c2772l5, @NotNull K4 k4, @NotNull InterfaceC2979t5 interfaceC2979t5) {
        this(context, c2772l5, k4, interfaceC2979t5, new C2798m5(), Hl.a());
    }

    public final void a(@NotNull C2773l6 c2773l6, @NotNull K4 k4) {
        if (!R9.f38188c.contains(EnumC3063wb.a(c2773l6.f39379d))) {
            this.f38085e.a(k4.f37862b);
        }
        ((C2953s5) this.f38085e).a(c2773l6);
    }
}
