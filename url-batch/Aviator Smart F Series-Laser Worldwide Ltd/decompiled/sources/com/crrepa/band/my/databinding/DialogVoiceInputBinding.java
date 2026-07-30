package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogVoiceInputBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animAsrRecording;

    @NonNull
    public final ImageView ivCancel;

    @NonNull
    public final ImageView ivMicIcon;

    @NonNull
    public final ImageView ivMicIconBg;

    @NonNull
    public final ImageView ivResultCancel;

    @NonNull
    public final ImageView ivResultSend;

    @NonNull
    public final LinearLayout llQuestionTips;

    @NonNull
    public final ProgressBar pbAsrRecognizing;

    @NonNull
    public final RelativeLayout rlInputStatus;

    @NonNull
    public final RelativeLayout rlOperationHandle;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvAsrError;

    @NonNull
    public final TextView tvAsrRecognizing;

    @NonNull
    public final TextView tvAsrResult;

    private DialogVoiceInputBinding(@NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = frameLayout;
        this.animAsrRecording = lottieAnimationView;
        this.ivCancel = imageView;
        this.ivMicIcon = imageView2;
        this.ivMicIconBg = imageView3;
        this.ivResultCancel = imageView4;
        this.ivResultSend = imageView5;
        this.llQuestionTips = linearLayout;
        this.pbAsrRecognizing = progressBar;
        this.rlInputStatus = relativeLayout;
        this.rlOperationHandle = relativeLayout2;
        this.tvAsrError = textView;
        this.tvAsrRecognizing = textView2;
        this.tvAsrResult = textView3;
    }

    @NonNull
    public static DialogVoiceInputBinding bind(@NonNull View view) {
        int i8 = R.id.anim_asr_recording;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.anim_asr_recording);
        if (lottieAnimationView != null) {
            i8 = R.id.iv_cancel;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cancel);
            if (imageView != null) {
                i8 = R.id.iv_mic_icon;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mic_icon);
                if (imageView2 != null) {
                    i8 = R.id.iv_mic_icon_bg;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mic_icon_bg);
                    if (imageView3 != null) {
                        i8 = R.id.iv_result_cancel;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_result_cancel);
                        if (imageView4 != null) {
                            i8 = R.id.iv_result_send;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_result_send);
                            if (imageView5 != null) {
                                i8 = R.id.ll_question_tips;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_question_tips);
                                if (linearLayout != null) {
                                    i8 = R.id.pb_asr_recognizing;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_asr_recognizing);
                                    if (progressBar != null) {
                                        i8 = R.id.rl_input_status;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_input_status);
                                        if (relativeLayout != null) {
                                            i8 = R.id.rl_operation_handle;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_operation_handle);
                                            if (relativeLayout2 != null) {
                                                i8 = R.id.tv_asr_error;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_asr_error);
                                                if (textView != null) {
                                                    i8 = R.id.tv_asr_recognizing;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_asr_recognizing);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_asr_result;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_asr_result);
                                                        if (textView3 != null) {
                                                            return new DialogVoiceInputBinding((FrameLayout) view, lottieAnimationView, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, progressBar, relativeLayout, relativeLayout2, textView, textView2, textView3);
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
    public static DialogVoiceInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogVoiceInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_voice_input, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
