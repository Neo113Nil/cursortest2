package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import dev.cct.translatorapp.MainApplication;
import dev.cct.translatorapp.ui.LunchingView;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppOpenAd.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010'\u001a\u00020\u001cH\u0007J\b\u0010(\u001a\u00020\u001cH\u0002R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Ldev/cct/translatorapp/ads/AppOpenAd;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/LifecycleObserver;", "application", "Ldev/cct/translatorapp/MainApplication;", "(Ldev/cct/translatorapp/MainApplication;)V", "adRequest", "Lcom/google/android/gms/ads/AdRequest;", "getAdRequest", "()Lcom/google/android/gms/ads/AdRequest;", "adVisible", "", "appOpenAd", "Lcom/google/android/gms/ads/appopen/AppOpenAd;", "getApplication", "()Ldev/cct/translatorapp/MainApplication;", "currentActivity", "Landroid/app/Activity;", "isAdAvailable", "()Z", "isShowingAd", "loadCallback", "Lcom/google/android/gms/ads/appopen/AppOpenAd$AppOpenAdLoadCallback;", "openAdId", "", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "fetchAd", "", "onActivityCreated", "p0", "p1", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "onStart", "showAdIfAvailable", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppOpenAd implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean isEnableAdShow;
    private static boolean isIntersAdShow;
    private boolean adVisible;
    private com.google.android.gms.ads.appopen.AppOpenAd appOpenAd;
    private final MainApplication application;
    private Activity currentActivity;
    private boolean isShowingAd;
    private AppOpenAd.AppOpenAdLoadCallback loadCallback;
    private String openAdId;
    private FirebaseRemoteConfig remoteConfig;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
    }

    public AppOpenAd(MainApplication application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        application.registerActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
        this.remoteConfig = RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);
    }

    public final MainApplication getApplication() {
        return this.application;
    }

    private final AdRequest getAdRequest() {
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        return build;
    }

    private final boolean isAdAvailable() {
        return this.appOpenAd != null;
    }

    /* compiled from: AppOpenAd.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Ldev/cct/translatorapp/ads/AppOpenAd$Companion;", "", "()V", "isEnableAdShow", "", "()Z", "setEnableAdShow", "(Z)V", "isIntersAdShow", "setIntersAdShow", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isIntersAdShow() {
            return AppOpenAd.isIntersAdShow;
        }

        public final void setIntersAdShow(boolean z) {
            AppOpenAd.isIntersAdShow = z;
        }

        public final boolean isEnableAdShow() {
            return AppOpenAd.isEnableAdShow;
        }

        public final void setEnableAdShow(boolean z) {
            AppOpenAd.isEnableAdShow = z;
        }
    }

    public final void fetchAd() {
        if (isAdAvailable()) {
            return;
        }
        this.loadCallback = new AppOpenAd.AppOpenAdLoadCallback() { // from class: dev.cct.translatorapp.ads.AppOpenAd$fetchAd$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.appopen.AppOpenAd p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                super.onAdLoaded((AppOpenAd$fetchAd$1) p0);
                AppOpenAd.this.appOpenAd = p0;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                Log.d("tag", "onAppOpenAdFailedToLoad: ");
            }
        };
        AdRequest adRequest = getAdRequest();
        if (new Preferences(this.application).getCheckBillingStatus()) {
            return;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        String string = firebaseRemoteConfig != null ? firebaseRemoteConfig.getString("") : null;
        this.openAdId = string;
        if (string != null) {
            MainApplication mainApplication = this.application;
            Intrinsics.checkNotNull(string);
            AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.loadCallback;
            Intrinsics.checkNotNull(appOpenAdLoadCallback, "null cannot be cast to non-null type com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback");
            com.google.android.gms.ads.appopen.AppOpenAd.load(mainApplication, string, adRequest, 1, appOpenAdLoadCallback);
        }
    }

    private final void showAdIfAvailable() {
        if (!this.isShowingAd && isAdAvailable()) {
            Activity activity = this.currentActivity;
            if (!(activity instanceof LunchingView) && !(activity instanceof LoadingAdView) && !isIntersAdShow && !isEnableAdShow) {
                Log.d("tag", "will show ad ");
                FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ads.AppOpenAd$showAdIfAvailable$fullScreenContentCallback$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        AppOpenAd.this.appOpenAd = null;
                        AppOpenAd.this.isShowingAd = false;
                        AppOpenAd.this.adVisible = false;
                        AppOpenAd.INSTANCE.setEnableAdShow(false);
                        AppOpenAd.this.fetchAd();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        AppOpenAd.this.adVisible = false;
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        AppOpenAd.this.adVisible = true;
                        AppOpenAd.this.isShowingAd = true;
                    }
                };
                com.google.android.gms.ads.appopen.AppOpenAd appOpenAd = this.appOpenAd;
                Intrinsics.checkNotNull(appOpenAd);
                appOpenAd.setFullScreenContentCallback(fullScreenContentCallback);
                com.google.android.gms.ads.appopen.AppOpenAd appOpenAd2 = this.appOpenAd;
                Intrinsics.checkNotNull(appOpenAd2);
                Activity activity2 = this.currentActivity;
                Intrinsics.checkNotNull(activity2);
                appOpenAd2.show(activity2);
                this.adVisible = false;
                return;
            }
        }
        Log.d("tag", "can't show ad ");
        fetchAd();
        this.adVisible = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.currentActivity = p0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.currentActivity = p0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.currentActivity = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        showAdIfAvailable();
        Log.d("tag", "onStart: ");
    }
}
