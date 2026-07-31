package com.unity3d.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.androidgamesdk.GameActivity;

/* loaded from: classes2.dex */
public class UnityPlayerGameActivity extends GameActivity implements IUnityPlayerLifecycleEvents, IUnityPermissionRequestSupport, IUnityPlayerSupport {
    protected UnityPlayerForGameActivity mUnityPlayer;

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    protected String updateUnityCommandLineArguments(String str) {
        return str;
    }

    class GameActivitySurfaceView extends GameActivity.InputEnabledSurfaceView {
        GameActivity mGameActivity;

        public GameActivitySurfaceView(GameActivity gameActivity) {
            super(gameActivity);
            this.mGameActivity = gameActivity;
        }

        @Override // android.view.View
        public boolean onCapturedPointerEvent(MotionEvent motionEvent) {
            return this.mGameActivity.onTouchEvent(motionEvent);
        }
    }

    static {
        System.loadLibrary("game");
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(true);
        }
    }

    @Override // com.unity3d.player.IUnityPlayerSupport
    public UnityPlayerForGameActivity getUnityPlayerConnection() {
        return this.mUnityPlayer;
    }

    private void applyInsetListener(final SurfaceView surfaceView) {
        surfaceView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.unity3d.player.UnityPlayerGameActivity$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                UnityPlayerGameActivity.this.lambda$applyInsetListener$0(surfaceView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyInsetListener$0(SurfaceView surfaceView) {
        onApplyWindowInsets(surfaceView, ViewCompat.getRootWindowInsets(getWindow().getDecorView()));
    }

    @Override // com.google.androidgamesdk.GameActivity
    protected GameActivity.InputEnabledSurfaceView createSurfaceView() {
        return new GameActivitySurfaceView(this);
    }

    @Override // com.google.androidgamesdk.GameActivity
    protected void onCreateSurfaceView() {
        super.onCreateSurfaceView();
        FrameLayout frameLayout = (FrameLayout) findViewById(this.contentViewId);
        applyInsetListener(this.mSurfaceView);
        this.mSurfaceView.setId(UnityPlayerForGameActivity.getUnityViewIdentifier(this));
        getIntent().putExtra("unity", updateUnityCommandLineArguments(getIntent().getStringExtra("unity")));
        this.mUnityPlayer = new UnityPlayerForGameActivity(this, frameLayout, this.mSurfaceView, this);
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.mUnityPlayer.destroy();
        super.onDestroy();
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        this.mUnityPlayer.onStop();
        super.onStop();
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        this.mUnityPlayer.onStart();
        super.onStart();
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        this.mUnityPlayer.onPause();
        super.onPause();
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        this.mUnityPlayer.onResume();
        super.onResume();
    }

    @Override // com.google.androidgamesdk.GameActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mUnityPlayer.configurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.google.androidgamesdk.GameActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.mUnityPlayer.windowFocusChanged(z);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.mUnityPlayer.newIntent(intent);
    }

    @Override // com.unity3d.player.IUnityPermissionRequestSupport
    public void requestPermissions(PermissionRequest permissionRequest) {
        this.mUnityPlayer.addPermissionRequest(permissionRequest);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.mUnityPlayer.permissionResponse(this, i, strArr, iArr);
    }
}
