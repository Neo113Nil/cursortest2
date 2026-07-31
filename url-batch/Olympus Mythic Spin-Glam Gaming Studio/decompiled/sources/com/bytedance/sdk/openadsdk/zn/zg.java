package com.bytedance.sdk.openadsdk.zn;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.zn.iv;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.List;

/* loaded from: classes13.dex */
public class zg extends ViewGroup implements iv.zn {
    private final iv zmn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public zg(Context context, iv ivVar) {
        super(context);
        this.zmn = ivVar;
        ivVar.zmn(this);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < getChildCount()) {
            View childAt = getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i, i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = i3 != 0 ? marginLayoutParams.leftMargin : 0;
            int i7 = (measuredWidth + i6) + i5 < size ? i5 + i6 : 0;
            if (i7 == 0) {
                i4 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i5 = i7 + measuredWidth + marginLayoutParams.rightMargin;
            i3++;
        }
        setMeasuredDimension(size, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = i3 - i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i10 = i7 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i10 + i8 < i6) {
                i5 = i8 + i10;
            } else {
                i9 += marginLayoutParams.bottomMargin + measuredHeight;
                i5 = 0;
            }
            childAt.layout(i5, marginLayoutParams.topMargin + i9, i5 + measuredWidth, measuredHeight + i9);
            i8 = i5 + measuredWidth + marginLayoutParams.rightMargin;
            i7++;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void zmn(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                addView(fs(filterWord));
            }
        }
    }

    private View fs(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int fs = jy.fs(getContext(), 8.0f);
        marginLayoutParams.leftMargin = fs;
        marginLayoutParams.bottomMargin = fs;
        textView.setTextColor(zmn());
        textView.setText(filterWord.getName());
        textView.setPadding(fs, fs, fs, fs);
        textView.setBackground(fs());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zn.zg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zn/zg$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zg$1_onClick_59626835051d8491bf70cdd9128a85ea(view);
            }

            public void safedk_zg$1_onClick_59626835051d8491bf70cdd9128a85ea(View p0) {
                if (zg.this.zmn != null) {
                    if (p0.isSelected()) {
                        zg.this.zmn.zmn(iv.zmn);
                        return;
                    }
                    Object tag = p0.getTag();
                    if (tag instanceof FilterWord) {
                        zg.this.zmn.zmn((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    private ColorStateList zmn() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    private Drawable fs() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fs = jy.fs(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fs);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(jy.fs(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fs);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    @Override // com.bytedance.sdk.openadsdk.zn.iv.zn
    public void zmn(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (iv.zmn.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }
}
