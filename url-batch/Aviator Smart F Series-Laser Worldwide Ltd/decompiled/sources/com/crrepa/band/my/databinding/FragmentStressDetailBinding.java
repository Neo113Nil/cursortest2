package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentStressDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvStress;

    @NonNull
    public final TextView tvStressDate;

    @NonNull
    public final TextView tvStressTime;

    private FragmentStressDetailBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.tvStress = textView;
        this.tvStressDate = textView2;
        this.tvStressTime = textView3;
    }

    @NonNull
    public static FragmentStressDetailBinding bind(@NonNull View view) {
        int i8 = R.id.tv_stress;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stress);
        if (textView != null) {
            i8 = R.id.tv_stress_date;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stress_date);
            if (textView2 != null) {
                i8 = R.id.tv_stress_time;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_stress_time);
                if (textView3 != null) {
                    return new FragmentStressDetailBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentStressDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentStressDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stress_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
