package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;

/* loaded from: classes2.dex */
public class PAGAppOpenBaseLayout extends PAGRelativeLayout {
    PAGLogoView Jd;
    DSPAdChoice Ju;
    final PAGAppOpenTopBarView Mxy;
    ButtonFlash NB;
    TTRoundRectImageView Wyp;
    PAGFrameLayout icD;
    PAGTextView kj;
    PAGImageView pvs;
    PAGTextView qh;
    PAGLinearLayout sUS;
    PAGTextView so;
    PAGImageView vG;
    TTRoundRectImageView yiw;

    public PAGAppOpenBaseLayout(Context context) {
        super(context);
        this.Mxy = new PAGAppOpenTopBarView(context);
    }

    public TTRoundRectImageView getIconOnlyView() {
        return this.Wyp;
    }

    public PAGTextView getTitle() {
        return this.qh;
    }

    public PAGTextView getContent() {
        return this.kj;
    }

    public PAGImageView getBackImage() {
        return this.pvs;
    }

    public PAGFrameLayout getVideoContainer() {
        return this.icD;
    }

    public PAGImageView getImageView() {
        return this.vG;
    }

    public PAGLogoView getAdLogo() {
        return this.Jd;
    }

    public ButtonFlash getClickButton() {
        return this.NB;
    }

    public PAGLinearLayout getUserInfo() {
        return this.sUS;
    }

    public TTRoundRectImageView getAppIcon() {
        return this.yiw;
    }

    public PAGTextView getAppName() {
        return this.so;
    }

    public DSPAdChoice getDspAdChoice() {
        return this.Ju;
    }

    public TextView getTopDisLike() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.Mxy;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopDislike();
        }
        return null;
    }

    public TextView getTopSkip() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.Mxy;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopSkip();
        }
        return null;
    }
}
