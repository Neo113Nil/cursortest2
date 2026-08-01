package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class ShimmerSmallBannerAdBinding implements ViewBinding {
    public final View adAppIcon;
    public final View adBody;
    public final View adCallToAction;
    public final View adHeadline;
    private final ConstraintLayout rootView;
    public final View textView3;

    private ShimmerSmallBannerAdBinding(ConstraintLayout rootView, View adAppIcon, View adBody, View adCallToAction, View adHeadline, View textView3) {
        this.rootView = rootView;
        this.adAppIcon = adAppIcon;
        this.adBody = adBody;
        this.adCallToAction = adCallToAction;
        this.adHeadline = adHeadline;
        this.textView3 = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ShimmerSmallBannerAdBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ShimmerSmallBannerAdBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.shimmer_small_banner_ad, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ShimmerSmallBannerAdBinding bind(View rootView) {
        int i = R.id.ad_app_icon;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.ad_app_icon);
        if (findChildViewById != null) {
            i = R.id.ad_body;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.ad_body);
            if (findChildViewById2 != null) {
                i = R.id.ad_call_to_action;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.ad_call_to_action);
                if (findChildViewById3 != null) {
                    i = R.id.ad_headline;
                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.ad_headline);
                    if (findChildViewById4 != null) {
                        i = R.id.textView3;
                        View findChildViewById5 = ViewBindings.findChildViewById(rootView, R.id.textView3);
                        if (findChildViewById5 != null) {
                            return new ShimmerSmallBannerAdBinding((ConstraintLayout) rootView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
