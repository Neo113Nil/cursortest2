package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final o logger;
    protected final AppLovinNativeAdImpl nativeAd;
    protected final k sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(context);
        setBackgroundColor(-16777216);
        this.nativeAd = appLovinNativeAdImpl;
        this.sdk = kVar;
        this.logger = kVar.O();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        o7 vastAd = appLovinNativeAdImpl.getVastAd();
        Uri l0 = vastAd != null ? vastAd.l0() : null;
        if (mainImageUri == null && l0 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) kVar.a(x4.F2)).booleanValue()) {
            setOnTouchListener(new AppLovinTouchToClickListener(kVar, x4.g0, context, appLovinNativeAdImpl));
        } else {
            setOnClickListener(appLovinNativeAdImpl);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            ImageViewUtils.setAndDownscaleImageUri(imageView, mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
