package com.bytedance.sdk.openadsdk.rt.zmn.fs;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.core.hhw.fb;
import com.bytedance.sdk.openadsdk.core.hhw.nps;
import com.bytedance.sdk.openadsdk.core.hhw.zg;
import com.bytedance.sdk.openadsdk.core.hhw.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class fs extends zn {
    private Context zmn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fs(Context context) {
        super(context);
        this.zmn = context;
        fs();
    }

    private void fs() {
        setVisibility(8);
    }

    public void zmn() {
        Context context = getContext();
        if (getChildCount() > 0) {
            setVisibility(0);
            return;
        }
        nps npsVar = new nps(context);
        npsVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        zg zgVar = new zg(context);
        zgVar.setText(doe.fs(context, "tt_history_no_data"));
        zgVar.setId(olo.oep);
        zgVar.setTextSize(2, 18.0f);
        Typeface create = Build.VERSION.SDK_INT >= 28 ? Typeface.create(zgVar.getTypeface(), 500, false) : null;
        if (create != null) {
            zgVar.setTypeface(create);
        }
        zgVar.setTextColor(Color.parseColor("#333333"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        layoutParams.topMargin = zmn(16.0f);
        layoutParams.bottomMargin = zmn(8.0f);
        npsVar.addView(zgVar, layoutParams);
        fb fbVar = new fb(context);
        fbVar.setImageResource(doe.fb(context, "tt_history_empty_icon"));
        fbVar.setId(olo.zi);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zmn(72.0f), zmn(72.0f));
        layoutParams2.addRule(2, zgVar.getId());
        layoutParams2.addRule(14);
        npsVar.addView(fbVar, layoutParams2);
        zg zgVar2 = new zg(context);
        zgVar2.setText(doe.fs(context, "tt_history_placeholder_submessage"));
        zgVar2.setTextSize(2, 14.0f);
        zgVar2.setTextColor(Color.parseColor("#666666"));
        zgVar2.setGravity(17);
        zgVar2.setMaxWidth(zmn(280.0f));
        zgVar2.setLineSpacing(zmn(2.0f), 1.0f);
        zgVar2.setPadding(zmn(20.0f), 0, zmn(20.0f), 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, zgVar.getId());
        layoutParams3.addRule(14);
        layoutParams3.topMargin = zmn(8.0f);
        npsVar.addView(zgVar2, layoutParams3);
        addView(npsVar);
    }

    private int zmn(float f) {
        return jy.fs(this.zmn, f);
    }
}
