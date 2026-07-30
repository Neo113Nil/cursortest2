package com.moyoung.dafit.module.common.utils;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.Objects;

/* loaded from: classes4.dex */
public class o0 {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void hideTabToast(TabLayout.Tab tab) {
        tab.view.setLongClickable(false);
        if (Build.VERSION.SDK_INT >= 26) {
            tab.view.setTooltipText(null);
        }
    }

    public static void updateTabItemStyle(TabLayout tabLayout) {
        ColorStateList tabTextColors = tabLayout.getTabTextColors();
        for (int i8 = 0; i8 < tabLayout.getTabCount(); i8++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i8);
            CharSequence text = tabAt.getText();
            Objects.requireNonNull(text);
            String charSequence = text.toString();
            if (tabAt.getCustomView() == null) {
                TextView textView = new TextView(tabLayout.getContext());
                textView.setText(charSequence);
                textView.setGravity(17);
                textView.setTextColor(tabTextColors);
                textView.setTextSize(2, tabAt.isSelected() ? 12.0f : 11.0f);
                textView.setTypeface(tabAt.isSelected() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
                tabAt.setCustomView(textView);
            } else {
                TextView textView2 = (TextView) tabAt.getCustomView();
                textView2.setTextSize(2, tabAt.isSelected() ? 12.0f : 11.0f);
                textView2.setTypeface(tabAt.isSelected() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            }
        }
    }
}
