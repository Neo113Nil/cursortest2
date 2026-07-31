package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.yandex.mobile.ads.impl.do1;
import java.util.Arrays;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kx0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qx0 f28347a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uz0 f28348b;

    public /* synthetic */ kx0(qx0 qx0Var) {
        this(qx0Var, new uz0());
    }

    @Nullable
    public final T a(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Class<T> clazz) {
        String format;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T t4 = null;
        try {
            String e4 = mediationNetwork.e();
            this.f28348b.getClass();
            if (!uz0.a(context, e4)) {
                return null;
            }
            Object a4 = do1.a.a(e4, new Object[0]);
            T cast = clazz.cast(a4);
            if (cast == null) {
                try {
                    if (a4 == null) {
                        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
                        format = String.format("Instantiation failed for %s", Arrays.copyOf(new Object[]{e4}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    } else {
                        kotlin.jvm.internal.L l5 = kotlin.jvm.internal.L.f41137a;
                        format = String.format("Cast from %s to %s is failed", Arrays.copyOf(new Object[]{a4.getClass().getName(), clazz.getName()}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    }
                    a(context, mediationNetwork, format);
                } catch (ClassCastException e5) {
                    e = e5;
                    t4 = cast;
                    a(context, mediationNetwork, "does_not_conform_to_protocol", e);
                    return t4;
                } catch (Throwable th) {
                    th = th;
                    t4 = cast;
                    a(context, mediationNetwork, "could_not_create_adapter", th);
                    return t4;
                }
            }
            return cast;
        } catch (ClassCastException e6) {
            e = e6;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public kx0(@NotNull qx0 mediatedAdapterReporter, @NotNull uz0 mediationSupportedChecker) {
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediationSupportedChecker, "mediationSupportedChecker");
        this.f28347a = mediatedAdapterReporter;
        this.f28348b = mediationSupportedChecker;
    }

    private final void a(Context context, xy0 xy0Var, String str) {
        this.f28347a.a(context, xy0Var, MapsKt.mapOf(TuplesKt.to("reason", "could_not_create_adapter"), TuplesKt.to("description", str)), (String) null);
    }

    private final void a(Context context, xy0 xy0Var, String str, Throwable th) {
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("reason", str));
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error message";
        }
        ap0.c(new Object[0]);
        mutableMapOf.put("description", th.getClass().getName() + " " + message);
        this.f28347a.a(context, xy0Var, mutableMapOf, (String) null);
    }
}
