package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.SingleLineZoomTextView;

/* loaded from: classes2.dex */
public final class ItemTrainingGoalPickerBinding implements ViewBinding {

    @NonNull
    public final View pointerUnselected;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final SingleLineZoomTextView tvDescription;

    private ItemTrainingGoalPickerBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull TextView textView, @NonNull SingleLineZoomTextView singleLineZoomTextView) {
        this.rootView = relativeLayout;
        this.pointerUnselected = view;
        this.tvContent = textView;
        this.tvDescription = singleLineZoomTextView;
    }

    @NonNull
    public static ItemTrainingGoalPickerBinding bind(@NonNull View view) {
        int i8 = R.id.pointer_unselected;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.pointer_unselected);
        if (findChildViewById != null) {
            i8 = R.id.tv_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
            if (textView != null) {
                i8 = R.id.tv_description;
                SingleLineZoomTextView singleLineZoomTextView = (SingleLineZoomTextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                if (singleLineZoomTextView != null) {
                    return new ItemTrainingGoalPickerBinding((RelativeLayout) view, findChildViewById, textView, singleLineZoomTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemTrainingGoalPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemTrainingGoalPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_training_goal_picker, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
