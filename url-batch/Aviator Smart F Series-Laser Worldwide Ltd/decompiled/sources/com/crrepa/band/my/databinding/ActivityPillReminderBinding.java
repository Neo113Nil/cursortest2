package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityPillReminderBinding implements ViewBinding {

    @NonNull
    public final Button btnAddPills;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final LinearLayout llEmptyPills;

    @NonNull
    public final RecyclerView rcvPillsList;

    @NonNull
    private final CoordinatorLayout rootView;

    private ActivityPillReminderBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = coordinatorLayout;
        this.btnAddPills = button;
        this.includeTitle = bandDataAppbarBinding;
        this.llEmptyPills = linearLayout;
        this.rcvPillsList = recyclerView;
    }

    @NonNull
    public static ActivityPillReminderBinding bind(@NonNull View view) {
        int i8 = R.id.btn_add_pills;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_add_pills);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.ll_empty_pills;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty_pills);
                if (linearLayout != null) {
                    i8 = R.id.rcv_pills_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_pills_list);
                    if (recyclerView != null) {
                        return new ActivityPillReminderBinding((CoordinatorLayout) view, button, bind, linearLayout, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityPillReminderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPillReminderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_pill_reminder, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
