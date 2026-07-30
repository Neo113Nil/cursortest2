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
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemDuasChapterBinding implements ViewBinding {

    @NonNull
    public final ImageView ivDuas;

    @NonNull
    public final ImageView ivExpand;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvChapterName;

    private ItemDuasChapterBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivDuas = imageView;
        this.ivExpand = imageView2;
        this.tvChapterName = textView;
    }

    @NonNull
    public static ItemDuasChapterBinding bind(@NonNull View view) {
        int i8 = R.id.iv_duas;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_duas);
        if (imageView != null) {
            i8 = R.id.iv_expand;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_expand);
            if (imageView2 != null) {
                i8 = R.id.tv_chapter_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_chapter_name);
                if (textView != null) {
                    return new ItemDuasChapterBinding((RelativeLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemDuasChapterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemDuasChapterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_duas_chapter, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
