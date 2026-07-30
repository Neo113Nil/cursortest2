package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityEcardBinding implements ViewBinding {

    @NonNull
    public final Button btnAddEcard;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final LinearLayout llEmptyEcard;

    @NonNull
    public final SwipeRecyclerView rcvEcardList;

    @NonNull
    private final CoordinatorLayout rootView;

    private ActivityEcardBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull LinearLayout linearLayout, @NonNull SwipeRecyclerView swipeRecyclerView) {
        this.rootView = coordinatorLayout;
        this.btnAddEcard = button;
        this.includeTitle = bandDataAppbarBinding;
        this.llEmptyEcard = linearLayout;
        this.rcvEcardList = swipeRecyclerView;
    }

    @NonNull
    public static ActivityEcardBinding bind(@NonNull View view) {
        int i8 = R.id.btn_add_ecard;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_add_ecard);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.ll_empty_ecard;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty_ecard);
                if (linearLayout != null) {
                    i8 = R.id.rcv_ecard_list;
                    SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_ecard_list);
                    if (swipeRecyclerView != null) {
                        return new ActivityEcardBinding((CoordinatorLayout) view, button, bind, linearLayout, swipeRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityEcardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityEcardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_ecard, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
