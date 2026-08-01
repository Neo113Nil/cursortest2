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
public final class ActivityResultBinding {
    public final MaterialButton menuButton;
    public final MaterialButton playAgainButton;
    public final TextView resultOutcome;
    public final TextView resultScore;
    public final TextView resultTitle;
    private final FrameLayout rootView;

    private ActivityResultBinding(FrameLayout frameLayout, MaterialButton materialButton, MaterialButton materialButton2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.menuButton = materialButton;
        this.playAgainButton = materialButton2;
        this.resultOutcome = textView;
        this.resultScore = textView2;
        this.resultTitle = textView3;
    }

    public static ActivityResultBinding bind(View view) {
        int i = R.id.menuButton;
        MaterialButton materialButton = (MaterialButton) m.h(view, i);
        if (materialButton != null) {
            i = R.id.playAgainButton;
            MaterialButton materialButton2 = (MaterialButton) m.h(view, i);
            if (materialButton2 != null) {
                i = R.id.resultOutcome;
                TextView textView = (TextView) m.h(view, i);
                if (textView != null) {
                    i = R.id.resultScore;
                    TextView textView2 = (TextView) m.h(view, i);
                    if (textView2 != null) {
                        i = R.id.resultTitle;
                        TextView textView3 = (TextView) m.h(view, i);
                        if (textView3 != null) {
                            return new ActivityResultBinding((FrameLayout) view, materialButton, materialButton2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_result, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
