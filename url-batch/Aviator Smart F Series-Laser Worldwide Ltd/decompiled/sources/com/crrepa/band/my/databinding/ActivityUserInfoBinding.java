package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityUserInfoBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding appbar;

    @NonNull
    public final RecyclerView rcvUserInfo;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvDone;

    private ActivityUserInfoBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = coordinatorLayout;
        this.appbar = bandDataAppbarBinding;
        this.rcvUserInfo = recyclerView;
        this.tvDone = textView;
    }

    @NonNull
    public static ActivityUserInfoBinding bind(@NonNull View view) {
        int i8 = R.id.appbar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.appbar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_user_info);
            if (recyclerView != null) {
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_done);
                if (textView != null) {
                    return new ActivityUserInfoBinding((CoordinatorLayout) view, bind, recyclerView, textView);
                }
                i8 = R.id.tv_done;
            } else {
                i8 = R.id.rcv_user_info;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityUserInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityUserInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_user_info, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
