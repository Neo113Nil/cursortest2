package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jk2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fk2 f27716a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f27717b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private xp1<List<bb2>> f27718c;

    /* renamed from: d, reason: collision with root package name */
    private int f27719d;

    public jk2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull cd2 reportParametersProvider, @NotNull x92 requestConfigurationParametersProvider, @NotNull fk2 loader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        Intrinsics.checkNotNullParameter(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f27716a = loader;
        this.f27717b = new ArrayList();
    }

    private final class a implements xp1<List<? extends bb2>> {
        public a() {
        }

        private final void a() {
            xp1 xp1Var = jk2.this.f27718c;
            if (jk2.this.f27719d != 0 || xp1Var == null) {
                return;
            }
            xp1Var.a((xp1) jk2.this.f27717b);
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(@NotNull hb2 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            jk2 jk2Var = jk2.this;
            jk2Var.f27719d--;
            a();
        }

        @Override // com.yandex.mobile.ads.impl.xp1
        public final void a(List<? extends bb2> list) {
            List<? extends bb2> wrapperAds = list;
            Intrinsics.checkNotNullParameter(wrapperAds, "wrapperAds");
            jk2 jk2Var = jk2.this;
            jk2Var.f27719d--;
            jk2.this.f27717b.addAll(wrapperAds);
            a();
        }
    }

    public final void a(@NotNull Context context, @NotNull List<bb2> wrapperAds, @NotNull xp1<List<bb2>> listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAds, "wrapperAds");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (wrapperAds.isEmpty()) {
            listener.a((xp1<List<bb2>>) this.f27717b);
            return;
        }
        this.f27718c = listener;
        for (bb2 bb2Var : wrapperAds) {
            this.f27719d++;
            this.f27716a.a(context, bb2Var, new a());
        }
    }
}
