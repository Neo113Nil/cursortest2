package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.fb.nps;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.yj;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, nps.zmn> fb = Collections.synchronizedMap(new HashMap());
    private Intent fs;
    nqi zmn = null;
    private yj zn;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    public static void zmn(nqi nqiVar, String str, nps.zmn zmnVar) {
        if (nqiVar == null) {
            return;
        }
        Intent intent = new Intent(kgc.zmn(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        intent.putExtra("meta_index", am.zmn().zmn(nqiVar));
        if (zmnVar != null) {
            fb.put(str, zmnVar);
        }
        com.bytedance.sdk.component.utils.fs.zmn(kgc.zmn(), intent, null);
    }

    public static void zmn(nqi nqiVar, String str) {
        zmn(nqiVar, str, null);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!cn.btk()) {
            finish();
            return;
        }
        fs();
        this.fs = getIntent();
        if (kgc.zmn() == null) {
            kgc.fs(this);
        }
    }

    private void fs() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (kgc.zmn() == null) {
            kgc.fs(this);
        }
        setIntent(intent);
        this.fs = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        yj yjVar = this.zn;
        if ((yjVar == null || ((com.bytedance.sdk.openadsdk.zn.zn) yjVar).zmn == null || !((com.bytedance.sdk.openadsdk.zn.zn) yjVar).zmn.isShowing()) && this.fs != null) {
            zn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        yj yjVar = this.zn;
        if (yjVar != null) {
            yjVar.fs();
        }
    }

    private void zn() {
        int intExtra = this.fs.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra == 6) {
                if (this.zmn == null) {
                    this.zmn = am.zmn().zmn(am.zmn(this.fs));
                }
                nqi nqiVar = this.zmn;
                if (nqiVar == null) {
                    finish();
                    return;
                } else {
                    zmn(nqiVar.ze(), com.bytedance.sdk.openadsdk.tool.zmn.zmn(this.zmn.pa()), this.fs.getStringExtra("closed_listener_key"), this.zmn);
                    return;
                }
            }
            finish();
        }
    }

    private void zmn(String str, String str2, final String str3, nqi nqiVar) {
        if (str2 != null && str != null && this.zn == null) {
            com.bytedance.sdk.openadsdk.zn.zn znVar = new com.bytedance.sdk.openadsdk.zn.zn(this, str, com.bytedance.sdk.openadsdk.tool.zmn.zmn(str2), nqiVar);
            this.zn = znVar;
            znVar.zmn(new yj.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.yj.zmn
                public void zmn(int i, String str4) {
                    nps.zmn btk;
                    if (TTDelegateActivity.fb != null && TTDelegateActivity.fb.size() > 0 && !TextUtils.isEmpty(str3)) {
                        nps.zmn zmnVar = (nps.zmn) TTDelegateActivity.fb.get(str3);
                        if (zmnVar != null) {
                            zmnVar.zmn();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (btk = iv.fs().btk(str3)) != null) {
                        btk.zmn();
                        iv.fs().hhw(str3);
                    }
                    TTDelegateActivity.this.zmn(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.yj.zmn
                public void zmn() {
                    if (!((com.bytedance.sdk.openadsdk.zn.zn) TTDelegateActivity.this.zn).zn()) {
                        TTDelegateActivity.this.zmn(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.zn.zn) TTDelegateActivity.this.zn).zmn(false);
                }
            });
        }
        yj yjVar = this.zn;
        if (yjVar != null) {
            yjVar.zmn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(String str) {
        Map<String, nps.zmn> map = fb;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.cn.zn()) {
            map.size();
        }
    }
}
