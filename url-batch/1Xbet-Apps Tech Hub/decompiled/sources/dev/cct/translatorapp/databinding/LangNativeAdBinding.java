package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class LangNativeAdBinding implements ViewBinding {
    public final TextView adAdvertiser;
    public final ImageView adAppIcon;
    public final TextView adBody;
    public final Button adCallToAction;
    public final TextView adHeadline;
    public final MediaView adMedia;
    public final TextView adPrice;
    public final RatingBar adStars;
    public final TextView adStore;
    public final NativeAdView langAdView;
    private final NativeAdView rootView;

    private LangNativeAdBinding(NativeAdView rootView, TextView adAdvertiser, ImageView adAppIcon, TextView adBody, Button adCallToAction, TextView adHeadline, MediaView adMedia, TextView adPrice, RatingBar adStars, TextView adStore, NativeAdView langAdView) {
        this.rootView = rootView;
        this.adAdvertiser = adAdvertiser;
        this.adAppIcon = adAppIcon;
        this.adBody = adBody;
        this.adCallToAction = adCallToAction;
        this.adHeadline = adHeadline;
        this.adMedia = adMedia;
        this.adPrice = adPrice;
        this.adStars = adStars;
        this.adStore = adStore;
        this.langAdView = langAdView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NativeAdView getRoot() {
        return this.rootView;
    }

    public static LangNativeAdBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static LangNativeAdBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.lang_native_ad, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static LangNativeAdBinding bind(View rootView) {
        int i = R.id.ad_advertiser;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_advertiser);
        if (textView != null) {
            i = R.id.ad_app_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ad_app_icon);
            if (imageView != null) {
                i = R.id.ad_body;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_body);
                if (textView2 != null) {
                    i = R.id.ad_call_to_action;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.ad_call_to_action);
                    if (button != null) {
                        i = R.id.ad_headline;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_headline);
                        if (textView3 != null) {
                            i = R.id.ad_media;
                            MediaView mediaView = (MediaView) ViewBindings.findChildViewById(rootView, R.id.ad_media);
                            if (mediaView != null) {
                                i = R.id.ad_price;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_price);
                                if (textView4 != null) {
                                    i = R.id.ad_stars;
                                    RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(rootView, R.id.ad_stars);
                                    if (ratingBar != null) {
                                        i = R.id.ad_store;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_store);
                                        if (textView5 != null) {
                                            NativeAdView nativeAdView = (NativeAdView) rootView;
                                            return new LangNativeAdBinding(nativeAdView, textView, imageView, textView2, button, textView3, mediaView, textView4, ratingBar, textView5, nativeAdView);
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
