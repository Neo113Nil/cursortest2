package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityAiPictureHistoryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwipeRecyclerView rvPicture;

    @NonNull
    public final RelativeLayout titleBar;

    private ActivityAiPictureHistoryBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull RelativeLayout relativeLayout) {
        this.rootView = linearLayout;
        this.ivTitleBack = imageView;
        this.rvPicture = swipeRecyclerView;
        this.titleBar = relativeLayout;
    }

    @NonNull
    public static ActivityAiPictureHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.rv_picture;
            SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_picture);
            if (swipeRecyclerView != null) {
                i8 = R.id.title_bar;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title_bar);
                if (relativeLayout != null) {
                    return new ActivityAiPictureHistoryBinding((LinearLayout) view, imageView, swipeRecyclerView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityAiPictureHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAiPictureHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_ai_picture_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
