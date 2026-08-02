package com.squareup.cash.treehouse.android;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.work.impl.StartStopTokensImpl;
import app.cash.redwood.leaks.NoOpLeakDetector;
import app.cash.redwood.treehouse.AndroidTreehouseDispatchers;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.zipline.loader.LoaderEventListener$None;
import app.cash.zipline.loader.ManifestVerifier;
import app.cash.zipline.loader.ZiplineHttpClient;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.util.AndroidSystemCallbacks;
import com.bugsnag.android.internal.dag.ContextModule;
import com.squareup.cash.treehouse.android.RealTreehouseEventListener;
import com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory;
import com.squareup.cash.treehouse.platform.CashFreshnessCheckerKt;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactory;
import com.squareup.cash.treehouse.platform.CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.platform.ClockJvmKt;
import com.squareup.cash.treehouse.platform.SerializersKt;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.modules.SerialModuleImpl;
import okhttp3.internal.connection.RealConnectionPool;
import okio.Path;
import okio.assetfilesystem.AssetFileSystem;

/* loaded from: classes.dex */
public final class TreehouseModule$provideCashTreehouseAppFactory$1 {
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ CoroutineContext $uiContext;
    public final Lazy appFactory;

    public TreehouseModule$provideCashTreehouseAppFactory$1(final Context context, final ZiplineHttpClient ziplineHttpClient, final ManifestVerifier manifestVerifier, final RealTreehouseEventListener.Factory factory, final boolean z, final AndroidPlatformServiceFactory androidPlatformServiceFactory, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.$scope = coroutineScope;
        this.$uiContext = coroutineContext;
        this.appFactory = LazyKt.lazy(new Function0() { // from class: com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str = Path.DIRECTORY_SEPARATOR;
                Path path = Path.Companion.get("/treehouse", false);
                Context context2 = context;
                AssetManager assets = context2.getAssets();
                assets.getClass();
                AssetFileSystem assetFileSystem = new AssetFileSystem(assets);
                StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl(2);
                NoOpLeakDetector noOpLeakDetector = new NoOpLeakDetector();
                ContextModule contextModule = new ContextModule(context2, (byte) 0);
                Extras.Key key = new Extras.Key(21);
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                return new CashTreehouseAppFactory(new RealTreehouseApp.Factory(contextModule, ziplineHttpClient, key, manifestVerifier, assetFileSystem, path, "zipline", DefaultIoScheduler.INSTANCE, LoaderEventListener$None.INSTANCE, startStopTokensImpl, noOpLeakDetector), factory, androidPlatformServiceFactory, z);
            }
        });
    }

    public final RealTreehouseApp create(ChannelFlowTransformLatest channelFlowTransformLatest, String str, Function0 function0) {
        CashTreehouseAppFactory cashTreehouseAppFactory = (CashTreehouseAppFactory) this.appFactory.getValue();
        CoroutineContext coroutineContext = this.$uiContext;
        CoroutineScope coroutineScope = this.$scope;
        ContextScope plus = JobKt.plus(coroutineContext, coroutineScope);
        cashTreehouseAppFactory.getClass();
        RealTreehouseApp.Factory factory = cashTreehouseAppFactory.treehouseAppFactory;
        if (factory == null) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        boolean z = cashTreehouseAppFactory.loadCodeFromNetworkOnly;
        SerialModuleImpl serialModuleImpl = SerializersKt.treehouseSerializersModule;
        RealConnectionPool realConnectionPool = new RealConnectionPool(ClockJvmKt.systemEpochMsClock, CashFreshnessCheckerKt.freshDuration, function0);
        serialModuleImpl.getClass();
        AndroidSystemCallbacks androidSystemCallbacks = new AndroidSystemCallbacks();
        androidSystemCallbacks.imageLoader = channelFlowTransformLatest;
        androidSystemCallbacks.activityCallbacks = str;
        androidSystemCallbacks.shutdown = z;
        androidSystemCallbacks.componentCallbacks = serialModuleImpl;
        androidSystemCallbacks.application = realConnectionPool;
        EventListener.Factory factory2 = cashTreehouseAppFactory.eventListenerFactory;
        if (factory2 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        AndroidPlatformServiceFactory androidPlatformServiceFactory = cashTreehouseAppFactory.platformServiceFactory;
        if (androidPlatformServiceFactory == null) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 cashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 = cashTreehouseAppFactory.launcherFactory;
        if (cashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 == null) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
        RealTreehouseApp realTreehouseApp = new RealTreehouseApp(factory, plus, androidSystemCallbacks, new AndroidTreehouseDispatchers(str), new CashTreehouseAppFactory.LauncherEventListenerFactory(factory2, androidPlatformServiceFactory, cashTreehouseAppFactoryKt$cashTreehouseAppFactory$1, plus), factory.leakDetector);
        StateFlowKt.closeWith(realTreehouseApp, JobKt.plus(coroutineContext, coroutineScope), new MainActivity$$ExternalSyntheticLambda5(22));
        return realTreehouseApp;
    }
}
