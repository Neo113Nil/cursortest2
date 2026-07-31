package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.kgc;
import com.bytedance.sdk.component.adexpress.hhw.phc;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hhw extends olo<com.bytedance.sdk.component.adexpress.hhw.hhw> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.olo
    protected void fb() {
    }

    public hhw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, btkVar, npsVar);
        this.fs = context;
        this.fb = npsVar;
        this.zn = btkVar;
        zmn(i, i2, i3, jSONObject, npsVar);
    }

    private void zmn(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        int i4;
        this.zmn = new com.bytedance.sdk.component.adexpress.hhw.hhw(this.fs, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.fs;
        if (npsVar.gn() > 0) {
            i4 = npsVar.gn();
        } else {
            i4 = com.bytedance.sdk.component.adexpress.fb.fs() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, i4);
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setClipChildren(false);
        this.zmn.setSlideText(this.fb.mhu());
        phc phcVar = this.zmn;
        if (phcVar instanceof com.bytedance.sdk.component.adexpress.hhw.hhw) {
            ((com.bytedance.sdk.component.adexpress.hhw.hhw) phcVar).setShakeText(this.fb.tet());
            final com.bytedance.sdk.component.adexpress.hhw.kw shakeView = ((com.bytedance.sdk.component.adexpress.hhw.hhw) this.zmn).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new kgc.zmn() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.hhw.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.zn.getDynamicClickListener());
            }
        }
    }
}
