package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class btk {
    private final Activity btk;
    private final Context fb;
    private final nqi fs;
    private boolean hhw;
    com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zmn;
    private final String zn;

    public interface zmn {
        void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3);

        void zmn(String str, JSONObject jSONObject);
    }

    public btk(nqi nqiVar, String str, Context context, Activity activity) {
        this.fs = nqiVar;
        this.zn = str;
        this.fb = context;
        this.btk = activity;
    }

    public void zmn() {
        if (this.hhw) {
            return;
        }
        this.hhw = true;
        fb();
    }

    private void fb() {
        if (this.fs.va() == 4) {
            this.zmn = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.fb, this.zn);
        }
        if (this.zmn == null) {
            this.zmn = com.bytedance.sdk.openadsdk.phc.zmn.zmn.fb.zmn(this.btk, this.zn);
        }
    }

    public void fs() {
        com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn znVar = this.zmn;
        if (znVar != null) {
            znVar.zmn(this.fs);
        }
    }

    public com.bytedance.sdk.openadsdk.phc.zmn.zmn.zn zn() {
        return this.zmn;
    }

    public void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, int i, int i2, int i3, zmn zmnVar) {
        if (this.zmn != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.olo.nps) {
                zmnVar.zmn("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.olo.hhw) {
                zmnVar.zmn("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.olo.btk) {
                zmnVar.zmn("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.olo.fb) {
                    zmnVar.zmn("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        zmnVar.zmn(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }
}
