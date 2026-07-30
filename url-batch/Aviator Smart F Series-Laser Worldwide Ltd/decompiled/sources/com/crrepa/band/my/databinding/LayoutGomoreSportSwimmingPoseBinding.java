package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutGomoreSportSwimmingPoseBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llGomoreSportSwimmingPose;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvSwimStyleBackstroke;

    @NonNull
    public final TextView tvSwimStyleBackstrokeUnit;

    @NonNull
    public final TextView tvSwimStyleBreaststroke;

    @NonNull
    public final TextView tvSwimStyleBreaststrokeUnit;

    @NonNull
    public final TextView tvSwimStyleFrontCrawl;

    @NonNull
    public final TextView tvSwimStyleFrontCrawlUnit;

    @NonNull
    public final TextView tvSwimStyleSwimStyleButterfly;

    @NonNull
    public final TextView tvSwimStyleSwimStyleButterflyUnit;

    @NonNull
    public final TextView tvSwimType;

    @NonNull
    public final TextView tvSwimmingPoseTitle;

    private LayoutGomoreSportSwimmingPoseBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.rootView = linearLayout;
        this.llGomoreSportSwimmingPose = linearLayout2;
        this.tvSwimStyleBackstroke = textView;
        this.tvSwimStyleBackstrokeUnit = textView2;
        this.tvSwimStyleBreaststroke = textView3;
        this.tvSwimStyleBreaststrokeUnit = textView4;
        this.tvSwimStyleFrontCrawl = textView5;
        this.tvSwimStyleFrontCrawlUnit = textView6;
        this.tvSwimStyleSwimStyleButterfly = textView7;
        this.tvSwimStyleSwimStyleButterflyUnit = textView8;
        this.tvSwimType = textView9;
        this.tvSwimmingPoseTitle = textView10;
    }

    @NonNull
    public static LayoutGomoreSportSwimmingPoseBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.tv_swim_style_backstroke;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_backstroke);
        if (textView != null) {
            i8 = R.id.tv_swim_style_backstroke_unit;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_backstroke_unit);
            if (textView2 != null) {
                i8 = R.id.tv_swim_style_breaststroke;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_breaststroke);
                if (textView3 != null) {
                    i8 = R.id.tv_swim_style_breaststroke_unit;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_breaststroke_unit);
                    if (textView4 != null) {
                        i8 = R.id.tv_swim_style_front_crawl;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_front_crawl);
                        if (textView5 != null) {
                            i8 = R.id.tv_swim_style_front_crawl_unit;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_front_crawl_unit);
                            if (textView6 != null) {
                                i8 = R.id.tv_swim_style_swim_style_butterfly;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_swim_style_butterfly);
                                if (textView7 != null) {
                                    i8 = R.id.tv_swim_style_swim_style_butterfly_unit;
                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_style_swim_style_butterfly_unit);
                                    if (textView8 != null) {
                                        i8 = R.id.tv_swim_type;
                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swim_type);
                                        if (textView9 != null) {
                                            i8 = R.id.tv_swimming_pose_title;
                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_swimming_pose_title);
                                            if (textView10 != null) {
                                                return new LayoutGomoreSportSwimmingPoseBinding(linearLayout, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutGomoreSportSwimmingPoseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutGomoreSportSwimmingPoseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_gomore_sport_swimming_pose, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
