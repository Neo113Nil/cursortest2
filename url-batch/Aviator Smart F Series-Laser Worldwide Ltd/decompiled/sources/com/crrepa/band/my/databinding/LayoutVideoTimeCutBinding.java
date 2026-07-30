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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.video.widgets.TimeCutView;

/* loaded from: classes2.dex */
public final class LayoutVideoTimeCutBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flThumb;

    @NonNull
    public final ImageView ivCursor;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvThumb;

    @NonNull
    public final TimeCutView timeCutView;

    @NonNull
    public final TextView tvTimeDuration;

    @NonNull
    public final TextView tvTimeEnd;

    @NonNull
    public final TextView tvTimeStart;

    private LayoutVideoTimeCutBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TimeCutView timeCutView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.flThumb = frameLayout;
        this.ivCursor = imageView;
        this.rvThumb = recyclerView;
        this.timeCutView = timeCutView;
        this.tvTimeDuration = textView;
        this.tvTimeEnd = textView2;
        this.tvTimeStart = textView3;
    }

    @NonNull
    public static LayoutVideoTimeCutBinding bind(@NonNull View view) {
        int i8 = R.id.fl_thumb;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_thumb);
        if (frameLayout != null) {
            i8 = R.id.iv_cursor;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_cursor);
            if (imageView != null) {
                i8 = R.id.rv_thumb;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_thumb);
                if (recyclerView != null) {
                    i8 = R.id.timeCutView;
                    TimeCutView timeCutView = (TimeCutView) ViewBindings.findChildViewById(view, R.id.timeCutView);
                    if (timeCutView != null) {
                        i8 = R.id.tv_time_duration;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_duration);
                        if (textView != null) {
                            i8 = R.id.tv_time_end;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_end);
                            if (textView2 != null) {
                                i8 = R.id.tv_time_start;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_start);
                                if (textView3 != null) {
                                    return new LayoutVideoTimeCutBinding((RelativeLayout) view, frameLayout, imageView, recyclerView, timeCutView, textView, textView2, textView3);
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
    public static LayoutVideoTimeCutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutVideoTimeCutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_video_time_cut, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
