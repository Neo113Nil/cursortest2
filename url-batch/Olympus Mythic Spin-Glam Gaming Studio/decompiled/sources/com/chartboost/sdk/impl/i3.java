package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i3 {
    public final Executor a;
    public final ud b;
    public final j3 c;
    public final vh d;
    public final yi e;
    public final Executor f;
    public final u7 g;

    public i3(Executor backgroundExecutor, ud factory, j3 reachability, vh timeSource, yi uiPoster, Executor networkExecutor, u7 eventTrackerProvider) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(networkExecutor, "networkExecutor");
        Intrinsics.checkNotNullParameter(eventTrackerProvider, "eventTrackerProvider");
        this.a = backgroundExecutor;
        this.b = factory;
        this.c = reachability;
        this.d = timeSource;
        this.e = uiPoster;
        this.f = networkExecutor;
        this.g = eventTrackerProvider;
    }

    public final void a(e3 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        xb.d("Execute request: " + request.e(), null);
        this.f.execute(new td(this.a, this.b, this.c, this.d, this.e, request, this.g.a()));
    }

    public final String a() {
        return h4.b.b();
    }
}
