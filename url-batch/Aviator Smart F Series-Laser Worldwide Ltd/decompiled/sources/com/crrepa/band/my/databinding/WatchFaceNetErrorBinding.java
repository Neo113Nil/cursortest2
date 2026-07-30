package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class WatchFaceNetErrorBinding implements ViewBinding {

    @NonNull
    public final Button btnRefresh;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final View noWifi;

    @NonNull
    public final RelativeLayout rlTips;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvTips;

    private WatchFaceNetErrorBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.btnRefresh = button;
        this.ivIcon = imageView;
        this.noWifi = view;
        this.rlTips = relativeLayout2;
        this.tvTips = textView;
    }

    @NonNull
    public static WatchFaceNetErrorBinding bind(@NonNull View view) {
        int i8 = R.id.btn_refresh;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_refresh);
        if (button != null) {
            i8 = R.id.iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
            if (imageView != null) {
                i8 = R.id.no_wifi;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.no_wifi);
                if (findChildViewById != null) {
                    i8 = R.id.rl_tips;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_tips);
                    if (relativeLayout != null) {
                        i8 = R.id.tv_tips;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tips);
                        if (textView != null) {
                            return new WatchFaceNetErrorBinding((RelativeLayout) view, button, imageView, findChildViewById, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static WatchFaceNetErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WatchFaceNetErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.watch_face_net_error, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
