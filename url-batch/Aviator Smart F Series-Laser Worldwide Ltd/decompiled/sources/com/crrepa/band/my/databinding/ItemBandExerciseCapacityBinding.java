package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemBandExerciseCapacityBinding implements ViewBinding {

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final LinearLayout llTitle;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvFitnessLevel;

    @NonNull
    public final TextView tvFitnessLevelTitle;

    @NonNull
    public final TextView tvSyncTime;

    private ItemBandExerciseCapacityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.ivContinue = imageView;
        this.llTitle = linearLayout;
        this.llValue = linearLayout2;
        this.tvFitnessLevel = textView;
        this.tvFitnessLevelTitle = textView2;
        this.tvSyncTime = textView3;
    }

    @NonNull
    public static ItemBandExerciseCapacityBinding bind(@NonNull View view) {
        int i8 = R.id.iv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_continue);
        if (imageView != null) {
            i8 = R.id.ll_title;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_title);
            if (linearLayout != null) {
                i8 = R.id.ll_value;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_value);
                if (linearLayout2 != null) {
                    i8 = R.id.tv_fitness_level;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fitness_level);
                    if (textView != null) {
                        i8 = R.id.tv_fitness_level_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fitness_level_title);
                        if (textView2 != null) {
                            i8 = R.id.tv_sync_time;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sync_time);
                            if (textView3 != null) {
                                return new ItemBandExerciseCapacityBinding((RelativeLayout) view, imageView, linearLayout, linearLayout2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandExerciseCapacityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandExerciseCapacityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_exercise_capacity, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
