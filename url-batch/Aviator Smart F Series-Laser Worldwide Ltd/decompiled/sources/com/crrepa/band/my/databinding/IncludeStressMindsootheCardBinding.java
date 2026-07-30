package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class IncludeStressMindsootheCardBinding implements ViewBinding {

    @NonNull
    public final CardView cardMindsoothe;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final ImageView ivMindsootheBg;

    @NonNull
    public final LinearLayout llMindsoothe;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvMindsootheContent1;

    @NonNull
    public final TextView tvMindsootheContent2;

    @NonNull
    public final TextView tvMindsootheTitle;

    @NonNull
    public final TextView tvMindsootheWhiteNoise;

    private IncludeStressMindsootheCardBinding(@NonNull LinearLayout linearLayout, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.cardMindsoothe = cardView;
        this.ivIcon = imageView;
        this.ivMindsootheBg = imageView2;
        this.llMindsoothe = linearLayout2;
        this.tvMindsootheContent1 = textView;
        this.tvMindsootheContent2 = textView2;
        this.tvMindsootheTitle = textView3;
        this.tvMindsootheWhiteNoise = textView4;
    }

    @NonNull
    public static IncludeStressMindsootheCardBinding bind(@NonNull View view) {
        int i8 = R.id.card_mindsoothe;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_mindsoothe);
        if (cardView != null) {
            i8 = R.id.iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
            if (imageView != null) {
                i8 = R.id.iv_mindsoothe_bg;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mindsoothe_bg);
                if (imageView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i8 = R.id.tv_mindsoothe_content1;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mindsoothe_content1);
                    if (textView != null) {
                        i8 = R.id.tv_mindsoothe_content2;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mindsoothe_content2);
                        if (textView2 != null) {
                            i8 = R.id.tv_mindsoothe_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mindsoothe_title);
                            if (textView3 != null) {
                                i8 = R.id.tv_mindsoothe_white_noise;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mindsoothe_white_noise);
                                if (textView4 != null) {
                                    return new IncludeStressMindsootheCardBinding(linearLayout, cardView, imageView, imageView2, linearLayout, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeStressMindsootheCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeStressMindsootheCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_stress_mindsoothe_card, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
