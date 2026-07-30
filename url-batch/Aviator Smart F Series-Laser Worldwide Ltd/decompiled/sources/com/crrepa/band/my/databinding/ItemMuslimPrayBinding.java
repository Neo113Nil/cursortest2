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
public final class ItemMuslimPrayBinding implements ViewBinding {

    @NonNull
    public final ImageView ivReminder;

    @NonNull
    public final RelativeLayout rlItemMuslimPray;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvPrayName;

    @NonNull
    public final TextView tvPrayTime;

    private ItemMuslimPrayBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ivReminder = imageView;
        this.rlItemMuslimPray = relativeLayout2;
        this.tvPrayName = textView;
        this.tvPrayTime = textView2;
    }

    @NonNull
    public static ItemMuslimPrayBinding bind(@NonNull View view) {
        int i8 = R.id.iv_reminder;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_reminder);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i8 = R.id.tv_pray_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pray_name);
            if (textView != null) {
                i8 = R.id.tv_pray_time;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pray_time);
                if (textView2 != null) {
                    return new ItemMuslimPrayBinding(relativeLayout, imageView, relativeLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemMuslimPrayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemMuslimPrayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_muslim_pray, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
