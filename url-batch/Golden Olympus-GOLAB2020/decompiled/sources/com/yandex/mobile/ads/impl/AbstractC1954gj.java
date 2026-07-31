package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yg1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1954gj<T> implements yg1.b, ao {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26172a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<T> f26173b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yg1 f26174c;

    public /* synthetic */ AbstractC1954gj(Context context, C2360y7 c2360y7) {
        this(context, c2360y7, yg1.f35123h.a(context));
    }

    @Override // com.yandex.mobile.ads.impl.ao
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public void c() {
        b();
        getClass().toString();
        ap0.d(new Object[0]);
    }

    @NotNull
    public final C2360y7<T> d() {
        return this.f26173b;
    }

    @NotNull
    public final Context e() {
        return this.f26172a;
    }

    protected final boolean f() {
        return !this.f26174c.b();
    }

    public final void g() {
        getClass().toString();
        ap0.d(new Object[0]);
        this.f26174c.a(this);
    }

    public final void h() {
        getClass().toString();
        ap0.d(new Object[0]);
        this.f26174c.b(this);
    }

    protected AbstractC1954gj(@NotNull Context context, @NotNull C2360y7<T> adResponse, @NotNull yg1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f26172a = context;
        this.f26173b = adResponse;
        this.f26174c = phoneStateTracker;
    }
}
