package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceDisplayModeForCustomPhotoBinding implements ViewBinding {

    @NonNull
    public final RadioButton rbDisplayModeSequential;

    @NonNull
    public final RadioButton rbDisplayModeSingleton;

    @NonNull
    public final RadioButton rbDisplayModeStochastic;

    @NonNull
    public final RadioGroup rgDisplayMode;

    @NonNull
    private final LinearLayout rootView;

    private LayoutNewWatchFaceDisplayModeForCustomPhotoBinding(@NonNull LinearLayout linearLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioGroup radioGroup) {
        this.rootView = linearLayout;
        this.rbDisplayModeSequential = radioButton;
        this.rbDisplayModeSingleton = radioButton2;
        this.rbDisplayModeStochastic = radioButton3;
        this.rgDisplayMode = radioGroup;
    }

    @NonNull
    public static LayoutNewWatchFaceDisplayModeForCustomPhotoBinding bind(@NonNull View view) {
        int i8 = R.id.rb_display_mode_sequential;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_display_mode_sequential);
        if (radioButton != null) {
            i8 = R.id.rb_display_mode_singleton;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_display_mode_singleton);
            if (radioButton2 != null) {
                i8 = R.id.rb_display_mode_stochastic;
                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_display_mode_stochastic);
                if (radioButton3 != null) {
                    i8 = R.id.rg_display_mode;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_display_mode);
                    if (radioGroup != null) {
                        return new LayoutNewWatchFaceDisplayModeForCustomPhotoBinding((LinearLayout) view, radioButton, radioButton2, radioButton3, radioGroup);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceDisplayModeForCustomPhotoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceDisplayModeForCustomPhotoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_display_mode_for_custom_photo, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
