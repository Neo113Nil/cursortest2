package com.bytedance.sdk.component.adexpress.dynamic.zn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.hhw.iqz;

/* loaded from: classes12.dex */
public class cyb implements nps {
    private com.bytedance.sdk.component.adexpress.dynamic.fb.nps fb;
    private Context fs;
    private iqz zmn;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk zn;

    public cyb(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar, com.bytedance.sdk.component.adexpress.dynamic.fb.nps npsVar) {
        this.fs = context;
        this.zn = btkVar;
        this.fb = npsVar;
        fb();
    }

    private void fb() {
        this.zmn = new iqz(this.fs);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.fb.nps.zmn(this.fs, 120.0f));
        layoutParams.gravity = 17;
        this.zmn.setLayoutParams(layoutParams);
        this.zmn.setClipChildren(false);
        this.zmn.setGuideText(this.fb.mhu());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.btk btkVar = this.zn;
        if (btkVar != null) {
            this.zmn.setOnClickListener((View.OnClickListener) btkVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void zmn() {
        iqz iqzVar = this.zmn;
        if (iqzVar != null) {
            iqzVar.zmn();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public void fs() {
        iqz iqzVar = this.zmn;
        if (iqzVar != null) {
            iqzVar.fs();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.zn.nps
    public ViewGroup zn() {
        return this.zmn;
    }
}
