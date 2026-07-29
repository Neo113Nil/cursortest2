package com.google.ads.mediation.testsuite.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.utils.UIUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;

/* loaded from: classes.dex */
public class NativeAdActivity extends AppCompatActivity {
    private NativeAd nativeAd;
    private FrameLayout nativeAdContainer;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_AppCompat_Light);
        setContentView(R.layout.activity_native_ad);
        this.nativeAdContainer = (FrameLayout) findViewById(R.id.native_ad_container);
        this.nativeAd = NetworkDetailActivity.getNativeAd();
        if (this.nativeAd instanceof NativeAppInstallAd) {
            UIUtils.updateAppInstallAdView(this.nativeAdContainer, null, (NativeAppInstallAd) this.nativeAd);
        } else {
            UIUtils.updateContentAdView(this.nativeAdContainer, null, (NativeContentAd) this.nativeAd);
        }
    }
}
