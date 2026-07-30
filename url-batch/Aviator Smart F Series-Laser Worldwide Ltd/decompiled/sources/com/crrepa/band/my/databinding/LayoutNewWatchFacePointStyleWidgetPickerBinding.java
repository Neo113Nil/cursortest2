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
public final class LayoutNewWatchFacePointStyleWidgetPickerBinding implements ViewBinding {

    @NonNull
    public final ImageView ivLabelArrow;

    @NonNull
    public final RelativeLayout rlLabel;

    @NonNull
    public final RelativeLayout rlLabelWp;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvLabel;

    @NonNull
    public final TextView tvLabelTips;

    @NonNull
    public final TextView tvLabelTitle;

    @NonNull
    public final WheelPicker wp;

    private LayoutNewWatchFacePointStyleWidgetPickerBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WheelPicker wheelPicker) {
        this.rootView = linearLayout;
        this.ivLabelArrow = imageView;
        this.rlLabel = relativeLayout;
        this.rlLabelWp = relativeLayout2;
        this.root = linearLayout2;
        this.tvLabel = textView;
        this.tvLabelTips = textView2;
        this.tvLabelTitle = textView3;
        this.wp = wheelPicker;
    }

    @NonNull
    public static LayoutNewWatchFacePointStyleWidgetPickerBinding bind(@NonNull View view) {
        int i8 = R.id.iv_label_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_label_arrow);
        if (imageView != null) {
            i8 = R.id.rl_label;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_label);
            if (relativeLayout != null) {
                i8 = R.id.rl_label_wp;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_label_wp);
                if (relativeLayout2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i8 = R.id.tv_label;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label);
                    if (textView != null) {
                        i8 = R.id.tv_label_tips;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_tips);
                        if (textView2 != null) {
                            i8 = R.id.tv_label_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_title);
                            if (textView3 != null) {
                                i8 = R.id.wp;
                                WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp);
                                if (wheelPicker != null) {
                                    return new LayoutNewWatchFacePointStyleWidgetPickerBinding(linearLayout, imageView, relativeLayout, relativeLayout2, linearLayout, textView, textView2, textView3, wheelPicker);
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
    public static LayoutNewWatchFacePointStyleWidgetPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFacePointStyleWidgetPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_point_style_widget_picker, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
