package com.mopub.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;

/* loaded from: classes2.dex */
class MediaViewHolder {

    @VisibleForTesting
    static final MediaViewHolder EMPTY_MEDIA_VIEW_HOLDER = new MediaViewHolder();
    TextView callToActionView;
    ImageView iconImageView;
    View mainView;
    MediaLayout mediaLayout;
    ImageView privacyInformationIconImageView;
    TextView textView;
    TextView titleView;

    private MediaViewHolder() {
    }

    static MediaViewHolder fromViewBinder(View view, MediaViewBinder mediaViewBinder) {
        MediaViewHolder mediaViewHolder = new MediaViewHolder();
        mediaViewHolder.mainView = view;
        try {
            mediaViewHolder.titleView = (TextView) view.findViewById(mediaViewBinder.titleId);
            mediaViewHolder.textView = (TextView) view.findViewById(mediaViewBinder.textId);
            mediaViewHolder.callToActionView = (TextView) view.findViewById(mediaViewBinder.callToActionId);
            mediaViewHolder.mediaLayout = (MediaLayout) view.findViewById(mediaViewBinder.mediaLayoutId);
            mediaViewHolder.iconImageView = (ImageView) view.findViewById(mediaViewBinder.iconImageId);
            mediaViewHolder.privacyInformationIconImageView = (ImageView) view.findViewById(mediaViewBinder.privacyInformationIconImageId);
            return mediaViewHolder;
        } catch (ClassCastException e) {
            MoPubLog.w("Could not cast from id in MediaViewBinder to expected View type", e);
            return EMPTY_MEDIA_VIEW_HOLDER;
        }
    }
}
