package com.luckyarcade.spinthrow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.luckyarcade.spinthrow.KnifeThrowView;
import com.luckyarcade.spinthrow.R;
import i1.m;

/* loaded from: classes.dex */
public final class ActivityGameplayBinding {
    public final KnifeThrowView gameView;
    public final TextView knivesText;
    public final TextView levelText;
    public final TextView livesText;
    public final MaterialButton quitButton;
    private final LinearLayout rootView;
    public final TextView scoreText;

    private ActivityGameplayBinding(LinearLayout linearLayout, KnifeThrowView knifeThrowView, TextView textView, TextView textView2, TextView textView3, MaterialButton materialButton, TextView textView4) {
        this.rootView = linearLayout;
        this.gameView = knifeThrowView;
        this.knivesText = textView;
        this.levelText = textView2;
        this.livesText = textView3;
        this.quitButton = materialButton;
        this.scoreText = textView4;
    }

    public static ActivityGameplayBinding bind(View view) {
        int i = R.id.gameView;
        KnifeThrowView knifeThrowView = (KnifeThrowView) m.h(view, i);
        if (knifeThrowView != null) {
            i = R.id.knivesText;
            TextView textView = (TextView) m.h(view, i);
            if (textView != null) {
                i = R.id.levelText;
                TextView textView2 = (TextView) m.h(view, i);
                if (textView2 != null) {
                    i = R.id.livesText;
                    TextView textView3 = (TextView) m.h(view, i);
                    if (textView3 != null) {
                        i = R.id.quitButton;
                        MaterialButton materialButton = (MaterialButton) m.h(view, i);
                        if (materialButton != null) {
                            i = R.id.scoreText;
                            TextView textView4 = (TextView) m.h(view, i);
                            if (textView4 != null) {
                                return new ActivityGameplayBinding((LinearLayout) view, knifeThrowView, textView, textView2, textView3, materialButton, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActivityGameplayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGameplayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View inflate = layoutInflater.inflate(R.layout.activity_gameplay, viewGroup, false);
        if (z2) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
