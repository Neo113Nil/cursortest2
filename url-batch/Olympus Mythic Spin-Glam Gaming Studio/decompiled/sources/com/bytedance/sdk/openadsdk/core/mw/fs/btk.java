package com.bytedance.sdk.openadsdk.core.mw.fs;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* loaded from: classes5.dex */
public class btk extends com.bytedance.adsdk.ugeno.fs.zn<FrameLayout> {
    public btk(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public FrameLayout zmn() {
        FrameLayout frameLayout = new FrameLayout(this.fs);
        com.bytedance.sdk.openadsdk.core.model.fs fsVar = new com.bytedance.sdk.openadsdk.core.model.fs();
        fsVar.zmn(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.fs);
        pAGLogoView.initData(fsVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    public void fs() {
        super.fs();
    }
}
