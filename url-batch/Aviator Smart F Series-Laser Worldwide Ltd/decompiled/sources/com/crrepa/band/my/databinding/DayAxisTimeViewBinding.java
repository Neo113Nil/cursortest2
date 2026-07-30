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
public final class DayAxisTimeViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvEighteen;

    @NonNull
    public final TextView tvSix;

    @NonNull
    public final TextView tvTwelve;

    @NonNull
    public final TextView tvTwentyFour;

    @NonNull
    public final TextView tvZero;

    private DayAxisTimeViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = linearLayout;
        this.tvEighteen = textView;
        this.tvSix = textView2;
        this.tvTwelve = textView3;
        this.tvTwentyFour = textView4;
        this.tvZero = textView5;
    }

    @NonNull
    public static DayAxisTimeViewBinding bind(@NonNull View view) {
        int i8 = R.id.tv_eighteen;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_eighteen);
        if (textView != null) {
            i8 = R.id.tv_six;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_six);
            if (textView2 != null) {
                i8 = R.id.tv_twelve;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_twelve);
                if (textView3 != null) {
                    i8 = R.id.tv_twenty_four;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_twenty_four);
                    if (textView4 != null) {
                        i8 = R.id.tv_zero;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_zero);
                        if (textView5 != null) {
                            return new DayAxisTimeViewBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DayAxisTimeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DayAxisTimeViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.day_axis_time_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
