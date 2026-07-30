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
public final class ActivityCityChooceBinding implements ViewBinding {

    @NonNull
    public final FrameLayout cityChooceContent;

    @NonNull
    public final BandHistoryTitleBinding includedTitle;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCityChooceBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull BandHistoryTitleBinding bandHistoryTitleBinding) {
        this.rootView = linearLayout;
        this.cityChooceContent = frameLayout;
        this.includedTitle = bandHistoryTitleBinding;
    }

    @NonNull
    public static ActivityCityChooceBinding bind(@NonNull View view) {
        int i8 = R.id.city_chooce_content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.city_chooce_content);
        if (frameLayout != null) {
            i8 = R.id.included_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.included_title);
            if (findChildViewById != null) {
                return new ActivityCityChooceBinding((LinearLayout) view, frameLayout, BandHistoryTitleBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityCityChooceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCityChooceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_city_chooce, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
