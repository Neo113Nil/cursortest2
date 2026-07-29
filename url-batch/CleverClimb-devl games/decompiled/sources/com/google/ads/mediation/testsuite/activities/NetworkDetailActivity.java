package com.google.ads.mediation.testsuite.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.dataobjects.NetworkAdapter;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.ads.mediation.testsuite.utils.TextViewLogger;
import com.google.ads.mediation.testsuite.utils.UIUtils;
import com.google.ads.mediation.testsuite.utils.logging.Logger;
import com.google.ads.mediation.testsuite.utils.logging.RequestEvent;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class NetworkDetailActivity extends AppCompatActivity {
    private static final String AD_JSON_TEMPLATE = "{\"mediation\":true,\"ad_json\":{\"ad_type\":\"banner\",\"qdata\":\"x\",\"ad_networks\":[{\"adapters\":[\"***ADAPTER_CLASS_NAME***\"],\"id\":\"garbage\",\"imp_urls\":[\"http://google.com\"],\"data\":{***SERVER_PARAMS***}}],\"settings\":{\"click_urls\":[\"@gw_adnetid@\"],\"imp_urls\":[],\"nofill_urls\":[\"http://google.com\"],\"refresh\":\"60\"}}}";
    private static final String BANNER_FORMAT = "banner";
    private static final String CUSTOM_EVENT_ADAPTER_CLASS = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
    private static final String FAKE_AD_UNIT_ID = "Doesn't really matter what goes in here";
    private static final String INTERSTITIAL_FORMAT = "interstitial";
    private static final String NATIVE_FORMAT = "native";
    public static final String NETWORKCONFIG_EXTRA_KEY = "NETWORKCONFIG";
    private static final String REWARDED_FORMAT = "rewarded";
    private static NativeAd nativeAd;
    private AdView adView;
    private FrameLayout adViewContainer;
    private TextView adapterLabel;
    private TextView adapterResult;
    private InterstitialAd interstitialAd;
    private int lastErrorCode;
    private Button loadButton;
    private TextView logView;
    private TextViewLogger logger;
    private TextView manifestLabel;
    private TextView manifestResult;
    private NetworkConfig networkConfig;
    private TextView networkNameView;
    private LinearLayout paramContainer;
    private RewardedVideoAd rewardedAd;
    private TextView sdkLabel;
    private TextView sdkResult;
    private Button showButton;
    private TextView testLabel;
    private TextView testResult;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_AppCompat_Light);
        setContentView(R.layout.activity_network_detail);
        this.networkNameView = (TextView) findViewById(R.id.tv_network_name);
        this.logView = (TextView) findViewById(R.id.tv_log);
        this.paramContainer = (LinearLayout) findViewById(R.id.params_container);
        this.paramContainer.setFocusableInTouchMode(true);
        this.loadButton = (Button) findViewById(R.id.btn_load);
        this.showButton = (Button) findViewById(R.id.btn_show);
        this.adViewContainer = (FrameLayout) findViewById(R.id.ad_view_container);
        this.sdkLabel = (TextView) findViewById(R.id.tv_sdk);
        this.sdkResult = (TextView) findViewById(R.id.tv_sdk_result);
        this.adapterLabel = (TextView) findViewById(R.id.tv_adapter);
        this.adapterResult = (TextView) findViewById(R.id.tv_adapter_result);
        this.manifestLabel = (TextView) findViewById(R.id.tv_manifest);
        this.manifestResult = (TextView) findViewById(R.id.tv_manifest_result);
        this.testLabel = (TextView) findViewById(R.id.tv_test);
        this.testResult = (TextView) findViewById(R.id.tv_test_result);
        this.logger = new TextViewLogger(this.logView);
        this.networkConfig = (NetworkConfig) getIntent().getParcelableExtra(NETWORKCONFIG_EXTRA_KEY);
        setLastErrorCode(this.networkConfig.getLastErrorCode());
        createServerParamInputs(this.networkConfig.getAdapter(), this.networkConfig);
        this.networkNameView.setText(this.networkConfig.getAdapter().getNetworkLabel() + " " + this.networkConfig.getAdapter().getFormat());
        if (this.networkConfig.getAdapter().getNetwork() == null) {
            this.sdkLabel.setVisibility(8);
            this.sdkResult.setVisibility(8);
            this.manifestLabel.setVisibility(8);
            this.manifestResult.setVisibility(8);
            this.adapterLabel.setText("Custom Event Class: ");
        } else {
            if (this.networkConfig.getAdapter().getNetwork().isSdkPresent()) {
                this.sdkResult.setText("Found");
                this.sdkResult.setBackgroundColor(UIUtils.OK_COLOR);
            } else {
                this.sdkResult.setText("Not found");
                this.sdkResult.setBackgroundColor(UIUtils.FAIL_COLOR);
            }
            if (this.networkConfig.getAdapter().getNetwork().isManifestPresent()) {
                this.manifestResult.setText("Correct");
                this.manifestResult.setBackgroundColor(UIUtils.OK_COLOR);
            } else {
                this.manifestResult.setText("Missing entries");
                this.manifestResult.setBackgroundColor(UIUtils.FAIL_COLOR);
            }
        }
        if (this.networkConfig.getAdapter().isAdapterPresent()) {
            this.adapterResult.setText("Found");
            this.adapterResult.setBackgroundColor(UIUtils.OK_COLOR);
        } else {
            this.adapterResult.setText("Not found");
            this.adapterResult.setBackgroundColor(UIUtils.FAIL_COLOR);
        }
        this.loadButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.1
            /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
            
                if (r4.equals(com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.BANNER_FORMAT) != false) goto L24;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onClick(View view) {
                char c2 = 0;
                NetworkDetailActivity.this.loadButton.setEnabled(false);
                NetworkDetailActivity.this.showButton.setEnabled(false);
                String format = NetworkDetailActivity.this.networkConfig.getAdapter().getFormat();
                int hashCode = format.hashCode();
                if (hashCode != -1396342996) {
                    if (hashCode == -1052618729) {
                        if (format.equals("native")) {
                            c2 = 3;
                        }
                        c2 = 65535;
                    } else if (hashCode != -239580146) {
                        if (hashCode == 604727084 && format.equals("interstitial")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    } else {
                        if (format.equals(NetworkDetailActivity.REWARDED_FORMAT)) {
                            c2 = 2;
                        }
                        c2 = 65535;
                    }
                }
                switch (c2) {
                    case 0:
                        NetworkDetailActivity.this.loadBanner();
                        break;
                    case 1:
                        NetworkDetailActivity.this.loadInterstitial();
                        break;
                    case 2:
                        NetworkDetailActivity.this.loadRewarded();
                        break;
                    default:
                        NetworkDetailActivity.this.loadNative();
                        break;
                }
            }
        });
        if (this.networkConfig.getAdapter().getFormat().equals(BANNER_FORMAT)) {
            this.showButton.setVisibility(8);
        } else {
            this.showButton.setEnabled(false);
            this.showButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    char c2;
                    String format = NetworkDetailActivity.this.networkConfig.getAdapter().getFormat();
                    int hashCode = format.hashCode();
                    if (hashCode == -1396342996) {
                        if (format.equals(NetworkDetailActivity.BANNER_FORMAT)) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    } else if (hashCode == -1052618729) {
                        if (format.equals("native")) {
                            c2 = 3;
                        }
                        c2 = 65535;
                    } else if (hashCode != -239580146) {
                        if (hashCode == 604727084 && format.equals("interstitial")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    } else {
                        if (format.equals(NetworkDetailActivity.REWARDED_FORMAT)) {
                            c2 = 2;
                        }
                        c2 = 65535;
                    }
                    switch (c2) {
                        case 0:
                            break;
                        case 1:
                            NetworkDetailActivity.this.showInterstitial();
                            break;
                        case 2:
                            NetworkDetailActivity.this.showRewarded();
                            break;
                        default:
                            NetworkDetailActivity.this.showNative();
                            break;
                    }
                }
            });
        }
        this.rewardedAd = MobileAds.getRewardedVideoAdInstance(this);
        this.rewardedAd.setRewardedVideoAdListener(new RewardedVideoAdListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.3
            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdLoaded() {
                NetworkDetailActivity.this.setLastErrorCode(5);
                NetworkDetailActivity.this.logger.logEvent("onRewardedVideoAdLoaded() called.");
                NetworkDetailActivity.this.showButton.setEnabled(true);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdOpened() {
                NetworkDetailActivity.this.logger.logEvent("onRewardedVideoAdOpened() called.");
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoStarted() {
                NetworkDetailActivity.this.logger.logEvent("onRewardedVideoStarted() called.");
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdClosed() {
                NetworkDetailActivity.this.logger.logEvent("onRewardedVideoAdClosed() called.");
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewarded(RewardItem rewardItem) {
                NetworkDetailActivity.this.logger.logEvent("onRewarded() called.");
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdLeftApplication() {
                NetworkDetailActivity.this.logger.logEvent("onRewardedVideoAdLeftApplication() called.");
            }

            @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
            public void onRewardedVideoAdFailedToLoad(int i) {
                NetworkDetailActivity.this.setLastErrorCode(i);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent(String.format(Locale.getDefault(), "onRewardedVideoAdFailedToLoad() called with error code %d.", Integer.valueOf(i)));
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("LASTTESTRESULT", this.lastErrorCode);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastErrorCode(int i) {
        String str;
        this.lastErrorCode = i;
        if (i != -1) {
            Logger.logEvent(new RequestEvent(this.networkConfig, i), this);
        }
        int i2 = this.lastErrorCode;
        int i3 = UIUtils.FAIL_COLOR;
        if (i2 != 5) {
            switch (i2) {
                case -1:
                    str = "Untested";
                    i3 = UIUtils.NEUTRAL_COLOR;
                    break;
                case 0:
                    str = "Internal err";
                    break;
                case 1:
                    str = "Invalid req";
                    break;
                case 2:
                    str = "Network err";
                    break;
                default:
                    str = "No fill";
                    break;
            }
        } else {
            str = "Working!";
            i3 = UIUtils.OK_COLOR;
        }
        this.testResult.setText(str);
        this.testResult.setBackgroundColor(i3);
    }

    private void createServerParamInputs(NetworkAdapter networkAdapter, NetworkConfig networkConfig) {
        for (String str : networkAdapter.getServerParameters().keySet()) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            appCompatTextView.setText(str);
            if (Build.VERSION.SDK_INT < 23) {
                appCompatTextView.setTextAppearance(this, R.style.TextAppearance_AppCompat_Small);
            } else {
                appCompatTextView.setTextAppearance(R.style.TextAppearance_AppCompat_Small);
            }
            this.paramContainer.addView(appCompatTextView);
            String str2 = networkAdapter.getServerParameters().get(str);
            EditText editText = new EditText(this);
            editText.setTag(str2);
            if (networkConfig.getServerParameters().containsKey(str2)) {
                editText.setText(networkConfig.getServerParameters().get(str2));
            }
            editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            editText.setGravity(5);
            this.paramContainer.addView(editText);
        }
        this.paramContainer.setFocusableInTouchMode(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadBanner() {
        this.adViewContainer.setVisibility(8);
        this.adView = new AdView(this);
        this.adViewContainer.removeAllViews();
        this.adViewContainer.addView(this.adView);
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle()).build();
        this.adView.setAdUnitId(FAKE_AD_UNIT_ID);
        this.adView.setAdSize(AdSize.BANNER);
        this.adView.setAdListener(new AdListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.4
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                NetworkDetailActivity.this.logger.logEvent("Banner's onAdClosed() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                NetworkDetailActivity.this.setLastErrorCode(i);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent(String.format(Locale.getDefault(), "Banner's onAdFailedToLoad() called with error code %d.", Integer.valueOf(i)));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
                NetworkDetailActivity.this.logger.logEvent("Banner's onAdLeftApplication() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                NetworkDetailActivity.this.logger.logEvent("Banner's onAdOpened() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                NetworkDetailActivity.this.adViewContainer.setVisibility(0);
                NetworkDetailActivity.this.setLastErrorCode(5);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent("Banner's onAdLoaded() called.");
            }
        });
        this.adView.loadAd(build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadInterstitial() {
        this.showButton.setEnabled(false);
        this.interstitialAd = new InterstitialAd(this);
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle()).build();
        this.interstitialAd.setAdUnitId(FAKE_AD_UNIT_ID);
        this.interstitialAd.setAdListener(new AdListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.5
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                NetworkDetailActivity.this.logger.logEvent("Interstitial's onAdClosed() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                NetworkDetailActivity.this.setLastErrorCode(i);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent(String.format(Locale.getDefault(), "Interstitial's onAdFailedToLoad() called with error code %d.", Integer.valueOf(i)));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
                NetworkDetailActivity.this.logger.logEvent("Interstitial's onAdLeftApplication() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                NetworkDetailActivity.this.logger.logEvent("Interstitial's onAdOpened() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                NetworkDetailActivity.this.setLastErrorCode(5);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.showButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent("Interstitial's onAdLoaded() called.");
            }
        });
        this.interstitialAd.loadAd(build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInterstitial() {
        if (this.interstitialAd == null || !this.interstitialAd.isLoaded()) {
            return;
        }
        this.interstitialAd.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewarded() {
        this.showButton.setEnabled(false);
        this.rewardedAd.loadAd(FAKE_AD_UNIT_ID, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRewarded() {
        if (this.rewardedAd == null || !this.rewardedAd.isLoaded()) {
            return;
        }
        this.rewardedAd.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNative() {
        this.showButton.setEnabled(false);
        new AdLoader.Builder(this, "big ol' fake ad unit").forAppInstallAd(new NativeAppInstallAd.OnAppInstallAdLoadedListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.8
            @Override // com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
            public void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
                NetworkDetailActivity.this.setLastErrorCode(5);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.showButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent("Native app install ad loaded.");
                NativeAd unused = NetworkDetailActivity.nativeAd = nativeAppInstallAd;
            }
        }).forContentAd(new NativeContentAd.OnContentAdLoadedListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.7
            @Override // com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
            public void onContentAdLoaded(NativeContentAd nativeContentAd) {
                NetworkDetailActivity.this.setLastErrorCode(5);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.showButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent("Native content ad loaded.");
                NativeAd unused = NetworkDetailActivity.nativeAd = nativeContentAd;
            }
        }).withNativeAdOptions(new NativeAdOptions.Builder().build()).withAdListener(new AdListener() { // from class: com.google.ads.mediation.testsuite.activities.NetworkDetailActivity.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                NetworkDetailActivity.this.logger.logEvent("Native's onAdClosed() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                NetworkDetailActivity.this.setLastErrorCode(i);
                NetworkDetailActivity.this.loadButton.setEnabled(true);
                NetworkDetailActivity.this.logger.logEvent(String.format(Locale.getDefault(), "Native's onAdFailedToLoad() called with error code %d.", Integer.valueOf(i)));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
                NetworkDetailActivity.this.logger.logEvent("Native's onAdLeftApplication() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                NetworkDetailActivity.this.logger.logEvent("Native's onAdOpened() called.");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                NetworkDetailActivity.this.logger.logEvent("Native's onAdLoaded() called.");
                NetworkDetailActivity.this.showButton.setEnabled(true);
            }

            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzjd
            public void onAdClicked() {
                NetworkDetailActivity.this.logger.logEvent("Native's onAdClicked called().");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                NetworkDetailActivity.this.logger.logEvent("Native's onAdImpression called().");
            }
        }).build().loadAd(new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNative() {
        startActivity(new Intent(this, (Class<?>) NativeAdActivity.class));
    }

    private Bundle buildExtrasBundle() {
        String str;
        HashMap hashMap = new HashMap();
        for (int i = 1; i < this.paramContainer.getChildCount(); i += 2) {
            EditText editText = (EditText) this.paramContainer.getChildAt(i);
            hashMap.put((String) editText.getTag(), editText.getText().toString());
        }
        StringBuilder sb = new StringBuilder();
        Boolean bool = true;
        for (String str2 : hashMap.keySet()) {
            if (!bool.booleanValue()) {
                sb.append(", \n");
            }
            sb.append(String.format("\"%s\": \"%s\"", str2, hashMap.get(str2)));
            bool = false;
        }
        if (this.networkConfig.getAdapter().getNetwork() != null) {
            str = this.networkConfig.getAdapter().getClassName();
        } else {
            str = CUSTOM_EVENT_ADAPTER_CLASS;
            sb.append(", \"class_name\": \"");
            sb.append(this.networkConfig.getAdapter().getClassName());
            sb.append("\"");
        }
        String replace = AD_JSON_TEMPLATE.replace("***ADAPTER_CLASS_NAME***", str).replace("***SERVER_PARAMS***", sb.toString());
        Bundle bundle = new Bundle();
        bundle.putString("_ad", replace);
        return bundle;
    }

    public static NativeAd getNativeAd() {
        return nativeAd;
    }
}
