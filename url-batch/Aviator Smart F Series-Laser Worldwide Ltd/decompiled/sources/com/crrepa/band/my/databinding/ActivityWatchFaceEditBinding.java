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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityWatchFaceEditBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivWatchFacePreview;

    @NonNull
    public final ImageView ivWatchFaceTime;

    @NonNull
    public final ImageView ivWatchFaceTimeBottom;

    @NonNull
    public final ImageView ivWatchFaceTimePositionArrow;

    @NonNull
    public final ImageView ivWatchFaceTimePositionBottomArrow;

    @NonNull
    public final ImageView ivWatchFaceTimePositionTopArrow;

    @NonNull
    public final ImageView ivWatchFaceTimeTop;

    @NonNull
    public final LinearLayout llWatchFaceContent;

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
    public final RecyclerView rcvPresetList;

    @NonNull
    public final RadioGroup rgWatchFaceTextColor;

    @NonNull
    public final RelativeLayout rlWatchFacePreview;

    @NonNull
    public final RelativeLayout rlWatchFaceTimePosition;

    @NonNull
    public final RelativeLayout rlWatchFaceTimePositionBottomContent;

    @NonNull
    public final RelativeLayout rlWatchFaceTimePositionTopContent;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvEditWatchFaceCancel;

    @NonNull
    public final TextView tvEditWatchFaceSave;

    @NonNull
    public final TextView tvWatchFaceTimePosition;

    @NonNull
    public final TextView tvWatchFaceTimePositionBottom;

    @NonNull
    public final TextView tvWatchFaceTimePositionTop;

    private ActivityWatchFaceEditBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull LinearLayout linearLayout2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull RadioButton radioButton6, @NonNull RadioButton radioButton7, @NonNull RadioButton radioButton8, @NonNull RadioButton radioButton9, @NonNull RecyclerView recyclerView, @NonNull RadioGroup radioGroup, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.ivWatchFacePreview = roundedImageView;
        this.ivWatchFaceTime = imageView;
        this.ivWatchFaceTimeBottom = imageView2;
        this.ivWatchFaceTimePositionArrow = imageView3;
        this.ivWatchFaceTimePositionBottomArrow = imageView4;
        this.ivWatchFaceTimePositionTopArrow = imageView5;
        this.ivWatchFaceTimeTop = imageView6;
        this.llWatchFaceContent = linearLayout2;
        this.rbWatchFaceTextColorBlack = radioButton;
        this.rbWatchFaceTextColorBlue = radioButton2;
        this.rbWatchFaceTextColorGreen = radioButton3;
        this.rbWatchFaceTextColorIndigo = radioButton4;
        this.rbWatchFaceTextColorOrigin = radioButton5;
        this.rbWatchFaceTextColorPurple = radioButton6;
        this.rbWatchFaceTextColorRed = radioButton7;
        this.rbWatchFaceTextColorWhite = radioButton8;
        this.rbWatchFaceTextColorYellow = radioButton9;
        this.rcvPresetList = recyclerView;
        this.rgWatchFaceTextColor = radioGroup;
        this.rlWatchFacePreview = relativeLayout;
        this.rlWatchFaceTimePosition = relativeLayout2;
        this.rlWatchFaceTimePositionBottomContent = relativeLayout3;
        this.rlWatchFaceTimePositionTopContent = relativeLayout4;
        this.tvEditWatchFaceCancel = textView;
        this.tvEditWatchFaceSave = textView2;
        this.tvWatchFaceTimePosition = textView3;
        this.tvWatchFaceTimePositionBottom = textView4;
        this.tvWatchFaceTimePositionTop = textView5;
    }

    @NonNull
    public static ActivityWatchFaceEditBinding bind(@NonNull View view) {
        int i8 = R.id.iv_watch_face_preview;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_preview);
        if (roundedImageView != null) {
            i8 = R.id.iv_watch_face_time;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time);
            if (imageView != null) {
                i8 = R.id.iv_watch_face_time_bottom;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_bottom);
                if (imageView2 != null) {
                    i8 = R.id.iv_watch_face_time_position_arrow;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_position_arrow);
                    if (imageView3 != null) {
                        i8 = R.id.iv_watch_face_time_position_bottom_arrow;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_position_bottom_arrow);
                        if (imageView4 != null) {
                            i8 = R.id.iv_watch_face_time_position_top_arrow;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_position_top_arrow);
                            if (imageView5 != null) {
                                i8 = R.id.iv_watch_face_time_top;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_top);
                                if (imageView6 != null) {
                                    i8 = R.id.ll_watch_face_content;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_watch_face_content);
                                    if (linearLayout != null) {
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
                                                                            i8 = R.id.rcv_preset_list;
                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_preset_list);
                                                                            if (recyclerView != null) {
                                                                                i8 = R.id.rg_watch_face_text_color;
                                                                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_watch_face_text_color);
                                                                                if (radioGroup != null) {
                                                                                    i8 = R.id.rl_watch_face_preview;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_preview);
                                                                                    if (relativeLayout != null) {
                                                                                        i8 = R.id.rl_watch_face_time_position;
                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_time_position);
                                                                                        if (relativeLayout2 != null) {
                                                                                            i8 = R.id.rl_watch_face_time_position_bottom_content;
                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_time_position_bottom_content);
                                                                                            if (relativeLayout3 != null) {
                                                                                                i8 = R.id.rl_watch_face_time_position_top_content;
                                                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face_time_position_top_content);
                                                                                                if (relativeLayout4 != null) {
                                                                                                    i8 = R.id.tv_edit_watch_face_cancel;
                                                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_watch_face_cancel);
                                                                                                    if (textView != null) {
                                                                                                        i8 = R.id.tv_edit_watch_face_save;
                                                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit_watch_face_save);
                                                                                                        if (textView2 != null) {
                                                                                                            i8 = R.id.tv_watch_face_time_position;
                                                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_time_position);
                                                                                                            if (textView3 != null) {
                                                                                                                i8 = R.id.tv_watch_face_time_position_bottom;
                                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_time_position_bottom);
                                                                                                                if (textView4 != null) {
                                                                                                                    i8 = R.id.tv_watch_face_time_position_top;
                                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_time_position_top);
                                                                                                                    if (textView5 != null) {
                                                                                                                        return new ActivityWatchFaceEditBinding((LinearLayout) view, roundedImageView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, recyclerView, radioGroup, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5);
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
    public static ActivityWatchFaceEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWatchFaceEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_watch_face_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
