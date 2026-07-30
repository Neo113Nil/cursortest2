package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FindMoreWatchFaceBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout rlMoreWatchFace;

    @NonNull
    private final RelativeLayout rootView;

    private FindMoreWatchFaceBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.rlMoreWatchFace = relativeLayout2;
    }

    @NonNull
    public static FindMoreWatchFaceBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new FindMoreWatchFaceBinding(relativeLayout, relativeLayout);
    }

    @NonNull
    public static FindMoreWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FindMoreWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.find_more_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
