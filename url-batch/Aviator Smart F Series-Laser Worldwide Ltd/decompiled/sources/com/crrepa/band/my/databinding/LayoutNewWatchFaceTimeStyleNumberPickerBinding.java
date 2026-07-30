package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceTimeStyleNumberPickerBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFaceLabelColorPickerBinding includeColorPicker;

    @NonNull
    public final ImageView ivBottomLabelArrow;

    @NonNull
    public final ImageView ivTimeLabelPositionArrow;

    @NonNull
    public final ImageView ivTopLabelArrow;

    @NonNull
    public final RelativeLayout rlBottomLabel;

    @NonNull
    public final RelativeLayout rlBottomWp;

    @NonNull
    public final RelativeLayout rlTimeLabelPosition;

    @NonNull
    public final RelativeLayout rlTopLabel;

    @NonNull
    public final RelativeLayout rlTopWp;

    @NonNull
    public final RelativeLayout rlWp;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvBottomLabel;

    @NonNull
    public final TextView tvTimeLabelPosition;

    @NonNull
    public final TextView tvTimeLabelPositionTips;

    @NonNull
    public final TextView tvTimeLabelPositionTitle;

    @NonNull
    public final TextView tvTopLabel;

    @NonNull
    public final WheelPicker wpTimeBottom;

    @NonNull
    public final WheelPicker wpTimePosition;

    @NonNull
    public final WheelPicker wpTimeTop;

    private LayoutNewWatchFaceTimeStyleNumberPickerBinding(@NonNull LinearLayout linearLayout, @NonNull LayoutNewWatchFaceLabelColorPickerBinding layoutNewWatchFaceLabelColorPickerBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull RelativeLayout relativeLayout6, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull WheelPicker wheelPicker, @NonNull WheelPicker wheelPicker2, @NonNull WheelPicker wheelPicker3) {
        this.rootView = linearLayout;
        this.includeColorPicker = layoutNewWatchFaceLabelColorPickerBinding;
        this.ivBottomLabelArrow = imageView;
        this.ivTimeLabelPositionArrow = imageView2;
        this.ivTopLabelArrow = imageView3;
        this.rlBottomLabel = relativeLayout;
        this.rlBottomWp = relativeLayout2;
        this.rlTimeLabelPosition = relativeLayout3;
        this.rlTopLabel = relativeLayout4;
        this.rlTopWp = relativeLayout5;
        this.rlWp = relativeLayout6;
        this.root = linearLayout2;
        this.tvBottomLabel = textView;
        this.tvTimeLabelPosition = textView2;
        this.tvTimeLabelPositionTips = textView3;
        this.tvTimeLabelPositionTitle = textView4;
        this.tvTopLabel = textView5;
        this.wpTimeBottom = wheelPicker;
        this.wpTimePosition = wheelPicker2;
        this.wpTimeTop = wheelPicker3;
    }

    @NonNull
    public static LayoutNewWatchFaceTimeStyleNumberPickerBinding bind(@NonNull View view) {
        int i8 = R.id.include_color_picker;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_color_picker);
        if (findChildViewById != null) {
            LayoutNewWatchFaceLabelColorPickerBinding bind = LayoutNewWatchFaceLabelColorPickerBinding.bind(findChildViewById);
            i8 = R.id.iv_bottom_label_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bottom_label_arrow);
            if (imageView != null) {
                i8 = R.id.iv_time_label_position_arrow;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_time_label_position_arrow);
                if (imageView2 != null) {
                    i8 = R.id.iv_top_label_arrow;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_top_label_arrow);
                    if (imageView3 != null) {
                        i8 = R.id.rl_bottom_label;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_bottom_label);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_bottom_wp;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_bottom_wp);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_time_label_position;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_time_label_position);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_top_label;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top_label);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.rl_top_wp;
                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top_wp);
                                        if (relativeLayout5 != null) {
                                            i8 = R.id.rl_wp;
                                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_wp);
                                            if (relativeLayout6 != null) {
                                                LinearLayout linearLayout = (LinearLayout) view;
                                                i8 = R.id.tv_bottom_label;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bottom_label);
                                                if (textView != null) {
                                                    i8 = R.id.tv_time_label_position;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_label_position);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_time_label_position_tips;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_label_position_tips);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_time_label_position_title;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_label_position_title);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_top_label;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top_label);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.wp_time_bottom;
                                                                    WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_bottom);
                                                                    if (wheelPicker != null) {
                                                                        i8 = R.id.wp_time_position;
                                                                        WheelPicker wheelPicker2 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_position);
                                                                        if (wheelPicker2 != null) {
                                                                            i8 = R.id.wp_time_top;
                                                                            WheelPicker wheelPicker3 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_top);
                                                                            if (wheelPicker3 != null) {
                                                                                return new LayoutNewWatchFaceTimeStyleNumberPickerBinding(linearLayout, bind, imageView, imageView2, imageView3, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, linearLayout, textView, textView2, textView3, textView4, textView5, wheelPicker, wheelPicker2, wheelPicker3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceTimeStyleNumberPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceTimeStyleNumberPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_time_style_number_picker, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
