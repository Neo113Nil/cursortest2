package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.ww;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.cyb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class TTAdActivity extends TTBaseActivity {
    private boolean fs;
    private fs zmn;
    private int zn = -1;
    private final AtomicBoolean fb = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean fb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(@Nullable Bundle bundle) {
        long longExtra;
        nqi zmn;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (bundle != null) {
            this.fkt = bundle.getString("single_process_listener_key");
            this.fs = bundle.getBoolean("enable_new_arch", false);
        } else if (intent != null) {
            this.fkt = intent.getStringExtra("single_process_listener_key");
            this.fs = intent.getBooleanExtra("enable_new_arch", false);
            longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
            com.bytedance.sdk.openadsdk.zmn.btk.zmn zmn2 = zmn(this.fkt);
            com.bytedance.sdk.openadsdk.zmn.zn.fs fs = fs(this.fkt);
            zmn = com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.cn.fb.fs) null);
            if (zmn != null) {
                finish();
                return;
            }
            try {
                zmn.zmn(longExtra);
                this.zmn = new fs(this, zmn, this.fs);
                if (bundle != null && zmn.jy()) {
                    this.zmn.kgc();
                }
                this.zmn.zmn(this, bundle, zmn2, fs);
                if (bundle != null) {
                    iv.zmn(zmn, "activity_recreate", zmn.btk(), "activity_recreate", null);
                }
                com.bytedance.sdk.openadsdk.utils.fs.zmn(zmn);
                return;
            } catch (Throwable th) {
                iqz.zmn("BVA", "onCreate: ", th);
                iv.zmn(zmn, "show_ad_fail", zmn.btk(), "init_view_crash");
                finish();
                return;
            }
        }
        longExtra = 0;
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmn22 = zmn(this.fkt);
        com.bytedance.sdk.openadsdk.zmn.zn.fs fs2 = fs(this.fkt);
        zmn = com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.cn.fb.fs) null);
        if (zmn != null) {
        }
    }

    public com.bytedance.sdk.openadsdk.zmn.btk.zmn zmn(String str) {
        if (this.fs) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (com.bytedance.sdk.openadsdk.zmn.btk.zmn) am.zmn().zmn(str, com.bytedance.sdk.openadsdk.zmn.btk.zmn.class);
        }
        return am.zmn().fs();
    }

    public com.bytedance.sdk.openadsdk.zmn.zn.fs fs(String str) {
        if (this.fs) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (com.bytedance.sdk.openadsdk.zmn.zn.fs) am.zmn().zmn(str, com.bytedance.sdk.openadsdk.zmn.zn.fs.class);
        }
        return am.zmn().zn();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.zn >= 0) {
            am.zmn().zn(this.zn);
            this.zn = -1;
        }
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.zmn(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.zmn((Activity) this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.fb(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.zn(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.fs(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        fs fsVar = this.zmn;
        if (fsVar != null) {
            fsVar.zmn(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        zmn();
    }

    private void zmn() {
        if (this.fb.compareAndSet(false, true)) {
            fs fsVar = this.zmn;
            if (fsVar != null) {
                fsVar.btk(this);
            }
            fs();
        }
    }

    private void fs() {
        if (this.fs) {
            if (!TextUtils.isEmpty(this.fkt)) {
                am.zmn().zmn(this.fkt, isFinishing(), isChangingConfigurations());
            }
        } else {
            am.zmn().zmn((com.bytedance.sdk.openadsdk.zmn.btk.zmn) null);
            am.zmn().zmn((com.bytedance.sdk.openadsdk.zmn.zn.fs) null);
        }
        cyb.zmn();
        ww.zmn().zmn(String.valueOf(hashCode()));
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.fkt)) {
            bundle.putString("single_process_listener_key", this.fkt);
        }
        bundle.putBoolean("enable_new_arch", this.fs);
        fs fsVar = this.zmn;
        if (fsVar != null) {
            int zmn = am.zmn().zmn(fsVar.zmn());
            this.zn = zmn;
            this.zmn.zmn(this, bundle, zmn);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        zn();
    }

    private void zn() {
        fs fsVar = this.zmn;
        if (fsVar == null) {
            super.onBackPressed();
        } else {
            fsVar.bvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void rt() {
        zn();
    }
}
