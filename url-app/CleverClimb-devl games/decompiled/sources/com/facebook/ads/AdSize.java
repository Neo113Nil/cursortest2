package com.facebook.ads;

import com.facebook.ads.internal.protocol.e;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AdSize implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final int f4752a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4753b;

    @Deprecated
    public static final AdSize BANNER_320_50 = new AdSize(e.BANNER_320_50);
    public static final AdSize INTERSTITIAL = new AdSize(e.INTERSTITIAL);
    public static final AdSize BANNER_HEIGHT_50 = new AdSize(e.BANNER_HEIGHT_50);
    public static final AdSize BANNER_HEIGHT_90 = new AdSize(e.BANNER_HEIGHT_90);
    public static final AdSize RECTANGLE_HEIGHT_250 = new AdSize(e.RECTANGLE_HEIGHT_250);

    public AdSize(int i, int i2) {
        this.f4752a = i;
        this.f4753b = i2;
    }

    private AdSize(e eVar) {
        this.f4752a = eVar.a();
        this.f4753b = eVar.b();
    }

    public static AdSize fromWidthAndHeight(int i, int i2) {
        if (INTERSTITIAL.f4753b == i2 && INTERSTITIAL.f4752a == i) {
            return INTERSTITIAL;
        }
        if (BANNER_320_50.f4753b == i2 && BANNER_320_50.f4752a == i) {
            return BANNER_320_50;
        }
        if (BANNER_HEIGHT_50.f4753b == i2 && BANNER_HEIGHT_50.f4752a == i) {
            return BANNER_HEIGHT_50;
        }
        if (BANNER_HEIGHT_90.f4753b == i2 && BANNER_HEIGHT_90.f4752a == i) {
            return BANNER_HEIGHT_90;
        }
        if (RECTANGLE_HEIGHT_250.f4753b == i2 && RECTANGLE_HEIGHT_250.f4752a == i) {
            return RECTANGLE_HEIGHT_250;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f4752a == adSize.f4752a && this.f4753b == adSize.f4753b;
    }

    public int getHeight() {
        return this.f4753b;
    }

    public int getWidth() {
        return this.f4752a;
    }

    public int hashCode() {
        return (this.f4752a * 31) + this.f4753b;
    }

    public e toInternalAdSize() {
        return e.a(this.f4752a, this.f4753b);
    }
}
