package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutLocationOffBinding implements ViewBinding {

    @NonNull
    public final TextView locationOffHint;

    @NonNull
    private final TextView rootView;

    private LayoutLocationOffBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.locationOffHint = textView2;
    }

    @NonNull
    public static LayoutLocationOffBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new LayoutLocationOffBinding(textView, textView);
    }

    @NonNull
    public static LayoutLocationOffBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutLocationOffBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_location_off, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
