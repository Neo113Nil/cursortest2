package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aq;
import com.yandex.mobile.ads.impl.xr0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xp implements vp, xr0.a {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final Object f34650j = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final u62 f34651b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final u62 f34652c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private String f34653d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private String f34654e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f34655f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private String f34656g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private String f34657h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private String f34658i;

    public xp(@NotNull yp cmpV1, @NotNull zp cmpV2, @NotNull xr0 preferences) {
        Intrinsics.checkNotNullParameter(cmpV1, "cmpV1");
        Intrinsics.checkNotNullParameter(cmpV2, "cmpV2");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f34651b = cmpV1;
        this.f34652c = cmpV2;
        for (tp tpVar : tp.values()) {
            a(preferences, tpVar);
        }
        preferences.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.vp
    @Nullable
    public final String a() {
        String str;
        synchronized (f34650j) {
            str = this.f34654e;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.vp
    @Nullable
    public final String b() {
        String str;
        synchronized (f34650j) {
            str = this.f34653d;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.vp
    @Nullable
    public final String c() {
        String str;
        synchronized (f34650j) {
            str = this.f34656g;
        }
        return str;
    }

    @Nullable
    public final String d() {
        String str;
        synchronized (f34650j) {
            str = this.f34658i;
        }
        return str;
    }

    public final boolean e() {
        boolean z4;
        synchronized (f34650j) {
            z4 = this.f34655f;
        }
        return z4;
    }

    @Nullable
    public final String f() {
        String str;
        synchronized (f34650j) {
            str = this.f34657h;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.xr0.a
    public final void a(@NotNull xr0 localStorage, @NotNull String key) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (f34650j) {
            try {
                aq a4 = this.f34652c.a(localStorage, key);
                if (a4 == null) {
                    a4 = this.f34651b.a(localStorage, key);
                }
                if (a4 != null) {
                    a(a4);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void a(xr0 xr0Var, tp tpVar) {
        aq a4 = this.f34652c.a(xr0Var, tpVar);
        if (a4 == null) {
            a4 = this.f34651b.a(xr0Var, tpVar);
        }
        a(a4);
    }

    private final void a(aq aqVar) {
        if (aqVar instanceof aq.b) {
            this.f34655f = ((aq.b) aqVar).a();
            return;
        }
        if (aqVar instanceof aq.c) {
            this.f34653d = ((aq.c) aqVar).a();
            return;
        }
        if (aqVar instanceof aq.d) {
            this.f34654e = ((aq.d) aqVar).a();
            return;
        }
        if (aqVar instanceof aq.e) {
            this.f34656g = ((aq.e) aqVar).a();
        } else if (aqVar instanceof aq.f) {
            this.f34657h = ((aq.f) aqVar).a();
        } else if (aqVar instanceof aq.a) {
            this.f34658i = ((aq.a) aqVar).a();
        }
    }
}
