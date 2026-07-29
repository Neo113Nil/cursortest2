package com.mopub.mobileads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.mopub.common.AdType;
import com.mopub.common.DataKeys;
import com.mopub.common.FullAdType;
import com.mopub.common.IntentActions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.common.util.Reflection;
import com.mopub.mobileads.BaseVideoViewController;
import com.mopub.mraid.MraidVideoViewController;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public class MraidVideoPlayerActivity extends BaseVideoPlayerActivity implements BaseVideoViewController.BaseVideoViewControllerListener {
    private static final String NATIVE_VIDEO_VIEW_CONTROLLER = "com.mopub.nativeads.NativeVideoViewController";
    private BaseVideoViewController mBaseVideoController;
    private long mBroadcastIdentifier;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        this.mBroadcastIdentifier = getBroadcastIdentifierFromIntent(getIntent());
        try {
            this.mBaseVideoController = createVideoViewController(bundle);
            this.mBaseVideoController.onCreate();
        } catch (IllegalStateException unused) {
            BaseBroadcastReceiver.broadcastAction(this, this.mBroadcastIdentifier, IntentActions.ACTION_INTERSTITIAL_FAIL);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.mBaseVideoController != null) {
            this.mBaseVideoController.onPause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.mBaseVideoController != null) {
            this.mBaseVideoController.onResume();
        }
    }

    @Override // com.mopub.mobileads.BaseVideoPlayerActivity, android.app.Activity
    protected void onDestroy() {
        if (this.mBaseVideoController != null) {
            this.mBaseVideoController.onDestroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mBaseVideoController != null) {
            this.mBaseVideoController.onSaveInstanceState(bundle);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mBaseVideoController != null) {
            this.mBaseVideoController.onConfigurationChanged(configuration);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.mBaseVideoController == null || !this.mBaseVideoController.backButtonEnabled()) {
            return;
        }
        super.onBackPressed();
        this.mBaseVideoController.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.mBaseVideoController != null) {
            this.mBaseVideoController.onActivityResult(i, i2, intent);
        }
    }

    private BaseVideoViewController createVideoViewController(Bundle bundle) throws IllegalStateException {
        String stringExtra = getIntent().getStringExtra(BaseVideoPlayerActivity.VIDEO_CLASS_EXTRAS_KEY);
        if (FullAdType.VAST.equals(stringExtra)) {
            return new VastVideoViewController(this, getIntent().getExtras(), bundle, this.mBroadcastIdentifier, this);
        }
        if (AdType.MRAID.equals(stringExtra)) {
            return new MraidVideoViewController(this, getIntent().getExtras(), bundle, this);
        }
        if (TapjoyConstants.TJC_PLUGIN_NATIVE.equals(stringExtra)) {
            Class[] clsArr = {Context.class, Bundle.class, Bundle.class, BaseVideoViewController.BaseVideoViewControllerListener.class};
            Object[] objArr = {this, getIntent().getExtras(), bundle, this};
            if (!Reflection.classFound(NATIVE_VIDEO_VIEW_CONTROLLER)) {
                throw new IllegalStateException("Missing native video module");
            }
            try {
                return (BaseVideoViewController) Reflection.instantiateClassWithConstructor(NATIVE_VIDEO_VIEW_CONTROLLER, BaseVideoViewController.class, clsArr, objArr);
            } catch (Exception unused) {
                throw new IllegalStateException("Missing native video module");
            }
        }
        throw new IllegalStateException("Unsupported video type: " + stringExtra);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener
    public void onSetContentView(View view) {
        setContentView(view);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener
    public void onSetRequestedOrientation(int i) {
        setRequestedOrientation(i);
    }

    @Override // com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener
    public void onFinish() {
        finish();
    }

    @Override // com.mopub.mobileads.BaseVideoViewController.BaseVideoViewControllerListener
    public void onStartActivityForResult(Class<? extends Activity> cls, int i, Bundle bundle) {
        if (cls == null) {
            return;
        }
        try {
            startActivityForResult(Intents.getStartActivityIntent(this, cls, bundle), i);
        } catch (ActivityNotFoundException unused) {
            MoPubLog.d("Activity " + cls.getName() + " not found. Did you declare it in your AndroidManifest.xml?");
        }
    }

    protected static long getBroadcastIdentifierFromIntent(Intent intent) {
        return intent.getLongExtra(DataKeys.BROADCAST_IDENTIFIER_KEY, -1L);
    }

    @Deprecated
    BaseVideoViewController getBaseVideoViewController() {
        return this.mBaseVideoController;
    }

    @Deprecated
    void setBaseVideoViewController(BaseVideoViewController baseVideoViewController) {
        this.mBaseVideoController = baseVideoViewController;
    }
}
