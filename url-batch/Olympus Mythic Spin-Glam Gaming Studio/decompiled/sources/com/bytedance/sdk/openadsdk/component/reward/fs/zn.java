package com.bytedance.sdk.openadsdk.component.reward.fs;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.zg;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;

/* loaded from: classes3.dex */
public class zn extends fs {
    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public boolean btk() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public boolean fb() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void hhw() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void zmn(FrameLayout frameLayout) {
    }

    public zn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        super(fsVar);
    }

    public static boolean zmn(nqi nqiVar) {
        iqz.zn(nqiVar);
        return iqz.zn(nqiVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.fs
    public void zmn(zg zgVar) {
        fs(zgVar);
    }

    private void fs(zg zgVar) {
        if (zgVar == null) {
            return;
        }
        Context context = zgVar.getContext();
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        btkVar.setOrientation(1);
        zgVar.addView(btkVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar.setId(olo.fkt);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 100.0f;
        btkVar.addView(znVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar2.setId(olo.klz);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        znVar.addView(znVar2, layoutParams2);
        znVar2.addView(fs.zmn(context));
        if (this.fs.zq() != 3 && this.fs.zq() != 5) {
            com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
            fbVar.setId(olo.ghr);
            fbVar.setVisibility(8);
            fbVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.fb.zmn());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(jy.fs(context, 28.0f), jy.fs(context, 28.0f));
            layoutParams3.gravity = 8388693;
            layoutParams3.rightMargin = jy.fs(context, 20.0f);
            layoutParams3.bottomMargin = jy.fs(context, 10.0f);
            znVar.addView(fbVar, layoutParams3);
        }
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar3 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar3.setId(olo.phc);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 0.0f;
        btkVar.addView(znVar3, layoutParams4);
        znVar3.addView(fb.zmn(context, this.zmn.fs));
        com.bytedance.sdk.openadsdk.component.reward.view.btk.zmn(znVar3, this.fs);
        com.bytedance.sdk.openadsdk.component.reward.view.btk.zmn(znVar);
    }
}
