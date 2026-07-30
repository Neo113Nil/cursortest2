package com.pesonal.adsdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class Inflate_ADS {
    Context activity;

    public Inflate_ADS(Context context) {
        this.activity = context;
    }

    public void inflate_NATIV_ADMOB(NativeAd nativeAd, ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.ads_nativ_admob_test, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        StringBuilder sb = new StringBuilder("_");
        int i = AppManage.admod_native_ads_height;
        if (i <= 0) {
            i = Opcodes.GETFIELD;
        }
        int identifier = this.activity.getResources().getIdentifier(sb.append(i).append("sdp").toString(), "dimen", this.activity.getPackageName());
        if (identifier != 0) {
            int dimension = (int) this.activity.getResources().getDimension(identifier);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.height = dimension;
            inflate.setLayoutParams(layoutParams);
        }
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(R.id.uadview);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        CardView cardView = (CardView) nativeAdView.findViewById(R.id.icon_card);
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            try {
                if (!AppManage.app_nativeColor.equals("")) {
                    nativeAdView.getCallToActionView().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (nativeAd.getIcon() == null) {
            cardView.setVisibility(8);
            nativeAdView.getIconView().setVisibility(8);
        } else {
            cardView.setVisibility(0);
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.getStarRating() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    public void inflate_NATIV_ADMOB_adapter(NativeAd nativeAd, ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.new_admob, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(R.id.uadview);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        try {
            if (nativeAd.getCallToAction() == null) {
                nativeAdView.getCallToActionView().setVisibility(4);
            } else {
                nativeAdView.getCallToActionView().setVisibility(0);
                ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
                try {
                    if (!AppManage.app_nativeColor.equals("")) {
                        nativeAdView.getCallToActionView().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception unused) {
        }
        if (nativeAd.getIcon() == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(nativeAd.getIcon().getDrawable());
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.getStarRating() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.getStarRating().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.getAdvertiser());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    public void inflate_NATIV_BANNER_ADMOB(NativeAd nativeAd, ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.ads_nativ_banner_admob, (ViewGroup) null);
        viewGroup.removeAllViews();
        viewGroup.addView(inflate);
        NativeAdView nativeAdView = (NativeAdView) inflate.findViewById(R.id.uadview);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.getHeadline());
        nativeAdView.getMediaView().setMediaContent(nativeAd.getMediaContent());
        if (nativeAd.getBody() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((TextView) nativeAdView.getCallToActionView()).setText(nativeAd.getCallToAction());
            try {
                if (!AppManage.app_nativeColor.equals("")) {
                    nativeAdView.getCallToActionView().setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        nativeAdView.setNativeAd(nativeAd);
    }

    public void inflate_NATIV_FB(com.facebook.ads.NativeAd nativeAd, ViewGroup viewGroup) {
        viewGroup.setVisibility(0);
        nativeAd.unregisterView();
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.ads_nativ_fb, viewGroup, false);
        viewGroup.addView(inflate);
        StringBuilder sb = new StringBuilder("_");
        int i = AppManage.fb_native_ads_height;
        if (i <= 0) {
            i = Opcodes.GETFIELD;
        }
        int identifier = this.activity.getResources().getIdentifier(sb.append(i).append("sdp").toString(), "dimen", this.activity.getPackageName());
        if (identifier != 0) {
            int dimension = (int) this.activity.getResources().getDimension(identifier);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.height = dimension;
            inflate.setLayoutParams(layoutParams);
        }
        NativeAdLayout nativeAdLayout = (NativeAdLayout) inflate.findViewById(R.id.nativview);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(this.activity, nativeAd, nativeAdLayout);
        linearLayout.removeAllViews();
        linearLayout.addView(adOptionsView, 0);
        com.facebook.ads.MediaView mediaView = (com.facebook.ads.MediaView) inflate.findViewById(R.id.native_ad_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.native_ad_title);
        com.facebook.ads.MediaView mediaView2 = (com.facebook.ads.MediaView) inflate.findViewById(R.id.native_ad_media);
        TextView textView2 = (TextView) inflate.findViewById(R.id.native_ad_social_context);
        TextView textView3 = (TextView) inflate.findViewById(R.id.native_ad_body);
        TextView textView4 = (TextView) inflate.findViewById(R.id.native_ad_sponsored_label);
        TextView textView5 = (TextView) inflate.findViewById(R.id.native_ad_call_to_action);
        textView.setText(nativeAd.getAdvertiserName());
        textView3.setText(nativeAd.getAdBodyText());
        textView2.setText(nativeAd.getAdSocialContext());
        textView5.setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
        textView5.setText(nativeAd.getAdCallToAction());
        try {
            if (!AppManage.app_nativeColor.isEmpty()) {
                textView5.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView4.setText(nativeAd.getSponsoredTranslation());
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView);
        arrayList.add(textView5);
        nativeAd.registerViewForInteraction(inflate, mediaView2, mediaView, arrayList);
    }

    public void inflate_NB_FB(NativeBannerAd nativeBannerAd, ViewGroup viewGroup) {
        nativeBannerAd.unregisterView();
        View inflate = LayoutInflater.from(this.activity).inflate(R.layout.ads_nb_fb, viewGroup, false);
        viewGroup.addView(inflate);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) viewGroup.findViewById(R.id.nativview);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(this.activity, nativeBannerAd, nativeAdLayout);
        relativeLayout.removeAllViews();
        relativeLayout.addView(adOptionsView, 0);
        TextView textView = (TextView) inflate.findViewById(R.id.native_ad_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.native_ad_social_context);
        TextView textView3 = (TextView) inflate.findViewById(R.id.native_ad_sponsored_label);
        com.facebook.ads.MediaView mediaView = (com.facebook.ads.MediaView) inflate.findViewById(R.id.native_icon_view);
        TextView textView4 = (TextView) inflate.findViewById(R.id.native_ad_call_to_action);
        textView4.setText(nativeBannerAd.getAdCallToAction());
        textView4.setVisibility(nativeBannerAd.hasCallToAction() ? 0 : 4);
        try {
            if (!AppManage.app_nativeColor.equals("")) {
                textView4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(AppManage.app_nativeColor)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView2.setText(nativeBannerAd.getAdSocialContext());
        textView3.setText(nativeBannerAd.getSponsoredTranslation());
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView);
        arrayList.add(textView4);
        nativeBannerAd.registerViewForInteraction(inflate, mediaView, arrayList);
    }
}
