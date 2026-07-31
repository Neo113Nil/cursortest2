package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ts0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m42 f32570a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f32571b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f32572c;

    public ts0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32570a = new m42();
        this.f32571b = context.getApplicationContext();
        this.f32572c = new AtomicBoolean();
    }

    public final void a() {
        if (C2385z9.a(this.f32571b)) {
            this.f32570a.getClass();
            if (m42.a() || this.f32572c.getAndSet(true)) {
                return;
            }
            po0.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
