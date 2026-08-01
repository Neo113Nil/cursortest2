package com.luckyarcade.spinthrow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import com.luckyarcade.spinthrow.R;
import i1.m;

/* loaded from: classes.dex */
public final class ActivityRulesBinding {
    public final MaterialButton backButton;
    private final FrameLayout rootView;

    private ActivityRulesBinding(FrameLayout frameLayout, MaterialButton materialButton) {
        this.rootView = frameLayout;
        this.backButton = materialButton;
    }

    public static ActivityRulesBinding bind(View view) {
        int i = R.id.backButton;
        MaterialButton materialButton = (MaterialButton) m.h(view, i);
        if (materialButton != null) {
            return new ActivityRulesBinding((FrameLayout) view, materialButton);
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
