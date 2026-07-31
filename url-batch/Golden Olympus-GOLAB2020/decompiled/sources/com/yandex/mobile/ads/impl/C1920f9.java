package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.f9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1920f9 {

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f25708c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C2286v2 f25709a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f25710b;

    /* renamed from: com.yandex.mobile.ads.impl.f9$a */
    private static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f25711b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final j82 f25712c;

        public a(@NotNull String url, @NotNull j82 tracker) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            this.f25711b = url;
            this.f25712c = tracker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f25711b.length() > 0) {
                this.f25712c.a(this.f25711b);
            }
        }
    }

    static {
        String str;
        str = t31.f32142b;
        f25708c = Executors.newCachedThreadPool(new t31(str));
    }

    public C1920f9(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f25709a = adConfiguration;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f25710b = applicationContext;
    }

    public final void a(@Nullable String str, @NotNull C2360y7 adResponse, @NotNull C2171q1 handler) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(handler, "handler");
        a(str, handler, new po(this.f25710b, adResponse, this.f25709a, null));
    }

    public final void a(@Nullable String str, @NotNull u32 handler, @NotNull np1 reporter) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Context context = this.f25710b;
        xj1 xj1Var = new xj1(context, reporter, handler, new h82(context));
        if (str == null || str.length() <= 0) {
            return;
        }
        f25708c.execute(new a(str, xj1Var));
    }

    public final void a(@Nullable String str, @NotNull o62 trackingUrlType) {
        Intrinsics.checkNotNullParameter(trackingUrlType, "trackingUrlType");
        dh1 dh1Var = new dh1(this.f25710b, this.f25709a, trackingUrlType);
        if (str == null || str.length() <= 0) {
            return;
        }
        f25708c.execute(new a(str, dh1Var));
    }
}
