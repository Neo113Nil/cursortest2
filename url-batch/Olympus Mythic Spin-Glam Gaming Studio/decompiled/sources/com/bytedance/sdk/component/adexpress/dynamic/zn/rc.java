package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.am;
import com.bytedance.sdk.component.utils.doe;

/* loaded from: classes4.dex */
public class rc implements nps<ViewGroup> {
    private final FrameLayout fs;
    private final com.bytedance.sdk.component.adexpress.hhw.iv zmn;

    public rc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, String str, String str2) {
        int i;
        com.bytedance.sdk.component.adexpress.hhw.iv ivVar = new com.bytedance.sdk.component.adexpress.hhw.iv(context);
        this.zmn = ivVar;
        ivVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fs = frameLayout;
        frameLayout.addView(ivVar, new FrameLayout.LayoutParams(-2, -2));
        double io2 = npsVar.io();
        io2 = io2 == 0.0d ? 1.0d : io2;
        double lbc = npsVar.lbc();
        double d = lbc != 0.0d ? lbc : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if ("20".equals(str2)) {
            zmn(context, frameLayout, npsVar);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            if (npsVar.gn() > 0) {
                i = npsVar.gn();
            } else {
                i = com.bytedance.sdk.component.adexpress.fb.fs() ? 0 : 120;
            }
            layoutParams2.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(context, i);
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (btkVar.getDynamicWidth() * 0.32d * io2), (int) (btkVar.getDynamicWidth() * 0.32d * d));
        layoutParams3.gravity = 17;
        frameLayout.setLayoutParams(layoutParams3);
    }

    private void zmn(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -am.zmn(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(doe.fs(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, am.zmn(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(doe.fs(context, "tt_splash_brush_mask_hint")));
        if (npsVar != null && !TextUtils.isEmpty(npsVar.mhu())) {
            textView2.setText(npsVar.mhu());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void zmn() {
        this.zmn.zg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void fs() {
        this.zmn.hhw();
        ViewParent parent = this.fs.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.fs);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public ViewGroup zn() {
        return this.fs;
    }
}
