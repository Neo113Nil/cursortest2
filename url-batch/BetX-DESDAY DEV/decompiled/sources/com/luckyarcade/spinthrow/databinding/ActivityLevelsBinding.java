package com.luckyarcade.spinthrow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import com.luckyarcade.spinthrow.R;
import i1.m;

/* loaded from: classes.dex */
public final class ActivityLevelsBinding {
    public final MaterialButton backButton;
    public final MaterialButton easyButton;
    public final MaterialButton hardButton;
    public final MaterialButton mediumButton;
    private final FrameLayout rootView;

    private ActivityLevelsBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4) {
        this.rootView = frameLayout;
        this.backButton = materialButton;
        this.easyButton = materialButton2;
        this.hardButton = materialButton3;
        this.mediumButton = materialButton4;
    }

    public static ActivityLevelsBinding bind(View view) {
        int i = R.id.backButton;
        MaterialButton materialButton = (MaterialButton) m.h(view, i);
        if (materialButton != null) {
            i = R.id.easyButton;
            MaterialButton materialButton2 = (MaterialButton) m.h(view, i);
            if (materialButton2 != null) {
                i = R.id.hardButton;
                MaterialButton materialButton3 = (MaterialButton) m.h(view, i);
                if (materialButton3 != null) {
                    i = R.id.mediumButton;
                    MaterialButton materialButton4 = (MaterialButton) m.h(view, i);
                    if (materialButton4 != null) {
                        return new ActivityLevelsBinding((FrameLayout) view, materialButton, materialButton2, materialButton3, materialButton4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityLevelsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityLevelsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_levels, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
