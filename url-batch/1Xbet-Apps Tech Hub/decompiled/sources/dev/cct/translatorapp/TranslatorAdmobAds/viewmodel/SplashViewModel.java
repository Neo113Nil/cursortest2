package dev.cct.translatorapp.TranslatorAdmobAds.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;

/* compiled from: SplashViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0005\"\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/viewmodel/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isAppOpenAdLoaded", "", "()Z", "setAppOpenAdLoaded", "(Z)V", "isAppPaused", "setAppPaused", "isBannerAdLoaded", "setBannerAdLoaded", "isBannerDisplayTimeCompleted", "setBannerDisplayTimeCompleted", "isScreenNavigationCalled", "setScreenNavigationCalled", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplashViewModel extends ViewModel {
    private boolean isAppOpenAdLoaded;
    private boolean isAppPaused;
    private boolean isBannerAdLoaded;
    private boolean isBannerDisplayTimeCompleted;
    private boolean isScreenNavigationCalled;

    /* renamed from: isAppOpenAdLoaded, reason: from getter */
    public final boolean getIsAppOpenAdLoaded() {
        return this.isAppOpenAdLoaded;
    }

    public final void setAppOpenAdLoaded(boolean z) {
        this.isAppOpenAdLoaded = z;
    }

    /* renamed from: isBannerAdLoaded, reason: from getter */
    public final boolean getIsBannerAdLoaded() {
        return this.isBannerAdLoaded;
    }

    public final void setBannerAdLoaded(boolean z) {
        this.isBannerAdLoaded = z;
    }

    /* renamed from: isBannerDisplayTimeCompleted, reason: from getter */
    public final boolean getIsBannerDisplayTimeCompleted() {
        return this.isBannerDisplayTimeCompleted;
    }

    public final void setBannerDisplayTimeCompleted(boolean z) {
        this.isBannerDisplayTimeCompleted = z;
    }

    /* renamed from: isAppPaused, reason: from getter */
    public final boolean getIsAppPaused() {
        return this.isAppPaused;
    }

    public final void setAppPaused(boolean z) {
        this.isAppPaused = z;
    }

    /* renamed from: isScreenNavigationCalled, reason: from getter */
    public final boolean getIsScreenNavigationCalled() {
        return this.isScreenNavigationCalled;
    }

    public final void setScreenNavigationCalled(boolean z) {
        this.isScreenNavigationCalled = z;
    }
}
