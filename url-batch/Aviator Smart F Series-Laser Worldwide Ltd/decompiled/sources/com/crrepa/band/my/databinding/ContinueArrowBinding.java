package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ContinueArrowBinding implements ViewBinding {

    @NonNull
    private final ImageView rootView;

    private ContinueArrowBinding(@NonNull ImageView imageView) {
        this.rootView = imageView;
    }

    @NonNull
    public static ContinueArrowBinding bind(@NonNull View view) {
        if (view != null) {
            return new ContinueArrowBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ContinueArrowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ContinueArrowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.continue_arrow, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
