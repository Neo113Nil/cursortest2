package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.n.i;

/* loaded from: classes.dex */
public class NativeAdView {

    public enum Type {
        HEIGHT_100(i.HEIGHT_100),
        HEIGHT_120(i.HEIGHT_120),
        HEIGHT_300(i.HEIGHT_300),
        HEIGHT_400(i.HEIGHT_400);


        /* renamed from: a, reason: collision with root package name */
        private final i f4820a;

        Type(i iVar) {
            this.f4820a = iVar;
        }

        i a() {
            return this.f4820a;
        }

        public int getHeight() {
            return this.f4820a.b();
        }

        public int getValue() {
            return this.f4820a.b();
        }

        public int getWidth() {
            return this.f4820a.a();
        }
    }

    public static View render(Context context, NativeAd nativeAd, Type type) {
        return render(context, nativeAd, type, null);
    }

    public static View render(Context context, NativeAd nativeAd, Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAd.isNativeConfigEnabled()) {
            nativeAdViewAttributes = nativeAd.getAdViewAttributes();
        } else if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new NativeAdViewAttributes();
        }
        nativeAd.a(type);
        return new ANGenericTemplateView(context, nativeAd, type, nativeAdViewAttributes != null ? nativeAdViewAttributes.a() : null);
    }
}
