package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityStockSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivAdd;

    @NonNull
    public final RelativeLayout rlEmpty;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwipeRecyclerView rvStock;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    @NonNull
    public final TextView tvAdd;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvStockLogo;

    private ActivityStockSettingBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = coordinatorLayout;
        this.ivAdd = imageView;
        this.rlEmpty = relativeLayout;
        this.rvStock = swipeRecyclerView;
        this.titleBar = bandDataAppbarBinding;
        this.tvAdd = textView;
        this.tvDescription = textView2;
        this.tvStockLogo = textView3;
    }

    @NonNull
    public static ActivityStockSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_add;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_add);
        if (imageView != null) {
            i8 = R.id.rl_empty;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_empty);
            if (relativeLayout != null) {
                i8 = R.id.rv_stock;
                SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_stock);
                if (swipeRecyclerView != null) {
                    i8 = R.id.title_bar;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
                    if (findChildViewById != null) {
                        BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                        i8 = R.id.tv_add;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add);
                        if (textView != null) {
                            i8 = R.id.tv_description;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                            if (textView2 != null) {
                                i8 = R.id.tv_stock_logo;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stock_logo);
                                if (textView3 != null) {
                                    return new ActivityStockSettingBinding((CoordinatorLayout) view, imageView, relativeLayout, swipeRecyclerView, bind, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStockSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStockSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_stock_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
