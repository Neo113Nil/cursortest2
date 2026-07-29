package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.DataKeys;
import com.mopub.common.IntentActions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.common.util.JavaScriptWebViewCallbacks;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.mraid.MraidController;
import com.mopub.mraid.MraidWebViewDebugListener;
import com.mopub.mraid.PlacementType;
import com.mopub.mraid.RewardedMraidController;

/* loaded from: classes2.dex */
public class RewardedMraidActivity extends MraidActivity {
    private MraidWebViewDebugListener mDebugListener;
    private RewardedMraidController mRewardedMraidController;

    public static void start(Context context, AdReport adReport, String str, long j, int i, boolean z) {
        try {
            Intents.startActivity(context, createIntent(context, adReport, str, j, i, z));
        } catch (IntentNotResolvableException unused) {
            Log.d("RewardedMraidActivity", "RewardedMraidActivity.class not found. Did you declare RewardedMraidActivity in your manifest?");
        }
    }

    @VisibleForTesting
    protected static Intent createIntent(Context context, AdReport adReport, String str, long j, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) RewardedMraidActivity.class);
        intent.putExtra(DataKeys.HTML_RESPONSE_BODY_KEY, str);
        intent.putExtra(DataKeys.BROADCAST_IDENTIFIER_KEY, j);
        intent.putExtra(DataKeys.AD_REPORT_KEY, adReport);
        intent.putExtra(DataKeys.REWARDED_AD_DURATION_KEY, i);
        intent.putExtra(DataKeys.SHOULD_REWARD_ON_CLICK_KEY, z);
        return intent;
    }

    @Override // com.mopub.mobileads.MraidActivity, com.mopub.mobileads.BaseInterstitialActivity
    public View getAdView() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(DataKeys.HTML_RESPONSE_BODY_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            MoPubLog.w("RewardedMraidActivity received a null HTML body. Finishing the activity.");
            finish();
            return new View(this);
        }
        if (getBroadcastIdentifier() == null) {
            MoPubLog.w("RewardedMraidActivity received a null broadcast id. Finishing the activity.");
            finish();
            return new View(this);
        }
        int intExtra = intent.getIntExtra(DataKeys.REWARDED_AD_DURATION_KEY, 30);
        final boolean booleanExtra = intent.getBooleanExtra(DataKeys.SHOULD_REWARD_ON_CLICK_KEY, false);
        this.mRewardedMraidController = new RewardedMraidController(this, this.mAdReport, PlacementType.INTERSTITIAL, intExtra, getBroadcastIdentifier().longValue());
        this.mRewardedMraidController.setDebugListener(this.mDebugListener);
        this.mRewardedMraidController.setMraidListener(new MraidController.MraidListener() { // from class: com.mopub.mobileads.RewardedMraidActivity.1
            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onExpand() {
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onLoaded(View view) {
                RewardedMraidActivity.this.mRewardedMraidController.loadJavascript(JavaScriptWebViewCallbacks.WEB_VIEW_DID_APPEAR.getJavascript());
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onFailedToLoad() {
                MoPubLog.d("RewardedMraidActivity failed to load. Finishing the activity");
                EventForwardingBroadcastReceiver.broadcastAction(RewardedMraidActivity.this, RewardedMraidActivity.this.getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_FAIL);
                RewardedMraidActivity.this.finish();
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onClose() {
                RewardedMraidActivity.this.mRewardedMraidController.loadJavascript(JavaScriptWebViewCallbacks.WEB_VIEW_DID_CLOSE.getJavascript());
                RewardedMraidActivity.this.finish();
            }

            @Override // com.mopub.mraid.MraidController.MraidListener
            public void onOpen() {
                if (booleanExtra) {
                    RewardedMraidActivity.this.mRewardedMraidController.showPlayableCloseButton();
                }
                EventForwardingBroadcastReceiver.broadcastAction(RewardedMraidActivity.this, RewardedMraidActivity.this.getBroadcastIdentifier().longValue(), IntentActions.ACTION_INTERSTITIAL_CLICK);
            }
        });
        this.mRewardedMraidController.fillContent(getBroadcastIdentifier(), stringExtra, null);
        return this.mRewardedMraidController.getAdContainer();
    }

    @Override // com.mopub.mobileads.MraidActivity, com.mopub.mobileads.BaseInterstitialActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mRewardedMraidController != null) {
            this.mRewardedMraidController.create(this, getCloseableLayout());
        }
    }

    @Override // com.mopub.mobileads.MraidActivity, android.app.Activity
    protected void onPause() {
        if (this.mRewardedMraidController != null) {
            this.mRewardedMraidController.pause();
        }
        super.onPause();
    }

    @Override // com.mopub.mobileads.MraidActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.mRewardedMraidController != null) {
            this.mRewardedMraidController.resume();
        }
    }

    @Override // com.mopub.mobileads.MraidActivity, com.mopub.mobileads.BaseInterstitialActivity, android.app.Activity
    protected void onDestroy() {
        if (this.mRewardedMraidController != null) {
            this.mRewardedMraidController.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.mRewardedMraidController == null || this.mRewardedMraidController.backButtonEnabled()) {
            super.onBackPressed();
        }
    }

    @Override // com.mopub.mobileads.MraidActivity
    @VisibleForTesting
    public void setDebugListener(MraidWebViewDebugListener mraidWebViewDebugListener) {
        this.mDebugListener = mraidWebViewDebugListener;
        if (this.mRewardedMraidController != null) {
            this.mRewardedMraidController.setDebugListener(mraidWebViewDebugListener);
        }
    }

    @VisibleForTesting
    @Deprecated
    public RewardedMraidController getRewardedMraidController() {
        return this.mRewardedMraidController;
    }
}
