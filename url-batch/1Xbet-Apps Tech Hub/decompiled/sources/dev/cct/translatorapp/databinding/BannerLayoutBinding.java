package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class BannerLayoutBinding implements ViewBinding {
    public final FrameLayout bannerAdLayout;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout shimmerViewContainer;

    private BannerLayoutBinding(ConstraintLayout rootView, FrameLayout bannerAdLayout, ShimmerFrameLayout shimmerViewContainer) {
        this.rootView = rootView;
        this.bannerAdLayout = bannerAdLayout;
        this.shimmerViewContainer = shimmerViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BannerLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static BannerLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.banner_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static BannerLayoutBinding bind(View rootView) {
        int i = R.id.bannerAdLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.bannerAdLayout);
        if (frameLayout != null) {
            i = R.id.shimmer_view_container;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container);
            if (shimmerFrameLayout != null) {
                return new BannerLayoutBinding((ConstraintLayout) rootView, frameLayout, shimmerFrameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
