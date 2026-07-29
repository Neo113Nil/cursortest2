package com.google.ads.mediation.testsuite.utils;

import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ads.mediation.testsuite.R;
import com.google.ads.mediation.testsuite.dataobjects.NetworkConfig;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.List;

/* loaded from: classes.dex */
public class UIUtils {
    public static final int FAIL_COLOR = -30584;
    public static final int NEUTRAL_COLOR = -4473925;
    public static final int OK_COLOR = -7798904;

    public static NativeContentAdView updateContentAdView(ViewGroup viewGroup, NativeContentAdView nativeContentAdView, NativeContentAd nativeContentAd) {
        if (nativeContentAdView == null) {
            nativeContentAdView = (NativeContentAdView) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.native_content_ad, viewGroup, false);
            nativeContentAdView.setHeadlineView(nativeContentAdView.findViewById(R.id.content_ad_headline_text_view));
            nativeContentAdView.setImageView(nativeContentAdView.findViewById(R.id.content_ad_image));
            nativeContentAdView.setBodyView(nativeContentAdView.findViewById(R.id.ad_body_text_view));
            nativeContentAdView.setLogoView(nativeContentAdView.findViewById(R.id.content_ad_logo_image_view));
            nativeContentAdView.setCallToActionView(nativeContentAdView.findViewById(R.id.content_ad_call_to_action_text_view));
            nativeContentAdView.setAdvertiserView(nativeContentAdView.findViewById(R.id.content_ad_advertiser_text_view));
        }
        clearContentAdView(nativeContentAdView);
        TextView textView = (TextView) nativeContentAdView.getHeadlineView();
        if (TextUtils.isEmpty(nativeContentAd.getHeadline())) {
            textView.setText(R.string.null_required_asset);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            textView.setText(nativeContentAd.getHeadline());
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView2 = (TextView) nativeContentAdView.findViewById(R.id.content_ad_first_image_url_text_view);
        TextView textView3 = (TextView) nativeContentAdView.findViewById(R.id.content_ad_images_number_text_view);
        List<NativeAd.Image> images = nativeContentAd.getImages();
        if (images != null && images.size() > 0) {
            NativeAd.Image image = images.get(0);
            if (image != null) {
                textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                if (image.getUri() != null) {
                    textView2.setText(image.getUri().toString());
                } else {
                    textView2.setText(R.string.null_url);
                }
                if (image.getDrawable() != null) {
                    ((ImageView) nativeContentAdView.getImageView()).setImageDrawable(image.getDrawable());
                }
            }
            textView3.setText(String.format(viewGroup.getContext().getString(R.string.showing_images), Integer.valueOf(images.size())));
        } else {
            textView2.setText(R.string.null_required_asset);
            textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
            textView3.setText(R.string.null_images);
        }
        TextView textView4 = (TextView) nativeContentAdView.getBodyView();
        if (TextUtils.isEmpty(nativeContentAd.getBody())) {
            textView4.setText(R.string.null_required_asset);
            textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            ((TextView) nativeContentAdView.getBodyView()).setText(nativeContentAd.getBody());
            textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView5 = (TextView) nativeContentAdView.findViewById(R.id.content_ad_logo_url_text_view);
        NativeAd.Image logo = nativeContentAd.getLogo();
        if (logo != null) {
            if (logo.getUri() != null) {
                textView5.setText(logo.getUri().toString());
            } else {
                textView5.setText(R.string.null_url);
            }
            if (logo.getDrawable() != null) {
                ((ImageView) nativeContentAdView.getLogoView()).setImageDrawable(logo.getDrawable());
            }
        } else {
            textView5.setText(R.string.null_logo);
        }
        TextView textView6 = (TextView) nativeContentAdView.getCallToActionView();
        if (TextUtils.isEmpty(nativeContentAd.getCallToAction())) {
            textView6.setText(R.string.null_required_asset);
            textView6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            textView6.setText(nativeContentAd.getCallToAction());
            textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView7 = (TextView) nativeContentAdView.getAdvertiserView();
        if (TextUtils.isEmpty(nativeContentAd.getAdvertiser())) {
            textView7.setText(R.string.null_required_asset);
            textView7.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            ((TextView) nativeContentAdView.getAdvertiserView()).setText(nativeContentAd.getAdvertiser());
            textView7.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        nativeContentAdView.setNativeAd(nativeContentAd);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeContentAdView);
        return nativeContentAdView;
    }

    private static void clearContentAdView(NativeContentAdView nativeContentAdView) {
        ((TextView) nativeContentAdView.getHeadlineView()).setText((CharSequence) null);
        ((TextView) nativeContentAdView.getBodyView()).setText((CharSequence) null);
        ((TextView) nativeContentAdView.getCallToActionView()).setText((CharSequence) null);
        ((ImageView) nativeContentAdView.getLogoView()).setImageDrawable(null);
        ((ImageView) nativeContentAdView.getImageView()).setImageDrawable(null);
        ((TextView) nativeContentAdView.getAdvertiserView()).setText((CharSequence) null);
    }

    public static NativeAppInstallAdView updateAppInstallAdView(ViewGroup viewGroup, NativeAppInstallAdView nativeAppInstallAdView, NativeAppInstallAd nativeAppInstallAd) {
        if (nativeAppInstallAdView == null) {
            nativeAppInstallAdView = (NativeAppInstallAdView) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.native_app_install_ad, viewGroup, false);
            nativeAppInstallAdView.setHeadlineView(nativeAppInstallAdView.findViewById(R.id.ai_ad_headline_text_view));
            nativeAppInstallAdView.setImageView(nativeAppInstallAdView.findViewById(R.id.ai_ad_image));
            nativeAppInstallAdView.setBodyView(nativeAppInstallAdView.findViewById(R.id.ai_ad_body_text_view));
            nativeAppInstallAdView.setIconView(nativeAppInstallAdView.findViewById(R.id.ai_ad_icon_image_view));
            nativeAppInstallAdView.setCallToActionView(nativeAppInstallAdView.findViewById(R.id.ai_ad_call_to_action_text_view));
            nativeAppInstallAdView.setStarRatingView(nativeAppInstallAdView.findViewById(R.id.ai_ad_star_rating_text_view));
            nativeAppInstallAdView.setStoreView(nativeAppInstallAdView.findViewById(R.id.ai_ad_store_text_view));
            nativeAppInstallAdView.setPriceView(nativeAppInstallAdView.findViewById(R.id.ai_ad_price_text_view));
        }
        clearAppInstallAdView(nativeAppInstallAdView);
        TextView textView = (TextView) nativeAppInstallAdView.getHeadlineView();
        if (TextUtils.isEmpty(nativeAppInstallAd.getHeadline())) {
            textView.setText(R.string.null_required_asset);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            textView.setText(nativeAppInstallAd.getHeadline());
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView2 = (TextView) nativeAppInstallAdView.findViewById(R.id.ai_ad_first_image_url_text_view);
        TextView textView3 = (TextView) nativeAppInstallAdView.findViewById(R.id.ai_ad_images_number_text_view);
        List<NativeAd.Image> images = nativeAppInstallAd.getImages();
        if (images != null && images.size() > 0) {
            NativeAd.Image image = images.get(0);
            if (image != null) {
                if (image.getUri() != null) {
                    textView2.setText(image.getUri().toString());
                } else {
                    textView2.setText(R.string.null_url);
                }
                if (image.getDrawable() != null) {
                    ((ImageView) nativeAppInstallAdView.getImageView()).setImageDrawable(image.getDrawable());
                }
            }
            textView3.setText(String.format(viewGroup.getContext().getString(R.string.showing_images), Integer.valueOf(images.size())));
        } else {
            textView2.setText(R.string.null_required_asset);
            textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
            textView3.setText(R.string.null_images);
        }
        TextView textView4 = (TextView) nativeAppInstallAdView.getBodyView();
        if (TextUtils.isEmpty(nativeAppInstallAd.getBody())) {
            textView4.setText(R.string.null_required_asset);
            textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            ((TextView) nativeAppInstallAdView.getBodyView()).setText(nativeAppInstallAd.getBody());
            textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        TextView textView5 = (TextView) nativeAppInstallAdView.findViewById(R.id.ai_ad_icon_url_text_view);
        NativeAd.Image icon = nativeAppInstallAd.getIcon();
        if (icon != null) {
            textView5.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            if (icon.getUri() != null) {
                textView5.setText(icon.getUri().toString());
            } else {
                textView5.setText(R.string.null_url);
            }
            if (icon.getDrawable() != null) {
                ((ImageView) nativeAppInstallAdView.getIconView()).setImageDrawable(icon.getDrawable());
            }
        } else {
            textView5.setText(R.string.null_icon);
            textView5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        }
        TextView textView6 = (TextView) nativeAppInstallAdView.getCallToActionView();
        if (TextUtils.isEmpty(nativeAppInstallAd.getCallToAction())) {
            textView6.setText(R.string.null_required_asset);
            textView6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_warning_24dp, 0, 0, 0);
        } else {
            textView6.setText(nativeAppInstallAd.getCallToAction());
            textView6.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        ((TextView) nativeAppInstallAdView.getStarRatingView()).setText(String.format(viewGroup.getContext().getString(R.string.star_rating_value), nativeAppInstallAd.getStarRating()));
        ((TextView) nativeAppInstallAdView.getStoreView()).setText(nativeAppInstallAd.getStore());
        ((TextView) nativeAppInstallAdView.getPriceView()).setText(nativeAppInstallAd.getPrice());
        nativeAppInstallAdView.setNativeAd(nativeAppInstallAd);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAppInstallAdView);
        return nativeAppInstallAdView;
    }

    private static void clearAppInstallAdView(NativeAppInstallAdView nativeAppInstallAdView) {
        ((TextView) nativeAppInstallAdView.getHeadlineView()).setText((CharSequence) null);
        ((TextView) nativeAppInstallAdView.getBodyView()).setText((CharSequence) null);
        ((TextView) nativeAppInstallAdView.getCallToActionView()).setText((CharSequence) null);
        ((ImageView) nativeAppInstallAdView.getIconView()).setImageDrawable(null);
        ((ImageView) nativeAppInstallAdView.getImageView()).setImageDrawable(null);
        ((TextView) nativeAppInstallAdView.getStarRatingView()).setText((CharSequence) null);
        ((TextView) nativeAppInstallAdView.getStoreView()).setText((CharSequence) null);
        ((TextView) nativeAppInstallAdView.getPriceView()).setText((CharSequence) null);
    }

    public static Pair<String, Integer> getTestStateDescriptors(NetworkConfig networkConfig) {
        String str;
        int lastErrorCode = networkConfig.getLastErrorCode();
        int i = FAIL_COLOR;
        if (lastErrorCode != 5) {
            switch (lastErrorCode) {
                case -1:
                    str = "Untested";
                    i = NEUTRAL_COLOR;
                    break;
                case 0:
                    str = "Internal err";
                    break;
                case 1:
                    str = "Invalid req";
                    break;
                case 2:
                    str = "Network err";
                    break;
                default:
                    str = "No fill";
                    break;
            }
        } else {
            str = "Working!";
            i = OK_COLOR;
        }
        return new Pair<>(str, Integer.valueOf(i));
    }
}
