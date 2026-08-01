package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.bannerexpress.pvs;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.ny;
import com.bytedance.sdk.openadsdk.core.so;
import io.ktor.http.LinkHeader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, pvs.InterfaceC0073pvs> vG = Collections.synchronizedMap(new HashMap());
    private ny icD;
    private Intent pvs;

    public static void pvs(cR cRVar, String str, pvs.InterfaceC0073pvs interfaceC0073pvs) {
        if (cRVar == null) {
            return;
        }
        Intent intent = new Intent(mnm.pvs(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(LinkHeader.Parameters.Type, 6);
        intent.putExtra("ext_info", cRVar.HWd());
        intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.pvs.pvs(cRVar.Ayu()));
        intent.putExtra("creative_info", cRVar.wjr().toString());
        intent.putExtra("closed_listener_key", str);
        if (interfaceC0073pvs != null) {
            if (com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                so.icD().pvs(str, interfaceC0073pvs);
            } else {
                vG.put(str, interfaceC0073pvs);
            }
        }
        if (mnm.pvs() != null) {
            mnm.pvs().startActivity(intent);
        }
    }

    public static void pvs(cR cRVar, String str) {
        pvs(cRVar, str, null);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!Ju.NB()) {
            finish();
            return;
        }
        icD();
        this.pvs = getIntent();
        if (mnm.pvs() == null) {
            mnm.pvs(this);
        }
    }

    private void icD() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (mnm.pvs() == null) {
            mnm.pvs(this);
        }
        setIntent(intent);
        this.pvs = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        ny nyVar = this.icD;
        if ((nyVar == null || ((com.bytedance.sdk.openadsdk.dislike.icD) nyVar).pvs == null || !((com.bytedance.sdk.openadsdk.dislike.icD) this.icD).pvs.isShowing()) && this.pvs != null) {
            vG();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    private void vG() {
        int intExtra = this.pvs.getIntExtra(LinkHeader.Parameters.Type, 0);
        if (intExtra != 1) {
            if (intExtra == 6) {
                pvs(this.pvs.getStringExtra("ext_info"), this.pvs.getStringExtra("filter_words"), this.pvs.getStringExtra("closed_listener_key"), this.pvs.getStringExtra("creative_info"));
                return;
            }
            finish();
        }
    }

    private void pvs(String str, String str2, final String str3, String str4) {
        if (str2 != null && str != null && this.icD == null) {
            com.bytedance.sdk.openadsdk.dislike.icD icd = new com.bytedance.sdk.openadsdk.dislike.icD(this, str, com.bytedance.sdk.openadsdk.tool.pvs.pvs(str2), str4, "other");
            this.icD = icd;
            icd.pvs(str3);
            this.icD.pvs(new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.ny.pvs
                public void pvs(int i, String str5) {
                    pvs.InterfaceC0073pvs vG2;
                    if (TTDelegateActivity.vG != null && TTDelegateActivity.vG.size() > 0 && !TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.icD.vG()) {
                        pvs.InterfaceC0073pvs interfaceC0073pvs = (pvs.InterfaceC0073pvs) TTDelegateActivity.vG.get(str3);
                        if (interfaceC0073pvs != null) {
                            interfaceC0073pvs.pvs();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (vG2 = so.icD().vG(str3)) != null) {
                        vG2.pvs();
                        so.icD().Jd(str3);
                    }
                    TTDelegateActivity.this.pvs(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.ny.pvs
                public void pvs() {
                    if (!((com.bytedance.sdk.openadsdk.dislike.icD) TTDelegateActivity.this.icD).icD()) {
                        TTDelegateActivity.this.pvs(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.dislike.icD) TTDelegateActivity.this.icD).pvs(false);
                }
            });
        }
        ny nyVar = this.icD;
        if (nyVar != null) {
            nyVar.pvs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(String str) {
        Map<String, pvs.InterfaceC0073pvs> map = vG;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.Ju.Jd()) {
            map.size();
        }
    }
}
