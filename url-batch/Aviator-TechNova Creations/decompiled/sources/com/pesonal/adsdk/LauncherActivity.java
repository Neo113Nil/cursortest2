package com.pesonal.adsdk;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.browser.trusted.sharing.ShareData;
import androidx.core.content.ContextCompat;
import com.google.androidbrowserhelper.trusted.ChromeOsSupport;
import com.google.androidbrowserhelper.trusted.ChromeUpdatePrompt;
import com.google.androidbrowserhelper.trusted.LauncherActivityMetadata;
import com.google.androidbrowserhelper.trusted.ManageDataLauncherActivity;
import com.google.androidbrowserhelper.trusted.QualityEnforcer;
import com.google.androidbrowserhelper.trusted.SharingUtils;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import com.google.androidbrowserhelper.trusted.TwaSharedPreferencesManager;
import com.google.androidbrowserhelper.trusted.splashscreens.PwaWrapperSplashScreenStrategy;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class LauncherActivity extends Activity {
    private static final String BROWSER_WAS_LAUNCHED_KEY = "android.support.customtabs.trusted.BROWSER_WAS_LAUNCHED_KEY";
    private static final String FALLBACK_TYPE_WEBVIEW = "webview";
    private static final String TAG = "TWALauncherActivity";
    private static boolean sChromeVersionChecked;
    private static int sLauncherActivitiesAlive;
    private boolean mBrowserWasLaunched;
    private LauncherActivityMetadata mMetadata;
    private PwaWrapperSplashScreenStrategy mSplashScreenStrategy;
    private TwaLauncher mTwaLauncher;

    private void addShareDataIfPresent(TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder) {
        String str;
        ShareData retrieveShareDataFromIntent = SharingUtils.retrieveShareDataFromIntent(getIntent());
        if (retrieveShareDataFromIntent == null || (str = this.mMetadata.shareTarget) == null) {
            return;
        }
        try {
            trustedWebActivityIntentBuilder.setShareParams(SharingUtils.parseShareTargetJson(str), retrieveShareDataFromIntent);
        } catch (JSONException e) {
            e.toString();
        }
    }

    private int getColorCompat(int i) {
        return ContextCompat.getColor(this, i);
    }

    private void openUrlInDefaultBrowser(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } catch (Exception unused) {
            finish();
        }
    }

    private boolean restartInNewTask() {
        boolean z = (getIntent().getFlags() & 268435456) != 0;
        boolean z2 = (getIntent().getFlags() & 524288) != 0;
        if (z && !z2) {
            return false;
        }
        try {
            Intent intent = new Intent(getIntent());
            intent.setFlags((268435456 | getIntent().getFlags()) & (-524289));
            startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean splashScreenNeeded() {
        if (this.mMetadata.splashImageDrawableId == 0) {
            return false;
        }
        return isTaskRoot();
    }

    public TwaLauncher createTwaLauncher() {
        return new TwaLauncher(this);
    }

    public CustomTabsCallback getCustomTabsCallback() {
        return new QualityEnforcer();
    }

    public TrustedWebActivityDisplayMode getDisplayMode() {
        return this.mMetadata.displayMode;
    }

    public TwaLauncher.FallbackStrategy getFallbackStrategy() {
        return FALLBACK_TYPE_WEBVIEW.equalsIgnoreCase(this.mMetadata.fallbackStrategyType) ? TwaLauncher.WEBVIEW_FALLBACK_STRATEGY : TwaLauncher.CCT_FALLBACK_STRATEGY;
    }

    public Uri getLaunchingUrl() {
        Uri data = getIntent().getData();
        if (data != null) {
            data.toString();
            return data;
        }
        String str = this.mMetadata.defaultUrl;
        return str != null ? Uri.parse(str) : Uri.parse("https://www.example.com/");
    }

    public ImageView.ScaleType getSplashImageScaleType() {
        return ImageView.ScaleType.CENTER;
    }

    public Matrix getSplashImageTransformationMatrix() {
        return null;
    }

    /* renamed from: lambda$launchTwa$0$com-pesonal-adsdk-LauncherActivity, reason: not valid java name */
    /* synthetic */ void m504lambda$launchTwa$0$compesonaladsdkLauncherActivity() {
        this.mBrowserWasLaunched = true;
    }

    public void launchTwa() {
        try {
            if (isFinishing()) {
                return;
            }
            TrustedWebActivityIntentBuilder screenOrientation = new TrustedWebActivityIntentBuilder(getLaunchingUrl()).setToolbarColor(getColorCompat(this.mMetadata.statusBarColorId)).setNavigationBarColor(getColorCompat(this.mMetadata.navigationBarColorId)).setNavigationBarDividerColor(getColorCompat(this.mMetadata.navigationBarDividerColorId)).setColorScheme(0).setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(getColorCompat(this.mMetadata.statusBarColorDarkId)).setNavigationBarColor(getColorCompat(this.mMetadata.navigationBarColorDarkId)).setNavigationBarDividerColor(getColorCompat(this.mMetadata.navigationBarDividerColorDarkId)).build()).setDisplayMode(getDisplayMode()).setScreenOrientation(this.mMetadata.screenOrientation);
            List<String> list = this.mMetadata.additionalTrustedOrigins;
            if (list != null) {
                screenOrientation.setAdditionalTrustedOrigins(list);
            }
            addShareDataIfPresent(screenOrientation);
            TwaLauncher createTwaLauncher = createTwaLauncher();
            this.mTwaLauncher = createTwaLauncher;
            try {
                createTwaLauncher.launch(screenOrientation, getCustomTabsCallback(), this.mSplashScreenStrategy, new Runnable() { // from class: com.pesonal.adsdk.LauncherActivity$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LauncherActivity.this.m504lambda$launchTwa$0$compesonaladsdkLauncherActivity();
                    }
                }, getFallbackStrategy());
                if (!sChromeVersionChecked) {
                    ChromeUpdatePrompt.promptIfNeeded(this, this.mTwaLauncher.getProviderPackage());
                    sChromeVersionChecked = true;
                }
                if (ChromeOsSupport.isRunningOnArc(getApplicationContext().getPackageManager())) {
                    new TwaSharedPreferencesManager(this).writeLastLaunchedProviderPackageName(ChromeOsSupport.ARC_PAYMENT_APP);
                } else {
                    new TwaSharedPreferencesManager(this).writeLastLaunchedProviderPackageName(this.mTwaLauncher.getProviderPackage());
                }
                ManageDataLauncherActivity.addSiteSettingsShortcut(this, this.mTwaLauncher.getProviderPackage());
            } catch (Exception unused) {
                openUrlInDefaultBrowser(getLaunchingUrl().toString());
            }
        } catch (Exception unused2) {
            openUrlInDefaultBrowser(getLaunchingUrl().toString());
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = sLauncherActivitiesAlive + 1;
        sLauncherActivitiesAlive = i;
        boolean z = i > 1;
        boolean z2 = getIntent().getData() != null;
        boolean isShareIntent = SharingUtils.isShareIntent(getIntent());
        if (z && !z2 && !isShareIntent) {
            finish();
            return;
        }
        if (restartInNewTask()) {
            finish();
            return;
        }
        if (bundle != null && bundle.getBoolean(BROWSER_WAS_LAUNCHED_KEY)) {
            finish();
            return;
        }
        this.mMetadata = LauncherActivityMetadata.parse(this);
        if (splashScreenNeeded()) {
            LauncherActivityMetadata launcherActivityMetadata = this.mMetadata;
            int i2 = launcherActivityMetadata.splashImageDrawableId;
            int colorCompat = getColorCompat(launcherActivityMetadata.splashScreenBackgroundColorId);
            ImageView.ScaleType splashImageScaleType = getSplashImageScaleType();
            Matrix splashImageTransformationMatrix = getSplashImageTransformationMatrix();
            LauncherActivityMetadata launcherActivityMetadata2 = this.mMetadata;
            this.mSplashScreenStrategy = new PwaWrapperSplashScreenStrategy(this, i2, colorCompat, splashImageScaleType, splashImageTransformationMatrix, launcherActivityMetadata2.splashScreenFadeOutDurationMillis, launcherActivityMetadata2.fileProviderAuthority);
        }
        if (shouldLaunchImmediately()) {
            launchTwa();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sLauncherActivitiesAlive--;
        TwaLauncher twaLauncher = this.mTwaLauncher;
        if (twaLauncher != null) {
            twaLauncher.destroy();
        }
        PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = this.mSplashScreenStrategy;
        if (pwaWrapperSplashScreenStrategy != null) {
            pwaWrapperSplashScreenStrategy.destroy();
        }
    }

    @Override // android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = this.mSplashScreenStrategy;
        if (pwaWrapperSplashScreenStrategy != null) {
            pwaWrapperSplashScreenStrategy.onActivityEnterAnimationComplete();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        if (this.mBrowserWasLaunched) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(BROWSER_WAS_LAUNCHED_KEY, this.mBrowserWasLaunched);
    }

    public boolean shouldLaunchImmediately() {
        return true;
    }
}
