package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemEcardListBinding implements ViewBinding {

    @NonNull
    public final ImageView ivEcardQrcode;

    @NonNull
    public final ImageView ivSort;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvEcardTitle;

    private ItemEcardListBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.ivEcardQrcode = imageView;
        this.ivSort = imageView2;
        this.tvEcardTitle = textView;
    }

    @NonNull
    public static ItemEcardListBinding bind(@NonNull View view) {
        int i8 = R.id.iv_ecard_qrcode;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ecard_qrcode);
        if (imageView != null) {
            i8 = R.id.iv_sort;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_sort);
            if (imageView2 != null) {
                i8 = R.id.tv_ecard_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecard_title);
                if (textView != null) {
                    return new ItemEcardListBinding((LinearLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemEcardListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemEcardListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_ecard_list, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
