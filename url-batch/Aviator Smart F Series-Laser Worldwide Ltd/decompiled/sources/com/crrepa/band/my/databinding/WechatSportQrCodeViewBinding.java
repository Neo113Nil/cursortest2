package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class WechatSportQrCodeViewBinding implements ViewBinding {

    @NonNull
    public final Button btnSaveQrCode;

    @NonNull
    public final ImageView ivQrCode;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout wechatSportQrCode;

    private WechatSportQrCodeViewBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.btnSaveQrCode = button;
        this.ivQrCode = imageView;
        this.wechatSportQrCode = linearLayout2;
    }

    @NonNull
    public static WechatSportQrCodeViewBinding bind(@NonNull View view) {
        int i8 = R.id.btn_save_qr_code;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_save_qr_code);
        if (button != null) {
            i8 = R.id.iv_qr_code;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_qr_code);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new WechatSportQrCodeViewBinding(linearLayout, button, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static WechatSportQrCodeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WechatSportQrCodeViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.wechat_sport_qr_code_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
