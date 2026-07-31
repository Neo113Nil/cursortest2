package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gi0 implements hi0 {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Object f26162h = new Object();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2020je f26163a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2229se f26164b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2184qe f26165c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f26166d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private C2138oe f26167e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ii0 f26168f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f26169g;

    public gi0(@NotNull Context context, @NotNull InterfaceC2020je appMetricaAdapter, @NotNull C2229se appMetricaIdentifiersValidator, @NotNull C2184qe appMetricaIdentifiersLoader, @NotNull vt0 mauidManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersValidator, "appMetricaIdentifiersValidator");
        Intrinsics.checkNotNullParameter(appMetricaIdentifiersLoader, "appMetricaIdentifiersLoader");
        Intrinsics.checkNotNullParameter(mauidManager, "mauidManager");
        this.f26163a = appMetricaAdapter;
        this.f26164b = appMetricaIdentifiersValidator;
        this.f26165c = appMetricaIdentifiersLoader;
        this.f26168f = ii0.f27207b;
        this.f26169g = mauidManager.a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f26166d = applicationContext;
    }

    @Override // com.yandex.mobile.ads.impl.hi0
    @NotNull
    public final String a() {
        return this.f26169g;
    }

    @Override // com.yandex.mobile.ads.impl.hi0
    @NotNull
    public final C2138oe b() {
        C2138oe c2138oe;
        kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        synchronized (f26162h) {
            try {
                c2138oe = this.f26167e;
                if (c2138oe == null) {
                    C2138oe c2138oe2 = new C2138oe(null, this.f26163a.b(this.f26166d), this.f26163a.a(this.f26166d));
                    this.f26165c.a(this.f26166d, this);
                    c2138oe = c2138oe2;
                }
                g4.f41132b = c2138oe;
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2138oe;
    }

    @Override // com.yandex.mobile.ads.impl.hi0
    @NotNull
    public final ii0 c() {
        return this.f26168f;
    }

    public final void a(@NotNull C2138oe appMetricaIdentifiers) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        synchronized (f26162h) {
            try {
                this.f26164b.getClass();
                if (C2229se.a(appMetricaIdentifiers)) {
                    this.f26167e = appMetricaIdentifiers;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
