package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class BoDisplayViewBinding implements ViewBinding {

    @NonNull
    public final ProgressBar pbBo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvEighty;

    @NonNull
    public final TextView tvEightyFive;

    @NonNull
    public final TextView tvHundred;

    @NonNull
    public final TextView tvNinety;

    @NonNull
    public final TextView tvNinetyFive;

    private BoDisplayViewBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.pbBo = progressBar;
        this.tvEighty = textView;
        this.tvEightyFive = textView2;
        this.tvHundred = textView3;
        this.tvNinety = textView4;
        this.tvNinetyFive = textView5;
    }

    @NonNull
    public static BoDisplayViewBinding bind(@NonNull View view) {
        int i8 = R.id.pb_bo;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_bo);
        if (progressBar != null) {
            i8 = R.id.tv_eighty;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_eighty);
            if (textView != null) {
                i8 = R.id.tv_eighty_five;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_eighty_five);
                if (textView2 != null) {
                    i8 = R.id.tv_hundred;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hundred);
                    if (textView3 != null) {
                        i8 = R.id.tv_ninety;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ninety);
                        if (textView4 != null) {
                            i8 = R.id.tv_ninety_five;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ninety_five);
                            if (textView5 != null) {
                                return new BoDisplayViewBinding((LinearLayout) view, progressBar, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static BoDisplayViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BoDisplayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.bo_display_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
