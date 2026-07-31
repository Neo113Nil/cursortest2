package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oe2 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f30007c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private static volatile oe2 f30008d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f30009a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final cq1 f30010b;

    public static final class a {
        private a() {
        }

        @NotNull
        public final oe2 a(@NotNull Context context) {
            oe2 oe2Var;
            Intrinsics.checkNotNullParameter(context, "context");
            oe2 oe2Var2 = oe2.f30008d;
            if (oe2Var2 != null) {
                return oe2Var2;
            }
            synchronized (this) {
                oe2Var = oe2.f30008d;
                if (oe2Var == null) {
                    oe2Var = new oe2(context, 0);
                    oe2.f30008d = oe2Var;
                }
            }
            return oe2Var;
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    private oe2(Context context) {
        Context appContext = context.getApplicationContext();
        this.f30009a = appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this.f30010b = xk2.a(appContext, 4);
    }

    public final void a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = this.f30009a;
        Intrinsics.checkNotNullExpressionValue(context, "appContext");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f30010b.a(new ch1(context, url, new ni2()));
    }

    public /* synthetic */ oe2(Context context, int i4) {
        this(context);
    }
}
