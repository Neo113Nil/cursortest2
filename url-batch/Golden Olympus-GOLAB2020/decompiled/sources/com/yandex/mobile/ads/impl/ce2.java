package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C1933fm;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.t60;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ce2 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private static volatile n30 f24186a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f24187b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24188c = 0;

    private static n30 a(Context context) {
        Context context2 = context.getApplicationContext();
        z12 databaseProvider = new z12(context2);
        int i4 = t60.f32227e;
        t60 a4 = t60.a.a();
        Intrinsics.checkNotNull(context2);
        InterfaceC1837bm cache = a4.a(context2);
        dz.a upstreamFactory = new dz.a(context2, new wu1(xs1.a()).a(context2));
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Intrinsics.checkNotNull(executor);
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(upstreamFactory, "upstreamFactory");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return new n30(context2, new ez(databaseProvider, 0), new fz(new C1933fm.a().a(cache).a(upstreamFactory), executor));
    }

    @Nullable
    public static n30 b(@NotNull Context context) {
        n30 n30Var;
        Intrinsics.checkNotNullParameter(context, "context");
        n30 n30Var2 = f24186a;
        if (n30Var2 != null) {
            return n30Var2;
        }
        synchronized (f24187b) {
            n30 n30Var3 = f24186a;
            if (n30Var3 != null) {
                return n30Var3;
            }
            try {
                n30Var = a(context);
                f24186a = n30Var;
            } catch (Throwable th) {
                th.toString();
                ap0.b(new Object[0]);
                n30Var = null;
            }
            return n30Var;
        }
    }
}
