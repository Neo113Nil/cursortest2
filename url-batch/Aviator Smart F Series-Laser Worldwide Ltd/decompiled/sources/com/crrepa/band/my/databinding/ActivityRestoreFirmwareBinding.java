package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityRestoreFirmwareBinding implements ViewBinding {

    @NonNull
    public final Button btnFirmwareRestore;

    @NonNull
    public final ImageView ivRestoreAnimation;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DataTitleBarBinding titleBar;

    @NonNull
    public final TextView tvRestoreState;

    private ActivityRestoreFirmwareBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull DataTitleBarBinding dataTitleBarBinding, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.btnFirmwareRestore = button;
        this.ivRestoreAnimation = imageView;
        this.titleBar = dataTitleBarBinding;
        this.tvRestoreState = textView;
    }

    @NonNull
    public static ActivityRestoreFirmwareBinding bind(@NonNull View view) {
        int i8 = R.id.btn_firmware_restore;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_firmware_restore);
        if (button != null) {
            i8 = R.id.iv_restore_animation;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_restore_animation);
            if (imageView != null) {
                i8 = R.id.title_bar;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
                if (findChildViewById != null) {
                    DataTitleBarBinding bind = DataTitleBarBinding.bind(findChildViewById);
                    i8 = R.id.tv_restore_state;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_restore_state);
                    if (textView != null) {
                        return new ActivityRestoreFirmwareBinding((LinearLayout) view, button, imageView, bind, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityRestoreFirmwareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityRestoreFirmwareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_restore_firmware, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
