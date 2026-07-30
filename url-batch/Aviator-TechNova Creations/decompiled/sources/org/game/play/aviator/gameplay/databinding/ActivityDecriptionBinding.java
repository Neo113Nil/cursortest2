package org.game.play.aviator.gameplay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import org.game.play.aviator.gameplay.R;

/* loaded from: classes3.dex */
public final class ActivityDecriptionBinding implements ViewBinding {
    public final ImageView btnBack;
    public final AppCompatButton btnPlayGame;
    public final RelativeLayout contentLayout;
    public final CardView cvGameBanner;
    public final LinearLayout footerLayout;
    public final RelativeLayout headerLayout;
    public final ImageView imgGameBanner;
    public final ImageView ivBackground;
    public final RelativeLayout main;
    public final RelativeLayout rlNativeAd;
    private final RelativeLayout rootView;
    public final TextView tvNativeAd;
    public final TextView txtGameDescription;
    public final TextView txtGameTitle;

    private ActivityDecriptionBinding(RelativeLayout relativeLayout, ImageView imageView, AppCompatButton appCompatButton, RelativeLayout relativeLayout2, CardView cardView, LinearLayout linearLayout, RelativeLayout relativeLayout3, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = relativeLayout;
        this.btnBack = imageView;
        this.btnPlayGame = appCompatButton;
        this.contentLayout = relativeLayout2;
        this.cvGameBanner = cardView;
        this.footerLayout = linearLayout;
        this.headerLayout = relativeLayout3;
        this.imgGameBanner = imageView2;
        this.ivBackground = imageView3;
        this.main = relativeLayout4;
        this.rlNativeAd = relativeLayout5;
        this.tvNativeAd = textView;
        this.txtGameDescription = textView2;
        this.txtGameTitle = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDecriptionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDecriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_decription, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDecriptionBinding bind(View view) {
        int i = R.id.btnBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnPlayGame;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
            if (appCompatButton != null) {
                i = R.id.contentLayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.cvGameBanner;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.footerLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.headerLayout;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = R.id.imgGameBanner;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.ivBackground;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView3 != null) {
                                        RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                        i = R.id.rlNativeAd;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout4 != null) {
                                            i = R.id.tvNativeAd;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                i = R.id.txtGameDescription;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.txtGameTitle;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        return new ActivityDecriptionBinding(relativeLayout3, imageView, appCompatButton, relativeLayout, cardView, linearLayout, relativeLayout2, imageView2, imageView3, relativeLayout3, relativeLayout4, textView, textView2, textView3);
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
