package com.mopub.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;

/* loaded from: classes2.dex */
class StaticNativeViewHolder {

    @VisibleForTesting
    static final StaticNativeViewHolder EMPTY_VIEW_HOLDER = new StaticNativeViewHolder();
    TextView callToActionView;
    ImageView iconImageView;
    ImageView mainImageView;
    View mainView;
    ImageView privacyInformationIconImageView;
    TextView textView;
    TextView titleView;

    private StaticNativeViewHolder() {
    }

    static StaticNativeViewHolder fromViewBinder(View view, ViewBinder viewBinder) {
        StaticNativeViewHolder staticNativeViewHolder = new StaticNativeViewHolder();
        staticNativeViewHolder.mainView = view;
        try {
            staticNativeViewHolder.titleView = (TextView) view.findViewById(viewBinder.titleId);
            staticNativeViewHolder.textView = (TextView) view.findViewById(viewBinder.textId);
            staticNativeViewHolder.callToActionView = (TextView) view.findViewById(viewBinder.callToActionId);
            staticNativeViewHolder.mainImageView = (ImageView) view.findViewById(viewBinder.mainImageId);
            staticNativeViewHolder.iconImageView = (ImageView) view.findViewById(viewBinder.iconImageId);
            staticNativeViewHolder.privacyInformationIconImageView = (ImageView) view.findViewById(viewBinder.privacyInformationIconImageId);
            return staticNativeViewHolder;
        } catch (ClassCastException e) {
            MoPubLog.w("Could not cast from id in ViewBinder to expected View type", e);
            return EMPTY_VIEW_HOLDER;
        }
    }
}
