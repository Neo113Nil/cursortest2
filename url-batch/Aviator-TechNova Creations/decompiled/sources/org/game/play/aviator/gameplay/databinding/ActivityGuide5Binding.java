package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityGuide5Binding implements ViewBinding {
    public final AppCompatButton btn5;
    public final LinearLayout catAdventure;
    public final LinearLayout catCard;
    public final LinearLayout catCasual;
    public final LinearLayout catPuzzle;
    public final LinearLayout catRacing;
    public final LinearLayout catSimulation;
    public final LinearLayout catSports;
    public final LinearLayout catStrategy;
    public final LinearLayout catSurvival;
    public final LinearLayout catWords;
    public final LinearLayout contentLayout;
    public final ImageView ivBackground;
    public final LinearLayout llHeader;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final TextView tvNativeAd;

    private ActivityGuide5Binding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, ImageView imageView, LinearLayout linearLayout12, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView) {
        this.rootView = relativeLayout;
        this.btn5 = appCompatButton;
        this.catAdventure = linearLayout;
        this.catCard = linearLayout2;
        this.catCasual = linearLayout3;
        this.catPuzzle = linearLayout4;
        this.catRacing = linearLayout5;
        this.catSimulation = linearLayout6;
        this.catSports = linearLayout7;
        this.catStrategy = linearLayout8;
        this.catSurvival = linearLayout9;
        this.catWords = linearLayout10;
        this.contentLayout = linearLayout11;
        this.ivBackground = imageView;
        this.llHeader = linearLayout12;
        this.main = relativeLayout2;
        this.rlNativeAd = relativeLayout3;
        this.tvNativeAd = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGuide5Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGuide5Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_guide5, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGuide5Binding bind(View view) {
        int i = R.id.btn5;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.catAdventure;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.catCard;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.catCasual;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.catPuzzle;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.catRacing;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.catSimulation;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.catSports;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.catStrategy;
                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout8 != null) {
                                            i = R.id.catSurvival;
                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout9 != null) {
                                                i = R.id.catWords;
                                                LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout10 != null) {
                                                    i = R.id.contentLayout;
                                                    LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout11 != null) {
                                                        i = R.id.ivBackground;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView != null) {
                                                            i = R.id.llHeader;
                                                            LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout12 != null) {
                                                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                                                i = R.id.rlNativeAd;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                if (relativeLayout2 != null) {
                                                                    i = R.id.tvNativeAd;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView != null) {
                                                                        return new ActivityGuide5Binding(relativeLayout, appCompatButton, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, imageView, linearLayout12, relativeLayout, relativeLayout2, textView);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
