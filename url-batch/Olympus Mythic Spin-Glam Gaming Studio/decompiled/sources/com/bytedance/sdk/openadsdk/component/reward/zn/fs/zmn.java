package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.zn.fs.fs;
import com.bytedance.sdk.openadsdk.component.reward.zn.zg;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.C4913ua;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zmn {
    private fs fb;
    private Context fs;
    private ViewGroup zmn;
    private com.bytedance.sdk.openadsdk.core.hhw.fb zn;

    public zmn(ViewGroup viewGroup, Context context) {
        this.zmn = viewGroup;
        this.fs = context;
        btk();
    }

    private void btk() {
        int fs = jy.fs(this.fs, 24.0f);
        this.zn = com.bytedance.sdk.openadsdk.core.widget.hhw.fs(this.fs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = fs;
        layoutParams.rightMargin = fs;
        this.zn.setLayoutParams(layoutParams);
        this.zn.setVisibility(8);
        this.fb = new fs();
        int zg = zg.zg();
        this.fb.zmn(zg);
        this.fb.fs(zg);
    }

    public void zmn() {
        ViewGroup viewGroup;
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.zn;
        if (fbVar == null || (viewGroup = this.zmn) == null) {
            return;
        }
        viewGroup.addView(fbVar);
    }

    public void zmn(View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.setOnClickListener(onClickListener);
        }
    }

    public void zmn(fs.zmn zmnVar) {
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.zmn(zmnVar);
        }
    }

    public void fs() {
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = this.zn;
        if (fbVar != null) {
            fbVar.setVisibility(0);
        }
    }

    public void zmn(final nqi nqiVar) {
        if (nqiVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cyb.fb.zmn("unify_web_close_backup", false, new com.bytedance.sdk.openadsdk.cyb.fs() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.zmn.1
            @Override // com.bytedance.sdk.openadsdk.cyb.fs
            public com.bytedance.sdk.openadsdk.cyb.zmn.zn zmn() throws Exception {
                JSONObject jSONObject = new JSONObject();
                if (nqiVar.rsi() != null) {
                    jSONObject.put("tpl_id", nqiVar.rsi().zmn());
                }
                jSONObject.put(C4913ua.b, nqiVar.ji());
                jSONObject.put("cid", nqiVar.gn());
                jSONObject.put("req_id", nqiVar.wbj());
                return com.bytedance.sdk.openadsdk.cyb.zmn.fb.fs().zmn("unify_web_close_backup").fs(jSONObject.toString());
            }
        });
    }

    public void zn() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.zmn();
        }
    }

    public void fb() {
        fs fsVar = this.fb;
        if (fsVar != null) {
            fsVar.fs();
        }
    }
}
