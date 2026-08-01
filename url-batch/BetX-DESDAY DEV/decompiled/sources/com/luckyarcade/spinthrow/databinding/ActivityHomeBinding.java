package com.luckyarcade.spinthrow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.luckyarcade.spinthrow.R;
import i1.m;

/* loaded from: classes.dex */
public final class ActivityHomeBinding {
    public final TextView bestScoreText;
    public final TextView crystalsText;
    public final MaterialButton playButton;
    private final FrameLayout rootView;
    public final MaterialButton rulesButton;
    public final TextView subtitleText;
    public final TextView titleText;

    private ActivityHomeBinding(FrameLayout frameLayout, TextView textView, TextView textView2, MaterialButton materialButton, MaterialButton materialButton2, TextView textView3, TextView textView4) {
        this.rootView = frameLayout;
        this.bestScoreText = textView;
        this.crystalsText = textView2;
        this.playButton = materialButton;
        this.rulesButton = materialButton2;
        this.subtitleText = textView3;
        this.titleText = textView4;
    }

    public static ActivityHomeBinding bind(View view) {
        int i = R.id.bestScoreText;
        TextView textView = (TextView) m.h(view, i);
        if (textView != null) {
            i = R.id.crystalsText;
            TextView textView2 = (TextView) m.h(view, i);
            if (textView2 != null) {
                i = R.id.playButton;
                MaterialButton materialButton = (MaterialButton) m.h(view, i);
                if (materialButton != null) {
                    i = R.id.rulesButton;
                    MaterialButton materialButton2 = (MaterialButton) m.h(view, i);
                    if (materialButton2 != null) {
                        i = R.id.subtitleText;
                        TextView textView3 = (TextView) m.h(view, i);
                        if (textView3 != null) {
                            i = R.id.titleText;
                            TextView textView4 = (TextView) m.h(view, i);
                            if (textView4 != null) {
                                return new ActivityHomeBinding((FrameLayout) view, textView, textView2, materialButton, materialButton2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_home, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
