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
import com.crrepa.band.my.health.ecg.view.EcgView;
import com.moyoung.dafit.module.common.widgets.DragImageView;

/* loaded from: classes2.dex */
public final class ActivityEcgResultBinding implements ViewBinding {

    @NonNull
    public final EcgView ecgview;

    @NonNull
    public final DataTitleBarBinding includeTitleBar;

    @NonNull
    public final DragImageView ivDrag;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final EcgView thumbnailEcgview;

    @NonNull
    public final TextView tvEcgAverageHeartRate;

    @NonNull
    public final TextView tvEcgSpeed;

    private ActivityEcgResultBinding(@NonNull RelativeLayout relativeLayout, @NonNull EcgView ecgView, @NonNull DataTitleBarBinding dataTitleBarBinding, @NonNull DragImageView dragImageView, @NonNull EcgView ecgView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.ecgview = ecgView;
        this.includeTitleBar = dataTitleBarBinding;
        this.ivDrag = dragImageView;
        this.thumbnailEcgview = ecgView2;
        this.tvEcgAverageHeartRate = textView;
        this.tvEcgSpeed = textView2;
    }

    @NonNull
    public static ActivityEcgResultBinding bind(@NonNull View view) {
        int i8 = R.id.ecgview;
        EcgView ecgView = (EcgView) ViewBindings.findChildViewById(view, R.id.ecgview);
        if (ecgView != null) {
            i8 = R.id.include_title_bar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title_bar);
            if (findChildViewById != null) {
                DataTitleBarBinding bind = DataTitleBarBinding.bind(findChildViewById);
                i8 = R.id.iv_drag;
                DragImageView dragImageView = (DragImageView) ViewBindings.findChildViewById(view, R.id.iv_drag);
                if (dragImageView != null) {
                    i8 = R.id.thumbnail_ecgview;
                    EcgView ecgView2 = (EcgView) ViewBindings.findChildViewById(view, R.id.thumbnail_ecgview);
                    if (ecgView2 != null) {
                        i8 = R.id.tv_ecg_average_heart_rate;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_average_heart_rate);
                        if (textView != null) {
                            i8 = R.id.tv_ecg_speed;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ecg_speed);
                            if (textView2 != null) {
                                return new ActivityEcgResultBinding((RelativeLayout) view, ecgView, bind, dragImageView, ecgView2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityEcgResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityEcgResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_ecg_result, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
