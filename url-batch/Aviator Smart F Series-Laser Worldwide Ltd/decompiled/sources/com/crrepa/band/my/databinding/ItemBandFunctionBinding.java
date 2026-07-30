package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemBandFunctionBinding implements ViewBinding {

    @NonNull
    public final CheckBox cbFunction;

    @NonNull
    public final ImageView ivDrag;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvFunctionName;

    private ItemBandFunctionBinding(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.cbFunction = checkBox;
        this.ivDrag = imageView;
        this.tvFunctionName = textView;
    }

    @NonNull
    public static ItemBandFunctionBinding bind(@NonNull View view) {
        int i8 = R.id.cb_function;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_function);
        if (checkBox != null) {
            i8 = R.id.iv_drag;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_drag);
            if (imageView != null) {
                i8 = R.id.tv_function_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_function_name);
                if (textView != null) {
                    return new ItemBandFunctionBinding((RelativeLayout) view, checkBox, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandFunctionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandFunctionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_function, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
