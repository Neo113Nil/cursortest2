package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutLayout;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceVideoVideoContainerBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flAdd;

    @NonNull
    public final ImageView ivPlay;

    @NonNull
    public final LinearLayout llAdd;

    @NonNull
    public final RelativeLayout llVideoOperation;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TimeCutLayout timeCutLayout;

    @NonNull
    public final TextView tvAddTips;

    @NonNull
    public final TextView tvDelete;

    @NonNull
    public final TextView tvPlayTips;

    @NonNull
    public final TextView tvTitle;

    private LayoutNewWatchFaceVideoVideoContainerBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TimeCutLayout timeCutLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.flAdd = frameLayout;
        this.ivPlay = imageView;
        this.llAdd = linearLayout;
        this.llVideoOperation = relativeLayout2;
        this.timeCutLayout = timeCutLayout;
        this.tvAddTips = textView;
        this.tvDelete = textView2;
        this.tvPlayTips = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static LayoutNewWatchFaceVideoVideoContainerBinding bind(@NonNull View view) {
        int i8 = R.id.fl_add;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_add);
        if (frameLayout != null) {
            i8 = R.id.iv_play;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_play);
            if (imageView != null) {
                i8 = R.id.ll_add;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_add);
                if (linearLayout != null) {
                    i8 = R.id.ll_video_operation;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_video_operation);
                    if (relativeLayout != null) {
                        i8 = R.id.time_cut_layout;
                        TimeCutLayout timeCutLayout = (TimeCutLayout) ViewBindings.findChildViewById(view, R.id.time_cut_layout);
                        if (timeCutLayout != null) {
                            i8 = R.id.tv_add_tips;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add_tips);
                            if (textView != null) {
                                i8 = R.id.tv_delete;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delete);
                                if (textView2 != null) {
                                    i8 = R.id.tv_play_tips;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_play_tips);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                        if (textView4 != null) {
                                            return new LayoutNewWatchFaceVideoVideoContainerBinding((RelativeLayout) view, frameLayout, imageView, linearLayout, relativeLayout, timeCutLayout, textView, textView2, textView3, textView4);
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
    public static LayoutNewWatchFaceVideoVideoContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceVideoVideoContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_video_video_container, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
