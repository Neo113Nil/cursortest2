package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityWechatSportBinding implements ViewBinding {

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    @NonNull
    public final WechatNotBoundBandBinding wechatNotBoundBand;

    @NonNull
    public final WechatSportQrCodeViewBinding wechatSportQrCodeView;

    private ActivityWechatSportBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull WechatNotBoundBandBinding wechatNotBoundBandBinding, @NonNull WechatSportQrCodeViewBinding wechatSportQrCodeViewBinding) {
        this.rootView = coordinatorLayout;
        this.titleBar = bandDataAppbarBinding;
        this.wechatNotBoundBand = wechatNotBoundBandBinding;
        this.wechatSportQrCodeView = wechatSportQrCodeViewBinding;
    }

    @NonNull
    public static ActivityWechatSportBinding bind(@NonNull View view) {
        int i8 = R.id.title_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.wechat_not_bound_band);
            if (findChildViewById2 != null) {
                WechatNotBoundBandBinding bind2 = WechatNotBoundBandBinding.bind(findChildViewById2);
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.wechat_sport_qr_code_view);
                if (findChildViewById3 != null) {
                    return new ActivityWechatSportBinding((CoordinatorLayout) view, bind, bind2, WechatSportQrCodeViewBinding.bind(findChildViewById3));
                }
                i8 = R.id.wechat_sport_qr_code_view;
            } else {
                i8 = R.id.wechat_not_bound_band;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityWechatSportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWechatSportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_wechat_sport, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
