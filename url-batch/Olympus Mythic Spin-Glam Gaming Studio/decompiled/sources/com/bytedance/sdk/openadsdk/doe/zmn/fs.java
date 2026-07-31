package com.bytedance.sdk.openadsdk.doe.zmn;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.mw.nps;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes4.dex */
public class fs extends zmn {
    private FrameLayout btk;
    private final FrameLayout fb;
    private volatile boolean fs;
    private String hhw;
    private nps zn;

    public fs(Context context, nqi nqiVar, int i, boolean z, FrameLayout frameLayout, String str) {
        super(context, nqiVar, i, z, frameLayout);
        this.fb = frameLayout;
        this.hhw = str;
        fs(false);
        int zn = jy.zn(context);
        int btk = jy.btk(context);
        if (i == 1) {
            if (zn <= btk) {
                this.zmn.layout(0, 0, zn, btk);
                return;
            }
        } else {
            if (i != 2) {
                return;
            }
            if (zn > btk) {
                this.zmn.layout(0, 0, zn, btk);
                return;
            }
        }
        this.zmn.layout(0, 0, btk, zn);
    }

    public void zg() {
        super.zmn(true, new nps() { // from class: com.bytedance.sdk.openadsdk.doe.zmn.fs.1
            @Override // com.bytedance.sdk.openadsdk.mw.nps
            public void zmn() {
                if (fs.this.zn != null) {
                    fs.this.zn.zmn();
                } else {
                    fs.this.fs = true;
                }
            }
        });
    }

    public void zmn(FrameLayout frameLayout, nps npsVar) {
        this.btk = frameLayout;
        frameLayout.addView(this.fb);
        this.zn = npsVar;
        if (this.fs) {
            this.zn.zmn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.doe.zmn.zmn
    public void zmn() {
        this.btk.setVisibility(0);
        super.zmn();
    }

    public String bvs() {
        return this.hhw;
    }
}
