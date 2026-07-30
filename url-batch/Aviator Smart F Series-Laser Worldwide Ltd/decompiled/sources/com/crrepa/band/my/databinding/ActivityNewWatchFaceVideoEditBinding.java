package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout;
import com.crrepa.band.my.device.watchfacenew.video.widgets.VideoCropView;

/* loaded from: classes2.dex */
public final class ActivityNewWatchFaceVideoEditBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flOperation;

    @NonNull
    public final ImageView ivPlay;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TimeCutLayout timeCutLayout;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvFinish;

    @NonNull
    public final VideoCropView videoCropView;

    private ActivityNewWatchFaceVideoEditBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TimeCutLayout timeCutLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull VideoCropView videoCropView) {
        this.rootView = relativeLayout;
        this.flOperation = frameLayout;
        this.ivPlay = imageView;
        this.timeCutLayout = timeCutLayout;
        this.tvCancel = textView;
        this.tvFinish = textView2;
        this.videoCropView = videoCropView;
    }

    @NonNull
    public static ActivityNewWatchFaceVideoEditBinding bind(@NonNull View view) {
        int i8 = R.id.fl_operation;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_operation);
        if (frameLayout != null) {
            i8 = R.id.iv_play;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_play);
            if (imageView != null) {
                i8 = R.id.time_cut_layout;
                TimeCutLayout timeCutLayout = (TimeCutLayout) ViewBindings.findChildViewById(view, R.id.time_cut_layout);
                if (timeCutLayout != null) {
                    i8 = R.id.tv_cancel;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                    if (textView != null) {
                        i8 = R.id.tv_finish;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_finish);
                        if (textView2 != null) {
                            i8 = R.id.video_crop_view;
                            VideoCropView videoCropView = (VideoCropView) ViewBindings.findChildViewById(view, R.id.video_crop_view);
                            if (videoCropView != null) {
                                return new ActivityNewWatchFaceVideoEditBinding((RelativeLayout) view, frameLayout, imageView, timeCutLayout, textView, textView2, videoCropView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityNewWatchFaceVideoEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityNewWatchFaceVideoEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_new_watch_face_video_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
