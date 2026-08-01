package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import org.json.JSONObject;

/* compiled from: ShakeInteract.java */
/* loaded from: classes.dex */
public class bNS implements so<ShakeAnimationView> {
    private com.bytedance.sdk.component.adexpress.dynamic.vG.yiw Jd;
    private JSONObject Mxy;
    private String NB;
    private Context icD;
    private ShakeAnimationView pvs;
    private int sUS;
    private int so;
    private DynamicBaseWidget vG;
    private int yiw;

    public bNS(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, String str, int i, int i2, int i3, JSONObject jSONObject) {
        this.icD = context;
        this.vG = dynamicBaseWidget;
        this.Jd = yiwVar;
        this.NB = str;
        this.sUS = i;
        this.yiw = i2;
        this.so = i3;
        this.Mxy = jSONObject;
        NB();
    }

    private void NB() {
        final com.bytedance.sdk.component.adexpress.dynamic.NB.pvs dynamicClickListener = this.vG.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.NB)) {
            Context context = this.icD;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, com.bytedance.sdk.component.adexpress.vG.pvs.Mxy(context), this.sUS, this.yiw, this.so, this.Mxy);
            this.pvs = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.pvs.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.icD;
            this.pvs = new ShakeAnimationView(context2, com.bytedance.sdk.component.adexpress.vG.pvs.so(context2), this.sUS, this.yiw, this.so, this.Mxy);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.pvs.setGravity(17);
        layoutParams.gravity = 17;
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setTranslationY(com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, this.Jd.Zm()));
        this.pvs.setShakeText(this.Jd.cnN());
        this.pvs.setClipChildren(false);
        this.pvs.setOnShakeViewListener(new ShakeAnimationView.pvs() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.bNS.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void pvs() {
        this.pvs.pvs();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    public void icD() {
        this.pvs.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.so
    /* renamed from: Jd, reason: merged with bridge method [inline-methods] */
    public ShakeAnimationView vG() {
        return this.pvs;
    }
}
