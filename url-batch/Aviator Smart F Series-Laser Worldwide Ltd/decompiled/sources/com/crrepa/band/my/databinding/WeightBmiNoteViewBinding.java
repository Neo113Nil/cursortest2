package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class WeightBmiNoteViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llWeightBmiNote;

    @NonNull
    private final LinearLayout rootView;

    private WeightBmiNoteViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.llWeightBmiNote = linearLayout2;
    }

    @NonNull
    public static WeightBmiNoteViewBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new WeightBmiNoteViewBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static WeightBmiNoteViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WeightBmiNoteViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.weight_bmi_note_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
