package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.kgc;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cn implements nps<com.bytedance.sdk.component.adexpress.hhw.kgc> {
    private String btk;
    private JSONObject bvs;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.nps fb;
    private Context fs;
    private int hhw;
    private int nps;
    private int zg;
    private com.bytedance.sdk.component.adexpress.hhw.kgc zmn;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk zn;

    public cn(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.fs = context;
        this.zn = btkVar;
        this.fb = npsVar;
        this.btk = str;
        this.hhw = i;
        this.nps = i2;
        this.zg = i3;
        this.bvs = jSONObject;
        btk();
    }

    private void btk() {
        final com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn dynamicClickListener = this.zn.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.btk)) {
            Context context = this.fs;
            com.bytedance.sdk.component.adexpress.hhw.kgc kgcVar = new com.bytedance.sdk.component.adexpress.hhw.kgc(context, com.bytedance.sdk.component.adexpress.zn.zmn.zg(context), this.hhw, this.nps, this.zg, this.bvs);
            this.zmn = kgcVar;
            if (kgcVar.getShakeLayout() != null) {
                this.zmn.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.fs;
            this.zmn = new com.bytedance.sdk.component.adexpress.hhw.kgc(context2, com.bytedance.sdk.component.adexpress.zn.zmn.nps(context2), this.hhw, this.nps, this.zg, this.bvs);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.zmn.setGravity(17);
        layoutParams.gravity = 17;
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setTranslationY(com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, this.fb.hwg()));
        this.zmn.setShakeText(this.fb.mhu());
        this.zmn.setClipChildren(false);
        this.zmn.setOnShakeViewListener(new kgc.zmn() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.cn.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void zmn() {
        this.zmn.zmn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void fs() {
        this.zmn.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.hhw.kgc zn() {
        return this.zmn;
    }
}
