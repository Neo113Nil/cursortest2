package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2372yj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ni2 implements AbstractC2372yj.a<lc1> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final xp1<lc1> f29654a = null;

    @Override // com.yandex.mobile.ads.impl.qq1.a
    public final void a(@NotNull hi2 error) {
        hb2 hb2Var;
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.f26761b == null) {
            String message = error.getMessage();
            if (message == null) {
                message = "Ad request failed with network error";
            }
            hb2Var = new hb2(2, message);
        } else {
            Intrinsics.checkNotNullParameter("Ping error", "description");
            hb2Var = new hb2(1, "Ping error");
        }
        xp1<lc1> xp1Var = this.f29654a;
        if (xp1Var != null) {
            xp1Var.a(hb2Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq1.b
    public final void a(Object obj) {
        lc1 response = (lc1) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        xp1<lc1> xp1Var = this.f29654a;
        if (xp1Var != null) {
            xp1Var.a((xp1<lc1>) response);
        }
    }
}
