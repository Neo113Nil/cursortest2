package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemAiChatRecordsBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animAnswerLoading;

    @NonNull
    public final LottieAnimationView animTtsLoading;

    @NonNull
    public final LottieAnimationView animTtsPlaying;

    @NonNull
    public final ImageView ivTxtCopy;

    @NonNull
    public final RelativeLayout rlGpt;

    @NonNull
    public final RelativeLayout rlOperation;

    @NonNull
    public final RelativeLayout rlTts;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvGpt;

    @NonNull
    public final TextView tvMe;

    @NonNull
    public final TextView tvTtsPlay;

    private ItemAiChatRecordsBinding(@NonNull RelativeLayout relativeLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull LottieAnimationView lottieAnimationView3, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.animAnswerLoading = lottieAnimationView;
        this.animTtsLoading = lottieAnimationView2;
        this.animTtsPlaying = lottieAnimationView3;
        this.ivTxtCopy = imageView;
        this.rlGpt = relativeLayout2;
        this.rlOperation = relativeLayout3;
        this.rlTts = relativeLayout4;
        this.tvGpt = textView;
        this.tvMe = textView2;
        this.tvTtsPlay = textView3;
    }

    @NonNull
    public static ItemAiChatRecordsBinding bind(@NonNull View view) {
        int i8 = R.id.anim_answer_loading;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.anim_answer_loading);
        if (lottieAnimationView != null) {
            i8 = R.id.anim_tts_loading;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.anim_tts_loading);
            if (lottieAnimationView2 != null) {
                i8 = R.id.anim_tts_playing;
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.anim_tts_playing);
                if (lottieAnimationView3 != null) {
                    i8 = R.id.iv_txt_copy;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_txt_copy);
                    if (imageView != null) {
                        i8 = R.id.rl_gpt;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_gpt);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_operation;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_operation);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_tts;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_tts);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.tv_gpt;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gpt);
                                    if (textView != null) {
                                        i8 = R.id.tv_me;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_me);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_tts_play;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tts_play);
                                            if (textView3 != null) {
                                                return new ItemAiChatRecordsBinding((RelativeLayout) view, lottieAnimationView, lottieAnimationView2, lottieAnimationView3, imageView, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3);
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
    public static ItemAiChatRecordsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemAiChatRecordsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_ai_chat_records, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
