package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityStressHistoryBinding implements ViewBinding {

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FrameLayout stressHistoryContent;

    private ActivityStressHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull AppToolbarBinding appToolbarBinding, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.includeTitleBar = appToolbarBinding;
        this.stressHistoryContent = frameLayout;
    }

    @NonNull
    public static ActivityStressHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.include_title_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title_bar);
        if (findChildViewById != null) {
            AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.stress_history_content);
            if (frameLayout != null) {
                return new ActivityStressHistoryBinding((LinearLayout) view, bind, frameLayout);
            }
            i8 = R.id.stress_history_content;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStressHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStressHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_stress_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
