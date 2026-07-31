package com.unity3d.ironsourceads.interstitial;

import com.ironsource.cm;
import com.ironsource.fm;
import com.ironsource.hj;
import com.ironsource.ig;
import com.ironsource.ln;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class InterstitialAdLoader {

    @NotNull
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f21916a = ig.f16710a.c();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cm loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull InterstitialAdRequest adRequest, @NotNull InterstitialAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f21916a, new hj(adRequest, listener, ln.f17101e.a(IronSource.AD_UNIT.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull fm loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final cm a4 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: f1.a
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(cm.this);
            }
        });
    }
}
