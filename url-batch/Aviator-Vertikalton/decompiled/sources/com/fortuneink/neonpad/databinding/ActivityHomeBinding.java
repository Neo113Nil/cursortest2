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
public final class ActivityHomeBinding {
    private final FrameLayout rootView;
    public final MaterialButton rulesButton;
    public final MaterialButton startButton;
    public final TextView subtitleText;
    public final TextView titleText;

    private ActivityHomeBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2) {
        this.rootView = frameLayout;
        this.rulesButton = materialButton;
        this.startButton = materialButton2;
        this.subtitleText = textView;
        this.titleText = textView2;
    }

    public static ActivityHomeBinding bind(View view) {
        int i = R.id.rulesButton;
        MaterialButton materialButton = (MaterialButton) m.h(view, i);
        if (materialButton != null) {
            i = R.id.startButton;
            MaterialButton materialButton2 = (MaterialButton) m.h(view, i);
            if (materialButton2 != null) {
                i = R.id.subtitleText;
                TextView textView = (TextView) m.h(view, i);
                if (textView != null) {
                    i = R.id.titleText;
                    TextView textView2 = (TextView) m.h(view, i);
                    if (textView2 != null) {
                        return new ActivityHomeBinding((FrameLayout) view, materialButton, materialButton2, textView, textView2);
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
