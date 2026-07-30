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
public final class ActivityBandNotificationBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final RecyclerView rcvMessageList;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvAccessibilityHint;

    @NonNull
    public final TextView tvInstructionHint;

    private ActivityBandNotificationBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = coordinatorLayout;
        this.includeTitle = bandDataAppbarBinding;
        this.rcvMessageList = recyclerView;
        this.tvAccessibilityHint = textView;
        this.tvInstructionHint = textView2;
    }

    @NonNull
    public static ActivityBandNotificationBinding bind(@NonNull View view) {
        int i8 = R.id.include_title;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            i8 = R.id.rcv_message_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_message_list);
            if (recyclerView != null) {
                i8 = R.id.tv_accessibility_hint;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_accessibility_hint);
                if (textView != null) {
                    i8 = R.id.tv_instruction_hint;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_instruction_hint);
                    if (textView2 != null) {
                        return new ActivityBandNotificationBinding((CoordinatorLayout) view, bind, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_notification, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
