package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* loaded from: classes2.dex */
public class DSPAdChoice extends PAGImageView {
    public DSPAdChoice(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        setVisibility(8);
        setId(kj.Yjw);
    }

    public void pvs(int i, cR cRVar) {
        if (cRVar.SJ() || (cRVar.Mnp() && cRVar.so())) {
            Pj.pvs((View) this, 0);
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs((int) Pj.pvs(getContext(), i, true), this, cRVar);
        }
    }
}
