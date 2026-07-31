package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zm2 implements i92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final zm2 f35627a = new zm2();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f35628b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile ym2 f35629c;

    private zm2() {
    }

    @Override // com.yandex.mobile.ads.impl.i92
    @NotNull
    public final g92 a(@NotNull Context context) {
        ym2 ym2Var;
        Intrinsics.checkNotNullParameter(context, "context");
        ym2 ym2Var2 = f35629c;
        if (ym2Var2 != null) {
            return ym2Var2;
        }
        synchronized (f35628b) {
            try {
                ym2Var = f35629c;
                if (ym2Var == null) {
                    String str = C2385z9.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    C2068le c2068le = new C2068le(context);
                    c2068le.a(str);
                    int i4 = ew1.f25476l;
                    ym2Var = new ym2(c2068le, context, ew1.a.a().a(context));
                    f35629c = ym2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ym2Var;
    }
}
