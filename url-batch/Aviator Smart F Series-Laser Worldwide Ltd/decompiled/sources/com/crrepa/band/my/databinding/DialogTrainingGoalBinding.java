package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogTrainingGoalBinding implements ViewBinding {

    @NonNull
    public final Button btnDone;

    @NonNull
    public final View pointerSelected;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RecyclerView rvPicker;

    @NonNull
    public final TextView tvGoal;

    @NonNull
    public final TextView tvGoalUnit;

    private DialogTrainingGoalBinding(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.btnDone = button;
        this.pointerSelected = view;
        this.rvPicker = recyclerView;
        this.tvGoal = textView;
        this.tvGoalUnit = textView2;
    }

    @NonNull
    public static DialogTrainingGoalBinding bind(@NonNull View view) {
        int i8 = R.id.btn_done;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_done);
        if (button != null) {
            i8 = R.id.pointer_selected;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.pointer_selected);
            if (findChildViewById != null) {
                i8 = R.id.rv_picker;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_picker);
                if (recyclerView != null) {
                    i8 = R.id.tv_goal;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal);
                    if (textView != null) {
                        i8 = R.id.tv_goal_unit;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_goal_unit);
                        if (textView2 != null) {
                            return new DialogTrainingGoalBinding((FrameLayout) view, button, findChildViewById, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogTrainingGoalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_training_goal, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
