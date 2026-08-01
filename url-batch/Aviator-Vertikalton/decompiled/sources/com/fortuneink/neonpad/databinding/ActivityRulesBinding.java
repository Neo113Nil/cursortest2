package com.fortuneink.neonpad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fortuneink.neonpad.R;
import com.google.android.material.button.MaterialButton;
import i1.m;

/* loaded from: classes.dex */
public final class ActivityRulesBinding {
    public final MaterialButton backButton;
    private final FrameLayout rootView;
    public final TextView rulesBody;
    public final TextView rulesTitle;

    private ActivityRulesBinding(FrameLayout frameLayout, MaterialButton materialButton, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.backButton = materialButton;
        this.rulesBody = textView;
        this.rulesTitle = textView2;
    }

    public static ActivityRulesBinding bind(View view) {
        int i = R.id.backButton;
        MaterialButton materialButton = (MaterialButton) m.h(view, i);
        if (materialButton != null) {
            i = R.id.rulesBody;
            TextView textView = (TextView) m.h(view, i);
            if (textView != null) {
                i = R.id.rulesTitle;
                TextView textView2 = (TextView) m.h(view, i);
                if (textView2 != null) {
                    return new ActivityRulesBinding((FrameLayout) view, materialButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityRulesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRulesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_rules, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
