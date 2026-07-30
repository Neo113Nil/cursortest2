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
public final class ActivityLocalPhotoSelectedBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout footerBar;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final RelativeLayout llTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvPhoto;

    @NonNull
    public final TextView tvCommit;

    @NonNull
    public final TextView tvSpace;

    private ActivityLocalPhotoSelectedBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout3, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.footerBar = relativeLayout2;
        this.ivBack = imageView;
        this.llTitle = relativeLayout3;
        this.rvPhoto = recyclerView;
        this.tvCommit = textView;
        this.tvSpace = textView2;
    }

    @NonNull
    public static ActivityLocalPhotoSelectedBinding bind(@NonNull View view) {
        int i8 = R.id.footer_bar;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.footer_bar);
        if (relativeLayout != null) {
            i8 = R.id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
            if (imageView != null) {
                i8 = R.id.ll_title;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_title);
                if (relativeLayout2 != null) {
                    i8 = R.id.rv_photo;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_photo);
                    if (recyclerView != null) {
                        i8 = R.id.tv_commit;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_commit);
                        if (textView != null) {
                            i8 = R.id.tv_space;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_space);
                            if (textView2 != null) {
                                return new ActivityLocalPhotoSelectedBinding((RelativeLayout) view, relativeLayout, imageView, relativeLayout2, recyclerView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityLocalPhotoSelectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityLocalPhotoSelectedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_local_photo_selected, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
