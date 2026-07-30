package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentStartMeasureEcgBinding implements ViewBinding {

    @NonNull
    public final ImageView btnMeasureEcg;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvMeasureEcgContent;

    @NonNull
    public final TextView tvMeasureEcgHint;

    @NonNull
    public final TextView tvMeasureEcgTitle;

    private FragmentStartMeasureEcgBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.btnMeasureEcg = imageView;
        this.tvMeasureEcgContent = textView;
        this.tvMeasureEcgHint = textView2;
        this.tvMeasureEcgTitle = textView3;
    }

    @NonNull
    public static FragmentStartMeasureEcgBinding bind(@NonNull View view) {
        int i8 = R.id.btn_measure_ecg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.btn_measure_ecg);
        if (imageView != null) {
            i8 = R.id.tv_measure_ecg_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_measure_ecg_content);
            if (textView != null) {
                i8 = R.id.tv_measure_ecg_hint;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_measure_ecg_hint);
                if (textView2 != null) {
                    i8 = R.id.tv_measure_ecg_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_measure_ecg_title);
                    if (textView3 != null) {
                        return new FragmentStartMeasureEcgBinding((LinearLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentStartMeasureEcgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentStartMeasureEcgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_start_measure_ecg, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
