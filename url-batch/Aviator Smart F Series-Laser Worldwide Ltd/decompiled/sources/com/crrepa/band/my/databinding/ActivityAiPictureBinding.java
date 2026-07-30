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
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityAiPictureBinding implements ViewBinding {

    @NonNull
    public final LayoutAsrInputBinding includeAsrInput;

    @NonNull
    public final RoundedImageView ivAiPicture;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final LinearLayout llAiPictureMsg;

    @NonNull
    public final RelativeLayout rlContent;

    @NonNull
    public final RelativeLayout rlQuestionTips;

    @NonNull
    public final RelativeLayout rlRootView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvPicture;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final RelativeLayout titleBar;

    @NonNull
    public final TextView tvDrawingStyle;

    @NonNull
    public final TextView tvDrawingStyleTitle;

    @NonNull
    public final TextView tvHistory;

    @NonNull
    public final TextView tvPictureDescription;

    @NonNull
    public final TextView tvTitle;

    private ActivityAiPictureBinding(@NonNull RelativeLayout relativeLayout, @NonNull LayoutAsrInputBinding layoutAsrInputBinding, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RecyclerView recyclerView, @NonNull NestedScrollView nestedScrollView, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.includeAsrInput = layoutAsrInputBinding;
        this.ivAiPicture = roundedImageView;
        this.ivTitleBack = imageView;
        this.llAiPictureMsg = linearLayout;
        this.rlContent = relativeLayout2;
        this.rlQuestionTips = relativeLayout3;
        this.rlRootView = relativeLayout4;
        this.rvPicture = recyclerView;
        this.scrollView = nestedScrollView;
        this.titleBar = relativeLayout5;
        this.tvDrawingStyle = textView;
        this.tvDrawingStyleTitle = textView2;
        this.tvHistory = textView3;
        this.tvPictureDescription = textView4;
        this.tvTitle = textView5;
    }

    @NonNull
    public static ActivityAiPictureBinding bind(@NonNull View view) {
        int i8 = R.id.include_asr_input;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_asr_input);
        if (findChildViewById != null) {
            LayoutAsrInputBinding bind = LayoutAsrInputBinding.bind(findChildViewById);
            i8 = R.id.iv_ai_picture;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_ai_picture);
            if (roundedImageView != null) {
                i8 = R.id.iv_title_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                if (imageView != null) {
                    i8 = R.id.ll_ai_picture_msg;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_ai_picture_msg);
                    if (linearLayout != null) {
                        i8 = R.id.rl_content;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_content);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_question_tips;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_question_tips);
                            if (relativeLayout2 != null) {
                                RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                i8 = R.id.rv_picture;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_picture);
                                if (recyclerView != null) {
                                    i8 = R.id.scrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                    if (nestedScrollView != null) {
                                        i8 = R.id.title_bar;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title_bar);
                                        if (relativeLayout4 != null) {
                                            i8 = R.id.tv_drawing_style;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drawing_style);
                                            if (textView != null) {
                                                i8 = R.id.tv_drawing_style_title;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drawing_style_title);
                                                if (textView2 != null) {
                                                    i8 = R.id.tv_history;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_history);
                                                    if (textView3 != null) {
                                                        i8 = R.id.tv_picture_description;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_picture_description);
                                                        if (textView4 != null) {
                                                            i8 = R.id.tv_title;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                            if (textView5 != null) {
                                                                return new ActivityAiPictureBinding(relativeLayout3, bind, roundedImageView, imageView, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, nestedScrollView, relativeLayout4, textView, textView2, textView3, textView4, textView5);
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
    public static ActivityAiPictureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAiPictureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_ai_picture, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
