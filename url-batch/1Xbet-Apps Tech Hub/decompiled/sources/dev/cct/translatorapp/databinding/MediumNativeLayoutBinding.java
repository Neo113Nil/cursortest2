package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class MediumNativeLayoutBinding implements ViewBinding {
    public final FrameLayout adContainer;
    public final ConstraintLayout adRoot;
    public final CardView nativeAdCv;
    private final CardView rootView;
    public final ShimmerFrameLayout shimmerViewContainer;

    private MediumNativeLayoutBinding(CardView rootView, FrameLayout adContainer, ConstraintLayout adRoot, CardView nativeAdCv, ShimmerFrameLayout shimmerViewContainer) {
        this.rootView = rootView;
        this.adContainer = adContainer;
        this.adRoot = adRoot;
        this.nativeAdCv = nativeAdCv;
        this.shimmerViewContainer = shimmerViewContainer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static MediumNativeLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MediumNativeLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.medium_native_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MediumNativeLayoutBinding bind(View rootView) {
        int i = R.id.ad_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ad_container);
        if (frameLayout != null) {
            i = R.id.ad_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.ad_root);
            if (constraintLayout != null) {
                CardView cardView = (CardView) rootView;
                i = R.id.shimmer_view_container;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container);
                if (shimmerFrameLayout != null) {
                    return new MediumNativeLayoutBinding(cardView, frameLayout, constraintLayout, cardView, shimmerFrameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
