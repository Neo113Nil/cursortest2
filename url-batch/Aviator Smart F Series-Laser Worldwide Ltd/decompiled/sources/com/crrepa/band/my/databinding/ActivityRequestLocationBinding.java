package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityRequestLocationBinding implements ViewBinding {

    @NonNull
    public final Button btnTurnOn;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvNoThanks;

    @NonNull
    public final TextView tvRequestBackgroundLocation;

    private ActivityRequestLocationBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.btnTurnOn = button;
        this.tvNoThanks = textView;
        this.tvRequestBackgroundLocation = textView2;
    }

    @NonNull
    public static ActivityRequestLocationBinding bind(@NonNull View view) {
        int i8 = R.id.btn_turn_on;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_turn_on);
        if (button != null) {
            i8 = R.id.tv_no_thanks;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_thanks);
            if (textView != null) {
                i8 = R.id.tv_request_background_location;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_request_background_location);
                if (textView2 != null) {
                    return new ActivityRequestLocationBinding((LinearLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityRequestLocationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityRequestLocationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_request_location, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
