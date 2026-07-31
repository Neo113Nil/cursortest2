package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class kw extends com.bytedance.sdk.openadsdk.core.hhw.zn {
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

    public kw(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        Context context = getContext();
        int fs = jy.fs(context, 12.0f);
        int fs2 = jy.fs(context, 10.0f);
        int fs3 = jy.fs(context, 24.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, jy.fs(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar.setId(520093720);
        fbVar.setClickable(true);
        fbVar.setFocusable(true);
        fbVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rc.zmn(context, "tt_leftbackicon_selector"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fs3, fs3);
        layoutParams.setMargins(fs, fs2, 0, fs2);
        layoutParams.gravity = (zmn(context) ? 5 : 3) | 16;
        addView(fbVar, layoutParams);
        if (zmn(context)) {
            fbVar.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_titlebar_forward"));
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar2 = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
        fbVar2.setId(com.bytedance.sdk.openadsdk.utils.olo.rje);
        fbVar2.setClickable(true);
        fbVar2.setFocusable(true);
        fbVar2.setImageResource(com.bytedance.sdk.component.utils.doe.fb(context, "tt_history_titlebar_delete"));
        fbVar2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(fs3, fs3);
        layoutParams2.setMargins(0, fs2, fs, fs2);
        layoutParams2.gravity = (zmn(context) ? 3 : 5) | 16;
        addView(fbVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(context);
        zgVar.setId(com.bytedance.sdk.openadsdk.utils.olo.ob);
        zgVar.setSingleLine(true);
        zgVar.setText(context.getString(com.bytedance.sdk.component.utils.doe.fs(context, "tt_history_title")));
        zgVar.setEllipsize(TextUtils.TruncateAt.END);
        int i = Build.VERSION.SDK_INT;
        zgVar.setTextAppearance(R.style.TextAppearance.Material.Medium);
        Typeface create = i >= 28 ? Typeface.create(zgVar.getTypeface(), 500, false) : null;
        if (create != null) {
            zgVar.setTypeface(create);
        }
        zgVar.setGravity(17);
        zgVar.setTextColor(-16777216);
        zgVar.setTextSize(1, 17.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        addView(zgVar, layoutParams3);
    }

    private boolean zmn(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private boolean zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.getDirectionality(c) == 1 || Character.getDirectionality(c) == 2) {
                return true;
            }
        }
        return false;
    }
}
