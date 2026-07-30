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
public final class ActivityGuide1Binding implements ViewBinding {
    public final AppCompatButton btn1;
    public final LinearLayout btnEnglish;
    public final LinearLayout btnFrench;
    public final LinearLayout btnGujarati;
    public final LinearLayout btnHindi;
    public final LinearLayout btnRussian;
    public final LinearLayout btnSpanish;
    public final LinearLayout contentLayout;
    public final ImageView ivBackground;
    public final LinearLayout llHeader;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final TextView tvNativeAd;
    public final TextView tvTitle;

    private ActivityGuide1Binding(RelativeLayout relativeLayout, AppCompatButton appCompatButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, ImageView imageView, LinearLayout linearLayout8, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.btn1 = appCompatButton;
        this.btnEnglish = linearLayout;
        this.btnFrench = linearLayout2;
        this.btnGujarati = linearLayout3;
        this.btnHindi = linearLayout4;
        this.btnRussian = linearLayout5;
        this.btnSpanish = linearLayout6;
        this.contentLayout = linearLayout7;
        this.ivBackground = imageView;
        this.llHeader = linearLayout8;
        this.main = relativeLayout2;
        this.rlNativeAd = relativeLayout3;
        this.tvNativeAd = textView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityGuide1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityGuide1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_guide1, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityGuide1Binding bind(View view) {
        int i = R.id.btn1;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.btnEnglish;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.btnFrench;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.btnGujarati;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.btnHindi;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.btnRussian;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.btnSpanish;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout6 != null) {
                                    i = R.id.contentLayout;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout7 != null) {
                                        i = R.id.ivBackground;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.llHeader;
                                            LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout8 != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                                i = R.id.rlNativeAd;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout2 != null) {
                                                    i = R.id.tvNativeAd;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = R.id.tvTitle;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            return new ActivityGuide1Binding(relativeLayout, appCompatButton, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, imageView, linearLayout8, relativeLayout, relativeLayout2, textView, textView2);
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
