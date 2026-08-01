package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.ads.NativeAdLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ActivityLanguageBinding implements ViewBinding {
    public final ConstraintLayout adFbLayout;
    public final FrameLayout adFrame;
    public final MaterialCardView adLayout;
    public final ConstraintLayout adViewLayout;
    public final TextView applyLangBtn;
    public final ImageView backBtn;
    public final RecyclerView langRec;
    public final TextView loadingText;
    public final NativeAdLayout nativeAdContainer;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout shimmerViewContainer;
    public final ShimmerFrameLayout shimmerViewContainer1;
    public final TextView textView;
    public final ConstraintLayout topBar;

    private ActivityLanguageBinding(ConstraintLayout rootView, ConstraintLayout adFbLayout, FrameLayout adFrame, MaterialCardView adLayout, ConstraintLayout adViewLayout, TextView applyLangBtn, ImageView backBtn, RecyclerView langRec, TextView loadingText, NativeAdLayout nativeAdContainer, ShimmerFrameLayout shimmerViewContainer, ShimmerFrameLayout shimmerViewContainer1, TextView textView, ConstraintLayout topBar) {
        this.rootView = rootView;
        this.adFbLayout = adFbLayout;
        this.adFrame = adFrame;
        this.adLayout = adLayout;
        this.adViewLayout = adViewLayout;
        this.applyLangBtn = applyLangBtn;
        this.backBtn = backBtn;
        this.langRec = langRec;
        this.loadingText = loadingText;
        this.nativeAdContainer = nativeAdContainer;
        this.shimmerViewContainer = shimmerViewContainer;
        this.shimmerViewContainer1 = shimmerViewContainer1;
        this.textView = textView;
        this.topBar = topBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityLanguageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityLanguageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_language, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityLanguageBinding bind(View rootView) {
        int i = R.id.ad_fb_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.ad_fb_layout);
        if (constraintLayout != null) {
            i = R.id.adFrame;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.adFrame);
            if (frameLayout != null) {
                i = R.id.adLayout;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.adLayout);
                if (materialCardView != null) {
                    i = R.id.ad_view_layout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.ad_view_layout);
                    if (constraintLayout2 != null) {
                        i = R.id.apply_lang_btn;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.apply_lang_btn);
                        if (textView != null) {
                            i = R.id.back_btn;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.back_btn);
                            if (imageView != null) {
                                i = R.id.lang_rec;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.lang_rec);
                                if (recyclerView != null) {
                                    i = R.id.loadingText;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.loadingText);
                                    if (textView2 != null) {
                                        i = R.id.native_ad_container;
                                        NativeAdLayout nativeAdLayout = (NativeAdLayout) ViewBindings.findChildViewById(rootView, R.id.native_ad_container);
                                        if (nativeAdLayout != null) {
                                            i = R.id.shimmer_view_container;
                                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container);
                                            if (shimmerFrameLayout != null) {
                                                i = R.id.shimmer_view_container1;
                                                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(rootView, R.id.shimmer_view_container1);
                                                if (shimmerFrameLayout2 != null) {
                                                    i = R.id.textView;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
                                                    if (textView3 != null) {
                                                        i = R.id.top_bar;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.top_bar);
                                                        if (constraintLayout3 != null) {
                                                            return new ActivityLanguageBinding((ConstraintLayout) rootView, constraintLayout, frameLayout, materialCardView, constraintLayout2, textView, imageView, recyclerView, textView2, nativeAdLayout, shimmerFrameLayout, shimmerFrameLayout2, textView3, constraintLayout3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
