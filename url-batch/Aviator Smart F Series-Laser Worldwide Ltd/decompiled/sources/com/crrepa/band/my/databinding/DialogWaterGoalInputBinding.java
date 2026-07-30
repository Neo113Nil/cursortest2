package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogWaterGoalInputBinding implements ViewBinding {

    @NonNull
    public final EditText etGoalInput;

    @NonNull
    public final RelativeLayout llGoalInput;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvGoalInputConfirm;

    @NonNull
    public final TextView tvGoalInputTitle;

    @NonNull
    public final TextView tvGoalInputUnit;

    private DialogWaterGoalInputBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.etGoalInput = editText;
        this.llGoalInput = relativeLayout2;
        this.tvGoalInputConfirm = textView;
        this.tvGoalInputTitle = textView2;
        this.tvGoalInputUnit = textView3;
    }

    @NonNull
    public static DialogWaterGoalInputBinding bind(@NonNull View view) {
        int i8 = R.id.et_goal_input;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_goal_input);
        if (editText != null) {
            i8 = R.id.ll_goal_input;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_goal_input);
            if (relativeLayout != null) {
                i8 = R.id.tv_goal_input_confirm;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal_input_confirm);
                if (textView != null) {
                    i8 = R.id.tv_goal_input_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal_input_title);
                    if (textView2 != null) {
                        i8 = R.id.tv_goal_input_unit;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal_input_unit);
                        if (textView3 != null) {
                            return new DialogWaterGoalInputBinding((RelativeLayout) view, editText, relativeLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogWaterGoalInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogWaterGoalInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_water_goal_input, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
