package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityDressWatchFaceBinding implements ViewBinding {

    @NonNull
    public final LinearLayout bottomBtn;

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final Button btnTakePhoto;

    @NonNull
    public final CardView cardKaFace;

    @NonNull
    public final CardView cardWatchFace;

    @NonNull
    public final FrameLayout frAnima;

    @NonNull
    public final LottieAnimationView ivAnima;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RoundedImageView rivKaFace;

    @NonNull
    public final ImageView rivWatchFace;

    @NonNull
    public final RelativeLayout rlAnima;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvRecommendWatchFace;

    @NonNull
    public final SeekBar seekAngle;

    @NonNull
    public final SeekBar seekQuantity;

    @NonNull
    public final RelativeLayout toolbar;

    @NonNull
    public final TextView tvAngle;

    @NonNull
    public final TextView tvQuantity;

    @NonNull
    public final TextView tvTitle;

    private ActivityDressWatchFaceBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull FrameLayout frameLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull RecyclerView recyclerView, @NonNull SeekBar seekBar, @NonNull SeekBar seekBar2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.bottomBtn = linearLayout;
        this.btnConfirm = button;
        this.btnTakePhoto = button2;
        this.cardKaFace = cardView;
        this.cardWatchFace = cardView2;
        this.frAnima = frameLayout;
        this.ivAnima = lottieAnimationView;
        this.ivTitleBack = imageView;
        this.rivKaFace = roundedImageView;
        this.rivWatchFace = imageView2;
        this.rlAnima = relativeLayout2;
        this.rvRecommendWatchFace = recyclerView;
        this.seekAngle = seekBar;
        this.seekQuantity = seekBar2;
        this.toolbar = relativeLayout3;
        this.tvAngle = textView;
        this.tvQuantity = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static ActivityDressWatchFaceBinding bind(@NonNull View view) {
        int i8 = R.id.bottom_btn;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.bottom_btn);
        if (linearLayout != null) {
            i8 = R.id.btn_confirm;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_confirm);
            if (button != null) {
                i8 = R.id.btn_take_photo;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_take_photo);
                if (button2 != null) {
                    i8 = R.id.card_ka_face;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_ka_face);
                    if (cardView != null) {
                        i8 = R.id.card_watch_face;
                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_watch_face);
                        if (cardView2 != null) {
                            i8 = R.id.fr_anima;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fr_anima);
                            if (frameLayout != null) {
                                i8 = R.id.iv_anima;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.iv_anima);
                                if (lottieAnimationView != null) {
                                    i8 = R.id.iv_title_back;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                                    if (imageView != null) {
                                        i8 = R.id.riv_ka_face;
                                        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.riv_ka_face);
                                        if (roundedImageView != null) {
                                            i8 = R.id.riv_watch_face;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.riv_watch_face);
                                            if (imageView2 != null) {
                                                i8 = R.id.rl_anima;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_anima);
                                                if (relativeLayout != null) {
                                                    i8 = R.id.rv_recommend_watch_face;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_recommend_watch_face);
                                                    if (recyclerView != null) {
                                                        i8 = R.id.seek_angle;
                                                        SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.seek_angle);
                                                        if (seekBar != null) {
                                                            i8 = R.id.seek_quantity;
                                                            SeekBar seekBar2 = (SeekBar) ViewBindings.findChildViewById(view, R.id.seek_quantity);
                                                            if (seekBar2 != null) {
                                                                i8 = R.id.toolbar;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                if (relativeLayout2 != null) {
                                                                    i8 = R.id.tv_angle;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_angle);
                                                                    if (textView != null) {
                                                                        i8 = R.id.tv_quantity;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quantity);
                                                                        if (textView2 != null) {
                                                                            i8 = R.id.tv_title;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                            if (textView3 != null) {
                                                                                return new ActivityDressWatchFaceBinding((RelativeLayout) view, linearLayout, button, button2, cardView, cardView2, frameLayout, lottieAnimationView, imageView, roundedImageView, imageView2, relativeLayout, recyclerView, seekBar, seekBar2, relativeLayout2, textView, textView2, textView3);
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
    public static ActivityDressWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityDressWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_dress_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
