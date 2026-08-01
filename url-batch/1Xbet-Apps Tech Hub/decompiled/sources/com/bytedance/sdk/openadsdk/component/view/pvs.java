package com.bytedance.sdk.openadsdk.component.view;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: TTAppOpenAdUserInfoLayoutHelper.java */
/* loaded from: classes2.dex */
public class pvs {
    private static Drawable icD;
    private static boolean pvs;
    private TTRoundRectImageView Jd;
    private TextView NB;
    private LinearLayout vG;

    public void pvs(PAGAppOpenBaseLayout pAGAppOpenBaseLayout, cR cRVar, float f, float f2, boolean z) {
        if (pAGAppOpenBaseLayout != null) {
            this.vG = pAGAppOpenBaseLayout.getUserInfo();
            this.Jd = pAGAppOpenBaseLayout.getAppIcon();
            this.NB = pAGAppOpenBaseLayout.getAppName();
            this.vG.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.view.pvs.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        }
        pvs(cRVar, f, f2, z);
    }

    public void pvs() {
        String NB = so.icD().NB();
        if (TextUtils.isEmpty(NB)) {
            this.NB.setVisibility(8);
        } else {
            this.NB.setText(NB);
        }
        icD();
        try {
            Drawable drawable = icD;
            if (drawable == null) {
                this.Jd.setVisibility(8);
                return;
            }
            this.Jd.setImageDrawable(drawable);
            if (this.NB.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Jd.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.Jd.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.Jd.setVisibility(8);
        }
    }

    public void icD() {
        if (pvs) {
            return;
        }
        try {
            int sUS = so.icD().sUS();
            if (sUS != 0) {
                icD = mnm.pvs().getResources().getDrawable(sUS);
            }
            pvs = true;
        } catch (Throwable unused) {
            pvs = true;
        }
    }

    public static Drawable vG() {
        return icD;
    }

    private void pvs(cR cRVar, float f, float f2, boolean z) {
        int icD2;
        int vG;
        int Ju = cRVar.Ju();
        if (Ju == 1 || Ju == 3) {
            if (z) {
                icD2 = cRVar.od().vG();
                vG = cRVar.od().icD();
            } else {
                icD2 = cRVar.BSi().get(0).icD();
                vG = cRVar.BSi().get(0).vG();
            }
            if (icD2 <= 0 || vG <= 0) {
                return;
            }
            float f3 = vG;
            float min = f2 - (f3 * Math.min(f / icD2, f2 / f3));
            try {
                float icD3 = Pj.icD(mnm.pvs(), 60.0f);
                if (min < icD3) {
                    min = icD3;
                }
                ViewGroup.LayoutParams layoutParams = this.vG.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) min;
                    this.vG.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
