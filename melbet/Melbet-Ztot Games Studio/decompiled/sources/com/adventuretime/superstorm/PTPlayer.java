package com.adventuretime.superstorm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.adventuretime.superstorm.lounge.PlumeCanvasActivity;
import com.buildbox.AdIntegratorManager;
import com.buildbox.consent.ConsentActivity;
import com.buildbox.consent.ConsentHelper;
import com.buildbox.consent.SdkConsentInfo;
import com.secrethq.store.PTStoreBridge;
import com.secrethq.utils.PTServicesBridge;
import java.util.Iterator;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import org.cocos2dx.lib.Cocos2dxReflectionHelper;

/* loaded from: classes.dex */
public class PTPlayer extends Cocos2dxActivity {
    private boolean isPTStoreAvailable = false;

    static {
        System.loadLibrary("player");
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        try {
            Log.v("----------", "onActivityResult: request: " + i + " result: " + i2);
            if (i == 9001) {
                SharedPreferences.Editor edit = getPreferences(0).edit();
                if (i2 == -1) {
                    PTServicesBridge.instance().onActivityResult(i, i2, intent);
                    edit.putBoolean("GooglePlayServiceSignInError", false);
                    edit.commit();
                } else if (i2 == 10002) {
                    Toast.makeText(this, "Google Play Services: Sign in error", 0).show();
                    edit.putBoolean("GooglePlayServiceSignInError", true);
                    edit.commit();
                } else if (i2 == 10004) {
                    Toast.makeText(this, "Google Play Services: App misconfigured", 0).show();
                }
            }
        } catch (Exception e) {
            Log.v("-----------", "onActivityResult FAIL on iabHelper : " + e.toString());
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getSharedPreferences("h8w3_k4memo", 0).getBoolean("stop_gate", false)) {
            startActivity(new Intent(this, (Class<?>) PlumeCanvasActivity.class));
            finish();
            return;
        }
        launchConsentActivity();
        hideVirtualButton();
        PTServicesBridge.initBridge(this, getString(R.string.app_id));
        getWindow().addFlags(128);
        AdIntegratorManager.onActivityCreated(this);
    }

    private void launchConsentActivity() {
        if (hasSeenConsentForAllSdks()) {
            return;
        }
        startActivity(new Intent(this, (Class<?>) ConsentActivity.class));
        finish();
    }

    private boolean hasSeenConsentForAllSdks() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        Iterator<SdkConsentInfo> it = ConsentHelper.getSdkConsentInfos().iterator();
        while (it.hasNext()) {
            if (!defaultSharedPreferences.contains(ConsentHelper.getConsentKey(it.next().getSdkId()))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.cocos2dx.lib.Cocos2dxHelper.Cocos2dxHelperListener
    public void onNativeInit() {
        initBridges();
    }

    private void initBridges() {
        AdIntegratorManager.initBridge(this);
        PTStoreBridge.initBridge(this);
        this.isPTStoreAvailable = true;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public Cocos2dxGLSurfaceView onCreateView() {
        Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = new Cocos2dxGLSurfaceView(this);
        cocos2dxGLSurfaceView.setEGLConfigChooser(8, 8, 8, 0, 0, 0);
        return cocos2dxGLSurfaceView;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        AdIntegratorManager.onActivityPaused(this);
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onResume() {
        hideVirtualButton();
        super.onResume();
        AdIntegratorManager.onActivityResumed(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideVirtualButton();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        AdIntegratorManager.onActivityStarted(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        AdIntegratorManager.onActivityStopped(this);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        AdIntegratorManager.onActivityDestroyed(this);
        super.onDestroy();
    }

    protected void hideVirtualButton() {
        int intValue = ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION")).intValue();
        int intValue2 = ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN")).intValue();
        int intValue3 = ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_HIDE_NAVIGATION")).intValue();
        Cocos2dxReflectionHelper.invokeInstanceMethod(getWindow().getDecorView(), "setSystemUiVisibility", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_LAYOUT_STABLE")).intValue() | intValue | intValue2 | intValue3 | ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_FULLSCREEN")).intValue() | ((Integer) Cocos2dxReflectionHelper.getConstantValue(View.class, "SYSTEM_UI_FLAG_IMMERSIVE_STICKY")).intValue())});
    }
}
