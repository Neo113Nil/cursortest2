package com.bytedance.sdk.openadsdk.component.bvs;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class zg {
    private static Drawable fs;
    private static boolean zmn;
    private TextView fb;
    private olo zn;

    public void zmn(zn znVar, nqi nqiVar, float f, float f2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (znVar != null) {
            this.zn = znVar.getHostAppIcon();
            this.fb = znVar.getHostAppName();
            View userInfo = znVar.getUserInfo();
            if (znVar instanceof fb) {
                olo oloVar = this.zn;
                if (oloVar != null && (layoutParams2 = oloVar.getLayoutParams()) != null) {
                    if (nqiVar.ol() == 1) {
                        int fs2 = jy.fs(this.zn.getContext(), 40.0f);
                        layoutParams2.width = fs2;
                        layoutParams2.height = fs2;
                    } else {
                        int fs3 = jy.fs(this.zn.getContext(), 30.0f);
                        layoutParams2.width = fs3;
                        layoutParams2.height = fs3;
                    }
                    this.zn.setLayoutParams(layoutParams2);
                }
                if (this.fb != null) {
                    if (nqiVar.ol() == 1) {
                        this.fb.setTextSize(30.0f);
                    } else {
                        this.fb.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (nqiVar.ol() == 1) {
                        layoutParams.height = jy.fs(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = jy.fs(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.bvs.zg.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/bvs/zg$1;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(h.u, view);
                        safedk_zg$1_onClick_d093020e6fd174394ee320fcd70b46cd(view);
                    }

                    public void safedk_zg$1_onClick_d093020e6fd174394ee320fcd70b46cd(View p0) {
                    }
                });
            }
        }
    }

    public void zmn() {
        String zg = iv.fs().zg();
        if (TextUtils.isEmpty(zg)) {
            this.fb.setVisibility(8);
        } else {
            this.fb.setText(zg);
        }
        fs();
        try {
            Drawable drawable = fs;
            if (drawable == null) {
                this.zn.setVisibility(8);
                return;
            }
            this.zn.setImageDrawable(drawable);
            if (this.fb.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.zn.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.zn.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.zn.setVisibility(8);
        }
    }

    public void fs() {
        if (zmn) {
            return;
        }
        try {
            int bvs = iv.fs().bvs();
            if (bvs != 0) {
                fs = kgc.zmn().getResources().getDrawable(bvs);
            }
            zmn = true;
        } catch (Throwable unused) {
            zmn = true;
        }
    }

    public static Drawable zn() {
        return fs;
    }
}
