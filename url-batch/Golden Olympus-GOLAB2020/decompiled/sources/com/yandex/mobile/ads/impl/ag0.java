package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ag0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1920f9 f23272a;

    public /* synthetic */ ag0(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, new C1920f9(context, c2286v2));
    }

    public final void a(@NotNull String url, @NotNull C2360y7 adResponse, @NotNull C2171q1 handler) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(handler, "handler");
        List<String> t4 = adResponse.t();
        if (t4 != null) {
            Iterator<T> it = t4.iterator();
            while (it.hasNext()) {
                this.f23272a.a((String) it.next(), o62.f29919d);
            }
        }
        this.f23272a.a(url, adResponse, handler);
    }

    public ag0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C1920f9 adTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f23272a = adTracker;
    }
}
