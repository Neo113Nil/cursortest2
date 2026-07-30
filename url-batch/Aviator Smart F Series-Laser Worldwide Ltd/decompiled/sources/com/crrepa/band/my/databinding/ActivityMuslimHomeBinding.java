package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityMuslimHomeBinding implements ViewBinding {

    @NonNull
    public final ImageButton btnNext;

    @NonNull
    public final ImageButton btnPrev;

    @NonNull
    public final ImageView ivNextPrayBg;

    @NonNull
    public final RecyclerView rcvMuslimFunction;

    @NonNull
    public final RelativeLayout rlNextPray;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final BandDataAppbarBinding topBar;

    @NonNull
    public final TextView tvCountDown;

    @NonNull
    public final TextView tvDate;

    @NonNull
    public final LayoutLocationOffBinding tvGpsOffHint;

    @NonNull
    public final TextView tvPrayName;

    @NonNull
    public final TextView tvPrayTime;

    @NonNull
    public final ViewPager2 vpPray;

    private ActivityMuslimHomeBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LayoutLocationOffBinding layoutLocationOffBinding, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ViewPager2 viewPager2) {
        this.rootView = coordinatorLayout;
        this.btnNext = imageButton;
        this.btnPrev = imageButton2;
        this.ivNextPrayBg = imageView;
        this.rcvMuslimFunction = recyclerView;
        this.rlNextPray = relativeLayout;
        this.topBar = bandDataAppbarBinding;
        this.tvCountDown = textView;
        this.tvDate = textView2;
        this.tvGpsOffHint = layoutLocationOffBinding;
        this.tvPrayName = textView3;
        this.tvPrayTime = textView4;
        this.vpPray = viewPager2;
    }

    @NonNull
    public static ActivityMuslimHomeBinding bind(@NonNull View view) {
        int i8 = R.id.btn_next;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.btn_next);
        if (imageButton != null) {
            i8 = R.id.btn_prev;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.btn_prev);
            if (imageButton2 != null) {
                i8 = R.id.iv_next_pray_bg;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_next_pray_bg);
                if (imageView != null) {
                    i8 = R.id.rcv_muslim_function;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_muslim_function);
                    if (recyclerView != null) {
                        i8 = R.id.rl_next_pray;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_next_pray);
                        if (relativeLayout != null) {
                            i8 = R.id.top_bar;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_bar);
                            if (findChildViewById != null) {
                                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                                i8 = R.id.tv_count_down;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count_down);
                                if (textView != null) {
                                    i8 = R.id.tv_date;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
                                    if (textView2 != null) {
                                        i8 = R.id.tv_gps_off_hint;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.tv_gps_off_hint);
                                        if (findChildViewById2 != null) {
                                            LayoutLocationOffBinding bind2 = LayoutLocationOffBinding.bind(findChildViewById2);
                                            i8 = R.id.tv_pray_name;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pray_name);
                                            if (textView3 != null) {
                                                i8 = R.id.tv_pray_time;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pray_time);
                                                if (textView4 != null) {
                                                    i8 = R.id.vp_pray;
                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vp_pray);
                                                    if (viewPager2 != null) {
                                                        return new ActivityMuslimHomeBinding((CoordinatorLayout) view, imageButton, imageButton2, imageView, recyclerView, relativeLayout, bind, textView, textView2, bind2, textView3, textView4, viewPager2);
                                                    }
                                                }
                                            }
                                        }
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
    public static ActivityMuslimHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMuslimHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_muslim_home, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
