package com.king.zxing;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes4.dex */
public class CaptureActivity extends AppCompatActivity implements q {
    public static final String KEY_RESULT = "SCAN_RESULT";
    private View ivTorch;
    private i mCaptureHelper;
    private SurfaceView surfaceView;
    private ViewfinderView viewfinderView;

    @Deprecated
    public com.king.zxing.camera.d getCameraManager() {
        return this.mCaptureHelper.getCameraManager();
    }

    public i getCaptureHelper() {
        return this.mCaptureHelper;
    }

    public int getIvTorchId() {
        return R$id.ivTorch;
    }

    public int getLayoutId() {
        return R$layout.zxl_capture;
    }

    public int getSurfaceViewId() {
        return R$id.surfaceView;
    }

    public int getViewfinderViewId() {
        return R$id.viewfinderView;
    }

    public void initCaptureHelper() {
        i iVar = new i(this, this.surfaceView, this.viewfinderView, this.ivTorch);
        this.mCaptureHelper = iVar;
        iVar.setOnCaptureCallback(this);
    }

    public void initUI() {
        this.surfaceView = (SurfaceView) findViewById(getSurfaceViewId());
        int viewfinderViewId = getViewfinderViewId();
        if (viewfinderViewId != 0) {
            this.viewfinderView = (ViewfinderView) findViewById(viewfinderViewId);
        }
        int ivTorchId = getIvTorchId();
        if (ivTorchId != 0) {
            View findViewById = findViewById(ivTorchId);
            this.ivTorch = findViewById;
            findViewById.setVisibility(4);
        }
        initCaptureHelper();
    }

    public boolean isContentView(@LayoutRes int i8) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int layoutId = getLayoutId();
        if (isContentView(layoutId)) {
            setContentView(layoutId);
        }
        initUI();
        this.mCaptureHelper.onCreate();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mCaptureHelper.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.mCaptureHelper.onPause();
    }

    @Override // com.king.zxing.q
    public boolean onResultCallback(String str) {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mCaptureHelper.onResume();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mCaptureHelper.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
