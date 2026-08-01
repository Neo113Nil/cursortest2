package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.ui.LunchingView;
import dev.cct.translatorapp.ui.PremiumActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppObserver.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/AppObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "appOpen", "Ldev/cct/translatorapp/TranslatorAdmobAds/AppOpen;", "(Ldev/cct/translatorapp/TranslatorAdmobAds/AppOpen;)V", "mCurrentActivity", "Landroid/app/Activity;", "onActivityCreated", "", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onBackgroundEntered", "onForegroundEntered", "onStateChanged", FirebaseAnalytics.Param.SOURCE, "Landroidx/lifecycle/LifecycleOwner;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppObserver implements LifecycleEventObserver, Application.ActivityLifecycleCallbacks {
    private final AppOpen appOpen;
    private Activity mCurrentActivity;

    /* compiled from: AppObserver.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public AppObserver(AppOpen appOpen) {
        Intrinsics.checkNotNullParameter(appOpen, "appOpen");
        this.appOpen = appOpen;
    }

    private final void onBackgroundEntered() {
        Activity activity = this.mCurrentActivity;
        if (activity != null && !(activity instanceof LunchingView) && !(activity instanceof PremiumActivity)) {
            AdsExtensionKt.loadAppOpen$default(activity, ConstantParam.INSTANCE.getOnResumeAppOpenId(), null, 2, null);
        }
        ConstantParam.INSTANCE.setAppIsForeground(false);
    }

    private final void onForegroundEntered() {
        final Activity activity;
        ConstantParam.INSTANCE.setAppIsForeground(true);
        if (ConstantParam.INSTANCE.m204isPurchased() || (activity = this.mCurrentActivity) == null || (activity instanceof LunchingView) || (activity instanceof PremiumActivity)) {
            return;
        }
        Log.e("AppOpen", "Showing App Open");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AppObserver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AppObserver.onForegroundEntered$lambda$2$lambda$1(activity);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onForegroundEntered$lambda$2$lambda$1(Activity it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        AdsExtensionKt.showAppOpen$default(it, 0L, false, new Function0<Unit>() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AppObserver$onForegroundEntered$1$1$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, 2, null);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            onBackgroundEntered();
        } else {
            if (i != 2) {
                return;
            }
            onForegroundEntered();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.appOpen.isShowingAppOpen()) {
            return;
        }
        this.mCurrentActivity = activity;
    }
}
