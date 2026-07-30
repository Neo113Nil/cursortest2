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
public final class LayoutNewWatchFaceDisplayModeForVideoBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llDisplayMode;

    @NonNull
    public final RadioButton rbDisplayModeLoop;

    @NonNull
    public final RadioButton rbDisplayModeOnce;

    @NonNull
    public final RadioGroup rgDisplayMode;

    @NonNull
    private final LinearLayout rootView;

    private LayoutNewWatchFaceDisplayModeForVideoBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioGroup radioGroup) {
        this.rootView = linearLayout;
        this.llDisplayMode = linearLayout2;
        this.rbDisplayModeLoop = radioButton;
        this.rbDisplayModeOnce = radioButton2;
        this.rgDisplayMode = radioGroup;
    }

    @NonNull
    public static LayoutNewWatchFaceDisplayModeForVideoBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.rb_display_mode_loop;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_display_mode_loop);
        if (radioButton != null) {
            i8 = R.id.rb_display_mode_once;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_display_mode_once);
            if (radioButton2 != null) {
                i8 = R.id.rg_display_mode;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_display_mode);
                if (radioGroup != null) {
                    return new LayoutNewWatchFaceDisplayModeForVideoBinding(linearLayout, linearLayout, radioButton, radioButton2, radioGroup);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceDisplayModeForVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceDisplayModeForVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_display_mode_for_video, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
