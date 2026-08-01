package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class MediumNativeAdShimmerBinding implements ViewBinding {
    public final TextView adBody;
    public final View adCallToAction;
    public final View adHeadline;
    public final View adMedia;
    private final ConstraintLayout rootView;
    public final View textView3;

    private MediumNativeAdShimmerBinding(ConstraintLayout rootView, TextView adBody, View adCallToAction, View adHeadline, View adMedia, View textView3) {
        this.rootView = rootView;
        this.adBody = adBody;
        this.adCallToAction = adCallToAction;
        this.adHeadline = adHeadline;
        this.adMedia = adMedia;
        this.textView3 = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MediumNativeAdShimmerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static MediumNativeAdShimmerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.medium_native_ad_shimmer, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static MediumNativeAdShimmerBinding bind(View rootView) {
        int i = R.id.ad_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_body);
        if (textView != null) {
            i = R.id.ad_call_to_action;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.ad_call_to_action);
            if (findChildViewById != null) {
                i = R.id.ad_headline;
                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.ad_headline);
                if (findChildViewById2 != null) {
                    i = R.id.ad_media;
                    View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.ad_media);
                    if (findChildViewById3 != null) {
                        i = R.id.textView3;
                        View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.textView3);
                        if (findChildViewById4 != null) {
                            return new MediumNativeAdShimmerBinding((ConstraintLayout) rootView, textView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
