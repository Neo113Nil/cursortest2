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
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityWorldClockBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding appbar;

    @NonNull
    public final ImageView ivEmpty;

    @NonNull
    public final SwipeRecyclerView rcvClockList;

    @NonNull
    public final RelativeLayout rlEmpty;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final ShadowLayout shadowAdd;

    @NonNull
    public final TextView tvAdd;

    @NonNull
    public final TextView tvClockMaxNumber;

    @NonNull
    public final TextView tvConnectHint;

    private ActivityWorldClockBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull ImageView imageView, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull RelativeLayout relativeLayout, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = coordinatorLayout;
        this.appbar = bandDataAppbarBinding;
        this.ivEmpty = imageView;
        this.rcvClockList = swipeRecyclerView;
        this.rlEmpty = relativeLayout;
        this.shadowAdd = shadowLayout;
        this.tvAdd = textView;
        this.tvClockMaxNumber = textView2;
        this.tvConnectHint = textView3;
    }

    @NonNull
    public static ActivityWorldClockBinding bind(@NonNull View view) {
        int i8 = R.id.appbar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.appbar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            i8 = R.id.iv_empty;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_empty);
            if (imageView != null) {
                i8 = R.id.rcv_clock_list;
                SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_clock_list);
                if (swipeRecyclerView != null) {
                    i8 = R.id.rl_empty;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_empty);
                    if (relativeLayout != null) {
                        i8 = R.id.shadow_add;
                        ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_add);
                        if (shadowLayout != null) {
                            i8 = R.id.tv_add;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add);
                            if (textView != null) {
                                i8 = R.id.tv_clock_max_number;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_clock_max_number);
                                if (textView2 != null) {
                                    i8 = R.id.tv_connect_hint;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_connect_hint);
                                    if (textView3 != null) {
                                        return new ActivityWorldClockBinding((CoordinatorLayout) view, bind, imageView, swipeRecyclerView, relativeLayout, shadowLayout, textView, textView2, textView3);
                                    }
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
    public static ActivityWorldClockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWorldClockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_world_clock, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
