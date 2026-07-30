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
public final class ItemHistoryMovementHeartRateBinding implements ViewBinding {

    @NonNull
    public final ImageView ivMovementType;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvMovementTime;

    private ItemHistoryMovementHeartRateBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivMovementType = imageView;
        this.tvMovementTime = textView;
    }

    @NonNull
    public static ItemHistoryMovementHeartRateBinding bind(@NonNull View view) {
        int i8 = R.id.iv_movement_type;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_movement_type);
        if (imageView != null) {
            i8 = R.id.tv_movement_time;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_movement_time);
            if (textView != null) {
                return new ItemHistoryMovementHeartRateBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemHistoryMovementHeartRateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemHistoryMovementHeartRateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_history_movement_heart_rate, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
