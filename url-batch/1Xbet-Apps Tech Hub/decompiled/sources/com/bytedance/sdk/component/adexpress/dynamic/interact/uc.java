package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import org.json.JSONObject;

/* compiled from: WriggleGuideInteract.java */
/* loaded from: classes.dex */
public class uc implements so<WriggleGuideAnimationView> {
    private com.bytedance.sdk.component.adexpress.dynamic.vG.yiw Jd;
    private String NB;
    private Context icD;
    private WriggleGuideAnimationView pvs;
    private com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp sUS;
    private DynamicBaseWidget vG;

    public uc(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.vG.yiw yiwVar, String str, com.bytedance.sdk.component.adexpress.dynamic.vG.Wyp wyp) {
        this.icD = context;
        this.vG = dynamicBaseWidget;
        this.Jd = yiwVar;
        this.NB = str;
        this.sUS = wyp;
        NB();
    }

    private void NB() {
        int ea = this.Jd.ea();
        final com.bytedance.sdk.component.adexpress.dynamic.NB.pvs dynamicClickListener = this.vG.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.NB)) {
            Context context = this.icD;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, com.bytedance.sdk.component.adexpress.vG.pvs.Wyp(context), this.sUS);
            this.pvs = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.pvs.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.pvs.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.Jd.HWd())) {
                    this.pvs.getTopTextView().setText(com.bytedance.sdk.component.utils.uc.icD(this.icD, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.pvs.getTopTextView().setText(this.Jd.HWd());
                }
            }
        } else {
            Context context2 = this.icD;
            this.pvs = new WriggleGuideAnimationView(context2, com.bytedance.sdk.component.adexpress.vG.pvs.Wyp(context2), this.sUS);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.pvs.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(this.icD, ea)));
        this.pvs.setLayoutParams(layoutParams);
        this.pvs.setShakeText(this.Jd.cnN());
        this.pvs.setClipChildren(false);
        final View wriggleProgressIv = this.pvs.getWriggleProgressIv();
        this.pvs.setOnShakeViewListener(new WriggleGuideAnimationView.pvs() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.uc.1
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
    public WriggleGuideAnimationView vG() {
        return this.pvs;
    }
}
