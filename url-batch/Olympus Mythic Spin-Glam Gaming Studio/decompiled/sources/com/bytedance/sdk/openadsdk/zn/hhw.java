package com.bytedance.sdk.openadsdk.zn;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class hhw extends ScrollView {
    private final com.bytedance.sdk.openadsdk.core.hhw.btk fs;
    private final iv zmn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public hhw(Context context, iv ivVar) {
        super(context);
        this.zmn = ivVar;
        com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
        this.fs = btkVar;
        btkVar.setOrientation(1);
        addView(btkVar, new FrameLayout.LayoutParams(-1, -2));
        if (ivVar.zg() == 0) {
            zmn();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void zmn() {
        if (this.zmn.zg() != 0) {
            return;
        }
        this.zmn.zmn(jy.zn(getContext()), jy.btk(getContext()));
    }

    public void zmn(List<FilterWord> list) {
        List<FilterWord> zn = zn(list);
        if (zn == null) {
            return;
        }
        fs(zn);
    }

    private void fs(List<FilterWord> list) {
        this.fs.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                this.fs.addView(new nps(getContext(), filterWord, this.zmn));
            }
            if (i < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int fs = jy.fs(getContext(), this.zmn.bvs() ? 16.0f : 8.0f);
                layoutParams.topMargin = fs;
                layoutParams.bottomMargin = fs;
                this.fs.addView(new rc(getContext()), layoutParams);
            }
        }
    }

    private static List<FilterWord> zn(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).hasSecondOptions()) {
                i2 = i3;
            }
        }
        if (i2 != -1 && i2 <= list.size()) {
            i = i2;
        }
        FilterWord filterWord = list.get(i);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }
}
