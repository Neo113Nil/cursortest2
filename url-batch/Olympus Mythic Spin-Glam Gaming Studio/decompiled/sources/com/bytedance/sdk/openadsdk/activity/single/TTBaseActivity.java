package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.utils.bjh;
import com.bytedance.sdk.openadsdk.utils.zak;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class TTBaseActivity extends Activity {
    protected String fkt;
    protected boolean tf = false;
    private OnBackInvokedCallback zmn;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    protected boolean fb() {
        return false;
    }

    private static class zmn implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> zmn;

        zmn(TTBaseActivity tTBaseActivity) {
            this.zmn = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.zmn.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.rt();
            }
        }
    }

    protected void rt() {
        onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (fb() && bjh.zmn()) {
            this.zmn = new zmn(this);
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.zmn);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                super.onResume();
                return;
            } catch (IllegalArgumentException e) {
                iqz.zmn("TTBaseActivity", "super.onResume() run fail", e);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, Boolean.TRUE);
                    return;
                } catch (Exception e2) {
                    iqz.zmn("TTBaseActivity", "onResume set mCalled fail", e2);
                    return;
                }
            }
        }
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                try {
                    super.onPause();
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (IllegalArgumentException unused2) {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
                return;
            }
        }
        super.onPause();
    }

    public void zn(boolean z) {
        this.tf = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (!bjh.zmn() || this.zmn == null) {
            return;
        }
        onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.zmn);
        this.zmn = null;
    }

    protected void kgc() {
        try {
            if (!zak.fs() || Build.VERSION.SDK_INT < 29) {
                return;
            }
            getWindow().getDecorView().setForceDarkAllowed(false);
        } catch (Throwable unused) {
        }
    }
}
