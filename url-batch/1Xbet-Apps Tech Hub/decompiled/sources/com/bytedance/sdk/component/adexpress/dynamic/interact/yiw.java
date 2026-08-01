package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ClickSlideUpShakeView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.ShakeClickView;
import org.json.JSONObject;

/* compiled from: ClickSlideUpShakeInteract.java */
/* loaded from: classes.dex */
public class yiw extends cR<ClickSlideUpShakeView> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.cR
    protected void Jd() {
    }

    public yiw(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, dynamicBaseWidget, yiwVar);
        this.icD = context;
        this.Jd = yiwVar;
        this.vG = dynamicBaseWidget;
        pvs(i, i2, i3, jSONObject, yiwVar);
    }

    private void pvs(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar) {
        int i4;
        this.pvs = new ClickSlideUpShakeView(this.icD, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.icD;
        if (yiwVar.ea() > 0) {
            i4 = yiwVar.ea();
        } else {
            i4 = com.bytedance.sdk.component.adexpress.Jd.icD() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(context, i4);
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setClipChildren(false);
        this.pvs.setSlideText(this.Jd.cnN());
        if (this.pvs instanceof ClickSlideUpShakeView) {
            ((ClickSlideUpShakeView) this.pvs).setShakeText(this.Jd.joF());
            final ShakeClickView shakeView = ((ClickSlideUpShakeView) this.pvs).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new ShakeAnimationView.pvs() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.yiw.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.vG.getDynamicClickListener());
            }
        }
    }
}
