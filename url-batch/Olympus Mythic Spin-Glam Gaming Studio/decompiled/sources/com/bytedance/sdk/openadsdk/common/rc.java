package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes5.dex */
public class rc {
    private com.bytedance.sdk.openadsdk.core.hhw.zg btk;
    private com.bytedance.sdk.openadsdk.core.widget.olo fb;
    protected Context fs;
    protected View zmn = btk();
    private com.bytedance.sdk.openadsdk.core.widget.zg zn;

    public rc(Context context) {
        this.fs = context;
    }

    public View zmn() {
        return this.zmn;
    }

    public com.bytedance.sdk.openadsdk.core.widget.olo fs() {
        return this.fb;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg zn() {
        return this.btk;
    }

    private View btk() {
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(this.fs);
        btkVar.setGravity(1);
        btkVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.olo oloVar = new com.bytedance.sdk.openadsdk.core.widget.olo(this.fs);
        this.fb = oloVar;
        oloVar.setId(520093745);
        int fs = jy.fs(this.fs, 64.0f);
        btkVar.addView(this.fb, new LinearLayout.LayoutParams(fs, fs));
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(this.fs);
        this.btk = zgVar;
        zgVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(jy.fs(this.fs, 219.0f), -2);
        layoutParams.topMargin = jy.fs(this.fs, 16.0f);
        this.btk.setLayoutParams(layoutParams);
        this.btk.setEllipsize(TextUtils.TruncateAt.END);
        this.btk.setGravity(17);
        this.btk.setMaxWidth(jy.fs(this.fs, 150.0f));
        this.btk.setMaxLines(2);
        this.btk.setTextColor(-1);
        this.btk.setTextSize(1, 16.0f);
        btkVar.addView(this.btk);
        this.zn = new com.bytedance.sdk.openadsdk.core.widget.zg(this.fs);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(jy.fs(this.fs, 219.0f), jy.fs(this.fs, 6.0f));
        layoutParams2.topMargin = jy.fs(this.fs, 32.0f);
        btkVar.addView(this.zn, layoutParams2);
        return btkVar;
    }

    public void zmn(int i) {
        this.zn.setProgress(i);
    }

    public void fb() {
        this.zmn = null;
        this.fs = null;
    }
}
