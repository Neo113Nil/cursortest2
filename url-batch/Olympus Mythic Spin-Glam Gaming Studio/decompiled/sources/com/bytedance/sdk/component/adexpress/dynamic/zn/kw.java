package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.bjh;
import com.bytedance.sdk.component.utils.doe;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class kw implements nps<bjh> {
    private String btk;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.nps fb;
    private Context fs;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.iv hhw;
    private bjh zmn;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk zn;

    public kw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar, String str, com.bytedance.sdk.component.adexpress.dynamic.fb.iv ivVar) {
        this.fs = context;
        this.zn = btkVar;
        this.fb = npsVar;
        this.btk = str;
        this.hhw = ivVar;
        btk();
    }

    private void btk() {
        int gn = this.fb.gn();
        final com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn dynamicClickListener = this.zn.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.btk)) {
            Context context = this.fs;
            bjh bjhVar = new bjh(context, com.bytedance.sdk.component.adexpress.zn.zmn.bvs(context), this.hhw);
            this.zmn = bjhVar;
            if (bjhVar.getWriggleLayout() != null) {
                this.zmn.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.zmn.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.fb.rje())) {
                    this.zmn.getTopTextView().setText(doe.fs(this.fs, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.zmn.getTopTextView().setText(this.fb.rje());
                }
            }
        } else {
            Context context2 = this.fs;
            this.zmn = new bjh(context2, com.bytedance.sdk.component.adexpress.zn.zmn.bvs(context2), this.hhw);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.zmn.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, gn)));
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setShakeText(this.fb.mhu());
        this.zmn.setClipChildren(false);
        final View wriggleProgressIv = this.zmn.getWriggleProgressIv();
        this.zmn.setOnShakeViewListener(new bjh.zmn() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.kw.1
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
    public bjh zn() {
        return this.zmn;
    }
}
