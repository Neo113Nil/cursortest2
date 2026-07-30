package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceLabelColorPickerBinding implements ViewBinding {

    @NonNull
    public final RadioButton rbColorBlack;

    @NonNull
    public final RadioButton rbColorBlue;

    @NonNull
    public final RadioButton rbColorGreen;

    @NonNull
    public final RadioButton rbColorIndigo;

    @NonNull
    public final RadioButton rbColorOrigin;

    @NonNull
    public final RadioButton rbColorPurple;

    @NonNull
    public final RadioButton rbColorRed;

    @NonNull
    public final RadioButton rbColorWhite;

    @NonNull
    public final RadioButton rbColorYellow;

    @NonNull
    public final RadioGroup rgColor;

    @NonNull
    public final RelativeLayout root;

    @NonNull
    private final RelativeLayout rootView;

    private LayoutNewWatchFaceLabelColorPickerBinding(@NonNull RelativeLayout relativeLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull RadioButton radioButton6, @NonNull RadioButton radioButton7, @NonNull RadioButton radioButton8, @NonNull RadioButton radioButton9, @NonNull RadioGroup radioGroup, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.rbColorBlack = radioButton;
        this.rbColorBlue = radioButton2;
        this.rbColorGreen = radioButton3;
        this.rbColorIndigo = radioButton4;
        this.rbColorOrigin = radioButton5;
        this.rbColorPurple = radioButton6;
        this.rbColorRed = radioButton7;
        this.rbColorWhite = radioButton8;
        this.rbColorYellow = radioButton9;
        this.rgColor = radioGroup;
        this.root = relativeLayout2;
    }

    @NonNull
    public static LayoutNewWatchFaceLabelColorPickerBinding bind(@NonNull View view) {
        int i8 = R.id.rb_color_black;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_black);
        if (radioButton != null) {
            i8 = R.id.rb_color_blue;
            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_blue);
            if (radioButton2 != null) {
                i8 = R.id.rb_color_green;
                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_green);
                if (radioButton3 != null) {
                    i8 = R.id.rb_color_indigo;
                    RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_indigo);
                    if (radioButton4 != null) {
                        i8 = R.id.rb_color_origin;
                        RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_origin);
                        if (radioButton5 != null) {
                            i8 = R.id.rb_color_purple;
                            RadioButton radioButton6 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_purple);
                            if (radioButton6 != null) {
                                i8 = R.id.rb_color_red;
                                RadioButton radioButton7 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_red);
                                if (radioButton7 != null) {
                                    i8 = R.id.rb_color_white;
                                    RadioButton radioButton8 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_white);
                                    if (radioButton8 != null) {
                                        i8 = R.id.rb_color_yellow;
                                        RadioButton radioButton9 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_color_yellow);
                                        if (radioButton9 != null) {
                                            i8 = R.id.rg_color;
                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_color);
                                            if (radioGroup != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                                return new LayoutNewWatchFaceLabelColorPickerBinding(relativeLayout, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, radioGroup, relativeLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceLabelColorPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceLabelColorPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_label_color_picker, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
