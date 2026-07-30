package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ViewEmptyRecentClassBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    private ViewEmptyRecentClassBinding(@NonNull RelativeLayout relativeLayout) {
        this.rootView = relativeLayout;
    }

    @NonNull
    public static ViewEmptyRecentClassBinding bind(@NonNull View view) {
        if (view != null) {
            return new ViewEmptyRecentClassBinding((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ViewEmptyRecentClassBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewEmptyRecentClassBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.view_empty_recent_class, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
