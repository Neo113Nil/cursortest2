package com.mopub.mobileads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.mopub.common.AdReport;
import com.mopub.common.CloseableLayout;
import com.mopub.common.DataKeys;

/* loaded from: classes2.dex */
abstract class BaseInterstitialActivity extends Activity {
    protected AdReport mAdReport;
    private Long mBroadcastIdentifier;
    private CloseableLayout mCloseableLayout;

    public abstract View getAdView();

    BaseInterstitialActivity() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.mBroadcastIdentifier = getBroadcastIdentifierFromIntent(intent);
        this.mAdReport = getAdReportFromIntent(intent);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        View adView = getAdView();
        this.mCloseableLayout = new CloseableLayout(this);
        this.mCloseableLayout.setOnCloseListener(new CloseableLayout.OnCloseListener() { // from class: com.mopub.mobileads.BaseInterstitialActivity.1
            @Override // com.mopub.common.CloseableLayout.OnCloseListener
            public void onClose() {
                BaseInterstitialActivity.this.finish();
            }
        });
        this.mCloseableLayout.addView(adView, new FrameLayout.LayoutParams(-1, -1));
        setContentView(this.mCloseableLayout);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.mCloseableLayout != null) {
            this.mCloseableLayout.removeAllViews();
        }
        super.onDestroy();
    }

    protected CloseableLayout getCloseableLayout() {
        return this.mCloseableLayout;
    }

    Long getBroadcastIdentifier() {
        return this.mBroadcastIdentifier;
    }

    protected void showInterstitialCloseButton() {
        if (this.mCloseableLayout != null) {
            this.mCloseableLayout.setCloseVisible(true);
        }
    }

    protected void hideInterstitialCloseButton() {
        if (this.mCloseableLayout != null) {
            this.mCloseableLayout.setCloseVisible(false);
        }
    }

    protected static Long getBroadcastIdentifierFromIntent(Intent intent) {
        if (intent.hasExtra(DataKeys.BROADCAST_IDENTIFIER_KEY)) {
            return Long.valueOf(intent.getLongExtra(DataKeys.BROADCAST_IDENTIFIER_KEY, -1L));
        }
        return null;
    }

    protected static AdReport getAdReportFromIntent(Intent intent) {
        try {
            return (AdReport) intent.getSerializableExtra(DataKeys.AD_REPORT_KEY);
        } catch (ClassCastException unused) {
            return null;
        }
    }
}
