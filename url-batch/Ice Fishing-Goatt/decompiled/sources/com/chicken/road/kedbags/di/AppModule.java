package com.chicken.road.kedbags.di;

import android.content.Context;
import com.chicken.road.kedbags.data.device.FrostSignalCollector;
import com.chicken.road.kedbags.data.remote.FrostCatchSocketClient;
import com.chicken.road.kedbags.data.repository.SplashRepository;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import com.chicken.road.kedbags.ui.splash.SplashController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: AppModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/chicken/road/kedbags/di/AppModule;", "", "<init>", "()V", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "context", "Landroid/content/Context;", "splashController", "Lcom/chicken/road/kedbags/ui/splash/SplashController;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppModule {
    public static final int $stable = 0;
    public static final AppModule INSTANCE = new AppModule();

    private AppModule() {
    }

    public final TreasureRepository repository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new TreasureRepository(applicationContext);
    }

    public final SplashController splashController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        return new SplashController(new SplashRepository(applicationContext, new FrostCatchSocketClient(applicationContext)), new FrostSignalCollector(applicationContext), CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate())));
    }
}
