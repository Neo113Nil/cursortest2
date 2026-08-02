package com.stripe.android.payments;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.play.core.review.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.browser.BrowserCapabilities;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.lite.di.Di;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.serialization.json.Json;
import papa.InputEventTrigger;

/* loaded from: classes8.dex */
public final class StripeBrowserLauncherViewModel extends ViewModel {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final BrowserCapabilities browserCapabilities;
    public final String customTabsPackage;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final String resolveErrorMessage;
    public final SavedStateHandle savedStateHandle;

    public final class Factory implements ViewModelProvider$Factory {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Factory(int i) {
            this.$r8$classId = i;
        }

        @Override // androidx.lifecycle.ViewModelProvider$Factory
        public final ViewModel create(Class cls, CreationExtras creationExtras) {
            Object failure;
            int i = this.$r8$classId;
            creationExtras.getClass();
            switch (i) {
                case 0:
                    Application requireApplication = CreationExtrasKtxKt.requireApplication(creationExtras);
                    SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                    PaymentConfiguration paymentConfiguration = PaymentConfiguration.instance;
                    if (paymentConfiguration == null) {
                        SharedPreferences sharedPreferences = new PaymentConfiguration.Store(requireApplication).prefs;
                        String string2 = sharedPreferences.getString("key_publishable_key", null);
                        paymentConfiguration = string2 != null ? new PaymentConfiguration(string2, sharedPreferences.getString("key_account_id", null)) : null;
                        if (paymentConfiguration == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                            return null;
                        }
                        PaymentConfiguration.instance = paymentConfiguration;
                    }
                    DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
                    PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(requireApplication, paymentConfiguration.publishableKey, EmptySet.INSTANCE);
                    try {
                        Result.Companion companion = Result.Companion;
                        zzr zzrVar = new zzr();
                        zzrVar.zza = requireApplication.getApplicationContext();
                        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                        intent.setPackage("com.android.chrome");
                        failure = Boolean.valueOf(requireApplication.bindService(intent, zzrVar, 33));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    Object obj = Boolean.FALSE;
                    if (failure instanceof Result.Failure) {
                        failure = obj;
                    }
                    BrowserCapabilities browserCapabilities = ((Boolean) failure).booleanValue() ? BrowserCapabilities.CustomTabs : BrowserCapabilities.Unknown;
                    String packageName = InputEventTrigger.Companion.getPackageName(requireApplication);
                    String string3 = requireApplication.getString(R.string.stripe_failure_reason_authentication);
                    string3.getClass();
                    return new StripeBrowserLauncherViewModel(defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, browserCapabilities, packageName, string3, createSavedStateHandle);
                default:
                    SavedStateHandle createSavedStateHandle2 = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
                    Object obj2 = creationExtras.get(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY);
                    obj2.getClass();
                    String packageName2 = ((Context) obj2).getPackageName();
                    packageName2.getClass();
                    ApiRequest.Factory factory = Di.apiRequestFactory;
                    Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = Di.logger;
                    DefaultIoScheduler defaultIoScheduler = Di.workContext;
                    TextSetter textSetter = new TextSetter(new DefaultStripeNetworkClient(defaultIoScheduler, logger$Companion$NOOP_LOGGER$1, 14), (Json) Di.json, logger$Companion$NOOP_LOGGER$1);
                    ApiRequest.Factory factory2 = Di.apiRequestFactory;
                    factory2.getClass();
                    ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
                    toolbarTuckTargets.startCornerCenterX$delegate = textSetter;
                    toolbarTuckTargets.endCornerCenterX$delegate = factory2;
                    return new FinancialConnectionsLiteViewModel(logger$Companion$NOOP_LOGGER$1, createSavedStateHandle2, toolbarTuckTargets, defaultIoScheduler, packageName2);
            }
        }
    }

    public StripeBrowserLauncherViewModel(DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, BrowserCapabilities browserCapabilities, String str, String str2, SavedStateHandle savedStateHandle) {
        str2.getClass();
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.browserCapabilities = browserCapabilities;
        this.customTabsPackage = str;
        this.resolveErrorMessage = str2;
        this.savedStateHandle = savedStateHandle;
    }
}
