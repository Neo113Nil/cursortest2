package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.ads.MediaView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class LargeFacebookNativeAdBinding implements ViewBinding {
    public final LinearLayout adChoicesContainer;
    public final LinearLayout adUnit;
    public final TextView nativeAdBody;
    public final AppCompatButton nativeAdCallToAction;
    public final MediaView nativeAdIcon;
    public final MediaView nativeAdMedia;
    public final TextView nativeAdSocialContext;
    public final TextView nativeAdSponsoredLabel;
    public final TextView nativeAdTitle;
    private final LinearLayout rootView;

    private LargeFacebookNativeAdBinding(LinearLayout rootView, LinearLayout adChoicesContainer, LinearLayout adUnit, TextView nativeAdBody, AppCompatButton nativeAdCallToAction, MediaView nativeAdIcon, MediaView nativeAdMedia, TextView nativeAdSocialContext, TextView nativeAdSponsoredLabel, TextView nativeAdTitle) {
        this.rootView = rootView;
        this.adChoicesContainer = adChoicesContainer;
        this.adUnit = adUnit;
        this.nativeAdBody = nativeAdBody;
        this.nativeAdCallToAction = nativeAdCallToAction;
        this.nativeAdIcon = nativeAdIcon;
        this.nativeAdMedia = nativeAdMedia;
        this.nativeAdSocialContext = nativeAdSocialContext;
        this.nativeAdSponsoredLabel = nativeAdSponsoredLabel;
        this.nativeAdTitle = nativeAdTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LargeFacebookNativeAdBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LargeFacebookNativeAdBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.large_facebook_native_ad, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LargeFacebookNativeAdBinding bind(View rootView) {
        int i = R.id.ad_choices_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ad_choices_container);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) rootView;
            i = R.id.native_ad_body;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.native_ad_body);
            if (textView != null) {
                i = R.id.native_ad_call_to_action;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.native_ad_call_to_action);
                if (appCompatButton != null) {
                    i = R.id.native_ad_icon;
                    MediaView mediaView = (MediaView) ViewBindings.findChildViewById(rootView, R.id.native_ad_icon);
                    if (mediaView != null) {
                        i = R.id.native_ad_media;
                        MediaView mediaView2 = (MediaView) ViewBindings.findChildViewById(rootView, R.id.native_ad_media);
                        if (mediaView2 != null) {
                            i = R.id.native_ad_social_context;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.native_ad_social_context);
                            if (textView2 != null) {
                                i = R.id.native_ad_sponsored_label;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.native_ad_sponsored_label);
                                if (textView3 != null) {
                                    i = R.id.native_ad_title;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.native_ad_title);
                                    if (textView4 != null) {
                                        return new LargeFacebookNativeAdBinding(linearLayout2, linearLayout, linearLayout2, textView, appCompatButton, mediaView, mediaView2, textView2, textView3, textView4);
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
