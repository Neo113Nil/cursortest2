package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;
import com.bytedance.sdk.component.adexpress.dynamic.vG.so;

/* loaded from: classes.dex */
public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, so soVar) {
        super(context, dynamicRootView, soVar);
        this.bNS = new AnimationButton(context);
        this.bNS.setTag(Integer.valueOf(getClickArea()));
        addView(this.bNS, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.Jd.icD() && "fillButton".equals(this.Ju.Wyp().icD())) {
            ((TextView) this.bNS).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.bNS).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.kj.cR() * 2;
            widgetLayoutParams.height -= this.kj.cR() * 2;
            widgetLayoutParams.topMargin += this.kj.cR();
            widgetLayoutParams.leftMargin += this.kj.cR();
            widgetLayoutParams.setMarginStart(widgetLayoutParams.leftMargin);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Jd
    public boolean Mxy() {
        super.Mxy();
        if (TextUtils.equals("download-progress-button", this.Ju.Wyp().icD()) && TextUtils.isEmpty(this.kj.Wyp())) {
            this.bNS.setVisibility(4);
            return true;
        }
        this.bNS.setTextAlignment(this.kj.so());
        ((TextView) this.bNS).setText(this.kj.Wyp());
        ((TextView) this.bNS).setTextColor(this.kj.yiw());
        ((TextView) this.bNS).setTextSize(this.kj.NB());
        ((TextView) this.bNS).setGravity(17);
        ((TextView) this.bNS).setIncludeFontPadding(false);
        if ("fillButton".equals(this.Ju.Wyp().icD())) {
            this.bNS.setPadding(0, 0, 0, 0);
        } else {
            this.bNS.setPadding(this.kj.vG(), this.kj.icD(), this.kj.Jd(), this.kj.pvs());
        }
        return true;
    }
}
