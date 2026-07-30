package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.NoTouchRecyclerView;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes4.dex */
public final class ActivityMeditationLocalClassDetailBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivThumb;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final NoTouchRecyclerView rvAction;

    @NonNull
    public final NoTouchRecyclerView rvPostscript;

    @NonNull
    public final ScrollView scrollView;

    @NonNull
    public final ShadowLayout slSkip;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvPostscriptTitle;

    @NonNull
    public final TextView tvStart;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final View viewBottom;

    private ActivityMeditationLocalClassDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull NoTouchRecyclerView noTouchRecyclerView, @NonNull NoTouchRecyclerView noTouchRecyclerView2, @NonNull ScrollView scrollView, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view) {
        this.rootView = relativeLayout;
        this.ivClose = imageView;
        this.ivThumb = imageView2;
        this.rvAction = noTouchRecyclerView;
        this.rvPostscript = noTouchRecyclerView2;
        this.scrollView = scrollView;
        this.slSkip = shadowLayout;
        this.tvDescription = textView;
        this.tvPostscriptTitle = textView2;
        this.tvStart = textView3;
        this.tvTitle = textView4;
        this.viewBottom = view;
    }

    @NonNull
    public static ActivityMeditationLocalClassDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i8 = R$id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.iv_thumb;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                i8 = R$id.rv_action;
                NoTouchRecyclerView noTouchRecyclerView = (NoTouchRecyclerView) ViewBindings.findChildViewById(view, i8);
                if (noTouchRecyclerView != null) {
                    i8 = R$id.rv_postscript;
                    NoTouchRecyclerView noTouchRecyclerView2 = (NoTouchRecyclerView) ViewBindings.findChildViewById(view, i8);
                    if (noTouchRecyclerView2 != null) {
                        i8 = R$id.scrollView;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i8);
                        if (scrollView != null) {
                            i8 = R$id.sl_skip;
                            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, i8);
                            if (shadowLayout != null) {
                                i8 = R$id.tv_description;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView != null) {
                                    i8 = R$id.tv_postscript_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView2 != null) {
                                        i8 = R$id.tv_start;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView3 != null) {
                                            i8 = R$id.tv_title;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_bottom))) != null) {
                                                return new ActivityMeditationLocalClassDetailBinding((RelativeLayout) view, imageView, imageView2, noTouchRecyclerView, noTouchRecyclerView2, scrollView, shadowLayout, textView, textView2, textView3, textView4, findChildViewById);
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
    public static ActivityMeditationLocalClassDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMeditationLocalClassDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_meditation_local_class_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
