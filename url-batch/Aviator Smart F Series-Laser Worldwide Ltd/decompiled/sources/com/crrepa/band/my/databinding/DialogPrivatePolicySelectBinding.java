package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogPrivatePolicySelectBinding implements ViewBinding {

    @NonNull
    public final ImageView ivSelectCn;

    @NonNull
    public final ImageView ivSelectOther;

    @NonNull
    public final ImageView ivSelectUk;

    @NonNull
    public final ImageView ivSelectUs;

    @NonNull
    public final LinearLayout ll;

    @NonNull
    public final RelativeLayout llCn;

    @NonNull
    public final RelativeLayout llOther;

    @NonNull
    public final RelativeLayout llUk;

    @NonNull
    public final RelativeLayout llUs;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvContentCn;

    @NonNull
    public final TextView tvContentOther;

    @NonNull
    public final TextView tvContentUk;

    @NonNull
    public final TextView tvContentUs;

    @NonNull
    public final TextView tvNext;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTitleCn;

    @NonNull
    public final TextView tvTitleOther;

    @NonNull
    public final TextView tvTitleUk;

    @NonNull
    public final TextView tvTitleUs;

    private DialogPrivatePolicySelectBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.rootView = frameLayout;
        this.ivSelectCn = imageView;
        this.ivSelectOther = imageView2;
        this.ivSelectUk = imageView3;
        this.ivSelectUs = imageView4;
        this.ll = linearLayout;
        this.llCn = relativeLayout;
        this.llOther = relativeLayout2;
        this.llUk = relativeLayout3;
        this.llUs = relativeLayout4;
        this.tvContentCn = textView;
        this.tvContentOther = textView2;
        this.tvContentUk = textView3;
        this.tvContentUs = textView4;
        this.tvNext = textView5;
        this.tvTitle = textView6;
        this.tvTitleCn = textView7;
        this.tvTitleOther = textView8;
        this.tvTitleUk = textView9;
        this.tvTitleUs = textView10;
    }

    @NonNull
    public static DialogPrivatePolicySelectBinding bind(@NonNull View view) {
        int i8 = R.id.iv_select_cn;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_select_cn);
        if (imageView != null) {
            i8 = R.id.iv_select_other;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_select_other);
            if (imageView2 != null) {
                i8 = R.id.iv_select_uk;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_select_uk);
                if (imageView3 != null) {
                    i8 = R.id.iv_select_us;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_select_us);
                    if (imageView4 != null) {
                        i8 = R.id.ll;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll);
                        if (linearLayout != null) {
                            i8 = R.id.ll_cn;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_cn);
                            if (relativeLayout != null) {
                                i8 = R.id.ll_other;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_other);
                                if (relativeLayout2 != null) {
                                    i8 = R.id.ll_uk;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_uk);
                                    if (relativeLayout3 != null) {
                                        i8 = R.id.ll_us;
                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_us);
                                        if (relativeLayout4 != null) {
                                            i8 = R.id.tv_content_cn;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_cn);
                                            if (textView != null) {
                                                i8 = R.id.tv_content_other;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_other);
                                                if (textView2 != null) {
                                                    i8 = R.id.tv_content_uk;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_uk);
                                                    if (textView3 != null) {
                                                        i8 = R.id.tv_content_us;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_us);
                                                        if (textView4 != null) {
                                                            i8 = R.id.tv_next;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_next);
                                                            if (textView5 != null) {
                                                                i8 = R.id.tv_title;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                if (textView6 != null) {
                                                                    i8 = R.id.tv_title_cn;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_cn);
                                                                    if (textView7 != null) {
                                                                        i8 = R.id.tv_title_other;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_other);
                                                                        if (textView8 != null) {
                                                                            i8 = R.id.tv_title_uk;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_uk);
                                                                            if (textView9 != null) {
                                                                                i8 = R.id.tv_title_us;
                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_us);
                                                                                if (textView10 != null) {
                                                                                    return new DialogPrivatePolicySelectBinding((FrameLayout) view, imageView, imageView2, imageView3, imageView4, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static DialogPrivatePolicySelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogPrivatePolicySelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_private_policy_select, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
