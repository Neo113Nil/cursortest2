package com.moyoung.classes.databinding;

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
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ItemMeditationLocalClassActionBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCover;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvTitle;

    private ItemMeditationLocalClassActionBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivCover = imageView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ItemMeditationLocalClassActionBinding bind(@NonNull View view) {
        int i8 = R$id.iv_cover;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.tv_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView != null) {
                i8 = R$id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView2 != null) {
                    return new ItemMeditationLocalClassActionBinding((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMeditationLocalClassActionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMeditationLocalClassActionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_meditation_local_class_action, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
