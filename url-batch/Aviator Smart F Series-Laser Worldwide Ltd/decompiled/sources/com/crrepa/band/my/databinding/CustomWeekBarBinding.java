package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class CustomWeekBarBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    private CustomWeekBarBinding(@NonNull View view) {
        this.rootView = view;
    }

    @NonNull
    public static CustomWeekBarBinding bind(@NonNull View view) {
        if (view != null) {
            return new CustomWeekBarBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static CustomWeekBarBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.custom_week_bar, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
