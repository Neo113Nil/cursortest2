package dev.cct.translatorapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;

/* loaded from: classes3.dex */
public final class NativeHomeLayoutBinding implements ViewBinding {
    public final MaterialCardView ad;
    public final TextView adAdvertiser;
    public final ImageView adAppIcon;
    public final TextView adBody;
    public final AppCompatButton adCallToAction;
    public final TextView adHeadline;
    public final MediaView adMedia;
    public final TextView adPrice;
    public final RatingBar adStars;
    public final TextView adStore;
    public final LinearLayout linearL;
    private final NativeAdView rootView;

    private NativeHomeLayoutBinding(NativeAdView rootView, MaterialCardView ad, TextView adAdvertiser, ImageView adAppIcon, TextView adBody, AppCompatButton adCallToAction, TextView adHeadline, MediaView adMedia, TextView adPrice, RatingBar adStars, TextView adStore, LinearLayout linearL) {
        this.rootView = rootView;
        this.ad = ad;
        this.adAdvertiser = adAdvertiser;
        this.adAppIcon = adAppIcon;
        this.adBody = adBody;
        this.adCallToAction = adCallToAction;
        this.adHeadline = adHeadline;
        this.adMedia = adMedia;
        this.adPrice = adPrice;
        this.adStars = adStars;
        this.adStore = adStore;
        this.linearL = linearL;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NativeAdView getRoot() {
        return this.rootView;
    }

    public static NativeHomeLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static NativeHomeLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.native_home_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static NativeHomeLayoutBinding bind(View rootView) {
        int i = R.id.ad;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(rootView, R.id.ad);
        if (materialCardView != null) {
            i = R.id.ad_advertiser;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_advertiser);
            if (textView != null) {
                i = R.id.ad_app_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ad_app_icon);
                if (imageView != null) {
                    i = R.id.ad_body;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ad_body);
                    if (textView2 != null) {
                        i = R.id.ad_call_to_action;
                        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.ad_call_to_action);
                        if (appCompatButton != null) {
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
                                                i = R.id.linearL;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.linearL);
                                                if (linearLayout != null) {
                                                    return new NativeHomeLayoutBinding((NativeAdView) rootView, materialCardView, textView, imageView, textView2, appCompatButton, textView3, mediaView, textView4, ratingBar, textView5, linearLayout);
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
