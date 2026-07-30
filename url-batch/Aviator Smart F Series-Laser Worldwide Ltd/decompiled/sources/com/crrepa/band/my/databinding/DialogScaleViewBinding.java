package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.ScaleView;

/* loaded from: classes2.dex */
public final class DialogScaleViewBinding implements ViewBinding {

    @NonNull
    public final Button btnDialogSave;

    @NonNull
    public final ImageView ivDialogClose;

    @NonNull
    public final ImageView ivMark;

    @NonNull
    public final LinearLayout llWeightNum;

    @NonNull
    public final RelativeLayout rlDialogWeight;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ScaleView svDialogScaleView;

    @NonNull
    public final TextView tvDialogWeightNum;

    @NonNull
    public final TextView tvDialogWeightUnit;

    private DialogScaleViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ScaleView scaleView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.btnDialogSave = button;
        this.ivDialogClose = imageView;
        this.ivMark = imageView2;
        this.llWeightNum = linearLayout;
        this.rlDialogWeight = relativeLayout2;
        this.svDialogScaleView = scaleView;
        this.tvDialogWeightNum = textView;
        this.tvDialogWeightUnit = textView2;
    }

    @NonNull
    public static DialogScaleViewBinding bind(@NonNull View view) {
        int i8 = R.id.btn_dialog_save;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_dialog_save);
        if (button != null) {
            i8 = R.id.iv_dialog_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_dialog_close);
            if (imageView != null) {
                i8 = R.id.iv_mark;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mark);
                if (imageView2 != null) {
                    i8 = R.id.ll_weight_num;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_weight_num);
                    if (linearLayout != null) {
                        i8 = R.id.rl_dialog_weight;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_dialog_weight);
                        if (relativeLayout != null) {
                            i8 = R.id.sv_dialog_scaleView;
                            ScaleView scaleView = (ScaleView) ViewBindings.findChildViewById(view, R.id.sv_dialog_scaleView);
                            if (scaleView != null) {
                                i8 = R.id.tv_dialog_weight_num;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dialog_weight_num);
                                if (textView != null) {
                                    i8 = R.id.tv_dialog_weight_unit;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dialog_weight_unit);
                                    if (textView2 != null) {
                                        return new DialogScaleViewBinding((RelativeLayout) view, button, imageView, imageView2, linearLayout, relativeLayout, scaleView, textView, textView2);
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
    public static DialogScaleViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogScaleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_scale_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
