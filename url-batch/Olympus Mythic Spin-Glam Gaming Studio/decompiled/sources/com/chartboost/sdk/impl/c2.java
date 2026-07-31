package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.si;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c2 implements b2 {
    public final a7 a;
    public final vh b;
    public final xk c;
    public c0 d;
    public final Mediation e;

    public c2(a7 downloader, vh timeSource, xk videoRepository, c0 adType, Mediation mediation) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.a = downloader;
        this.b = timeSource;
        this.c = videoRepository;
        this.d = adType;
        this.e = mediation;
    }

    @Override // com.chartboost.sdk.impl.b2
    public void a(final q1 appRequest, String adTypeTraitsName, final x1 assetDownloadedCallback, final i0 adUnitLoaderCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "assetDownloadedCallback");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "adUnitLoaderCallback");
        final d0 a = appRequest.a();
        if (a == null) {
            return;
        }
        v1 v1Var = new v1() { // from class: com.chartboost.sdk.impl.c2$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.v1
            public final void a(boolean z) {
                c2.a(c2.this, appRequest, a, adUnitLoaderCallback, assetDownloadedCallback, z);
            }
        };
        this.a.c();
        this.a.a(af.e, a.d(), new AtomicInteger(), (v1) s8.a().a(v1Var), adTypeTraitsName);
    }

    public static final void a(c2 this$0, q1 appRequest, d0 adUnit, i0 adUnitLoaderCallback, x1 assetDownloadedCallback, boolean z) {
        y1 y1Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appRequest, "$appRequest");
        Intrinsics.checkNotNullParameter(adUnit, "$adUnit");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "$adUnitLoaderCallback");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "$assetDownloadedCallback");
        if (z) {
            y1Var = this$0.a(appRequest, adUnit, adUnitLoaderCallback);
        } else if (!z) {
            y1Var = y1.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        assetDownloadedCallback.a(appRequest, y1Var);
    }

    public final y1 a(q1 q1Var, d0 d0Var, i0 i0Var) {
        i0Var.a(q1Var, si.a.e);
        if (d0Var.D()) {
            if (!this.c.a(d0Var.B())) {
                this.c.a(d0Var.C(), d0Var.B(), false, null);
            }
            return y1.d;
        }
        return y1.c;
    }
}
