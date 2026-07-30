package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemNewWatchFaceClockPointerBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivPointer;

    @NonNull
    public final RelativeLayout root;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvNone;

    private ItemNewWatchFaceClockPointerBinding(@NonNull RelativeLayout relativeLayout, @NonNull RoundedImageView roundedImageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivPointer = roundedImageView;
        this.root = relativeLayout2;
        this.tvNone = textView;
    }

    @NonNull
    public static ItemNewWatchFaceClockPointerBinding bind(@NonNull View view) {
        int i8 = R.id.iv_pointer;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_pointer);
        if (roundedImageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_none);
            if (textView != null) {
                return new ItemNewWatchFaceClockPointerBinding(relativeLayout, roundedImageView, relativeLayout, textView);
            }
            i8 = R.id.tv_none;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemNewWatchFaceClockPointerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNewWatchFaceClockPointerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_new_watch_face_clock_pointer, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
