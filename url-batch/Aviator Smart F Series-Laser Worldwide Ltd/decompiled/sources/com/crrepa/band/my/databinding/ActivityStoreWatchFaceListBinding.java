package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityStoreWatchFaceListBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RecyclerView rcvWatchFace;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private ActivityStoreWatchFaceListBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivTitleBack = imageView;
        this.rcvWatchFace = recyclerView;
        this.tvTitle = textView;
    }

    @NonNull
    public static ActivityStoreWatchFaceListBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.rcv_watch_face;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_watch_face);
            if (recyclerView != null) {
                i8 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView != null) {
                    return new ActivityStoreWatchFaceListBinding((RelativeLayout) view, imageView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityStoreWatchFaceListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStoreWatchFaceListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_store_watch_face_list, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
