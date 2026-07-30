package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivitySyncCalendarBinding implements ViewBinding {

    @NonNull
    public final Button btnSyncCalendarEvent;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final ImageView ivCalendarSyncState;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvContent;

    private ActivitySyncCalendarBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = coordinatorLayout;
        this.btnSyncCalendarEvent = button;
        this.includeTitle = bandDataAppbarBinding;
        this.ivCalendarSyncState = imageView;
        this.tvContent = textView;
    }

    @NonNull
    public static ActivitySyncCalendarBinding bind(@NonNull View view) {
        int i8 = R.id.btn_sync_calendar_event;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_sync_calendar_event);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.iv_calendar_sync_state;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_calendar_sync_state);
                if (imageView != null) {
                    i8 = R.id.tv_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                    if (textView != null) {
                        return new ActivitySyncCalendarBinding((CoordinatorLayout) view, button, bind, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivitySyncCalendarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivitySyncCalendarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_sync_calendar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
