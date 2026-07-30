package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class DialogWhiteNoiseBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBg;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rv;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final View viewClose;

    @NonNull
    public final View viewMargin;

    private DialogWhiteNoiseBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull View view, @NonNull View view2) {
        this.rootView = relativeLayout;
        this.ivBg = imageView;
        this.rv = recyclerView;
        this.tvTitle = textView;
        this.viewClose = view;
        this.viewMargin = view2;
    }

    @NonNull
    public static DialogWhiteNoiseBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i8 = R$id.iv_bg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.rv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
            if (recyclerView != null) {
                i8 = R$id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_close))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i8 = R$id.view_margin))) != null) {
                    return new DialogWhiteNoiseBinding((RelativeLayout) view, imageView, recyclerView, textView, findChildViewById, findChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogWhiteNoiseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogWhiteNoiseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.dialog_white_noise, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
