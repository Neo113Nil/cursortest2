package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityWhitelistSettingBinding implements ViewBinding {

    @NonNull
    public final Button btnWhitelistDone;

    @NonNull
    public final Button btnWhitelistToset;

    @NonNull
    private final LinearLayout rootView;

    private ActivityWhitelistSettingBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2) {
        this.rootView = linearLayout;
        this.btnWhitelistDone = button;
        this.btnWhitelistToset = button2;
    }

    @NonNull
    public static ActivityWhitelistSettingBinding bind(@NonNull View view) {
        int i8 = R.id.btn_whitelist_done;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_whitelist_done);
        if (button != null) {
            i8 = R.id.btn_whitelist_toset;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_whitelist_toset);
            if (button2 != null) {
                return new ActivityWhitelistSettingBinding((LinearLayout) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityWhitelistSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWhitelistSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_whitelist_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
