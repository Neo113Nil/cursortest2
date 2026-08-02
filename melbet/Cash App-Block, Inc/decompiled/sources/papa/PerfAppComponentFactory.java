package papa;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import papa.internal.Perfs;

/* loaded from: classes3.dex */
public final class PerfAppComponentFactory extends AppComponentFactory {
    public final AppComponentFactory delegate;

    static {
        boolean z = Perfs.isTracingLaunch;
    }

    public PerfAppComponentFactory(AppComponentFactory appComponentFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.core.app.AppComponentFactory() : appComponentFactory);
    }

    public static void onComponentInstantiatedAfterAppCreated(String str) {
        if (Perfs.firstPostApplicationComponentInstantiated) {
            return;
        }
        Perfs.firstPostApplicationComponentInstantiated = true;
        str.getClass();
        Handlers.checkOnMainThread();
        if (Perfs.initialized) {
            AppStart$AppStartData appStart$AppStartData = Perfs.appStartData;
            if (appStart$AppStartData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                throw null;
            }
            if (Perfs.appStartData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStartData");
                throw null;
            }
            SystemClock.uptimeMillis();
            Perfs.appStartData = AppStart$AppStartData.copy$default(appStart$AppStartData, null, null, null, null, new AndroidComponentEvent(), null, null, null, null, null, null, null, null, null, -1048577);
        }
    }

    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        classLoader.getClass();
        str.getClass();
        onComponentInstantiatedAfterAppCreated(str);
        Activity instantiateActivity = this.delegate.instantiateActivity(classLoader, str, intent);
        instantiateActivity.getClass();
        return instantiateActivity;
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        Application instantiateApplication = this.delegate.instantiateApplication(classLoader, str);
        instantiateApplication.getClass();
        boolean z = Perfs.isTracingLaunch;
        Perfs.applicationInstantiatedUptimeMillis = Long.valueOf(SystemClock.uptimeMillis());
        return instantiateApplication;
    }

    @Override // android.app.AppComponentFactory
    public final ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) {
        classLoader.getClass();
        applicationInfo.getClass();
        ClassLoader instantiateClassLoader = this.delegate.instantiateClassLoader(classLoader, applicationInfo);
        instantiateClassLoader.getClass();
        boolean z = Perfs.isTracingLaunch;
        Perfs.classLoaderInstantiatedUptimeMillis = Long.valueOf(SystemClock.uptimeMillis());
        return instantiateClassLoader;
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        ContentProvider instantiateProvider = this.delegate.instantiateProvider(classLoader, str);
        instantiateProvider.getClass();
        return instantiateProvider;
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        classLoader.getClass();
        str.getClass();
        onComponentInstantiatedAfterAppCreated(str);
        BroadcastReceiver instantiateReceiver = this.delegate.instantiateReceiver(classLoader, str, intent);
        instantiateReceiver.getClass();
        return instantiateReceiver;
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        classLoader.getClass();
        str.getClass();
        onComponentInstantiatedAfterAppCreated(str);
        Service instantiateService = this.delegate.instantiateService(classLoader, str, intent);
        instantiateService.getClass();
        return instantiateService;
    }

    public PerfAppComponentFactory() {
        this(null, 1, null);
    }

    public PerfAppComponentFactory(AppComponentFactory appComponentFactory) {
        appComponentFactory.getClass();
        this.delegate = appComponentFactory;
    }
}
