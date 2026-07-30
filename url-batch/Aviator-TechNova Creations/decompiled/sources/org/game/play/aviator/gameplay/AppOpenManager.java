package org.game.play.aviator.gameplay;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.LauncherActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/* loaded from: classes3.dex */
public class AppOpenManager implements LifecycleObserver, Application.ActivityLifecycleCallbacks {
    private static final String LOG_TAG = "AppOpenManager";
    private static boolean isShowingAd = false;
    private final MyApplication application;
    private Activity currentActivity;
    private AppOpenAd.AppOpenAdLoadCallback loadCallback;
    private AppOpenAd appOpenAd = null;
    private long loadTime = 0;

    public interface splshADlistner {
        void onerror();

        void onsuccess();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public AppOpenManager(MyApplication myApplication) {
        this.application = myApplication;
        myApplication.registerActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        showAdIfAvailable();
    }

    public void fetchAd(splshADlistner splshadlistner) {
        if (AppManage.app_mixedAdFlow.isEmpty()) {
            if (AppManage.app_adShowStatus == 1 && AppManage.admob_AdStatus == 1 && !AppManage.ADMOB_AppOpen1.equalsIgnoreCase("")) {
                loadAppOpenAdmob(this.currentActivity, splshadlistner);
                return;
            } else if (AppManage.app_adShowStatus == 1 && AppManage.custom_AdStatus == 1 && !AppManage.Custom_appopen.optString("image").equalsIgnoreCase("")) {
                dialogCustomAppOpenAds(splshadlistner);
                return;
            } else {
                splshadlistner.onerror();
                return;
            }
        }
        if (AppManage.app_adShowStatus == 1) {
            String[] split = AppManage.app_mixedAdFlow.split(",");
            if (split[4].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                loadAppOpenAdmob(this.currentActivity, splshadlistner);
                return;
            } else if (split[4].equalsIgnoreCase("C")) {
                dialogCustomAppOpenAds(splshadlistner);
                return;
            } else {
                splshadlistner.onerror();
                return;
            }
        }
        splshadlistner.onerror();
    }

    private void loadAppOpenAdmob(Activity activity, splshADlistner splshadlistner) {
        if (AppManage.getInstance(activity).isUserNotConsent() && AppManage.app_UserNotAcceptConsentFormCustomAdShow == 1) {
            dialogCustomAppOpenAds(splshadlistner);
            return;
        }
        this.loadCallback = new AnonymousClass1(splshadlistner);
        AppOpenAd.load(this.application, AppManage.ADMOB_AppOpen1, getAdRequest(), this.loadCallback);
    }

    /* renamed from: org.game.play.aviator.gameplay.AppOpenManager$1, reason: invalid class name */
    class AnonymousClass1 extends AppOpenAd.AppOpenAdLoadCallback {
        final /* synthetic */ splshADlistner val$listner;

        AnonymousClass1(splshADlistner splshadlistner) {
            this.val$listner = splshadlistner;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final AppOpenAd appOpenAd) {
            super.onAdLoaded((AnonymousClass1) appOpenAd);
            appOpenAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager$1$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(AppOpenAd.this.getResponseInfo().getMediationAdapterClassName(), "appOpenAd", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
            FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: org.game.play.aviator.gameplay.AppOpenManager.1.1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    AnonymousClass1.this.val$listner.onsuccess();
                    AppOpenManager.this.fetchAd();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    AnonymousClass1.this.val$listner.onerror();
                    AppOpenManager.this.fetchAd();
                }
            };
            appOpenAd.show(AppOpenManager.this.currentActivity);
            appOpenAd.setFullScreenContentCallback(fullScreenContentCallback);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            this.val$listner.onerror();
            AppOpenManager.this.fetchAd();
        }
    }

    private void dialogCustomAppOpenAds(final splshADlistner splshadlistner) {
        Random random = new Random();
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("image"), ",")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("short_disc"), ",")));
        ArrayList arrayList3 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("disc"), ",")));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("button_titel"), ",")));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("title"), ",")));
        final ArrayList arrayList6 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("redirectLink"), ",")));
        final int nextInt = random.nextInt(arrayList.size());
        if (this.currentActivity != null) {
            final Dialog dialog = new Dialog(this.currentActivity, com.pesonal.adsdk.R.style.FullWidth_Dialog);
            dialog.requestWindowFeature(1);
            dialog.setContentView(R.layout.app_open_ad);
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            dialog.show();
            TextView textView = (TextView) dialog.findViewById(R.id.description);
            TextView textView2 = (TextView) dialog.findViewById(R.id.shortdes);
            TextView textView3 = (TextView) dialog.findViewById(R.id.action_btn);
            textView.setText("" + ((String) arrayList3.get(nextInt)));
            textView2.setText("" + ((String) arrayList2.get(nextInt)));
            textView3.setText("" + ((String) arrayList4.get(nextInt)));
            ImageView imageView = (ImageView) dialog.findViewById(R.id.imageview);
            if (((String) arrayList.get(nextInt)).contains(".gif")) {
                Glide.with(this.currentActivity).asGif().load((String) arrayList.get(nextInt)).into(imageView);
            } else {
                Glide.with(this.currentActivity).load((String) arrayList.get(nextInt)).into(imageView);
            }
            ((TextView) dialog.findViewById(R.id.titel)).setText("" + ((String) arrayList5.get(nextInt)));
            try {
                if (!AppManage.app_nativeColor.equals("")) {
                    textView3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ((LinearLayout) dialog.findViewById(R.id.ll_adsview)).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    splshadlistner.onsuccess();
                    AppManage.interStatus = true;
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent = new Intent(AppOpenManager.this.currentActivity, (Class<?>) LauncherActivity.class);
                            intent.setData(Uri.parse((String) arrayList6.get(nextInt)));
                            intent.addFlags(805306368);
                            AppOpenManager.this.currentActivity.startActivity(intent);
                            return;
                        }
                        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                        builder.setToolbarColor(Color.parseColor(AppOpenManager.this.currentActivity.getString(com.pesonal.adsdk.R.color.white))).setShowTitle(true);
                        CustomTabsIntent build = builder.build();
                        build.intent.setPackage("com.android.chrome");
                        build.intent.setFlags(1879048192);
                        build.launchUrl(AppOpenManager.this.currentActivity, Uri.parse(String.valueOf(arrayList6.get(nextInt))));
                    } catch (Exception unused) {
                        AppOpenManager.this.openDefaultBrowser((String) arrayList6.get(nextInt));
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    splshadlistner.onsuccess();
                    AppManage.interStatus = true;
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent = new Intent(AppOpenManager.this.currentActivity, (Class<?>) LauncherActivity.class);
                            intent.setData(Uri.parse((String) arrayList6.get(nextInt)));
                            intent.addFlags(805306368);
                            AppOpenManager.this.currentActivity.startActivity(intent);
                            return;
                        }
                        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                        builder.setToolbarColor(Color.parseColor(AppOpenManager.this.currentActivity.getString(com.pesonal.adsdk.R.color.white))).setShowTitle(true);
                        CustomTabsIntent build = builder.build();
                        build.intent.setPackage("com.android.chrome");
                        build.intent.setFlags(1879048192);
                        build.launchUrl(AppOpenManager.this.currentActivity, Uri.parse(String.valueOf(arrayList6.get(nextInt))));
                    } catch (Exception unused) {
                        AppOpenManager.this.openDefaultBrowser((String) arrayList6.get(nextInt));
                    }
                }
            });
            ((RelativeLayout) dialog.findViewById(R.id.btnSkip)).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    splshadlistner.onsuccess();
                }
            });
        }
    }

    public void fetchAd() {
        if (!isAdAvailable() && AppManage.app_adShowStatus == 1 && AppManage.admob_AdStatus == 1 && !AppManage.ADMOB_AppOpen1.equalsIgnoreCase("")) {
            this.loadCallback = new AnonymousClass5();
            AppOpenAd.load(this.application, AppManage.ADMOB_AppOpen1, getAdRequest(), this.loadCallback);
        }
    }

    /* renamed from: org.game.play.aviator.gameplay.AppOpenManager$5, reason: invalid class name */
    class AnonymousClass5 extends AppOpenAd.AppOpenAdLoadCallback {
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
        }

        AnonymousClass5() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final AppOpenAd appOpenAd) {
            AppOpenManager.this.appOpenAd = appOpenAd;
            AppOpenManager.this.loadTime = new Date().getTime();
            appOpenAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager$5$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.OnPaidEventListener
                public final void onPaidEvent(AdValue adValue) {
                    AppManage.logEvent(AppOpenAd.this.getResponseInfo().getMediationAdapterClassName(), "appOpenAd", adValue.getValueMicros(), adValue.getCurrencyCode(), adValue.getPrecisionType());
                }
            });
        }
    }

    private void loadCustomInterstitial() {
        new ArrayList();
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_I1.optString("redirectLink"), ",")));
        int nextInt = new Random().nextInt(arrayList.size());
        AppManage.interStatus = true;
        try {
            if (AppManage.appInsideCustomTabShow == 1) {
                Intent intent = new Intent(this.currentActivity, (Class<?>) LauncherActivity.class);
                intent.setData(Uri.parse((String) arrayList.get(nextInt)));
                intent.addFlags(805306368);
                this.currentActivity.startActivity(intent);
                return;
            }
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.setToolbarColor(Color.parseColor(this.currentActivity.getString(com.pesonal.adsdk.R.color.white))).setShowTitle(true);
            CustomTabsIntent build = builder.build();
            build.intent.setPackage("com.android.chrome");
            build.intent.setData(Uri.parse(String.valueOf(arrayList.get(nextInt))));
            build.intent.setFlags(1879048192);
            build.launchUrl(this.currentActivity, Uri.parse(String.valueOf(arrayList.get(nextInt))));
        } catch (Exception unused) {
            openDefaultBrowser((String) arrayList.get(nextInt));
        }
    }

    private AdRequest getAdRequest() {
        return new AdRequest.Builder().build();
    }

    private boolean wasLoadTimeLessThanNHoursAgo(long j) {
        return new Date().getTime() - this.loadTime < j * 3600000;
    }

    public boolean isAdAvailable() {
        return this.appOpenAd != null && wasLoadTimeLessThanNHoursAgo(4L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.currentActivity = null;
    }

    public void showAdIfAvailable() {
        if (this.currentActivity instanceof SplashActivity) {
            return;
        }
        if (AppManage.app_mixedAdFlow.isEmpty()) {
            if (AppManage.app_adShowStatus == 1 && AppManage.admob_AdStatus == 1) {
                showAdmobAppOpenOnStart();
                return;
            }
            if (!AppManage.interStatus && AppManage.app_adShowStatus == 1 && AppManage.custom_AdStatus == 1 && !AppManage.Custom_appopen.optString("image").equalsIgnoreCase("")) {
                if (AppManage.onResumeDirectUrlOpen == 1) {
                    loadCustomInterstitial();
                    return;
                } else {
                    dialogCustomAppOpenAds();
                    return;
                }
            }
            AppManage.interStatus = false;
            return;
        }
        if (!AppManage.interStatus) {
            if (AppManage.app_adShowStatus == 1) {
                String[] split = AppManage.app_mixedAdFlow.split(",");
                if (split[4].equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
                    showAdmobAppOpenOnStart();
                    return;
                } else {
                    if (split[4].equalsIgnoreCase("C")) {
                        dialogCustomAppOpenAds();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        AppManage.interStatus = false;
    }

    private void showAdmobAppOpenOnStart() {
        if (!AppManage.interStatus) {
            if (AppManage.getInstance(this.currentActivity).isUserNotConsent() && AppManage.app_UserNotAcceptConsentFormCustomAdShow == 1) {
                if (AppManage.onResumeDirectUrlOpen == 1) {
                    loadCustomInterstitial();
                    return;
                } else {
                    dialogCustomAppOpenAds();
                    return;
                }
            }
            if (!isShowingAd && isAdAvailable()) {
                this.appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: org.game.play.aviator.gameplay.AppOpenManager.6
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        AppManage.interStatus = false;
                        AppOpenManager.this.appOpenAd = null;
                        AppOpenManager.isShowingAd = false;
                        AppOpenManager.this.fetchAd();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        AppOpenManager.isShowingAd = true;
                    }
                });
                this.appOpenAd.show(this.currentActivity);
                return;
            }
            AppManage.interStatus = false;
            if (!(this.currentActivity instanceof SplashActivity) && AppManage.backFill == 1) {
                if (AppManage.onResumeDirectUrlOpen == 1) {
                    loadCustomInterstitial();
                } else {
                    dialogCustomAppOpenAds();
                }
            }
            fetchAd();
            return;
        }
        AppManage.interStatus = false;
    }

    private void dialogCustomAppOpenAds() {
        Random random = new Random();
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("image"), ",")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("short_disc"), ",")));
        ArrayList arrayList3 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("disc"), ",")));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("button_titel"), ",")));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("title"), ",")));
        final ArrayList arrayList6 = new ArrayList(Arrays.asList(TextUtils.split(AppManage.Custom_appopen.optString("redirectLink"), ",")));
        final int nextInt = random.nextInt(arrayList.size());
        if (this.currentActivity != null) {
            final Dialog dialog = new Dialog(this.currentActivity, com.pesonal.adsdk.R.style.FullWidth_Dialog);
            dialog.requestWindowFeature(1);
            dialog.setContentView(R.layout.app_open_ad);
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            dialog.show();
            TextView textView = (TextView) dialog.findViewById(R.id.description);
            TextView textView2 = (TextView) dialog.findViewById(R.id.shortdes);
            TextView textView3 = (TextView) dialog.findViewById(R.id.action_btn);
            textView.setText("" + ((String) arrayList3.get(nextInt)));
            textView2.setText("" + ((String) arrayList2.get(nextInt)));
            textView3.setText("" + ((String) arrayList4.get(nextInt)));
            ImageView imageView = (ImageView) dialog.findViewById(R.id.imageview);
            if (((String) arrayList.get(nextInt)).contains(".gif")) {
                Glide.with(this.currentActivity).asGif().load((String) arrayList.get(nextInt)).into(imageView);
            } else {
                Glide.with(this.currentActivity).load((String) arrayList.get(nextInt)).into(imageView);
            }
            ((TextView) dialog.findViewById(R.id.titel)).setText("" + ((String) arrayList5.get(nextInt)));
            try {
                if (!AppManage.app_nativeColor.equals("")) {
                    textView3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ((LinearLayout) dialog.findViewById(R.id.ll_adsview)).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    AppManage.interStatus = true;
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent = new Intent(AppOpenManager.this.currentActivity, (Class<?>) LauncherActivity.class);
                            intent.setData(Uri.parse((String) arrayList6.get(nextInt)));
                            intent.addFlags(805306368);
                            AppOpenManager.this.currentActivity.startActivity(intent);
                            return;
                        }
                        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                        builder.setToolbarColor(Color.parseColor(AppOpenManager.this.currentActivity.getString(com.pesonal.adsdk.R.color.white))).setShowTitle(true);
                        CustomTabsIntent build = builder.build();
                        build.intent.setPackage("com.android.chrome");
                        build.intent.setFlags(1879048192);
                        build.launchUrl(AppOpenManager.this.currentActivity, Uri.parse(String.valueOf(arrayList6.get(nextInt))));
                    } catch (Exception unused) {
                        AppOpenManager.this.openDefaultBrowser((String) arrayList6.get(nextInt));
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    AppManage.interStatus = true;
                    try {
                        if (AppManage.appInsideCustomTabShow == 1) {
                            Intent intent = new Intent(AppOpenManager.this.currentActivity, (Class<?>) LauncherActivity.class);
                            intent.setData(Uri.parse((String) arrayList6.get(nextInt)));
                            intent.addFlags(805306368);
                            AppOpenManager.this.currentActivity.startActivity(intent);
                            return;
                        }
                        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                        builder.setToolbarColor(Color.parseColor(AppOpenManager.this.currentActivity.getString(com.pesonal.adsdk.R.color.white))).setShowTitle(true);
                        CustomTabsIntent build = builder.build();
                        build.intent.setPackage("com.android.chrome");
                        build.intent.setFlags(1879048192);
                        build.launchUrl(AppOpenManager.this.currentActivity, Uri.parse(String.valueOf(arrayList6.get(nextInt))));
                    } catch (Exception unused) {
                        AppOpenManager.this.openDefaultBrowser((String) arrayList6.get(nextInt));
                    }
                }
            });
            ((RelativeLayout) dialog.findViewById(R.id.btnSkip)).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.AppOpenManager.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dialog.dismiss();
                    AppManage.interStatus = false;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openDefaultBrowser(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.currentActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
