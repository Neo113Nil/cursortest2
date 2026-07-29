package com.youappi.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.ui.views.IAdView;

/* loaded from: classes2.dex */
public class AdActivity extends Activity implements BaseAd.AdStateListener {
    public static final String EXTRA_AD_TYPE = AdActivity.class.getName() + ".adType";
    private static final String TAG = AdActivity.class.getSimpleName();
    public BaseAd _ad;
    private IAdView _adView;

    private void initViewByType(AdItem adItem) {
        if (this._ad != null) {
            this._adView = this._ad.createViewForAd(adItem);
            if (this._adView != null && this._adView.getView().getParent() == null) {
                this._adView.setStateListener(this);
                this._adView.loadAd();
                setContentView(this._adView.getView());
                this._adView.show();
                return;
            }
        }
        finish();
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void onAdClosed(IAdView iAdView) {
        AdItem adItem;
        if (iAdView == null) {
            return;
        }
        this._adView.setStateListener(null);
        if (getIntent() != null && (adItem = (AdItem) getIntent().getSerializableExtra(EXTRA_AD_TYPE)) != null && YouAPPi.getInstance() != null) {
            YouAPPi.getInstance().getLogicManager().a(adItem);
        }
        finish();
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void onAdError(IAdView iAdView, int i, Throwable th) {
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void onAdSkipped(IAdView iAdView) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(4);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        if (YouAPPi.getInstance() != null) {
            AdItem adItem = (AdItem) getIntent().getSerializableExtra(EXTRA_AD_TYPE);
            this._ad = YouAPPi.getInstance().getLogicManager().b(adItem);
            if (this._ad != null) {
                initViewByType(adItem);
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        AdItem adItem;
        if (getIntent() != null && (adItem = (AdItem) getIntent().getSerializableExtra(EXTRA_AD_TYPE)) != null && YouAPPi.getInstance() != null) {
            YouAPPi.getInstance().getLogicManager().a(adItem);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        AdItem adItem;
        super.onNewIntent(intent);
        if (getIntent() != null && (adItem = (AdItem) getIntent().getSerializableExtra(EXTRA_AD_TYPE)) != null) {
            YouAPPi.getInstance().getLogicManager().a(adItem);
        }
        this._ad = YouAPPi.getInstance().getLogicManager().b((AdItem) getIntent().getSerializableExtra(EXTRA_AD_TYPE));
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this._adView != null) {
            this._adView.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this._adView != null) {
            this._adView.onResume();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this._adView.onStart();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        if (this._adView != null) {
            this._adView.onUserInteraction();
        }
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void requestOrientationChange(int i) {
        setRequestedOrientation(i);
    }
}
