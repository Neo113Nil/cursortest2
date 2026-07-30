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
public final class ItemAllahNameBinding implements ViewBinding {

    @NonNull
    public final ImageView ivCollect;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvIndex;

    @NonNull
    public final TextView tvNameLeft;

    @NonNull
    public final TextView tvNameRight;

    private ItemAllahNameBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.ivCollect = imageView;
        this.tvIndex = textView;
        this.tvNameLeft = textView2;
        this.tvNameRight = textView3;
    }

    @NonNull
    public static ItemAllahNameBinding bind(@NonNull View view) {
        int i8 = R.id.iv_collect;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_collect);
        if (imageView != null) {
            i8 = R.id.tv_index;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_index);
            if (textView != null) {
                i8 = R.id.tv_name_left;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_left);
                if (textView2 != null) {
                    i8 = R.id.tv_name_right;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_right);
                    if (textView3 != null) {
                        return new ItemAllahNameBinding((RelativeLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemAllahNameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemAllahNameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_allah_name, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
