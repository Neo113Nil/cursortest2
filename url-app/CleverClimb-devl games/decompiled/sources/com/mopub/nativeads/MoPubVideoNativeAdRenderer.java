package com.mopub.nativeads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MoPubVideoNativeAdRenderer implements MoPubAdRenderer<VideoNativeAd> {
    private final MediaViewBinder mMediaViewBinder;

    @VisibleForTesting
    final WeakHashMap<View, MediaViewHolder> mMediaViewHolderMap = new WeakHashMap<>();

    public MoPubVideoNativeAdRenderer(MediaViewBinder mediaViewBinder) {
        this.mMediaViewBinder = mediaViewBinder;
    }

    @Override // com.mopub.nativeads.MoPubAdRenderer
    public View createAdView(Context context, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(this.mMediaViewBinder.layoutId, viewGroup, false);
    }

    @Override // com.mopub.nativeads.MoPubAdRenderer
    public void renderAdView(View view, VideoNativeAd videoNativeAd) {
        MediaViewHolder mediaViewHolder = this.mMediaViewHolderMap.get(view);
        if (mediaViewHolder == null) {
            mediaViewHolder = MediaViewHolder.fromViewBinder(view, this.mMediaViewBinder);
            this.mMediaViewHolderMap.put(view, mediaViewHolder);
        }
        update(mediaViewHolder, videoNativeAd);
        NativeRendererHelper.updateExtras(mediaViewHolder.mainView, this.mMediaViewBinder.extras, videoNativeAd.getExtras());
        setViewVisibility(mediaViewHolder, 0);
        videoNativeAd.render((MediaLayout) view.findViewById(this.mMediaViewBinder.mediaLayoutId));
    }

    @Override // com.mopub.nativeads.MoPubAdRenderer
    public boolean supports(BaseNativeAd baseNativeAd) {
        Preconditions.checkNotNull(baseNativeAd);
        return baseNativeAd instanceof VideoNativeAd;
    }

    private void update(MediaViewHolder mediaViewHolder, VideoNativeAd videoNativeAd) {
        NativeRendererHelper.addTextView(mediaViewHolder.titleView, videoNativeAd.getTitle());
        NativeRendererHelper.addTextView(mediaViewHolder.textView, videoNativeAd.getText());
        NativeRendererHelper.addCtaButton(mediaViewHolder.callToActionView, mediaViewHolder.mainView, videoNativeAd.getCallToAction());
        if (mediaViewHolder.mediaLayout != null) {
            NativeImageHelper.loadImageView(videoNativeAd.getMainImageUrl(), mediaViewHolder.mediaLayout.getMainImageView());
        }
        NativeImageHelper.loadImageView(videoNativeAd.getIconImageUrl(), mediaViewHolder.iconImageView);
        NativeRendererHelper.addPrivacyInformationIcon(mediaViewHolder.privacyInformationIconImageView, videoNativeAd.getPrivacyInformationIconImageUrl(), videoNativeAd.getPrivacyInformationIconClickThroughUrl());
    }

    private void setViewVisibility(MediaViewHolder mediaViewHolder, int i) {
        if (mediaViewHolder.mainView != null) {
            mediaViewHolder.mainView.setVisibility(i);
        }
    }
}
