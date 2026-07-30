package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityDescription2Binding implements ViewBinding {
    public final ImageView btnBack;
    public final LinearLayout contentLayout;
    public final ImageView ivBackground;
    public final FrameLayout main;
    public final RelativeLayout rlNativeAd;
    private final FrameLayout rootView;
    public final TextView tvNativeAd;
    public final TextView txtFaqDescription;
    public final TextView txtFaqTitle;

    private ActivityDescription2Binding(FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, FrameLayout frameLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = frameLayout;
        this.btnBack = imageView;
        this.contentLayout = linearLayout;
        this.ivBackground = imageView2;
        this.main = frameLayout2;
        this.rlNativeAd = relativeLayout;
        this.tvNativeAd = textView;
        this.txtFaqDescription = textView2;
        this.txtFaqTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDescription2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDescription2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_description2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDescription2Binding bind(View view) {
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.contentLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.ivBackground;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    i = R.id.rlNativeAd;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.tvNativeAd;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.txtFaqDescription;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.txtFaqTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new ActivityDescription2Binding(frameLayout, imageView, linearLayout, imageView2, frameLayout, relativeLayout, textView, textView2, textView3);
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
