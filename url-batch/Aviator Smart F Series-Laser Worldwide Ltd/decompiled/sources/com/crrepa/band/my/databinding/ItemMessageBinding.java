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
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ItemMessageBinding implements ViewBinding {

    @NonNull
    public final ImageView ivMessageIcon;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SwitchButton sbtnMessage;

    @NonNull
    public final TextView tvMessageName;

    private ItemMessageBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull SwitchButton switchButton, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivMessageIcon = imageView;
        this.sbtnMessage = switchButton;
        this.tvMessageName = textView;
    }

    @NonNull
    public static ItemMessageBinding bind(@NonNull View view) {
        int i8 = R.id.iv_message_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_message_icon);
        if (imageView != null) {
            i8 = R.id.sbtn_message;
            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_message);
            if (switchButton != null) {
                i8 = R.id.tv_message_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_message_name);
                if (textView != null) {
                    return new ItemMessageBinding((RelativeLayout) view, imageView, switchButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_message, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
