package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ViewQuickViewBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout llQuickViewPeriod;

    @NonNull
    public final ContinueArrowBinding locationArrow;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnQuickView;

    @NonNull
    public final TextView tvQuickViewHint;

    @NonNull
    public final TextView tvQuickViewPeriod;

    private ViewQuickViewBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull SwitchButton switchButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.llQuickViewPeriod = relativeLayout;
        this.locationArrow = continueArrowBinding;
        this.sbtnQuickView = switchButton;
        this.tvQuickViewHint = textView;
        this.tvQuickViewPeriod = textView2;
    }

    @NonNull
    public static ViewQuickViewBinding bind(@NonNull View view) {
        int i8 = R.id.ll_quick_view_period;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_quick_view_period);
        if (relativeLayout != null) {
            i8 = R.id.location_arrow;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.location_arrow);
            if (findChildViewById != null) {
                ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
                i8 = R.id.sbtn_quick_view;
                SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_quick_view);
                if (switchButton != null) {
                    i8 = R.id.tv_quick_view_hint;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_view_hint);
                    if (textView != null) {
                        i8 = R.id.tv_quick_view_period;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_quick_view_period);
                        if (textView2 != null) {
                            return new ViewQuickViewBinding((LinearLayout) view, relativeLayout, bind, switchButton, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewQuickViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewQuickViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_quick_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
