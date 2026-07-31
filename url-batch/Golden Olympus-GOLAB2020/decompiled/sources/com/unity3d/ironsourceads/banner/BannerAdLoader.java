package com.unity3d.ironsourceads.banner;

import com.ironsource.cm;
import com.ironsource.f7;
import com.ironsource.fm;
import com.ironsource.ig;
import com.ironsource.ln;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class BannerAdLoader {

    @NotNull
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f21897a = ig.f16710a.c();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cm loadTask) {
        Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    public static final void loadAd(@NotNull BannerAdRequest adRequest, @NotNull BannerAdLoaderListener listener) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f21897a, new f7(adRequest, listener, ln.f17101e.a(IronSource.AD_UNIT.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull fm loadTaskProvider) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final cm a4 = loadTaskProvider.a();
        executor.execute(new Runnable() { // from class: e1.a
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(cm.this);
            }
        });
    }
}
