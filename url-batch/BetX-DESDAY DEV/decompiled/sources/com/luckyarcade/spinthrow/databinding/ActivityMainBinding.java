package com.luckyarcade.spinthrow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luckyarcade.spinthrow.R;

/* loaded from: classes.dex */
public final class ActivityMainBinding {
    public final ConstraintLayout main;
    private final ConstraintLayout rootView;

    private ActivityMainBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.main = constraintLayout2;
    }

    public static ActivityMainBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new ActivityMainBinding(constraintLayout, constraintLayout);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
