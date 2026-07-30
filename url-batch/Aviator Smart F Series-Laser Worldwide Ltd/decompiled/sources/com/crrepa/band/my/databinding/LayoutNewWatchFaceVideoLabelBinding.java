package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceVideoLabelBinding implements ViewBinding {

    @NonNull
    public final ImageView ivWatchFaceTimePositionArrow;

    @NonNull
    public final ImageView ivWatchFaceTimePositionBottomArrow;

    @NonNull
    public final ImageView ivWatchFaceTimePositionTopArrow;

    @NonNull
    public final RadioButton rbWatchFaceTextColorBlack;

    @NonNull
    public final RadioButton rbWatchFaceTextColorBlue;

    @NonNull
    public final RadioButton rbWatchFaceTextColorGreen;

    @NonNull
    public final RadioButton rbWatchFaceTextColorIndigo;

    @NonNull
    public final RadioButton rbWatchFaceTextColorOrigin;

    @NonNull
    public final RadioButton rbWatchFaceTextColorPurple;

    @NonNull
    public final RadioButton rbWatchFaceTextColorRed;

    @NonNull
    public final RadioButton rbWatchFaceTextColorWhite;

    @NonNull
    public final RadioButton rbWatchFaceTextColorYellow;

    @NonNull
    public final RadioGroup rgWatchFaceTextColor;

    @NonNull
    public final RelativeLayout rlWatchFaceTimePosition;

    @NonNull
    public final RelativeLayout rlWatchFaceTimePositionBottomContent;

    @NonNull
    public final RelativeLayout rlWatchFaceTimePositionTopContent;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvWatchFaceTimePosition;

    @NonNull
    public final TextView tvWatchFaceTimePositionBottom;

    @NonNull
    public final TextView tvWatchFaceTimePositionTop;

    private LayoutNewWatchFaceVideoLabelBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull RadioButton radioButton6, @NonNull RadioButton radioButton7, @NonNull RadioButton radioButton8, @NonNull RadioButton radioButton9, @NonNull RadioGroup radioGroup, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivWatchFaceTimePositionArrow = imageView;
        this.ivWatchFaceTimePositionBottomArrow = imageView2;
        this.ivWatchFaceTimePositionTopArrow = imageView3;
        this.rbWatchFaceTextColorBlack = radioButton;
        this.rbWatchFaceTextColorBlue = radioButton2;
        this.rbWatchFaceTextColorGreen = radioButton3;
        this.rbWatchFaceTextColorIndigo = radioButton4;
        this.rbWatchFaceTextColorOrigin = radioButton5;
        this.rbWatchFaceTextColorPurple = radioButton6;
        this.rbWatchFaceTextColorRed = radioButton7;
        this.rbWatchFaceTextColorWhite = radioButton8;
        this.rbWatchFaceTextColorYellow = radioButton9;
        this.rgWatchFaceTextColor = radioGroup;
        this.rlWatchFaceTimePosition = relativeLayout;
        this.rlWatchFaceTimePositionBottomContent = relativeLayout2;
        this.rlWatchFaceTimePositionTopContent = relativeLayout3;
        this.tvWatchFaceTimePosition = textView;
        this.tvWatchFaceTimePositionBottom = textView2;
        this.tvWatchFaceTimePositionTop = textView3;
    }

    @NonNull
    public static LayoutNewWatchFaceVideoLabelBinding bind(@NonNull View view) {
        int i8 = R.id.iv_watch_face_time_position_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_position_arrow);
        if (imageView != null) {
            i8 = R.id.iv_watch_face_time_position_bottom_arrow;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_position_bottom_arrow);
            if (imageView2 != null) {
                i8 = R.id.iv_watch_face_time_position_top_arrow;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_position_top_arrow);
                if (imageView3 != null) {
                    i8 = R.id.rb_watch_face_text_color_black;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_black);
                    if (radioButton != null) {
                        i8 = R.id.rb_watch_face_text_color_blue;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_blue);
                        if (radioButton2 != null) {
                            i8 = R.id.rb_watch_face_text_color_green;
                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_green);
                            if (radioButton3 != null) {
                                i8 = R.id.rb_watch_face_text_color_indigo;
                                RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_indigo);
                                if (radioButton4 != null) {
                                    i8 = R.id.rb_watch_face_text_color_origin;
                                    RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_origin);
                                    if (radioButton5 != null) {
                                        i8 = R.id.rb_watch_face_text_color_purple;
                                        RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_purple);
                                        if (radioButton6 != null) {
                                            i8 = R.id.rb_watch_face_text_color_red;
                                            RadioButton radioButton7 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_red);
                                            if (radioButton7 != null) {
                                                i8 = R.id.rb_watch_face_text_color_white;
                                                RadioButton radioButton8 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_white);
                                                if (radioButton8 != null) {
                                                    i8 = R.id.rb_watch_face_text_color_yellow;
                                                    RadioButton radioButton9 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_watch_face_text_color_yellow);
                                                    if (radioButton9 != null) {
                                                        i8 = R.id.rg_watch_face_text_color;
                                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_watch_face_text_color);
                                                        if (radioGroup != null) {
                                                            i8 = R.id.rl_watch_face_time_position;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_time_position);
                                                            if (relativeLayout != null) {
                                                                i8 = R.id.rl_watch_face_time_position_bottom_content;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_time_position_bottom_content);
                                                                if (relativeLayout2 != null) {
                                                                    i8 = R.id.rl_watch_face_time_position_top_content;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_time_position_top_content);
                                                                    if (relativeLayout3 != null) {
                                                                        i8 = R.id.tv_watch_face_time_position;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_time_position);
                                                                        if (textView != null) {
                                                                            i8 = R.id.tv_watch_face_time_position_bottom;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_time_position_bottom);
                                                                            if (textView2 != null) {
                                                                                i8 = R.id.tv_watch_face_time_position_top;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_time_position_top);
                                                                                if (textView3 != null) {
                                                                                    return new LayoutNewWatchFaceVideoLabelBinding((LinearLayout) view, imageView, imageView2, imageView3, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, radioGroup, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceVideoLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceVideoLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_video_label, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
