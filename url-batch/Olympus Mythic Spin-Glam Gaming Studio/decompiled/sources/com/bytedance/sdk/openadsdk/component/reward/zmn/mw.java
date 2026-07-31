package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes15.dex */
public class mw {
    private boolean btk = false;
    private final fs fb;
    com.bytedance.sdk.component.adexpress.dynamic.fb fs;
    private boolean hhw;
    com.bytedance.sdk.openadsdk.component.reward.top.zn zmn;
    private final Activity zn;

    public mw(fs fsVar) {
        this.zn = fsVar.nu;
        this.fb = fsVar;
    }

    public void zmn() {
        if (this.btk) {
            return;
        }
        this.btk = true;
        fs fsVar = this.fb;
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = fsVar.oep;
        if (znVar != null) {
            this.zmn = znVar;
            this.hhw = true;
        } else {
            this.zmn = (com.bytedance.sdk.openadsdk.component.reward.top.zn) fsVar.hgd.findViewById(com.bytedance.sdk.openadsdk.utils.olo.ch);
        }
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar2 = this.zmn;
        if (znVar2 != null) {
            znVar2.zmn(this.fb.fs);
            if (this.fb.fs.ch()) {
                zmn(false);
            } else {
                zmn(this.fb.fs.bn());
            }
        }
    }

    public void zmn(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setShowDislike(z);
    }

    public void fs(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.zmn;
        if (znVar != null) {
            znVar.setSoundMute(z);
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb fbVar = this.fs;
        if (fbVar != null) {
            fbVar.setSoundMute(z);
        }
    }

    public void zn(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setShowSound(z);
    }

    public void fb(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setShowSkip(z);
    }

    public void zmn(String str, CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setTime(String.valueOf(str), charSequence);
    }

    public void zmn(CharSequence charSequence) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setSkipText(charSequence);
    }

    public void fs() {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.showCountDownText();
    }

    public void btk(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setSkipEnable(z);
    }

    public void zn() {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.showSkipButton();
    }

    public void fb() {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.zmn;
        if (znVar != null) {
            znVar.clickSkip();
        }
    }

    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.zmn;
        if (znVar != null) {
            znVar.clickSound(str);
        }
    }

    public void btk() {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar;
        if (this.hhw || (znVar = this.zmn) == null) {
            return;
        }
        znVar.setSkipInvisiable();
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.top.fs fsVar) {
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.zmn;
        if (znVar != null) {
            znVar.setListener(fsVar);
        }
    }

    public void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb fbVar) {
        this.fs = fbVar;
    }

    public void zmn(int i) {
        View findViewById;
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.zmn;
        if (znVar == null || znVar.getITopLayout() == null || i == 0 || (findViewById = this.zmn.getITopLayout().findViewById(520093713)) == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || findViewById.getWidth() <= 0 || findViewById.getVisibility() != 0) {
            return;
        }
        int[] iArr = new int[2];
        findViewById.getLocationOnScreen(iArr);
        int width = i - (iArr[0] + findViewById.getWidth());
        if (width < jy.fs(this.zn, 16.0f)) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += jy.fs(this.zn, 16.0f) - width;
            findViewById.requestLayout();
        }
    }
}
